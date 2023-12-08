/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miterapp.repositories;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import miterapp.models.User;
import miterapp.services.UserService;

/**
 *
 * @author begoingtodev
 */
public class UserRepoitory implements UserService{
    private final Gson gson = new Gson();
    public Map<String,List<User>> data = new HashMap<>();
    public List<User> users = new ArrayList<>();
    
    public UserRepoitory(){
        data.put("users", users);
        Type mapType = new TypeToken<Map<String, List<User>>>(){}.getType();
        // Read the JSON file to the map of the specified type
        try (FileReader reader = new FileReader("D:\\_semII-3\\java\\MiterApp\\src\\miterapp\\data\\user.json")) {
            data = gson.fromJson(reader, mapType);
            users.addAll(data.get("users"));
            // Do something with the map, like printing it to the console
            System.out.println("Data :"+ data);
        } catch (IOException e) {
            System.out.println("Error read: "+ e.getMessage());
        }
    }
    

    @Override
    public User addUser(User user) {
        users.add(user);
        data.put("users", users);
        String usersJson = gson.toJson(data);
        System.out.println("usersJson :"+ usersJson);
        try (FileWriter writer = new FileWriter("D:\\_semII-3\\java\\MiterApp\\src\\miterapp\\data\\user.json")) {
            writer.write(usersJson);
        } catch (IOException e) {
           throw new UnsupportedOperationException("Not supported yet.");
        }
        return user;
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

    @Override
    public List<User> getAll() {
        try {
            Type userListType = new TypeToken<List<User>>() {}.getType();
            List<User> userList = gson.fromJson(new FileReader("D:\\_semII-3\\java\\MiterApp\\src\\miterapp\\data\\user.json"), userListType);
            return userList;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserRepoitory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
}
