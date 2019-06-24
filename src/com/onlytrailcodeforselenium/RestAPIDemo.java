package com.onlytrailcodeforselenium;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAPIDemo {

	public static void main(String[] args) {


         Response response=RestAssured.get("https://reqres.in/api/users/2");
         int code=response.getStatusCode();
         Assert.assertEquals(200, code);

	}

}
