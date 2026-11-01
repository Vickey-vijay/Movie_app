package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D0 {
    public static C6 a(Handler handler, C0 c10) {
        return new C6(handler, c10);
    }

    public static Cf a(Context context, C6 c10) {
        return new Cf(context, c10);
    }

    public static C4650xi a(Cf cf2, Context context, ICommonExecutor iCommonExecutor) {
        C4433p0 c4433p0 = new C4433p0(context, iCommonExecutor);
        return new C4650xi(c4433p0, new Tn(new C4369mb()), new G4(cf2), new Zj(context, c4433p0));
    }

    public static Pl a(Context context, C4650xi c4650xi, We we2, Handler handler) {
        return new Pl(c4650xi, new Xl(context, we2), handler);
    }

    public static C4323kg a(C4650xi c4650xi, We we2, Handler handler) {
        return new C4323kg(c4650xi, we2, handler, we2.s());
    }

    public static C4325ki a(Context context, Cf cf2, C4650xi c4650xi, Handler handler, Pl pl2) {
        return new C4325ki(context, cf2, c4650xi, handler, pl2);
    }

    public static C4140dd a(Context context) {
        return new C4140dd(C4105c4.l().f56438c.a(), C4105c4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
