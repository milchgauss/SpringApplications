package com.example.JPAExample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id;
            private String firstname;
            private String lastname;

            public Customer(String firstname, String lastname){
                this.firstname=firstname;
                this.lastname=lastname;
            }

            @Override
            public String toString (){
                return id+firstname+lastname;
            }
            String getFirstName(){
                return firstname;
            }
            String getLastName(){
                return lastname;
            }





}
