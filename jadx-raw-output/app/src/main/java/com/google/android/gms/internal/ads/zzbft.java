package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbft extends zzcen {
    public final /* synthetic */ zzbfz zza;

    @Override // com.google.android.gms.internal.ads.zzcen, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.zza.zzb();
        return super.cancel(z10);
    }

    public zzbft(zzbfz zzbfzVar) {
        Objects.requireNonNull(zzbfzVar);
        this.zza = zzbfzVar;
    }
}
