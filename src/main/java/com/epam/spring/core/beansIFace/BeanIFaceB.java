package com.epam.spring.core.beansIFace;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BeanIFaceB implements MyInterface {
}
