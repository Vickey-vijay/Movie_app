package io.bidmachine.rendering.internal.animation;

import android.view.View;
import android.view.ViewGroup;
import bk.p;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.util.ViewUtilsKt;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements io.bidmachine.rendering.internal.animation.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f60087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.h f60088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f60089c;

    public static final class a extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.c f60092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f60093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f60094e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rj.c cVar, io.bidmachine.rendering.internal.c cVar2, i iVar, boolean z10) {
            super(2, cVar);
            this.f60092c = cVar2;
            this.f60093d = iVar;
            this.f60094e = z10;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            a aVar = new a(cVar, this.f60092c, this.f60093d, this.f60094e);
            aVar.f60091b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60090a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            View viewK = this.f60092c.k();
            if (viewK != null) {
                this.f60093d.a(viewK, io.bidmachine.rendering.internal.animation.d.a(this.f60092c.h(), this.f60094e));
            }
            return r.f64562a;
        }
    }

    public static final class b extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.d f60097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f60098d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(rj.c cVar, io.bidmachine.rendering.internal.d dVar, i iVar) {
            super(2, cVar);
            this.f60097c = dVar;
            this.f60098d = iVar;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            b bVar = new b(cVar, this.f60097c, this.f60098d);
            bVar.f60096b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60095a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ViewGroup viewGroupC = this.f60097c.c();
            if (viewGroupC != null) {
                this.f60098d.a(viewGroupC, io.bidmachine.rendering.internal.animation.d.a(this.f60097c.b()));
            }
            return r.f64562a;
        }
    }

    public static final class c extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f60101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f60102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.animation.a f60103e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(rj.c cVar, i iVar, View view, io.bidmachine.rendering.internal.animation.a aVar) {
            super(2, cVar);
            this.f60101c = iVar;
            this.f60102d = view;
            this.f60103e = aVar;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            c cVar2 = new c(cVar, this.f60101c, this.f60102d, this.f60103e);
            cVar2.f60100b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60099a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f60101c.f60089c.put(tj.a.d(this.f60102d.getId()), this.f60103e);
            return r.f64562a;
        }
    }

    public static final class d extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.c f60106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f60107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f60108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Runnable f60109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Runnable f60110g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(rj.c cVar, io.bidmachine.rendering.internal.c cVar2, i iVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2) {
            super(2, cVar);
            this.f60106c = cVar2;
            this.f60107d = iVar;
            this.f60108e = animationEventType;
            this.f60109f = runnable;
            this.f60110g = runnable2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            d dVar = new d(cVar, this.f60106c, this.f60107d, this.f60108e, this.f60109f, this.f60110g);
            dVar.f60105b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60104a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            View viewK = this.f60106c.k();
            if (viewK != null) {
                this.f60107d.a(viewK, this.f60108e, this.f60106c.j(), this.f60109f, this.f60110g);
            }
            return r.f64562a;
        }
    }

    public static final class e extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.d f60113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f60114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f60115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Runnable f60116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Runnable f60117g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(rj.c cVar, io.bidmachine.rendering.internal.d dVar, i iVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2) {
            super(2, cVar);
            this.f60113c = dVar;
            this.f60114d = iVar;
            this.f60115e = animationEventType;
            this.f60116f = runnable;
            this.f60117g = runnable2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            e eVar = new e(cVar, this.f60113c, this.f60114d, this.f60115e, this.f60116f, this.f60117g);
            eVar.f60112b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60111a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ViewGroup viewGroupC = this.f60113c.c();
            if (viewGroupC != null) {
                this.f60114d.a(viewGroupC, this.f60115e, true, this.f60116f, this.f60117g);
            }
            return r.f64562a;
        }
    }

    public static final class f extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f60120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f60121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Runnable f60122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Runnable f60123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f60124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f60125h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(rj.c cVar, i iVar, View view, Runnable runnable, Runnable runnable2, boolean z10, AnimationEventType animationEventType) {
            super(2, cVar);
            this.f60120c = iVar;
            this.f60121d = view;
            this.f60122e = runnable;
            this.f60123f = runnable2;
            this.f60124g = z10;
            this.f60125h = animationEventType;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            f fVar = new f(cVar, this.f60120c, this.f60121d, this.f60122e, this.f60123f, this.f60124g, this.f60125h);
            fVar.f60119b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            io.bidmachine.rendering.internal.animation.a aVar;
            Object objF = sj.a.f();
            int i10 = this.f60118a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                io.bidmachine.rendering.internal.animation.a aVar2 = (io.bidmachine.rendering.internal.animation.a) this.f60120c.f60089c.get(tj.a.d(this.f60121d.getId()));
                if (aVar2 == null) {
                    Runnable runnable = this.f60122e;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = this.f60123f;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                } else {
                    if (this.f60124g) {
                        View view = this.f60121d;
                        this.f60119b = aVar2;
                        this.f60118a = 1;
                        if (ViewUtilsKt.awaitLayout(view, this) == objF) {
                            return objF;
                        }
                    }
                    aVar = aVar2;
                }
                return r.f64562a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (io.bidmachine.rendering.internal.animation.a) this.f60119b;
            kotlin.c.b(obj);
            aVar.a(this.f60121d, this.f60125h);
            aVar.a(this.f60121d, this.f60125h, this.f60122e, this.f60123f);
            return r.f64562a;
        }
    }

    public static final class g extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.c f60128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f60129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f60130e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(rj.c cVar, io.bidmachine.rendering.internal.c cVar2, i iVar, AnimationEventType animationEventType) {
            super(2, cVar);
            this.f60128c = cVar2;
            this.f60129d = iVar;
            this.f60130e = animationEventType;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            g gVar = new g(cVar, this.f60128c, this.f60129d, this.f60130e);
            gVar.f60127b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60126a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            View viewK = this.f60128c.k();
            if (viewK != null) {
                this.f60129d.a(viewK, this.f60130e, this.f60128c.j());
            }
            return r.f64562a;
        }
    }

    public static final class h extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.d f60133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f60134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f60135e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(rj.c cVar, io.bidmachine.rendering.internal.d dVar, i iVar, AnimationEventType animationEventType) {
            super(2, cVar);
            this.f60133c = dVar;
            this.f60134d = iVar;
            this.f60135e = animationEventType;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            h hVar = new h(cVar, this.f60133c, this.f60134d, this.f60135e);
            hVar.f60132b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60131a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ViewGroup viewGroupC = this.f60133c.c();
            if (viewGroupC != null) {
                this.f60134d.a(viewGroupC, this.f60135e, true);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.animation.i$i, reason: collision with other inner class name */
    public static final class C0522i extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f60138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f60139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f60140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f60141f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0522i(rj.c cVar, i iVar, View view, boolean z10, AnimationEventType animationEventType) {
            super(2, cVar);
            this.f60138c = iVar;
            this.f60139d = view;
            this.f60140e = z10;
            this.f60141f = animationEventType;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((C0522i) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            C0522i c0522i = new C0522i(cVar, this.f60138c, this.f60139d, this.f60140e, this.f60141f);
            c0522i.f60137b = obj;
            return c0522i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            io.bidmachine.rendering.internal.animation.a aVar;
            Object objF = sj.a.f();
            int i10 = this.f60136a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                io.bidmachine.rendering.internal.animation.a aVar2 = (io.bidmachine.rendering.internal.animation.a) this.f60138c.f60089c.get(tj.a.d(this.f60139d.getId()));
                if (aVar2 != null) {
                    if (this.f60140e) {
                        View view = this.f60139d;
                        this.f60137b = aVar2;
                        this.f60136a = 1;
                        if (ViewUtilsKt.awaitLayout(view, this) == objF) {
                            return objF;
                        }
                    }
                    aVar = aVar2;
                }
                return r.f64562a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (io.bidmachine.rendering.internal.animation.a) this.f60137b;
            kotlin.c.b(obj);
            aVar.a(this.f60139d, this.f60141f);
            return r.f64562a;
        }
    }

    public static final class j extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.c f60144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f60145d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(rj.c cVar, io.bidmachine.rendering.internal.c cVar2, i iVar) {
            super(2, cVar);
            this.f60144c = cVar2;
            this.f60145d = iVar;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((j) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            j jVar = new j(cVar, this.f60144c, this.f60145d);
            jVar.f60143b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60142a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            View viewK = this.f60144c.k();
            if (viewK != null) {
                this.f60145d.a(viewK);
            }
            return r.f64562a;
        }
    }

    public static final class k extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.d f60148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f60149d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(rj.c cVar, io.bidmachine.rendering.internal.d dVar, i iVar) {
            super(2, cVar);
            this.f60148c = dVar;
            this.f60149d = iVar;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((k) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            k kVar = new k(cVar, this.f60148c, this.f60149d);
            kVar.f60147b = obj;
            return kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60146a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ViewGroup viewGroupC = this.f60148c.c();
            if (viewGroupC != null) {
                this.f60149d.a(viewGroupC);
            }
            return r.f64562a;
        }
    }

    public static final class l extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f60152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f60153d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(rj.c cVar, i iVar, View view) {
            super(2, cVar);
            this.f60152c = iVar;
            this.f60153d = view;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((l) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            l lVar = new l(cVar, this.f60152c, this.f60153d);
            lVar.f60151b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60150a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            io.bidmachine.rendering.internal.animation.a aVar = (io.bidmachine.rendering.internal.animation.a) this.f60152c.f60089c.remove(tj.a.d(this.f60153d.getId()));
            if (aVar != null) {
                aVar.a();
            }
            return r.f64562a;
        }
    }

    public static final class m extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f60156c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(rj.c cVar, i iVar) {
            super(2, cVar);
            this.f60156c = iVar;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((m) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            m mVar = new m(cVar, this.f60156c);
            mVar.f60155b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60154a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            Iterator it = this.f60156c.f60089c.entrySet().iterator();
            while (it.hasNext()) {
                ((io.bidmachine.rendering.internal.animation.a) ((Map.Entry) it.next()).getValue()).a();
            }
            this.f60156c.f60089c.clear();
            return r.f64562a;
        }
    }

    public i(l0 l0Var, io.bidmachine.rendering.internal.h hVar) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(hVar, "coroutineDispatchers");
        this.f60087a = l0Var;
        this.f60088b = hVar;
        this.f60089c = new ConcurrentHashMap();
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void b(io.bidmachine.rendering.internal.d dVar) {
        ck.p.j(dVar, "adPhase");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new b(null, dVar, this), 2, null);
    }

    public void a(View view, io.bidmachine.rendering.internal.animation.a aVar) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(aVar, "animation");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new c(null, this, view, aVar), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c cVar, boolean z10) {
        ck.p.j(cVar, "adElement");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new a(null, cVar, this, z10), 2, null);
    }

    public void a(View view, AnimationEventType animationEventType, boolean z10, Runnable runnable, Runnable runnable2) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(animationEventType, "eventType");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new f(null, this, view, runnable, runnable2, z10, animationEventType), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2) {
        ck.p.j(cVar, "adElement");
        ck.p.j(animationEventType, "eventType");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new d(null, cVar, this, animationEventType, runnable, runnable2), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.d dVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2) {
        ck.p.j(dVar, "adPhase");
        ck.p.j(animationEventType, "eventType");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new e(null, dVar, this, animationEventType, runnable, runnable2), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public boolean a(int i10) {
        io.bidmachine.rendering.internal.animation.a aVar = (io.bidmachine.rendering.internal.animation.a) this.f60089c.get(Integer.valueOf(i10));
        return aVar != null && aVar.b();
    }

    public void a(View view, AnimationEventType animationEventType, boolean z10) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(animationEventType, "eventType");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new C0522i(null, this, view, z10, animationEventType), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType) {
        ck.p.j(cVar, "adElement");
        ck.p.j(animationEventType, "eventType");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new g(null, cVar, this, animationEventType), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.d dVar, AnimationEventType animationEventType) {
        ck.p.j(dVar, "adPhase");
        ck.p.j(animationEventType, "eventType");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new h(null, dVar, this, animationEventType), 2, null);
    }

    public void a(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        nk.j.d(this.f60087a, this.f60088b.d(), null, new l(null, this, view), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c cVar) {
        ck.p.j(cVar, "adElement");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new j(null, cVar, this), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.d dVar) {
        ck.p.j(dVar, "adPhase");
        nk.j.d(this.f60087a, this.f60088b.d(), null, new k(null, dVar, this), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a() {
        nk.j.d(this.f60087a, this.f60088b.d(), null, new m(null, this), 2, null);
    }
}
