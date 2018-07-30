package com.bookingshelf.entity;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.sql.Blob;

import static javax.persistence.TemporalType.TIMESTAMP;

@Data
@Entity
@Table(name = "STAFF")
public class Staff implements Serializable {
    //staff_pk int(11) NOT NULL AUTO_INCREMENT
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long staffId;
    //company_fk int(11) NOT NULL
    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn(name="company_fk")
    private Company company;
    //firstname varchar(32) NOT NULL
    @Column(name = "firstname")
    @NotNull
    private String firstname;
    //lastname varchar(32) NOT NULL
    @Column(name = "lastname")
    @NotNull
    private String lastname;
    //email varchar(64) NOT NULL UNIQUE
    @Column(name = "email")
    @NotNull
    private String email;
    //phone varchar(20) NOT NULL UNIQUE
    @Column(name = "phone")
    @NotNull
    private String phone;
    //work_start timestamp not null
    @Column(name = "work_start")
    @NotNull
    private Date workStart;
    //work_end timestamp not null
    @Column(name = "work_end")
    @NotNull
    private Date workEnd;
    //image blob NOT NULL
    @Column(name = "image")
    @NotNull
    private Blob image;
     //image_upload_date date not null
    @Column(name = "image_upload_date")
    @NotNull
    private Date uploadDate;
    //permission enum('L', 'M', 'A', 'O') NOT NULL, /*L - low, M - medium, A - admin, O - owner*/
    @Convert(converter = PermissionConverter.class)
    @Column(name = "permission")
    @NotNull
    private Permission permission;
    //password varchar(32) NOT NULL
    @Column(name = "password")
    @NotNull
    private String password;
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
