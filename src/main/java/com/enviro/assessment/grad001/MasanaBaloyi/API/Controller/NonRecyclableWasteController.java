package com.enviro.assessment.grad001.MasanaBaloyi.API.Controller;

import com.enviro.assessment.grad001.MasanaBaloyi.Service.NonRecyclableWasteService;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.NonRecyclableWaste;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;

import java.util.List;

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

    @GetMapping("/listNonRecyclableWaste/")
    public List<NonRecyclableWaste> listNonRecyclableWastes(){
        return service.listNonRecyclableWastes();
    }

    @GetMapping("/addNonRecyclableWaste/{guidelineId}")
    public Response addNonRecyclableWaste(@PathVariable int guidelindeId){
        return service.addNonRecyclableWaste(guidelindeId);
    }

    @GetMapping("/updateNonRecyclableWaste/{id}/{guidelineId}")
    public Response updateGuidelineId(@PathVariable int id, @PathVariable int guidelineId){
        Response response = service.updateGuidelineId(id, guidelineId);
        return response; 
    }

    @GetMapping("/deleteGuidelineId/{id}")
    public Response deleteGuideline(@PathVariable int id){
        Response response = service.deleteGuidelineId(id);
        return response;
    }
        
}
