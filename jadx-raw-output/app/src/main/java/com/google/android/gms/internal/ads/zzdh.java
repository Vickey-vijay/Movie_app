package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzdh {

    @Nullable
    private static Executor zza;

    public static synchronized Executor zza() {
        if (zza == null) {
            zza = zzfj.zzf("ExoPlayer:BackgroundExecutor");
        }
        return zza;
    }
}
