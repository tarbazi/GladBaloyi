package com.enviro.assessment.grad001.MasanaBaloyi.API.Controller;

import com.enviro.assessment.grad001.MasanaBaloyi.Service.NonRecyclableWasteService;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NonRecyclableWasteController {
    
    private NonRecyclableWasteService service;
    
    @Autowired
    public NonRecyclableWasteController(NonRecyclableWasteService service){
        this.service = service;
    }

    //listGuidelines

    @GetMapping("/addNonRecyclableWaste/{guidelineId}")
    public Response addNonRecyclableWaste(@PathVariable int guidelindeId){
        return service.addNonRecyclableWaste(guidelindeId);
    }

    //updateGuidelineId

    //deleteGuidelineId

        
}
