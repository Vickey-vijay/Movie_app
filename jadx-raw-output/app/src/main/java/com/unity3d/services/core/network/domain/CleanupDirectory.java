package com.unity3d.services.core.network.domain;

import ck.p;
import com.ironsource.C3426d4;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kk.i;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;
import nj.b0;
import nj.s;
import qj.b;
import yj.h;

/* JADX INFO: compiled from: CleanupDirectory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CleanupDirectory {
    public final void invoke(File file, int i10, long j10) {
        List list;
        p.j(file, "directory");
        if (!(file.exists() && file.isDirectory())) {
            throw new IllegalArgumentException(("Directory does not exist or is not a directory: " + file).toString());
        }
        Object obj = null;
        i iVarZ = SequencesKt___SequencesKt.z(h.q(file, null, 1, null), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        Iterator it = iVarZ.iterator();
        long length = 0;
        long length2 = 0;
        while (it.hasNext()) {
            length2 += ((File) it.next()).length();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iVarZ) {
            if (((File) obj2).lastModified() + j10 < jCurrentTimeMillis) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.component1();
        List list3 = (List) pair.component2();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            length += ((File) it2.next()).length();
        }
        long j11 = length2 - length;
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
        long j12 = i10 * 1024 * 1024;
        if (j11 > j12) {
            for (Object obj3 : SequencesKt___SequencesKt.O(SequencesKt___SequencesKt.P(b0.S(list3), new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return b.d(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t11).lastModified()));
                }
            }), mj.h.a(Long.valueOf(j11), s.k()), new bk.p<Pair<? extends Long, ? extends List<? extends File>>, File, Pair<? extends Long, ? extends List<? extends File>>>() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$additionalFiles$2
                @Override // bk.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Pair<? extends Long, ? extends List<? extends File>> mo1invoke(Pair<? extends Long, ? extends List<? extends File>> pair2, File file2) {
                    return invoke2((Pair<Long, ? extends List<? extends File>>) pair2, file2);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Pair<Long, List<File>> invoke2(Pair<Long, ? extends List<? extends File>> pair2, File file2) {
                    p.j(pair2, "<name for destructuring parameter 0>");
                    p.j(file2, C3426d4.i.f28530b);
                    return mj.h.a(Long.valueOf(pair2.component1().longValue() - file2.length()), b0.z0(pair2.component2(), file2));
                }
            })) {
                if (((Number) ((Pair) obj3).component1()).longValue() <= j12) {
                    obj = obj3;
                    break;
                }
            }
            Pair pair2 = (Pair) obj;
            if (pair2 != null && (list = (List) pair2.component2()) != null) {
                list3 = list;
            }
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                ((File) it4.next()).delete();
            }
        }
    }
}
