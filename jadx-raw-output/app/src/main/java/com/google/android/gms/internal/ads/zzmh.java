package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzmh {
    private final zzmg zza;
    private final zzmf zzb;
    private final zzbf zzc;
    private int zzd;

    @Nullable
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzmh(zzmf zzmfVar, zzmg zzmgVar, zzbf zzbfVar, int i10, zzdn zzdnVar, Looper looper) {
        this.zzb = zzmfVar;
        this.zza = zzmgVar;
        this.zzc = zzbfVar;
        this.zzf = looper;
        this.zzg = i10;
    }

    public final zzmg zza() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Nullable
    public final Object zze() {
        return this.zze;
    }

    public final Looper zzf() {
        return this.zzf;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z10) {
        this.zzi = z10 | this.zzi;
        notifyAll();
    }

    public final zzmh zzb(int i10) {
        zzgrc.zzi(!this.zzh);
        this.zzd = i10;
        return this;
    }

    public final zzmh zzd(@Nullable Object obj) {
        zzgrc.zzi(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzmh zzg() {
        zzgrc.zzi(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }
}
