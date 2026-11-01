package n0;

import com.digitalturbine.ignite.authenticator.events.d;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f64667b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f64668a;

    public static void a(d dVar, Exception exc) {
        b(dVar, u0.a.a(exc, null));
    }

    public static void b(d dVar, Object... objArr) {
        r0.b.a("%s : dispatching event", "IgniteEventDispatcher");
        if (f64667b.f64668a != null) {
            t tVarA = t.a(dVar);
            if (tVarA == null) {
                IAlog.f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", dVar);
            } else {
                new w(tVarA).a(objArr).a((String) null);
            }
        }
    }
}
