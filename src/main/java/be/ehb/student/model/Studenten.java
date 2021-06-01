package be.ehb.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Studenten {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private Date datumOfBirth;

    private String speciatitation;

    public Studenten() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDatumOfBirth() {
        return datumOfBirth;
    }

    public void setDatumOfBirth(Date datumOfBirth) {
        this.datumOfBirth = datumOfBirth;
    }

    public String getSpeciatitation() {
        return speciatitation;
    }

    public void setSpeciatitation(String speciatitation) {
        this.speciatitation = speciatitation;
    }
}
