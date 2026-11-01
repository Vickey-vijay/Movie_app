package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpq {
    public static final zzpq zza;
    public final String zzb;

    @Nullable
    private final zzpp zzc;

    @RequiresApi(31)
    public final synchronized LogSessionId zza() {
        zzpp zzppVar;
        zzppVar = this.zzc;
        zzppVar.getClass();
        return zzppVar.zza;
    }

    @RequiresApi(31)
    public final synchronized void zzb(LogSessionId logSessionId) {
        zzpp zzppVar = this.zzc;
        zzppVar.getClass();
        zzgrc.zzi(zzppVar.zza.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzppVar.zza = logSessionId;
    }

    static {
        new zzpq("");
        zza = new zzpq("preload");
    }

    public zzpq(String str) {
        zzpp zzppVar;
        this.zzb = str;
        if (Build.VERSION.SDK_INT >= 31) {
            zzppVar = new zzpp();
        } else {
            zzppVar = null;
        }
        this.zzc = zzppVar;
    }
}
