package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/customer-data")
public class CustomerDataController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerDataController.class);

   // @Autowired
   // private CustomerDataService customerDataService;

    @Autowired
    private CustomerPensionDataService customerPensionDataService;



    @PostMapping("/fetchpensiondetails")
    public ResponseEntity<CustomerPensionFormResponse> getPensionData(@RequestBody CustomerPensionFormPayload payload) {
        logger.info("Entered getPensionData method");
        try {
            CustomerPensionFormResponse response = customerPensionDataService.fetchPensionFormData(payload);
            logger.info("Exiting getPensionData method successfully");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            logger.error("Exception in getPensionData method", e);
            logger.info("Exiting getPensionData method with error");
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/fetchinsurancedetails")
    public ResponseEntity<InsuranceDetailsResponse> getInsuranceDetails(@RequestBody CustomerPensionFormPayload payload) {
        logger.info("Entered getInsuranceDetails method");
        InsuranceDetailsResponse response = new InsuranceDetailsResponse();
        response.setFirstName(payload.getFirstName());
        response.setLastName(payload.getLastName());
        response.setNino(payload.getIdNumber());
        response.setDateOfBirth(payload.getDateOfBirth());
        response.setPostcode(payload.getPostcode());
        response.setGender("M");
        response.setMaritalstatus("Single");
        response.setResidentialaddress("10 Downing Street, London");
        response.setEmailaddress("john.doe@email.com");
        response.setPhoneNumber("+44 1234 567890");
        response.setOccupation("Software Engineer");
        response.setEmploymentStatus("Employed");
        response.setAmountofCover("500000");
        response.setBeneficiaryNameAndRelationship("Jane Doe - Spouse");
        logger.info("Exiting getInsuranceDetails method successfully");
        return ResponseEntity.ok(response);
    }


  //  @PostMapping
   // public CustomerData getCustomerData(@RequestBody DrivingLicencePayload drivingLicence) {
      //  return customerDataService.getCustomerDataByDrivingLicence(drivingLicence);
   // }
}
