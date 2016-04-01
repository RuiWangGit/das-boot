package com.boot.controller;

import java.util.List;

import com.boot.model.Shipwreck;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wang_rui on 4/1/16.
 */
@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @RequestMapping(value ="shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {
        return ShipwreckStub.list();
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.create(shipwreck);
    }
















}
