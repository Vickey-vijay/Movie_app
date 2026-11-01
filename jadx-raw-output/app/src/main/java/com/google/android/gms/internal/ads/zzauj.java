package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzauj implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzauk zzaukVar = (zzauk) obj;
        zzauk zzaukVar2 = (zzauk) obj2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzaukVar.zza.length;
            if (i10 >= length || i11 >= zzaukVar2.zza.length) {
                break;
            }
            int iCompare = Integer.compare(zzauk.zzg(zzaukVar.zzb(i10)), zzauk.zzg(zzaukVar2.zzb(i11)));
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
            i11++;
        }
        return Integer.compare(length, zzaukVar2.zza.length);
    }
}
