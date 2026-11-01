package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzche extends zzatf {
    public static final zzche zzb = new zzche();

    @Override // com.google.android.gms.internal.ads.zzatf
    public final zzatj zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzatl();
        }
        return "mvhd".equals(str) ? new zzatm() : new zzatn(str);
    }
}
