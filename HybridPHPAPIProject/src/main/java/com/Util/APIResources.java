package com.Util;

public enum APIResources
{
 postapi("api/insert.php"),
 putapi("api/update.php"),
 deleteapi("api/delete.php"),
 getapi("api/read.php"),
 getapiid("api/read.php?id=1");
    private String resource;

    APIResources(String resource)
    {
        this.resource = resource;

    }

    public String getResource()
    {
        return resource;
    }
}
