package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbsw {
    public static final zzbst zza = new zzbsu();
    public static final zzbsr zzb = new zzbsr() { // from class: com.google.android.gms.internal.ads.zzbsv
        @Override // com.google.android.gms.internal.ads.zzbsr
        public final /* synthetic */ Object zza(JSONObject jSONObject) {
            return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    };
}
