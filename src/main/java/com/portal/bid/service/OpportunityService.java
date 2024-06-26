package com.portal.bid.service;

import com.portal.bid.entity.Form;

import java.util.List;

public interface OpportunityService {

    Form saveOpportunity(Form opportunity);
    List<Form> getAllOpportunities();
    Form getOpportunityById(Long id);
}
