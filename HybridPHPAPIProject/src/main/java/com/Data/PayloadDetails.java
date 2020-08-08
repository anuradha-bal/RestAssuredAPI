package com.Data;

public class PayloadDetails
{
    public static String postPayLoad()
    {
        return "{\r\n" + "         \"title\": \"JEGAN\",\r\n" + "        \"body\": \"HELLO\",\r\n" + "        \"author\": \"ANU\"\r\n" + "    }";
    }

    public static String putPayLoad()
    {
        return "{\"id\":76,\r\n" + "\"author\":\"ANURADHA\",\r\n" + "\"body\": \"HELLO AJAY\"\r\n" + "}";
    }

    public static String deletePayLoad()
    {
        return "{\"id\":85}";
    }

}
