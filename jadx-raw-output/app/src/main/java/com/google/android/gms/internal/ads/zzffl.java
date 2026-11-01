package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzffl implements zzfgj {
    private zzdam zza;
    private final Executor zzb = zzhaf.zza();

    public final zzdam zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ q5.i zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, @Nullable Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }

    public final q5.i zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, @Nullable zzdam zzdamVar) {
        zzdal zzdalVarZza = zzfgiVar.zza(zzfgkVar.zzb);
        zzdalVarZza.zzj(new zzfgn(true));
        zzdam zzdamVar2 = (zzdam) zzdalVarZza.zzh();
        this.zza = zzdamVar2;
        final zzcxj zzcxjVarZza = zzdamVar2.zza();
        final zzfli zzfliVar = new zzfli();
        zzgzg zzgzgVarZzw = zzgzg.zzw(zzcxjVarZza.zzb());
        zzgyw zzgywVar = new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzffk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                zzfjc zzfjcVar = (zzfjc) obj;
                zzfliVar.zzb = zzfjcVar;
                Iterator it = zzfjcVar.zzb.zza.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfir) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzgzo.zza(null);
                        }
                        z10 = true;
                    }
                }
                if (z10) {
                    return zzcxjVarZza.zzc(zzgzo.zza(zzfjcVar));
                }
                return zzgzo.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj(zzgzgVarZzw, zzgywVar, executor), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzffj
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzfli zzfliVar2 = zzfliVar;
                zzfliVar2.zzc = (zzcwf) obj;
                return zzfliVar2;
            }
        }, executor);
    }
}
