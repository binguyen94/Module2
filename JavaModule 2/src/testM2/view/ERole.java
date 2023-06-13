package testM2.view;

public enum ERole {
    ADMIN(1,"ADMIN"),
    EDITOR(2,"EDITOR"),
    USER (3,"USER"),
    GUEST(4,"GUEST");
    private long id;
    private String role;

    ERole(long id, String role) {
        this.id = id;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static ERole findByID (long id) {
        for (ERole e : ERole.values()){
            if(e.getId() == id){
                return  e;
            }
        }
        return null;
    }
    public static ERole find (String role) {
        for (ERole e : ERole.values()){
            if(e.toString().equals(role)){
                return  e;
            }
        }
        return null;
    }
}
