package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzxh implements zzabb, zzvz {
    public final /* synthetic */ zzxq zza;
    private final long zzb;
    private final Uri zzc;
    private final zzhy zzd;
    private final zzxd zze;
    private final zzaex zzf;
    private final zzdq zzg;
    private final zzafv zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhf zzl;

    @Nullable
    private zzagh zzm;
    private boolean zzn;

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb() {
        this.zzi = true;
    }

    public final /* synthetic */ void zzd(long j10, long j11) {
        this.zzh.zza = j10;
        this.zzk = j11;
        this.zzj = true;
        this.zzn = false;
    }

    public final /* synthetic */ long zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzhy zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzk;
    }

    public final /* synthetic */ zzhf zzh() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzer zzerVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzerVar.zzd();
        zzagh zzaghVar = this.zzm;
        zzaghVar.getClass();
        zzaghVar.zzc(zzerVar, iZzd);
        zzaghVar.zze(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01fc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zzc():void");
    }

    public zzxh(zzxq zzxqVar, Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzaex zzaexVar, zzdq zzdqVar) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzc = uri;
        this.zzd = new zzhy(zzhbVar);
        this.zze = zzxdVar;
        this.zzf = zzaexVar;
        this.zzg = zzdqVar;
        this.zzh = new zzafv();
        this.zzj = true;
        this.zzb = zzwb.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhf zzi(long j10, @Nullable String str) {
        Map mapZzd = zzxq.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzguh zzguhVar = new zzguh();
            zzguhVar.zzb(mapZzd.entrySet());
            zzguhVar.zza("If-Range", str);
            mapZzd = zzguhVar.zzd();
        }
        zzhe zzheVar = new zzhe();
        zzheVar.zza(this.zzc);
        zzheVar.zzc(j10);
        zzheVar.zzd(6);
        zzheVar.zzb(mapZzd);
        return zzheVar.zze();
    }
}
