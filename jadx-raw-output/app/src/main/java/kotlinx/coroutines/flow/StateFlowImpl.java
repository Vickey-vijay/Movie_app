package kotlinx.coroutines.flow;

import ck.p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import mj.r;
import qk.c;
import qk.l;
import qk.v;
import qk.w;
import rk.j;
import rk.m;
import sk.d0;
import tj.d;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StateFlowImpl<T> extends rk.a<w> implements l<T>, c, j<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63145g = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63146f;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: StateFlow.kt */
    @d(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, 406}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ StateFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateFlowImpl<T> stateFlowImpl, rj.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = stateFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public final boolean q(Object obj, Object obj2) {
        int i10;
        w[] wVarArrM;
        synchronized (this) {
            Object obj3 = f63145g.get(this);
            if (obj != null && !p.e(obj3, obj)) {
                return false;
            }
            if (p.e(obj3, obj2)) {
                return true;
            }
            f63145g.set(this, obj2);
            int i11 = this.f63146f;
            if ((i11 & 1) != 0) {
                this.f63146f = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f63146f = i12;
            w[] wVarArrM2 = m();
            r rVar = r.f64562a;
            while (true) {
                w[] wVarArr = wVarArrM2;
                if (wVarArr != null) {
                    for (w wVar : wVarArr) {
                        if (wVar != null) {
                            wVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f63146f;
                    if (i10 == i12) {
                        this.f63146f = i12 + 1;
                        return true;
                    }
                    wVarArrM = m();
                    r rVar2 = r.f64562a;
                }
                wVarArrM2 = wVarArrM;
                i12 = i10;
            }
        }
    }

    @Override // qk.l
    public boolean a(T t10, T t11) {
        if (t10 == null) {
            t10 = (T) m.f66793a;
        }
        if (t11 == null) {
            t11 = (T) m.f66793a;
        }
        return q(t10, t11);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [rk.c] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, qk.w] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, qk.d] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00da -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ec -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:38:0x00b5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // qk.p, qk.c
    public java.lang.Object collect(qk.d<? super T> r11, rj.c<?> r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(qk.d, rj.c):java.lang.Object");
    }

    @Override // qk.k
    public void g() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // qk.l, qk.u
    public T getValue() {
        d0 d0Var = m.f66793a;
        T t10 = (T) f63145g.get(this);
        if (t10 == d0Var) {
            return null;
        }
        return t10;
    }

    @Override // rk.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public w f() {
        return new w();
    }

    @Override // rk.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public w[] j(int i10) {
        return new w[i10];
    }

    @Override // qk.l
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) m.f66793a;
        }
        q(null, t10);
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override // rk.j
    public c<T> b(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return v.d(this, dVar, i10, bufferOverflow);
    }

    @Override // qk.k, qk.d
    public Object emit(T t10, rj.c<? super r> cVar) {
        setValue(t10);
        return r.f64562a;
    }

    @Override // qk.k
    public boolean h(T t10) {
        setValue(t10);
        return true;
    }
}
