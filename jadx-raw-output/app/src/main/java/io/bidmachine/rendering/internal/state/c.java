package io.bidmachine.rendering.internal.state;

import ck.p;
import io.bidmachine.rendering.internal.h;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import mj.g;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h f60556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g f60557o;

    public static final class a extends Lambda implements bk.a {
        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            c cVar = c.this;
            return new b(cVar, cVar.n());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, h hVar) {
        super(str);
        p.j(str, "parent");
        p.j(hVar, "coroutineDispatchers");
        this.f60556n = hVar;
        this.f60557o = kotlin.b.b(LazyThreadSafetyMode.PUBLICATION, new a());
    }

    public final h n() {
        return this.f60556n;
    }

    public final b o() {
        return (b) this.f60557o.getValue();
    }
}
