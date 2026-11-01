package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class I2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final O0 b(U2 u10) {
        O0.a aVar;
        if (u10.d().e()) {
            aVar = O0.a.MANUAL_WITH_LOAD_ON_SHOW;
        } else {
            aVar = O0.a.MANUAL_WITH_AUTOMATIC_RELOAD;
        }
        return new O0(aVar, u10.d().j(), u10.d().b(), ((long) u10.h()) * 1000);
    }
}
