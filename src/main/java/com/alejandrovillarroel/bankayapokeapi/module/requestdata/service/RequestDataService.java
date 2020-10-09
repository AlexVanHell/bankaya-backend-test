package com.alejandrovillarroel.bankayapokeapi.module.requestdata.service;

import com.alejandrovillarroel.bankayapokeapi.module.requestdata.RequestDataEntity;
import com.alejandrovillarroel.bankayapokeapi.module.requestdata.RequestDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestDataService {

    private final RequestDataRepository repository;

    @Autowired
    public RequestDataService(RequestDataRepository repository) {
        this.repository = repository;
    }

    public RequestDataEntity save(RequestDataEntity data) {
        return this.repository.save(data);
    }
}
