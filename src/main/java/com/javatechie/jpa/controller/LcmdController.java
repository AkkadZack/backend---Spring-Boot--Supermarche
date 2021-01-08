package com.javatechie.jpa.controller;

import com.javatechie.jpa.entity.Lcmd;
import com.javatechie.jpa.service.LcmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LcmdController {
    @Autowired
    private LcmdService Lcmdservice;

    @PostMapping("/addLcmd")
    public Lcmd addLcmd(@RequestBody Lcmd Lcmd) {
        return Lcmdservice.saveLcmd(Lcmd);
    }

    @PostMapping("/addLcmds")
    public List<Lcmd> addLcmds(@RequestBody List<Lcmd> Lcmds) {
        return Lcmdservice.saveLcmds(Lcmds);
    }

    @GetMapping("/Lcmds")
    public List<Lcmd> findAllLcmds() {
        return Lcmdservice.getLcmds();
    }

    @GetMapping("/LcmdById/{id}")
    public Lcmd findLcmdById(@PathVariable Long id) {
        return Lcmdservice.getLcmdById(id);
    }


    @PutMapping("/updateLcmd")
    public Lcmd updateLcmd(@RequestBody Lcmd Lcmd) {
        return Lcmdservice.updateLcmd(Lcmd);
    }

    @DeleteMapping("/deleteLcmd/{id}")
    public String deleteLcmd(@PathVariable Long id) {
        return Lcmdservice.deleteLcmd(id);
    }
}
