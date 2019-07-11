package com.yashkhade;

import java.security.MessageDigest;


public class StringUtil {
    /* Applies Sha256 to string and returns a has. */
    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            /* Applies Sha256 to our input */
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte elem:)
        }
    }


}
