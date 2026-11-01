package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzgah;
import com.google.android.gms.internal.ads.zzgal;
import com.google.android.gms.internal.ads.zzgam;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzb {
    private final Context zza;
    private final zzd zzb;
    private final long zzc;
    private final ScheduledExecutorService zzd;

    @Nullable
    private final PackageInfo zze;

    public zzb(Context context, long j10, @Nullable PackageInfo packageInfo, zzd zzdVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzc = j10;
        this.zze = packageInfo;
        this.zzb = zzdVar;
        this.zzd = scheduledExecutorService;
    }

    public static String zzc(@Nullable String str) {
        return str == null ? "" : com.google.android.gms.ads.internal.util.zzs.zzl(str, "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2");
    }

    private final boolean zze() {
        return this.zzb.zzj().size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziD)).intValue();
    }

    private static final void zzf(Bundle bundle, zzdxh zzdxhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziE)).booleanValue()) {
            bundle.putLong(zzdxhVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }

    private static final void zzg(Bundle bundle, int i10) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i10 - 1);
    }

    @Nullable
    public final zzbj zzb(zzcdh zzcdhVar, final zzau zzauVar, Bundle bundle) {
        zzf(bundle, zzdxh.SIGNAL_ON_DISK_VALIDATION_START);
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx()) {
            this.zzb.zzi();
            zzg(bundle, 7);
        } else {
            PackageInfo packageInfo = this.zze;
            if (packageInfo != null) {
                zzd zzdVar = this.zzb;
                Context context = this.zza;
                String strZze = zzdVar.zze();
                int iZzf = zzdVar.zzf();
                String strZzg = zzdVar.zzg();
                int iZzh = zzdVar.zzh();
                if (TextUtils.equals(context.getApplicationInfo().packageName, strZze) && iZzf == packageInfo.versionCode && TextUtils.equals(Build.MODEL, strZzg) && iZzh == Build.VERSION.SDK_INT) {
                    for (Map.Entry entry : zzdVar.zzj().entrySet()) {
                        try {
                            long j10 = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j10 <= ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziC)).longValue()) {
                                zzgah zzgahVarZzi = zzgal.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                                zzgah zzgahVarZzi2 = zzgam.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzed)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                                if ((zzgahVarZzi.zzb() == -1 || zzgahVarZzi.zzb() <= j10) && (zzgahVarZzi2.zzb() == -1 || zzgahVarZzi2.zzb() <= j10)) {
                                }
                            }
                            zzdVar.zzb((String) entry.getKey());
                        } catch (IOException | JSONException unused) {
                        }
                    }
                } else {
                    zzdVar.zzi();
                    zzdVar.zzd(context.getApplicationInfo().packageName, packageInfo.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
                }
                zzf(bundle, zzdxh.SIGNAL_ON_DISK_VALIDATION_END);
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzc > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziz)).longValue()) {
                    zzg(bundle, 2);
                    return null;
                }
                zzf(bundle, zzdxh.SIGNAL_ON_DISK_CACHE_KEY_START);
                String str = zzcdhVar.zza;
                String str2 = zzcdhVar.zzb;
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzcdhVar.zzd;
                String string = zzmVar.zzn.toString();
                String string2 = zzmVar.zzc.toString();
                String str3 = zzmVar.zzi;
                String str4 = zzmVar.zzp;
                String strValueOf = String.valueOf(zzmVar.zzo);
                int length = String.valueOf(str).length();
                int length2 = String.valueOf(str2).length();
                int length3 = String.valueOf(string).length();
                int length4 = String.valueOf(string2).length();
                int length5 = String.valueOf(str3).length();
                StringBuilder sb2 = new StringBuilder(length + length2 + length3 + length4 + length5 + String.valueOf(str4).length() + strValueOf.length());
                sb2.append(str);
                sb2.append(str2);
                sb2.append(string);
                sb2.append(string2);
                sb2.append(str3);
                sb2.append(str4);
                sb2.append(strValueOf);
                final String strZzg2 = com.google.android.gms.ads.internal.util.client.zzf.zzg(sb2.toString());
                if (TextUtils.isEmpty(strZzg2)) {
                    zzg(bundle, 3);
                    return null;
                }
                zzf(bundle, zzdxh.SIGNAL_ON_DISK_CACHE_KEY_END);
                zzf(bundle, zzdxh.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                String strZzb = this.zzb.zzb(strZzg2);
                zzf(bundle, zzdxh.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                if (!zze()) {
                    final zzcdh zzcdhVar2 = new zzcdh(str, str2, zzcdhVar.zzc, zzmVar, 2, strZzg2);
                    this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzd(strZzg2, zzauVar, zzcdhVar2);
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziB)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (TextUtils.isEmpty(strZzb)) {
                    zzg(bundle, 4);
                    return null;
                }
                zzf(bundle, zzdxh.SIGNAL_ON_DISK_DECODE_START);
                try {
                    JSONObject jSONObject = new JSONObject(strZzb);
                    String string3 = jSONObject.getString("sr");
                    if (TextUtils.isEmpty(string3)) {
                        zzg(bundle, 8);
                        return null;
                    }
                    String string4 = jSONObject.getString("rs");
                    if (TextUtils.isEmpty(string4)) {
                        zzg(bundle, 9);
                        return null;
                    }
                    String strZzc = zzc(new String(Base64.decode(string4, 10), StandardCharsets.UTF_8));
                    zzf(bundle, zzdxh.SIGNAL_ON_DISK_DECODE_END);
                    try {
                        zzbj zzbjVar = new zzbj(new JsonReader(new StringReader(string3)), null);
                        zzbjVar.zzc = strZzc;
                        zzbjVar.zze = bundle;
                        bundle.putBoolean("sod_h", true);
                        return zzbjVar;
                    } catch (IOException e10) {
                        zzg(bundle, 6);
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "DiskCachingManager.getSignalResponse");
                        return null;
                    }
                } catch (JSONException e11) {
                    zzg(bundle, 5);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e11, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            }
            this.zzb.zzi();
            zzg(bundle, 10);
        }
        return null;
    }

    public final /* synthetic */ void zzd(String str, zzau zzauVar, zzcdh zzcdhVar) {
        if (this.zzb.zzc(str) || zze()) {
            return;
        }
        zzauVar.zze(ObjectWrapper.wrap(this.zza), zzcdhVar, null);
    }

    public final void zza(@Nullable String str, @Nullable zzbj zzbjVar) {
        String string;
        if (!TextUtils.isEmpty(str) && !zze()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("params", zzbjVar.zza);
                jSONObject2.put("signal_dictionary", com.google.android.gms.ads.internal.client.zzbb.zza().zzm(zzbjVar.zzf));
                jSONObject.put("sr", jSONObject2);
                String str2 = zzbjVar.zzc;
                if (TextUtils.isEmpty(str2)) {
                    string = "";
                } else {
                    jSONObject.put("rs", Base64.encodeToString(zzc(str2).getBytes(StandardCharsets.UTF_8), 10));
                    jSONObject.put("ts_ms", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    string = jSONObject.toString();
                }
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "DiskCachingManager.createStringToWrite");
            }
            if (!TextUtils.isEmpty(string)) {
                this.zzb.zza(str, string);
            }
        }
    }
}
