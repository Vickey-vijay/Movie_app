package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcih implements zzhb {
    private final zzhb zza;
    private final long zzb;
    private final zzhb zzc;
    private long zzd;
    private Uri zze;

    public zzcih(zzhb zzhbVar, int i10, zzhb zzhbVar2) {
        this.zza = zzhbVar;
        this.zzb = i10;
        this.zzc = zzhbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return zzgui.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int iZza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + ((long) iZza);
            this.zzd = j12;
            i12 = iZza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < j11) {
            return i12;
        }
        int iZza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZza2;
        this.zzd += (long) iZza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        zzhf zzhfVar2;
        Uri uri = zzhfVar.zza;
        this.zze = uri;
        long j10 = zzhfVar.zze;
        long j11 = this.zzb;
        zzhf zzhfVar3 = null;
        if (j10 >= j11) {
            zzhfVar2 = null;
        } else {
            long j12 = zzhfVar.zzf;
            long j13 = j11 - j10;
            zzhfVar2 = new zzhf(uri, j10, j12 != -1 ? Math.min(j12, j13) : j13, null);
        }
        long j14 = zzhfVar.zzf;
        if (j14 == -1 || j10 + j14 > j11) {
            zzhfVar3 = new zzhf(uri, Math.max(j11, j10), j14 != -1 ? Math.min(j14, (j10 + j14) - j11) : -1L, null);
        }
        long jZzb = zzhfVar2 != null ? this.zza.zzb(zzhfVar2) : 0L;
        long jZzb2 = zzhfVar3 != null ? this.zzc.zzb(zzhfVar3) : 0L;
        this.zzd = j10;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }
}
