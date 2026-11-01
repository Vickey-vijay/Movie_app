package com.ironsource;

import kotlin.Result;

/* JADX INFO: loaded from: classes7.dex */
public final class F3 implements InterfaceC3679r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f26499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f26500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N3 f26501c;

    public F3(Boolean bool, Integer num, N3 n10) {
        this.f26499a = bool;
        this.f26500b = num;
        this.f26501c = n10;
    }

    private final Object a(N3 n10) {
        return new G3(this.f26499a, this.f26500b, n10).a();
    }

    @Override // com.ironsource.InterfaceC3679r7
    public Object a() {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(new Q4(this.f26499a).a());
        if (thM3461exceptionOrNullimpl != null) {
            return Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
        }
        Boolean bool = this.f26499a;
        return Result.m3458constructorimpl(bool != null ? new P4(bool.booleanValue()) : null);
    }

    @Override // com.ironsource.InterfaceC3679r7
    public Object b() {
        Integer num;
        N3 n10 = N3.Second;
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(a(n10));
        if (thM3461exceptionOrNullimpl != null) {
            return Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
        }
        return Result.m3458constructorimpl((!ck.p.e(this.f26499a, Boolean.TRUE) || (num = this.f26500b) == null) ? null : new Wc(n10.a(num), null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.ironsource.InterfaceC3679r7
    public Object c() {
        C3580lf c3580lf;
        Integer num;
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(a(this.f26501c));
        if (thM3461exceptionOrNullimpl != null) {
            return Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
        }
        if (!ck.p.e(this.f26499a, Boolean.TRUE) || (num = this.f26500b) == null) {
            c3580lf = null;
        } else {
            int iIntValue = num.intValue();
            N3 n10 = this.f26501c;
            if (n10 != null) {
                c3580lf = new C3580lf(iIntValue, n10);
            } else {
                c3580lf = null;
            }
        }
        return Result.m3458constructorimpl(c3580lf);
    }

    public final Boolean d() {
        return this.f26499a;
    }

    public final Integer e() {
        return this.f26500b;
    }

    public final N3 f() {
        return this.f26501c;
    }

    public /* synthetic */ F3(Boolean bool, Integer num, N3 n10, int i10, ck.i iVar) {
        this(bool, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : n10);
    }
}
