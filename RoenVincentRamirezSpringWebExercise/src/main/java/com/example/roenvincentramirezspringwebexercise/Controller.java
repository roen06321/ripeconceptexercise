package com.example.roenvincentramirezspringwebexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/searchapi")
public class Controller {

    @Autowired
    private Service autoService;

    @GetMapping(value = "/searchTerm")
    public ResponseEntity<List<Items>> getMapping(@RequestParam(value = "searchName")String searchName, @RequestBody List<String> listId){
        return new ResponseEntity<List<Items>>(autoService.getItems(searchName, listId), HttpStatus.OK);
    }
}
