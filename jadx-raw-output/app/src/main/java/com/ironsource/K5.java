package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: loaded from: classes7.dex */
class K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f26926a = "ironbeast";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f26927b = "outcome";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26928c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f26929d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26930e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26931f = 0;

    public static AbstractC3439e a(String str, int i10) {
        if (f26926a.equals(str)) {
            return new C3557ka(i10);
        }
        if (f26927b.equals(str)) {
            return new Uc(i10);
        }
        if (i10 == 2) {
            return new C3557ka(i10);
        }
        if (i10 == 3) {
            return new Uc(i10);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i10 + ")", 2);
        return null;
    }
}
