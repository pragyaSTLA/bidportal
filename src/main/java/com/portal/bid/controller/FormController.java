package com.portal.bid.controller;

import com.portal.bid.entity.Form;
import com.portal.bid.service.OpportunityService;
import com.portal.bid.service.implementation.OpportunityServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/opportunities")
public class FormController{



        @Autowired
        private OpportunityServiceImp opportunityService;

         @CrossOrigin(origins = "http://localhost:3000")
        @PostMapping
        public ResponseEntity<Form> createOpportunity(@RequestBody Form opportunity) {

            Form savedOpportunity = opportunityService.saveOpportunity(opportunity);
            return ResponseEntity.ok(savedOpportunity);
        }

         @CrossOrigin(origins = "http://localhost:3000")
        @GetMapping
        public ResponseEntity<List<Form>> getAllOpportunities() {
            List<Form> opportunities = opportunityService.getAllOpportunities();
            return ResponseEntity.ok(opportunities);
        }

       @CrossOrigin(origins = "http://localhost:3000")
        @GetMapping("/{id}")
        public ResponseEntity<Form> getOpportunityById(@PathVariable Long id) {
            Form opportunity = opportunityService.getOpportunityById(id);
            if (opportunity != null) {
                return ResponseEntity.ok(opportunity);
            } else {
                return ResponseEntity.notFound().build();
            }
        }
}
