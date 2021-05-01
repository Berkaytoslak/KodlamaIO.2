public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();
        studentManager.add(new Student());
        instructorManager.add(new Instructor());

        UserManager userManager = new UserManager();
        userManager.add(new Student());
        userManager.delete(new Student());
        userManager.update(new Student());


    }
}
