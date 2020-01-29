package nanaev.backend.webrest;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WORKERS_1")
public class Worker {
    @Id
    @GeneratedValue
    private Long ID;
    private String FName;
    private String LName;
    private String Phone;

}
