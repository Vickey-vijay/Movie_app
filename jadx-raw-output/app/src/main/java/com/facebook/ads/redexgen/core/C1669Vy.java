package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1669Vy {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C1669Vy> A02 = new ThreadLocal<>();
    public final C1652Vh A00 = new C1652Vh();

    public static C1652Vh A00() {
        return A02().A00;
    }

    public static C1652Vh A01(C1668Vx c1668Vx) {
        C1652Vh currentStackTraces = new C1652Vh(A00());
        currentStackTraces.add(c1668Vx);
        return currentStackTraces;
    }

    public static C1669Vy A02() {
        C1669Vy c1669Vy = A02.get();
        if (c1669Vy == null) {
            C1669Vy c1669Vy2 = new C1669Vy();
            A02.set(c1669Vy2);
            return c1669Vy2;
        }
        return c1669Vy;
    }

    public static void A03(AbstractRunnableC1664Vt abstractRunnableC1664Vt) {
        C1652Vh c1652VhA06 = abstractRunnableC1664Vt.A06();
        if (c1652VhA06 != null) {
            C1652Vh createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(c1652VhA06);
        }
    }

    public static void A04(AbstractRunnableC1664Vt abstractRunnableC1664Vt) {
        C1652Vh c1652VhA06 = abstractRunnableC1664Vt.A06();
        if (c1652VhA06 != null) {
            C1652Vh c1652Vh = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c1652Vh.removeAll(c1652VhA06);
        }
    }
}
