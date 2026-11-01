package com.ironsource;

import android.graphics.Rect;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class La implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ha f26960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f26961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f26962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3755vf.a f26963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f26964e;

    public static final class a extends Lambda implements bk.a<mj.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC3515i3.c f26966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f26967c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3515i3.c cVar, long j10) {
            super(0);
            this.f26966b = cVar;
            this.f26967c = j10;
        }

        public final void a() {
            La.this.f26960a.a(La.this.f26961b, this.f26966b, Long.valueOf(this.f26967c));
        }

        @Override // bk.a
        public /* bridge */ /* synthetic */ mj.r invoke() {
            a();
            return mj.r.f64562a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final La la2) {
        ck.p.j(la2, "this$0");
        C3768wb.a(la2.f26960a.a(), new Runnable() { // from class: com.ironsource.li
            @Override // java.lang.Runnable
            public final void run() {
                La.d(this.f29415b);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(La la2) {
        ck.p.j(la2, "this$0");
        if (!rg.a(la2.f26960a.k(), new Rect())) {
            la2.e();
            return;
        }
        long jA = la2.f26960a.p().a();
        long j10 = jA - la2.f26964e;
        Long l10 = la2.f26962c;
        C3768wb.a((C3768wb) la2.f26960a.a(), AbstractRunnableC3526ie.f29164a.a(la2.new a(new AbstractC3515i3.c(l10 != null ? jA - l10.longValue() : 0L, new AbstractC3515i3.d.f(j10)), jA)), 0L, 2, (Object) null);
    }

    private final void e() {
        long jQ = this.f26960a.q();
        InterfaceC3755vf interfaceC3755vfO = this.f26960a.o();
        Runnable runnable = new Runnable() { // from class: com.ironsource.mi
            @Override // java.lang.Runnable
            public final void run() {
                La.c(this.f30191b);
            }
        };
        mk.b.a aVar = mk.b.f64563c;
        this.f26963d = interfaceC3755vfO.a(runnable, mk.d.t(jQ, DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.Ra
    public void f() {
    }

    public La(Ha ha2, L2 l10, Long l11) {
        ck.p.j(ha2, C3426d4.f.f28486e);
        ck.p.j(l10, "currentAdUnit");
        this.f26960a = ha2;
        this.f26961b = l10;
        this.f26962c = l11;
        this.f26964e = ha2.p().a();
        ha2.r();
        e();
    }

    @Override // com.ironsource.M0
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f26960a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f26960a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ra
    public void c() {
        InterfaceC3755vf.a aVar = this.f26963d;
        if (aVar != null) {
            aVar.a();
        }
        this.f26961b.a(true);
        Ha ha2 = this.f26960a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f26960a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ra
    public void d() {
        InterfaceC3755vf.a aVar = this.f26963d;
        if (aVar != null) {
            aVar.a();
        }
        Ha ha2 = this.f26960a;
        ha2.a((Ra) new Na(ha2, this.f26961b));
    }
}
