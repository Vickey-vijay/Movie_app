package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfie implements zzesf {
    private final Context zza;
    private final Executor zzb;
    private final zzcma zzc;
    private final zzfhv zzd;
    private final zzfgj zze;
    private final zzfjd zzf;
    private final zzfor zzg;
    private final zzfjj zzh;
    private q5.i zzi;

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        throw null;
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzfhv zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzfgj zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzfor zzi() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdud zze(zzfgh zzfghVar) {
        zzdud zzdudVarZzp = this.zzc.zzp();
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(this.zza);
        zzdanVar.zzb(((zzfid) zzfghVar).zza);
        zzdanVar.zzf(this.zzf);
        zzdudVarZzp.zzd(zzdanVar.zze());
        zzdudVarZzp.zze(new zzdhe().zzn());
        return zzdudVarZzp;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) throws RemoteException {
        zzfoo zzfooVar;
        zzcan zzcanVar = new zzcan(zzmVar, str);
        String str2 = zzcanVar.zzb;
        if (str2 == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfic
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        } else {
            q5.i iVar = this.zzi;
            if (iVar == null || iVar.isDone()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzbb.zzc();
                }
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfgj zzfgjVar = this.zze;
                    if (zzfgjVar.zzd() != null) {
                        zzfoo zzfooVarZzd = ((zzdue) zzfgjVar.zzd()).zzd();
                        zzfooVarZzd.zzi(5);
                        com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzcanVar.zza;
                        zzfooVarZzd.zzc(zzmVar2.zzp);
                        zzfooVarZzd.zzd(zzmVar2.zzm);
                        zzfooVar = zzfooVarZzd;
                    } else {
                        zzfooVar = null;
                    }
                } else {
                    zzfooVar = null;
                }
                Context context = this.zza;
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzcanVar.zza;
                boolean z10 = zzmVar3.zzf;
                zzfkh.zzb(context, z10);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && z10) {
                    this.zzc.zzw().zzc(true);
                }
                Bundle bundleZza = zzdxj.zza(new Pair(zzdxh.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar3.zzz)), new Pair(zzdxh.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
                zzfjj zzfjjVar = this.zzh;
                zzfjjVar.zzg(str2);
                zzfjjVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
                zzfjjVar.zza(zzmVar3);
                zzfjjVar.zzv(bundleZza);
                zzfjk zzfjkVarZzA = zzfjjVar.zzA();
                zzfoe zzfoeVarZzo = zzfoe.zzo(context, zzfon.zzg(zzfjkVarZzA), 5, zzmVar3);
                zzfid zzfidVar = new zzfid(null);
                zzfidVar.zza = zzfjkVarZzA;
                q5.i iVarZzc = this.zze.zzc(new zzfgk(zzfidVar, null), new zzfgi() { // from class: com.google.android.gms.internal.ads.zzfib
                    @Override // com.google.android.gms.internal.ads.zzfgi
                    public final /* synthetic */ zzdal zza(zzfgh zzfghVar) {
                        return this.zza.zzd(zzfghVar);
                    }
                }, null);
                this.zzi = iVarZzc;
                zzgzo.zzr(iVarZzc, new zzfia(this, zzeseVar, zzfooVar, zzfoeVarZzo, zzfidVar), this.zzb);
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public final void zzj(int i10) {
        this.zzh.zzj().zza(i10);
    }

    public zzfie(Context context, Executor executor, zzcma zzcmaVar, zzfgj zzfgjVar, zzfhv zzfhvVar, zzfjj zzfjjVar, zzfjd zzfjdVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmaVar;
        this.zze = zzfgjVar;
        this.zzd = zzfhvVar;
        this.zzh = zzfjjVar;
        this.zzf = zzfjdVar;
        this.zzg = zzcmaVar.zzx();
    }
}
