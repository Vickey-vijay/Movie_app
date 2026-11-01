package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfgf {
    private final zzfkz zza;
    private final zzdam zzb;
    private final Executor zzc;
    private zzfgd zzd;

    public zzfgf(zzfkz zzfkzVar, zzdam zzdamVar, Executor executor) {
        this.zza = zzfkzVar;
        this.zzb = zzdamVar;
        this.zzc = executor;
    }

    public final /* synthetic */ zzfgd zzc() {
        return this.zzd;
    }

    public final /* synthetic */ void zzd(zzfgd zzfgdVar) {
        this.zzd = zzfgdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzflj zzb() {
        zzfjk zzfjkVarZzb = this.zzb.zzb();
        return this.zza.zzd(zzfjkVarZzb.zzd, zzfjkVarZzb.zzg, zzfjkVarZzb.zzk);
    }

    public final q5.i zza() {
        q5.i iVarZza;
        zzfgd zzfgdVar = this.zzd;
        if (zzfgdVar != null) {
            return zzgzo.zza(zzfgdVar);
        }
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            zzgzg zzgzgVarZzw = zzgzg.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzfgc zzfgcVar = new zzfgc(this);
            Executor executor = this.zzc;
            iVarZza = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk(zzgzgVarZzw, zzfgcVar, executor), zzeff.class, new zzfgb(this), executor);
        } else {
            zzfgd zzfgdVar2 = new zzfgd(null, zzb(), null);
            this.zzd = zzfgdVar2;
            iVarZza = zzgzo.zza(zzfgdVar2);
        }
        return zzgzo.zzk(iVarZza, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfge
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return (zzfgd) obj;
            }
        }, this.zzc);
    }
}
