package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7053b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7054c = new Object();

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c5 f7060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f7061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f7062c;

        public /* synthetic */ c(c5 c5Var, long j10, a aVar) {
            this(c5Var, j10);
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            c5 c5VarC = c();
            c5 c5VarC2 = cVar.c();
            return c5VarC != null ? c5VarC.equals(c5VarC2) : c5VarC2 == null;
        }

        private c(c5 c5Var, long j10) {
            this.f7060a = c5Var;
            this.f7061b = j10;
            this.f7062c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f7061b;
        }

        public c5 c() {
            return this.f7060a;
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            if (SystemClock.elapsedRealtime() - this.f7062c > this.f7061b) {
                return true;
            }
            return false;
        }

        public long a() {
            return this.f7062c;
        }

        public int hashCode() {
            int iHashCode;
            long jB = b();
            long jA = a();
            c5 c5VarC = c();
            int i10 = (((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59;
            if (c5VarC == null) {
                iHashCode = 43;
            } else {
                iHashCode = c5VarC.hashCode();
            }
            return i10 + iHashCode;
        }
    }

    public void a(c5 c5Var, d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        if (c5Var == null) {
            return;
        }
        long jV = d5Var.v();
        if (jV <= 0) {
            return;
        }
        this.f7052a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7052a.O().a("SignalCacheManager", "Caching signal for: " + d5Var);
        }
        String strA = a(d5Var, str, maxAdFormat);
        c cVar = new c(c5Var, jV, null);
        synchronized (this.f7054c) {
            this.f7053b.put(strA, cVar);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7055a;

        static {
            int[] iArr = new int[b.values().length];
            f7055a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7055a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7055a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b5(com.applovin.impl.sdk.k kVar) {
        this.f7052a = kVar;
    }

    public c5 b(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String strA = a(d5Var, str, maxAdFormat);
        synchronized (this.f7054c) {
            c cVar = (c) this.f7053b.get(strA);
            if (cVar == null) {
                return null;
            }
            if (cVar.d()) {
                this.f7053b.remove(strA);
                return null;
            }
            this.f7052a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7052a.O().a("SignalCacheManager", "Returning cached signal for: " + d5Var);
            }
            return cVar.f7060a;
        }
    }

    private String a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String strC = d5Var.c();
        int i10 = a.f7055a[d5Var.t().ordinal()];
        if (i10 == 1) {
            return strC + "_" + maxAdFormat.getLabel();
        }
        if (i10 != 2) {
            return strC;
        }
        return strC + "_" + str;
    }
}
