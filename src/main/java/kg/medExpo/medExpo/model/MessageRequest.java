package kg.medExpo.medExpo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class MessageRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String lendingName;
    @Column
    private String fullName;
    @Column
    private String eMail;
    @Column
    private String phone;
    @Column
    private String organization;
}
