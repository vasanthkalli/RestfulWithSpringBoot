package com.controller;


import com.beans.Countries;
import com.exceptions.MyOwnException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/application")

public class MyController {
@Autowired
    private Countries countries;

@RequestMapping(value = "/getResponse/{country}",method = RequestMethod.GET)
@ResponseBody
    public Countries getResponse(@PathVariable String country){
        countries.setName(country);
        return countries;
    }

    @RequestMapping(value="/postresponse",method = RequestMethod.POST)
    @ResponseBody
    public Object getcountries(@RequestBody Countries requestbody){

    try {
        if (requestbody != null) {

            if (requestbody.getName().equalsIgnoreCase("india")) {

                requestbody.setName("Bharath");
                return requestbody;
            }

            else{

                requestbody.setName("Bharath");
                return requestbody;

            }

        }
        else{
            return new MyOwnException("ReQuest body  id Null");
        }
    }catch (Exception e) {
        return new MyOwnException(e.toString());
    }
    }

}
