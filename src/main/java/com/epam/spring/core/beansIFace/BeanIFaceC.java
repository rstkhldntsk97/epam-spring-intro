package com.epam.spring.core.beansIFace;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BeanIFaceC implements MyInterface {
}
