package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzeny implements zzgyw {
    private final zzfnu zza;
    private final zzdbh zzb;
    private final zzfqg zzc;
    private final zzfqk zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcwi zzg;
    private final zzenr zzh;
    private final zzekl zzi;
    private final Context zzj;
    private final zzfoo zzk;
    private final zzenb zzl;
    private final zzdxt zzm;

    public zzeny(Context context, zzfnu zzfnuVar, zzenr zzenrVar, zzdbh zzdbhVar, zzfqg zzfqgVar, zzfqk zzfqkVar, zzcwi zzcwiVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzekl zzeklVar, zzfoo zzfooVar, zzenb zzenbVar, zzdxt zzdxtVar) {
        this.zzj = context;
        this.zza = zzfnuVar;
        this.zzh = zzenrVar;
        this.zzb = zzdbhVar;
        this.zzc = zzfqgVar;
        this.zzd = zzfqkVar;
        this.zzg = zzcwiVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeklVar;
        this.zzk = zzfooVar;
        this.zzl = zzenbVar;
        this.zzm = zzdxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    public static String zzb(zzfjc zzfjcVar) {
        String string = "No fill.";
        String str = true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgA)).booleanValue() ? "No ad config." : "No fill.";
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        int i10 = zzfiuVar.zzf;
        if (i10 == 0) {
            string = str;
        } else if (i10 >= 200 && i10 < 300) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgz)).booleanValue()) {
                string = str;
            }
        } else if (i10 < 300 || i10 >= 400) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 35);
            sb2.append("Received error HTTP response code: ");
            sb2.append(i10);
            string = sb2.toString();
        } else {
            string = "No location header to follow redirect or too many redirects.";
        }
        zzfit zzfitVar = zzfiuVar.zzj;
        return zzfitVar != null ? zzfitVar.zza() : string;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ q5.i zza(Object obj) throws Exception {
        int i10;
        Bundle bundle;
        final zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzfjcVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcL)).booleanValue()) {
            this.zzm.zze().putLong(zzdxh.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String strZzb = zzb(zzfjcVar);
        zzekl zzeklVar = this.zzi;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzfiu zzfiuVar = zzfjbVar.zzb;
        zzeklVar.zza(zzfiuVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjE)).booleanValue() && (i10 = zzfiuVar.zzf) != 0 && (i10 < 200 || i10 >= 300)) {
            return zzgzo.zzc(new zzenv(3, strZzb));
        }
        String str = zzfiuVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfir zzfirVar : zzfjbVar.zza) {
                zzeklVar.zzb(zzfirVar);
                Iterator it = zzfirVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeklVar.zze(zzfirVar, 0L, zzfkm.zzd(1, null, null));
                        break;
                    }
                    zzekg zzekgVarZza = this.zzg.zza(zzfirVar.zzb, (String) it.next());
                    if (zzekgVarZza != null && zzekgVarZza.zza(zzfjcVar, zzfirVar)) {
                        break;
                    }
                }
            }
        } else {
            zzeklVar.zzc(str, zzfjbVar.zza);
        }
        zzdbh zzdbhVar = this.zzb;
        zzcrz zzcrzVar = new zzcrz(zzfjcVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdbhVar.zzq(zzcrzVar, executor);
        if (zzfiuVar.zzr > 1) {
            return this.zzl.zza(zzfjcVar);
        }
        String strZzb2 = zzb(zzfjcVar);
        zzfnu zzfnuVar = this.zza;
        zzfno zzfnoVar = zzfno.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfnuVar);
        int i11 = 0;
        zzfnb zzfnbVarZzi = zzfnf.zza(zzgzo.zzc(new zzenv(3, strZzb2)), zzfnoVar, zzfnuVar).zzi();
        final zzenr zzenrVar = this.zzh;
        zzenrVar.zza();
        for (final zzfir zzfirVar2 : zzfjbVar.zza) {
            for (String str2 : zzfirVar2.zza) {
                final zzekg zzekgVarZza2 = this.zzg.zza(zzfirVar2.zzb, str2);
                if (zzekgVarZza2 != null && zzekgVarZza2.zza(zzfjcVar, zzfirVar2)) {
                    zzfnl zzfnlVarZza = zzfnuVar.zza(zzfno.RENDER_CONFIG_WATERFALL, zzfnbVarZzi);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(str2).length());
                    sb2.append("render-config-");
                    sb2.append(i11);
                    sb2.append("-");
                    sb2.append(str2);
                    zzfnbVarZzi = zzfnlVarZza.zza(sb2.toString()).zzg(Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzenx
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ q5.i zza(Object obj2) {
                            return this.zza.zzc(zzfirVar2, zzfjcVar, zzekgVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i11++;
        }
        zzfnbVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzenrVar.zzb();
            }
        }, executor);
        return zzfnbVarZzi;
    }

    public final /* synthetic */ q5.i zzc(zzfir zzfirVar, zzfjc zzfjcVar, zzekg zzekgVar, Throwable th2) {
        zzfoe zzfoeVarZzn = zzfoe.zzn(this.zzj, 12);
        zzfoeVarZzn.zzi(zzfirVar.zzE);
        zzfoeVarZzn.zza();
        q5.i iVarZzi = zzgzo.zzi(zzekgVar.zzb(zzfjcVar, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfjcVar, zzfirVar, iVarZzi, this.zzc);
        zzfon.zzd(iVarZzi, this.zzk, zzfoeVarZzn);
        return iVarZzi;
    }
}
