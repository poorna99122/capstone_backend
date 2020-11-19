//package com.example.capstone_Backend.entities;
//
//public class eshop_user {
//}
//package com.example.capstone_Backend.entities;
//
//public class eshop_order {
//}
package com.example.capstone_Backend.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class eshop_user {
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "eshop_order_sequence"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )
    private int id;

    @Column(nullable = false)
    private  String user_name;

    @Column(nullable = false)
    private  String password;

    @Column(nullable = false)
    private  String first_name;


    @Column(nullable = false)
    private  String last_name;

    @Column(nullable = false)
    private  String email;

    @Column(nullable = false)
    private  String phonenumber;

    @Column(nullable = false)
    private  String role;

    @Column(nullable = false)
    private Date created ;

    @Column(nullable = false)
    private Date updated  ;






}
