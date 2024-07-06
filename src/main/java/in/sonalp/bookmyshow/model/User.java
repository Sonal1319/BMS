package in.sonalp.bookmyshow.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String name;
    private String email;
    @OneToMany
    private List<Ticket> tickets;
}