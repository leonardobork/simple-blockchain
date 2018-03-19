/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardobork.blockchain.dto;

import com.leonardobork.blockchain.domain.Block;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author leonardobork
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlockchainDTO {
    
    private String identifier;
    private List<Block> blockchain;
}
