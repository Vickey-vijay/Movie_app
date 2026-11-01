package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfnd {
    public final /* synthetic */ zzfnm zza;
    private final Object zzb;
    private final List zzc;

    public final zzfnl zza(Callable callable) {
        List list = this.zzc;
        zzgzn zzgznVarZzp = zzgzo.zzp(list);
        q5.i iVarZza = zzgznVarZzp.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfnc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return null;
            }
        }, zzcei.zzg);
        zzfnm zzfnmVar = this.zza;
        return new zzfnl(zzfnmVar, this.zzb, null, iVarZza, list, zzgznVarZzp.zza(callable, zzfnmVar.zze()), null);
    }

    public /* synthetic */ zzfnd(zzfnm zzfnmVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfnmVar);
        this.zza = zzfnmVar;
        this.zzb = obj;
        this.zzc = list;
    }
}
