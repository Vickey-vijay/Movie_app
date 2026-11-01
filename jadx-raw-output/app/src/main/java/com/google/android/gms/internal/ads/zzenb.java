package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzenb {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcwi zzc;
    private final zzenr zzd;
    private final zzfqg zze;
    private final zzhah zzf = zzhah.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzenc zzh;
    private zzfjc zzi;

    private final synchronized q5.i zzd(zzfir zzfirVar) {
        Iterator it = zzfirVar.zza.iterator();
        while (it.hasNext()) {
            zzekg zzekgVarZza = this.zzc.zza(zzfirVar.zzb, (String) it.next());
            if (zzekgVarZza != null && zzekgVarZza.zza(this.zzi, zzfirVar)) {
                return zzgzo.zzi(zzekgVarZza.zzb(this.zzi, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgzo.zzc(new zzecr(3));
    }

    public final synchronized q5.i zza(zzfjc zzfjcVar) {
        if (!this.zzg.getAndSet(true)) {
            List list = zzfjcVar.zzb.zza;
            if (list.isEmpty()) {
                this.zzf.zzb(new zzenv(3, zzeny.zzb(zzfjcVar)));
            } else {
                this.zzi = zzfjcVar;
                zzenr zzenrVar = this.zzd;
                this.zzh = new zzenc(zzfjcVar, zzenrVar, this.zzf);
                zzenrVar.zzc(list);
                zzfir zzfirVarZza = this.zzh.zza();
                while (zzfirVarZza != null) {
                    zzb(zzfirVarZza);
                    zzfirVarZza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }

    public final /* synthetic */ zzenc zzc() {
        return this.zzh;
    }

    public zzenb(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcwi zzcwiVar, zzenr zzenrVar, zzfqg zzfqgVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcwiVar;
        this.zzd = zzenrVar;
        this.zze = zzfqgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(@Nullable zzfir zzfirVar) {
        q5.i iVarZzd = zzd(zzfirVar);
        this.zzd.zze(this.zzi, zzfirVar, iVarZzd, this.zze);
        zzgzo.zzr(iVarZzd, new zzena(this, zzfirVar), this.zza);
    }
}
