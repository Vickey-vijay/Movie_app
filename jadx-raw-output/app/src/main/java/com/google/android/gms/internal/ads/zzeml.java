package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzeml implements zzeki {
    private final zzdvp zza;

    public zzeml(zzdvp zzdvpVar) {
        this.zza = zzdvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    @Nullable
    public final zzekj zza(String str, JSONObject jSONObject) throws zzfjr {
        return new zzekj(this.zza.zza(str, jSONObject), new zzelv(), str);
    }
}
