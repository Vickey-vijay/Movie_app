package io.reactivex.internal.operators.observable;

import aj.g;
import ii.k;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableInterval extends k<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f61197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f61199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f61200e;

    public static final class IntervalObserver extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        public long count;
        public final r<? super Long> downstream;

        public IntervalObserver(r<? super Long> rVar) {
            this.downstream = rVar;
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
            if (get() != DisposableHelper.DISPOSED) {
                r<? super Long> rVar = this.downstream;
                long j10 = this.count;
                this.count = 1 + j10;
                rVar.onNext(Long.valueOf(j10));
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
        IntervalObserver intervalObserver = new IntervalObserver(rVar);
        rVar.onSubscribe(intervalObserver);
        s sVar = this.f61197b;
        if (!(sVar instanceof g)) {
            intervalObserver.setResource(sVar.e(intervalObserver, this.f61198c, this.f61199d, this.f61200e));
            return;
        }
        s.c cVarA = sVar.a();
        intervalObserver.setResource(cVarA);
        cVarA.d(intervalObserver, this.f61198c, this.f61199d, this.f61200e);
    }

    public ObservableInterval(long j10, long j11, TimeUnit timeUnit, s sVar) {
        this.f61198c = j10;
        this.f61199d = j11;
        this.f61200e = timeUnit;
        this.f61197b = sVar;
    }
}
