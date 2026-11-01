package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4623wg {
    public static Pa a(Context context, IHandlerExecutor iHandlerExecutor) {
        C4297jg c4297jg;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c4297jg = new C4297jg(context, iHandlerExecutor);
            } catch (Throwable unused) {
                c4297jg = null;
            }
        } else {
            c4297jg = null;
        }
        return c4297jg == null ? new C4598vg() : c4297jg;
    }

    public C4623wg(Pa pa2) {
    }
}
