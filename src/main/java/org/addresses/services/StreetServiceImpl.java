package org.addresses.services;

import org.addresses.models.Street;
import org.addresses.repositories.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreetServiceImpl implements StreetService{
    @Autowired
    private StreetRepository repository;

    @Override
    public Street getStreetById(int id) {
        return repository.findById(id).orElse(null);
    }
}
