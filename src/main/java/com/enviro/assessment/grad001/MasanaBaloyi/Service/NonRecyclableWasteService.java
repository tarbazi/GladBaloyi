package com.enviro.assessment.grad001.MasanaBaloyi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.MasanaBaloyi.Repository.NonRecyclableWasteInterface;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Guideline;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.NonRecyclableWaste;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;

@Service
public class NonRecyclableWasteService {

    @Autowired
    NonRecyclableWasteInterface nonRecyclableWasteRepo;
    
    public List<NonRecyclableWaste> listNonRecyclableWastes(){
        return nonRecyclableWasteRepo.findAll();
    }
    
    public Response addNonRecyclableWaste(int guidelineId){
        try{
            nonRecyclableWasteRepo.save(new NonRecyclableWaste(guidelineId));
            return (new Response("Ack"));
        }

        catch (Exception error){
            return (new Response("Nak"));
        }
    }

    public Response updateGuidelineId(int id, int guidelineId){
        try{
            NonRecyclableWaste nonRecyclableWaste = nonRecyclableWasteRepo.findById(id).orElseThrow(() -> new RuntimeException("Guideline not found"));
            nonRecyclableWaste.setGuidelineId(guidelineId);
            nonRecyclableWasteRepo.save(nonRecyclableWaste);
            return (new Response("Ack"));
        }

        catch(Exception error){
            System.out.println(error);
            return (new Response("Nak"));
        }
    }

    public Response deleteGuidelineId(int id){
        try{
            nonRecyclableWasteRepo.deleteById(id);
            return (new Response("Ack"));
        }

        catch(Exception error){
            return (new Response("Nak"));
        }
    }

}
