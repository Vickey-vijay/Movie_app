package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhg implements zzha {
    private final Context zza;
    private final zzha zzb;

    public zzhg(Context context) {
        zzhi zzhiVar = new zzhi();
        this.zza = context.getApplicationContext();
        this.zzb = zzhiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final /* bridge */ /* synthetic */ zzhb zza() {
        return new zzhh(this.zza, this.zzb.zza());
    }
}
