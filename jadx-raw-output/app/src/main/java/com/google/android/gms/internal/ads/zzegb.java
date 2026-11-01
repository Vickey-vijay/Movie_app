package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzegb {
    private final Context zza;
    private final zzgzy zzb;
    private final zzgzy zzc;
    private final zzika zzd;
    private final VersionInfoParcel zze;
    private final zzefx zzf;
    private final zzdxz zzg;

    public zzegb(Context context, zzgzy zzgzyVar, zzgzy zzgzyVar2, zzika zzikaVar, VersionInfoParcel versionInfoParcel, zzefx zzefxVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzc = zzgzyVar2;
        this.zzd = zzikaVar;
        this.zze = versionInfoParcel;
        this.zzf = zzefxVar;
        this.zzg = zzdxzVar;
    }

    public final /* synthetic */ zzdxz zzd() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzegw) this.zzd.zzb()).zzi(this.zze.afmaVersion);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpB)).booleanValue()) {
                zzdxy zzdxyVarZza = this.zzg.zza();
                zzdxyVarZza.zzc("action", "ptard");
                zzdxyVarZza.zzc("ptard", "l");
                zzdxyVarZza.zzd();
            }
        } catch (RemoteException | NullPointerException e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zza.getPackageName())) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
            return;
        }
        zzefy zzefyVar = new zzefy(this);
        zzegd zzegdVarZzb = this.zzf.zzb();
        zzegdVarZzb.zzb(zzefyVar);
        final zzeel zzeelVarZza = zzegdVarZzb.zza().zza();
        zzgzy zzgzyVar = this.zzb;
        Objects.requireNonNull(zzeelVarZza);
        zzgzyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzega
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeelVarZza.zza();
            }
        });
    }
}
