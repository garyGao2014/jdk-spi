package com.github.gary;

import com.github.gary.inter.IService;

import java.util.Iterator;
import java.util.ServiceLoader;


public class Main{
    public static void main(String[] args){
        ServiceLoader<IService> loader = ServiceLoader.load(IService.class);
        Iterator<IService> iterator=loader.iterator();
        while(iterator.hasNext()){
            IService next=iterator.next();
            System.out.println(next.getStr());
        }
    }
}
