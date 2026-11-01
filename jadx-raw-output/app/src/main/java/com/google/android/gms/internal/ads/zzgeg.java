package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgeg implements zzgdd {
    private final zzgbf zza;
    private final zzgec zzb;
    private final zzgdw zzc;
    private final ExecutorService zzd;
    private final zzgoe zze;
    private final AtomicReference zzf = new AtomicReference();

    public final /* synthetic */ zzgdw zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final q5.i zza() {
        zzgec zzgecVar = this.zzb;
        zzgbf zzgbfVar = this.zza;
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzk(zzgzg.zzw(zzgecVar.zzb(zzgbfVar.zzE(), zzgbfVar.zza())), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgef
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzgdv zzgdvVar = (zzgdv) obj;
                this.zza.zzf(zzgdvVar);
                return zzgdvVar;
            }
        }, zzhaf.zza());
        zzgzo.zzr(zzgzgVar, new zzgee(this), this.zzd);
        return zzgzgVar;
    }

    public final q5.i zzb(Context context) {
        return ((zzgdv) this.zzf.get()).zzc(context);
    }

    public final q5.i zzc(Context context, String str, View view, Activity activity) {
        return ((zzgdv) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final q5.i zzd(Context context, String str, View view, Activity activity) {
        return ((zzgdv) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(InputEvent inputEvent) {
        zzgdv zzgdvVar = (zzgdv) this.zzf.get();
        if (zzgdvVar == null) {
            this.zze.zzb(54);
        } else {
            zzgdvVar.zzf(inputEvent);
        }
    }

    public final /* synthetic */ zzgdv zzf(zzgdv zzgdvVar) {
        this.zzf.set(zzgdvVar);
        return zzgdvVar;
    }

    public final int zzh() {
        zzgdv zzgdvVar = (zzgdv) this.zzf.get();
        if (zzgdvVar == null) {
            return 1;
        }
        return zzgdvVar.zzg();
    }

    public zzgeg(zzgbf zzgbfVar, zzgec zzgecVar, zzgdw zzgdwVar, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgbfVar;
        this.zzb = zzgecVar;
        this.zzc = zzgdwVar;
        this.zzd = executorService;
        this.zze = zzgoeVar;
    }
}
