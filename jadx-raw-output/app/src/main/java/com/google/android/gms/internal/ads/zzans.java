package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzans {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzanr
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return Integer.compare(((zzans) obj).zzb.zzb, ((zzans) obj2).zzb.zzb);
        }
    };
    private final zzant zzb;
    private final int zzc;

    public /* synthetic */ zzans(zzant zzantVar, int i10, byte[] bArr) {
        this.zzb = zzantVar;
        this.zzc = i10;
    }

    public final /* synthetic */ zzant zzc() {
        return this.zzb;
    }

    public final /* synthetic */ int zzd() {
        return this.zzc;
    }
}
