package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzenp implements zzgzl {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzfiu zzb;
    public final /* synthetic */ zzfir zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzfqg zze;
    public final /* synthetic */ zzfjc zzf;
    public final /* synthetic */ zzenr zzg;

    public zzenp(zzenr zzenrVar, long j10, zzfiu zzfiuVar, zzfir zzfirVar, String str, zzfqg zzfqgVar, zzfjc zzfjcVar) {
        this.zza = j10;
        this.zzb = zzfiuVar;
        this.zzc = zzfirVar;
        this.zzd = str;
        this.zze = zzfqgVar;
        this.zzf = zzfjcVar;
        Objects.requireNonNull(zzenrVar);
        this.zzg = zzenrVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[Catch: all -> 0x00f6, TryCatch #0 {, blocks: (B:29:0x0062, B:31:0x0068, B:33:0x0074, B:34:0x0077, B:35:0x0080, B:37:0x0092, B:38:0x00a7, B:40:0x00ad, B:42:0x00af, B:50:0x00ed, B:51:0x00f4, B:45:0x00d2, B:47:0x00d6, B:49:0x00e0), top: B:56:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[Catch: all -> 0x00f6, TryCatch #0 {, blocks: (B:29:0x0062, B:31:0x0068, B:33:0x0074, B:34:0x0077, B:35:0x0080, B:37:0x0092, B:38:0x00a7, B:40:0x00ad, B:42:0x00af, B:50:0x00ed, B:51:0x00f4, B:45:0x00d2, B:47:0x00d6, B:49:0x00e0), top: B:56:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0092 A[Catch: all -> 0x00f6, TryCatch #0 {, blocks: (B:29:0x0062, B:31:0x0068, B:33:0x0074, B:34:0x0077, B:35:0x0080, B:37:0x0092, B:38:0x00a7, B:40:0x00ad, B:42:0x00af, B:50:0x00ed, B:51:0x00f4, B:45:0x00d2, B:47:0x00d6, B:49:0x00e0), top: B:56:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad A[Catch: all -> 0x00f6, DONT_GENERATE, TryCatch #0 {, blocks: (B:29:0x0062, B:31:0x0068, B:33:0x0074, B:34:0x0077, B:35:0x0080, B:37:0x0092, B:38:0x00a7, B:40:0x00ad, B:42:0x00af, B:50:0x00ed, B:51:0x00f4, B:45:0x00d2, B:47:0x00d6, B:49:0x00e0), top: B:56:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00af A[Catch: all -> 0x00f6, TryCatch #0 {, blocks: (B:29:0x0062, B:31:0x0068, B:33:0x0074, B:34:0x0077, B:35:0x0080, B:37:0x0092, B:38:0x00a7, B:40:0x00ad, B:42:0x00af, B:50:0x00ed, B:51:0x00f4, B:45:0x00d2, B:47:0x00d6, B:49:0x00e0), top: B:56:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001a A[PHI: r6
  0x001a: PHI (r6v9 int) = (r6v0 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v10 int) binds: [B:17:0x0031, B:22:0x004c, B:24:0x0050, B:26:0x0059, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        Integer numValueOf;
        int i10;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i11;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzenr zzenrVar = this.zzg;
        long jElapsedRealtime = zzenrVar.zzj().elapsedRealtime() - this.zza;
        int i12 = 6;
        if (!(th2 instanceof TimeoutException)) {
            if (th2 instanceof zzemz) {
                numValueOf = null;
                i12 = 3;
            } else if (th2 instanceof CancellationException) {
                i10 = 4;
            } else if (th2 instanceof zzfjr) {
                i10 = 5;
            } else if (th2 instanceof zzecr) {
                i12 = zzfkm.zza(th2).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzci)).booleanValue() && (th2 instanceof zzekk) && (zzeVarZzb = ((zzekk) th2).zzb()) != null) {
                    numValueOf = Integer.valueOf(zzeVarZzb.zza);
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            synchronized (zzenrVar) {
                if (zzenrVar.zzn()) {
                    zzenrVar.zzk().zza(this.zzb, this.zzc, i12, th2 instanceof zzekk ? (zzekk) th2 : null, jElapsedRealtime);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjG)).booleanValue()) {
                    zzfqk zzfqkVarZzl = zzenrVar.zzl();
                    zzfqg zzfqgVar = this.zze;
                    zzfjc zzfjcVar = this.zzf;
                    zzfir zzfirVar = this.zzc;
                    zzfqkVarZzl.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzn), zzfirVar.zzax);
                }
                if (zzenrVar.zzp()) {
                    return;
                }
                LinkedHashMap linkedHashMapZzm = zzenrVar.zzm();
                zzfir zzfirVar2 = this.zzc;
                linkedHashMapZzm.put(zzfirVar2, new zzenq(this.zzd, zzfirVar2.zzaf, i12, jElapsedRealtime, numValueOf));
                zzeVarZza = zzfkm.zza(th2);
                i11 = zzeVarZza.zza;
                if ((i11 != 3 || i11 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                }
                zzenrVar.zzo().zze(zzfirVar2, jElapsedRealtime, zzeVarZza);
            }
        }
        i10 = 2;
        i12 = i10;
        numValueOf = null;
        synchronized (zzenrVar) {
            if (zzenrVar.zzn()) {
                zzenrVar.zzk().zza(this.zzb, this.zzc, i12, th2 instanceof zzekk ? (zzekk) th2 : null, jElapsedRealtime);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjG)).booleanValue()) {
                zzfqk zzfqkVarZzl2 = zzenrVar.zzl();
                zzfqg zzfqgVar2 = this.zze;
                zzfjc zzfjcVar2 = this.zzf;
                zzfir zzfirVar3 = this.zzc;
                zzfqkVarZzl2.zza(zzfqgVar2.zza(zzfjcVar2, zzfirVar3, zzfirVar3.zzn), zzfirVar3.zzax);
            }
            if (zzenrVar.zzp()) {
                return;
            }
            LinkedHashMap linkedHashMapZzm2 = zzenrVar.zzm();
            zzfir zzfirVar4 = this.zzc;
            linkedHashMapZzm2.put(zzfirVar4, new zzenq(this.zzd, zzfirVar4.zzaf, i12, jElapsedRealtime, numValueOf));
            zzeVarZza = zzfkm.zza(th2);
            i11 = zzeVarZza.zza;
            zzeVarZza = i11 != 3 ? zzfkm.zza(new zzekk(13, zzeVarZza.zzd)) : zzfkm.zza(new zzekk(13, zzeVarZza.zzd));
            zzenrVar.zzo().zze(zzfirVar4, jElapsedRealtime, zzeVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        zzenr zzenrVar = this.zzg;
        long jElapsedRealtime = zzenrVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzenrVar) {
            if (zzenrVar.zzn()) {
                zzenrVar.zzk().zza(this.zzb, this.zzc, 0, null, jElapsedRealtime);
            }
            if (zzenrVar.zzp()) {
                return;
            }
            zzfir zzfirVar = this.zzc;
            if (zzenrVar.zzi(zzfirVar)) {
                ((zzenq) zzenrVar.zzm().get(zzfirVar)).zzd = jElapsedRealtime;
            } else {
                zzenrVar.zzm().put(zzfirVar, new zzenq(this.zzd, zzfirVar.zzaf, 0, jElapsedRealtime, null));
            }
            zzenrVar.zzo().zzd(zzfirVar, jElapsedRealtime, null);
        }
    }
}
