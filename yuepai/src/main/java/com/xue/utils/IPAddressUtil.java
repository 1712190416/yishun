package com.xue.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressUtil {
    public static String getLocalIp(){
        try {
            InetAddress addr = InetAddress.getLocalHost();
            return  "http://"+ addr.getHostAddress() +":8080/";
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "null";
    }
}
