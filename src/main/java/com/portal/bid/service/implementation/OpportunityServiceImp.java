package com.portal.bid.service.implementation;

import com.portal.bid.entity.Form;
import com.portal.bid.repository.FormRepository;
import com.portal.bid.service.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpportunityServiceImp implements OpportunityService {

    @Autowired
    private FormRepository formRespository;
    @Override
    public Form saveOpportunity(Form f) {
       return formRespository.save(f);
    }

    @Override
    public List<Form> getAllOpportunities() {
        return formRespository.findAll();
    }

    @Override
    public Form getOpportunityById(Long id) {
        return formRespository.findById(id).orElse(null);
    }
}
