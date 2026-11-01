package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4178f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f56704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f56705b = Looper.getMainLooper().getThread();

    public C4178f0(InterfaceC4204g0 interfaceC4204g0, Map map) {
        this.f56704a = map;
    }
}
