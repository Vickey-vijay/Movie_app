package io.bidmachine.analytics.internal;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.bidmachine.analytics.ReaderConfig;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import nk.j2;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u001e\u0010\u0018J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\bR!\u0010\u0019\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0007\u0010\u0016R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001d\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lio/bidmachine/analytics/internal/i;", "Lio/bidmachine/analytics/internal/j;", "Lio/bidmachine/analytics/internal/i$a;", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "rule", "Lkotlin/Result;", "Lio/bidmachine/analytics/internal/h$a;", "b", "(Lio/bidmachine/analytics/ReaderConfig$Rule;Lrj/c;)Ljava/lang/Object;", com.safedk.android.utils.i.f44984c, "Lmj/r;", "a", "(Lio/bidmachine/analytics/internal/i$a;)V", "Landroid/content/Context;", "applicationContext", InneractiveMediationDefs.GENDER_FEMALE, "(Landroid/content/Context;)V", "e", "", "Lnk/l0;", "d", "Lmj/g;", "()Lnk/l0;", "getScope$annotations", "()V", "scope", "Lkotlinx/coroutines/g;", "Lkotlinx/coroutines/g;", "readerJob", "Lio/bidmachine/analytics/internal/i$a;", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractC4739i extends AbstractC4740j<a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mj.g scope = kotlin.b.a(d.f58863a);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private kotlinx.coroutines.g readerJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a configuration;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.i$a */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, d2 = {"Lio/bidmachine/analytics/internal/i$a;", "", "", "a", "J", "b", "()J", "interval", "", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "Ljava/util/List;", "c", "()Ljava/util/List;", "rules", "Lio/bidmachine/analytics/internal/h;", "Lio/bidmachine/analytics/internal/h;", "()Lio/bidmachine/analytics/internal/h;", "callback", "<init>", "(JLjava/util/List;Lio/bidmachine/analytics/internal/h;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long interval;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<ReaderConfig.Rule> rules;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4738h callback;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC4738h getCallback() {
            return this.callback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getInterval() {
            return this.interval;
        }

        public final List<ReaderConfig.Rule> c() {
            return this.rules;
        }

        public a(long j10, List<ReaderConfig.Rule> list, InterfaceC4738h interfaceC4738h) {
            this.interval = j10;
            this.rules = list;
            this.callback = interfaceC4738h;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.i$b */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.service.reader.AnalyticsReaderService$onEnable$1", f = "AnalyticsReaderService.kt", l = {38, 41}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements bk.p<nk.l0, rj.c<? super mj.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f58851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f58852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f58853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f58854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f58855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a f58856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AbstractC4739i f58857g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, AbstractC4739i abstractC4739i, rj.c<? super b> cVar) {
            super(2, cVar);
            this.f58856f = aVar;
            this.f58857g = abstractC4739i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            b bVar = new b(this.f58856f, this.f58857g, cVar);
            bVar.f58855e = obj;
            return bVar;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super mj.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0066  */
        /* JADX WARN: Code duplicated, block: B:19:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x007d  */
        /* JADX WARN: Code duplicated, block: B:23:0x008a  */
        /* JADX WARN: Code duplicated, block: B:26:0x008f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ba -> B:12:0x0046). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = sj.a.f()
                int r1 = r11.f58854d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L3d
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r11.f58855e
                nk.l0 r1 = (nk.l0) r1
                kotlin.c.b(r12)
                goto L45
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f58853c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r11.f58852b
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Object r6 = r11.f58851a
                io.bidmachine.analytics.internal.i r6 = (io.bidmachine.analytics.internal.AbstractC4739i) r6
                java.lang.Object r7 = r11.f58855e
                nk.l0 r7 = (nk.l0) r7
                kotlin.c.b(r12)
                kotlin.Result r12 = (kotlin.Result) r12
                java.lang.Object r12 = r12.m3466unboximpl()
                r8 = r5
                r5 = r1
                r1 = r0
                r0 = r11
                goto L84
            L3d:
                kotlin.c.b(r12)
                java.lang.Object r12 = r11.f58855e
                r1 = r12
                nk.l0 r1 = (nk.l0) r1
            L45:
                r12 = r11
            L46:
                boolean r5 = kotlinx.coroutines.d.g(r1)
                if (r5 == 0) goto Lbc
                io.bidmachine.analytics.internal.i$a r5 = r12.f58856f
                java.util.List r5 = r5.c()
                io.bidmachine.analytics.internal.i r6 = r12.f58857g
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r5 = r5.iterator()
                r10 = r5
                r5 = r1
                r1 = r10
            L60:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L98
                java.lang.Object r8 = r1.next()
                io.bidmachine.analytics.ReaderConfig$Rule r8 = (io.bidmachine.analytics.ReaderConfig.Rule) r8
                r12.f58855e = r5
                r12.f58851a = r6
                r12.f58852b = r7
                r12.f58853c = r1
                r12.f58854d = r3
                java.lang.Object r8 = io.bidmachine.analytics.internal.AbstractC4739i.a(r6, r8, r12)
                if (r8 != r0) goto L7d
                return r0
            L7d:
                r10 = r0
                r0 = r12
                r12 = r8
                r8 = r7
                r7 = r5
                r5 = r1
                r1 = r10
            L84:
                boolean r9 = kotlin.Result.m3463isFailureimpl(r12)
                if (r9 == 0) goto L8b
                r12 = r4
            L8b:
                io.bidmachine.analytics.internal.h$a r12 = (io.bidmachine.analytics.internal.InterfaceC4738h.Data) r12
                if (r12 == 0) goto L92
                r8.add(r12)
            L92:
                r12 = r0
                r0 = r1
                r1 = r5
                r5 = r7
                r7 = r8
                goto L60
            L98:
                java.util.List r7 = (java.util.List) r7
                io.bidmachine.analytics.internal.i$a r1 = r12.f58856f
                io.bidmachine.analytics.internal.h r1 = r1.getCallback()
                r1.a(r7)
                io.bidmachine.analytics.internal.i$a r1 = r12.f58856f
                long r6 = r1.getInterval()
                r12.f58855e = r5
                r12.f58851a = r4
                r12.f58852b = r4
                r12.f58853c = r4
                r12.f58854d = r2
                java.lang.Object r1 = nk.s0.a(r6, r12)
                if (r1 != r0) goto Lba
                return r0
            Lba:
                r1 = r5
                goto L46
            Lbc:
                mj.r r12 = mj.r.f64562a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.AbstractC4739i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.i$c */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @tj.d(c = "io.bidmachine.analytics.sdk.service.reader.AnalyticsReaderService", f = "AnalyticsReaderService.kt", l = {51}, m = "scan-gIAlu-s")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f58858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f58859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f58860c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f58862e;

        public c(rj.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f58860c = obj;
            this.f58862e |= Integer.MIN_VALUE;
            Object objB = AbstractC4739i.this.b(null, this);
            return objB == sj.a.f() ? objB : Result.m3457boximpl(objB);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.i$d */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnk/l0;", "a", "()Lnk/l0;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements bk.a<nk.l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f58863a = new d();

        public d() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nk.l0 invoke() {
            return kotlinx.coroutines.d.a(j2.b(null, 1, null).plus(p0.INSTANCE.a().c()));
        }
    }

    public abstract Object a(ReaderConfig.Rule rule, rj.c<? super String> cVar);

    public final nk.l0 b() {
        return (nk.l0) this.scope.getValue();
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(a configuration) {
        this.configuration = configuration;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void e(Context applicationContext) {
        kotlinx.coroutines.g gVar = this.readerJob;
        if (gVar != null) {
            kotlinx.coroutines.g.a.a(gVar, null, 1, null);
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void f(Context applicationContext) {
        kotlinx.coroutines.g gVar = this.readerJob;
        if (gVar != null) {
            kotlinx.coroutines.g.a.a(gVar, null, 1, null);
        }
        a aVar = this.configuration;
        if (aVar == null) {
            return;
        }
        this.readerJob = nk.j.d(b(), null, null, new b(aVar, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ReaderConfig.Rule rule, rj.c<? super Result<InterfaceC4738h.Data>> cVar) throws Throwable {
        c cVar2;
        AbstractC4739i abstractC4739i;
        Object objM3458constructorimpl;
        TrackerError.a aVar;
        String strA;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f58862e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f58862e = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(cVar);
            }
        } else {
            cVar2 = new c(cVar);
        }
        Object objA = cVar2.f58860c;
        Object objF = sj.a.f();
        int i11 = cVar2.f58862e;
        if (i11 == 0) {
            kotlin.c.b(objA);
            try {
                Result.a aVar2 = Result.Companion;
                cVar2.f58858a = this;
                cVar2.f58859b = rule;
                cVar2.f58862e = 1;
                objA = a(rule, cVar2);
                if (objA == objF) {
                    return objF;
                }
                abstractC4739i = this;
            } catch (Throwable th2) {
                th = th2;
                abstractC4739i = this;
                Result.a aVar3 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rule = (ReaderConfig.Rule) cVar2.f58859b;
            abstractC4739i = (AbstractC4739i) cVar2.f58858a;
            try {
                kotlin.c.b(objA);
            } catch (Throwable th3) {
                th = th3;
                Result.a aVar4 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
            }
        }
        objM3458constructorimpl = Result.m3458constructorimpl((String) objA);
        ReaderConfig.Rule rule2 = rule;
        String str = (String) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
        if (str != null) {
            return Result.m3458constructorimpl(new InterfaceC4738h.Data(rule2, str, null, 4, null));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl instanceof CancellationException) {
            throw thM3461exceptionOrNullimpl;
        }
        if (thM3461exceptionOrNullimpl instanceof FileNotFoundException) {
            aVar = TrackerError.a.READER_NO_CONTENT;
        } else {
            aVar = thM3461exceptionOrNullimpl instanceof SecurityException ? TrackerError.a.READER_NO_ACCESS : TrackerError.a.READER_INVALID;
        }
        if (thM3461exceptionOrNullimpl == null || (strA = s0.a(thM3461exceptionOrNullimpl)) == null) {
            strA = "";
        }
        return Result.m3458constructorimpl(new InterfaceC4738h.Data(rule2, null, new TrackerError(abstractC4739i.getName(), aVar, strA), 2, null));
    }
}
