package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes8.dex */
final class zzit implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjb zzjbVar = (zzjb) obj;
        zzjb zzjbVar2 = (zzjb) obj2;
        zzis zzisVar = new zzis(zzjbVar);
        zzis zzisVar2 = new zzis(zzjbVar2);
        while (zzisVar.hasNext() && zzisVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzisVar.zza() & 255).compareTo(Integer.valueOf(zzisVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzjbVar.zzd()).compareTo(Integer.valueOf(zzjbVar2.zzd()));
    }
}
