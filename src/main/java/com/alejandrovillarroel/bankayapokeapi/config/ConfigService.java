package com.alejandrovillarroel.bankayapokeapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {
    private Environment environment;

    @Autowired
    public ConfigService(Environment environment) {
        this.environment = environment;
    }

    public String getProperty(String key) {
        return this.environment.getProperty(key);
    }
}
