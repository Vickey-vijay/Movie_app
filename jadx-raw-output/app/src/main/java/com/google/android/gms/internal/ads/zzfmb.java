package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfmb {
    private final zzflt zza;
    private final q5.i zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public final synchronized void zza(zzgzl zzgzlVar) {
        zzflt zzfltVar = this.zza;
        zzgzo.zzr(zzgzo.zzj(this.zzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzflz
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return zzgzo.zzb();
            }
        }, zzfltVar.zza()), zzgzlVar, zzfltVar.zza());
    }

    public final synchronized q5.i zzb(zzflt zzfltVar) {
        if (!this.zzd && !this.zzc) {
            zzflt zzfltVar2 = this.zza;
            if (zzfltVar2.zzb() != null && zzfltVar.zzb() != null && zzfltVar2.zzb().equals(zzfltVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    public final /* synthetic */ q5.i zzc(zzfls zzflsVar, zzfkz zzfkzVar, zzflt zzfltVar, zzfli zzfliVar) {
        q5.i iVarZza;
        synchronized (this) {
            this.zzd = true;
            zzflsVar.zzb(zzfliVar);
            if (this.zzc) {
                iVarZza = zzgzo.zza(new zzflr(zzfliVar, zzfltVar));
            } else {
                zzfkzVar.zzb(zzfltVar.zzb(), zzfliVar);
                iVarZza = zzgzo.zza(null);
            }
        }
        return iVarZza;
    }

    public final /* synthetic */ q5.i zzd(zzfls zzflsVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public zzfmb(final zzfkz zzfkzVar, final zzfls zzflsVar, final zzflt zzfltVar) {
        this.zza = zzfltVar;
        this.zzb = zzgzo.zzh(zzgzo.zzj(zzflsVar.zza(zzfltVar), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfma
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzc(zzflsVar, zzfkzVar, zzfltVar, (zzfli) obj);
            }
        }, zzfltVar.zza()), Exception.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfly
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzd(zzflsVar, (Exception) obj);
            }
        }, zzfltVar.zza());
    }
}
