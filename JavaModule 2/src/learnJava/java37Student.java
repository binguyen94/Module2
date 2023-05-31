package learnJava;

public class java37Student {
    private String id;
    private  String fullName;
    private  java37Date dateBorn;
    private  double poinAverage;
    private  java37Class classStudent;

    public java37Student(String id, String fullName, java37Date dateBorn, double poinAverage, java37Class classStudent) {
        this.id = id;
        this.fullName = fullName;
        this.dateBorn = dateBorn;
        this.poinAverage = poinAverage;
        this.classStudent = classStudent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public java37Date getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(java37Date dateBorn) {
        this.dateBorn = dateBorn;
    }

    public java37Class getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(java37Class classStudent) {
        this.classStudent = classStudent;
    }

    public String getNameFaculty(){
        return classStudent.getNameFaculty();
    }
    public boolean checkPassClass(){
        return this.poinAverage >= 5.0;
    }

    public boolean checkSameDateBorn(java37Student otherStudent){
        return this.dateBorn.getDay()== otherStudent.dateBorn.getDay();
    }
}
