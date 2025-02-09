package com.enviro.assessment.grad001.MasanaBaloyi.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Guideline;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.RecyclingTips;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Response;
import com.enviro.assessment.grad001.MasanaBaloyi.Service.RecyclingTipsService;

@RestController
public class RecyclingTipsController {
    private RecyclingTipsService service;

    @Autowired
    public RecyclingTipsController(RecyclingTipsService service){
        this.service = service;
    }

    @GetMapping("/listRecyclingTips/")
    public List<RecyclingTips> listGuidelines(){
        return service.listGuidelines();
    }

    @GetMapping("/addTip/{tip}")
    public Response addTip(@PathVariable String tip){
        Response response = service.addTip(tip);
        return response;
    }

    @GetMapping("/updateTip/{id}/{tip}")
    public Response updateTip(@PathVariable int id, @PathVariable String tip){
        Response response = service.updateTip(id, tip);
        return response; 
    }

    @GetMapping("/deleteTip/{id}")
    public Response deleteTip(@PathVariable int id){
        Response response = service.deleteTip(id);
        return response;
    }
}
