package com.Data;

import com.POJO.PojoClass;

public class SetValues_Pojo_Delete
{
    public PojoClass deleteValues()
    {
        PojoClass pc = new PojoClass();
        pc.setId("58");

        return pc;

    }

    public PojoClass deleteValues(String id)
    {
        PojoClass pc = new PojoClass();
        pc.setId(id);

        return pc;

    }
}
