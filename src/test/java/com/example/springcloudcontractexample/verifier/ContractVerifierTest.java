package com.example.springcloudcontractexample.verifier;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles("test")
public class ContractVerifierTest {

    @Value("${server.port}")
    private String port;


    @BeforeEach
    public void setup() {
        RestAssured.port = Integer.parseInt(port);
//
//      RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
//      requestSpecBuilder.setConfig(RestAssured.config().encoderConfig(encoderConfig().encodeContentTypeAs("application/qris", ContentType.TEXT)));
//      RestAssured.requestSpecification = requestSpecBuilder.build();

    }

}
