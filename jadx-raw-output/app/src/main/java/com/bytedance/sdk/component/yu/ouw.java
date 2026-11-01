package com.bytedance.sdk.component.yu;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.utils.ko;
import com.ironsource.G5;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw {
    private static String ouw;

    public static String ouw(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(ouw)) {
                ouw = ouw(AESEncrypter.DEFAULT_ALGORITHM);
            }
            Cipher cipher = Cipher.getInstance(ouw);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes(G5.N)), 0);
        } catch (Throwable th2) {
            ko.vt(th2.getMessage());
            return null;
        }
    }

    public static String vt(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return new String(cipher.doFinal(bArrDecode));
        } catch (Throwable th2) {
            ko.yu(th2.getMessage());
            return null;
        }
    }

    public static String ouw(String str, String str2, String str3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(G5.N)), 0);
        } catch (Throwable th2) {
            ko.yu(th2.getMessage());
            return null;
        }
    }

    public static String vt(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(ouw)) {
                ouw = ouw(AESEncrypter.DEFAULT_ALGORITHM);
            }
            Cipher cipher = Cipher.getInstance(ouw);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static String ouw(String str) {
        int[] iArr = new int[str.length()];
        iArr[4] = 6;
        iArr[5] = 1;
        iArr[6] = 1;
        return new String(ouw(str.getBytes(), iArr));
    }

    private static byte[] ouw(byte[] bArr, int[] iArr) {
        if (bArr == null || bArr.length == 0 || iArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = (byte) (bArr[i10] ^ iArr[i10 % iArr.length]);
        }
        return bArr2;
    }
}
