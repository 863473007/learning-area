package com.hef.wiring.runtimeplaceholder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/runtimeplaceholder/placeholder.xml")
public class BlankDiscTest {

    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void blankDiscShouldNotNull(){
        Assert.assertNotNull(blankDisc);
    }


    @Test
    public void playtest(){
        blankDisc.play();
    }
}
