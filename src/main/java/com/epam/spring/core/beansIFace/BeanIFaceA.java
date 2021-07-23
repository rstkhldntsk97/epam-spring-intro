package com.epam.spring.core.beansIFace;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Primary
@Order(3)
public class BeanIFaceA implements MyInterface {
}
