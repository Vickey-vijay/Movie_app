package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcol implements zzefw {
    private final zzcnp zza;
    private Context zzb;

    public /* synthetic */ zzcol(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefw
    public final zzefx zza() {
        zziko.zzc(this.zzb, Context.class);
        return new zzcom(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefw
    public final /* bridge */ /* synthetic */ zzefw zzb(Context context) {
        this.zzb = context;
        return this;
    }
}
