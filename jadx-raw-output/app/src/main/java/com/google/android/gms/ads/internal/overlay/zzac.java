package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbdy;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzdjm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzac extends zzbxr implements zzbdy {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private final boolean zzf;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;
    private boolean zzg = false;
    private boolean zzh = false;

    private final synchronized void zzc() {
        if (!this.zzd) {
            zzr zzrVar = this.zza.zzc;
            if (zzrVar != null) {
                zzrVar.zzdT(4);
            }
            this.zzd = true;
            if (this.zzf) {
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfL)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzc(this);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzH(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zze() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzj() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzl() throws RemoteException {
        this.zzg = false;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdw();
        }
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzm(int i10, int i11, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzs() throws RemoteException {
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z10) {
        if (!z10) {
            this.zzh = true;
        } else if (this.zzh) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Foregrounded: finishing activity from LauncherOverlay");
            this.zzb.finish();
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zzg) {
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzf() throws RemoteException {
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final boolean zzg() throws RemoteException {
        return ((Boolean) zzbd.zzc().zzd(zzbhe.zzfH)).booleanValue() && this.zzf && this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzh(@Nullable Bundle bundle) {
        zzr zzrVar;
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzko)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z10) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdjm zzdjmVar = adOverlayInfoParcel.zzu;
            if (zzdjmVar != null) {
                zzdjmVar.zzdu();
            }
            Activity activity = this.zzb;
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                zzrVar.zzh();
            }
        }
        if (this.zzf) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfL)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
            }
        }
        Activity activity2 = this.zzb;
        zzc zzcVar = adOverlayInfoParcel.zza;
        zzad zzadVar = adOverlayInfoParcel.zzi;
        com.google.android.gms.ads.internal.zzt.zza();
        if (zza.zzb(activity2, zzcVar, zzadVar, zzcVar.zzi, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzk() throws RemoteException {
        if (this.zzc) {
            com.google.android.gms.ads.internal.util.zze.zza("LauncherOverlay finishing activity");
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        this.zzg = true;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdx();
        }
        if (this.zzf) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfG)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzab
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, ((Integer) zzbd.zzc().zzd(zzbhe.zzfI)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzo(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzp() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzq() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    public zzac(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        boolean z10 = false;
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzfG)).booleanValue()) {
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzfH)).booleanValue()) {
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfL)).booleanValue()) {
                    zzcVar = adOverlayInfoParcel.zza;
                    if (zzcVar != null && zzcVar.zzj) {
                        if (Build.MANUFACTURER.matches((String) zzbd.zzc().zzd(zzbhe.zzfJ))) {
                            if (Build.MODEL.matches((String) zzbd.zzc().zzd(zzbhe.zzfK))) {
                                z10 = true;
                            }
                        }
                    }
                }
            } else {
                zzcVar = adOverlayInfoParcel.zza;
                if (zzcVar != null) {
                    if (Build.MANUFACTURER.matches((String) zzbd.zzc().zzd(zzbhe.zzfJ))) {
                        if (Build.MODEL.matches((String) zzbd.zzc().zzd(zzbhe.zzfK))) {
                            z10 = true;
                        }
                    }
                }
            }
        } else {
            zzcVar = adOverlayInfoParcel.zza;
            if (zzcVar != null) {
                if (Build.MANUFACTURER.matches((String) zzbd.zzc().zzd(zzbhe.zzfJ))) {
                    if (Build.MODEL.matches((String) zzbd.zzc().zzd(zzbhe.zzfK))) {
                        z10 = true;
                    }
                }
            }
        }
        this.zzf = z10;
    }
}
