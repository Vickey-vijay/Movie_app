package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzcoe implements zzdzq {
    private final zzcnp zza;
    private Context zzb;
    private zzbph zzc;

    public /* synthetic */ zzcoe(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzq
    public final zzdzr zza() {
        zziko.zzc(this.zzb, Context.class);
        zziko.zzc(this.zzc, zzbph.class);
        return new zzcof(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdzq
    public final /* bridge */ /* synthetic */ zzdzq zzb(zzbph zzbphVar) {
        zzbphVar.getClass();
        this.zzc = zzbphVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdzq
    public final /* bridge */ /* synthetic */ zzdzq zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
