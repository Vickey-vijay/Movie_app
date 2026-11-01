package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableWindowTimed.java */
/* JADX INFO: loaded from: classes6.dex */
public final class w1<T> extends xi.a<T, ii.k<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f74892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f74893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii.s f74894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f74895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f74896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f74897i;

    /* JADX INFO: compiled from: ObservableWindowTimed.java */
    public static final class a<T> extends si.j<T, Object, ii.k<T>> implements mi.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f74898h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TimeUnit f74899i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ii.s f74900j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f74901k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f74902l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f74903m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ii.s.c f74904n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f74905o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f74906p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public mi.b f74907q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public UnicastSubject<T> f74908r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public volatile boolean f74909s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final AtomicReference<mi.b> f74910t;

        /* JADX INFO: renamed from: xi.w1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableWindowTimed.java */
        public static final class RunnableC0794a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f74911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a<?> f74912c;

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.f74912c;
                if (aVar.f71928e) {
                    aVar.f74909s = true;
                    aVar.m();
                } else {
                    aVar.f71927d.offer(this);
                }
                if (aVar.g()) {
                    aVar.n();
                }
            }

            public RunnableC0794a(long j10, a<?> aVar) {
                this.f74911b = j10;
                this.f74912c = aVar;
            }
        }

        @Override // mi.b
        public void dispose() {
            this.f71928e = true;
        }

        @Override // ii.r
        public void onComplete() {
            this.f71929f = true;
            if (g()) {
                n();
            }
            this.f71926c.onComplete();
            m();
        }

        public a(ii.r<? super ii.k<T>> rVar, long j10, TimeUnit timeUnit, ii.s sVar, int i10, long j11, boolean z10) {
            super(rVar, new MpscLinkedQueue());
            this.f74910t = new AtomicReference<>();
            this.f74898h = j10;
            this.f74899i = timeUnit;
            this.f74900j = sVar;
            this.f74901k = i10;
            this.f74903m = j11;
            this.f74902l = z10;
            if (z10) {
                this.f74904n = sVar.a();
            } else {
                this.f74904n = null;
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f71928e;
        }

        public void m() {
            DisposableHelper.dispose(this.f74910t);
            ii.s.c cVar = this.f74904n;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
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
        public void n() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f71927d;
            ii.r<? super V> rVar = this.f71926c;
            UnicastSubject<T> unicastSubject = this.f74908r;
            int iD = 1;
            while (!this.f74909s) {
                boolean z10 = this.f71929f;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC0794a;
                if (z10 && (z11 || z12)) {
                    this.f74908r = null;
                    mpscLinkedQueue.clear();
                    m();
                    Throwable th2 = this.f71930g;
                    if (th2 != null) {
                        unicastSubject.onError(th2);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                }
                if (z11) {
                    iD = d(-iD);
                    if (iD == 0) {
                        return;
                    }
                } else if (z12) {
                    RunnableC0794a runnableC0794a = (RunnableC0794a) objPoll;
                    if (this.f74902l || this.f74906p == runnableC0794a.f74911b) {
                        unicastSubject.onComplete();
                        this.f74905o = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.d(this.f74901k);
                        this.f74908r = unicastSubject;
                        rVar.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                    long j10 = this.f74905o + 1;
                    if (j10 >= this.f74903m) {
                        this.f74906p++;
                        this.f74905o = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.d(this.f74901k);
                        this.f74908r = unicastSubject;
                        this.f71926c.onNext(unicastSubject);
                        if (this.f74902l) {
                            mi.b bVar = this.f74910t.get();
                            bVar.dispose();
                            ii.s.c cVar = this.f74904n;
                            RunnableC0794a runnableC0794a2 = new RunnableC0794a(this.f74906p, this);
                            long j11 = this.f74898h;
                            mi.b bVarD = cVar.d(runnableC0794a2, j11, j11, this.f74899i);
                            if (!androidx.lifecycle.e.a(this.f74910t, bVar, bVarD)) {
                                bVarD.dispose();
                            }
                        }
                    } else {
                        this.f74905o = j10;
                    }
                }
            }
            this.f74907q.dispose();
            mpscLinkedQueue.clear();
            m();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f71930g = th2;
            this.f71929f = true;
            if (g()) {
                n();
            }
            this.f71926c.onError(th2);
            m();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74909s) {
                return;
            }
            if (h()) {
                UnicastSubject<T> unicastSubject = this.f74908r;
                unicastSubject.onNext(t10);
                long j10 = this.f74905o + 1;
                if (j10 >= this.f74903m) {
                    this.f74906p++;
                    this.f74905o = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74901k);
                    this.f74908r = unicastSubjectD;
                    this.f71926c.onNext(unicastSubjectD);
                    if (this.f74902l) {
                        this.f74910t.get().dispose();
                        ii.s.c cVar = this.f74904n;
                        RunnableC0794a runnableC0794a = new RunnableC0794a(this.f74906p, this);
                        long j11 = this.f74898h;
                        DisposableHelper.replace(this.f74910t, cVar.d(runnableC0794a, j11, j11, this.f74899i));
                    }
                } else {
                    this.f74905o = j10;
                }
                if (d(-1) == 0) {
                    return;
                }
            } else {
                this.f71927d.offer((U) NotificationLite.next(t10));
                if (!g()) {
                    return;
                }
            }
            n();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            mi.b bVarE;
            if (DisposableHelper.validate(this.f74907q, bVar)) {
                this.f74907q = bVar;
                ii.r<? super V> rVar = this.f71926c;
                rVar.onSubscribe(this);
                if (this.f71928e) {
                    return;
                }
                UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74901k);
                this.f74908r = unicastSubjectD;
                rVar.onNext(unicastSubjectD);
                RunnableC0794a runnableC0794a = new RunnableC0794a(this.f74906p, this);
                if (this.f74902l) {
                    ii.s.c cVar = this.f74904n;
                    long j10 = this.f74898h;
                    bVarE = cVar.d(runnableC0794a, j10, j10, this.f74899i);
                } else {
                    ii.s sVar = this.f74900j;
                    long j11 = this.f74898h;
                    bVarE = sVar.e(runnableC0794a, j11, j11, this.f74899i);
                }
                DisposableHelper.replace(this.f74910t, bVarE);
            }
        }
    }

    /* JADX INFO: compiled from: ObservableWindowTimed.java */
    public static final class b<T> extends si.j<T, Object, ii.k<T>> implements mi.b, Runnable {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Object f74913p = new Object();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f74914h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TimeUnit f74915i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ii.s f74916j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f74917k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public mi.b f74918l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public UnicastSubject<T> f74919m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AtomicReference<mi.b> f74920n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public volatile boolean f74921o;

        @Override // mi.b
        public void dispose() {
            this.f71928e = true;
        }

        @Override // ii.r
        public void onComplete() {
            this.f71929f = true;
            if (g()) {
                l();
            }
            k();
            this.f71926c.onComplete();
        }

        public b(ii.r<? super ii.k<T>> rVar, long j10, TimeUnit timeUnit, ii.s sVar, int i10) {
            super(rVar, new MpscLinkedQueue());
            this.f74920n = new AtomicReference<>();
            this.f74914h = j10;
            this.f74915i = timeUnit;
            this.f74916j = sVar;
            this.f74917k = i10;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f71928e;
        }

        public void k() {
            DisposableHelper.dispose(this.f74920n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
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
        public void l() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f71927d;
            ii.r<? super V> rVar = this.f71926c;
            UnicastSubject<T> unicastSubject = this.f74919m;
            int iD = 1;
            while (true) {
                boolean z10 = this.f74921o;
                boolean z11 = this.f71929f;
                Object objPoll = mpscLinkedQueue.poll();
                if (z11 && (objPoll == null || objPoll == f74913p)) {
                    break;
                }
                if (objPoll == null) {
                    iD = d(-iD);
                    if (iD == 0) {
                        return;
                    }
                } else if (objPoll == f74913p) {
                    unicastSubject.onComplete();
                    if (z10) {
                        this.f74918l.dispose();
                    } else {
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.d(this.f74917k);
                        this.f74919m = unicastSubject;
                        rVar.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                }
            }
            this.f74919m = null;
            mpscLinkedQueue.clear();
            k();
            Throwable th2 = this.f71930g;
            if (th2 != null) {
                unicastSubject.onError(th2);
            } else {
                unicastSubject.onComplete();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f71930g = th2;
            this.f71929f = true;
            if (g()) {
                l();
            }
            k();
            this.f71926c.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74921o) {
                return;
            }
            if (h()) {
                this.f74919m.onNext(t10);
                if (d(-1) == 0) {
                    return;
                }
            } else {
                this.f71927d.offer((U) NotificationLite.next(t10));
                if (!g()) {
                    return;
                }
            }
            l();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74918l, bVar)) {
                this.f74918l = bVar;
                this.f74919m = UnicastSubject.d(this.f74917k);
                ii.r<? super V> rVar = this.f71926c;
                rVar.onSubscribe(this);
                rVar.onNext(this.f74919m);
                if (this.f71928e) {
                    return;
                }
                ii.s sVar = this.f74916j;
                long j10 = this.f74914h;
                DisposableHelper.replace(this.f74920n, sVar.e(this, j10, j10, this.f74915i));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f71928e) {
                this.f74921o = true;
                k();
            }
            this.f71927d.offer((U) f74913p);
            if (g()) {
                l();
            }
        }
    }

    /* JADX INFO: compiled from: ObservableWindowTimed.java */
    public static final class c<T> extends si.j<T, Object, ii.k<T>> implements mi.b, Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f74922h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f74923i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TimeUnit f74924j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ii.s.c f74925k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f74926l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List<UnicastSubject<T>> f74927m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public mi.b f74928n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public volatile boolean f74929o;

        /* JADX INFO: compiled from: ObservableWindowTimed.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UnicastSubject<T> f74930b;

            public a(UnicastSubject<T> unicastSubject) {
                this.f74930b = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.k(this.f74930b);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.f71928e = true;
        }

        @Override // ii.r
        public void onComplete() {
            this.f71929f = true;
            if (g()) {
                m();
            }
            this.f71926c.onComplete();
            l();
        }

        /* JADX INFO: compiled from: ObservableWindowTimed.java */
        public static final class b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnicastSubject<T> f74932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f74933b;

            public b(UnicastSubject<T> unicastSubject, boolean z10) {
                this.f74932a = unicastSubject;
                this.f74933b = z10;
            }
        }

        public c(ii.r<? super ii.k<T>> rVar, long j10, long j11, TimeUnit timeUnit, ii.s.c cVar, int i10) {
            super(rVar, new MpscLinkedQueue());
            this.f74922h = j10;
            this.f74923i = j11;
            this.f74924j = timeUnit;
            this.f74925k = cVar;
            this.f74926l = i10;
            this.f74927m = new LinkedList();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f71928e;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void k(UnicastSubject<T> unicastSubject) {
            this.f71927d.offer((U) new b(unicastSubject, false));
            if (g()) {
                m();
            }
        }

        public void l() {
            this.f74925k.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void m() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f71927d;
            ii.r<? super V> rVar = this.f71926c;
            List<UnicastSubject<T>> list = this.f74927m;
            int iD = 1;
            while (!this.f74929o) {
                boolean z10 = this.f71929f;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    mpscLinkedQueue.clear();
                    Throwable th2 = this.f71930g;
                    if (th2 != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    l();
                    list.clear();
                    return;
                }
                if (z11) {
                    iD = d(-iD);
                    if (iD == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f74933b) {
                        list.remove(bVar.f74932a);
                        bVar.f74932a.onComplete();
                        if (list.isEmpty() && this.f71928e) {
                            this.f74929o = true;
                        }
                    } else if (!this.f71928e) {
                        UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74926l);
                        list.add(unicastSubjectD);
                        rVar.onNext(unicastSubjectD);
                        this.f74925k.c(new a(unicastSubjectD), this.f74922h, this.f74924j);
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.f74928n.dispose();
            l();
            mpscLinkedQueue.clear();
            list.clear();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f71930g = th2;
            this.f71929f = true;
            if (g()) {
                m();
            }
            this.f71926c.onError(th2);
            l();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74928n, bVar)) {
                this.f74928n = bVar;
                this.f71926c.onSubscribe(this);
                if (this.f71928e) {
                    return;
                }
                UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74926l);
                this.f74927m.add(unicastSubjectD);
                this.f71926c.onNext(unicastSubjectD);
                this.f74925k.c(new a(unicastSubjectD), this.f74922h, this.f74924j);
                ii.s.c cVar = this.f74925k;
                long j10 = this.f74923i;
                cVar.d(this, j10, j10, this.f74924j);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(UnicastSubject.d(this.f74926l), true);
            if (!this.f71928e) {
                this.f71927d.offer((U) bVar);
            }
            if (g()) {
                m();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onNext(T t10) {
            if (h()) {
                Iterator<UnicastSubject<T>> it = this.f74927m.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (d(-1) == 0) {
                    return;
                }
            } else {
                this.f71927d.offer((U) t10);
                if (!g()) {
                    return;
                }
            }
            m();
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super ii.k<T>> rVar) {
        dj.e eVar = new dj.e(rVar);
        long j10 = this.f74891c;
        long j11 = this.f74892d;
        if (j10 != j11) {
            this.f74487b.subscribe(new c(eVar, j10, j11, this.f74893e, this.f74894f.a(), this.f74896h));
            return;
        }
        long j12 = this.f74895g;
        if (j12 == Long.MAX_VALUE) {
            this.f74487b.subscribe(new b(eVar, this.f74891c, this.f74893e, this.f74894f, this.f74896h));
        } else {
            this.f74487b.subscribe(new a(eVar, j10, this.f74893e, this.f74894f, this.f74896h, j12, this.f74897i));
        }
    }

    public w1(ii.p<T> pVar, long j10, long j11, TimeUnit timeUnit, ii.s sVar, long j12, int i10, boolean z10) {
        super(pVar);
        this.f74891c = j10;
        this.f74892d = j11;
        this.f74893e = timeUnit;
        this.f74894f = sVar;
        this.f74895g = j12;
        this.f74896h = i10;
        this.f74897i = z10;
    }
}
