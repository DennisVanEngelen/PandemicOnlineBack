package com.pandemiconline.DAL.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDTO
{
    private long ID;
    private String Username;
    private String Password;
    private String EmailAddress;
}
