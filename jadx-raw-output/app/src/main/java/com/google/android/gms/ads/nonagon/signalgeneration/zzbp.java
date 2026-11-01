package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbjj;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbp extends QueryInfoGenerationCallback {
    public final /* synthetic */ String zza;
    public final /* synthetic */ TaggingLibraryJsInterface zzb;

    public zzbp(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        Objects.requireNonNull(taggingLibraryJsInterface);
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String strConcat = ((Boolean) zzbjj.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zze().zzb().toString()) : "";
        String str2 = this.zza;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[4];
        objArr[0] = str2;
        objArr[1] = str;
        zzbio zzbioVar = zzbjj.zze;
        objArr[2] = Long.valueOf(((Boolean) zzbioVar.zze()).booleanValue() ? ((Long) zzbjj.zzh.zze()).longValue() : 0L);
        objArr[3] = strConcat;
        final String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        if (((Boolean) zzbioVar.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb.zzc().evaluateJavascript(str3, null);
                    }
                });
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(str3, null);
        }
        if (((Boolean) zzbjj.zzc.zze()).booleanValue() && ((Boolean) zzbjj.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zza();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String strConcat;
        final String str;
        long jLongValue;
        String query = queryInfo.getQuery();
        long jLongValue2 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzb.zze().zzb());
            }
            if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
                jLongValue = ((Long) zzbjj.zzh.zze()).longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("sdk_ttl_ms", jLongValue);
            jSONObject.put("signal", query);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                strConcat = ",\"as\":".concat(this.zzb.zze().zzb().toString());
            } else {
                strConcat = "";
            }
            String str2 = this.zza;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            objArr[0] = str2;
            objArr[1] = queryInfo.getQuery();
            if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
                jLongValue2 = ((Long) zzbjj.zzh.zze()).longValue();
            }
            objArr[2] = Long.valueOf(jLongValue2);
            objArr[3] = strConcat;
            str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        }
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbo
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb.zzc().evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(str, null);
        }
        if (((Boolean) zzbjj.zzc.zze()).booleanValue() && ((Boolean) zzbjj.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zza();
        }
    }
}
