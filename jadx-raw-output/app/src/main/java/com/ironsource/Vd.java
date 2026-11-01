package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final class Vd {
    /* JADX INFO: Access modifiers changed from: private */
    public static final O0 b(Zd zd2, boolean z10) {
        O0.a aVar;
        if (z10) {
            aVar = O0.a.MANUAL;
        } else {
            aVar = zd2.k().e() ? O0.a.AUTOMATIC_LOAD_WHILE_SHOW : O0.a.AUTOMATIC_LOAD_AFTER_CLOSE;
        }
        return new O0(aVar, zd2.k().j(), zd2.k().b(), -1L);
    }
}
