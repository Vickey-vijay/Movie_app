package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import com.ironsource.C3444e4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdra {
    private final zzgzy zza;
    private final zzdrp zzb;
    private final zzdru zzc;
    private final zzdxt zzd;

    public zzdra(zzgzy zzgzyVar, zzdrp zzdrpVar, zzdru zzdruVar, zzdxt zzdxtVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdrpVar;
        this.zzc = zzdruVar;
        this.zzd = zzdxtVar;
    }

    public final /* synthetic */ zzdxt zzd() {
        return this.zzd;
    }

    private final q5.i zze(q5.i iVar, zzdxh zzdxhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            zzgzo.zzr(iVar, new zzdqx(this, zzdxhVar), this.zza);
        }
        return iVar;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0108  */
    public final q5.i zza(final zzfjc zzfjcVar, final zzfir zzfirVar, final JSONObject jSONObject, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcce zzcceVar) {
        q5.i iVarZza;
        JSONArray jSONArrayOptJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final q5.i iVarSubmit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzb(zzfjcVar, zzfirVar, jSONObject);
            }
        });
        zze(iVarSubmit, zzdxh.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdrp zzdrpVar = this.zzb;
        final q5.i iVarZzb = zzdrpVar.zzb(jSONObject, "images", zzdxh.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(iVarZzb, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        final q5.i iVarZzc = zzdrpVar.zzc(jSONObject, "images", zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        zze(iVarZzc, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final q5.i iVarZza2 = zzdrpVar.zza(jSONObject, "secondary_image", zzdxh.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(iVarZza2, zzdxh.NATIVE_ASSETS_LOADING_LOGO_END);
        final q5.i iVarZza3 = zzdrpVar.zza(jSONObject, "app_icon", zzdxh.NATIVE_ASSETS_LOADING_ICON_START);
        zze(iVarZza3, zzdxh.NATIVE_ASSETS_LOADING_ICON_END);
        final q5.i iVarZzd = zzdrpVar.zzd(jSONObject, C3444e4.f28728c, zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(iVarZzd, zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final q5.i iVarZzg = zzdrpVar.zzg(jSONObject, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        zze(iVarZzg, zzdxh.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzow)).booleanValue() || !jSONObject.has("video")) {
            iVarZza = zzgzo.zza(new Bundle());
            break;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject.has("flags") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("flags")) != null) {
            int i10 = 0;
            while (true) {
                if (i10 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.optString(C3426d4.i.W).equals("afma_video_player_type")) {
                        i10++;
                    } else {
                        try {
                            if (Integer.parseInt(jSONObjectOptJSONObject2.optString("value")) == 3) {
                                iVarZza = this.zzb.zzf(iVarZzg);
                                zze(iVarZza, zzdxh.NATIVE_ASSETS_LOADING_MEDIA_END);
                                break;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                iVarZza = zzgzo.zza(new Bundle());
                break;
            }
        }
        iVarZza = zzgzo.zza(new Bundle());
        break;
        final q5.i iVar = iVarZza;
        final q5.i iVarZza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(iVarZza4, zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final q5.i iVarZze = this.zzb.zze(jSONObject, zzbVar, zzcceVar);
        zze(iVarZze, zzdxh.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iVarSubmit);
        arrayList.add(iVarZzb);
        arrayList.add(iVarZzc);
        arrayList.add(iVarZza2);
        arrayList.add(iVarZza3);
        arrayList.add(iVarZzd);
        arrayList.add(iVarZzg);
        arrayList.add(iVar);
        arrayList.add(iVarZza4);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(iVarZze);
        }
        return zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(iVarSubmit, iVarZzb, iVarZza3, iVarZza2, iVarZzd, jSONObject, iVarZzg, iVar, iVarZzc, iVarZze, iVarZza4);
            }
        }, this.zza);
    }

    public final /* synthetic */ zzdoh zzb(zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) throws zzenv {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza(jSONObject.optInt("template_id", -1));
        zzdohVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdohVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        if (!zzfjkVar.zzh.contains(Integer.toString(zzdohVar.zzx()))) {
            int iZzx = zzdohVar.zzx();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzx).length() + 21);
            sb2.append("Invalid template ID: ");
            sb2.append(iZzx);
            throw new zzenv(1, sb2.toString());
        }
        if (zzdohVar.zzx() == 3) {
            if (zzdohVar.zzS() == null) {
                throw new zzenv(1, "No custom template id for custom template ad response.");
            }
            if (!zzfjkVar.zzi.contains(zzdohVar.zzS())) {
                throw new zzenv(1, "Unexpected custom template id in the response.");
            }
        }
        zzdohVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfirVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzD = com.google.android.gms.ads.internal.util.zzs.zzD();
            StringBuilder sb3 = new StringBuilder(String.valueOf(strZzD).length() + 3 + String.valueOf(strOptString).length());
            sb3.append(strZzD);
            sb3.append(" : ");
            sb3.append(strOptString);
            strOptString = sb3.toString();
        }
        zzdohVar.zzs("headline", strOptString);
        zzdohVar.zzs("body", jSONObject.optString("body", null));
        zzdohVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdohVar.zzs(C3426d4.i.U, jSONObject.optString(C3426d4.i.U, null));
        zzdohVar.zzs("price", jSONObject.optString("price", null));
        zzdohVar.zzs(C3426d4.i.F0, jSONObject.optString(C3426d4.i.F0, null));
        return zzdohVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdoh zzc(q5.i iVar, q5.i iVar2, q5.i iVar3, q5.i iVar4, q5.i iVar5, JSONObject jSONObject, q5.i iVar6, q5.i iVar7, q5.i iVar8, q5.i iVar9, q5.i iVar10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = (zzdoh) iVar.get();
        zzdohVar.zzd((List) iVar2.get());
        zzdohVar.zzj((zzbks) iVar3.get());
        zzdohVar.zzk((zzbks) iVar4.get());
        zzdohVar.zzc((zzbkl) iVar5.get());
        zzdohVar.zze(zzdrp.zzl(jSONObject));
        zzdohVar.zzf(zzdrp.zzk(jSONObject));
        zzcjl zzcjlVar = (zzcjl) iVar6.get();
        if (zzcjlVar != null) {
            zzdohVar.zzm(zzcjlVar);
            zzdohVar.zzg(zzcjlVar.zzE());
            zzdohVar.zzb(zzcjlVar.zzh());
        }
        zzdohVar.zzH().putAll((Bundle) iVar7.get());
        zzcjl zzcjlVar2 = (zzcjl) iVar8.get();
        if (zzcjlVar2 != null) {
            zzdohVar.zzn(zzcjlVar2);
            zzdohVar.zzh(zzcjlVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            zzcjl zzcjlVar3 = (zzcjl) iVar9.get();
            if (zzcjlVar3 != null) {
                zzdohVar.zzo(zzcjlVar3);
            }
        } else {
            zzdohVar.zzp(iVar9);
            zzdohVar.zzr(new zzcen());
        }
        for (zzdrr zzdrrVar : (List) iVar10.get()) {
            if (zzdrrVar.zza != 1) {
                zzdohVar.zzt(zzdrrVar.zzb, zzdrrVar.zzd);
            } else {
                zzdohVar.zzs(zzdrrVar.zzb, zzdrrVar.zzc);
            }
        }
        return zzdohVar;
    }
}
