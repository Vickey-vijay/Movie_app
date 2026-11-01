package aj;

import ii.s;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: NewThreadScheduler.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RxThreadFactory f3654c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f3655b;

    public d() {
        this(f3654c);
    }

    public d(ThreadFactory threadFactory) {
        this.f3655b = threadFactory;
    }

    @Override // ii.s
    public s.c a() {
        return new io.reactivex.internal.schedulers.a(this.f3655b);
    }
}
