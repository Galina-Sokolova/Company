import java.util.Scanner;

public class Persona {
    String FIO;
    int age;
    String department;

    public Persona(String f, int a, String d){
        this.FIO = f;
        this.department = d;
        this.age = a;
    }

    public void setDepartment(String departmentName){
        this.department = departmentName;
    }

    public String getInfo(){
        return String.format("ФИО: %s; Возраст: %d", FIO, age);
    }

    public String getFIO() {
        return FIO;
    }

    public String getDepartment() {
        return department;
    }
}

