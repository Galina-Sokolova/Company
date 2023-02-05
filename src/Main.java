import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем предприятие
        Enterprise en = new Enterprise("VECTOR");
        // Создаем отдел и добавляем его в список отделов
        Department it = new Department("IT");
        en.addDepartment(it);
        Department fin = new Department("Finance");
        en.addDepartment(fin);
        // Первоначальное добавление кандидатов в отделы
        Applicant rec = new Applicant();
        rec.setApplicant(it, fin);
        rec.setApplicant(it, fin);
        rec.setApplicant(it, fin);
        rec.setApplicant(it, fin);
        rec.setApplicant(it, fin);
        en.PrintWorker();
        // Перевод сотрудника из одного отдела в другой
        Moving mv = new Moving();
        mv.getMoving(en, it, fin);
        en.PrintWorker();
    }
}


