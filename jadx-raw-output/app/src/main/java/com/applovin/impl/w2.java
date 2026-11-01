package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m4 f9803a = new m4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet f9804b = new TreeSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9805c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9807e;

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.o.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f9803a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f9803a.isEmpty()) {
            this.f9803a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f9803a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f9803a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f9803a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f9804b);
    }

    public int c() {
        int i10 = this.f9806d;
        if (i10 != -1 && this.f9807e != -1) {
            while (i10 <= this.f9807e) {
                if (g(i10) && !h(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public Collection e(int i10) {
        return new TreeSet((SortedSet) this.f9804b.tailSet(Integer.valueOf(i10), false));
    }

    public void f(int i10) {
        int iB = this.f9803a.b(Integer.valueOf(i10));
        for (int size = this.f9803a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f9803a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f9803a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i10) {
        return this.f9803a.contains(Integer.valueOf(i10));
    }

    public boolean h(int i10) {
        return this.f9804b.contains(Integer.valueOf(i10));
    }

    public void i(int i10) {
        int iB = this.f9803a.b(Integer.valueOf(i10));
        if (g(i10)) {
            this.f9805c.remove(Integer.valueOf(i10));
            this.f9804b.remove(Integer.valueOf(i10));
            this.f9803a.b(iB);
        }
        while (iB < this.f9803a.size()) {
            Integer num = (Integer) this.f9803a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f9803a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public w2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    public void b(int i10, int i11) {
        i(i10);
        f(i11);
    }

    public int d(int i10) {
        if (g(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public void c(int i10, int i11) {
        this.f9806d = i10;
        this.f9807e = i11;
    }

    public int c(int i10) {
        return i10 + a(i10, false);
    }

    public MaxAd a(int i10) {
        return (MaxAd) this.f9805c.get(Integer.valueOf(i10));
    }

    public void a(MaxAd maxAd, int i10) {
        this.f9805c.put(Integer.valueOf(i10), maxAd);
        this.f9804b.add(Integer.valueOf(i10));
    }

    public void a() {
        this.f9805c.clear();
        this.f9804b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f9805c.remove(num);
            this.f9804b.remove(num);
        }
    }

    private void a(int i10, int i11) {
        if (this.f9805c.containsKey(Integer.valueOf(i10))) {
            this.f9805c.put(Integer.valueOf(i11), (MaxAd) this.f9805c.get(Integer.valueOf(i10)));
            this.f9804b.add(Integer.valueOf(i11));
            this.f9805c.remove(Integer.valueOf(i10));
            this.f9804b.remove(Integer.valueOf(i10));
        }
    }

    private int a(int i10, boolean z10) {
        int iC = this.f9803a.c(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + iC;
            while (iC < this.f9803a.size() && i11 >= ((Integer) this.f9803a.a(iC)).intValue()) {
                i11++;
                iC++;
            }
        }
        return iC;
    }
}
