/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.api;

import com.squareup.connect.ApiClient;
import com.squareup.connect.ApiException;
import com.squareup.connect.Configuration;
import com.squareup.connect.auth.OAuth;
import com.squareup.connect.models.Address;
import com.squareup.connect.models.Card;
import com.squareup.connect.models.CreateCustomerCardRequest;
import com.squareup.connect.models.CreateCustomerCardResponse;
import com.squareup.connect.models.CreateCustomerRequest;
import com.squareup.connect.models.CreateCustomerResponse;
import com.squareup.connect.models.Customer;
import com.squareup.connect.models.DeleteCustomerCardResponse;
import com.squareup.connect.models.DeleteCustomerResponse;
import com.squareup.connect.models.ListCustomersResponse;
import com.squareup.connect.models.RetrieveCustomerResponse;
import com.squareup.connect.models.UpdateCustomerRequest;
import com.squareup.connect.models.UpdateCustomerResponse;
import com.squareup.connect.utils.APITest;
import com.squareup.connect.utils.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * API tests for CustomersApi
 */
public class CustomersApiTest extends APITest {

    private final ApiClient defaultClient = Configuration.getDefaultApiClient();
    private final CustomersApi api = new CustomersApi();

    @Before
    public void setup() {
        Account testAccount = accounts.get("US-Prod-Sandbox");
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken(testAccount.accessToken);
    }

    @After
    public void tearDown() throws ApiException {
        deleteCustomers();
    }

    private void deleteCustomers() throws ApiException {
        while(true) {
            ListCustomersResponse response = api.listCustomers(null, null, null);
            if (response.getCustomers() == null || response.getCustomers().isEmpty()) {
                return;
            }
            response.getCustomers().stream().map(Customer::getId).forEach(customerId -> {
                try {
                    api.deleteCustomer(customerId);
                } catch (ApiException e) {
                    throw new RuntimeException(e);
                }
            });

        }
    }

    /**
     * CreateCustomer
     *
     * Creates a new customer for a business, which can have associated cards on file.  You must provide __at least one__ of the following values in your request to this endpoint:  - &#x60;given_name&#x60; - &#x60;family_name&#x60; - &#x60;company_name&#x60; - &#x60;email_address&#x60; - &#x60;phone_number&#x60;  This endpoint does not accept an idempotency key. If you accidentally create a duplicate customer, you can delete it with the [DeleteCustomer](#endpoint-deletecustomer) endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomerTest() throws ApiException {
        CreateCustomerRequest body = new CreateCustomerRequest()
            .givenName("Amelia")
            .familyName("Earhart")
            .emailAddress("Amelia.Earhart@example.com")
            .address(new Address()
                .addressLine1("500 Electric Ave")
                .addressLine2("Suite 600")
                .locality("New York")
                .administrativeDistrictLevel1("NY")
                .postalCode("20003")
                .country(Address.CountryEnum.US)
            )
            .phoneNumber("1-555-555-0122")
            .referenceId("YOUR_REFERENCE_ID")
            .note("a customer");

        CreateCustomerResponse response = api.createCustomer(body);

        assertTrue(response.getErrors().isEmpty());
        assertNotNull(response.getCustomer().getId());
    }
    
    /**
     * CreateCustomerCard
     *
     * Adds a card on file to an existing customer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomerCardTest() throws ApiException {
        Customer customer = api.createCustomer(new CreateCustomerRequest()
            .givenName("Amelia")
            .familyName("Earhart")
            .emailAddress("Amelia.Earhart@example.com")).getCustomer();

        String cardNonce = "fake-card-nonce-ok";

        CreateCustomerCardRequest body = new CreateCustomerCardRequest()
            .cardNonce(cardNonce)
            .billingAddress(new Address()
                .addressLine1("500 Electric Ave")
                .addressLine2("Suite 600")
                .locality("New York")
                .administrativeDistrictLevel1("NY")
                .postalCode("94103")
                .country(Address.CountryEnum.US))
            .cardholderName("Amelia Earhart");

        CreateCustomerCardResponse response = api.createCustomerCard(customer.getId(), body);

        assertTrue(response.getErrors().isEmpty());
        assertNotNull(response.getCard().getId());
    }
    
    /**
     * DeleteCustomer
     *
     * Deletes a customer from a business, along with any linked cards on file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerTest() throws ApiException {
        Customer customer = api.createCustomer(new CreateCustomerRequest()
            .givenName("Amelia")
            .familyName("Earhart")
            .emailAddress("Amelia.Earhart@example.com")).getCustomer();

        DeleteCustomerResponse response = api.deleteCustomer(customer.getId());

        assertTrue(response.getErrors().isEmpty());
    }
    
    /**
     * DeleteCustomerCard
     *
     * Removes a card on file from a customer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerCardTest() throws ApiException {
        Customer customer = api.createCustomer(new CreateCustomerRequest()
            .givenName("Amelia")
            .familyName("Earhart")
            .emailAddress("Amelia.Earhart@example.com")).getCustomer();

        String cardNonce = "fake-card-nonce-ok";

        CreateCustomerCardRequest body = new CreateCustomerCardRequest()
            .cardNonce(cardNonce)
            .billingAddress(new Address()
                .addressLine1("500 Electric Ave")
                .addressLine2("Suite 600")
                .locality("New York")
                .administrativeDistrictLevel1("NY")
                .postalCode("94103")
                .country(Address.CountryEnum.US))
            .cardholderName("Amelia Earhart");

        Card card =
            api.createCustomerCard(customer.getId(), body).getCard();

        DeleteCustomerCardResponse response = api.deleteCustomerCard(customer.getId(), card.getId());

        assertTrue(response.getErrors().isEmpty());
    }
    
    /**
     * ListCustomers
     *
     * Lists a business&#39;s customers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCustomersTest() throws ApiException {
        String cursor = null;
        ListCustomersResponse response = api.listCustomers(cursor, null, null);

        // TODO: test validations
    }
    
    /**
     * RetrieveCustomer
     *
     * Returns details for a single customer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveCustomerTest() throws ApiException {
        Customer customer = api.createCustomer(new CreateCustomerRequest()
            .givenName("Amelia")
            .familyName("Earhart")
            .emailAddress("Amelia.Earhart@example.com")).getCustomer();

        RetrieveCustomerResponse response = api.retrieveCustomer(customer.getId());

        assertTrue(response.getErrors().isEmpty());
        assertEquals(customer.getId(), response.getCustomer().getId());
    }
    
    /**
     * UpdateCustomer
     *
     * Updates the details of an existing customer.  You cannot edit a customer&#39;s cards on file with this endpoint. To make changes to a card on file, you must delete the existing card on file with the [DeleteCustomerCard](#endpoint-deletecustomercard) endpoint, then create a new one with the [CreateCustomerCard](#endpoint-createcustomercard) endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerTest() throws ApiException {
        Customer customer = api.createCustomer(new CreateCustomerRequest()
            .givenName("Amelia")
            .familyName("Earhart")
            .emailAddress("Amelia.Earhart@example.com")).getCustomer();

        UpdateCustomerRequest body = new UpdateCustomerRequest()
            .phoneNumber("1-555-555-0123")
            .emailAddress("New.Amelia.Earhart@example.com")
            .note("updated customer note");
        UpdateCustomerResponse response = api.updateCustomer(customer.getId(), body);

        assertTrue(response.getErrors().isEmpty());
        assertEquals("New.Amelia.Earhart@example.com", response.getCustomer().getEmailAddress());
    }
    
}
