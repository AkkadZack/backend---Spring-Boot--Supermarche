package com.javatechie.jpa.controller;

import com.javatechie.jpa.entity.Cmd;
import com.javatechie.jpa.service.CmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class CmdController {
    @Autowired
    private CmdService Cmdservice;

    @PostMapping("/addCmd")
    public Cmd addCmd(@RequestBody Cmd cmd) {
        return Cmdservice.saveCmd(cmd);

    }

    @PostMapping("/addCmds")
    public List<Cmd> addCmds(@RequestBody List<Cmd> Cmds) {
        return Cmdservice.saveCmds(Cmds);
    }

    @GetMapping("/Cmds")
    public List<Cmd> findAllCmds() {
        return Cmdservice.getCmds();
    }

    @GetMapping("/CmdById/{id}")
    public Cmd findCmdById(@PathVariable Long id) {
        return Cmdservice.getCmdById(id);
    }


    @PutMapping("/updateCmd")
    public Cmd updateCmd(@RequestBody Cmd Cmd) {
        return Cmdservice.updateCmd(Cmd);
    }

    @DeleteMapping("/deleteCmd/{id}")
    public String deleteCmd(@PathVariable Long id) {
        return Cmdservice.deleteCmd(id);
    }
}
