package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgzc extends zzgyq {
    private zzgzb zza;

    public zzgzc(zzgub zzgubVar, boolean z10, Executor executor, Callable callable) {
        super(zzgubVar, z10, false);
        this.zza = new zzgza(this, callable, executor);
        zze();
    }

    public final /* synthetic */ void zzD(zzgzb zzgzbVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzw(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzi() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzx() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzA(int i10) {
        super.zzA(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }
}
