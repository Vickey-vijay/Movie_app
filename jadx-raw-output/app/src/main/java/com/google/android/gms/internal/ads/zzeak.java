package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.Z7;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzeak {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdvp zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdyk zzl;
    private final VersionInfoParcel zzm;
    private final zzdil zzo;
    private final zzfor zzp;
    private boolean zza = false;
    private boolean zzb = false;

    @GuardedBy("this")
    private boolean zzc = false;
    private final zzcen zze = new zzcen();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    private final synchronized q5.i zzu() {
        String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
        if (!TextUtils.isEmpty(strZzd)) {
            return zzgzo.zza(strZzd);
        }
        final zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzead
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzcenVar);
            }
        });
        return zzcenVar;
    }

    public final void zza() {
        this.zzq = false;
    }

    public final boolean zze() {
        return this.zzb;
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzd));
            this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    public final /* synthetic */ void zzi(Object obj, zzcen zzcenVar, String str, long j10, zzfoe zzfoeVar) {
        synchronized (obj) {
            if (!zzcenVar.isDone()) {
                zzm(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j10));
                this.zzl.zzc(str, "timeout");
                this.zzo.zzc(str, "timeout");
                zzfor zzforVar = this.zzp;
                zzfoeVar.zzk(AndroidInitializeBoldSDK.MSG_TIMEOUT);
                zzfoeVar.zzd(false);
                zzforVar.zzb(zzfoeVar.zzm());
                zzcenVar.zzc(Boolean.FALSE);
            }
        }
    }

    public final /* synthetic */ void zzn(boolean z10) {
        this.zzc = true;
    }

    public final /* synthetic */ long zzo() {
        return this.zzd;
    }

    public final /* synthetic */ zzcen zzp() {
        return this.zze;
    }

    public final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    public final /* synthetic */ zzdyk zzr() {
        return this.zzl;
    }

    public final /* synthetic */ zzdil zzs() {
        return this.zzo;
    }

    public final /* synthetic */ zzfor zzt() {
        return this.zzp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzbqg(str, z10, i10, str2));
    }

    public final void zzb(final zzbqn zzbqnVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzbqnVar.zzb(this.zza.zzd());
                } catch (RemoteException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbjk.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzct)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zze();
                    this.zzo.zze();
                    zzcen zzcenVar = this.zze;
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeac
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzf();
                        }
                    };
                    Executor executor = this.zzi;
                    zzcenVar.addListener(runnable, executor);
                    this.zza = true;
                    q5.i iVarZzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeae
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzh();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcv)).longValue(), TimeUnit.SECONDS);
                    zzgzo.zzr(iVarZzu, new zzeaa(this), executor);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbqg zzbqgVar = (zzbqg) map.get(str);
            arrayList.add(new zzbqg(str, zzbqgVar.zzb, zzbqgVar.zzc, zzbqgVar.zzd));
        }
        return arrayList;
    }

    public final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    public final /* synthetic */ void zzg(final zzcen zzcenVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
                boolean zIsEmpty = TextUtils.isEmpty(strZzd);
                zzcen zzcenVar2 = zzcenVar;
                if (!zIsEmpty) {
                    zzcenVar2.zzc(strZzd);
                } else {
                    zzcenVar2.zzd(new Exception());
                }
            }
        });
    }

    public final /* synthetic */ Object zzj(zzfoe zzfoeVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfoeVar.zzd(true);
        this.zzp.zzb(zzfoeVar.zzm());
        return null;
    }

    public final /* synthetic */ void zzk(String str, zzbqk zzbqkVar, zzfki zzfkiVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbqkVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfkiVar.zzA(context, zzbqkVar, list);
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            }
        } catch (RemoteException e11) {
            throw new zzgsa(e11);
        } catch (zzfjr unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 74);
            sb2.append("Failed to initialize adapter. ");
            sb2.append(str);
            sb2.append(" does not implement the initialize() method.");
            zzbqkVar.zzf(sb2.toString());
        }
    }

    public final /* synthetic */ void zzl(String str) {
        Context context = this.zzf;
        int i10 = 5;
        final zzfoe zzfoeVarZzn = zzfoe.zzn(context, 5);
        zzfoeVarZzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfoe zzfoeVarZzn2 = zzfoe.zzn(context, i10);
                zzfoeVarZzn2.zza();
                zzfoeVarZzn2.zzi(next);
                final Object obj = new Object();
                final zzcen zzcenVar = new zzcen();
                q5.i iVarZzi = zzgzo.zzi(zzcenVar, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcu)).longValue(), TimeUnit.SECONDS, this.zzk);
                this.zzl.zza(next);
                this.zzo.zza(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                Context context2 = context;
                JSONObject jSONObject2 = jSONObject;
                iVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi(obj, zzcenVar, next, jElapsedRealtime, zzfoeVarZzn2);
                    }
                }, this.zzi);
                arrayList.add(iVarZzi);
                final zzeab zzeabVar = new zzeab(this, obj, next, jElapsedRealtime, zzfoeVarZzn2, zzcenVar);
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                            String strOptString = jSONObject3.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbqq(strOptString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzm(next, false, "", 0);
                try {
                    final zzfki zzfkiVarZza = this.zzh.zza(next, new JSONObject());
                    this.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeah
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzk(next, zzeabVar, zzfkiVarZza, arrayList2);
                        }
                    });
                } catch (zzfjr e10) {
                    try {
                        String string = "Failed to create Adapter.";
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzox)).booleanValue()) {
                            String message = e10.getMessage();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 26);
                            sb2.append("Failed to create Adapter.");
                            sb2.append(Z7.f27998r);
                            sb2.append(message);
                            string = sb2.toString();
                        }
                        zzeabVar.zzf(string);
                    } catch (RemoteException e11) {
                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
                    }
                }
                jSONObject = jSONObject2;
                context = context2;
                i10 = 5;
            }
            zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeag
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zzj(zzfoeVarZzn);
                    return null;
                }
            }, this.zzi);
        } catch (JSONException e12) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e12);
            this.zzo.zzd("MalformedJson");
            this.zzl.zzd("MalformedJson");
            this.zze.zzd(e12);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e12, "AdapterInitializer.updateAdapterStatus");
            zzfor zzforVar = this.zzp;
            zzfoeVarZzn.zzj(e12);
            zzfoeVarZzn.zzd(false);
            zzforVar.zzb(zzfoeVarZzn.zzm());
        }
    }

    public zzeak(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdvp zzdvpVar, ScheduledExecutorService scheduledExecutorService, zzdyk zzdykVar, VersionInfoParcel versionInfoParcel, zzdil zzdilVar, zzfor zzforVar) {
        this.zzh = zzdvpVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdykVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdilVar;
        this.zzp = zzforVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }
}
