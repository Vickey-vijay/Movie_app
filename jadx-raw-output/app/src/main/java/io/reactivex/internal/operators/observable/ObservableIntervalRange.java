package io.reactivex.internal.operators.observable;

import aj.g;
import ii.k;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableIntervalRange extends k<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f61201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f61203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f61204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f61205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeUnit f61206g;

    public static final class IntervalRangeObserver extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        public long count;
        public final r<? super Long> downstream;
        public final long end;

        public IntervalRangeObserver(r<? super Long> rVar, long j10, long j11) {
            this.downstream = rVar;
            this.count = j10;
            this.end = j11;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!isDisposed()) {
                long j10 = this.count;
                this.downstream.onNext(Long.valueOf(j10));
                if (j10 == this.end) {
                    DisposableHelper.dispose(this);
                    this.downstream.onComplete();
                } else {
                    this.count = j10 + 1;
                }
            }
        }

        public void setResource(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ii.k
    public void subscribeActual(r<? super Long> rVar) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(rVar, this.f61202c, this.f61203d);
        rVar.onSubscribe(intervalRangeObserver);
        s sVar = this.f61201b;
        if (!(sVar instanceof g)) {
            intervalRangeObserver.setResource(sVar.e(intervalRangeObserver, this.f61204e, this.f61205f, this.f61206g));
            return;
        }
        s.c cVarA = sVar.a();
        intervalRangeObserver.setResource(cVarA);
        cVarA.d(intervalRangeObserver, this.f61204e, this.f61205f, this.f61206g);
    }

    public ObservableIntervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, s sVar) {
        this.f61204e = j12;
        this.f61205f = j13;
        this.f61206g = timeUnit;
        this.f61201b = sVar;
        this.f61202c = j10;
        this.f61203d = j11;
    }
}
