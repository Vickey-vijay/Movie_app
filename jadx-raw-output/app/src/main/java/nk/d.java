package nk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f64767b = AtomicIntegerFieldUpdater.newUpdater(d.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0<T>[] f64768a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: compiled from: Await.kt */
    public final class a extends u1 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f64769i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l<List<? extends T>> f64770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public y0 f64771g;

        @Override // nk.u1
        public boolean u() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super List<? extends T>> lVar) {
            this.f64770f = lVar;
        }

        public final void B(y0 y0Var) {
            this.f64771g = y0Var;
        }

        @Override // nk.u1
        public void v(Throwable th2) {
            if (th2 != null) {
                Object objD = this.f64770f.D(th2);
                if (objD != null) {
                    this.f64770f.x(objD);
                    d<T>.b bVarX = x();
                    if (bVarX != null) {
                        bVarX.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (d.d().decrementAndGet(d.this) == 0) {
                l<List<? extends T>> lVar = this.f64770f;
                p0[] p0VarArr = d.this.f64768a;
                ArrayList arrayList = new ArrayList(p0VarArr.length);
                for (p0 p0Var : p0VarArr) {
                    arrayList.add(p0Var.l());
                }
                lVar.resumeWith(Result.m3458constructorimpl(arrayList));
            }
        }

        public final y0 y() {
            y0 y0Var = this.f64771g;
            if (y0Var != null) {
                return y0Var;
            }
            ck.p.B("handle");
            return null;
        }

        public final void A(d<T>.b bVar) {
            f64769i.set(this, bVar);
        }

        public final d<T>.b x() {
            return (b) f64769i.get(this);
        }
    }

    /* JADX INFO: compiled from: Await.kt */
    public final class b implements kotlinx.coroutines.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d<T>.a[] f64773b;

        public b(d<T>.a[] aVarArr) {
            this.f64773b = aVarArr;
        }

        public final void b() {
            for (d<T>.a aVar : this.f64773b) {
                aVar.y().dispose();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f64773b + ']';
        }

        @Override // kotlinx.coroutines.b
        public void a(Throwable th2) {
            b();
        }
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f64767b;
    }

    public final Object c(rj.c<? super List<? extends T>> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        int length = this.f64768a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            p0 p0Var = this.f64768a[i10];
            p0Var.start();
            a aVar = new a(cVar2);
            aVar.B(JobKt__JobKt.l(p0Var, false, aVar, 1, null));
            mj.r rVar = mj.r.f64562a;
            aVarArr[i10] = aVar;
        }
        d<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].A(bVar);
        }
        if (cVar2.d()) {
            bVar.b();
        } else {
            o.c(cVar2, bVar);
        }
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(p0<? extends T>[] p0VarArr) {
        this.f64768a = p0VarArr;
        this.notCompletedCount$volatile = p0VarArr.length;
    }
}
