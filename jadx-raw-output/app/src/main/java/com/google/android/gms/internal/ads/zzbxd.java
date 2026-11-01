package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzbxd extends zzblv {
    public final /* synthetic */ zzbxf zza;

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) {
        zzbxf zzbxfVar = this.zza;
        if (zzbxfVar.zze() == null) {
            return;
        }
        zzbxfVar.zze().onCustomClick(zzbxfVar.zzc(zzblmVar), str);
    }

    public /* synthetic */ zzbxd(zzbxf zzbxfVar, byte[] bArr) {
        Objects.requireNonNull(zzbxfVar);
        this.zza = zzbxfVar;
    }
}
