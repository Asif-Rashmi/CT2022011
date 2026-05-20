package Q5;

public class Student {

    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setDegreeName(String degreeName){
        this.degreeName=degreeName;
    }

    public void setCourseFollowing(String courseFollowing){
        this.courseFollowing=courseFollowing;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getDegreeName(){
        return degreeName;
    }
}