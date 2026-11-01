package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevg implements zzfax {

    @Nullable
    private final zzffr zza;

    public zzevg(@Nullable zzffr zzffrVar) {
        this.zza = zzffrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        zzffr zzffrVar = this.zza;
        if (zzffrVar == null) {
            return zzgzo.zza(new zzevf(null));
        }
        String strZza = zzffrVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzgzo.zza(new zzevf(null)) : zzgzo.zza(new zzevf(strZza));
    }
}
