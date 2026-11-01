package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezn implements zzfax {

    @Nullable
    private final Bundle zza;

    public zzezn(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return zzgzo.zza(new zzezo(this.zza));
    }
}
