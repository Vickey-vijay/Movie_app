package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzacg {
    private final Context zza;
    private final zzacs zzb;
    private zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = 15000;
    private final zzact zzh = new zzact(1.0f);
    private zzdn zze = zzdn.zza;

    public final zzacg zza(boolean z10) {
        this.zzd = true;
        return this;
    }

    public final zzacg zzb(zzdn zzdnVar) {
        this.zze = zzdnVar;
        return this;
    }

    public final zzacg zzc(long j10) {
        this.zzg = j10;
        return this;
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zzacs zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzbs zzg() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    public final /* synthetic */ zzdn zzi() {
        return this.zze;
    }

    public final /* synthetic */ long zzj() {
        return this.zzg;
    }

    public final /* synthetic */ zzact zzk() {
        return this.zzh;
    }

    public final zzaco zzd() {
        zzgrc.zzi(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzacm(false);
        }
        zzaco zzacoVar = new zzaco(this, null);
        this.zzf = true;
        return zzacoVar;
    }

    public zzacg(Context context, zzacs zzacsVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzacsVar;
    }
}
