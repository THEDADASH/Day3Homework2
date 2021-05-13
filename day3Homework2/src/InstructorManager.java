public class InstructorManager {
        public void add(Instructor instructor){
            System.out.println(instructor.instructorName+instructor.lesson + " :Biyografi ve Ders eklendi.");
        }

        public void remove(Instructor instructor){
            System.out.println(instructor.instructorName+instructor.lesson+ " :Eğitmen silindi.");
        }
}
