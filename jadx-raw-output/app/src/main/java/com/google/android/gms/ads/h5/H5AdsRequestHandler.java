package com.google.android.gms.ads.h5;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbpo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class H5AdsRequestHandler {
    private final zzbpo zza;

    public void clearAdObjects() {
        this.zza.zzb();
    }

    public boolean handleH5AdsRequest(@NonNull String str) {
        return this.zza.zza(str);
    }

    public H5AdsRequestHandler(@NonNull Context context, @NonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbpo(context, onH5AdsEventListener);
    }

    public boolean shouldInterceptRequest(@NonNull String str) {
        return zzbpo.zzc(str);
    }
}
