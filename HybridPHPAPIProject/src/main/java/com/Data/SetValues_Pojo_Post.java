package com.Data;

import com.POJO.PojoClass;

public class SetValues_Pojo_Post
{
    public PojoClass setValues()
    {
        PojoClass pc = new PojoClass();
        pc.setTitle("QA ");
        pc.setBody("BDD ");
        pc.setAuthor("---");
        return pc;

    }

    public PojoClass setValues(String title, String body, String author)
    {
        PojoClass p = new PojoClass();
        p.setTitle(title);
        p.setBody(body);
        p.setAuthor(author);
        return p;
    }

}
