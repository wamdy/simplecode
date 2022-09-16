package com.wamdy.jacocotest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JacocoUtilTest {

    @Test
    void sum() {
        Assertions.assertEquals(3,JacocoUtil.sum(1, 2));
    }
}