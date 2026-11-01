package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzieo {
    public final boolean zza(byte[] bArr, int i10, int i11) {
        return zzb(0, bArr, i10, i11) == 0;
    }

    public abstract int zzb(int i10, byte[] bArr, int i11, int i12);

    public static final int zzc(String str, byte[] bArr, int i10, int i11) {
        byte[] bytes = str.getBytes(zzice.zza);
        int length = bytes.length;
        if (length - i10 > i11) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i10, length);
        return i10 + length;
    }
}
