package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbtb implements zzcep {
    public final /* synthetic */ zzcen zza;
    public final /* synthetic */ zzbsf zzb;

    public zzbtb(zzbtd zzbtdVar, zzcen zzcenVar, zzbsf zzbsfVar) {
        this.zza = zzcenVar;
        this.zzb = zzbsfVar;
        Objects.requireNonNull(zzbtdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbso("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
