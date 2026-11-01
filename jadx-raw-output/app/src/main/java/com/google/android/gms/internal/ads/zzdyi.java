package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzdyi {
    public final Map zza;
    public final Context zzb;
    public final Executor zzc;
    public final com.google.android.gms.ads.internal.util.client.zzu zzd;
    public final boolean zze;
    private final CsiUrlBuilder zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    public final void zzb(Map map) {
        zza(map, false);
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    private final void zzi(Map map) {
        if (map == null || map.isEmpty()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null paramMap.");
            return;
        }
        if (!this.zzi.getAndSet(true)) {
            final String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlX);
            this.zzj.set(com.google.android.gms.ads.internal.util.zzac.zzc(this.zzb, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdyg
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    this.zza.zzh(str, sharedPreferences, str2);
                }
            }));
        }
        Bundle bundle = (Bundle) this.zzj.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final String zzc(Map map) {
        return this.zzf.generateUrl(map);
    }

    public final ConcurrentHashMap zzd() {
        return new ConcurrentHashMap(this.zza);
    }

    public final /* synthetic */ void zzh(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzj.set(com.google.android.gms.ads.internal.util.zzac.zzb(this.zzb, str));
    }

    public zzdyi(Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = zzuVar;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcD)).booleanValue();
        this.zzf = csiUrlBuilder;
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcI)).booleanValue();
        this.zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhS)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map, boolean z10) {
        if (map.isEmpty()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return;
        }
        zzi(map);
        final String strGenerateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        boolean z11 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z10 || this.zzg) {
                if (!z11 || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyf
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzd.zzc(strGenerateUrl, null);
                        }
                    });
                }
            }
        }
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zzf(Map map) {
        if (map.isEmpty()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        String strGenerateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        return this.zzd.zzc(strGenerateUrl, null);
    }

    public final void zzg(Map map) {
        if (map.isEmpty()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return;
        }
        zzi(map);
        final String strGenerateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoF)).booleanValue() && !this.zze) {
            return;
        }
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd.zzc(strGenerateUrl, null);
            }
        });
    }
}
