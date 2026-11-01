package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzanu implements Comparable {
    public final int zza;
    public final zzanp zzb;

    public zzanu(int i10, zzanp zzanpVar) {
        this.zza = i10;
        this.zzb = zzanpVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzanu) obj).zza);
    }
}
