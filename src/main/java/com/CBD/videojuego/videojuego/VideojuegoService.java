/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CBD.videojuego.videojuego;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jaime
 */

@Service
@Transactional
public class VideojuegoService {
    
    private MongoTemplate mongotemplate;
    
    public Iterable<GxP> GenerosPlataforma(){
        
        Aggregation agg = newAggregation(groupOperation());
        
        return
    }
    
    private GroupOperation groupOperation(){
        return group("Platform").addToSet("Genre").as("Genres");
    }
    
}
