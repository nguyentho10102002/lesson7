package studentmanagement;

public class Student {
    //Mã sinh viên – ID:  số nguyên.
//Họ tên - name: String
//Chuyên ngành – major: String
//Điểm LT – theoryScore: float
//Điểm TH - praticeScore : float
    protected int id;
    protected String name ;
    protected String major;
    protected float theoryScore;
    protected float praticeScore;
    public Student(){
    }

    public Student(int id, String name, String major, float theoryScore, float praticeScore) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.theoryScore = theoryScore;
        this.praticeScore = praticeScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }

    public float getPraticeScore() {
        return praticeScore;
    }

    public void setPraticeScore(float praticeScore) {
        this.praticeScore = praticeScore;
    }
    public float calculateAverageScore() {
        return (theoryScore + praticeScore) / 2;
    }
    public void showInfor(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", theoryScore=" + theoryScore +
                ", praticeScore=" + praticeScore +
                ",mediumScore=" + calculateAverageScore()+'}';
    }
    public void inSV() {
        System.out.printf("%6d %-30s %-30s %10.2f %10.2f %10.2f \n", id , name ,major, theoryScore, praticeScore ,
                calculateAverageScore());
    }
}

