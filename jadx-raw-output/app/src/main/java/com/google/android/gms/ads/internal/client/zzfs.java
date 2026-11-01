package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfs extends zzds {

    @Nullable
    private final OnPaidEventListener zza;

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final boolean zzf() {
        return this.zza == null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(zzt zztVar) {
        OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zztVar.zzb, zztVar.zzc, zztVar.zzd));
        }
    }

    public zzfs(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }
}
