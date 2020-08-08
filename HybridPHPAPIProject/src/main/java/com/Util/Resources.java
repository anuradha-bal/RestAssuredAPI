package com.Util;

public class Resources
{
    String postAPI = "api/insert.php";
    String putAPI = "api/update.php";
    String deleteAPI = "api/delete.php";
    String getAPI = "api/read.php";
    String getAPIid = "api/read.php";

    public String getPostAPI()
    {
        return postAPI;
    }

    public void setPostAPI(String postAPI)
    {
        this.postAPI = postAPI;
    }

    public String getPutAPI()
    {
        return putAPI;
    }

    public void setPutAPI(String putAPI)
    {
        this.putAPI = putAPI;
    }

    public String getDeleteAPI()
    {
        return deleteAPI;
    }

    public void setDeleteAPI(String deleteAPI)
    {
        this.deleteAPI = deleteAPI;
    }

    public String getGetAPI()
    {
        return getAPI;
    }

    public void setGetAPI(String getAPI)
    {
        this.getAPI = getAPI;
    }

    public String getGetAPIid()
    {
        return getAPIid;
    }

    public void setGetAPIid(String getAPIid)
    {
        this.getAPIid = getAPIid;
    }
}
