package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class M7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f55562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f55563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K7 f55564d;

    public final void a(int i10) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkListener.Error error2;
        K7 k10 = this.f55564d;
        String str = k10 == null ? null : k10.f55458c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f55562b;
        if (deferredDeeplinkListener != null) {
            if (i10 == 0) {
                throw null;
            }
            int i11 = i10 - 1;
            if (i11 == 0) {
                error2 = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (i11 != 1) {
                error2 = i11 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER;
            } else {
                error2 = DeferredDeeplinkListener.Error.PARSE_ERROR;
            }
            deferredDeeplinkListener.onError(error2, (String) WrapUtils.getOrDefault(str, ""));
            this.f55562b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f55563c;
        if (deferredDeeplinkParametersListener != null) {
            if (i10 == 0) {
                throw null;
            }
            int i12 = i10 - 1;
            if (i12 == 0) {
                error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (i12 != 1) {
                error = i12 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER;
            } else {
                error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
            }
            deferredDeeplinkParametersListener.onError(error, (String) WrapUtils.getOrDefault(str, ""));
            this.f55563c = null;
        }
    }

    public M7(boolean z10) {
        this.f55561a = z10;
    }

    public final void a() {
        K7 k10 = this.f55564d;
        if (k10 != null) {
            String str = k10.f55457b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f55562b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f55562b = null;
                }
                if (!mo.a(this.f55564d.f55456a)) {
                    Map<String, String> map = this.f55564d.f55456a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f55563c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f55563c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f55564d.f55458c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f55563c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f55563c = null;
                    return;
                }
                return;
            }
            if (k10.f55458c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
