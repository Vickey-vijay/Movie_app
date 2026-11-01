package com.inmobi.media;

import android.util.Base64;
import android.util.Log;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public abstract class X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23782a = 0;

    public static byte[] a(String str) {
        int i10;
        if (str != null) {
            int length = str.length() % 4;
            i10 = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i10 = 0;
        }
        String strValueOf = String.valueOf(str != null ? lk.c0.v1(str).toString() : null);
        for (int i11 = 0; i11 < i10; i11++) {
            strValueOf = ((Object) strValueOf) + "=";
        }
        byte[] bytes = strValueOf.getBytes(lk.c.f63591b);
        ck.p.i(bytes, "getBytes(...)");
        return Base64.decode(bytes, 2);
    }

    public static String a(String str, byte[] bArr) {
        byte[] bArrDoFinal;
        ck.p.j(str, "data");
        ck.p.i("X5", "TAG");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            ck.p.i(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = str.getBytes(lk.c.f63591b);
            ck.p.i(bytes, "getBytes(...)");
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Throwable th2) {
            Log.d("X5", "SDK encountered unexpected error in getting encrypted AES bytes; " + th2.getMessage());
            bArrDoFinal = null;
        }
        byte[] bArrEncode = Base64.encode(bArrDoFinal, 2);
        ck.p.i(bArrEncode, "encode(...)");
        String str2 = new String(bArrEncode, lk.c.f63591b);
        ck.p.i("X5", "TAG");
        return str2;
    }
}
