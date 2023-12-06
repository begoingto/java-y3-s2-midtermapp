/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miterapp.repositories;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.UUID;
import miterapp.models.User;
import miterapp.services.UserService;

/**
 *
 * @author begoingtodev
 */
public class UserRepoitory implements UserService{

    @Override
    public User addUser(User user) {
        Gson gson = new Gson();
         try (FileWriter writerUser = new FileWriter("D:\\_semII-3\\java\\MiterApp\\src\\miterapp\\data\\user.json")) {
           gson.toJson(user, writerUser);
           // FileWriter
           return user;
       } catch (Exception e) {
           throw new UnsupportedOperationException("Add user Error:"+ e.getMessage()); 
       }
    }

    @Override
    public void updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User getByUuid(UUID uuid) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
