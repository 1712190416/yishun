package com.xue.utils;

import java.util.Arrays;
import java.util.List;

public class AddressTransferUtil {
    public static List<String> addressTrans(String url){
        String[] urls = url.split(";");
        for (int i = 0; i < urls.length; i++) {
            urls[i]=IPAddressUtil.getLocalIp()+urls[i];
        }
        return Arrays.asList(urls);
    }
}
