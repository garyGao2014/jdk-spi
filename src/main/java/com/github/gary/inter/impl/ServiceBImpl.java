package com.github.gary.inter.impl;

import com.github.gary.inter.IService;

/**
 * Created by gaozhicheng on 2018/1/19 0019.
 */
public class ServiceBImpl implements IService{
    public String getStr(){
        return this.getClass().getSimpleName();
    }
}
