package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzctd implements zzikg {
    private final zzikp zza;

    private zzctd(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzctd zza(zzikp zzikpVar) {
        return new zzctd(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcww) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
