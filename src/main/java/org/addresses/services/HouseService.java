package org.addresses.services;

import org.addresses.models.House;

import java.util.List;

public interface HouseService {
    List<House> findAll();
}
