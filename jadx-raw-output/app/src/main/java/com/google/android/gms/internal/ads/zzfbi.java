package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfbi implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final zzecp zzc;

    public zzfbi(zzgzy zzgzyVar, Context context, zzecp zzecpVar) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = zzecpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 38;
    }

    @Nullable
    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0103  */
    /* JADX WARN: Code duplicated, block: B:30:0x0116  */
    /* JADX WARN: Code duplicated, block: B:32:0x0128  */
    /* JADX WARN: Code duplicated, block: B:36:0x013a  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01be  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e6 A[Catch: NameNotFoundException -> 0x01f1, TryCatch #1 {NameNotFoundException -> 0x01f1, blocks: (B:56:0x01d4, B:58:0x01e6, B:60:0x01ec), top: B:78:0x01d4 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x0201  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x005f  */
    public final /* synthetic */ zzfbg zzc() {
        ActivityInfo activityInfo;
        String string;
        String str;
        boolean z10;
        String string2;
        String str2;
        String language;
        String str3;
        String strZza;
        Context context;
        String str4;
        List<ResolveInfo> listQueryIntentActivities;
        boolean zEquals;
        boolean z11;
        String string3;
        Bundle bundle;
        boolean z12;
        boolean z13;
        Context context2 = this.zzb;
        PackageManager packageManager = context2.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        boolean zZzw = com.google.android.gms.ads.internal.util.client.zzf.zzw();
        boolean zIsLatchsky = DeviceProperties.isLatchsky(context2);
        boolean zIsSidewinder = DeviceProperties.isSidewinder(context2);
        String language2 = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i10 = 0; i10 < localeList.size(); i10++) {
            arrayList.add(localeList.get(i10).getLanguage());
        }
        ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoZzd3 == null || (activityInfo = resolveInfoZzd3.activityInfo) == null) {
            string = null;
        } else {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context2).getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo != null) {
                    int i11 = packageInfo.versionCode;
                    String str5 = activityInfo.packageName;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(str5).length());
                    sb2.append(i11);
                    sb2.append(".");
                    sb2.append(str5);
                    string = sb2.toString();
                } else {
                    string = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
            if (packageInfo2 != null) {
                int i12 = packageInfo2.versionCode;
                String str6 = packageInfo2.packageName;
                z10 = true;
                try {
                    str = string;
                    try {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 1 + String.valueOf(str6).length());
                        sb3.append(i12);
                        sb3.append(".");
                        sb3.append(str6);
                        string2 = sb3.toString();
                    } catch (Exception unused2) {
                        string2 = null;
                    }
                } catch (Exception unused3) {
                    str = string;
                }
                str2 = Build.FINGERPRINT;
                language = Locale.getDefault().getLanguage();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoU)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zzq zzqVarZzm = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb);
                    String strZzb = zzqVarZzm.zzb();
                    strZza = zzqVarZzm.zza();
                    str3 = strZzb;
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoT)).booleanValue()) {
                        language = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb).zzb();
                    }
                    str3 = language;
                    strZza = null;
                }
                context = this.zzb;
                if (packageManager == null) {
                    str4 = str2;
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                    ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
                    listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                    if (listQueryIntentActivities == null && resolveInfoResolveActivity != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 < listQueryIntentActivities.size()) {
                                List<ResolveInfo> list = listQueryIntentActivities;
                                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i13).activityInfo.name)) {
                                    zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzikw.zza(context));
                                    break;
                                }
                                i13++;
                                listQueryIntentActivities = list;
                            }
                        }
                    }
                    com.google.android.gms.ads.internal.zzt.zzc();
                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmO)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        if (com.google.android.gms.ads.internal.util.zzs.zzG(context)) {
                            z11 = z10;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmS)).booleanValue()) {
                        try {
                            bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle == null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                                string3 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                            } else {
                                string3 = null;
                            }
                        } catch (PackageManager.NameNotFoundException unused4) {
                        }
                    } else {
                        string3 = "";
                    }
                    if (resolveInfoZzd2 != null) {
                        z12 = z10;
                    } else {
                        z12 = false;
                    }
                    if (resolveInfoZzd != null) {
                        z13 = z10;
                    } else {
                        z13 = false;
                    }
                    return new zzfbg(z13, z12, country, zZzw, zIsLatchsky, zIsSidewinder, language2, arrayList, str, string2, str4, zEquals, Build.MODEL, availableBytes, z11, string3, Build.VERSION.SDK_INT, str3, strZza, this.zzc.zza());
                }
                str4 = str2;
                zEquals = false;
                com.google.android.gms.ads.internal.zzt.zzc();
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmO)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    if (com.google.android.gms.ads.internal.util.zzs.zzG(context)) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmS)).booleanValue()) {
                    bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        string3 = null;
                    } else {
                        string3 = null;
                    }
                } else {
                    string3 = "";
                }
                if (resolveInfoZzd2 != null) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (resolveInfoZzd != null) {
                    z13 = z10;
                } else {
                    z13 = false;
                }
                return new zzfbg(z13, z12, country, zZzw, zIsLatchsky, zIsSidewinder, language2, arrayList, str, string2, str4, zEquals, Build.MODEL, availableBytes2, z11, string3, Build.VERSION.SDK_INT, str3, strZza, this.zzc.zza());
            }
            str = string;
            z10 = true;
        } catch (Exception unused5) {
        }
        string2 = null;
        str2 = Build.FINGERPRINT;
        language = Locale.getDefault().getLanguage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoU)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzq zzqVarZzm2 = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb);
            String strZzb2 = zzqVarZzm2.zzb();
            strZza = zzqVarZzm2.zza();
            str3 = strZzb2;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoT)).booleanValue()) {
                language = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb).zzb();
            }
            str3 = language;
            strZza = null;
        }
        context = this.zzb;
        if (packageManager == null) {
            str4 = str2;
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(intent2, 0);
            listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 65536);
            if (listQueryIntentActivities == null) {
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long availableBytes3 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmO)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzG(context)) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmS)).booleanValue()) {
                bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    string3 = null;
                } else {
                    string3 = null;
                }
            } else {
                string3 = "";
            }
            if (resolveInfoZzd2 != null) {
                z12 = z10;
            } else {
                z12 = false;
            }
            if (resolveInfoZzd != null) {
                z13 = z10;
            } else {
                z13 = false;
            }
            return new zzfbg(z13, z12, country, zZzw, zIsLatchsky, zIsSidewinder, language2, arrayList, str, string2, str4, zEquals, Build.MODEL, availableBytes3, z11, string3, Build.VERSION.SDK_INT, str3, strZza, this.zzc.zza());
        }
        str4 = str2;
        zEquals = false;
        com.google.android.gms.ads.internal.zzt.zzc();
        long availableBytes4 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmO)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzG(context)) {
                z11 = z10;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmS)).booleanValue()) {
            bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                string3 = null;
            } else {
                string3 = null;
            }
        } else {
            string3 = "";
        }
        if (resolveInfoZzd2 != null) {
            z12 = z10;
        } else {
            z12 = false;
        }
        if (resolveInfoZzd != null) {
            z13 = z10;
        } else {
            z13 = false;
        }
        return new zzfbg(z13, z12, country, zZzw, zIsLatchsky, zIsSidewinder, language2, arrayList, str, string2, str4, zEquals, Build.MODEL, availableBytes4, z11, string3, Build.VERSION.SDK_INT, str3, strZza, this.zzc.zza());
    }
}
