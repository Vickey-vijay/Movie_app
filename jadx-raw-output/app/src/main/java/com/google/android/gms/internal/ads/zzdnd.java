package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnd {
    private final JSONObject zza;
    private final zzdtk zzb;

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zzc;

    @Nullable
    private final zzcce zzd;

    public zzdnd(JSONObject jSONObject, zzdtk zzdtkVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcce zzcceVar) {
        this.zza = jSONObject;
        this.zzb = zzdtkVar;
        this.zzc = zzbVar;
        this.zzd = zzcceVar;
    }

    @Nullable
    public final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    @Nullable
    public final zzcce zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdtk zzd() {
        return this.zzb;
    }
}
