package learnJava.java59;

public class ThoiKhoaBieu {
    private Day Thu;
    private String cacMonHoc;

    public ThoiKhoaBieu() {
    }

    public ThoiKhoaBieu(Day thu, String cacMonHoc) {
        Thu = thu;
        this.cacMonHoc = cacMonHoc;
    }

    public Day getThu() {
        return Thu;
    }

    public void setThu(Day thu) {
        Thu = thu;
    }

    public String getCacMonHoc() {
        return cacMonHoc;
    }

    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" +
                "Thu=" + Thu +
                ", cacMonHoc='" + cacMonHoc + '\'' +
                '}';
    }
}
