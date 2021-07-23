package com.epam.spring.core.beansIFace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewBean {

    MyInterface bean1;
    MyInterface bean2;
    MyInterface bean3;

    @Autowired
    public void setBean1(MyInterface bean1) {
        this.bean1 = bean1;
    }

    @Autowired
    public void setBean2(@Qualifier("beanIFaceB") MyInterface bean2) {
        this.bean2 = bean2;
    }

    @Autowired
    public void setBean3(@Qualifier("beanIFaceA") MyInterface bean3) {
        this.bean3 = bean3;
    }
}
