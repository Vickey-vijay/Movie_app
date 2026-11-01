package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfcp implements zzfax {
    private final JSONObject zza;

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznt)).booleanValue() ? zzgzo.zza(new zzfav() { // from class: com.google.android.gms.internal.ads.zzfcn
            @Override // com.google.android.gms.internal.ads.zzfav
            public final /* synthetic */ void zza(Object obj) {
            }
        }) : zzgzo.zza(new zzfav() { // from class: com.google.android.gms.internal.ads.zzfco
            @Override // com.google.android.gms.internal.ads.zzfav
            public final /* synthetic */ void zza(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }

    public zzfcp(Context context) {
        this.zza = zzbzq.zzc(context, VersionInfoParcel.forPackage());
    }
}
