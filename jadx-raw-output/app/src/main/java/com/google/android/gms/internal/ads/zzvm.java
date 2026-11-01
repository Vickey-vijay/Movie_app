package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzvm implements zzxd {
    private final zzafa zza;

    @Nullable
    private zzaeu zzb;

    @Nullable
    private zzaev zzc;

    public zzvm(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final long zzd() {
        zzaev zzaevVar = this.zzc;
        if (zzaevVar != null) {
            return zzaevVar.zzn();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzj zzjVar, Uri uri, Map map, long j10, long j11, zzaex zzaexVar) throws IOException {
        zzael zzaelVar = new zzael(zzjVar, j10, j11);
        this.zzc = zzaelVar;
        if (this.zzb != null) {
            return;
        }
        zzaeu[] zzaeuVarArrZzb = this.zza.zzb(uri, map);
        int length = zzaeuVarArrZzb.length;
        zzguc zzgucVarZzv = zzguf.zzv(length);
        if (length == 1) {
            this.zzb = zzaeuVarArrZzb[0];
        } else {
            for (zzaeu zzaeuVar : zzaeuVarArrZzb) {
                try {
                    if (zzaeuVar.zza(zzaelVar)) {
                        this.zzb = zzaeuVar;
                        zzgrc.zzi(true);
                        zzaelVar.zzl();
                        break;
                    } else {
                        zzgucVarZzv.zzh(zzaeuVar.zzb());
                        boolean z10 = this.zzb != null || zzaelVar.zzn() == j10;
                        zzgrc.zzi(z10);
                        zzaelVar.zzl();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaelVar.zzn() == j10) {
                    }
                } catch (Throwable th2) {
                    zzgrc.zzi(this.zzb != null || zzaelVar.zzn() == j10);
                    zzaelVar.zzl();
                    throw th2;
                }
                zzgrc.zzi(z10);
                zzaelVar.zzl();
            }
            if (this.zzb == null) {
                String strZzd = zzgqw.zzd(zzgvf.zzc(zzguf.zzr(zzaeuVarArrZzb), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzvl
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        zzaeu zzaeuVar2 = (zzaeu) obj;
                        zzaeuVar2.zzg();
                        return zzaeuVar2.getClass().getSimpleName();
                    }
                }), ", ");
                StringBuilder sb2 = new StringBuilder(strZzd.length() + 58);
                sb2.append("None of the available extractors (");
                sb2.append(strZzd);
                sb2.append(") could read the stream.");
                throw new zzyo(sb2.toString(), uri, zzgucVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null) {
            zzaeuVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzc() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null && (zzaeuVar instanceof zzajp)) {
            ((zzajp) zzaeuVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zze(long j10, long j11) {
        zzaeu zzaeuVar = this.zzb;
        zzaeuVar.getClass();
        zzaeuVar.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final int zzf(zzafv zzafvVar) throws IOException {
        zzaev zzaevVar;
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar == null || (zzaevVar = this.zzc) == null) {
            throw null;
        }
        return zzaeuVar.zzd(zzaevVar, zzafvVar);
    }
}
