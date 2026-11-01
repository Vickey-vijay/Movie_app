package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbog {
    public static final zzboh zza = new zzboh() { // from class: com.google.android.gms.internal.ads.zzbof
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzckx zzckxVar = (zzckx) obj;
            zzboh zzbohVar = zzbog.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(StringUtils.COMMA);
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzckxVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z10 = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                map2.put(str2, boolValueOf);
                StringBuilder sb2 = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
                sb2.append("/canOpenURLs;");
                sb2.append(str2);
                sb2.append(";");
                sb2.append(boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            }
            ((zzbrd) zzckxVar).zze("openableURLs", map2);
        }
    };
    public static final zzboh zzb = new zzboh() { // from class: com.google.android.gms.internal.ads.zzbnw
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzckx zzckxVar = (zzckx) obj;
            zzboh zzbohVar = zzbog.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjA)).booleanValue()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzckxVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + boolValueOf.toString().length());
            sb2.append("/canOpenApp;");
            sb2.append(str);
            sb2.append(";");
            sb2.append(boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            ((zzbrd) zzckxVar).zze("openableApp", map2);
        }
    };
    public static final zzboh zzc = new zzboh() { // from class: com.google.android.gms.internal.ads.zzbnx
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzbog.zze((zzckx) obj, map);
        }
    };
    public static final zzboh zzd = new zzbno();
    public static final zzboh zze = new zzbnp();
    public static final zzboh zzf = new zzboh() { // from class: com.google.android.gms.internal.ads.zzboc
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzckx zzckxVar = (zzckx) obj;
            zzboh zzbohVar = zzbog.zza;
            String str = (String) map.get("u");
            if (str == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() && str.isEmpty()) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
            } else {
                zzcjc zzcjcVar = (zzcjc) zzckxVar;
                new com.google.android.gms.ads.internal.util.zzbt(zzckxVar.getContext(), ((zzclf) zzckxVar).zzs().afmaVersion, str, null, zzcjcVar.zzC() != null ? zzcjcVar.zzC().zzax : null).zzb();
            }
        }
    };
    public static final zzboh zzg = new zzbnq();
    public static final zzboh zzh = new zzbnr();
    public static final zzboh zzi = new zzboh() { // from class: com.google.android.gms.internal.ads.zzbod
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzcle zzcleVar = (zzcle) obj;
            zzboh zzbohVar = zzbog.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i10 = Integer.parseInt(str);
                int i11 = Integer.parseInt(str2);
                int i12 = Integer.parseInt(str3);
                zzazh zzazhVarZzS = zzcleVar.zzS();
                if (zzazhVarZzS != null) {
                    zzazhVarZzS.zzb().zze(i10, i11, i12);
                }
            } catch (NumberFormatException unused) {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzboh zzj = new zzbns();
    public static final zzboh zzk = new zzbnt();
    public static final zzboh zzl = new zzchf();
    public static final zzboh zzm = new zzchg();
    public static final zzboh zzn = new zzbna();
    public static final zzboy zzo = new zzboy();
    public static final zzboh zzp = new zzbnu();
    public static final zzboh zzq = new zzbnv();
    public static final zzboh zzr = new zzbnb();
    public static final zzboh zzs = new zzbnc();
    public static final zzboh zzt = new zzbnd();
    public static final zzboh zzu = new zzbne();
    public static final zzboh zzv = new zzbnf();
    public static final zzboh zzw = new zzbng();
    public static final zzboh zzx = new zzbnh();
    public static final zzboh zzy = new zzbni();
    public static final zzboh zzz = new zzbnj();
    public static final zzboh zzA = new zzbnk();
    public static final zzboh zzB = new zzbnm();
    public static final zzboh zzC = new zzbnn();

    public static zzboh zzb(final zzdjm zzdjmVar, final zzcrv zzcrvVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzbob
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzbog.zzc(map, zzdjmVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcrv zzcrvVar2 = zzcrvVar;
                zzgzg zzgzgVarZzw = zzgzg.zzw(zzbog.zza(zzcjlVar, str));
                zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzboe
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ q5.i zza(Object obj2) {
                        zzcrv zzcrvVar3;
                        String str2 = (String) obj2;
                        zzboh zzbohVar = zzbog.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar3 = zzcrvVar2) != null && zzcrv.zzc(str)) ? zzcrvVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgzo.zza(str2);
                    }
                };
                zzgzy zzgzyVar = zzcei.zza;
                zzgzo.zzr((zzgzg) zzgzo.zzj(zzgzgVarZzw, zzgywVar, zzgzyVar), new zzbnl(zzcjlVar), zzgzyVar);
            }
        };
    }

    public static void zzc(Map map, zzdjm zzdjmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmi)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zze(zzckx zzckxVar, Map map) {
        Intent uri;
        PackageManager packageManager = zzckxVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString(InneractiveMediationDefs.GENDER_MALE);
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e10) {
                                String strValueOf = String.valueOf(strOptString7);
                                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e10);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e11) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e11, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e12) {
                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", e12);
                        }
                    } catch (JSONException e13) {
                        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e13);
                    }
                }
                ((zzbrd) zzckxVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbrd) zzckxVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbrd) zzckxVar).zzd("openableIntents", new JSONObject());
        }
    }

    public static q5.i zza(zzcjl zzcjlVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzazh zzazhVarZzS = zzcjlVar.zzS();
            zzfjo zzfjoVarZzT = zzcjlVar.zzT();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() && zzfjoVarZzT != null) {
                if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                    uriZzd = zzfjoVarZzT.zza(uriZzd, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
                }
            } else if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                uriZzd = zzazhVarZzS.zzd(uriZzd, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
            }
        } catch (zzazi unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzcjlVar.zzC() != null) {
            map = zzcjlVar.zzC().zzaw;
        }
        final String strZzb = zzccs.zzb(uriZzd, zzcjlVar.getContext(), map);
        long jLongValue = ((Long) zzbjd.zze.zze()).longValue();
        if (jLongValue > 0 && jLongValue <= 254715000) {
            zzgzg zzgzgVarZzw = zzgzg.zzw(zzcjlVar.zzaF());
            zzbny zzbnyVar = new zzgqt() { // from class: com.google.android.gms.internal.ads.zzbny
                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    zzboh zzbohVar = zzbog.zza;
                    if (!((Boolean) zzbjd.zzi.zze()).booleanValue()) {
                        return "failure_click_attok";
                    }
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "prepareClickUrl.attestation1");
                    return "failure_click_attok";
                }
            };
            zzgzy zzgzyVar = zzcei.zzg;
            return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzg(zzgzgVarZzw, Throwable.class, zzbnyVar, zzgzyVar), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzbnz
                /* JADX WARN: Code duplicated, block: B:16:0x004f  */
                /* JADX WARN: Code duplicated, block: B:19:0x0059  */
                /* JADX WARN: Code duplicated, block: B:21:0x0067  */
                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ Object apply(Object obj) {
                    String str2;
                    String str3;
                    Uri uri;
                    String str4 = (String) obj;
                    zzboh zzbohVar = zzbog.zza;
                    String strReplace = strZzb;
                    if (str4 != null) {
                        if (((Boolean) zzbjd.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(strReplace).getHost();
                            for (int i11 = 0; i11 < 3; i11++) {
                                if (host.endsWith(strArr[i11])) {
                                    str2 = (String) zzbjd.zza.zze();
                                    str3 = (String) zzbjd.zzb.zze();
                                    if (!TextUtils.isEmpty(str2)) {
                                        strReplace = strReplace.replace(str2, str4);
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                        uri = Uri.parse(strReplace);
                                        if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                            break;
                                        }
                                        return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                    }
                                    break;
                                }
                            }
                        } else {
                            str2 = (String) zzbjd.zza.zze();
                            str3 = (String) zzbjd.zzb.zze();
                            if (!TextUtils.isEmpty(str2)) {
                                strReplace = strReplace.replace(str2, str4);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                uri = Uri.parse(strReplace);
                                if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                            }
                        }
                    }
                    return strReplace;
                }
            }, zzgzyVar), Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzboa
                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    zzboh zzbohVar = zzbog.zza;
                    if (((Boolean) zzbjd.zzi.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "prepareClickUrl.attestation2");
                    }
                    return strZzb;
                }
            }, zzgzyVar);
        }
        return zzgzo.zza(strZzb);
    }
}
