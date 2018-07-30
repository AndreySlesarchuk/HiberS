package com.bookingshelf.entity;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@Data
@Entity
@Table(name = "COMPANY")
public class Company implements Serializable {
    //company_pk int(11) NOT NULL AUTO_INCREMENT
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "company_pk")
    private Long companyId;
    //name varchar(64) NOT NULL,
    @Column(name = "name")
    @NotNull
    private String name;
    //email varchar(64) NOT NULL UNIQUE
    @Column(name = "email")
    @NotNull
    private String email;
    //phone varchar(20) NOT NULL UNIQUE
    @Column(name = "phone")
    @NotNull
    private String phone;
    //address varchar(128) DEFAULT ''
    @Column(name = "address")
    @NotNull
    private String address = "";
    //owner_firstname varchar(32) NOT NULL
    @Column(name = "owner_firstname")
    @NotNull
    private String ownerFirstname;
    //owner_lastname varchar(32) NOT NULL
    @Column(name = "owner_lastname")
    @NotNull
    private String ownerLastname;
    //owner_email varchar(64) NOT NULL UNIQUE
    @Column(name = "owner_email")
    @NotNull
    private String ownerEmail;
    //owner_phone varchar(32) NOT NULL
    @Column(name = "owner_phone")
    @NotNull
    private String ownerPhone;
    //owner_password varchar(32) NOT NULL
    @Column(name = "owner_password")
    @NotNull
    private String ownerPassword;
    //time_zone varchar(32) NOT NULL
    @Column(name = "time_zone")
    @NotNull
    private String timeZone;
    //trial_start_date timestamp NOT NULL
    @Column(name = "trial_start_date")
    @NotNull
    private Date trialStartDate;
    //trial_days int(3) NOT NULL
    @Column(name = "trial_days")
    @NotNull
    private Integer trialDays;
    //booking_color binary(3) NOT NULL
    @Column(name = "booking_color")
    @NotNull
    private Integer bookingColor;
    //booking_button varchar(32) NOT NULL
    @Column(name = "booking_button")
    @NotNull
    private String bookingButton;
    //booking_code varchar(128) NOT NULL
    @Column(name = "booking_code")
    @NotNull
    private String bookingCode;
    //booking_page varchar(64) NOT NULL
    @Column(name = "booking_page")
    @NotNull
    private String bookingPage;
    //version int(11) NOT NULL
    @Version
    @Column(name = "version")
    private Long version;
    //whenmodified timestamp  NOT NULL
    @LastModifiedDate
    @Temporal(TIMESTAMP)
    @Column(name = "whenmodified")
    private Date whenmodified;

}
