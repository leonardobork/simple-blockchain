/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardobork.blockchain.service;

import com.leonardobork.blockchain.domain.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leonardobork
 */
@Service
public class NodeService {

    @Autowired BlockService blockService;
    
    public void mineBlock(String blockData){
        Block newBlock = blockService.generateNextBlock(blockData);
        blockService.addBlock(newBlock);
        System.out.println("New block added, index number: " + newBlock.getIndex());
    }
}
