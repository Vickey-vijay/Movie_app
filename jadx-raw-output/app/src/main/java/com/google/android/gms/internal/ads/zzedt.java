package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzedt {
    private final ScheduledExecutorService zza;
    private final zzgzy zzb;
    private final zzgzy zzc;
    private final zzees zzd;
    private final zzika zze;

    public zzedt(ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar, zzgzy zzgzyVar2, zzees zzeesVar, zzika zzikaVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgzyVar;
        this.zzc = zzgzyVar2;
        this.zzd = zzeesVar;
        this.zze = zzikaVar;
    }

    public final q5.i zza(final zzbzu zzbzuVar) {
        q5.i iVarSubmit;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            iVarSubmit = zzgzo.zzc(new zzeff(1));
        } else {
            iVarSubmit = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziv)).booleanValue() || ((Boolean) zzbjp.zza.zze()).booleanValue()) ? this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzedq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzbzuVar);
                }
            }) : this.zzd.zza(zzbzuVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzi(zzgzg.zzw(iVarSubmit), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzb(zzbzuVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ q5.i zzb(final zzbzu zzbzuVar, int i10, Throwable th2) {
        Bundle bundle;
        if (zzbzuVar != null && (bundle = zzbzuVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgzo.zzj(((zzegw) this.zze.zzb()).zzk(zzbzuVar, i10), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzedr
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return zzgzo.zza(new zzefg((InputStream) obj, zzbzuVar));
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzefg zzc(zzbzu zzbzuVar) {
        return (zzefg) this.zzd.zza(zzbzuVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS);
    }
}
