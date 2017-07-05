package com.okyoung.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.okyoung.entity.Critique;
import com.okyoung.pagemodel.CritiqueModel;

public interface CritiqueService extends BaseService<CritiqueModel>{
    public static final Logger logger = Logger.getLogger(CritiqueService.class);
    
    public List<CritiqueModel> queryByArtId(int id) throws Exception;
}
