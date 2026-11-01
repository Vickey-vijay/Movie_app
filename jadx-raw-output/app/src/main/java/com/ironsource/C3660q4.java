package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3660q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f30538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30540c;

    public final Throwable a() {
        return this.f30538a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3660q4) && ck.p.e(this.f30538a, ((C3660q4) obj).f30538a);
    }

    public C3660q4(Throwable th2) {
        ck.p.j(th2, "throwable");
        this.f30538a = th2;
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        ck.p.i(stackTrace, "throwable.stackTrace");
        sb2.append(th2.toString());
        sb2.append(System.lineSeparator());
        boolean z10 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString());
            sb2.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            ck.p.i(string, "elem.toString()");
            String strE = C3676r4.d().e();
            ck.p.i(strE, "getInstance().keyword");
            if (lk.a0.X(string, strE, false, 2, null)) {
                z10 = true;
            }
        }
        Throwable cause = this.f30538a.getCause();
        if (cause != null) {
            sb2.append("--CAUSE");
            sb2.append(System.lineSeparator());
            sb2.append(cause.toString());
            sb2.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            ck.p.i(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb2.append(stackTraceElement2.toString());
                sb2.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                ck.p.i(string2, "elem.toString()");
                String strE2 = C3676r4.d().e();
                ck.p.i(strE2, "getInstance().keyword");
                if (lk.a0.X(string2, strE2, false, 2, null)) {
                    z10 = true;
                }
            }
        }
        String string3 = sb2.toString();
        ck.p.i(string3, "builder.toString()");
        this.f30539b = string3;
        this.f30540c = z10;
    }

    public final C3660q4 a(Throwable th2) {
        ck.p.j(th2, "throwable");
        return new C3660q4(th2);
    }

    public final String b() {
        return this.f30539b;
    }

    public final Throwable c() {
        return this.f30538a;
    }

    public final boolean d() {
        return this.f30540c;
    }

    public int hashCode() {
        return this.f30538a.hashCode();
    }

    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f30538a + ")";
    }

    public static /* synthetic */ C3660q4 a(C3660q4 c3660q4, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = c3660q4.f30538a;
        }
        return c3660q4.a(th2);
    }
}
