package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgxq {
    public static long zza(double d10) {
        zzgrc.zzb(zzb(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        if (exponent == -1023) {
            return jDoubleToRawLongBits + jDoubleToRawLongBits;
        }
        return jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean zzb(double d10) {
        if (Math.getExponent(d10) <= 1023) {
            return true;
        }
        return false;
    }
}
