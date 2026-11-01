package com.yk.e.util;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class AES256 {
    private static final String AES_CBC_PADDING = "AES/CBC/PKCS5Padding";
    private static final String ALGORITHM = "AES";

    public static String decode(String str, String str2, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr));
            return new String(cipher.doFinal(Base64.decode(str2, 2)), StandardCharsets.UTF_8);
        } catch (Exception e10) {
            AdLog.e("AES256 decode err, msg = " + e10.getMessage(), e10);
            return "";
        }
    }

    public static String encode(String str, String str2, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
            return Base64.encodeToString(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)), 2);
        } catch (Exception e10) {
            AdLog.e("AES256 encode err, msg = " + e10.getMessage(), e10);
            return null;
        }
    }
}
