package com.epam.spring.core.beansIFace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BeanCollection {

    @Autowired
    List<MyInterface> list;

    public List<MyInterface> getList() {
        return list;
    }
}
