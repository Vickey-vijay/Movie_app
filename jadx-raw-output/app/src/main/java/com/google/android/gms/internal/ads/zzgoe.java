package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzgoe {
    private final zzgdh zza;
    private final zzgao zzb;

    public zzgoe(zzgao zzgaoVar, zzgdh zzgdhVar) {
        this.zza = zzgdhVar;
        this.zzb = zzgaoVar;
    }

    public final zzgoc zza(int i10) {
        return new zzgoc(i10, this.zzb, this.zza);
    }

    public final void zzb(int i10) {
        this.zza.zzb(i10 - 1, -1L, null, null);
    }

    public final void zzc(int i10, String str) {
        this.zza.zzb(i10 - 1, -1L, null, str);
    }

    public final void zzd(int i10, Throwable th2) {
        this.zza.zzb(i10 - 1, -1L, th2, null);
    }

    public final q5.i zze(int i10, q5.i iVar) {
        zzgoc zzgocVarZza = zza(i10);
        zzgocVarZza.zza();
        zzgzo.zzr(iVar, new zzgod(this, zzgocVarZza), zzhaf.zza());
        return iVar;
    }

    public final void zzf(int i10, Runnable runnable) {
        zzgoc zzgocVarZza = zza(i10);
        try {
            zzgocVarZza.zza();
            runnable.run();
            zzgocVarZza.zzc();
        } catch (Throwable th2) {
            try {
                zzgocVarZza.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgocVarZza.zzc();
                throw th3;
            }
        }
    }
}
