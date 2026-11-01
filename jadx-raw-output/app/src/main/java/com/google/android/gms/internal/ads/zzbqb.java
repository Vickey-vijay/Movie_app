package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbqb implements zzgyw {
    public final /* synthetic */ zzbpt zza;

    public zzbqb(zzbqf zzbqfVar, zzbpt zzbptVar) {
        this.zza = zzbptVar;
        Objects.requireNonNull(zzbqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* bridge */ /* synthetic */ q5.i zza(Object obj) throws Exception {
        zzcen zzcenVar = new zzcen();
        ((zzbpz) obj).zze(this.zza, new zzbqa(this, zzcenVar));
        return zzcenVar;
    }
}
