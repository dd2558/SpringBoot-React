package com.packet.cardatabase.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@NoArgsConstructor
@Getter
@Setter
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerid;

    private String firstname, lastname;


    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private List<Car> cars;

    public Owner(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

}
