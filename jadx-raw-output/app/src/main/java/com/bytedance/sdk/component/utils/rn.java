package com.bytedance.sdk.component.utils;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class rn {
    private static final char[] ouw = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String ouw(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes("UTF-8"));
                    byte[] bArrDigest = messageDigest.digest();
                    if (bArrDigest != null) {
                        return ouw(bArrDigest, bArrDigest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static String ouw(byte[] bArr, int i10) {
        if (bArr != null) {
            if (i10 + 0 <= bArr.length) {
                int i11 = i10 * 2;
                char[] cArr = new char[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    int i14 = bArr[i13 + 0] & 255;
                    int i15 = i12 + 1;
                    char[] cArr2 = ouw;
                    cArr[i12] = cArr2[i14 >> 4];
                    i12 = i15 + 1;
                    cArr[i15] = cArr2[i14 & 15];
                }
                return new String(cArr, 0, i11);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
