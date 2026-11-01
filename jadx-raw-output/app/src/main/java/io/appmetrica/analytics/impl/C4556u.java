package io.appmetrica.analytics.impl;

import java.util.Collection;
import org.json.JSONArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4556u implements InterfaceC4606w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57741a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) nj.b0.y0(nj.r.e(this.f57741a), C4105c4.l().m().f56267d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
