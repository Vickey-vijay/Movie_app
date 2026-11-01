package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzbgt extends zzbgv {
    public zzbgt(int i10, String str, Float f10, Float f11) {
        super(1, str, f10, f11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(zze(), ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final /* bridge */ /* synthetic */ Object zza(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zze())));
        }
        return (Float) zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final /* bridge */ /* synthetic */ Object zzc(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(zze(), ((Float) zzf()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final /* bridge */ /* synthetic */ Object zzd(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zze(), ((Float) zzf()).floatValue()));
    }
}
