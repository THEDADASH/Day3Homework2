public class Main {

    public static void main(String[] args) {

        User user= new User();
        user.nickName="Alperen";
        user.password="--123456";

        Student student = new Student();
        student.rollCall="Yoklamada Var";
        student.note="--100";

        Instructor instructor = new Instructor();
        instructor.instructorName="Engin Demiroğ";
        instructor.lesson="--Java geliştirici kampı";



        UserManager userManager = new UserManager();
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        userManager.add(user);
        studentManager.add(student);
        instructorManager.remove(instructor);



    }
}
