![Square logo]

# Square Connect Java SDK - RETIRED

---

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.squareup/connect/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.squareup/connect)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)
==================

## NOTICE: Square Connect Java SDK retired

The Square Connect Java SDK is retired (EOL) as of 2019-12-17 and will no longer
receive bug fixes or product updates. To continue receiving API and SDK
improvements, please follow the instructions below to migrate to the new
[Square Java SDK](https://github.com/square/square-java-sdk).


The old Connect SDK documentation is available under the
[`/docs` folder](./docs/README.md).

<br/>

---

* [Migrate to the Square Java SDK](#migrate-to-the-square-java-sdk)
  * [Update your project](#update-your-project)
  * [Update your code](#update-your-code)
* [Example code migration](#example-code-migration)
* [Ask the Community](#ask-the-community)

---

<br/>

## Migrate to the Square Java SDK

Follow the instructions below to migrate your apps from the deprecated
`com.squareup.connect` library to the new `com.squareup.square` library.

### Update your project

Update the dependency in your Maven or Gradle project.

#### Update Maven

Update the Square dependency in the POM for your project:

```
<dependency>
    <groupId>com.squareup</groupId>
    <artifactId>square</artifactId>
    <version>4.0.0.20191217</version>
    <scope>compile</scope>
</dependency>
```

#### Update Gradle

Replace the `com.squareup.connect` dependency in the build file of your project:

```
implementation "com.squareup:square:4.0.0.20191217"
```

### Update your code

1. Change all instances of `import com.squareup.connect'` to `import com.squareup.square`.
1. Update client instantiation to follow the method outlined below.
1. Use `thenAccept` and `exceptionally` rather than `try` and `catch` for flow control.


To simplify your code, we also recommend that you use method chaining to access
APIs instead of explicitly instantiating multiple clients.

#### Client instantiation

```java
import com.squareup.square.SquareClient;
import com.squareup.square.Environment;

SquareClient square = new SquareClient.Builder()
    .environment(Environment.SANDBOX)
    .accessToken("YOUR_SANDBOX_ACCESS_TOKEN")
    .build();
```

#### Accessing response data
Using listLocations as an example
```java
square.getLocationsApi().listLocationsAsync().thenAccept(result -> {
    // Business logic
    }).exceptionally(exception -> {
    // Exception handling
    return null;
});
```

<br/>

---

<br/>

## Example code migration

As a specific example, consider the code used to create a new customer
profile with the following `CreateCustomerRequest` object:

```java
Address bodyAddress = new Address.Builder()
    .addressLine1("500 Electric Ave")
    .addressLine2("Suite 600")
    .locality("New York")
    .administrativeDistrictLevel1("NY")
    .postalCode("10003")
    .country("US")
    .build();

CreateCustomerRequest body = new CreateCustomerRequest.Builder()
    .givenName("Amelia")
    .familyName("Earhart")
    .emailAddress("Amelia.Earhart@example.com")
    .address(bodyAddress)
    .phoneNumber("1-212-555-4240")
    .referenceId("YOUR_REFERENCE_ID")
    .note("a customer")
    .build();
```

With the deprecated `squareup.connect` library, this is how you instantiate a client
for the Customers API, format the request, and call the endpoint:

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
CustomersApi customersApi = new CustomersApi();

try {
    CreateCustomerResponse result = customersApi.createCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi.createCustomer");
    e.printStackTrace();
}
```

Now consider equivalent code using the new `squareup.square` library:

```java
// Instantiate the client
SquareClient square = new SquareClient.Builder()
    .environment(Environment.SANDBOX)
    .accessToken("YOUR_SANDBOX_ACCESS_TOKEN")
    .build();

// Call the endpoint
square.getCustomersApi().createCustomerAsync(body).thenAccept(result -> {
    System.out.println("Successfully created customer with id:"+ result.getCustomer().getId());
}).exceptionally(e -> {
    System.err.println("Exception when calling CustomersApi.createCustomer");
    e.printStackTrace();
    return null;
});
```

That's it!

What was once a multi-object process can be handled asynchronously with a single
client. Migrating to the `com.squareup.square` library reduces boilerplate and lets
you focus on the parts of your code that really matter.


<br/>

---

<br/>


## Ask the community

Please join us in our [Square developer community] if you have any questions!


[//]: # "Link anchor definitions"
[Square Logo]: https://docs.connect.squareup.com/images/github/github-square-logo.svg
[Square Java SDK]: https://github.com/square/square-java-sdk
[Square developer community]: https://squ.re/slack
