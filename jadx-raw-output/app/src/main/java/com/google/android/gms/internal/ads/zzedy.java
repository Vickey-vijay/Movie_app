package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzedy implements zzefe {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzecz zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final ScheduledExecutorService zzd;
    private final zzehr zze;
    private final zzfoo zzf;
    private final Context zzg;

    public zzedy(Context context, zzfjk zzfjkVar, zzecz zzeczVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzehr zzehrVar, zzfoo zzfooVar) {
        this.zzg = context;
        this.zzc = zzfjkVar;
        this.zza = zzeczVar;
        this.zzb = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzehrVar;
        this.zzf = zzfooVar;
    }

    public final /* synthetic */ zzehr zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final q5.i zza(zzbzu zzbzuVar) {
        Context context = this.zzg;
        q5.i iVarZza = this.zza.zza(zzbzuVar);
        zzfoe zzfoeVarZzn = zzfoe.zzn(context, 11);
        zzfon.zzb(iVarZza, zzfoeVarZzn);
        q5.i iVarZzj = zzgzo.zzj(iVarZza, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzb((zzefg) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgB)).booleanValue()) {
            iVarZzj = zzgzo.zzh(zzgzo.zzi(iVarZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzedw
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ q5.i zza(Object obj) {
                    return zzgzo.zzc(new zzecr(5));
                }
            }, zzcei.zzg);
        }
        zzfon.zzd(iVarZzj, this.zzf, zzfoeVarZzn);
        zzgzo.zzr(iVarZzj, new zzedv(this), zzcei.zzg);
        return iVarZzj;
    }

    public final /* synthetic */ q5.i zzb(zzefg zzefgVar) {
        return zzgzo.zza(new zzfjc(new zzfiz(this.zzc), zzfjb.zza(new InputStreamReader(zzefgVar.zza()), zzefgVar.zzb().zzm)));
    }
}
