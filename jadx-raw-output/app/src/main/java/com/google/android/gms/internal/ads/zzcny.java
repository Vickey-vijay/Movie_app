package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzcny implements zzffh {
    private final zzcnp zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    public /* synthetic */ zzcny(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final zzffi zza() {
        zziko.zzc(this.zzb, Context.class);
        zziko.zzc(this.zzc, String.class);
        zziko.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcnz(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final /* bridge */ /* synthetic */ zzffh zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final /* bridge */ /* synthetic */ zzffh zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final /* bridge */ /* synthetic */ zzffh zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
