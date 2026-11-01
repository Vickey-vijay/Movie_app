package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzggg implements zzgha {
    private final Map zza;
    private final zzawg zzb;
    private final zzgoc zzc;
    private final long zzd;

    /* JADX WARN: Multi-variable type inference failed */
    public final Void zza() throws Exception {
        zzaxg zzaxgVar;
        try {
            try {
                this.zzc.zza();
                q5.i iVar = (q5.i) this.zza.get("gs");
                if (iVar != null && (zzaxgVar = (zzaxg) iVar.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzawg zzawgVar = this.zzb;
                    synchronized (zzawgVar) {
                        zzawgVar.zzad(zzaxgVar.zzh());
                        zzawgVar.zzN(zzaxgVar.zzd());
                    }
                }
            } catch (Throwable th2) {
                this.zzc.zzc();
                throw th2;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e10) {
            this.zzc.zzb(e10);
        }
        this.zzc.zzc();
        return null;
    }

    public zzggg(zzawg zzawgVar, Map map, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        this.zza = map;
        this.zzb = zzawgVar;
        this.zzc = zzgoeVar.zza(112);
        this.zzd = zzgbfVar.zzj();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }
}
