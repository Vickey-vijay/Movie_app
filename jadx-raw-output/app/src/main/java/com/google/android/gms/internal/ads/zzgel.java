package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgel implements zzgdv {
    private final ExecutorService zza;
    private final zzika zzb;
    private final zzika zzc;
    private final zzgmz zzd;
    private final zzika zze;
    private final zzikv zzf;
    private final zzgbf zzg;

    public zzgel(ExecutorService executorService, zzika zzikaVar, zzika zzikaVar2, zzgmz zzgmzVar, zzika zzikaVar3, zzikv zzikvVar, zzgbf zzgbfVar) {
        this.zza = executorService;
        this.zzb = zzikaVar;
        this.zzc = zzikaVar2;
        this.zzd = zzgmzVar;
        this.zze = zzikaVar3;
        this.zzf = zzikvVar;
        this.zzg = zzgbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final String zza() {
        return "1.825731049";
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final int zzg() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final q5.i zzb() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgek
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final q5.i zzc(Context context) {
        zzgfb zzgfbVarZzh = ((zzgfb) this.zzf.zzb()).zzh(context);
        zzgfbVarZzh.zzd(this.zzd.zzb());
        zzgfbVarZzh.zzc(zzaxg.zzj());
        zzgfbVarZzh.zzb(zzgcc.QUERY);
        return zzgfbVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final q5.i zzd(Context context, String str, View view, Activity activity) {
        zzgfb zzgfbVarZzh = ((zzgfb) this.zzf.zzb()).zzh(context);
        zzgfbVarZzh.zzg(view);
        zzgfbVarZzh.zzf(activity);
        zzgfbVarZzh.zze(true != this.zzg.zze() ? "" : null);
        zzgfbVarZzh.zzd(this.zzd.zzc(context, view));
        zzgfbVarZzh.zzc(zzaxg.zzj());
        zzgfbVarZzh.zzb(zzgcc.VIEW);
        return zzgfbVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final q5.i zze(Context context, String str, View view, Activity activity) {
        zzika zzikaVar = this.zze;
        Map mapZzd = this.zzd.zzd();
        ((zzget) zzikaVar.zzb()).zzb(mapZzd);
        zzgfb zzgfbVarZzh = ((zzgfb) this.zzf.zzb()).zzh(context);
        zzgfbVarZzh.zzg(view);
        zzgfbVarZzh.zzf(null);
        zzgfbVarZzh.zze(str);
        zzgfbVarZzh.zzd(mapZzd);
        zzgfbVarZzh.zzb(zzgcc.CLICK);
        zzgfbVarZzh.zzc(zzaxg.zzj());
        return zzgfbVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzget) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    public final /* synthetic */ Void zzh() {
        ((zzgfe) this.zzc.zzb()).zza();
        ((zzgfx) this.zzb.zzb()).zza();
        return null;
    }
}
