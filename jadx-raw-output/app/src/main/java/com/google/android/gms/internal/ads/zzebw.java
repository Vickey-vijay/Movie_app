package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzebw extends AdListener {
    public final /* synthetic */ zzecc zza;

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzg(zzecc.zzm(loadAdError));
    }

    public zzebw(zzecc zzeccVar) {
        Objects.requireNonNull(zzeccVar);
        this.zza = zzeccVar;
    }
}
