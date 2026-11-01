package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cb f55212a = new Cb(C4105c4.l().d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Db f55213b = new Db();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fb f55214c = new Fb();

    public final void a(final String str, final String str2, final String str3) {
        Cb cb2 = this.f55212a;
        if (cb2.f55088c.a((Void) null).f57616a && cb2.f55089d.a(str).f57616a && cb2.f55090e.a(str2).f57616a && cb2.f55091f.a(str3).f57616a) {
            this.f55213b.getClass();
            ((A9) C4105c4.l().f56438c.a()).f54955b.post(new Runnable() { // from class: af.c
                @Override // java.lang.Runnable
                public final void run() {
                    F0.a(this.f3545b, str, str2, str3);
                }
            });
            return;
        }
        String str4 = "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3;
        PublicLogger.INSTANCE.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]" + str4, new Object[0]);
    }

    public static final void a(F0 f10, String str, String str2, String str3) {
        List list;
        Context contextA;
        Fb fb2 = f10.f55214c;
        fb2.getClass();
        Pair[] pairArr = new Pair[3];
        if (str == null) {
            str = "null";
        }
        pairArr[0] = mj.h.a(NotificationCompat.MessagingStyle.Message.KEY_SENDER, str);
        if (str2 == null) {
            str2 = "null";
        }
        pairArr[1] = mj.h.a("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        pairArr[2] = mj.h.a("payload", str3);
        Map<String, Object> mapO = kotlin.collections.a.o(pairArr);
        ModuleEvent.Builder builderWithName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (fb2) {
            if (fb2.f55229a == null && (contextA = C4105c4.l().f56442g.a()) != null) {
                fb2.f55229a = nj.s.n(new Qd(), new C4227gn(contextA), new Ko());
            }
            list = fb2.f55229a;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC4531t) it.next()).a(mapO);
            }
        }
        ModulesFacade.reportEvent(builderWithName.withAttributes(mapO).build());
    }
}
