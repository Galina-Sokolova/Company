import java.util.ArrayList;

public class Department {
    public String deptName;
    public ArrayList<Persona> personaInDept;

    public Department (String dn){
        this.deptName = dn;
        this.personaInDept = new ArrayList<>();
    }
    public void addPeople(Persona p){
        this.personaInDept.add(p);
    }
    public String getDeptName(){
        return this.deptName;
    }
}
