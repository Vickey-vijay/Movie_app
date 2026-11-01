package yads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class je0 implements zg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f79006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g62 f79007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z30 f79008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f79009d;

    @Override // yads.zg3
    public final void c() {
    }

    @Override // yads.zg3
    public final void a() {
        if (this.f79009d.decrementAndGet() == 0) {
            this.f79006a.a(v5.f83756p);
            this.f79007b.a();
        }
    }

    @Override // yads.zg3
    public final void b() {
        if (this.f79009d.getAndSet(0) > 0) {
            this.f79006a.a(v5.f83756p);
            this.f79008c.a(y30.f84802f);
            this.f79007b.a();
        }
    }

    public je0(w5 w5Var, int i10, g62 g62Var, z30 z30Var) {
        this.f79006a = w5Var;
        this.f79007b = g62Var;
        this.f79008c = z30Var;
        this.f79009d = new AtomicInteger(i10);
    }
}
