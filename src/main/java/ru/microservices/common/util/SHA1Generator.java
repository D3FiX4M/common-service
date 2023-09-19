package ru.microservices.common.util;

import lombok.experimental.UtilityClass;
import ru.microservices.common.exception.GlobalError;
import ru.microservices.common.exception.GlobalException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@UtilityClass
public class SHA1Generator {

    private final static MessageDigest messageDigest;

    static {
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            throw GlobalException.of(GlobalError.PARSER_ERROR);
        }
    }

    public static String generateSHA1(String input) {
        byte[] digest = messageDigest.digest(input.getBytes());
        StringBuilder sb = new StringBuilder();

        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }

    public static Boolean verifySHA1(String input, String sha1Input) {
        return generateSHA1(input).equals(sha1Input);
    }
}
