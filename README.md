# ATM server

This is the REST Client for consuming the [APIs](https://visioncraft.atlassian.net/wiki/spaces/ATM/pages/22085633/Headless+wallet+services),
to be used in the [ATM server](https://github.com/GENERALBYTESCOM/batm_public).


### Setup

Install Java and maven.
Clone the repository, go to the project folder and run - 


```
mvn clean install
```

This is create the target folder, and the jar file dagcoin-rest-client-0.0.1.jar inside this.
This jar can now be placed in any Java project to access the REST Client.
This will also run the test cases for all the available functionalities.
The test cases are written to test the actual services. 
So if the services are down, test cases will fail.


### Run

```
java -jar target/dagcoin-rest-client-0.0.1.jar
```

### Configuration

The configuration, such as encryption key, URL, can be changed in the file -

```
src/main/resources/config.properties 
```

### Usage


It exposes the following methods, that can be accessed by creating DagCoinApiClientService's object:

1. getExchangeRate
2. validateWalletAddress
3. getBalance
4. makeTransaction

### Security

HMAC API security has been implemented for all the REST APIs.

AES-128-CBC algorithm has been implemented for encrypting the request/response of the REST APIs that -

1. Check wallet balance
2. Make wallet transaction
