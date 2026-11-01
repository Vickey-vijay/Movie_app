package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        if (gVar == null || gVar2 == null) {
            return 0;
        }
        return gVar.f14957d < gVar2.f14957d ? -1 : 1;
    }
}
