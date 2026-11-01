package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzhak extends zzgzf {
    private q5.i zza;
    private ScheduledFuture zzb;

    public final /* synthetic */ q5.i zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }

    public static q5.i zze(q5.i iVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzhak zzhakVar = new zzhak(iVar);
        zzhai zzhaiVar = new zzhai(zzhakVar);
        zzhakVar.zzb = scheduledExecutorService.schedule(zzhaiVar, j10, timeUnit);
        iVar.addListener(zzhaiVar, zzgzd.INSTANCE);
        return zzhakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        q5.i iVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (iVar == null) {
            return null;
        }
        String string = iVar.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 14);
        sb2.append("inputFuture=[");
        sb2.append(string);
        sb2.append(C3426d4.j.f28588e);
        String string2 = sb2.toString();
        if (scheduledFuture == null) {
            return string2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string2;
        }
        StringBuilder sb3 = new StringBuilder(string2.length() + 19 + String.valueOf(delay).length() + 4);
        sb3.append(string2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    private zzhak(q5.i iVar) {
        iVar.getClass();
        this.zza = iVar;
    }
}
