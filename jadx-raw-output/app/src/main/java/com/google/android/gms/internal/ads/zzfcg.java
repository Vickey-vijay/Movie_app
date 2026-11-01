package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfcg implements zzfax {
    private final zzcdu zza;
    private final ScheduledExecutorService zzb;
    private final zzgzy zzc;

    public zzfcg(String str, zzbfg zzbfgVar, zzcdu zzcduVar, ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar) {
        this.zza = zzcduVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdP)).booleanValue()) {
                q5.i iVarZza = zzgat.zza(Tasks.forResult(null), null);
                zzgzy zzgzyVar = this.zzc;
                q5.i iVarZzj = zzgzo.zzj(iVarZza, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfcf
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ q5.i zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgzo.zza(new zzfch(null, -1)) : zzgzo.zza(new zzfch(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzgzyVar);
                if (((Boolean) zzbir.zza.zze()).booleanValue()) {
                    iVarZzj = zzgzo.zzi(iVarZzj, ((Long) zzbir.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgzo.zzg(iVarZzj, Exception.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfce
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzgzyVar);
            }
        }
        return zzgzo.zza(new zzfch(null, -1));
    }

    public final /* synthetic */ zzfch zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfch(null, -1);
    }
}
