package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzfnm {
    private static final q5.i zza = zzgzo.zza(null);
    private final zzgzy zzb;
    private final ScheduledExecutorService zzc;
    private final zzfnn zzd;

    public zzfnm(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzfnn zzfnnVar) {
        this.zzb = zzgzyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfnnVar;
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzgzy zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfnn zzg() {
        return this.zzd;
    }

    public final zzfnl zza(Object obj, q5.i iVar) {
        return new zzfnl(this, obj, null, iVar, Collections.singletonList(iVar), iVar, null);
    }

    public final zzfnd zzb(Object obj, q5.i... iVarArr) {
        return new zzfnd(this, obj, Arrays.asList(iVarArr), null);
    }
}
