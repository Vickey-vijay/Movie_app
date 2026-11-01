package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1889bu {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1888bt>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1888bt>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1888bt A01(C1977dL c1977dL, AbstractC2252hy abstractC2252hy, int i10, InterfaceC1886br interfaceC1886br) {
        C1888bt c1888bt = new C1888bt(c1977dL, abstractC2252hy, c1977dL.A02().A0A(), i10);
        c1888bt.A0b(interfaceC1886br);
        c1888bt.A0X();
        A01.put(abstractC2252hy.A17(), new WeakReference<>(c1888bt));
        return c1888bt;
    }

    public static C1888bt A02(String str) {
        WeakReference<C1888bt> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2252hy abstractC2252hy, C1888bt c1888bt) {
        A01.put(abstractC2252hy.A17(), new WeakReference<>(c1888bt));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
