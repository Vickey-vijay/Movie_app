package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzeqa implements zzdmc {
    public final /* synthetic */ zzfir zza;

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, @Nullable zzdbs zzdbsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zza;
    }

    public zzeqa(zzeqd zzeqdVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        Objects.requireNonNull(zzeqdVar);
    }
}
