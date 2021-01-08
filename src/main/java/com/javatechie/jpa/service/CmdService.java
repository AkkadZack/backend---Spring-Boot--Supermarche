package com.javatechie.jpa.service;

import com.javatechie.jpa.entity.Cmd;
import com.javatechie.jpa.repository.CmdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmdService {

    @Autowired
    private CmdRepository repository;

    public Cmd saveCmd(Cmd cmd) {
        return repository.save(cmd);
    }

    public List<Cmd> saveCmds(List<Cmd> cmds) {
        return repository.saveAll(cmds);
    }

    public List<Cmd> getCmds() {
        return repository.findAll();
    }

    public Cmd getCmdById(long id) {
        return repository.findById(id).orElse(null);
    }



    public String deleteCmd(long id) {
        repository.deleteById(id);
        return "Cmd removed !! " + id;
    }

    public Cmd updateCmd(Cmd cmd) {
        Cmd existingCmd = repository.findById(cmd.getId()).orElse(null);
        existingCmd.setDate(cmd.getDate());
        existingCmd.setDate_livraison(cmd.getDate_livraison());
        existingCmd.setEtat(cmd.getEtat());
        return repository.save(existingCmd);
    }
}
