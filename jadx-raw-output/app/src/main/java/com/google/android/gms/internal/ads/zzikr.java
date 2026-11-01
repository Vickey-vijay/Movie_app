package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzikr {
    private final List zza;
    private final List zzb;

    public final zzikr zza(zzikp zzikpVar) {
        this.zza.add(zzikpVar);
        return this;
    }

    public final zzikr zzb(zzikp zzikpVar) {
        this.zzb.add(zzikpVar);
        return this;
    }

    public final zziks zzc() {
        return new zziks(this.zza, this.zzb, null);
    }

    public /* synthetic */ zzikr(int i10, int i11, zzikq zzikqVar) {
        this.zza = zzikd.zza(i10);
        this.zzb = zzikd.zza(i11);
    }
}
