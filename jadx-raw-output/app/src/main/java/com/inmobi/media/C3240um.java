package com.inmobi.media;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3240um implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        System.out.println((Object) (((C3115pl) pair.getFirst()).f25094c + com.ironsource.Z7.f27998r + pair.getSecond()));
        Double d10 = (Double) pair.getSecond();
        Pair pair2 = (Pair) obj2;
        System.out.println((Object) (((C3115pl) pair2.getFirst()).f25094c + com.ironsource.Z7.f27998r + pair2.getSecond()));
        return qj.b.d(d10, (Double) pair2.getSecond());
    }
}
