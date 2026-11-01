package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzxn implements zzyc {
    public final /* synthetic */ zzxq zza;
    private final int zzb;

    public final /* synthetic */ int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() throws IOException {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i10) {
        return this.zza.zzs(this.zzb, zzlhVar, zzihVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j10) {
        return this.zza.zzt(this.zzb, j10);
    }

    public zzxn(zzxq zzxqVar, int i10) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzb = i10;
    }
}
