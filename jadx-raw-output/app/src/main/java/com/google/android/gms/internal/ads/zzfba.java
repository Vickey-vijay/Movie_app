package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfba {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfoo zzd;
    private final zzdxz zze;
    private long zzf = 0;

    @GuardedBy("this")
    private int zzg = 0;

    public zzfba(Context context, Executor executor, Set set, zzfoo zzfooVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfooVar;
        this.zze = zzdxzVar;
    }

    public final q5.i zza(final Object obj, @Nullable final Bundle bundle, final boolean z10) {
        zzfoe zzfoeVarZzn = zzfoe.zzn(this.zza, 8);
        zzfoeVarZzn.zza();
        Set<zzfax> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbgv zzbgvVar = zzbhe.zznh;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).split(StringUtils.COMMA));
        }
        List list = arrayList2;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof zzdah) {
                bundle.putLong(zzdxh.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdxh.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzfax zzfaxVar : set) {
            if (!list.contains(String.valueOf(zzfaxVar.zzb()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                q5.i iVarZza = zzfaxVar.zza();
                iVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfay
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb(jElapsedRealtime, zzfaxVar, bundle2);
                    }
                }, zzcei.zzg);
                arrayList.add(iVarZza);
            }
        }
        q5.i iVarZza2 = zzgzo.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfav zzfavVar = (zzfav) ((q5.i) it.next()).get();
                    if (zzfavVar != null) {
                        boolean z11 = z10;
                        zzfavVar.zza(obj2);
                        if (z11) {
                            zzfavVar.zzb(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof zzdah) {
                        bundle3.putLong(zzdxh.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdxh.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfor.zza()) {
            zzfon.zzd(iVarZza2, this.zzd, zzfoeVarZzn);
        }
        return iVarZza2;
    }

    public final /* synthetic */ void zzb(long j10, zzfax zzfaxVar, Bundle bundle) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j10;
        if (((Boolean) zzbjg.zza.zze()).booleanValue()) {
            String strZza = zzgrt.zza(zzfaxVar.getClass().getCanonicalName());
            StringBuilder sb2 = new StringBuilder(strZza.length() + 25 + String.valueOf(jElapsedRealtime).length());
            sb2.append("Signal runtime (ms) : ");
            sb2.append(strZza);
            sb2.append(" = ");
            sb2.append(jElapsedRealtime);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcQ)).booleanValue()) {
                synchronized (this) {
                    int iZzb = zzfaxVar.zzb();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                    sb3.append("sig");
                    sb3.append(iZzb);
                    bundle.putLong(sb3.toString(), jElapsedRealtime);
                }
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcI)).booleanValue()) {
            return;
        }
        zzdxy zzdxyVarZza = this.zze.zza();
        zzdxyVarZza.zzc("action", "lat_ms");
        zzdxyVarZza.zzc("lat_grp", "sig_lat_grp");
        zzdxyVarZza.zzc("lat_id", String.valueOf(zzfaxVar.zzb()));
        zzdxyVarZza.zzc("clat_ms", String.valueOf(jElapsedRealtime));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcJ)).booleanValue()) {
            synchronized (this) {
                this.zzg++;
            }
            zzdxyVarZza.zzc("seq_num", com.google.android.gms.ads.internal.zzt.zzh().zzr().zzm());
            synchronized (this) {
                if (this.zzg == this.zzb.size() && this.zzf != 0) {
                    this.zzg = 0;
                    String strValueOf = String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzf);
                    if (zzfaxVar.zzb() > 39 && zzfaxVar.zzb() < 52) {
                        zzdxyVarZza.zzc("lat_gmssg", strValueOf);
                    } else {
                        zzdxyVarZza.zzc("lat_clsg", strValueOf);
                    }
                }
            }
        }
        zzdxyVarZza.zzh();
    }
}
