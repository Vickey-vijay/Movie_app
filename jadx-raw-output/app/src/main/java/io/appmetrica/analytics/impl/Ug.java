package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Ug extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f55989b;

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        Hc hc2 = (Hc) Hc.f55297c.get(q10.f55776d);
        HashMap map = new HashMap();
        map.put("type", hc2.f55298a);
        map.put("delivery_method", hc2.f55299b);
        this.f55989b.reportEvent("crash_saved", map);
        return false;
    }

    public Ug(@NonNull Y4 y10, @NonNull IReporter iReporter) {
        super(y10);
        this.f55989b = iReporter;
    }
}
