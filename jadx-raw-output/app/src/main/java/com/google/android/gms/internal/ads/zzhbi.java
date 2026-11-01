package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhbi {
    private static final zzhbg zza = new zzhbg() { // from class: com.google.android.gms.internal.ads.zzhbh
        @Override // com.google.android.gms.internal.ads.zzhbg
        public final /* synthetic */ void zza(zzhbi zzhbiVar) {
        }
    };
    private final zzhaz zzb;
    private final zzhbb zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzhbg zzg;
    private final int zzh;

    public /* synthetic */ zzhbi(zzhaz zzhazVar, int i10, int i11, boolean z10, boolean z11, zzhbg zzhbgVar, byte[] bArr) {
        this.zzb = zzhazVar;
        this.zzh = i10;
        int i12 = i10 - 2;
        this.zzc = i12 != 1 ? i12 != 3 ? zzhbb.zzb : zzhbb.zzc : zzhbb.zza;
        this.zzd = i11;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = zzhbgVar;
    }

    public final zzhbb zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final /* synthetic */ zzhaz zzf() {
        return this.zzb;
    }

    public final /* synthetic */ int zzg() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    public final /* synthetic */ int zzj() {
        return this.zzh;
    }

    public final zzhaz zza() {
        this.zzg.zza(this);
        return this.zzb;
    }
}
