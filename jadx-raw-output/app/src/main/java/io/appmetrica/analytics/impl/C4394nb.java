package io.appmetrica.analytics.impl;

import android.os.Process;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4394nb implements InterfaceC4096bl {
    @Override // io.appmetrica.analytics.impl.InterfaceC4096bl
    public final boolean a(C4318kb c4318kb) {
        Integer num = c4318kb.f57099f;
        return num == null || num.intValue() != Process.myPid();
    }
}
