package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzeol implements zzeki {
    private final Map zza = new HashMap();
    private final zzdvp zzb;

    @Override // com.google.android.gms.internal.ads.zzeki
    @Nullable
    public final zzekj zza(String str, JSONObject jSONObject) throws zzfjr {
        zzekj zzekjVar;
        synchronized (this) {
            Map map = this.zza;
            zzekjVar = (zzekj) map.get(str);
            if (zzekjVar == null) {
                zzekjVar = new zzekj(this.zzb.zza(str, jSONObject), new zzelw(), str);
                map.put(str, zzekjVar);
            }
        }
        return zzekjVar;
    }

    public zzeol(zzdvp zzdvpVar) {
        this.zzb = zzdvpVar;
    }
}
