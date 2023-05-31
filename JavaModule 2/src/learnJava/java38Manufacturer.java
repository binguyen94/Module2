package learnJava;

public class java38Manufacturer {
    private String nameManu;
    private java38Nation nation;

    public java38Manufacturer(String nameManu, java38Nation nation) {
        this.nameManu = nameManu;
        this.nation = nation;
    }

    public String getNameManu() {
        return nameManu;
    }

    public void setNameManu(String nameManu) {
        this.nameManu = nameManu;
    }

    public java38Nation getNation() {
        return nation;
    }

    public void setNation(java38Nation nation) {
        this.nation = nation;
    }


    public String getNameNation() {
        return this.nation.getNameNation();
    }
}
