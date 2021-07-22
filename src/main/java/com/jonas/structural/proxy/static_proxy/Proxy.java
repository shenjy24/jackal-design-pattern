package com.jonas.structural.proxy.static_proxy;

public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (null == realSubject) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    private void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
