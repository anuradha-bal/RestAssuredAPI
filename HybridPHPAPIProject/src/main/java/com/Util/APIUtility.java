package com.Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class APIUtility
{

    public RequestSpecification requestdetails() throws IOException
    {
        PrintStream log = new PrintStream(new FileOutputStream("logdetails.txt"));
        RequestSpecification request = (RequestSpecification) new RequestSpecBuilder().setBaseUri(getConfigvalues("baseuri"))
                                                                                      .addFilter(RequestLoggingFilter.logRequestTo(log))
                                                                                      .addFilter(ResponseLoggingFilter.logResponseTo(log))
                                                                                      .setContentType(ContentType.JSON)
                                                                                      .build();
        return request;
    }

    public static String getConfigvalues(String key) throws IOException
    {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/Properties/Config.properties");
        prop.load(fis);
        return prop.getProperty(key);
    }

}