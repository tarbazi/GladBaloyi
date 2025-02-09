package com.enviro.assessment.grad001.MasanaBaloyi.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.RecyclableWaste;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;
import com.enviro.assessment.grad001.MasanaBaloyi.Service.RecyclableWasteService;

@RestController
public class RecyclableWasteController {

    private RecyclableWasteService service;
    
    @Autowired
    public RecyclableWasteController(RecyclableWasteService service){
        this.service = service;
    }

    @GetMapping("/listRecyclableWaste/")
    public List<RecyclableWaste> listRecyclableWaste(){
        return service.listRecyclableWaste();
    }

    @GetMapping("/addRecyclableWaste/{category}/{guidelindeId}/{recyclingTipsId}")
    public Response addRecyclableWaste(@PathVariable String category, @PathVariable int guidelindeId, @PathVariable int recyclingTipsId){
        return service.addRecyclableWaste(category, guidelindeId, recyclingTipsId);
    }

    @GetMapping("/updateRecyclableWase/{id}/{guidelineId}")
    public Response updateGuidelineId(@PathVariable int id, @PathVariable int guidelineId){
        Response response = service.updateGuidelineId(id, guidelineId);
        return response; 
    }

    @GetMapping("/deleteRecyclableWaste/{id}")
    public Response deleteRecyclableWaste(@PathVariable int id){
        Response response = service.deleteRecyclableWaste(id);
        return response;
    }
}
