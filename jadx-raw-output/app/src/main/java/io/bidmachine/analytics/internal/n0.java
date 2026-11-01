package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.Struct;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.analytics.ReaderConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import nk.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J:\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ6\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00070\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0083@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\t\u0010\fJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u000eJ!\u0010\t\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0083@ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0010J#\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lio/bidmachine/analytics/internal/n0;", "", "", "readerName", "", "Lio/bidmachine/analytics/internal/h0;", "failedRuleList", "Lkotlin/Result;", "Lmj/r;", "a", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "monitorName", "(Ljava/lang/String;Lrj/c;)Ljava/lang/Object;", "readerRecord", "(Lio/bidmachine/analytics/internal/h0;)Ljava/lang/Object;", "readerRecordList", "(Ljava/util/List;Lrj/c;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/util/List;)V", "Lio/bidmachine/analytics/internal/n0$a;", "Lio/bidmachine/analytics/internal/n0$a;", "config", "Lio/bidmachine/analytics/internal/l0;", "Lio/bidmachine/analytics/internal/l0;", "readerRepository", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Lnk/l0;", "d", "Lnk/l0;", "scope", "Lio/bidmachine/analytics/internal/p0;", "dispatchers", "<init>", "(Lio/bidmachine/analytics/internal/p0;Lio/bidmachine/analytics/internal/n0$a;Lio/bidmachine/analytics/internal/l0;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 readerRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nk.l0 scope;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015¨\u0006\u0019"}, d2 = {"Lio/bidmachine/analytics/internal/n0$a;", "", "Lio/bidmachine/analytics/ReaderConfig;", "a", "Lio/bidmachine/analytics/ReaderConfig;", "c", "()Lio/bidmachine/analytics/ReaderConfig;", "readerConfig", "", "b", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", JsonStorageKeyNames.SESSION_ID_KEY, "Lcom/explorestack/protobuf/Struct;", "Lcom/explorestack/protobuf/Struct;", "()Lcom/explorestack/protobuf/Struct;", "extras", "Lio/bidmachine/analytics/internal/g0$a;", "d", "Lio/bidmachine/analytics/internal/g0$a;", "()Lio/bidmachine/analytics/internal/g0$a;", "contentExtractor", "<init>", "(Lio/bidmachine/analytics/ReaderConfig;Ljava/lang/String;Lcom/explorestack/protobuf/Struct;Lio/bidmachine/analytics/internal/g0$a;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ReaderConfig readerConfig;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String sessionId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Struct extras;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final g0.a contentExtractor;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g0.a getContentExtractor() {
            return this.contentExtractor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Struct getExtras() {
            return this.extras;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ReaderConfig getReaderConfig() {
            return this.readerConfig;
        }

        public a(ReaderConfig readerConfig, String str, Struct struct, g0.a aVar) {
            this.readerConfig = readerConfig;
            this.sessionId = str;
            this.extras = struct;
            this.contentExtractor = aVar;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.ReaderTracker", f = "ReaderTracker.kt", l = {53}, m = "sendRecords-gIAlu-s")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f58933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f58934b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f58936d;

        public b(rj.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f58934b = obj;
            this.f58936d |= Integer.MIN_VALUE;
            Object objA = n0.this.a((String) null, this);
            return objA == sj.a.f() ? objA : Result.m3457boximpl(objA);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.ReaderTracker", f = "ReaderTracker.kt", l = {101}, m = "sendRecords")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f58937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f58938b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f58940d;

        public c(rj.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58938b = obj;
            this.f58940d |= Integer.MIN_VALUE;
            return n0.this.a((List<ReaderRecord>) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnk/l0;", "Lkotlin/Result;", "Lio/bidmachine/analytics/internal/g0;", "<anonymous>", "(Lnk/l0;)Lkotlin/Result;"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.ReaderTracker$sendRecords$4$1", f = "ReaderTracker.kt", l = {90}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements bk.p<nk.l0, rj.c<? super Result<? extends g0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58941a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<ReaderRecord> f58943c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<ReaderRecord> list, rj.c<? super d> cVar) {
            super(2, cVar);
            this.f58943c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return n0.this.new d(this.f58943c, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super Result<g0>> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objA;
            Object objF = sj.a.f();
            int i10 = this.f58941a;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                    objA = ((Result) obj).m3466unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                g0 g0Var = new g0(n0.this.config.getReaderConfig().getUrl(), n0.this.config.getReaderConfig().getName(), n0.this.config.getExtras(), this.f58943c, n0.this.config.getContentExtractor(), null, 32, null);
                this.f58941a = 1;
                objA = g0Var.a(this);
                if (objA == objF) {
                    return objF;
                }
            }
            n0 n0Var = n0.this;
            List<ReaderRecord> list = this.f58943c;
            if (Result.m3464isSuccessimpl(objA)) {
                l0 l0Var = n0Var.readerRepository;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((ReaderRecord) obj2).getError() != null) {
                        arrayList.add(obj2);
                    }
                }
                l0Var.b(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((ReaderRecord) obj3).getError() == null) {
                        arrayList2.add(obj3);
                    }
                }
                n0Var.readerRepository.c(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    n0Var.a((ReaderRecord) it.next());
                }
            }
            n0 n0Var2 = n0.this;
            List<ReaderRecord> list2 = this.f58943c;
            if (Result.m3461exceptionOrNullimpl(objA) != null) {
                n0Var2.readerRepository.c(list2);
            }
            return Result.m3457boximpl(objA);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.ReaderTracker$trackReaderRecordList$1", f = "ReaderTracker.kt", l = {38, 40}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements bk.p<nk.l0, rj.c<? super mj.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f58944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f58945b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f58947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<ReaderRecord> f58948e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, List<ReaderRecord> list, rj.c<? super e> cVar) {
            super(2, cVar);
            this.f58947d = str;
            this.f58948e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return n0.this.new e(this.f58947d, this.f58948e, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super mj.r> cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List arrayList;
            Object objF = sj.a.f();
            int i10 = this.f58945b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    arrayList = (List) this.f58944a;
                    kotlin.c.b(obj);
                    ((Result) obj).m3466unboximpl();
                }
                return mj.r.f64562a;
            }
            kotlin.c.b(obj);
            arrayList = new ArrayList();
            n0 n0Var = n0.this;
            String str = this.f58947d;
            List<ReaderRecord> list = this.f58948e;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((ReaderRecord) obj2).getError() != null) {
                    arrayList2.add(obj2);
                }
            }
            n0Var.a(str, arrayList2);
            List<ReaderRecord> list2 = this.f58948e;
            n0 n0Var2 = n0.this;
            for (ReaderRecord readerRecord : list2) {
                if (Result.m3463isFailureimpl(n0Var2.a(readerRecord))) {
                    arrayList.add(readerRecord);
                }
            }
            n0 n0Var3 = n0.this;
            String str2 = this.f58947d;
            this.f58944a = arrayList;
            this.f58945b = 1;
            if (n0Var3.a(str2, this) == objF) {
                return objF;
            }
            if (!arrayList.isEmpty()) {
                n0 n0Var4 = n0.this;
                this.f58944a = null;
                this.f58945b = 2;
                if (n0Var4.a((List<ReaderRecord>) arrayList, this) == objF) {
                    return objF;
                }
            }
            return mj.r.f64562a;
        }
    }

    public final void b(String readerName, List<ReaderRecord> readerRecordList) {
        nk.j.d(this.scope, null, null, new e(readerName, readerRecordList, null), 3, null);
    }

    public n0(p0 p0Var, a aVar, l0 l0Var) {
        this.config = aVar;
        this.readerRepository = l0Var;
        this.name = aVar.getReaderConfig().getName();
        this.scope = kotlinx.coroutines.d.a(new nk.k0("AnalyticsMonitor: " + aVar.getReaderConfig().getName()).plus(j2.b(null, 1, null)).plus(p0Var.c()));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String readerName, List<ReaderRecord> failedRuleList) {
        try {
            Result.a aVar = Result.Companion;
            l0 l0Var = this.readerRepository;
            ArrayList arrayList = new ArrayList(nj.t.v(failedRuleList, 10));
            Iterator<T> it = failedRuleList.iterator();
            while (it.hasNext()) {
                arrayList.add(((ReaderRecord) it.next()).getRule());
            }
            return Result.m3458constructorimpl(Result.m3457boximpl(l0Var.a(readerName, arrayList)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List<ReaderRecord> list, rj.c<? super mj.r> cVar) throws Throwable {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f58940d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f58940d = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(cVar);
            }
        } else {
            cVar2 = new c(cVar);
        }
        Object obj = cVar2.f58938b;
        Object objF = sj.a.f();
        int i11 = cVar2.f58940d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Object objA = this.readerRepository.a(list);
            if (Result.m3464isSuccessimpl(objA)) {
                nk.p0 p0VarB = nk.j.b(this.scope, null, null, new d(list, null), 3, null);
                cVar2.f58937a = objA;
                cVar2.f58940d = 1;
                if (p0VarB.y(cVar2) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return mj.r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, rj.c<? super Result<? extends Result<? extends List<ReaderRecord>>>> cVar) throws Throwable {
        b bVar;
        Object objA;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f58936d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f58936d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar);
            }
        } else {
            bVar = new b(cVar);
        }
        Object obj = bVar.f58934b;
        Object objF = sj.a.f();
        int i11 = bVar.f58936d;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                Result.a aVar = Result.Companion;
                objA = this.readerRepository.a(str);
                if (Result.m3464isSuccessimpl(objA)) {
                    List<ReaderRecord> list = (List) objA;
                    if (!list.isEmpty()) {
                        bVar.f58933a = objA;
                        bVar.f58936d = 1;
                        if (a(list, bVar) == objF) {
                            return objF;
                        }
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objA = bVar.f58933a;
                kotlin.c.b(obj);
            }
            return Result.m3458constructorimpl(Result.m3457boximpl(objA));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(ReaderRecord readerRecord) {
        try {
            Result.a aVar = Result.Companion;
            if (readerRecord.getError() == null) {
                Object objA = this.readerRepository.a(readerRecord.getName(), readerRecord.getRule());
                if (Result.m3463isFailureimpl(objA)) {
                    objA = null;
                }
                ReaderRecord readerRecord2 = (ReaderRecord) objA;
                if (readerRecord2 != null) {
                    return this.readerRepository.a(readerRecord.a((62 & 1) != 0 ? readerRecord.id : readerRecord2.getId(), (62 & 2) != 0 ? readerRecord.name : null, (62 & 4) != 0 ? readerRecord.timestamp : 0L, (62 & 8) != 0 ? readerRecord.dataHash : null, (62 & 16) != 0 ? readerRecord.rule : null, (62 & 32) != 0 ? readerRecord.error : null, (62 & 64) != 0 ? readerRecord.isDirty : (this.config.getReaderConfig().getUniqueOnly() && ck.p.e(readerRecord.getDataHash(), readerRecord2.getDataHash())) ? false : true));
                }
            }
            return this.readerRepository.b(readerRecord);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }
}
