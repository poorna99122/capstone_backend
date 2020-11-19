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
import java.util.List;

@Getter
@Setter
@Entity
public class eshop_order {
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
    private int user_id;
    @Column(nullable = false)
    @OneToOne
    private int product_product_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProduct_product_id() {
        return product_product_id;
    }

    public void setProduct_product_id(int product_product_id) {
        this.product_product_id = product_product_id;
    }

    public int getShopping_address_id() {
        return shopping_address_id;
    }

    public void setShopping_address_id(int shopping_address_id) {
        this.shopping_address_id = shopping_address_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getOrder_date() {
        return order_date;
    }

    public void setOrder_date(int order_date) {
        this.order_date = order_date;
    }

    @Column(nullable = false)
    private int shopping_address_id;
    @Column(nullable = false)
    private int amount;
    @Column(nullable = false)
    private int order_date;


}
