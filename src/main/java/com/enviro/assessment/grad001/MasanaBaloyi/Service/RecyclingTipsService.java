package com.enviro.assessment.grad001.MasanaBaloyi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Guideline;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.RecyclingTips;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;
import com.enviro.assessment.grad001.MasanaBaloyi.Repository.RecyclingTipsInterface;

@Service
public class RecyclingTipsService {

    @Autowired
    RecyclingTipsInterface recyclingTipsRepo;

    public List<RecyclingTips> listGuidelines(){
        return recyclingTipsRepo.findAll();
    }
    
    public Response addTip(String tip){
        try{
            recyclingTipsRepo.save(new RecyclingTips(tip));
            return (new Response("Ack"));
        }

        catch(Exception error){
            System.out.println(error);
            return (new Response("Nak"));
        }
    }

    public Response updateTip(int id, String tip){
        try{
            RecyclingTips recyclingTips = recyclingTipsRepo.findById(id).orElseThrow(() -> new RuntimeException("Guideline not found"));
            recyclingTips.setTip(tip);
            recyclingTipsRepo.save(recyclingTips);
            return (new Response("Ack"));
        }

        catch(Exception error){
            System.out.println(error);
            return (new Response("Nak"));
        }
    }

    public Response deleteTip(int id){
        try{
            recyclingTipsRepo.deleteById(id);
            return (new Response("Ack"));
        }

        catch(Exception error){
            return (new Response("Nak"));
        }
    }
}
