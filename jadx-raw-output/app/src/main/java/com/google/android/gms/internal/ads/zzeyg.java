package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeyg implements zzfav {
    private final Boolean zza;

    public zzeyg(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Boolean bool = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (bool != null) {
            zzdahVar.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
