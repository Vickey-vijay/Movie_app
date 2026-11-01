package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzchf implements zzboh {
    private boolean zza;

    private static void zzc(zzcfs zzcfsVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcfsVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String str6 = String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(str6);
                return;
            }
        }
        if (str2 != null) {
            zzcfsVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcfsVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcfsVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcfsVar.zzB(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int iMin;
        int iMin2;
        Integer numValueOf;
        int i10;
        zzcge zzcgeVar = (zzcge) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZza = zzcgeVar.zzdm() != null ? zzcgeVar.zzdm().zza() : null;
        int i12 = 0;
        if (numValueOf2 != null && numZza != null && !numValueOf2.equals(numZza) && !str.equals("load")) {
            String str2 = String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numZza);
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(str2);
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb2.append("Video GMSG: ");
            sb2.append(str);
            sb2.append(Z7.f27998r);
            sb2.append(string);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
        }
        if (str.equals(A2.f54950g)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcgeVar.setBackgroundColor(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str4 = (String) map.get("color");
            if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcgeVar.zzv(Color.parseColor(str4));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str5 = (String) map.get("mimeTypes");
            if (str5 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcgeVar.zze("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str5.split(StringUtils.COMMA);
            int length = strArrSplit.length;
            while (i12 < length) {
                String str6 = strArrSplit[i12];
                map3.put(str6, com.google.android.gms.ads.internal.util.zzch.zza(str6.trim()));
                i12++;
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzcgeVar.zze("onVideoEvent", map4);
            return;
        }
        zzcft zzcftVarZzdm = zzcgeVar.zzdm();
        if (zzcftVarZzdm == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals(C3426d4.i.L);
        if (zEquals || zEquals2) {
            Context context = zzcgeVar.getContext();
            int iZzb = zzb(context, map, VastAttributes.HORIZONTAL_POSITION, 0);
            int iZzb2 = zzb(context, map, VastAttributes.VERTICAL_POSITION, 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbgv zzbgvVar = zzbhe.zzeK;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcgeVar.zzy() : Math.min(iZzb3, zzcgeVar.zzy());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzy = zzcgeVar.zzy();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb3).length() + 72 + String.valueOf(iZzy).length() + 4 + String.valueOf(iZzb).length() + 1);
                    sb3.append("Calculate width with original width ");
                    sb3.append(iZzb3);
                    sb3.append(", videoHost.getVideoBoundingWidth() ");
                    sb3.append(iZzy);
                    sb3.append(", x ");
                    sb3.append(iZzb);
                    sb3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                iMin = Math.min(iZzb3, zzcgeVar.zzy() - iZzb);
            }
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcgeVar.zzx() : Math.min(iZzb4, zzcgeVar.zzx());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzx = zzcgeVar.zzx();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb4).length() + 75 + String.valueOf(iZzx).length() + 4 + String.valueOf(iZzb2).length() + 1);
                    sb4.append("Calculate height with original height ");
                    sb4.append(iZzb4);
                    sb4.append(", videoHost.getVideoBoundingHeight() ");
                    sb4.append(iZzx);
                    sb4.append(", y ");
                    sb4.append(iZzb2);
                    sb4.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                }
                iMin2 = Math.min(iZzb4, zzcgeVar.zzx() - iZzb2);
            }
            try {
                i12 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i14 = i12;
            boolean z10 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcftVarZzdm.zzd() != null) {
                zzcftVarZzdm.zzb(iZzb, iZzb2, iMin, iMin2);
                return;
            }
            zzcftVarZzdm.zzc(iZzb, iZzb2, iMin, iMin2, i14, z10, new zzcgd((String) map.get("flags")));
            zzcfs zzcfsVarZzd = zzcftVarZzdm.zzd();
            if (zzcfsVarZzd != null) {
                zzc(zzcfsVarZzd, map);
                return;
            }
            return;
        }
        zzckr zzckrVarZzh = zzcgeVar.zzh();
        if (zzckrVarZzh != null) {
            if (str.equals("timeupdate")) {
                String str7 = (String) map.get("currentTime");
                if (str7 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzckrVarZzh.zzd(Float.parseFloat(str7));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str7));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzckrVarZzh.zzr();
                return;
            }
        }
        zzcfs zzcfsVarZzd2 = zzcftVarZzdm.zzd();
        if (zzcfsVarZzd2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzcgeVar.zze("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzcgeVar.getContext();
            int iZzb5 = zzb(context2, map, VastAttributes.HORIZONTAL_POSITION, 0);
            float fZzb = zzb(context2, map, VastAttributes.VERTICAL_POSITION, 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcfsVarZzd2.zzC(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str8 = (String) map.get("time");
            if (str8 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcfsVarZzd2.zzt((int) (Float.parseFloat(str8) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse time parameter from currentTime video GMSG: ".concat(str8));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcfsVarZzd2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzcfsVarZzd2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcfsVarZzd2.zzq(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzcfsVarZzd2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcfsVarZzd2.zzu();
                return;
            } else {
                zzcfsVarZzd2.zzv();
                return;
            }
        }
        if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
            zzcfsVarZzd2.zzr();
            return;
        }
        if (str.equals("play")) {
            zzcfsVarZzd2.zzs();
            return;
        }
        if (str.equals(C3605n2.f30216v)) {
            zzcfsVarZzd2.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzcgeVar.getContext();
                zzcfsVarZzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcgeVar.zzl();
                this.zza = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    zzcfsVarZzd2.zzD();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str9 = (String) map.get("volume");
            if (str9 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzcfsVarZzd2.zzw(Float.parseFloat(str9));
                return;
            } catch (NumberFormatException unused6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse volume parameter from volume video GMSG: ".concat(str9));
                return;
            }
        }
        String str10 = (String) map.get("src");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcH)).booleanValue() && TextUtils.isEmpty(str10)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                i10 = 1;
            } catch (NumberFormatException unused7) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                i10 = 1;
                numValueOf = null;
            }
        } else {
            i10 = 1;
            numValueOf = null;
        }
        String[] strArr = new String[i10];
        strArr[0] = str10;
        String str11 = (String) map.get("demuxed");
        if (str11 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str11);
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                    String string2 = jSONArray.getString(i15);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcH)).booleanValue() || !TextUtils.isEmpty(string2)) {
                        arrayList.add(string2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcH)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb5 = new StringBuilder(str11.length() + 41);
                    sb5.append("All demuxed URLs are empty for playback: ");
                    sb5.append(str11);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb5.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for playback: ".concat(str11));
                strArr = new String[]{str10};
            }
        }
        if (numValueOf != null) {
            zzcgeVar.zzo(numValueOf.intValue());
        }
        zzcfsVarZzd2.zzo(str10, strArr);
    }

    private static int zzb(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i10 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(str.length() + 34 + str2.length());
                sb2.append("Could not parse ");
                sb2.append(str);
                sb2.append(" in a video GMSG: ");
                sb2.append(str2);
                String string = sb2.toString();
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(length + 30 + String.valueOf(str2).length() + 6 + String.valueOf(i10).length() + 1);
            sb3.append("Parse pixels for ");
            sb3.append(str);
            sb3.append(", got string ");
            sb3.append(str2);
            sb3.append(", int ");
            sb3.append(i10);
            sb3.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
        }
        return i10;
    }
}
