package com.enviro.assessment.grad001.MasanaBaloyi.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.MasanaBaloyi.Service.GuidelineService;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Guideline;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/*import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;*/

import java.util.List;

@RestController
public class GuidelineController {

    private GuidelineService service;

    @Autowired
    public GuidelineController(GuidelineService service){
        this.service = service;
    }

    @GetMapping("/listGuidelines/")
    public List<Guideline> listGuidelines(){
        return service.listGuidelines();
    }

    @GetMapping("/addGuideline/{message}")
    public Response addGuideline(@PathVariable String message){
        Response response = service.addGuideline(message);
        return response;
    }

    @GetMapping("/updateGuideline/{id}/{message}")
    public Response updateGuideline(@PathVariable int id, @PathVariable String message){
        Response response = service.updateGuideline(id, message);
        return response; 
    }

    @GetMapping("/deleteGuideline/{id}")
    public Response deleteGuideline(@PathVariable int id){
        Response response = service.deleteGuideline(id);
        return response;
    }

}
