/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardobork.blockchain.domain;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author leonardobork
 */
@Data
@AllArgsConstructor
public class Block {
    
    private Integer index;
    private String previousHash;
    private LocalDateTime timestamp;
    private String data;
    private String hash;

}
