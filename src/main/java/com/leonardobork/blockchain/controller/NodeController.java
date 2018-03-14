/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardobork.blockchain.controller;

import com.leonardobork.blockchain.domain.Block;
import com.leonardobork.blockchain.service.BlockService;
import com.leonardobork.blockchain.service.LogService;
import com.leonardobork.blockchain.service.NodeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leonardobork
 */
@RestController()
public class NodeController {
    
    @Autowired BlockService blockService;
    @Autowired NodeService nodeService;
    @Autowired LogService logService;
    
    @GetMapping("/blocks")
    public List<Block> getBlockchain(){
        return blockService.getBlockchain();
    }
    
    @PostMapping("/mine")
    public void mineBlock(@RequestBody String blockData){
        this.nodeService.mineBlock(blockData);
    }
    
    @GetMapping("/log")
    public String getLog(){
        return this.logService.getLog();
    }
}
