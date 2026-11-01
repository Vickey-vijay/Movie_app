package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
abstract class zzgyq extends zzgyu {
    private static final zzgzw zza = new zzgzw(zzgyq.class);
    private zzgub zzb;
    private final boolean zzc;
    private final boolean zzd;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i10, q5.i iVar) {
        try {
            if (iVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, iVar);
            }
        } finally {
            zzz(null);
        }
    }

    public void zzA(int i10) {
        this.zzb = null;
    }

    public abstract void zzw(int i10, Object obj);

    public abstract void zzx();

    private static void zzF(Throwable th2) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", CreativeInfo.f44317an, true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    private static boolean zzI(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzgub zzgubVar = this.zzb;
        zzA(1);
        if ((zzgubVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgwt it = zzgubVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        zzgub zzgubVar = this.zzb;
        return zzgubVar != null ? "futures=".concat(zzgubVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgwt it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final q5.i iVar = (q5.i) it.next();
                int i11 = i10 + 1;
                if (iVar.isDone()) {
                    zzy(i10, iVar);
                } else {
                    iVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyp
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i10, iVar);
                        }
                    }, zzgzd.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        zzgub zzgubVar = this.zzb;
        final zzgub zzgubVar2 = true != this.zzd ? null : zzgubVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgubVar2);
            }
        };
        zzgwt it2 = zzgubVar.iterator();
        while (it2.hasNext()) {
            q5.i iVar2 = (q5.i) it2.next();
            if (iVar2.isDone()) {
                zzz(zzgubVar2);
            } else {
                iVar2.addListener(runnable, zzgzd.INSTANCE);
            }
        }
    }

    public zzgyq(zzgub zzgubVar, boolean z10, boolean z11) {
        super(zzgubVar.size());
        this.zzb = zzgubVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzE(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzb(th2) && zzI(zzB(), th2)) {
            zzF(th2);
        } else if (th2 instanceof Error) {
            zzF(th2);
        }
    }

    private final void zzG(int i10, Future future) {
        try {
            zzw(i10, zzhap.zza(future));
        } catch (ExecutionException e10) {
            zzE(e10.getCause());
        } catch (Throwable th2) {
            zzE(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgub zzgubVar) {
        boolean z10;
        int iZzC = zzC();
        int i10 = 0;
        if (iZzC >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zzj(z10, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgubVar != null) {
                zzgwt it = zzgubVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final void zzf(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable thZzl = zzl();
            Objects.requireNonNull(thZzl);
            zzI(set, thZzl);
        }
    }
}
