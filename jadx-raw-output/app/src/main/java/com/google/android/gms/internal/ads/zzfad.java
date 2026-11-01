package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfad implements zzfax {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfae zzc = new zzfae(new JSONArray().toString(), new Bundle(), "");
    public final String zza;
    private final zzgzy zzd;
    private final ScheduledExecutorService zze;
    private final zzeqk zzf;
    private final Context zzg;
    private final zzfjk zzh;
    private final zzeqf zzi;
    private final zzdvp zzj;
    private final zzeam zzk;
    private final int zzl;

    public zzfad(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, String str, zzeqk zzeqkVar, Context context, zzfjk zzfjkVar, zzeqf zzeqfVar, zzdvp zzdvpVar, zzeam zzeamVar, int i10) {
        this.zzd = zzgzyVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzeqkVar;
        this.zzg = context;
        this.zzh = zzfjkVar;
        this.zzi = zzeqfVar;
        this.zzj = zzdvpVar;
        this.zzk = zzeamVar;
        this.zzl = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 32;
    }

    @Nullable
    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgzg zzh(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzgyv zzgyvVar = new zzgyv() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzgyv
            public final /* synthetic */ q5.i zza() {
                return this.zza.zzd(str, list, bundle, z10, z11);
            }
        };
        zzgzy zzgzyVar = this.zzd;
        zzgzg zzgzgVarZzw = zzgzg.zzw(zzgzo.zzf(zzgyvVar, zzgzyVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcf)).booleanValue()) {
            zzgzgVarZzw = (zzgzg) zzgzo.zzi(zzgzgVarZzw, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbY)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgzg) zzgzo.zzg(zzgzgVarZzw, Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                int i10 = zzfad.zzb;
                String str2 = str;
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoz)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgzyVar);
    }

    private final void zzi(zzbvs zzbvsVar, Bundle bundle, @NonNull List list, zzeqn zzeqnVar) throws RemoteException {
        zzbvsVar.zze(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzeqnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        if (this.zzl == 2) {
            return zzgzo.zza(zzc);
        }
        zzfjk zzfjkVar = this.zzh;
        if (zzfjkVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcl)).split(StringUtils.COMMA)).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfjkVar.zzd)))) {
                return zzgzo.zza(zzc);
            }
        }
        return zzgzo.zzf(new zzgyv() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzgyv
            public final /* synthetic */ q5.i zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    public final /* synthetic */ q5.i zzc() {
        final String str;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmr)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcj)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfc)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcs)).booleanValue()) {
            zzf(arrayList, this.zzf.zzd(this.zza, lowerCase));
        } else {
            zzeqk zzeqkVar = this.zzf;
            for (Map.Entry entry : zzeqkVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzf(arrayList, zzeqkVar.zzb());
        }
        return zzgzo.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzezx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i10 = zzfad.zzb;
                JSONArray jSONArray = new JSONArray();
                for (q5.i iVar : arrayList) {
                    if (((JSONObject) iVar.get()) != null) {
                        jSONArray.put(iVar.get());
                    }
                }
                String str3 = str;
                Bundle bundle = bundleZzg;
                if (jSONArray.length() != 0) {
                    return new zzfae(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfc)).booleanValue()) {
                    return new zzfae(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, this.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final /* synthetic */ q5.i zzd(String str, final List list, final Bundle bundle, boolean z10, boolean z11) throws RemoteException {
        zzbvs zzbvsVarZzb;
        final zzcen zzcenVar = new zzcen();
        if (z11) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzck)).booleanValue()) {
                try {
                    zzbvsVarZzb = this.zzj.zzb(str);
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e10);
                    zzbvsVarZzb = null;
                }
            } else {
                zzeqf zzeqfVar = this.zzi;
                zzeqfVar.zza(str);
                zzbvsVarZzb = zzeqfVar.zzb(str);
            }
        } else {
            zzbvsVarZzb = this.zzj.zzb(str);
        }
        if (zzbvsVarZzb == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzca)).booleanValue()) {
                throw null;
            }
            zzeqn.zzd(str, zzcenVar);
        } else {
            final zzeqn zzeqnVar = new zzeqn(str, zzbvsVarZzb, zzcenVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcf)).booleanValue()) {
                this.zze.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfac
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzeqnVar.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbY)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z10) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcm)).booleanValue()) {
                    final zzbvs zzbvsVar = zzbvsVarZzb;
                    this.zzd.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaa
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze(zzbvsVar, bundle, list, zzeqnVar, zzcenVar);
                        }
                    });
                } else {
                    zzi(zzbvsVarZzb, bundle, list, zzeqnVar);
                }
            } else {
                zzeqnVar.zzb();
            }
        }
        return zzcenVar;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzeqo zzeqoVar = (zzeqo) ((Map.Entry) it.next()).getValue();
            String str = zzeqoVar.zza;
            list.add(zzh(str, Collections.singletonList(zzeqoVar.zze), zzg(str), zzeqoVar.zzb, zzeqoVar.zzc));
        }
    }

    public final /* synthetic */ void zze(zzbvs zzbvsVar, Bundle bundle, List list, zzeqn zzeqnVar, zzcen zzcenVar) {
        try {
            zzi(zzbvsVar, bundle, list, zzeqnVar);
        } catch (RemoteException e10) {
            zzcenVar.zzd(e10);
        }
    }
}
