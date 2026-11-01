package io.bidmachine.rendering.internal.state;

import ck.p;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.util.Tag;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import mj.r;

/* JADX INFO: loaded from: classes9.dex */
public class d implements io.bidmachine.rendering.internal.state.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tag f60559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f60560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f60561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f60562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f60563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f60564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f60565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f60566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f60567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f60568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f60569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f60570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f60571m;

    public static final class a implements io.bidmachine.rendering.internal.state.a.b {
        public a() {
        }

        @Override // io.bidmachine.rendering.internal.state.a.b
        public void a(io.bidmachine.rendering.internal.state.a aVar, io.bidmachine.rendering.internal.state.a.EnumC0537a enumC0537a) {
            p.j(aVar, "source");
            p.j(enumC0537a, "event");
            o.b(d.this.f60559a, "Event: " + enumC0537a, new Object[0]);
        }
    }

    public d(String str) {
        p.j(str, "parent");
        this.f60559a = new Tag("DefaultAdState(" + str + ')');
        this.f60560b = new AtomicBoolean(false);
        this.f60561c = new AtomicBoolean(false);
        this.f60562d = new AtomicBoolean(false);
        this.f60563e = new AtomicBoolean(false);
        this.f60564f = new AtomicBoolean(false);
        this.f60565g = new AtomicBoolean(false);
        this.f60566h = new AtomicBoolean(false);
        this.f60567i = new AtomicBoolean(false);
        this.f60568j = new AtomicBoolean(false);
        this.f60569k = new AtomicBoolean(false);
        this.f60570l = new AtomicBoolean(false);
        this.f60571m = new LinkedHashSet();
        a(new a());
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean b() {
        return this.f60560b.get() && !h();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean c() {
        boolean zCompareAndSet = this.f60561c.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(io.bidmachine.rendering.internal.state.a.EnumC0537a.LoadingStarted);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean d() {
        return this.f60562d.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean e() {
        boolean zCompareAndSet = this.f60567i.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(io.bidmachine.rendering.internal.state.a.EnumC0537a.Clicked);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean f() {
        boolean zCompareAndSet = this.f60566h.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(io.bidmachine.rendering.internal.state.a.EnumC0537a.FailedToShow);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean g() {
        return this.f60568j.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean h() {
        return this.f60563e.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean i() {
        boolean zCompareAndSet = this.f60565g.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(io.bidmachine.rendering.internal.state.a.EnumC0537a.Shown);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean j() {
        boolean zCompareAndSet = this.f60568j.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(io.bidmachine.rendering.internal.state.a.EnumC0537a.Finished);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean k() {
        boolean zCompareAndSet = this.f60570l.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(io.bidmachine.rendering.internal.state.a.EnumC0537a.Expired);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public void l() {
        this.f60562d.set(true);
        a(io.bidmachine.rendering.internal.state.a.EnumC0537a.ShowInitiated);
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean m() {
        return this.f60565g.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public final void a(io.bidmachine.rendering.internal.state.a.b bVar) {
        p.j(bVar, "observer");
        if (h()) {
            return;
        }
        synchronized (this.f60571m) {
            this.f60571m.add(bVar);
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean b(boolean z10) {
        boolean zCompareAndSet = this.f60569k.compareAndSet(!z10, z10);
        if (zCompareAndSet) {
            a(z10 ? io.bidmachine.rendering.internal.state.a.EnumC0537a.Appeared : io.bidmachine.rendering.internal.state.a.EnumC0537a.Disappeared);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public void a() {
        this.f60563e.set(true);
        this.f60560b.set(false);
        this.f60561c.set(false);
        this.f60562d.set(false);
        this.f60564f.set(false);
        this.f60565g.set(false);
        this.f60566h.set(false);
        this.f60567i.set(false);
        this.f60568j.set(false);
        this.f60569k.set(false);
        this.f60570l.set(false);
        a(io.bidmachine.rendering.internal.state.a.EnumC0537a.Destroyed);
        synchronized (this.f60571m) {
            this.f60571m.clear();
            r rVar = r.f64562a;
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public final void b(io.bidmachine.rendering.internal.state.a.b bVar) {
        p.j(bVar, "observer");
        synchronized (this.f60571m) {
            this.f60571m.remove(bVar);
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean a(boolean z10) {
        boolean z11 = false;
        this.f60561c.set(false);
        this.f60560b.set(z10);
        if (this.f60564f.compareAndSet(false, true) && !h()) {
            z11 = true;
        }
        if (z11) {
            a(z10 ? io.bidmachine.rendering.internal.state.a.EnumC0537a.Loaded : io.bidmachine.rendering.internal.state.a.EnumC0537a.FailedToLoad);
        }
        return z11;
    }

    private final void a(io.bidmachine.rendering.internal.state.a.EnumC0537a enumC0537a) {
        synchronized (this.f60571m) {
            Iterator it = this.f60571m.iterator();
            while (it.hasNext()) {
                ((io.bidmachine.rendering.internal.state.a.b) it.next()).a(this, enumC0537a);
            }
            r rVar = r.f64562a;
        }
    }
}
