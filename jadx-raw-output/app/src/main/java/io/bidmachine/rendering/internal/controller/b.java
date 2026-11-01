package io.bidmachine.rendering.internal.controller;

import android.content.Context;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.CacheType;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.Tag;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Executable;
import io.bidmachine.util.Utils;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class b implements io.bidmachine.rendering.internal.controller.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tag f60178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f60179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdParams f60180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.controller.c f60181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.animation.b f60182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.state.a f60183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Queue f60184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f60185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f60186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f60187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public io.bidmachine.rendering.internal.view.f f60188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile e f60189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile e f60190m;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60191a;

        static {
            int[] iArr = new int[CacheType.values().length];
            f60191a = iArr;
            try {
                iArr[CacheType.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60191a[CacheType.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60191a[CacheType.StreamLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.b$b, reason: collision with other inner class name */
    public class C0523b implements f {
        public C0523b() {
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(e eVar, Error error) {
            o.a(b.this.f60178a, "onAdPhaseFailToLoad (%s) - %s", eVar, error);
            b.this.d(eVar);
            if (!b.this.l()) {
                b.this.a(error);
                return;
            }
            if (!b.this.f60183f.d()) {
                b.this.o();
                return;
            }
            b.this.b(eVar, new Error("Fail to load after show (CacheType - " + b.this.h() + ") - " + error));
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(e eVar) {
            o.b(b.this.f60178a, "onAdPhaseLoaded (%s)", eVar);
            if (b.this.k()) {
                b.this.u();
                b.this.p();
            }
        }
    }

    public class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.rendering.internal.controller.c f60193a;

        public c(io.bidmachine.rendering.internal.controller.c cVar) {
            this.f60193a = cVar;
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(PrivacySheetParams privacySheetParams) {
            this.f60193a.a(privacySheetParams);
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void b() {
            b.this.g();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void c() {
            this.f60193a.c();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void d() {
            this.f60193a.onAdClicked();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void e() {
            if (!b.this.j()) {
                b();
            } else {
                b.this.u();
                b.this.v();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a() {
            this.f60193a.a();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            b.this.a(brokenCreativeEvent);
        }
    }

    public class d implements io.bidmachine.rendering.internal.view.f.d {
        private d() {
        }

        @Override // io.bidmachine.rendering.internal.view.f.d
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            b.this.a(brokenCreativeEvent);
        }

        @Override // io.bidmachine.rendering.internal.view.f.d
        public void onLoaded() {
            b.this.s();
        }

        public /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        @Override // io.bidmachine.rendering.internal.view.f.d
        public void a() {
            b.this.q();
        }
    }

    public b(Context context, AdParams adParams, io.bidmachine.rendering.internal.controller.c cVar, io.bidmachine.rendering.internal.animation.b bVar) {
        Tag tag = new Tag("AdController");
        this.f60178a = tag;
        this.f60183f = new io.bidmachine.rendering.internal.state.d(tag.toString());
        this.f60179b = context.getApplicationContext();
        this.f60180c = adParams;
        this.f60181d = cVar;
        this.f60182e = bVar;
        this.f60184g = new ConcurrentLinkedQueue();
        this.f60185h = new AtomicBoolean(false);
        this.f60186i = new AtomicBoolean(false);
        this.f60187j = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        final io.bidmachine.rendering.internal.controller.c cVar = this.f60181d;
        Objects.requireNonNull(cVar);
        n nVar = new n() { // from class: zh.b
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                cVar.b();
            }
        };
        e eVar = this.f60189l;
        if (eVar == null) {
            nVar.run();
        } else {
            eVar.a(true);
            this.f60182e.a(eVar.e(), AnimationEventType.Disappear, (Runnable) null, nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        Utils.ifNotNull(this.f60189l, new Executable() { // from class: zh.d
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f86423a.g((io.bidmachine.rendering.internal.controller.e) obj);
            }
        });
    }

    public void e() {
        this.f60184g.clear();
    }

    public CacheType h() {
        return this.f60180c.getCacheType();
    }

    public e i() {
        return (e) this.f60184g.peek();
    }

    public boolean j() {
        return i() != null;
    }

    public boolean k() {
        Iterator it = this.f60184g.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public boolean l() {
        return this.f60183f.b();
    }

    public void m() {
        if (this.f60185h.compareAndSet(false, true)) {
            for (e eVar : this.f60184g) {
                o.b(this.f60178a, "loadAdPhase (%s)", eVar);
                eVar.c();
            }
        }
    }

    public void n() {
        final AdPhaseParams placeholderParams = this.f60180c.getPlaceholderParams();
        UiUtils.onUiThread(new n() { // from class: zh.h
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.f86426b.a(placeholderParams);
            }
        });
    }

    public void o() {
        if (this.f60183f.k()) {
            this.f60181d.a(this);
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void onShown() {
        o.b(this.f60178a, "onShown", new Object[0]);
        Utils.ifNotNull(this.f60189l, new Executable() { // from class: zh.k
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f86430a.e((io.bidmachine.rendering.internal.controller.e) obj);
            }
        });
    }

    public boolean p() {
        if (!this.f60183f.a(true)) {
            return false;
        }
        this.f60181d.b(this);
        return true;
    }

    public void q() {
        this.f60181d.e();
    }

    public void r() {
        io.bidmachine.rendering.internal.view.f fVar = this.f60188k;
        if (fVar != null && this.f60187j.compareAndSet(true, false)) {
            fVar.i();
            this.f60181d.b(fVar);
        }
    }

    public void s() {
        p();
    }

    public void t() {
        io.bidmachine.rendering.internal.view.f fVar = this.f60188k;
        if (fVar != null && this.f60187j.compareAndSet(false, true)) {
            this.f60181d.a(fVar);
            fVar.j();
        }
    }

    public String toString() {
        return this.f60178a.toString();
    }

    public void u() {
        if (this.f60186i.compareAndSet(false, true)) {
            this.f60181d.d();
            this.f60190m = this.f60189l;
            e eVarI = i();
            if (eVarI == null) {
                b(this.f60190m, this.f60190m == null ? new Error("No ad phase to show") : null);
            } else {
                if (this.f60190m != eVarI) {
                    i(eVarI);
                    eVarI.a(new c(this.f60181d));
                    this.f60189l = eVarI;
                    io.bidmachine.rendering.internal.d dVarE = eVarI.e();
                    this.f60182e.b(dVarE);
                    this.f60182e.a(dVarE, AnimationEventType.Appear);
                }
                this.f60181d.a(eVarI);
                r();
            }
            this.f60186i.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final e eVar) {
        n nVar = new n() { // from class: zh.j
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.f86428b.d(eVar);
            }
        };
        eVar.a(true);
        this.f60182e.a(eVar.e(), AnimationEventType.Disappear, (Runnable) null, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(e eVar) {
        if (this.f60183f.i()) {
            v();
            this.f60181d.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(e eVar) {
        a(eVar, this.f60190m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(e eVar) {
        eVar.d();
        eVar.onShown();
    }

    public boolean a(e eVar) {
        return this.f60184g.add(eVar);
    }

    public void b(e eVar) {
        o.b(this.f60178a, "destroyAdPhaseController (%s)", eVar);
        Utils.ifNotNull(eVar, new Executable() { // from class: zh.e
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((io.bidmachine.rendering.internal.controller.e) obj).a();
            }
        });
        if (this.f60189l == eVar) {
            this.f60189l = null;
        }
        if (this.f60190m == eVar) {
            this.f60190m = null;
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void f() {
        o.b(this.f60178a, "performHide", new Object[0]);
        Utils.ifNotNull(this.f60189l, new Executable() { // from class: zh.i
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((io.bidmachine.rendering.internal.controller.e) obj).a(false);
            }
        });
        r();
    }

    public boolean i(e eVar) {
        return this.f60184g.remove(eVar);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void d(e eVar) {
        o.b(this.f60178a, "removeAndDestroyAdPhaseController (%s)", eVar);
        Utils.ifNotNull(eVar, new Executable() { // from class: zh.a
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f86421a.i((io.bidmachine.rendering.internal.controller.e) obj);
            }
        });
        b(eVar);
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void a() {
        o.b(this.f60178a, "destroy", new Object[0]);
        this.f60182e.a();
        b(this.f60189l);
        Iterator it = this.f60184g.iterator();
        while (it.hasNext()) {
            b((e) it.next());
        }
        e();
        Utils.ifNotNull(this.f60188k, new Executable() { // from class: zh.c
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((io.bidmachine.rendering.internal.view.f) obj).b();
            }
        });
        this.f60188k = null;
        this.f60183f.a();
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public Orientation b() {
        return this.f60180c.getOrientation();
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void c() {
        o.b(this.f60178a, "load (cacheType - %s)", h());
        io.bidmachine.rendering.internal.f.b(this.f60179b);
        Queue<AdPhaseParams> adPhaseParamsQueue = this.f60180c.getAdPhaseParamsQueue();
        if (adPhaseParamsQueue.isEmpty()) {
            this.f60181d.a(this, new Error("Ad phase queue is empty"));
            return;
        }
        if (l()) {
            this.f60181d.b(this);
            return;
        }
        if (this.f60183f.c()) {
            for (AdPhaseParams adPhaseParams : adPhaseParamsQueue) {
                Tag tag = new Tag("AdPhaseController");
                a(new h(this.f60179b, adPhaseParams, tag, new io.bidmachine.rendering.internal.state.c(tag.toString(), io.bidmachine.rendering.internal.h.f()), new C0523b(), this.f60182e));
            }
            int i10 = a.f60191a[h().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    n();
                    return;
                }
                n();
            }
            m();
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public boolean d() {
        o.b(this.f60178a, "performShow", new Object[0]);
        this.f60183f.l();
        e eVar = this.f60189l;
        if (eVar == null) {
            t();
            m();
            return false;
        }
        if (!this.f60183f.m()) {
            return true;
        }
        eVar.d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdPhaseParams adPhaseParams) {
        if (this.f60188k != null) {
            return;
        }
        io.bidmachine.rendering.internal.view.f fVar = new io.bidmachine.rendering.internal.view.f(this.f60179b, adPhaseParams, this.f60182e);
        this.f60188k = fVar;
        fVar.setListener(new d(this, null));
        this.f60188k.e();
    }

    public void b(final e eVar, Error error) {
        Utils.ifNotNull(error, new Executable() { // from class: zh.l
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f86431a.a(eVar, (Error) obj);
            }
        });
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e eVar, Error error) {
        this.f60181d.a(eVar, error);
    }

    public boolean a(Error error) {
        if (!this.f60183f.a(false)) {
            return false;
        }
        this.f60181d.a(this, error);
        return true;
    }

    public void a(BrokenCreativeEvent brokenCreativeEvent) {
        if (this.f60183f.h()) {
            return;
        }
        this.f60181d.a(brokenCreativeEvent);
    }

    private void a(final e eVar, e eVar2) {
        Utils.ifNotNull(eVar2, new Executable() { // from class: zh.f
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f86424a.c((io.bidmachine.rendering.internal.controller.e) obj);
            }
        });
        this.f60182e.a(eVar.e(), AnimationEventType.Appear, (Runnable) null, new n() { // from class: zh.g
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.controller.b.h(eVar);
            }
        });
    }
}
