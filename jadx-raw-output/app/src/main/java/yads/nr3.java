package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;

/* JADX INFO: loaded from: classes10.dex */
public final class nr3 implements l00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitializationListener f80738a;

    public final boolean equals(Object obj) {
        return (obj instanceof nr3) && ck.p.e(((nr3) obj).f80738a, this.f80738a);
    }

    public final int hashCode() {
        return this.f80738a.hashCode();
    }

    @Override // yads.l00
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new mr3(this));
    }

    public nr3(InitializationListener initializationListener) {
        this.f80738a = initializationListener;
    }
}
