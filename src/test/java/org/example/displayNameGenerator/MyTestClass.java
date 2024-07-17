package org.example.displayNameGenerator;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(CustomDisplayNameGenerator.class)
public class MyTestClass {

    @Test
    public void addition(){
        Assert.assertEquals(4,3+1);
    }
    @Test
    public void subtraction(){
        Assert.assertEquals(34,35-1);
    }


}
