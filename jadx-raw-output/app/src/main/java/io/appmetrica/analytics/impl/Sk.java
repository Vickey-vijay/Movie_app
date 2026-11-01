package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f55868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rk f55869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X4 f55870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC4203g f55871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC4203g f55872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ek f55873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55874g = 0;

    public final synchronized long a() {
        Ek ek2;
        ek2 = this.f55873f;
        return ek2 == null ? 10000000000L : ek2.f55193d - 1;
    }

    public final void b(Ek ek2, Q5 q10) {
        if (ek2.f55196g && ek2.f55193d > 0) {
            X4 x10 = this.f55870c;
            Q5 q5A = Q5.a(q10, EnumC4112cb.EVENT_TYPE_ALIVE);
            Uk uk2 = new Uk();
            uk2.f55996a = ek2.f55193d;
            uk2.f55999d = ek2.f55192c.f55315a;
            long andIncrement = ek2.f55195f.getAndIncrement();
            Vk vk2 = ek2.f55191b;
            vk2.a(Vk.f56038g, Long.valueOf(ek2.f55195f.get()));
            vk2.b();
            uk2.f55997b = andIncrement;
            uk2.f55998c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ek2.f55198i - ek2.f55194e, ek2.f55199j));
            x10.f56132a.f56212n.a(q5A, uk2);
            if (ek2.f55196g) {
                ek2.f55196g = false;
                Vk vk3 = ek2.f55191b;
                vk3.a(Vk.f56040i, Boolean.FALSE);
                vk3.b();
            }
        }
        PublicLogger publicLogger = this.f55868a.f56211m;
        int iOrdinal = ek2.f55192c.f55315a.ordinal();
        if (iOrdinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (iOrdinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ek2) {
            Vk vk4 = ek2.f55191b;
            vk4.getClass();
            vk4.f56043c = new C4215gb();
            vk4.b();
            ek2.f55197h = null;
        }
    }

    public final synchronized void c(Q5 q10) {
        if (this.f55874g == 0) {
            Ek ekB = this.f55871d.b();
            if (a(ekB, q10)) {
                this.f55873f = ekB;
                this.f55874g = 3;
            } else {
                Ek ekB2 = this.f55872e.b();
                if (a(ekB2, q10)) {
                    this.f55873f = ekB2;
                    this.f55874g = 2;
                } else {
                    this.f55873f = null;
                    this.f55874g = 1;
                }
            }
        }
        int iA = L7.a(this.f55874g);
        if (iA == 0) {
            this.f55873f = a(q10);
        } else if (iA == 1) {
            b(this.f55873f, q10);
            this.f55873f = a(q10);
        } else if (iA == 2) {
            if (a(this.f55873f, q10)) {
                Ek ek2 = this.f55873f;
                long j10 = q10.f55781i;
                ek2.f55198i = j10;
                Vk vk2 = ek2.f55191b;
                vk2.a(Vk.f56035d, Long.valueOf(j10));
                vk2.b();
            } else {
                this.f55873f = a(q10);
            }
        }
    }

    public Sk(Y4 y10, Rk rk2, X4 x10, C4266ia c4266ia, A2 a10) {
        this.f55868a = y10;
        this.f55870c = x10;
        this.f55871d = c4266ia;
        this.f55872e = a10;
        this.f55869b = rk2;
    }

    public final Ek a(Q5 q10) {
        this.f55868a.f56211m.info("Start foreground session", new Object[0]);
        long j10 = q10.f55781i;
        AbstractC4203g abstractC4203g = this.f55871d;
        Fk fk2 = new Fk(j10, q10.f55782j);
        abstractC4203g.getClass();
        Ek ekA = abstractC4203g.a(fk2);
        this.f55874g = 3;
        ((C4338l5) this.f55868a.f56214p).e();
        X4 x10 = this.f55870c;
        x10.f56132a.f56212n.a(Q5.a(q10, C4418oa.I.i()), a(ekA, j10));
        return ekA;
    }

    public static Uk a(Ek ek2, long j10) {
        Uk uk2 = new Uk();
        uk2.f55996a = ek2.f55193d;
        long andIncrement = ek2.f55195f.getAndIncrement();
        Vk vk2 = ek2.f55191b;
        vk2.a(Vk.f56038g, Long.valueOf(ek2.f55195f.get()));
        vk2.b();
        uk2.f55997b = andIncrement;
        Vk vk3 = ek2.f55191b;
        long j11 = j10 - ek2.f55194e;
        ek2.f55199j = j11;
        vk3.a(Vk.f56036e, Long.valueOf(j11));
        uk2.f55998c = TimeUnit.MILLISECONDS.toSeconds(ek2.f55199j);
        uk2.f55999d = ek2.f55192c.f55315a;
        return uk2;
    }

    public final synchronized Ek b(Q5 q10) {
        if (this.f55874g == 0) {
            Ek ekB = this.f55871d.b();
            if (a(ekB, q10)) {
                this.f55873f = ekB;
                this.f55874g = 3;
            } else {
                Ek ekB2 = this.f55872e.b();
                if (a(ekB2, q10)) {
                    this.f55873f = ekB2;
                    this.f55874g = 2;
                } else {
                    this.f55873f = null;
                    this.f55874g = 1;
                }
            }
        }
        if (this.f55874g != 1 && !a(this.f55873f, q10)) {
            this.f55874g = 1;
            this.f55873f = null;
        }
        int iA = L7.a(this.f55874g);
        if (iA == 1) {
            Ek ek2 = this.f55873f;
            long j10 = q10.f55781i;
            ek2.f55198i = j10;
            Vk vk2 = ek2.f55191b;
            vk2.a(Vk.f56035d, Long.valueOf(j10));
            vk2.b();
            return this.f55873f;
        }
        if (iA != 2) {
            this.f55868a.f56211m.info("Start background session", new Object[0]);
            this.f55874g = 2;
            long j11 = q10.f55781i;
            AbstractC4203g abstractC4203g = this.f55872e;
            Fk fk2 = new Fk(j11, q10.f55782j);
            abstractC4203g.getClass();
            Ek ekA = abstractC4203g.a(fk2);
            if (this.f55868a.f56218t.c()) {
                X4 x10 = this.f55870c;
                x10.f56132a.f56212n.a(Q5.a(q10, C4418oa.I.i()), a(ekA, q10.f55781i));
            } else {
                int i10 = q10.f55776d;
                EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
                if (i10 == 6145) {
                    X4 x11 = this.f55870c;
                    x11.f56132a.f56212n.a(q10, a(ekA, j11));
                    X4 x12 = this.f55870c;
                    x12.f56132a.f56212n.a(Q5.a(q10, C4418oa.I.i()), a(ekA, j11));
                }
            }
            this.f55873f = ekA;
            return ekA;
        }
        return this.f55873f;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    public final boolean a(Ek ek2, Q5 q10) {
        boolean z10;
        boolean z11;
        if (ek2 == null) {
            return false;
        }
        long j10 = q10.f55781i;
        boolean z12 = ek2.f55193d >= 0;
        if (ek2.f55197h == null) {
            synchronized (ek2) {
                if (ek2.f55197h == null) {
                    try {
                        String asString = ek2.f55190a.f56203e.a(ek2.f55193d, ek2.f55192c.f55315a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            ek2.f55197h = new Tk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Tk tk2 = ek2.f55197h;
        if (tk2 != null) {
            C4350lh c4350lh = (C4350lh) ek2.f55190a.f56209k.a();
            Boolean[] boolArr = new Boolean[7];
            boolArr[0] = Boolean.valueOf(TextUtils.equals(c4350lh.getAnalyticsSdkVersionName(), tk2.f55931a));
            boolArr[1] = Boolean.valueOf(TextUtils.equals(c4350lh.getAnalyticsSdkBuildNumber(), tk2.f55932b));
            boolArr[2] = Boolean.valueOf(TextUtils.equals(c4350lh.getAppVersion(), tk2.f55933c));
            boolArr[3] = Boolean.valueOf(TextUtils.equals(c4350lh.getAppBuildNumber(), tk2.f55934d));
            boolArr[4] = Boolean.valueOf(TextUtils.equals(c4350lh.getOsVersion(), tk2.f55935e));
            boolArr[5] = Boolean.valueOf(tk2.f55936f == c4350lh.getOsApiLevel());
            boolArr[6] = Boolean.valueOf(tk2.f55937g == c4350lh.f57214r);
            List listN = nj.s.n(boolArr);
            if (!(listN instanceof Collection) || !listN.isEmpty()) {
                Iterator it = listN.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            z10 = false;
                        }
                    }
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        long jElapsedRealtime = ek2.f55200k.elapsedRealtime();
        long j11 = ek2.f55198i;
        boolean z13 = jElapsedRealtime < j11;
        long j12 = j10 - j11;
        long j13 = j10 - ek2.f55194e;
        if (z13) {
            z11 = true;
        } else {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Hk hk2 = ek2.f55192c;
            int iIntValue = ((C4350lh) ek2.f55190a.f56209k.a()).f57202f;
            Integer num = hk2.f55318d;
            if (num != null) {
                iIntValue = num.intValue();
            }
            if (j12 >= timeUnit.toMillis(iIntValue) || j13 >= timeUnit.toMillis(Ik.f55360a)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        boolean z14 = !z11;
        if (z12 && z10 && z14) {
            return true;
        }
        b(ek2, q10);
        return false;
    }
}
