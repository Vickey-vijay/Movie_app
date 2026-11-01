package po;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: AbstractStreamClientConfiguration.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f66244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66245b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66246c = 5;

    @Override // po.k
    public int a() {
        return this.f66245b;
    }

    @Override // po.k
    public int b() {
        return this.f66246c;
    }

    @Override // po.k
    public ExecutorService c() {
        return this.f66244a;
    }

    public String d(int i10, int i11) {
        return new mn.i(i10, i11).toString();
    }

    public b(ExecutorService executorService) {
        this.f66244a = executorService;
    }
}
