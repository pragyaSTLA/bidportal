package com.portal.bid.service;

import com.portal.bid.entity.PlanAction;

import java.util.List;

public interface PlanActionService {

        PlanAction createPlan(PlanAction plan);
        PlanAction updatePlan(Long id, PlanAction plan);
        PlanAction getPlanById(Long id);
        void deletePlan(Long id);
        List<PlanAction> getAllPlans();


}
