package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzgnx implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgnx(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgnx zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgnx(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgnw((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb());
    }
}
