package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgec {
    private final zzika zza;
    private final zzika zzb;
    private final zzika zzc;
    private final ExecutorService zzd;
    private final zzgoe zze;

    public zzgec(zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = zzikaVar3;
        this.zzd = executorService;
        this.zze = zzgoeVar;
    }

    public final /* synthetic */ zzgoe zza() {
        return this.zze;
    }

    public final /* synthetic */ q5.i zzd(int i10) {
        return zze(2);
    }

    private final q5.i zze(final int i10) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgdy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i10);
            }
        }, this.zzd)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgdz
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                final zzgdv zzgdvVar = (zzgdv) obj;
                return zzgzo.zzk(zzgdvVar.zzb(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgea
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj2) {
                        return zzgdvVar;
                    }
                }, zzhaf.zza());
            }
        }, zzhaf.zza());
    }

    public final /* synthetic */ zzgdv zzc(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return (zzgdv) this.zza.zzb();
        }
        if (i11 == 2) {
            return (zzgdv) this.zzb.zzb();
        }
        if (i11 == 3) {
            return (zzgdv) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }

    public final q5.i zzb(int i10, boolean z10) {
        q5.i iVarZze = zze(i10);
        if (z10 && i10 != 2) {
            return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(iVarZze), Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgeb
                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ Object apply(Object obj) {
                    return null;
                }
            }, zzhaf.zza()), new zzgdx(this), zzhaf.zza());
        }
        return iVarZze;
    }
}
