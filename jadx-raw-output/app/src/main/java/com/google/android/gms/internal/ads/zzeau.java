package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzeau implements zzikg {
    private final zzikp zza;

    private zzeau(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzeau zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeau(zzikpVar, zzikpVar2);
    }

    public static zzdje zzc(zzeat zzeatVar, Executor executor) {
        return new zzdje(zzeatVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzeat) this.zza.zzb(), zzfmk.zzc());
    }
}
