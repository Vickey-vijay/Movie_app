package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgoa implements zzgnb, zzgdd {
    public static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    public zzgoa(Context context, zzgao zzgaoVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    public final void zze() {
        synchronized (this) {
            if (this.zzh) {
                this.zzf = System.currentTimeMillis();
            }
        }
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zze = j10;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }

    public final /* synthetic */ void zzi(long j10) {
        this.zzg = j10;
    }

    public final /* synthetic */ void zzj(boolean z10) {
        this.zzh = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final q5.i zza() {
        return Build.VERSION.SDK_INT < 30 ? zzgzo.zzb() : zzgzo.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzc);
    }

    public final /* synthetic */ void zzf() {
        zzgny zzgnyVar = new zzgny(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            systemService.getClass();
            ((AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgnyVar);
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        long j10;
        long j11;
        zze();
        synchronized (this) {
            if (this.zzh) {
                j10 = this.zzf - this.zze;
            } else {
                j10 = -1;
            }
        }
        map.put("vs", Long.valueOf(j10));
        synchronized (this) {
            j11 = this.zzg;
            this.zzg = -1L;
        }
        map.put("vf", Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        zze();
    }
}
