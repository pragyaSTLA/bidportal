package com.portal.bid.service.implementation;

import com.portal.bid.entity.DealStatus;
import com.portal.bid.service.DealStatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealStatusImp implements DealStatusService {
    @Override
    public DealStatus createDealStatus(DealStatus dealStatus) {
        return null;
    }

    @Override
    public DealStatus getDealStatusById(Long id) {
        return null;
    }

    @Override
    public List<DealStatus> getAllDealStatus() {
        return List.of();
    }

    @Override
    public DealStatus updateDealStatus(Long id, DealStatus dealStatus) {
        return null;
    }

    @Override
    public boolean deleteDealStatus(Long id) {
        return false;
    }
}
