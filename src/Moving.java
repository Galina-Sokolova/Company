import java.util.Scanner;
public class Moving {

    public boolean Agreement(){
        System.out.println("Хотите перейти в другой отдел?");
        //Scanner scan = ;
        System.out.println("0 - НЕТ;   1 - ДА");
        int choice = (new Scanner(System.in)).nextInt();
        return choice != 0;
    }
    public void getMoving(Enterprise e, Department d1, Department d2){
        System.out.println("Введите ФИО сотрудника:");
        Scanner scan = new Scanner(System.in);
        String FIO = scan.nextLine();
        if (Agreement()) {
            for (Persona p : d1.personaInDept) {
                if (FIO.equals(p.getFIO())){
                    Persona temp = p;
                    int index = d1.personaInDept.indexOf(p);
                    d1.personaInDept.remove(index);
                    temp.setDepartment(d2.getDeptName());
                    d2.personaInDept.add(temp);
                    e.ClearList(e);
                    e.listDepartment.add(d1);
                    e.listDepartment.add(d2);
                    FIO = "";
                    break;
                }
            }
            for (Persona p : d2.personaInDept) {
                if (FIO.equals(p.getFIO())){
                    Persona temp = p;
                    int index = d2.personaInDept.indexOf(p);
                    d2.personaInDept.remove(index);
                    temp.setDepartment(d1.getDeptName());
                    d1.personaInDept.add(temp);
                    e.ClearList(e);
                    e.listDepartment.add(d1);
                    e.listDepartment.add(d2);
                    break;
                }
            }
        }
    }
}
