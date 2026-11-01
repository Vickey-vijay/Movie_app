package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.browser.customtabs.CustomTabsClient;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbou implements zzboh {

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;

    @Nullable
    private final zzdxz zzb;

    @Nullable
    private final zzbwr zzd;

    @Nullable
    private final zzeiu zze;

    @Nullable
    private final zzcrv zzf;

    @Nullable
    private final zzdae zzg;

    @Nullable
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzh = null;
    private final zzgzy zzi = zzcei.zzg;

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    @VisibleForTesting
    public static Uri zzd(Context context, zzazh zzazhVar, Uri uri, View view, @Nullable Activity activity, @Nullable zzfjo zzfjoVar) {
        if (zzazhVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzfjoVar == null) {
                if (zzazhVar.zze(uri)) {
                    uri = zzazhVar.zzd(uri, context, view, activity);
                }
            } else if (zzazhVar.zze(uri)) {
                uri = zzfjoVar.zza(uri, context, view, activity);
            }
        } catch (zzazi unused) {
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    @VisibleForTesting
    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            String strValueOf = String.valueOf(uri.toString());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e10);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:133:0x0366  */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzf(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean zZzb;
        HashMap map2;
        boolean z10;
        zzdae zzdaeVar;
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        zzfir zzfirVarZzC = zzcjlVar.zzC();
        zzfiu zzfiuVarZzaC = zzcjlVar.zzaC();
        boolean zZza = false;
        if (zzfirVarZzC == null || zzfiuVarZzaC == null) {
            str3 = "";
            zZzb = false;
        } else {
            String str4 = zzfiuVarZzaC.zzb;
            zZzb = zzfirVarZzC.zzb();
            str3 = str4;
        }
        boolean z11 = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmh)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z12 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoj)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcjlVar.zzW()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((zzclb) zzaVar).zzaI(zzb(map), zzc(map), z11);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            boolean z13 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznr)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzclb) zzaVar).zzaJ(zzb(map), zzc(map), str, z11, z13);
                return;
            } else {
                ((zzclb) zzaVar).zzaK(zzb(map), zzc(map), (String) map.get(CreativeInfo.f44315al), (String) map.get("baseurl"), z11);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcjlVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfF)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzg(10);
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfz)).booleanValue()) {
                    String packageName = CustomTabsClient.getPackageName(context, null);
                    if (packageName != null && !context.getPackageName().equals(packageName)) {
                        zZza = true;
                    }
                } else {
                    zZza = zzbif.zza(context);
                }
                if (zZza) {
                    zzl(true);
                    if (TextUtils.isEmpty(str)) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot open browser with null or empty url");
                        zzg(7);
                        return;
                    }
                    Uri uriZze = zze(zzd(zzcjlVar.getContext(), zzcjlVar.zzS(), Uri.parse(str), zzcjlVar.zzE(), zzcjlVar.zzj(), zzcjlVar.zzT()));
                    if (zZzb && this.zze != null && zzi(zzaVar, zzcjlVar.getContext(), uriZze.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbor(this);
                    zzclb zzclbVar = (zzclb) zzaVar;
                    String string = uriZze.toString();
                    com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzh;
                    Bundle bundle = new Bundle();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfE)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e10) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct initial height parameter.", e10);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e11) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct close button position parameter.", e11);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e11, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                    }
                    zzclbVar.zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, string, null, null, null, null, null, null, ObjectWrapper.wrap(zzaaVar).asBinder(), true, bundle), z11, z12, str3);
                    return;
                }
                zzg(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzk(zzaVar, map, zZzb, str3, z11, z12);
            return;
        }
        if (MBridgeConstans.DYNAMIC_VIEW_WX_APP.equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzk(zzaVar, map, zZzb, str3, z11, z12);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjA)).booleanValue()) {
                zzl(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (zZzb && this.zze != null && zzi(zzaVar, zzcjlVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzcjlVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzclb) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z11, z12, str3);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzl(true);
        String str6 = (String) map.get("intent_url");
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e12) {
                String strValueOf = String.valueOf(str6);
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e12);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZze2 = zze(zzd(zzcjlVar.getContext(), zzcjlVar.zzS(), data, zzcjlVar.zzE(), zzcjlVar.zzj(), zzcjlVar.zzT()));
                if (TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriZze2);
                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjB)).booleanValue()) {
                    intent.setDataAndType(uriZze2, intent.getType());
                } else {
                    intent.setData(uriZze2);
                }
            }
        }
        boolean z14 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjW)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoo)).booleanValue() && (zzdaeVar = this.zzg) != null) {
            zzdaeVar.zzl();
        }
        HashMap map3 = new HashMap();
        if (z14) {
            map2 = map3;
            this.zzh = new zzbos(this, z11, zzaVar, map3, map);
            z10 = false;
        } else {
            map2 = map3;
            z10 = z11;
        }
        if (intent != null) {
            if (!zZzb || this.zze == null || !zzi(zzaVar, zzcjlVar.getContext(), intent.getData().toString(), str3)) {
                ((zzclb) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z10, z12, str3);
                return;
            } else {
                if (z14) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbrd) zzaVar).zze("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        boolean z15 = z12;
        String string2 = !TextUtils.isEmpty(str) ? zze(zzd(zzcjlVar.getContext(), zzcjlVar.zzS(), Uri.parse(str), zzcjlVar.zzE(), zzcjlVar.zzj(), zzcjlVar.zzT())).toString() : str;
        if (!zZzb || this.zze == null || !zzi(zzaVar, zzcjlVar.getContext(), string2, str3)) {
            ((zzclb) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), string2, (String) map.get(InneractiveMediationDefs.GENDER_MALE), (String) map.get("p"), (String) map.get("c"), (String) map.get(InneractiveMediationDefs.GENDER_FEMALE), (String) map.get("e"), this.zzh), z10, z15, str3);
        } else if (z14) {
            map2.put((String) map.get(r5), Boolean.TRUE);
            ((zzbrd) zzaVar).zze("openIntentAsync", map2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjQ)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjL)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjK)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbou.zzi(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzj(Context context, String str, String str2) {
        zzeiu zzeiuVar = this.zze;
        zzeiuVar.zzd(str);
        zzdxz zzdxzVar = this.zzb;
        if (zzdxzVar != null) {
            zzejf.zzk(context, zzdxzVar, zzeiuVar, str, "dialog_not_shown", zzgui.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x015c A[PHI: r22
  0x015c: PHI (r22v2 java.util.ArrayList) = (r22v1 java.util.ArrayList), (r22v1 java.util.ArrayList), (r22v1 java.util.ArrayList), (r22v3 java.util.ArrayList) binds: [B:32:0x0112, B:33:0x0114, B:35:0x011a, B:66:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    private final void zzk(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z10, String str, boolean z11, boolean z12) {
        ?? r10;
        ArrayList arrayList;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzb;
        Intent intentZzd;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z13 = true;
        zzl(true);
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        Context context = zzcjlVar.getContext();
        zzazh zzazhVarZzS = zzcjlVar.zzS();
        View viewZzE = zzcjlVar.zzE();
        zzfjo zzfjoVarZzT = zzcjlVar.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String str2 = (String) map.get("u");
        Object objBuild = null;
        if (TextUtils.isEmpty(str2)) {
            r10 = objBuild;
        } else {
            Uri uriZze = zze(zzd(context, zzazhVarZzS, Uri.parse(str2), viewZzE, null, zzfjoVarZzT));
            boolean z14 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z15 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfv)).booleanValue()) {
                    z13 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriZze.getScheme())) {
                objBuild = uriZze.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriZze.getScheme())) {
                objBuild = uriZze.buildUpon().scheme("http").build();
            }
            ?? r11 = objBuild;
            ArrayList arrayList2 = new ArrayList();
            Intent intentZza = zzbot.zza(uriZze, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
            Intent intentZza2 = zzbot.zza(r11, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
            if (z13) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzs(context, intentZza);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzs(context, intentZza2);
            }
            ArrayList arrayList3 = arrayList2;
            ResolveInfo resolveInfoZzc = zzbot.zzc(intentZza, arrayList2, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
            if (resolveInfoZzc != null) {
                objBuild = zzbot.zzd(intentZza, resolveInfoZzc, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
            } else if (intentZza2 == null || (resolveInfoZzb = zzbot.zzb(intentZza2, context, zzazhVarZzS, viewZzE, zzfjoVarZzT)) == null) {
                r10 = intentZzd;
                if (!arrayList3.isEmpty()) {
                    if (z15 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        arrayList = arrayList3;
                        if (z14) {
                            objBuild = zzbot.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                        }
                    } else {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                ArrayList arrayList4 = arrayList3;
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList4.get(i10);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (!it.hasNext()) {
                                        arrayList3 = arrayList4;
                                        i10 = i11;
                                    } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        objBuild = zzbot.zzd(intentZza, resolveInfo, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                                    }
                                }
                            } else {
                                arrayList = arrayList3;
                                if (z14) {
                                    objBuild = zzbot.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                                }
                            }
                        }
                    }
                }
                r10 = intentZza;
            } else {
                intentZzd = zzbot.zzd(intentZza, resolveInfoZzb, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                if (zzbot.zzb(intentZzd, context, zzazhVarZzS, viewZzE, zzfjoVarZzT) == null) {
                    r10 = intentZzd;
                    if (!arrayList3.isEmpty()) {
                        if (z15) {
                            arrayList = arrayList3;
                            if (z14) {
                                objBuild = zzbot.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                            }
                        } else {
                            arrayList = arrayList3;
                            if (z14) {
                                objBuild = zzbot.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                            }
                        }
                    }
                    r10 = intentZza;
                }
            }
            r10 = objBuild;
        }
        if (!z10 || this.zze == null || r10 == 0) {
            zzaVar2 = zzaVar;
        } else {
            zzaVar2 = zzaVar;
            if (zzi(zzaVar2, zzcjlVar.getContext(), r10.getData().toString(), str)) {
                return;
            }
        }
        try {
            ((zzclb) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(r10, this.zzh), z11, z12, str);
        } catch (ActivityNotFoundException e10) {
            String message = e10.getMessage();
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
        }
    }

    private final void zzl(boolean z10) {
        zzbwr zzbwrVar = this.zzd;
        if (zzbwrVar != null) {
            zzbwrVar.zzb(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i10) {
        zzdxz zzdxzVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfy)).booleanValue() || (zzdxzVar = this.zzb) == null) {
            return;
        }
        zzdxy zzdxyVarZza = zzdxzVar.zza();
        zzdxyVarZza.zzc("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdxyVarZza.zzc("cct_open_status", str);
        zzdxyVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcrv zzcrvVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        if (zzcjlVar.zzC() != null) {
            map2 = zzcjlVar.zzC().zzaw;
        }
        String strZza = zzccs.zza(str, zzcjlVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzgzo.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar = this.zzf) != null && zzcrv.zzc(strZza)) ? zzcrvVar.zzb(strZza, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgzo.zza(strZza), new zzboq(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(strZza);
        }
    }

    public zzbou(com.google.android.gms.ads.internal.zzb zzbVar, zzbwr zzbwrVar, zzeiu zzeiuVar, zzdxz zzdxzVar, zzcrv zzcrvVar, zzdae zzdaeVar) {
        this.zza = zzbVar;
        this.zzd = zzbwrVar;
        this.zze = zzeiuVar;
        this.zzb = zzdxzVar;
        this.zzf = zzcrvVar;
        this.zzg = zzdaeVar;
    }
}
