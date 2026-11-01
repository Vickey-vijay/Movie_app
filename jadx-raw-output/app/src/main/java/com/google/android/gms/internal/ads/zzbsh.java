package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbsh implements zzcep {
    public final /* synthetic */ zzbsf zza;

    public zzbsh(zzbsk zzbskVar, zzbsf zzbsfVar) {
        this.zza = zzbsfVar;
        Objects.requireNonNull(zzbskVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziK)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
