package com.okyoung.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.okyoung.entity.Critique;

public interface CritiqueService extends BaseService<Critique>{
    public static final Logger logger = Logger.getLogger(CritiqueService.class);
    
    public List<Critique> queryByArtId(int id) throws Exception;
}
