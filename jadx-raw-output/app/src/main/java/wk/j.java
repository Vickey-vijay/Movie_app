package wk;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sk.a0;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends a0<j> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f74152f;

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f74152f;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f71936d + ", hashCode=" + hashCode() + ']';
    }

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.f74152f = new AtomicReferenceArray(i.f74151f);
    }

    @Override // sk.a0
    public int r() {
        return i.f74151f;
    }

    @Override // sk.a0
    public void s(int i10, Throwable th2, kotlin.coroutines.d dVar) {
        v().set(i10, i.f74150e);
        t();
    }
}
