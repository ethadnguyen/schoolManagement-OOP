package school.management.system;

import java.util.List;
import java.util.ArrayList;

/*
 * Created by Ethad on 06/29/2022
 */
public class App {
    public static void main(String[] args) throws Exception {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher Ethan = new Teacher(2, "Ethan", 1000);
        Teacher Timber = new Teacher(3, "Timber", 800);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(Ethan);
        teacherList.add(Timber);

        Teacher Megan = new Teacher(6, "Megan", 600);

        Student Crowny = new Student(1, "Crowny", 9);
        Student Lucas = new Student(2, "Lucas", 7);
        Student Stephen = new Student(3, "Stephen", 8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Crowny);
        studentList.add(Lucas);
        studentList.add(Stephen);

        School ghs = new School(teacherList, studentList);

        ghs.addTeacher(Megan);
        Crowny.payFees(5000);
        Lucas.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("---------MAKING SCHOOL PAY SALARY-----------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent salary to " + lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        Ethan.receiveSalary(Ethan.getSalary());
        System.out.println("GHS has spent salary to " + Ethan.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(Ethan);
    }
}
