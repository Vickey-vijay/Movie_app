package ti;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: CompletableAmb.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends ii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.c[] f72412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable<? extends ii.c> f72413b;

    /* JADX INFO: renamed from: ti.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CompletableAmb.java */
    public static final class C0752a implements ii.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f72414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mi.a f72415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ii.b f72416d;

        @Override // ii.b
        public void onComplete() {
            if (this.f72414b.compareAndSet(false, true)) {
                this.f72415c.dispose();
                this.f72416d.onComplete();
            }
        }

        @Override // ii.b
        public void onError(Throwable th2) {
            if (!this.f72414b.compareAndSet(false, true)) {
                ej.a.s(th2);
            } else {
                this.f72415c.dispose();
                this.f72416d.onError(th2);
            }
        }

        @Override // ii.b
        public void onSubscribe(mi.b bVar) {
            this.f72415c.b(bVar);
        }

        public C0752a(AtomicBoolean atomicBoolean, mi.a aVar, ii.b bVar) {
            this.f72414b = atomicBoolean;
            this.f72415c = aVar;
            this.f72416d = bVar;
        }
    }

    @Override // ii.a
    public void f(ii.b bVar) {
        int length;
        ii.c[] cVarArr = this.f72412a;
        if (cVarArr == null) {
            cVarArr = new ii.c[8];
            try {
                length = 0;
                for (ii.c cVar : this.f72413b) {
                    if (cVar == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), bVar);
                        return;
                    }
                    if (length == cVarArr.length) {
                        ii.c[] cVarArr2 = new ii.c[(length >> 2) + length];
                        System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                        cVarArr = cVarArr2;
                    }
                    int i10 = length + 1;
                    cVarArr[length] = cVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                EmptyDisposable.error(th2, bVar);
                return;
            }
        } else {
            length = cVarArr.length;
        }
        mi.a aVar = new mi.a();
        bVar.onSubscribe(aVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C0752a c0752a = new C0752a(atomicBoolean, aVar, bVar);
        for (int i11 = 0; i11 < length; i11++) {
            ii.c cVar2 = cVarArr[i11];
            if (aVar.isDisposed()) {
                return;
            }
            if (cVar2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    ej.a.s(nullPointerException);
                    return;
                } else {
                    aVar.dispose();
                    bVar.onError(nullPointerException);
                    return;
                }
            }
            cVar2.b(c0752a);
        }
        if (length == 0) {
            bVar.onComplete();
        }
    }

    public a(ii.c[] cVarArr, Iterable<? extends ii.c> iterable) {
        this.f72412a = cVarArr;
        this.f72413b = iterable;
    }
}
