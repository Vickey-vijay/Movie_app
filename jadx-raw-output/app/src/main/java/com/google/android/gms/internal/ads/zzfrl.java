package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfrl {
    private final String zza;

    @Nullable
    private final AdFormat zzb;

    @Nullable
    private String zzc;

    public zzfrl(String str, @Nullable AdFormat adFormat) {
        this.zza = str;
        this.zzb = adFormat;
    }

    public final zzfrl zza(String str) {
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ String zzb() {
        return this.zza;
    }

    public final /* synthetic */ AdFormat zzc() {
        return this.zzb;
    }

    public final /* synthetic */ String zzd() {
        return this.zzc;
    }
}
