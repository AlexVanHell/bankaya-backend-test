package com.alejandrovillarroel.bankayapokeapi.module.requestdata;

import com.alejandrovillarroel.bankayapokeapi.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "request_data")
public class RequestDataEntity extends BaseEntity {
    @Id
    private Long id;

    private String originIp;
    private short method;

}
