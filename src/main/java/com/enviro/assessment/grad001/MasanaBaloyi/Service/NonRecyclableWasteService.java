package com.enviro.assessment.grad001.MasanaBaloyi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.MasanaBaloyi.Repository.NonRecyclableWasteInterface;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.NonRecyclableWaste;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;

@Service
public class NonRecyclableWasteService {

    @Autowired
    NonRecyclableWasteInterface nonRecyclableWasteRepo;
    
    public Response addNonRecyclableWaste(int guidelineId){
        try{
            nonRecyclableWasteRepo.save(new NonRecyclableWaste(guidelineId));
            return (new Response("Ack"));
        }

        catch (Exception error){
            return (new Response("Nak"));
        }
    }
}
