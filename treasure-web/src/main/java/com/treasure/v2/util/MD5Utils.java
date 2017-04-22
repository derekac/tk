package com.treasure.v2.util;

import org.apache.commons.lang.StringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by derek on 16/5/1.
 */
public class MD5Utils {
    public MD5Utils() {
    }

    public static String md5(String key) {
        String md5       = null;
        char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        if (StringUtils.isEmpty(key)) {
            return "";
        } else {
            byte[] defaultBytes = key.getBytes();

            try {
                MessageDigest nsae = MessageDigest.getInstance("MD5");
                nsae.reset();
                nsae.update(defaultBytes);
                byte[] messageDigest = nsae.digest();
                char[] str           = new char[32];
                int    k             = 0;

                for (int i = 0; i < 16; ++i) {
                    byte byte0 = messageDigest[i];
                    str[k++] = hexDigits[byte0 >>> 4 & 15];
                    str[k++] = hexDigits[byte0 & 15];
                }

                md5 = new String(str);
            } catch (NoSuchAlgorithmException var10) {
                var10.printStackTrace();
            }

            return md5;
        }
    }
}