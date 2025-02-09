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

    private GuidelineService wasteService;

    @Autowired
    public GuidelineController(GuidelineService wasteService){
        this.wasteService = wasteService;
    }

    @GetMapping("/listGuidelines/")
    public List<Guideline> listGuidelines(){
        return wasteService.listGuidelines();
    }

    @GetMapping("/addGuideline/{message}")
    public Response addGuideline(@PathVariable String message){
        Response response = wasteService.addGuideline(message);
        return response;
    }

    @GetMapping("/updateGuideline/{id}/{message}")
    public Response updateGuideline(@PathVariable int id, @PathVariable String message){
        Response response = wasteService.updateGuideline(id, message);
        return response; 
    }

    @GetMapping("/deleteGuideline/{id}")
    public Response deleteGuideline(@PathVariable int id){
        Response response = wasteService.deleteGuideline(id);
        return response;
    }

}
