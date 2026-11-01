package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzger {
    public long zza;
    public long zzb;
    public long zzc;
    public long zzd;
    public double zze;
    public float zzf;
    public float zzg;
    public float zzh;
    public float zzi;
    private double zzj;
    private double zzk;

    private static double zzb(MotionEvent motionEvent, double d10, double d11, double d12) {
        return d12 + Math.hypot(((double) motionEvent.getRawX()) - d10, ((double) motionEvent.getRawY()) - d11);
    }

    public final /* synthetic */ void zza(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                    this.zzd++;
                    return;
                } else {
                    this.zzb += (long) (motionEvent.getHistorySize() + 1);
                    this.zze = zzb(motionEvent, this.zzj, this.zzk, this.zze);
                    this.zzj = motionEvent.getRawX();
                    this.zzk = motionEvent.getRawY();
                    return;
                }
            }
            this.zzc++;
            this.zze = zzb(motionEvent, this.zzj, this.zzk, this.zze);
            this.zzj = motionEvent.getRawX();
            this.zzk = motionEvent.getRawY();
            return;
        }
        this.zza++;
        this.zze = 0.0d;
        this.zzj = motionEvent.getRawX();
        this.zzk = motionEvent.getRawY();
        this.zzf = motionEvent.getX();
        this.zzg = motionEvent.getY();
        this.zzh = motionEvent.getRawX();
        this.zzi = motionEvent.getRawY();
    }
}
