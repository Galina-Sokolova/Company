import java.util.Scanner;
public class Applicant {
    public void setApplicant(Department dep1, Department dep2) {
        Persona p = addApplicant();
        System.out.println("В какой отдел Вы хотите устроиться?");
        System.out.println("Если Вы передумали - 0; если в IT - 1; если Logistics -2");
        String option = (new Scanner(System.in)).nextLine();
        switch (option) {
            case "0":
                System.out.println("Жаль, если передумаете, будем рады");
                break;
            case "1":
                p.setDepartment(dep1.getDeptName());
                dep1.addPeople(p);
                break;
            case "2":
                p.setDepartment(dep2.getDeptName());
                dep2.addPeople(p);
                break;
        }
    }
    public Persona addApplicant () {
        String fio;
        int age;
        String department;
        System.out.println("ФИО работника: ");
        fio = (new Scanner(System.in)).nextLine();
        System.out.println("Возраст работника: ");
        age = (new Scanner(System.in)).nextInt();
        department = "кандидат";
        Persona persona = new Persona(fio, age, department);
        return persona;
    }
}
