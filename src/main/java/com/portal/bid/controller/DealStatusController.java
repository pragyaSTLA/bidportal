package com.portal.bid.controller;

import com.portal.bid.entity.BusinessUnit;
import com.portal.bid.entity.DealStatus;
import com.portal.bid.service.BusinessUnitService;
import com.portal.bid.service.DealStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deal-status")
public class DealStatusController {

    @Autowired
    private DealStatusService dealStatusService;

    @PostMapping
    public ResponseEntity<DealStatus> createDealStatus(@RequestBody DealStatus dealStatus) {
        DealStatus createdUnit = dealStatusService.createDealStatus(dealStatus);
        return new ResponseEntity<>(createdUnit, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DealStatus> getDealStatusByIdById(@PathVariable Long id) {
        DealStatus unit = dealStatusService.getDealStatusById(id);
        return unit != null ? new ResponseEntity<>(unit, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<DealStatus>> getAllDealStatus() {
        List<DealStatus> units = dealStatusService.getAllDealStatus();
        return new ResponseEntity<>(units, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DealStatus> updateDealStatus(@PathVariable Long id, @RequestBody DealStatus dealStatus) {
        DealStatus updatedUnit = dealStatusService.updateDealStatus(id, dealStatus);
        return updatedUnit != null ? new ResponseEntity<>(updatedUnit, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDealStatus(@PathVariable Long id) {
        boolean isDeleted = dealStatusService.deleteDealStatus(id);
        return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
