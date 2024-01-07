/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miterapp.models;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author begoingtodev
 */
@Getter
@Setter
@ToString
public class User {
    private UUID uuid;
    private String username;
    private String fullName;
    private String gender;
    private String password;
    private String role;
}
