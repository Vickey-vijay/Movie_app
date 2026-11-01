package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeyy implements zzfav {
    private final zzfjk zza;

    @Nullable
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzeyy(zzfjk zzfjkVar, @Nullable PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfjkVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i10;
        zzbkh zzbkhVar = this.zza.zzj;
        if (zzbkhVar == null || (i10 = zzbkhVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbkhVar.zzj);
        bundle.putInt("sccg_dir", i10);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        zzfjk zzfjkVar = this.zza;
        ArrayList<String> arrayList = zzfjkVar.zzh;
        zzdah zzdahVar = (zzdah) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzdahVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzdahVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfjkVar.zzi);
        zzbkh zzbkhVar = zzfjkVar.zzj;
        if (zzbkhVar != null) {
            int i10 = zzbkhVar.zza;
            String str2 = C3426d4.i.C;
            if (i10 > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i11 = zzbkhVar.zzh;
                if (i11 == 1) {
                    str = "any";
                } else if (i11 == 2) {
                    str = C3426d4.i.C;
                } else if (i11 != 3) {
                    str = i11 != 4 ? "unknown" : "square";
                } else {
                    str = C3426d4.i.D;
                }
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i12 = zzbkhVar.zzc;
            if (i12 == 0) {
                str2 = "any";
            } else if (i12 == 1) {
                str2 = C3426d4.i.D;
            } else if (i12 != 2) {
                str2 = "unknown";
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", zzbkhVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbkhVar.zzg);
            zzc(bundle);
        }
        PackageInfo packageInfo = this.zzb;
        int i13 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i13 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i13);
        }
        JSONObject jSONObjectZzs = zzgVar.zzs();
        String string = null;
        if (jSONObjectZzs != null && (jSONArrayOptJSONArray = jSONObjectZzs.optJSONArray(zzfjkVar.zzg)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i14 = zzfjkVar.zzl;
        if (i14 > 1) {
            bundle.putInt("max_num_ads", i14);
        }
        zzbqs zzbqsVar = zzfjkVar.zzb;
        if (zzbqsVar != null) {
            String str3 = zzbqsVar.zzc;
            if (TextUtils.isEmpty(str3)) {
                String str4 = "p";
                if (zzbqsVar.zza >= 2) {
                    int i15 = zzbqsVar.zzd;
                    if (i15 == 2 || i15 != 3) {
                        str4 = "l";
                    }
                } else {
                    int i16 = zzbqsVar.zzb;
                    if (i16 == 1) {
                        str4 = "l";
                    } else if (i16 != 2) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 41);
                        sb2.append("Instream ad video aspect ratio ");
                        sb2.append(i16);
                        sb2.append(" is wrong.");
                        com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2.toString());
                        str4 = "l";
                    }
                }
                bundle.putString("ia_var", str4);
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzno)).booleanValue() || zzbkhVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbkhVar.zzf;
        if (zzgaVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzgaVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzgaVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzgaVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbkhVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbkhVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzdah zzdahVar = (zzdah) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzdahVar.zzb);
    }
}
