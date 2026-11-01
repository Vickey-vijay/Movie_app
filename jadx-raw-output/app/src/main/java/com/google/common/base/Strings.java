package com.google.common.base;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class Strings {
    public static byte[] A00;
    public static String[] A01 = {"", "rJg0GTHRX", "K9dQxfkFvyPrqanCyvVi9t8TsdGmyNgC", "tUuj0V7XDkeAi6SkgPTUgMEzqoPOG2wI", "s5Ev4BEaYYaheBbHJPARkFomt6p83FKm", "U0fqfbzQ6IMhOxnuinQg0kR", "WEAQUpFs2V4MiUsuqBnPNaxCCDrbqZTD", "9mERPiqnqMQrbOPuWUaYAoq2giX9Yyaq"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{124, 7, 85, 1, 29, 7, 16, 2, 85, 20, 66, 108, 11, 38, 46, 33, 39, 48, 31, 25, 109, ExifInterface.START_CODE, 49, 40, 40, 74, 70, 18, 122, 48, 13, 22, 16, 5, 1, 28, 26, 27, 85, 17, 0, 7, 28, 27, 18, 85, 25, 16, 27, 28, 16, 27, 1, 51, 26, 7, 24, 20, 1, 85, 19, 26, 7, 85, 38, ExifInterface.START_CODE, 40, 107, 34, ExifInterface.START_CODE, ExifInterface.START_CODE, 34, 41, 32, 107, 38, ExifInterface.START_CODE, 40, 40, ExifInterface.START_CODE, 43, 107, 39, 36, 54, 32, 107, 22, 49, 55, 44, 43, 34, 54, 59, 32, 57, 57};
    }

    static {
        A03();
    }

    public static String A01(@CheckForNull Object o10) {
        if (o10 == null) {
            return A00(94, 4, 87);
        }
        try {
            return o10.toString();
        } catch (Exception e10) {
            String str = o10.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o10));
            Logger.getLogger(A00(64, 30, 71)).log(Level.WARNING, A00(29, 35, 119) + str, (Throwable) e10);
            return A00(27, 1, 44) + str + A00(2, 7, 119) + e10.getClass().getName() + A00(28, 1, 70);
        }
    }

    public static String A02(@CheckForNull String template, @CheckForNull Object... args) {
        int i10;
        String strValueOf = String.valueOf(template);
        if (args == null) {
            args = new Object[]{A00(11, 14, 70)};
        } else {
            for (int templateStart = 0; templateStart < i; templateStart++) {
                args[templateStart] = A01(args[templateStart]);
            }
        }
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (args.length * 16));
        int i11 = 0;
        int i12 = 0;
        while (i12 < args.length && (i10 = strValueOf.indexOf(A00(9, 2, 51), i11)) != -1) {
            sb2.append((CharSequence) strValueOf, i11, i10);
            int templateStart2 = i12 + 1;
            sb2.append(args[i12]);
            i11 = i10 + 2;
            i12 = templateStart2;
        }
        sb2.append((CharSequence) strValueOf, i11, strValueOf.length());
        if (i12 < args.length) {
            sb2.append(A00(0, 2, 94));
            int i13 = i12 + 1;
            sb2.append(args[i12]);
            while (i13 < args.length) {
                sb2.append(A00(25, 2, 100));
                int templateStart3 = i13 + 1;
                sb2.append(args[i13]);
                i13 = templateStart3;
            }
            sb2.append(']');
        }
        String string = sb2.toString();
        String[] strArr = A01;
        String str = strArr[6];
        String str2 = strArr[2];
        int templateStart4 = str.charAt(10);
        int i14 = str2.charAt(10);
        if (templateStart4 == i14) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Qm2mYSTY5Rq3J9usgP1HZ6PJLyEDSebu";
        strArr2[4] = "9oyFi5AVRUYlh10JePir3xWfNUiO2b4f";
        return string;
    }
}
