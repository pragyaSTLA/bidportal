package com.portal.bid.controller;


import com.portal.bid.entity.BusinessSegment;
import com.portal.bid.entity.Form;
import com.portal.bid.service.BusinessSegmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/business-segments")
public class SegmentController {

//    private BusinessSegment segment ;
    private BusinessSegmentService  businessSegmentService;


    @PostMapping
    public ResponseEntity<BusinessSegment> createOpportunity(@RequestBody BusinessSegment b) {

        BusinessSegment createdSegment = businessSegmentService.createBusinessSegment(b);
        return new ResponseEntity<>(createdSegment, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<BusinessSegment>> getAllBusinessSegments() {

        List<BusinessSegment> segments = businessSegmentService.getAllBusinessSegments();
        return new ResponseEntity<>(segments, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BusinessSegment> updateBusinessSegment(@PathVariable Long id, @RequestBody BusinessSegment businessSegment) {
        BusinessSegment updatedSegment = businessSegmentService.updateBusinessSegment(id, businessSegment);
        return updatedSegment != null ? new ResponseEntity<>(updatedSegment, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBusinessSegment(@PathVariable Long id) {
        boolean isDeleted = businessSegmentService.deleteBusinessSegment(id);
        return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
