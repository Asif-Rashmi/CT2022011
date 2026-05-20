package Q5;

public class Main {

    public static void main(String[] args) {

        Lecturer lec=new Lecturer();

        lec.setLecturerName("Mr Silva");
        lec.setCourseTeaching("OOP");

        Course c=new Course();

        c.setCourseName("OOP");
        c.setCourseCode("CS101");

        c.setLecturer(lec);

        Student s=new Student();

        s.setStudentName("Kamal");
        s.setDegreeName("Computer Science");
        s.setCourseFollowing("OOP");

        System.out.println(
                s.getStudentName());

        System.out.println(
                c.getCourseName());

        System.out.println(
                c.getLecturer()
                        .getLecturerName());
    }
}