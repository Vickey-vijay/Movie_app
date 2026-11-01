package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgcj implements zzgcd {
    private final int zza;
    private final byte[] zzb;

    public zzgcj(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
