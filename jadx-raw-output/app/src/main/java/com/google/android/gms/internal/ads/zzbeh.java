package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbeh implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbem zzbemVar = (zzbem) obj;
        zzbem zzbemVar2 = (zzbem) obj2;
        int i10 = zzbemVar.zzc - zzbemVar2.zzc;
        return i10 != 0 ? i10 : Long.compare(zzbemVar.zza, zzbemVar2.zza);
    }

    public zzbeh(zzbej zzbejVar) {
        Objects.requireNonNull(zzbejVar);
    }
}
