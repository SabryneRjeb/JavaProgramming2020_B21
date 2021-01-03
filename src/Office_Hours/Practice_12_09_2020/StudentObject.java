package Office_Hours.Practice_12_09_2020;

public class StudentObject {
    public static void main(String[] args) {

    CybertekStudent student1 = new CybertekStudent();
    student1.setInfo("Edrees", 25,'M');
        // student.schoolName = "MIT";   this is reassigning the schoolname by calling the object
        CybertekStudent.schoolName = "MIT"; //prefered way to reassign static by calling it from the class
        CybertekStudent student2 = new CybertekStudent();
        student2.setInfo("liobov", 22,'F');
        System.out.println(student1);
        System.out.println(student2);



    }
}
