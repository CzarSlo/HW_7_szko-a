public class Teacher extends SchoolMember{

    private String teachedSubject;
    private int age;

    public Teacher (String teachedSubject, int age, String name, String surname){
        super(name, surname);
        this.teachedSubject = teachedSubject;
        this.age = age;
    }
    public Teacher() {
        super();
    }

    public String getTeachedSubject() {
        return teachedSubject;
    }

    public void setTeachedSubject(String teachedSubject) {
        this.teachedSubject = teachedSubject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showInfo () {
        System.out.print(teachedSubject +" "+ age + " ");
        super.showInfo();
    }
}
