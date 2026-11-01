package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: renamed from: com.ironsource.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C3636of implements InterfaceC3713t7, InterfaceC3713t7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3710t4 f30361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T8 f30362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, C3580lf> f30363c;

    /* JADX INFO: renamed from: com.ironsource.of$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f30365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f30366c;

        public final int a() {
            return this.f30364a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30364a == aVar.f30364a && this.f30365b == aVar.f30365b && ck.p.e(this.f30366c, aVar.f30366c);
        }

        public final a a(int i10, long j10, Long l10) {
            return new a(i10, j10, l10);
        }

        public final long b() {
            return this.f30365b;
        }

        public final Long c() {
            return this.f30366c;
        }

        public final int d() {
            return this.f30364a;
        }

        public final long e() {
            return this.f30365b;
        }

        public final Long f() {
            return this.f30366c;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.f30364a) * 31) + Long.hashCode(this.f30365b)) * 31;
            Long l10 = this.f30366c;
            return iHashCode + (l10 == null ? 0 : l10.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f30364a + ", currentTime=" + this.f30365b + ", currentTimeThreshold=" + this.f30366c + ")";
        }

        public a(int i10, long j10, Long l10) {
            this.f30364a = i10;
            this.f30365b = j10;
            this.f30366c = l10;
        }

        public static /* synthetic */ a a(a aVar, int i10, long j10, Long l10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f30364a;
            }
            if ((i11 & 2) != 0) {
                j10 = aVar.f30365b;
            }
            if ((i11 & 4) != 0) {
                l10 = aVar.f30366c;
            }
            return aVar.a(i10, j10, l10);
        }

        public final void a(int i10) {
            this.f30364a = i10;
        }

        public final void a(long j10) {
            this.f30365b = j10;
        }

        public final void a(Long l10) {
            this.f30366c = l10;
        }
    }

    public final Map<String, C3580lf> a() {
        return this.f30363c;
    }

    public C3636of(InterfaceC3710t4 interfaceC3710t4, T8 t10) {
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        ck.p.j(t10, "serviceDataRepository");
        this.f30361a = interfaceC3710t4;
        this.f30362b = t10;
        this.f30363c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.f30362b.a(str), this.f30361a.a(), this.f30362b.b(str));
    }

    @Override // com.ironsource.InterfaceC3713t7
    public M3 a(String str) {
        ck.p.j(str, "identifier");
        C3580lf c3580lf = this.f30363c.get(str);
        if (c3580lf == null) {
            return new M3(false, null, 2, null);
        }
        return a(c3580lf, str) ? new M3(true, O3.ShowCount) : new M3(false, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    @Override // com.ironsource.InterfaceC3713t7.a
    public void b(String str) {
        ck.p.j(str, "identifier");
        C3580lf c3580lf = this.f30363c.get(str);
        if (c3580lf == null) {
            return;
        }
        a aVarC = c(str);
        if (aVarC.d() != 0) {
            long jE = aVarC.e();
            Long lF = aVarC.f();
            if (jE >= (lF != null ? lF.longValue() : 0L)) {
                this.f30362b.a(aVarC.e() + N3.a(c3580lf.b(), null, 1, null), str);
                aVarC.a(0);
            }
        } else {
            this.f30362b.a(aVarC.e() + N3.a(c3580lf.b(), null, 1, null), str);
            aVarC.a(0);
        }
        aVarC.a(aVarC.d() + 1);
        this.f30362b.a(aVarC.d(), str);
    }

    private final boolean a(C3580lf c3580lf, String str) {
        a aVarC = c(str);
        Long lF = aVarC.f();
        if (lF != null) {
            return aVarC.d() >= c3580lf.a() && this.f30361a.a() < lF.longValue();
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3713t7.a
    public Object a(String str, O3 o10, InterfaceC3679r7 interfaceC3679r7) {
        ck.p.j(str, "identifier");
        ck.p.j(o10, "cappingType");
        ck.p.j(interfaceC3679r7, "cappingConfig");
        Object objC = interfaceC3679r7.c();
        if (Result.m3464isSuccessimpl(objC)) {
            C3580lf c3580lf = (C3580lf) objC;
            if (c3580lf != null) {
                this.f30363c.put(str, c3580lf);
            }
            return Result.m3458constructorimpl(mj.r.f64562a);
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objC);
        if (thM3461exceptionOrNullimpl != null) {
            return Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
        }
        return Result.m3458constructorimpl(mj.r.f64562a);
    }
}
