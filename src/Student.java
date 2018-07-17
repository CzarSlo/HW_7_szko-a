public class Student extends SchoolMember {

    private String gender;
    private String level;

    public Student(String gender, String level, String name, String surname) {
        super(name, surname);
        this.gender = gender;
        this.level = level;
    }

    public Student() {
        super();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public void showInfo () {
        System.out.print(gender +" "+ level + " ");
        super.showInfo();
    }
}
