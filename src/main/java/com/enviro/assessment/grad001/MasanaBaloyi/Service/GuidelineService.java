package com.enviro.assessment.grad001.MasanaBaloyi.Service;

import java.util.ArrayList;
import java.util.List;

import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Guideline;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.NonRecyclableWaste;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.RecyclableWaste;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.RecyclingTips;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;

import com.enviro.assessment.grad001.MasanaBaloyi.Repository.GuidelineInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuidelineService {

    @Autowired
    GuidelineInterface guidelinesRepo;

    public List<Guideline> listGuidelines(){
        return guidelinesRepo.findAll();
    }
    
    public Response addGuideline(String message){
        try{
            guidelinesRepo.save(new Guideline( message));
            return (new Response("Ack"));
        }

        catch(Exception error){
            System.out.println(error);
            return (new Response("Nak"));
        }
    }

    public Response updateGuideline(int id, String message){
        try{
            Guideline guideline = guidelinesRepo.findById(id).orElseThrow(() -> new RuntimeException("Guideline not found"));
            guideline.setGuidelineMessage(message);
            guidelinesRepo.save(guideline);
            return (new Response("Ack"));
        }

        catch(Exception error){
            System.out.println(error);
            return (new Response("Nak"));
        }
    }

    public Response deleteGuideline(int id){
        try{
            guidelinesRepo.deleteById(id);
            return (new Response("Ack"));
        }

        catch(Exception error){
            return (new Response("Nak"));
        }
    }
}
