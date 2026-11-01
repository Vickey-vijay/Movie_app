package nk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f64843b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f64844a;

    public z(Throwable th2, boolean z10) {
        this.f64844a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public String toString() {
        return m0.a(this) + '[' + this.f64844a + ']';
    }

    public final boolean a() {
        if (f64843b.get(this) == 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return f64843b.compareAndSet(this, 0, 1);
    }

    public /* synthetic */ z(Throwable th2, boolean z10, int i10, ck.i iVar) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
