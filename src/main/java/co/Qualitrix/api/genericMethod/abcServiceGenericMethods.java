package co.Qualitrix.api.genericMethod;

import co.Qualitrix.api.config.Constants;
import co.Qualitrix.api.helper.RequestGenerator;
import co.Qualitrix.api.helper.RestBaseClass;
import com.google.gson.JsonObject;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//These class will contains all the generic methods which will be used in tests in different requirements.
public class abcServiceGenericMethods extends RestBaseClass implements Constants {
    RequestGenerator requestGenerator = new RequestGenerator();
    Map<String, String> headers = new HashMap<>();
    Map<String, String> pathParam = new HashMap<>();
/*    SignUpRequest_Service signUpRequest_service = new SignUpRequest_Service();

    *//**
     * createUser method is going to return userId and passcode which is required
     * for deleteUseraccount metod test
     *
     * @author Binayak
     **//*

    public Response createUser() {
        SignUpRequest singupPayload = signUpRequest_service.signUpService();
        Response response = requestGenerator.getRequest(ACCOUNT_SERVICE, singupPayload.toString()).when().post(SIGNUP)
                .then().statusCode(200).extract().response();
        System.out.println(response.asString());
        return response;
    }

    *//**
     * getUser method is going to return whether userId is deleted
     *
     * @author Binayak
     **//*
    public Response getUser(String userId) {
        pathParam.put("userId", userId);
        Response response = requestGenerator.getRequest(headers, USER_SERVICE, pathParam).when().get(GET_USER_DETAILS)
                .then().statusCode(200).extract().response();
        System.out.println(response);
        return response;
    }

    *//**
     * getOtp method is going to call AWS Dynamo DB-"verification" table and return
     * OTP
     *
     * @author Binayak
     **//*

    public String getOtp(String userId) {
        JsonObject otpMap = AWSDBOperations.getItem(DBTableNames.VERIFICATION.getTableName(),
                DBTableNames.VERIFICATION.getpKey(), userId);
        String otp = otpMap.get("code").toString();
        String finalOtp = otp.replaceAll("[^0-9]", "");
        return finalOtp;
    }

    *//**
     * getAccountIds method is getting the list of unselected ids of user while editing account
     *
     *
     * @author Binayak
     **//*

    public static ArrayList<String> getUnSelectedIdsList(Map<String, String> testData) {
        ArrayList<String> unSelectedIdList = new ArrayList<String>();

        try {
            if (testData.containsKey("unSelectedIds") && !testData.get("unSelectedIds").isEmpty()) {
                String unSelectedId[] = testData.get("unSelectedIds").split(",");
                for (int i = 0; i < unSelectedId.length; i++) {
                    unSelectedIdList.add(unSelectedId[i]);
                }
            }
        } catch (Exception e) {
        }
        return unSelectedIdList;
    }*/
}
