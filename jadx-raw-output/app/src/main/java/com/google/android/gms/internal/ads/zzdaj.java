package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdaj {
    private final zzfnu zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzika zzg;
    private final String zzh;
    private final zzfba zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfjk zzk;
    private final int zzl;
    private final zzdgy zzm;

    public zzdaj(zzfnu zzfnuVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, zzika zzikaVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzfba zzfbaVar, zzfjk zzfjkVar, zzdgy zzdgyVar, int i10) {
        this.zza = zzfnuVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzikaVar;
        this.zzh = str2;
        this.zzi = zzfbaVar;
        this.zzj = zzgVar;
        this.zzk = zzfjkVar;
        this.zzm = zzdgyVar;
        this.zzl = i10;
    }

    public final q5.i zza(Bundle bundle) {
        this.zzm.zza();
        zzfno zzfnoVar = zzfno.SIGNALS;
        zzfnu zzfnuVar = this.zza;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zza(this.zzi.zza(new zzdah(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfnoVar, zzfnuVar).zzi();
    }

    public final q5.i zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final q5.i iVarZza = zza(bundle);
        return this.zza.zzb(zzfno.REQUEST_PARCEL, iVarZza, (q5.i) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdai
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(iVarZza, bundle);
            }
        }).zzi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzbzu zzc(q5.i iVar, Bundle bundle) {
        zzdah zzdahVar = (zzdah) iVar.get();
        Bundle bundle2 = zzdahVar.zza;
        String str = (String) ((q5.i) this.zzg.zzb()).get();
        boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhV)).booleanValue() && this.zzj.zzx();
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbzu(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z10, this.zzk.zza(), bundle, zzdahVar.zzb, this.zzl);
    }
}
