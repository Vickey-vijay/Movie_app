package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfqv implements zzbdy {
    public final /* synthetic */ zzfqw zza;

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzz)).booleanValue()) {
            this.zza.zzl(z10);
        }
    }

    public zzfqv(zzfqw zzfqwVar) {
        Objects.requireNonNull(zzfqwVar);
        this.zza = zzfqwVar;
    }
}
