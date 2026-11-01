package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgkn implements zzgkg {
    private final Context zza;
    private final zzika zzb;
    private final zzgkx zzc;
    private final zzgoe zzd;
    private final ExecutorService zze;
    private final zzgje zzf;
    private final zzfvh zzg;

    public zzgkn(Context context, zzika zzikaVar, zzgkx zzgkxVar, zzgoe zzgoeVar, ExecutorService executorService, zzgje zzgjeVar, zzfvh zzfvhVar) {
        this.zza = context;
        this.zzb = zzikaVar;
        this.zzc = zzgkxVar;
        this.zzd = zzgoeVar;
        this.zze = executorService;
        this.zzf = zzgjeVar;
        this.zzg = zzfvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkg
    public final q5.i zza() {
        final zzika zzikaVar = this.zzb;
        Objects.requireNonNull(zzikaVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgki
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzikaVar.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzg.zzw(zzgzo.zzd(callable, executorService)), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkm
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzb((zzbch) obj);
                return new Integer(0);
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgkj
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzc((Integer) obj);
            }
        }, zzhaf.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkk
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((zzgdu) obj);
            }
        }, executorService), zzgkh.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkl
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzgkn.zzf(5);
            }
        }, zzhaf.zza());
        this.zzd.zze(15202, zzgzgVar);
        return zzgzgVar;
    }

    public final /* synthetic */ q5.i zzc(Integer num) {
        return this.zzc.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgds zzf(int i10) {
        zzgdr zzgdrVarZzd = zzgds.zzd();
        zzgdrVarZzd.zze(i10);
        return (zzgds) zzgdrVarZzd.zzbu();
    }

    public final /* synthetic */ int zzb(zzbch zzbchVar) {
        if (zzfwe.zza(zzbchVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbchVar.name());
        throw new zzgkh(null);
    }

    public final /* synthetic */ zzgds zzd(zzgdu zzgduVar) {
        String strZza = zzgduVar.zza().zza();
        String strZzb = zzgduVar.zza().zzb();
        zzgoc zzgocVarZza = this.zzd.zza(15203);
        try {
            zzgocVarZza.zza();
            zzfwv zzfwvVarZza = zzfvq.zza(this.zza, 1, (zzbch) this.zzb.zzb(), strZza, strZzb, "1", this.zzg);
            zzgocVarZza.zzc();
            int i10 = 2;
            if (zzfwvVarZza.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zzfwvVarZza.zzb;
            if (bArr != null && bArr.length != 0) {
                try {
                    zzbcj zzbcjVarZze = zzbcj.zze(bArr, zzibb.zzb());
                    if (!zzbcjVarZze.zza().zza().isEmpty() && !zzbcjVarZze.zza().zzb().isEmpty() && zzbcjVarZze.zzc().zzy().length != 0) {
                        if (!zzgduVar.equals(zzgdu.zzg()) && TextUtils.equals(zzgduVar.zza().zza(), zzbcjVarZze.zza().zza()) && TextUtils.equals(zzgduVar.zza().zzb(), zzbcjVarZze.zza().zzb())) {
                            this.zzd.zzb(15209);
                        } else {
                            int i11 = zzfwvVarZza.zzc;
                            if (i11 == 4) {
                                if (!this.zzf.zza(zzbcjVarZze.zzb().zzy())) {
                                    this.zzd.zzb(15206);
                                    return zzf(12);
                                }
                                i11 = 4;
                            }
                            zzgdr zzgdrVarZzd = zzgds.zzd();
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
                                        if (i11 != 6) {
                                            i10 = 1;
                                        } else {
                                            i10 = 5;
                                        }
                                    } else {
                                        i10 = 3;
                                    }
                                }
                            } else {
                                i10 = 4;
                            }
                            zzgdrVarZzd.zze(i10);
                            zzgdt zzgdtVarZze = zzgdu.zze();
                            zzgdtVarZze.zza(zzbcjVarZze.zza());
                            zzgdtVarZze.zzc((zzbch) this.zzb.zzb());
                            zzgdrVarZzd.zza((zzgdu) zzgdtVarZze.zzbu());
                            zzgdrVarZzd.zzd(zzbcjVarZze.zzb());
                            zzgdrVarZzd.zzc(zzbcjVarZze.zzc());
                            return (zzgds) zzgdrVarZzd.zzbu();
                        }
                    } else {
                        this.zzd.zzb(15207);
                    }
                    return zzf(11);
                } catch (zzicg e10) {
                    this.zzd.zzd(15205, e10);
                    return zzf(9);
                } catch (NullPointerException unused) {
                    this.zzd.zzb(15210);
                    return zzf(10);
                }
            }
            this.zzd.zzb(IronSourceConstants.errorCode_destroy);
            return zzf(8);
        } catch (Throwable th2) {
            try {
                zzgocVarZza.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgocVarZza.zzc();
                throw th3;
            }
        }
    }
}
