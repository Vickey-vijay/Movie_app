package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbc implements zzikg {
    private final zzay zza;

    private zzbc(zzay zzayVar) {
        this.zza = zzayVar;
    }

    public static zzbc zza(zzay zzayVar) {
        return new zzbc(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
