package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzems implements zzemm {
    private final zzdmq zza;
    private final zzgzy zzb;
    private final zzdra zzc;
    private final zzfkj zzd;
    private final zzdtq zze;
    private final zzdxt zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzcca zzi;

    public zzems(zzdmq zzdmqVar, zzgzy zzgzyVar, zzdra zzdraVar, zzfkj zzfkjVar, zzdtq zzdtqVar, zzdxt zzdxtVar, VersionInfoParcel versionInfoParcel, Context context, zzcca zzccaVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzccaVar;
        this.zza = zzdmqVar;
        this.zzb = zzgzyVar;
        this.zzc = zzdraVar;
        this.zzd = zzfkjVar;
        this.zze = zzdtqVar;
        this.zzf = zzdxtVar;
    }

    private final q5.i zzg(final zzfjc zzfjcVar, final zzfir zzfirVar, final JSONObject jSONObject) {
        final zzcce zzcceVar;
        final com.google.android.gms.ads.internal.zzb zzbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcN)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final q5.i iVarZzb = this.zzd.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue()) {
            Context context = this.zzh;
            zzcce zzcceVarZza = zzdba.zza(context, this.zzg, zzfirVar, this.zzi);
            zzcceVar = zzcceVarZza;
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zzcceVarZza, null);
        } else {
            zzcceVar = null;
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzh, null, null);
        }
        final q5.i iVarZza = this.zzc.zza(zzfjcVar, zzfirVar, jSONObject, zzbVar, zzcceVar);
        return zzgzo.zzo(iVarZzb, iVarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzemq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf(iVarZza, iVarZzb, zzfjcVar, zzfirVar, jSONObject, zzbVar, zzcceVar);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final q5.i zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        q5.i iVarZzb = this.zzd.zzb();
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzemr
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzc(zzfirVar, (zzdtk) obj);
            }
        };
        zzgzy zzgzyVar = this.zzb;
        return zzgzo.zzj(zzgzo.zzj(iVarZzb, zzgywVar, zzgzyVar), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzemn
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzd(zzfjcVar, zzfirVar, (JSONArray) obj);
            }
        }, zzgzyVar);
    }

    public final /* synthetic */ q5.i zzc(zzfir zzfirVar, final zzdtk zzdtkVar) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjX)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfirVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgzo.zzj(zzdtkVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zze(zzdtkVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ q5.i zze(zzdtk zzdtkVar, JSONObject jSONObject) throws zzbso {
        this.zzd.zzc(zzgzo.zza(zzdtkVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbso("process json failed");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzgzo.zza(jSONObject.getJSONObject("json").getJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS));
    }

    public final /* synthetic */ q5.i zzd(zzfjc zzfjcVar, zzfir zzfirVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgzo.zzc(new zzecr(3));
        }
        int i10 = zzfjcVar.zza.zza.zzl;
        if (i10 > 1) {
            int length = jSONArray.length();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcO)).booleanValue()) {
                this.zzf.zzd("nsl", String.valueOf(length));
            }
            this.zzd.zza(Math.min(length, i10));
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 < length) {
                    arrayList.add(zzg(zzfjcVar, zzfirVar, jSONArray.getJSONObject(i11)));
                } else {
                    arrayList.add(zzgzo.zzc(new zzecr(3)));
                }
            }
            return zzgzo.zza(arrayList);
        }
        return zzgzo.zzk(zzg(zzfjcVar, zzfirVar, jSONArray.getJSONObject(0)), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzemp
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return Collections.singletonList(zzgzo.zza((zzdoc) obj));
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdoc zzf(q5.i iVar, q5.i iVar2, zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        zzdoh zzdohVar = (zzdoh) iVar.get();
        zzdtk zzdtkVar = (zzdtk) iVar2.get();
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoi zzdoiVarZzd = this.zza.zzd(new zzcwv(zzfjcVar, zzfirVar, null), new zzdos(zzdohVar), new zzdnd(jSONObject, zzdtkVar, zzbVar, zzcceVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdxt zzdxtVar = this.zzf;
            zzdxtVar.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            zzdxtVar.zze().putLong(zzdxh.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdoiVarZzd.zzi().zzb();
        zzdoiVarZzd.zzj().zza(zzdtkVar);
        zzdoiVarZzd.zzk().zza(zzdohVar.zzT());
        zzdoiVarZzd.zzl().zza(this.zze, zzdohVar.zzU());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzdoiVarZzd.zzh();
    }
}
