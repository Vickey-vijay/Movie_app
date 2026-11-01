package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class R5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27534e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f27535a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC3620o f27537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3802yb f27538d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC3620o interfaceC3620o = R5.this.f27537c;
            if (interfaceC3620o != null) {
                interfaceC3620o.a();
            }
        }
    }

    public void a(long j10) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f27536b) - Math.max(j10, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f27537c.a();
                return;
            }
            a();
            this.f27538d = new C3802yb(millis, this.f27535a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public boolean b() {
        return this.f27536b > 0;
    }

    public R5(int i10, InterfaceC3620o interfaceC3620o) {
        this.f27537c = interfaceC3620o;
        this.f27536b = i10;
    }

    public void a() {
        if (!b() || this.f27538d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f27538d.e();
        this.f27538d = null;
    }
}
