package org.example;

import org.springframework.stereotype.Service;

@Service
class CustomerPensionDataService {

    public CustomerPensionFormResponse fetchPensionFormData(CustomerPensionFormPayload payload) {
        if ("111122223333".equals(payload.getIdNumber())) {
            CustomerPensionFormResponse notFoundResponse = new CustomerPensionFormResponse();
            notFoundResponse.setFirstName("");
            notFoundResponse.setLastName("");
            notFoundResponse.setIdNumber(payload.getIdNumber());
            notFoundResponse.setDateOfBirth("");
            notFoundResponse.setAddress("");
            notFoundResponse.setPostalcode(payload.getPostcode());
            notFoundResponse.setAccountNumber("");
            notFoundResponse.setPensionScheme("details not found");
            notFoundResponse.setTotalAmountDeposited("");
            return notFoundResponse;
        }

        CustomerPensionFormResponse response = new CustomerPensionFormResponse();
        // Populate with request data and mock values
        response.setFirstName(payload.getFirstName());
        response.setLastName(payload.getLastName());
        response.setIdNumber(payload.getIdNumber());
        response.setDateOfBirth(payload.getDateOfBirth());
        response.setAddress("10 Downing Street");
        response.setPostalcode(payload.getPostcode());
        response.setAccountNumber("4567987634561289");
        response.setPensionScheme("Regular");
        response.setTotalAmountDeposited("1000000");
        // Optionally set these as empty or mock
      //  response.setPersonalDetailsValidation("");
      //  response.setNiContributionDetails("");
        return response;
    }
}