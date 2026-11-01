package com.ironsource;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f27023a = new M();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, Long> f27024b = new HashMap<>();

    public final HashMap<String, Long> a() {
        return f27024b;
    }

    public final boolean a(String str, long j10) {
        ck.p.j(str, C3605n2.f30210p);
        if (str.length() == 0) {
            return false;
        }
        HashMap<String, Long> map = f27024b;
        if (map.containsKey(str)) {
            return false;
        }
        map.put(str, Long.valueOf(j10));
        return true;
    }

    public final long b(String str) {
        ck.p.j(str, C3605n2.f30210p);
        Long l10 = f27024b.get(str);
        if (l10 != null) {
            return System.currentTimeMillis() - l10.longValue();
        }
        return -1L;
    }

    public final long c(String str) {
        ck.p.j(str, C3605n2.f30210p);
        Long l10 = f27024b.get(str);
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    private M() {
    }

    public final boolean a(String str) {
        ck.p.j(str, C3605n2.f30210p);
        HashMap<String, Long> map = f27024b;
        if (map.get(str) == null) {
            return false;
        }
        map.remove(str);
        return true;
    }
}
