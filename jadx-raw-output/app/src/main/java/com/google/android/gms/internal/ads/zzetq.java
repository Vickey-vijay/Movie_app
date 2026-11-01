package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzetq implements zzfav {
    private final Bundle zza;

    @VisibleForTesting
    public zzetq(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzdahVar.zza.putBundle("installed_adapter_data", bundle);
    }
}
