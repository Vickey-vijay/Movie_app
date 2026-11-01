package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4323kg implements InterfaceC4220gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4650xi f57114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final We f57115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M7 f57116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4523sg f57117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f57118f;

    public C4323kg(C4650xi c4650xi, We we2, @NonNull Handler handler) {
        this(c4650xi, we2, handler, we2.s());
    }

    public final void a() {
        if (this.f57113a) {
            return;
        }
        C4650xi c4650xi = this.f57114b;
        ResultReceiverC4573ug resultReceiverC4573ug = new ResultReceiverC4573ug(this.f57118f, this);
        c4650xi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC4573ug);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3("", "", InputDeviceCompat.SOURCE_TOUCHSCREEN, 0, anonymousInstance);
        n10.f55785m = bundle;
        G4 g10 = c4650xi.f57938a;
        c4650xi.a(C4650xi.a(n10, g10), g10, 1, (Map) null);
    }

    public C4323kg(C4650xi c4650xi, We we2, Handler handler, boolean z10) {
        this(c4650xi, we2, handler, z10, new M7(z10), new C4523sg());
    }

    public C4323kg(C4650xi c4650xi, We we2, Handler handler, boolean z10, M7 m10, C4523sg c4523sg) {
        this.f57114b = c4650xi;
        this.f57115c = we2;
        this.f57113a = z10;
        this.f57116d = m10;
        this.f57117e = c4523sg;
        this.f57118f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4220gg
    public final void a(@Nullable C4424og c4424og) {
        String str = c4424og == null ? null : c4424og.f57445a;
        if (!this.f57113a) {
            synchronized (this) {
                M7 m10 = this.f57116d;
                this.f57117e.getClass();
                m10.f55564d = C4523sg.a(str);
                m10.a();
            }
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            M7 m10 = this.f57116d;
            m10.f55563c = deferredDeeplinkParametersListener;
            if (m10.f55561a) {
                m10.a(1);
            } else {
                m10.a();
            }
            this.f57115c.u();
        } catch (Throwable th2) {
            this.f57115c.u();
            throw th2;
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            M7 m10 = this.f57116d;
            m10.f55562b = deferredDeeplinkListener;
            if (m10.f55561a) {
                m10.a(1);
            } else {
                m10.a();
            }
            this.f57115c.u();
        } catch (Throwable th2) {
            this.f57115c.u();
            throw th2;
        }
    }
}
