package com.enviro.assessment.grad001.MasanaBaloyi.API.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RecyclableWaste {

    @Id
    @GeneratedValue
    private int id;
    private String category;
    private int guidelineId;
    private int recyclingTipsId;

    public RecyclableWaste(){
        
    }
    
    public RecyclableWaste(String category, int guidelineId, int recyclingTipsId){
        this.category = category;
        this.guidelineId = guidelineId;
        this.recyclingTipsId = recyclingTipsId;
    }

    public int getId(){
        return id;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void setGuidelineId(int guidelineId){
        this.guidelineId = guidelineId;
    }

    public int getGuidelineId(){
        return guidelineId;
    }

    public void setRecyclingTipsId(int recyclingTipsId){
        this.recyclingTipsId = recyclingTipsId;
    }

    public int getRecyclingTipsId(){
        return recyclingTipsId;
    }
}
