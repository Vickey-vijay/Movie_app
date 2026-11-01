package com.bykv.vk.openvk.ouw.ouw.ouw.ra;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public class vt {
    private static final MessageDigest ouw = ouw();
    private static final char[] vt = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private vt() {
    }

    private static MessageDigest ouw() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String ouw(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = ouw;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (vt.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        if (bArrDigest == null || bArrDigest.length == 0) {
            return null;
        }
        char[] cArr = new char[bArrDigest.length << 1];
        int i10 = 0;
        for (byte b10 : bArrDigest) {
            int i11 = i10 + 1;
            char[] cArr2 = vt;
            cArr[i10] = cArr2[(b10 & 240) >> 4];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
