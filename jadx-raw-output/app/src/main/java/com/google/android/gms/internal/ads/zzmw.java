package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzmw implements zzlm {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzav zzd = zzav.zza;

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzav zzj() {
        return this.zzd;
    }

    public final void zza() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzb() {
        if (this.zza) {
            zzc(zzg());
            this.zza = false;
        }
    }

    public final void zzc(long j10) {
        this.zzb = j10;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final long zzg() {
        long j10 = this.zzb;
        if (!this.zza) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzav zzavVar = this.zzd;
        return j10 + (zzavVar.zzb == 1.0f ? zzfj.zzq(jElapsedRealtime) : zzavVar.zza(jElapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzi(zzav zzavVar) {
        if (this.zza) {
            zzc(zzg());
        }
        this.zzd = zzavVar;
    }

    public zzmw(zzdn zzdnVar) {
    }
}
