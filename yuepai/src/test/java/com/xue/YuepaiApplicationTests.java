package com.xue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootTest
class YuepaiApplicationTests {
    public static void main(String[] args) {
        String abc = new String("abc");
        String abcd="abc";
        System.out.println(abc.equals(abcd));
    }

    @Test
    void contextLoads() {

    }

}
