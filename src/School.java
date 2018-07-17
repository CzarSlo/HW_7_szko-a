public class School {

    public static void main(String[] args) {

        Student stu = new Student("M","wzorowy","Tomasz","Karys");
        Teacher teach = new Teacher("Geograf", 42, "Janusz", "Zborowski");

        stu.showInfo();
        teach.showInfo();


    }
}
