package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesn implements zzfax {
    private final Context zza;

    public zzesn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return zzgzo.zza(new zzeso(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
