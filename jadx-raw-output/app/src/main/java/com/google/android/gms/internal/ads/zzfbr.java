package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfbr implements zzfax {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgzy zzc;
    private final ScheduledExecutorService zzd;
    private final zzeke zze;
    private final zzfjk zzf;
    private final VersionInfoParcel zzg;

    public zzfbr(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzeke zzekeVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzekeVar;
        this.zzf = zzfjkVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 56;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)).contains(r5.zzb.getPackageName()) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzfax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q5.i zza() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbr.zza():q5.i");
    }

    public final /* synthetic */ q5.i zzc(final Throwable th2) {
        zzfbs zzfbsVar;
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlS)).booleanValue();
                Throwable th3 = th2;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th3, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th3, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th2 instanceof SecurityException) {
            zzfbsVar = new zzfbs("", 2, null);
        } else if (th2 instanceof IllegalStateException) {
            zzfbsVar = new zzfbs("", 3, null);
        } else if (th2 instanceof IllegalArgumentException) {
            zzfbsVar = new zzfbs("", 4, null);
        } else {
            zzfbsVar = th2 instanceof TimeoutException ? new zzfbs("", 5, null) : new zzfbs("", 0, null);
        }
        return zzgzo.zza(zzfbsVar);
    }
}
