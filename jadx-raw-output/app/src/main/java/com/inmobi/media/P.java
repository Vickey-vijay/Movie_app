package com.inmobi.media;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class P implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        F6 f10 = (F6) obj2;
        F6 f11 = (F6) obj;
        return qj.b.d(Integer.valueOf(f10.f22621c * f10.f22622d), Integer.valueOf(f11.f22621c * f11.f22622d));
    }
}
