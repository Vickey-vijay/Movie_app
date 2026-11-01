package com.ironsource.mediationsdk.logger;

import com.ironsource.C3523ib;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class IronSourceLoggerManager extends IronSourceLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile IronSourceLoggerManager f29863d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IronSourceLogger> f29864c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f29864c = new CopyOnWriteArrayList();
        c();
    }

    public static IronSourceLoggerManager getLogger() {
        if (f29863d == null) {
            synchronized (IronSourceLoggerManager.class) {
                if (f29863d == null) {
                    f29863d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
                }
            }
        }
        return f29863d;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C3523ib c3523ib) {
        if (a(c3523ib.a())) {
            return;
        }
        a(ironSourceTag, c3523ib.c(), c3523ib.a());
    }

    private void c() {
        this.f29864c.add(new a(0));
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f29864c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        if (th2 == null) {
            Iterator<IronSourceLogger> it = this.f29864c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f29864c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th2);
            }
        }
    }

    public void setLoggerDebugLevel(String str, int i10) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerA = a(str);
        if (ironSourceLoggerA == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
            return;
        }
        if (i10 < 0 || i10 > 3) {
            this.f29864c.remove(ironSourceLoggerA);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
        ironSourceLoggerA.setDebugLevel(i10);
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C3523ib c3523ib, Throwable th2) {
        if (a(c3523ib.a())) {
            return;
        }
        logException(ironSourceTag, c3523ib.c(), th2);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (a(i10)) {
            return;
        }
        a(ironSourceTag, str, i10);
    }

    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    private IronSourceLoggerManager(String str, int i10) {
        super(str, i10);
        this.f29864c = new CopyOnWriteArrayList();
        c();
    }

    private boolean a(int i10) {
        return i10 < this.f29859a;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        for (IronSourceLogger ironSourceLogger : this.f29864c) {
            if (ironSourceLogger.a() <= i10) {
                ironSourceLogger.log(ironSourceTag, str, i10);
            }
        }
    }

    public static IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager logger = getLogger();
        logger.f29859a = i10;
        return logger;
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.f29864c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }
}
