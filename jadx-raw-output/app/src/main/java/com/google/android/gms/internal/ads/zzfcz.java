package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfcz implements zzfax {
    public final ScheduledExecutorService zza;

    public zzfcz(zzbxw zzbxwVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return zzgzo.zzk(zzgzo.zzi(zzgzo.zza(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfd)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfcy
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new zzfda((Bundle) obj);
            }
        }, zzcei.zza);
    }
}
