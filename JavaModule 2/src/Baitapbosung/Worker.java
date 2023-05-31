package Baitapbosung;

public class Worker extends Officer {
    private int level;

    public Worker(){

    }

    public Worker(int level) {
        this.level = level;
    }

    public Worker(long id, String name, int age, String gender, String address, int level) {
        super(id, name, age, gender, address);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
