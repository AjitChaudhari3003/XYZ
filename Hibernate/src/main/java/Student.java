import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    private int stdId;

    @Column(name = "stname")
    private String stName;

    @Column(name = "address")
    private String stAdd;

    public Student() {
        // Default constructor required by Hibernate
    }

    public Student(int stdId, String stName, String stAdd) {
        this.stdId = stdId;
        this.stName = stName;
        this.stAdd = stAdd;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStAdd() {
        return stAdd;
    }

    public void setStAdd(String stAdd) {
        this.stAdd = stAdd;
    }
}
