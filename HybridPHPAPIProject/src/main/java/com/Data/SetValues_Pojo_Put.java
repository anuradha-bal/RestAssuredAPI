package com.Data;

import com.POJO.PojoClass;

public class SetValues_Pojo_Put
{
    public PojoClass putValues()
    {

        PojoClass pc = new PojoClass();
        pc.setId("47");
        pc.setTitle("QA Manual Tester");
        pc.setBody("BDD Framework");
        pc.setAuthor("Admin A");
        return pc;

    }

    public PojoClass putValues(String id, String author)
    {

        PojoClass pc = new PojoClass();
        pc.setId(id);
        pc.setAuthor(author);
        return pc;

    }
}
