package com.safedk.android.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44902a = "GzipUtil";

    public static String a(byte[] bArr) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        String string;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Cannot unzip null or empty bytes");
        }
        Logger.d(f44902a, "unzip started, input size is " + bArr.length);
        if (!b(bArr)) {
            Logger.d(f44902a, "unzip started, input is not compressed");
            return new String(bArr);
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    inputStreamReader = new InputStreamReader(gZIPInputStream, "UTF-8");
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb2.append(line);
                            }
                            Logger.d(f44902a, "unzip started, output size is " + sb2.length());
                            string = sb2.toString();
                        } catch (IOException e10) {
                            e = e10;
                            Logger.d(f44902a, "Exception in unzip: " + e.getMessage());
                            string = null;
                        } catch (Throwable th2) {
                            th = th2;
                            Logger.d(f44902a, "Exception in unzip: " + th.getMessage());
                            string = null;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                    }
                } catch (IOException e12) {
                    e = e12;
                    bufferedReader = null;
                    inputStreamReader = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                    inputStreamReader = null;
                }
            } catch (IOException e13) {
                e = e13;
                bufferedReader = null;
                inputStreamReader = null;
                gZIPInputStream = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                inputStreamReader = null;
                gZIPInputStream = null;
            }
        } catch (IOException e14) {
            e = e14;
            bufferedReader = null;
            inputStreamReader = null;
            gZIPInputStream = null;
            byteArrayInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            inputStreamReader = null;
            gZIPInputStream = null;
            byteArrayInputStream = null;
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e15) {
                Logger.d(f44902a, "Exception in unzip finally block: " + e15.getMessage());
                return string;
            }
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (gZIPInputStream != null) {
            gZIPInputStream.close();
        }
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
            return string;
        }
        return string;
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        int[] iArrC = c(bArr2);
        int i11 = 0;
        while (true) {
            int i12 = i10;
            if (i11 < bArr.length) {
                i10 = i12;
                while (i10 > 0 && bArr2[i10] != bArr[i11]) {
                    i10 = iArrC[i10 - 1];
                }
                if (bArr2[i10] == bArr[i11]) {
                    i10++;
                }
                if (i10 != bArr2.length) {
                    i11++;
                } else {
                    return (i11 - bArr2.length) + 1;
                }
            } else {
                return -1;
            }
        }
    }

    private static int[] c(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i10 = 0;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            while (i10 > 0 && bArr[i10] != bArr[i11]) {
                i10 = iArr[i10 - 1];
            }
            if (bArr[i10] == bArr[i11]) {
                i10++;
            }
            iArr[i11] = i10;
        }
        return iArr;
    }

    public static boolean b(byte[] bArr) {
        return bArr[0] == 31 && bArr[1] == -117;
    }
}
