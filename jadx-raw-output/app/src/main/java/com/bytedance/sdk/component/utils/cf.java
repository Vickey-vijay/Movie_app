package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class cf {
    private static final byte[] ouw = ouw("VP8X");

    private static byte[] ouw(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean ouw(byte[] bArr) {
        boolean z10;
        try {
            byte[] bArr2 = ouw;
            if (bArr2 != null && bArr != null && bArr2.length + 12 <= bArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= bArr2.length) {
                        z10 = true;
                        break;
                    }
                    if (bArr[i10 + 12] != bArr2[i10]) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            } else {
                z10 = false;
                break;
            }
            if (bArr.length <= 20) {
                return false;
            }
            return z10 && ((bArr[20] & 2) == 2);
        } catch (Throwable th2) {
            ko.ouw("ImageLoadUtils", th2);
            return false;
        }
    }
}
