package com.portal.bid.service;

import com.portal.bid.entity.GoNoGoStatus;

import java.util.List;

public interface GoNoGoStatusService {
    GoNoGoStatus createEntry(GoNoGoStatus entry);

    

    GoNoGoStatus updateEntry(GoNoGoStatus entry, Long id);

    GoNoGoStatus findbyID(Long id);

    List<GoNoGoStatus> findAll();
}
