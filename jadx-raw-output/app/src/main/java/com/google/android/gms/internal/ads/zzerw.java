package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzerw implements zzese {
    public final /* synthetic */ zzerx zza;

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzerx zzerxVar = this.zza;
        synchronized (zzerxVar) {
            zzerxVar.zzM(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzerx zzerxVar = this.zza;
        zzdkn zzdknVar = (zzdkn) obj;
        synchronized (zzerxVar) {
            zzerxVar.zzM(zzdknVar);
            zzerxVar.zzL().zzj();
        }
    }

    public zzerw(zzerx zzerxVar) {
        Objects.requireNonNull(zzerxVar);
        this.zza = zzerxVar;
    }
}
