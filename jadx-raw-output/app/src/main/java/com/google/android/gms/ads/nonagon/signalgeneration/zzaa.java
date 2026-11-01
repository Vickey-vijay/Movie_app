package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjk;
import com.google.android.gms.internal.ads.zzfot;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaa {
    public static boolean zza(zzfjc zzfjcVar) {
        return zzg(zzfjcVar.zza.zza) != 1;
    }

    public static int zzg(zzfjk zzfjkVar) {
        if (zzfjkVar.zzs) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjkVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    @Nullable
    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    public static zzfot zzd(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string) {
            case "requester_type_0":
                return zzfot.SCAR_REQUEST_TYPE_ADMOB;
            case "requester_type_1":
                return zzfot.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case "requester_type_2":
                return zzfot.SCAR_REQUEST_TYPE_GBID;
            case "requester_type_3":
                return zzfot.SCAR_REQUEST_TYPE_GOLDENEYE;
            case "requester_type_4":
                return zzfot.SCAR_REQUEST_TYPE_YAVIN;
            case "requester_type_5":
                return zzfot.SCAR_REQUEST_TYPE_UNITY;
            case "requester_type_6":
                return zzfot.SCAR_REQUEST_TYPE_PAW;
            case "requester_type_7":
                return zzfot.SCAR_REQUEST_TYPE_GUILDER;
            case "requester_type_8":
                return zzfot.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    public static void zze(final zzdye zzdyeVar, @Nullable zzdxt zzdxtVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            final zzdxt zzdxtVar2 = null;
            zzcei.zza.execute(new Runnable(zzdxtVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                private final /* synthetic */ String zzb;
                private final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaa.zzf(this.zza, null, this.zzb, this.zzc);
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    public static String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return ExifInterface.GPS_MEASUREMENT_3D;
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return CampaignEx.CLICKMODE_ON;
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return Gc.f26641e;
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    public static /* synthetic */ void zzf(zzdye zzdyeVar, zzdxt zzdxtVar, String str, Pair[] pairArr) {
        ConcurrentHashMap concurrentHashMapZzd = zzdyeVar.zzd();
        zzh(concurrentHashMapZzd, "action", str);
        for (Pair pair : pairArr) {
            zzh(concurrentHashMapZzd, (String) pair.first, (String) pair.second);
        }
        zzdyeVar.zzb(concurrentHashMapZzd);
    }

    private static void zzh(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
