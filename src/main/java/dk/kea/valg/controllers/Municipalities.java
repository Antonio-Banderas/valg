package dk.kea.valg.controllers;

import dk.kea.valg.repositories.MunicipalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Municipalities {

    @Autowired
    MunicipalityRepository municipalities;


}
