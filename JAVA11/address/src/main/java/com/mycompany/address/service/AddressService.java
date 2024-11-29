package com.mycompany.address.service;

import com.mycompany.address.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AddressService {

    public List<Address> getAddresses() {
        return List.of(
                new Address(UUID.fromString("bb3373e2-1abc-4961-861e-ce7c38ab0000"), "Palestine", "Jerusalem", "Freedom ST"),
                new Address(UUID.fromString("bb3373e2-1abc-4961-861e-ce7c38ab0001"), "Egypt", "Cairo", "Pyramids ST"),
                new Address(UUID.fromString("bb3373e2-1abc-4961-861e-ce7c38ab0002"), "Russia", "Saint Petersburg", "The kings ST"),
                new Address(UUID.fromString("bb3373e2-1abc-4961-861e-ce7c38ab0003"), "Poland", "Warsaw", "Wolska ST, 000")

        );
    }

    public Address getAddressById(UUID id) {
        return getAddresses()
                .stream()
                .filter(address -> address.getId().equals(id)).findFirst().orElseThrow();
    }
}
