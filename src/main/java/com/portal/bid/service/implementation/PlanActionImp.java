package com.portal.bid.service.implementation;

import com.portal.bid.entity.PlanAction;
import com.portal.bid.repository.PlanActionRepository;
import com.portal.bid.service.PlanActionService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PlanActionImp implements PlanActionService {

    @Autowired
    private PlanActionRepository planRepository;

    @Override
    public PlanAction createPlan(PlanAction plan) {
        plan.setCreatedAt(LocalDateTime.now());
        return planRepository.save(plan);
    }

    @Override
    public PlanAction updatePlan(Long id, PlanAction plan) {
        Optional<PlanAction> existingPlan = planRepository.findById(id);
        if (existingPlan.isPresent()) {
            PlanAction updatedPlan = existingPlan.get();
            updatedPlan.setDate(plan.getDate());
            updatedPlan.setPlan(plan.getPlan());
            updatedPlan.setAction(plan.getAction());
            updatedPlan.setCreatedBy(plan.getCreatedBy());
            updatedPlan.setUpdatedAt(LocalDateTime.now());
            updatedPlan.setUpdatedBy(plan.getUpdatedBy());
            return planRepository.save(updatedPlan);
        }
        return null;
    }

    @Override
    public PlanAction getPlanById(Long id) {
        return planRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePlan(Long id) {
        planRepository.deleteById(id);
    }

    @Override
    public List<PlanAction> getAllPlans() {
        return planRepository.findAll();
    }
}
