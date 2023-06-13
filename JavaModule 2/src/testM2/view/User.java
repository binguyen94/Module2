package testM2.view;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class User {
    private long id;
    private String name;
    private String address;
    private Egender eGender;
    private ERole eRole;
    private LocalDate dob;

    public User() {
    }

    public User(long id, String name, String address, Egender eGender, ERole eRole, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.eGender = eGender;
        this.eRole = eRole;
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Egender geteGender() {
        return eGender;
    }

    public void seteGender(Egender eGender) {
        this.eGender = eGender;
    }

    public ERole geteRole() {
        return eRole;
    }

    public void seteRole(ERole eRole) {
        this.eRole = eRole;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return String.format("%s,%s,%s,%s,%s\n", this.id, this.name, this.address, this.eGender, this.eRole, simpleDateFormat.format(this.dob) );
    }
}
