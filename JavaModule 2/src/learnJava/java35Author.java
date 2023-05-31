package learnJava;

public class java35Author {
    private String nameAuthor;
    private java35Date Date;

    public java35Author(String nameAuthor, java35Date date) {
        this.nameAuthor = nameAuthor;
        Date = date;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public java35Date getDate() {
        return Date;
    }

    public void setDate(java35Date date) {
        Date = date;
    }
}
