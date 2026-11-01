package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfgc implements zzgqt {
    public final /* synthetic */ zzfgf zza;

    @Override // com.google.android.gms.internal.ads.zzgqt
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbzu zzbzuVar = (zzbzu) obj;
        zzfgd zzfgdVar = new zzfgd(zzbzuVar, new zzfll(zzbzuVar.zzj), null);
        zzfgf zzfgfVar = this.zza;
        zzfgfVar.zzd(zzfgdVar);
        return zzfgfVar.zzc();
    }

    public zzfgc(zzfgf zzfgfVar) {
        Objects.requireNonNull(zzfgfVar);
        this.zza = zzfgfVar;
    }
}
