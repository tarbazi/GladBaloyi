package com.enviro.assessment.grad001.MasanaBaloyi.API.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class NonRecyclableWaste {
    @Id
    @GeneratedValue
    private int id;
    private int guidelineId;

    public NonRecyclableWaste(){

    }

    public NonRecyclableWaste(int guidelineId){
        this.guidelineId = guidelineId;
    }

    public int getId(){
        return id;
    }

    public void setGuidelineId(int guidelineId){
        this.guidelineId = guidelineId;
    }
    
    public int getGuidelineId(){
        return guidelineId;
    }
}
