public class StudentManager {
        public void add(Student student){
            System.out.println(student.rollCall+student.note+ " :Yoklama alındı ve Not verildi.");
        }

    public void remove(Student student){
        System.out.println(student.rollCall+student.note+ " :Öğrenci silindi.");
    }
}
