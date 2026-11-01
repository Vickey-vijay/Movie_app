package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class U5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U5 f27747a = new U5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f27748b = "ext_";

    public final Map<String, String> a(Bundle bundle) {
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            return kotlin.collections.a.j();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(setKeySet, 10)), 16));
        for (String str : setKeySet) {
            String str2 = f27748b + str;
            Object obj = bundle.get(str);
            Pair pairA = mj.h.a(str2, obj instanceof Iterable ? nj.b0.p0((Iterable) obj, ", ", null, null, 0, null, null, 62, null) : obj == null ? null : obj.toString());
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }

    private U5() {
    }
}
