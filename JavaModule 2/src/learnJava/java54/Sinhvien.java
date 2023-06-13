package learnJava.java54;

public class Sinhvien implements Comparable <Sinhvien> {
    private int id;
    private String fullName;
    private String nameClass;
    private double pointAvenger;

    public Sinhvien() {
    }

    public Sinhvien(int id, String fullName, String nameClass, double pointAvenger) {
        this.id = id;
        this.fullName = fullName;
        this.nameClass = nameClass;
        this.pointAvenger = pointAvenger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getPointAvenger() {
        return pointAvenger;
    }

    public void setPointAvenger(double pointAvenger) {
        this.pointAvenger = pointAvenger;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", pointAvenger=" + pointAvenger +
                '}';
    }

    public  String getName(){
        String s = this.fullName.trim();
        if(s.indexOf(" ") >= 0){
            int index = s.lastIndexOf(" ");
            return s.substring(index+1);
        }else{
            return s;
        }
    }

    @Override
    public int compareTo(Sinhvien o) {
        //<0
        //=0
        //>0
        //Dựa trên so sánh tên
        String nameThis = this.getName();
        String nameO = o.getName();

        return nameThis.compareTo(nameO);
    }
}
