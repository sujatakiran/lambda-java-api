package com.training.aws.lambda_java_api;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaJavaAPI implements RequestHandler<Object, GatewayResponse> {

    public GatewayResponse handleRequest(Object object, Context context) {

        String message = "Hello from application";
        System.out.println(message);

        GatewayResponse response = new GatewayResponse(
                message,
                200,
                Collections.singletonMap("X-Powered-By", "TechPrimers"),
                false
        );
        return response;
    }
}
