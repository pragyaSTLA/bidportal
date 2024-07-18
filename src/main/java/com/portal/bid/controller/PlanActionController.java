package com.portal.bid.controller;

import com.portal.bid.entity.PlanAction;
import com.portal.bid.service.PlanActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@RestController
@RequestMapping("/api/plans")
public class PlanActionController {

    @Autowired
    private PlanActionService planService;

    @PostMapping
    public ResponseEntity<PlanAction> createPlan(@RequestBody PlanAction plan) {
        plan.setCreatedAt(LocalDateTime.now());
        PlanAction createdPlan = planService.createPlan(plan);
        return new ResponseEntity<>(createdPlan, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlanAction> updatePlan(@PathVariable Long id, @RequestBody PlanAction plan) {
        plan.setUpdatedAt(LocalDateTime.now());
        if (plan.getUpdatedBy() == null || plan.getAction() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // Return 400 Bad Request if validation fails
        }
        PlanAction updatedPlan = planService.updatePlan(id, plan);
        return updatedPlan != null ? new ResponseEntity<>(updatedPlan, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanAction> getPlanById(@PathVariable Long id) {
        PlanAction plan = planService.getPlanById(id);
        return plan != null ? new ResponseEntity<>(plan, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlan(@PathVariable Long id) {
        planService.deletePlan(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<PlanAction>> getAllPlans() {
        List<PlanAction> plans = planService.getAllPlans();
        return new ResponseEntity<>(plans, HttpStatus.OK);
    }
}
