package com.enviro.assessment.grad001.MasanaBaloyi.API.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Guideline {
    @Id
    @GeneratedValue
    private int id;
    private String guidelineMessage;

    public Guideline(){
        guidelineMessage = "Five";
    }
    public Guideline(String guidelineMessage){
        this.guidelineMessage = guidelineMessage;
    }


    public int getId(){
        return id;
    }

    public void setGuidelineMessage(String guidelineMessage){
        this.guidelineMessage = guidelineMessage;
    }
    
    public String getGuidelineMessage(){
        return guidelineMessage;
    }
}
