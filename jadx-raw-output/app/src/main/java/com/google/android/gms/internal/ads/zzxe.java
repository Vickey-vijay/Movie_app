package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzxe extends zzafj {
    public final /* synthetic */ zzxq zza;

    @Override // com.google.android.gms.internal.ads.zzafj, com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza.zzQ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxe(zzxq zzxqVar, zzafy zzafyVar) {
        super(zzafyVar);
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
    }
}
