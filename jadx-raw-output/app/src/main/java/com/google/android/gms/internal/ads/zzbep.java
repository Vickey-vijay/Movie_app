package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbep implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbef zzbefVar = (zzbef) obj;
        zzbef zzbefVar2 = (zzbef) obj2;
        if (zzbefVar.zzb() >= zzbefVar2.zzb()) {
            if (zzbefVar.zzb() > zzbefVar2.zzb()) {
                return 1;
            }
            if (zzbefVar.zza() >= zzbefVar2.zza()) {
                if (zzbefVar.zza() > zzbefVar2.zza()) {
                    return 1;
                }
                float fZzd = (zzbefVar.zzd() - zzbefVar.zzb()) * (zzbefVar.zzc() - zzbefVar.zza());
                float fZzd2 = (zzbefVar2.zzd() - zzbefVar2.zzb()) * (zzbefVar2.zzc() - zzbefVar2.zza());
                if (fZzd <= fZzd2) {
                    return fZzd < fZzd2 ? 1 : 0;
                }
            }
        }
        return -1;
    }

    public zzbep(zzbeq zzbeqVar) {
        Objects.requireNonNull(zzbeqVar);
    }
}
