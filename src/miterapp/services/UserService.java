/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miterapp.services;

import java.util.UUID;
import miterapp.models.User;

/**
 *
 * @author begoingtodev
 */
public interface UserService {
    User addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User getByUuid(UUID uuid);
}
