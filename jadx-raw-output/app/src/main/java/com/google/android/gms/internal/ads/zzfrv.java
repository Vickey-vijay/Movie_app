package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfrv implements Runnable {
    public final /* synthetic */ zzfsa zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzfsa zzfsaVar = this.zza;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzfrfVarZzI = zzfsaVar.zzI();
            Clock clockZzJ = zzfsaVar.zzJ();
            zzfrfVarZzI.zzj(clockZzJ.currentTimeMillis(), zzfsaVar.zzK(), zzfsaVar.zze.zzd, zzfsaVar.zzH());
        }
    }

    public zzfrv(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }
}
