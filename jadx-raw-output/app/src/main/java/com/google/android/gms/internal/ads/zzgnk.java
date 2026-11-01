package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzgnk implements zzgnb, zzgdd {
    private final Context zza;
    private final zzgoe zzb;
    private final zzgzy zzc;
    private final zzgbf zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private q5.i zzf = zzgzo.zza(null);

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final q5.i zza() {
        return (this.zze.getAndSet(true) || !this.zzd.zzc()) ? zzgzo.zzb() : this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        map.put("gs", this.zzf);
    }

    public final /* synthetic */ void zze() {
        q5.i iVarSubmit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzgni
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        });
        this.zzb.zze(53, iVarSubmit);
        this.zzf = iVarSubmit;
    }

    public final /* synthetic */ zzaxg zzf() {
        Context context = this.zza;
        try {
            return zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public zzgnk(Context context, zzgoe zzgoeVar, zzgzy zzgzyVar, zzgbf zzgbfVar) {
        this.zza = context;
        this.zzb = zzgoeVar;
        this.zzc = zzgzyVar;
        this.zzd = zzgbfVar;
    }
}
