package com.ironsource;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface Vc {
    default void a(A a10, String str, C3649pa c3649pa) {
        ck.p.j(a10, C3605n2.f30210p);
        ck.p.j(c3649pa, "publisherDataHolder");
    }

    default void a(List<? extends A> list, A a10) {
        ck.p.j(list, "waterfallInstances");
        ck.p.j(a10, "winnerInstance");
    }
}
