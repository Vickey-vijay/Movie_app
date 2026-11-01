package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcmc {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcmc(zzcmb zzcmbVar, byte[] bArr) {
        this.zza = zzcmbVar.zzd();
        this.zzb = zzcmbVar.zze();
        this.zzd = zzcmbVar.zzg();
        this.zzc = zzcmbVar.zzf();
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final WeakReference zzc() {
        return this.zzd;
    }

    public final VersionInfoParcel zzd() {
        return this.zza;
    }

    public final zzbjy zzh() {
        return new zzbjy(this.zzb);
    }

    public final long zzi() {
        return this.zzc;
    }

    public static int zzj() {
        return ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzT)).intValue();
    }

    public final zzclz zzf() {
        return new zzclz(this.zzb, this.zza);
    }

    public final com.google.android.gms.ads.internal.zzk zzg() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    public final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzc().zze(this.zzb, this.zza.afmaVersion);
    }
}
