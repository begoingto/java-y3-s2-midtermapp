/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miterapp.repositories;

import java.util.ArrayList;
import java.util.List;
import miterapp.models.Question;
import miterapp.services.MainService;

/**
 *
 * @author begoingtodev
 */
public class QuestionRepository extends MainService<Question>{

    public QuestionRepository() {
        super("question",Question.class);
        super.LoadData();
    }
    
    public void AddQuestion(Question q){
    
        List<Question> users = new ArrayList<>(){{
            addAll(items);
        }};
        users.add(q);
        super.writeItemsToJson(users);
    }
    
}
