package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdti implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdxz zzc;
    private final zzeiu zzd;
    private final Executor zze;
    private final zzazh zzf;
    private final VersionInfoParcel zzg;
    private final zzfqk zzh;
    private final zzejf zzi;
    private final zzfjo zzj;

    public zzdti(Context context, Executor executor, zzazh zzazhVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzckb zzckbVar, zzeiu zzeiuVar, zzfqk zzfqkVar, zzdxz zzdxzVar, zzejf zzejfVar, zzfjo zzfjoVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzazhVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzeiuVar;
        this.zzh = zzfqkVar;
        this.zzc = zzdxzVar;
        this.zzi = zzejfVar;
        this.zzj = zzfjoVar;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    public final /* synthetic */ zzdxz zzc() {
        return this.zzc;
    }

    public final /* synthetic */ zzeiu zzd() {
        return this.zzd;
    }

    public final /* synthetic */ Executor zze() {
        return this.zze;
    }

    public final /* synthetic */ zzazh zzf() {
        return this.zzf;
    }

    public final /* synthetic */ VersionInfoParcel zzg() {
        return this.zzg;
    }

    public final /* synthetic */ zzfqk zzh() {
        return this.zzh;
    }

    public final /* synthetic */ zzejf zzi() {
        return this.zzi;
    }

    public final /* synthetic */ zzfjo zzj() {
        return this.zzj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdtk zzdtkVar = new zzdtk(this);
        zzdtkVar.zza();
        return zzdtkVar;
    }
}
