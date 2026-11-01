package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhja {
    public static zzhyl zzb(String str) throws IOException {
        try {
            zzhzq zzhzqVar = new zzhzq(new StringReader(str));
            zzhzqVar.zza(zzhyq.LEGACY_STRICT);
            return zzhiy.zzb(zzhzqVar);
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhiz) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }

    public static boolean zza(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            i10++;
            if (Character.isSurrogate(cCharAt)) {
                if (Character.isLowSurrogate(cCharAt) || i10 == length || !Character.isLowSurrogate(str.charAt(i10))) {
                    return false;
                }
                i10++;
            }
        }
        return true;
    }
}
