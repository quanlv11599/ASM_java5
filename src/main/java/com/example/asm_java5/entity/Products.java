package com.example.asm_java5.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products",uniqueConstraints = {@UniqueConstraint(columnNames = {"Id"})
})
@Component
public class Products implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "Name")
        private String name;

        @Column(name = "Image")
        private String image;

        @Column(name = "Price")
        private float price;

        @Column(name = "CreateDate")
        private Date createDate;

        @Column(name = "Available")
        private Boolean available;

}
