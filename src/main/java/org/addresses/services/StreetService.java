package org.addresses.services;

import org.addresses.models.Street;

import java.util.List;
import java.util.Optional;

public interface StreetService {
    Street getStreetById(int id);
}
