package com.apap.tutorial4.com.apap.tutorial4.service;

import com.apap.tutorial4.com.apap.tutorial4.model.PilotModel;
import com.apap.tutorial4.com.apap.tutorial4.repository.PilotDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PilotServiceImpl implements PilotService {
    @Autowired
    private PilotDb pilotDb;

    @Override
    public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
        return  pilotDb.findByLicenseNumber(licenseNumber);
    }

    @Override
    public void addPilot(PilotModel pilot) {
        pilotDb.save(pilot);
    }
}
