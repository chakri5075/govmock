package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer-data")
public class CustomerDataController {

   // @Autowired
   // private CustomerDataService customerDataService;

    @Autowired
    private CustomerPensionDataService customerPensionDataService;



    @PostMapping("/fetchpensiondetails")
    public ResponseEntity<CustomerPensionFormResponse> getPensionData(@RequestBody CustomerPensionFormPayload payload) {
        try {
            CustomerPensionFormResponse response = customerPensionDataService.fetchPensionFormData(payload);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/fetchinsurancedetails")
    public ResponseEntity<InsuranceDetailsResponse> getInsuranceDetails(@RequestBody CustomerPensionFormPayload payload) {
        InsuranceDetailsResponse response = new InsuranceDetailsResponse();
        response.setFirstName(payload.getFirstName());
        response.setLastName(payload.getLastName());
        response.setNino(payload.getNino());
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
        return ResponseEntity.ok(response);
    }


  //  @PostMapping
   // public CustomerData getCustomerData(@RequestBody DrivingLicencePayload drivingLicence) {
      //  return customerDataService.getCustomerDataByDrivingLicence(drivingLicence);
   // }
}
