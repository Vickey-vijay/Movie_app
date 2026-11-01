package io.bidmachine.rendering.internal.event;

import bk.p;
import io.bidmachine.rendering.internal.h;
import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nj.n;
import nk.j;
import nk.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f60391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f60392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f60393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f60394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l0 f60395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f60396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f60397g;

    public static final class a extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60398a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object[] f60400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EventType f60401d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object[] objArr, EventType eventType, rj.c cVar) {
            super(2, cVar);
            this.f60400c = objArr;
            this.f60401d = eventType;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return c.this.new a(this.f60400c, this.f60401d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60398a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            e eVar = c.this.f60393c;
            List listS0 = n.s0(this.f60400c);
            listS0.add(0, this.f60401d);
            if (eVar.a(listS0)) {
                return r.f64562a;
            }
            List list = (List) c.this.f60397g.get(this.f60401d);
            if (list != null) {
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    c cVar = c.this;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!cVar.f60392b.a(((EventTaskParams) obj2).getStateGroups())) {
                            arrayList.add(obj2);
                        }
                    }
                    c cVar2 = c.this;
                    EventType eventType = this.f60401d;
                    Object[] objArr = this.f60400c;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        cVar2.f60394d.a(eventType, (EventTaskParams) it.next(), Arrays.copyOf(objArr, objArr.length));
                    }
                }
            }
            return r.f64562a;
        }
    }

    public c(String str, e eVar, e eVar2, d dVar, l0 l0Var, h hVar, Map map) {
        ck.p.j(str, "sourceName");
        ck.p.j(eVar, "stateGroupEventInterceptor");
        ck.p.j(eVar2, "animationEventInterceptor");
        ck.p.j(dVar, "callbackProcessor");
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(hVar, "coroutineDispatchers");
        this.f60391a = str;
        this.f60392b = eVar;
        this.f60393c = eVar2;
        this.f60394d = dVar;
        this.f60395e = l0Var;
        this.f60396f = hVar;
        this.f60397g = map == null ? new EnumMap(EventType.class) : map;
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void e() {
        a(EventType.OnSkip, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void f() {
        a(EventType.OnMute, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public String g() {
        return this.f60391a;
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void h() {
        a(EventType.OnPause, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void i() {
        a(EventType.OnMidpoint, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void j() {
        a(EventType.OnScheduled, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void k() {
        a(EventType.OnFirstQuartile, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void l() {
        a(EventType.OnStart, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void m() {
        a(EventType.OnImpression, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void onClose() {
        a(EventType.OnClose, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void onUseCustomClose(boolean z10) {
        a(EventType.OnUseCustomClose, Boolean.valueOf(z10));
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(int i10) {
        a(EventType.OnClick, Integer.valueOf(i10));
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void b() {
        a(EventType.OnResume, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void c() {
        a(EventType.OnUnMute, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void d() {
        a(EventType.OnThirdQuartile, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a() {
        a(EventType.OnComplete, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(String str) {
        ck.p.j(str, "url");
        a(EventType.OnNavigate, str);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(long j10, long j11) {
        a(EventType.OnProgress, Long.valueOf(j10), Long.valueOf(j11));
    }

    public final void a(EventType eventType, Object... objArr) {
        ck.p.j(eventType, "eventType");
        ck.p.j(objArr, "params");
        j.d(this.f60395e, this.f60396f.b(), null, new a(objArr, eventType, null), 2, null);
    }
}
