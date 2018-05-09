public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "male", "BME");
        Student student2 = student.clone();
        student.introduce();
        student2.introduce();
    }
}
