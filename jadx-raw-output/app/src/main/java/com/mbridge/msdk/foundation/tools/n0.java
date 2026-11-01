package com.mbridge.msdk.foundation.tools;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: SameFileMD5.java */
/* JADX INFO: loaded from: classes4.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char[] f35343a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MessageDigest f35344b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f35345c = "SameFileMD5";

    public static String a(File file) throws IOException {
        if (file == null || !file.exists()) {
            return "";
        }
        RandomAccessFile randomAccessFile = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[10485760];
                while (true) {
                    int i10 = randomAccessFile2.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i10);
                }
                String strA = a(messageDigest.digest());
                try {
                    randomAccessFile2.close();
                } catch (IOException e10) {
                    q0.b(f35345c, e10.getMessage());
                }
                return strA;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                try {
                    q0.b(f35345c, th.getMessage());
                    return "";
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e11) {
                            q0.b(f35345c, e11.getMessage());
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static {
        try {
            f35344b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e10) {
            System.err.println(n0.class.getName() + "初始化失败，MessageDigest不支持MD5Util.");
            e10.printStackTrace();
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static String a(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer(i11 * 2);
        int i12 = i11 + i10;
        while (i10 < i12) {
            a(bArr[i10], stringBuffer);
            i10++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b10, StringBuffer stringBuffer) {
        char[] cArr = f35343a;
        char c10 = cArr[(b10 & 240) >> 4];
        char c11 = cArr[b10 & 15];
        stringBuffer.append(c10);
        stringBuffer.append(c11);
    }
}
