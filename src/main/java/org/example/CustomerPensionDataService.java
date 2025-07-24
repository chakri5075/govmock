package org.example;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
class CustomerPensionDataService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerPensionDataService.class);

    public CustomerPensionFormResponse fetchPensionFormData(CustomerPensionFormPayload payload) {
        logger.info("Entered fetchPensionFormData method");
       if ("SMITH807152JD99".equals(payload.getIdNumber())) {
            CustomerPensionFormResponse notFoundResponse = new CustomerPensionFormResponse();
            notFoundResponse.setFirstName(payload.getFirstName());
            notFoundResponse.setLastName(payload.getLastName());
            notFoundResponse.setIdNumber(payload.getIdNumber());
            notFoundResponse.setDateOfBirth(payload.getDateOfBirth());
            notFoundResponse.setAddress("3 London street");
            notFoundResponse.setPostalcode(payload.getPostcode());
            notFoundResponse.setAccountNumber("");
            notFoundResponse.setPensionScheme("");
            notFoundResponse.setTotalAmountDeposited("0");
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
        logger.info("Exiting fetchPensionFormData method with success response");
        return response;
    }
}
