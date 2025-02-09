package com.enviro.assessment.grad001.MasanaBaloyi.API.Model;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;

@Entity
public class RecyclingTips {
    @Id
    @GeneratedValue
    private int id;
    private String tip;

    public RecyclingTips(){
        
    }
    
    public RecyclingTips(String tip){
        this.tip = tip;
    }

    public int getId(){
        return id;
    }

    public void setTip(String tip){
        this.tip = tip;
    }

    public String getTip(){
        return tip;
    }
}
