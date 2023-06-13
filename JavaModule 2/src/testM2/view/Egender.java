package testM2.view;

public enum Egender {
     NAM(1,"NAM"),
    Nữ(2,"Nữ");
     private long id;
     private String gender;

    Egender(long id, String gender) {
        this.id = id;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static Egender findByID (long id) {
        for (Egender e : Egender.values()){
            if(e.getId() == id){
                return  e;
            }
        }
        return null;
    }
    public static Egender find (String gender) {
        for (Egender e : Egender.values()){
            if(e.toString().equals(gender)){
                return  e;
            }
        }
        return null;
    }
}
