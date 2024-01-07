/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miterapp.repositories;

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
    
}
