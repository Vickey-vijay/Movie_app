package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzgwp {
    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static zzgwo zza(Set set, Set set2) {
        zzgrc.zzk(set, "set1");
        zzgrc.zzk(set2, "set2");
        return new zzgwk(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzb(Set set, zzgrd zzgrdVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgwl)) {
                set.getClass();
                return new zzgwl(set, zzgrdVar);
            }
            zzgwl zzgwlVar = (zzgwl) set;
            return new zzgwl((Set) zzgwlVar.zza, zzgrg.zzb(zzgwlVar.zzb, zzgrdVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzgwl)) {
            sortedSet.getClass();
            return new zzgwm(sortedSet, zzgrdVar);
        }
        zzgwl zzgwlVar2 = (zzgwl) sortedSet;
        return new zzgwm((SortedSet) zzgwlVar2.zza, zzgrg.zzb(zzgwlVar2.zzb, zzgrdVar));
    }

    public static int zzc(Set set) {
        int iHashCode;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i10 += iHashCode;
        }
        return i10;
    }

    public static boolean zzf(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgvw) {
            collection = ((zzgvw) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        return zze(set, collection.iterator());
    }
}
