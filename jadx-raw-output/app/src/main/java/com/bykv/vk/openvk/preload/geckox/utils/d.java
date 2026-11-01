package com.bykv.vk.openvk.preload.geckox.utils;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: compiled from: MD5Utils.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f10726a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws Exception {
        if (str == null) {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = inputStream.read(bArr, 0, 4096);
                        if (i10 == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i10);
                        }
                    }
                    CloseableUtils.close(inputStream);
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        String strA = a(bArrDigest, bArrDigest.length);
                        if (str.equals(strA)) {
                            return;
                        }
                        throw new RuntimeException("md5 check failed file: local md5:" + strA + " expect md5:" + str);
                    } catch (Exception e10) {
                        throw new RuntimeException("md5 check failed:" + e10.getMessage(), e10);
                    }
                } catch (Throwable th2) {
                    CloseableUtils.close(inputStream);
                    throw th2;
                }
            } catch (Exception e11) {
                throw new RuntimeException("md5 check failed:" + e11.getMessage(), e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("md5 check failed:" + e12.getMessage(), e12);
        }
    }

    private static String a(byte[] bArr, int i10) {
        if (bArr != null) {
            if (i10 <= bArr.length) {
                int i11 = i10 << 1;
                char[] cArr = new char[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    int i14 = bArr[i13] & 255;
                    int i15 = i12 + 1;
                    char[] cArr2 = f10726a;
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
