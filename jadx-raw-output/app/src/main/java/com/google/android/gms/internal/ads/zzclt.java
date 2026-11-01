package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzclt {
    private final zzclk zza;
    private final zzdxz zzb;

    public zzclt(zzclk zzclkVar, zzdxz zzdxzVar) {
        this.zza = zzclkVar;
        this.zzb = zzdxzVar;
    }

    public final /* synthetic */ zzdxz zzd() {
        return this.zzb;
    }

    public final void zza(final Context context, final VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpr)).booleanValue()) {
            Executor threadPoolExecutor = zzcei.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpt)).booleanValue()) {
                zzcls zzclsVar = new zzcls(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpv)).intValue(), null);
                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpu)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzclsVar);
            }
            threadPoolExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    public final /* synthetic */ void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzps)).booleanValue()) {
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            zzdxy zzdxyVarZza = this.zzb.zza();
            zzdxyVarZza.zzc("action", "webview_startup_l");
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
            sb2.append(jElapsedRealtime2);
            zzdxyVarZza.zzc("webview_startup_l", sb2.toString());
            zzdxyVarZza.zzd();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpy)).booleanValue()) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final /* synthetic */ void zzc() {
        this.zza.zzb(new zzclo(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }
}
