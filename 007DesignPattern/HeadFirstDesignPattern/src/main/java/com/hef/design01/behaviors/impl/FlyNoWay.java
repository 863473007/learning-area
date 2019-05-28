package com.hef.design01.behaviors.impl;

import com.hef.design01.behaviors.FlyBehavior;

/**
 * @Date 2019-05-28
 * @Author lifei
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm can't fly...");
    }
}
