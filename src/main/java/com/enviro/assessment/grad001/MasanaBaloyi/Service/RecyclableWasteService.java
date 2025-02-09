package com.enviro.assessment.grad001.MasanaBaloyi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.RecyclableWaste;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;
import com.enviro.assessment.grad001.MasanaBaloyi.Repository.RecyclableWasteInterface;

@Service
public class RecyclableWasteService {
    @Autowired
    RecyclableWasteInterface recyclableWasteRepo;
    
    public List<RecyclableWaste> listRecyclableWaste(){
        return recyclableWasteRepo.findAll();
    }
    
    public Response addRecyclableWaste(String message, int guidelineId, int recyclingTipsId){
        try{
            recyclableWasteRepo.save(new RecyclableWaste(message, guidelineId, recyclingTipsId));
            return (new Response("Ack"));
        }

        catch (Exception error){
            return (new Response("Nak"));
        }
    }

    public Response updateGuidelineId(int id, int guidelineId){
        try{
            RecyclableWaste recyclableWaste = recyclableWasteRepo.findById(id).orElseThrow(() -> new RuntimeException("Guideline not found"));
            recyclableWaste.setGuidelineId(guidelineId);
            recyclableWasteRepo.save(recyclableWaste);
            return (new Response("Ack"));
        }

        catch(Exception error){
            System.out.println(error);
            return (new Response("Nak"));
        }
    }

    public Response deleteRecyclableWaste(int id){
        try{
            recyclableWasteRepo.deleteById(id);
            return (new Response("Ack"));
        }

        catch(Exception error){
            return (new Response("Nak"));
        }
    }
}
