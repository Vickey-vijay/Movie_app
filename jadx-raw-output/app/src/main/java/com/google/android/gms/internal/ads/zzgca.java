package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgca {
    private static zzgxa zzc(boolean z10) {
        return z10 ? zzgxa.zzm().zzh() : zzgxa.zzl();
    }

    public static String zza(byte[] bArr, boolean z10) {
        return zzc(z10).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z10) throws IllegalArgumentException {
        byte[] bArrZzk = zzc(z10).zzk(str);
        if (bArrZzk.length == 0 && str.length() > 0) {
            throw new IllegalArgumentException("Unable to decode ".concat(str));
        }
        return bArrZzk;
    }
}
