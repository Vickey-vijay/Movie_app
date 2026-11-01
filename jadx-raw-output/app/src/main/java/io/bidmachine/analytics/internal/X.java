package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.Struct;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.analytics.MonitorConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import nk.j2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0002\u0006\u0012B\u001f\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00040\u00042\u0006\u0010\t\u001a\u00020\bH\u0083@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u000bJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0083@ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\rJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0006\u0010\u0010J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Lio/bidmachine/analytics/internal/X;", "", "Lio/bidmachine/analytics/internal/Q;", "monitorRecord", "Lkotlin/Result;", "Lmj/r;", "a", "(Lio/bidmachine/analytics/internal/Q;)Ljava/lang/Object;", "", "limit", "", "(ILrj/c;)Ljava/lang/Object;", "monitorRecordList", "(Ljava/util/List;Lrj/c;)Ljava/lang/Object;", "", "force", "(Z)V", "()V", "b", "(Lio/bidmachine/analytics/internal/Q;)V", "Lio/bidmachine/analytics/internal/X$b;", "Lio/bidmachine/analytics/internal/X$b;", "config", "Lio/bidmachine/analytics/internal/V;", "Lio/bidmachine/analytics/internal/V;", "monitorRepository", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Lnk/l0;", "d", "Lnk/l0;", "scope", "Lkotlinx/coroutines/g;", "e", "Lkotlinx/coroutines/g;", "retrySendJob", "Ljava/util/concurrent/atomic/AtomicBoolean;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroyed", "Lio/bidmachine/analytics/internal/p0;", "dispatchers", "<init>", "(Lio/bidmachine/analytics/internal/p0;Lio/bidmachine/analytics/internal/X$b;Lio/bidmachine/analytics/internal/V;)V", "g", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final V monitorRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nk.l0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private kotlinx.coroutines.g retrySendJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isDestroyed = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, d2 = {"Lio/bidmachine/analytics/internal/X$b;", "", "Lio/bidmachine/analytics/MonitorConfig;", "a", "Lio/bidmachine/analytics/MonitorConfig;", "b", "()Lio/bidmachine/analytics/MonitorConfig;", "monitorConfig", "", "Ljava/lang/String;", "c", "()Ljava/lang/String;", JsonStorageKeyNames.SESSION_ID_KEY, "Lcom/explorestack/protobuf/Struct;", "Lcom/explorestack/protobuf/Struct;", "()Lcom/explorestack/protobuf/Struct;", "extras", "<init>", "(Lio/bidmachine/analytics/MonitorConfig;Ljava/lang/String;Lcom/explorestack/protobuf/Struct;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final MonitorConfig monitorConfig;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String sessionId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Struct extras;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Struct getExtras() {
            return this.extras;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final MonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public b(MonitorConfig monitorConfig, String str, Struct struct) {
            this.monitorConfig = monitorConfig;
            this.sessionId = str;
            this.extras = struct;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker$forceSendAndDestroy$1$1", f = "MonitorTracker.kt", l = {44}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements bk.p<nk.l0, rj.c<? super mj.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58761a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<MonitorRecord> f58763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<MonitorRecord> list, rj.c<? super c> cVar) {
            super(2, cVar);
            this.f58763c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return X.this.new c(this.f58763c, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super mj.r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f58761a;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                X x10 = X.this;
                List<MonitorRecord> list = this.f58763c;
                this.f58761a = 1;
                if (x10.a(list, this) == objF) {
                    return objF;
                }
            }
            return mj.r.f64562a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker$scheduleSend$1", f = "MonitorTracker.kt", l = {118, 120}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements bk.p<nk.l0, rj.c<? super mj.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58764a;

        public d(rj.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return X.this.new d(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super mj.r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f58764a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        kotlin.c.b(obj);
                        ((Result) obj).m3466unboximpl();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                }
                return mj.r.f64562a;
            }
            kotlin.c.b(obj);
            long interval = X.this.config.getMonitorConfig().getInterval();
            this.f58764a = 1;
            if (nk.s0.a(interval, this) == objF) {
                return objF;
            }
            X x10 = X.this;
            this.f58764a = 2;
            if (x10.a(0, this) == objF) {
                return objF;
            }
            return mj.r.f64562a;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker", f = "MonitorTracker.kt", l = {102}, m = "sendRecords")
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f58766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f58767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f58768c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f58770e;

        public e(rj.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58768c = obj;
            this.f58770e |= Integer.MIN_VALUE;
            return X.this.a((List<MonitorRecord>) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnk/l0;", "Lkotlin/Result;", "Lio/bidmachine/analytics/internal/P;", "<anonymous>", "(Lnk/l0;)Lkotlin/Result;"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker$sendRecords$2$1$1", f = "MonitorTracker.kt", l = {94}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements bk.p<nk.l0, rj.c<? super Result<? extends P>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58771a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<MonitorRecord> f58773c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<MonitorRecord> list, rj.c<? super f> cVar) {
            super(2, cVar);
            this.f58773c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return X.this.new f(this.f58773c, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super Result<P>> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objA;
            Object objF = sj.a.f();
            int i10 = this.f58771a;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                    objA = ((Result) obj).m3466unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                P p10 = new P(X.this.config.getMonitorConfig().getUrl(), X.this.config.getMonitorConfig().getName(), X.this.config.getExtras(), this.f58773c, null, 16, null);
                this.f58771a = 1;
                objA = p10.a(this);
                if (objA == objF) {
                    return objF;
                }
            }
            X x10 = X.this;
            List<MonitorRecord> list = this.f58773c;
            if (Result.m3464isSuccessimpl(objA)) {
                x10.monitorRepository.b(list);
            }
            X x11 = X.this;
            List<MonitorRecord> list2 = this.f58773c;
            if (Result.m3461exceptionOrNullimpl(objA) != null) {
                x11.monitorRepository.c(list2);
            }
            return Result.m3457boximpl(objA);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker", f = "MonitorTracker.kt", l = {75}, m = "sendRecordsIfLimitReached-gIAlu-s")
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f58774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f58775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f58776c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f58778e;

        public g(rj.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f58776c = obj;
            this.f58778e |= Integer.MIN_VALUE;
            Object objA = X.this.a(0, this);
            return objA == sj.a.f() ? objA : Result.m3457boximpl(objA);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker$trackMonitorRecord$1", f = "MonitorTracker.kt", l = {55, 57}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements bk.p<nk.l0, rj.c<? super mj.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58779a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MonitorRecord f58781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MonitorRecord monitorRecord, rj.c<? super h> cVar) {
            super(2, cVar);
            this.f58781c = monitorRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return X.this.new h(this.f58781c, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super mj.r> cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f58779a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    ((Result) obj).m3466unboximpl();
                }
            } else {
                kotlin.c.b(obj);
                if (Result.m3464isSuccessimpl(X.this.a(this.f58781c))) {
                    X x10 = X.this;
                    int batchSize = x10.config.getMonitorConfig().getBatchSize();
                    this.f58779a = 1;
                    if (x10.a(batchSize, this) == objF) {
                        return objF;
                    }
                } else {
                    X x11 = X.this;
                    List listE = nj.r.e(this.f58781c);
                    this.f58779a = 2;
                    if (x11.a((List<MonitorRecord>) listE, this) == objF) {
                        return objF;
                    }
                }
            }
            return mj.r.f64562a;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public X(p0 p0Var, b bVar, V v10) {
        this.config = bVar;
        this.monitorRepository = v10;
        this.name = bVar.getMonitorConfig().getName();
        this.scope = kotlinx.coroutines.d.a(new nk.k0("AnalyticsMonitor: " + bVar.getMonitorConfig().getName()).plus(j2.b(null, 1, null)).plus(p0Var.c()));
    }

    public final void b(MonitorRecord monitorRecord) {
        if (this.isDestroyed.get()) {
            return;
        }
        nk.j.d(this.scope, null, null, new h(monitorRecord, null), 3, null);
    }

    public final void a() {
        if (this.isDestroyed.compareAndSet(false, true)) {
            Object objA = this.monitorRepository.a(this.config.getMonitorConfig().getName(), this.config.getSessionId());
            if (Result.m3464isSuccessimpl(objA)) {
                nk.j.d(this.scope, null, null, new c((List) objA, null), 3, null);
            }
        }
    }

    private final void a(boolean force) {
        kotlinx.coroutines.g gVar;
        if (this.isDestroyed.get()) {
            return;
        }
        if (force || (gVar = this.retrySendJob) == null || !gVar.isActive()) {
            kotlinx.coroutines.g gVar2 = this.retrySendJob;
            if (gVar2 != null) {
                kotlinx.coroutines.g.a.a(gVar2, null, 1, null);
            }
            this.retrySendJob = nk.j.d(this.scope, null, null, new d(null), 3, null);
        }
    }

    public static /* synthetic */ void a(X x10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        x10.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List<MonitorRecord> list, rj.c<? super mj.r> cVar) throws Throwable {
        e eVar;
        Object objA;
        X x10;
        Object obj;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f58770e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f58770e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar);
            }
        } else {
            eVar = new e(cVar);
        }
        Object obj2 = eVar.f58768c;
        Object objF = sj.a.f();
        int i11 = eVar.f58770e;
        if (i11 == 0) {
            kotlin.c.b(obj2);
            objA = this.monitorRepository.a(list);
            if (Result.m3464isSuccessimpl(objA)) {
                List listT = nj.b0.T(list, this.config.getMonitorConfig().getBatchSize());
                ArrayList arrayList = new ArrayList(nj.t.v(listT, 10));
                Iterator it = listT.iterator();
                while (it.hasNext()) {
                    arrayList.add(nk.j.b(this.scope, null, null, new f((List) it.next(), null), 3, null));
                }
                eVar.f58766a = this;
                eVar.f58767b = objA;
                eVar.f58770e = 1;
                if (nk.e.a(arrayList, eVar) == objF) {
                    return objF;
                }
                x10 = this;
                obj = objA;
            } else {
                x10 = this;
            }
            if (Result.m3461exceptionOrNullimpl(objA) != null) {
                x10.a(true);
            }
            return mj.r.f64562a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj = eVar.f58767b;
        x10 = (X) eVar.f58766a;
        kotlin.c.b(obj2);
        x10.a(true);
        objA = obj;
        if (Result.m3461exceptionOrNullimpl(objA) != null) {
            x10.a(true);
        }
        return mj.r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i10, rj.c<? super Result<? extends Result<? extends List<MonitorRecord>>>> cVar) throws Throwable {
        g gVar;
        X x10;
        Object obj;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.f58778e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f58778e = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(cVar);
            }
        } else {
            gVar = new g(cVar);
        }
        Object obj2 = gVar.f58776c;
        Object objF = sj.a.f();
        int i12 = gVar.f58778e;
        try {
            if (i12 == 0) {
                kotlin.c.b(obj2);
                Result.a aVar = Result.Companion;
                Object objA = this.monitorRepository.a(this.config.getMonitorConfig().getName(), this.config.getSessionId(), this.config.getMonitorConfig().getBatchSize());
                if (Result.m3464isSuccessimpl(objA)) {
                    List<MonitorRecord> list = (List) objA;
                    if (!(!list.isEmpty()) || list.size() < i10) {
                        a(this, false, 1, null);
                    } else {
                        gVar.f58774a = this;
                        gVar.f58775b = objA;
                        gVar.f58778e = 1;
                        if (a(list, gVar) == objF) {
                            return objF;
                        }
                    }
                }
                x10 = this;
                obj = objA;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = gVar.f58775b;
                x10 = (X) gVar.f58774a;
                kotlin.c.b(obj2);
            }
            if (Result.m3461exceptionOrNullimpl(obj) != null) {
                a(x10, false, 1, null);
            }
            return Result.m3458constructorimpl(Result.m3457boximpl(obj));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(MonitorRecord monitorRecord) {
        try {
            Result.a aVar = Result.Companion;
            return this.monitorRepository.a(monitorRecord);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }
}
