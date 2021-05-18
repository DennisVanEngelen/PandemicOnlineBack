package com.pandemiconline.DAL.DataModel;

import com.pandemiconline.DAL.DTO.UserDTO;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity @Getter
@Setter
public class UserDataModel
{

        @Id
        @GeneratedValue
        @Column(updatable = false, nullable = false)
        private Long id;

        @Column(unique = true, nullable = false)
        private String username;

        @Column(nullable = false)
        private String password;

        @Column(unique = true, nullable = false)
        private String email_address;

        public UserDataModel() { }

        public UserDataModel(UserDTO user)
        {
            this.id = user.getID();
            username = user.getUsername();
            password = user.getPassword();
            email_address = user.getEmailAddress();
        }


}
