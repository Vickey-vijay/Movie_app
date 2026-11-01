package rj;

import ck.i;
import ck.p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: SafeContinuationJvm.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f<T> implements c<T>, tj.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f66780c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<f<?>, Object> f66781d = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "result");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f66782b;
    private volatile Object result;

    /* JADX INFO: compiled from: SafeContinuationJvm.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(c<? super T> cVar, Object obj) {
        p.j(cVar, "delegate");
        this.f66782b = cVar;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (androidx.concurrent.futures.a.a(f66781d, this, coroutineSingletons, sj.a.f())) {
                return sj.a.f();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return sj.a.f();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // tj.c
    public tj.c getCallerFrame() {
        c<T> cVar = this.f66782b;
        if (cVar instanceof tj.c) {
            return (tj.c) cVar;
        }
        return null;
    }

    @Override // rj.c
    public kotlin.coroutines.d getContext() {
        return this.f66782b.getContext();
    }

    @Override // rj.c
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (androidx.concurrent.futures.a.a(f66781d, this, coroutineSingletons, obj)) {
                    return;
                }
            } else {
                if (obj2 != sj.a.f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.a.a(f66781d, this, sj.a.f(), CoroutineSingletons.RESUMED)) {
                    this.f66782b.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f66782b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(c<? super T> cVar) {
        this(cVar, CoroutineSingletons.UNDECIDED);
        p.j(cVar, "delegate");
    }
}
