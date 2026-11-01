package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdru {
    private final Executor zza;
    private final zzdrp zzb;
    private final zzdxt zzc;

    public zzdru(Executor executor, zzdrp zzdrpVar, zzdxt zzdxtVar) {
        this.zza = executor;
        this.zzb = zzdrpVar;
        this.zzc = zzdxtVar;
    }

    public final q5.i zza(JSONObject jSONObject, String str) {
        q5.i iVarZza;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgzo.zza(Collections.emptyList());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzc.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                iVarZza = zzgzo.zza(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    iVarZza = zzgzo.zza(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    iVarZza = TypedValues.Custom.S_STRING.equals(strOptString2) ? zzgzo.zza(new zzdrr(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgzo.zzk(this.zzb.zza(jSONObjectOptJSONObject, "image_value", null), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdrs
                        @Override // com.google.android.gms.internal.ads.zzgqt
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdrr(strOptString, (zzbkd) obj);
                        }
                    }, this.zza) : zzgzo.zza(null);
                }
            }
            arrayList.add(iVarZza);
        }
        return zzgzo.zzk(zzgzo.zzm(arrayList), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdrt
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdrr zzdrrVar : (List) obj) {
                    if (zzdrrVar != null) {
                        arrayList2.add(zzdrrVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
