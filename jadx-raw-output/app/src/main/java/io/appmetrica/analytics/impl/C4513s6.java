package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4513s6 implements Df {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4488r6 f57649b = new C4488r6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Df f57650a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4513s6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Df
    public final String a() {
        return this.f57650a.a();
    }

    public final boolean b() {
        try {
            String strA = this.f57650a.a();
            return (strA == null || strA.length() <= 0 || lk.a0.X(strA, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C4513s6(Df df2) {
        this.f57650a = df2;
    }

    public final boolean a(String str) {
        try {
            String strA = this.f57650a.a();
            if (strA == null || strA.length() <= 0) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(str);
            return lk.x.D(strA, sb2.toString(), false, 2, null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4513s6(Df df2, int i10, ck.i iVar) {
        if ((i10 & 1) != 0) {
            f57649b.getClass();
            df2 = C4488r6.a();
        }
        this(df2);
    }
}
