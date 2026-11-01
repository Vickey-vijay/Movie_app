package io.bidmachine.rendering.internal.controller;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import com.ironsource.C3605n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.internal.v;
import io.bidmachine.rendering.internal.w;
import io.bidmachine.rendering.internal.x;
import io.bidmachine.rendering.internal.y;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.BrokenCreativeDetectorParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MethodParams;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.NetworkRequest;
import io.bidmachine.rendering.utils.Tag;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.rendering.utils.VisibilityChanger;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import lk.a0;
import nk.l0;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements io.bidmachine.rendering.internal.controller.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f60197s = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tag f60198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.state.c f60199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.controller.f f60200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.animation.b f60201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f60202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.repository.a f60203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.d f60204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.bidmachine.rendering.internal.controller.g f60205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.event.f f60206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.detector.brokencreative.b f60207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final mj.g f60208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final mj.g f60209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TaskManager f60210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f60211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f60212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f60213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f60214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final mj.g f60215r;

    public final class a extends b {
        public a() {
            super();
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            ck.p.j(aVar, "adForm");
            ck.p.j(error, "error");
            super.b(aVar, error);
            h.this.a(error);
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void c(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            ck.p.j(aVar, "adForm");
            ck.p.j(error, "error");
            super.c(aVar, error);
            h.this.a(error);
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar) {
            ck.p.j(aVar, "adForm");
            super.b(aVar);
            if (h.a(h.this, aVar, false, 2, (Object) null)) {
                if (!h.this.f60211n.isEmpty()) {
                    return;
                }
                h.this.r();
            } else {
                c(aVar, new Error("Failed to setup ad element (" + aVar + ')'));
            }
        }
    }

    public abstract class b implements io.bidmachine.rendering.internal.adform.c {
        public b() {
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void a(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            ck.p.j(aVar, "adForm");
            ck.p.j(error, "error");
            io.bidmachine.rendering.internal.o.a(h.this.f60198a, "AdsElement (" + aVar + ") - onAdFormFailToShow - " + error, new Object[0]);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            ck.p.j(aVar, "adForm");
            ck.p.j(error, "error");
            io.bidmachine.rendering.internal.o.a(h.this.f60198a, "AdsElement (" + aVar + ") - onAdFormExpired - " + error, new Object[0]);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void c(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            ck.p.j(aVar, "adForm");
            ck.p.j(error, "error");
            io.bidmachine.rendering.internal.o.a(h.this.f60198a, "AdsElement (" + aVar + ") - onAdFormFailToLoad - " + error, new Object[0]);
            h.this.f60211n.remove(aVar);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void a(io.bidmachine.rendering.internal.adform.a aVar) {
            ck.p.j(aVar, "adForm");
            io.bidmachine.rendering.internal.o.b(h.this.f60198a, "AdsElement (" + aVar + ") - onAdFormShown", new Object[0]);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar) {
            ck.p.j(aVar, "adForm");
            io.bidmachine.rendering.internal.o.b(h.this.f60198a, "AdsElement (" + aVar + ") - onAdFormLoaded", new Object[0]);
            h.this.f60211n.remove(aVar);
        }
    }

    public final class c implements io.bidmachine.rendering.internal.detector.brokencreative.b {
        public c() {
        }

        @Override // io.bidmachine.rendering.internal.detector.brokencreative.b
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            ck.p.j(brokenCreativeEvent, "brokenCreativeEvent");
            h.this.a(brokenCreativeEvent);
        }
    }

    public final class e extends b {
        public e() {
            super();
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            ck.p.j(aVar, "adForm");
            ck.p.j(error, "error");
            super.b(aVar, error);
            h hVar = h.this;
            hVar.a((io.bidmachine.rendering.internal.c) aVar, hVar.j());
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void c(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            ck.p.j(aVar, "adForm");
            ck.p.j(error, "error");
            super.c(aVar, error);
            h hVar = h.this;
            hVar.a((io.bidmachine.rendering.internal.c) aVar, hVar.j());
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar) {
            ck.p.j(aVar, "adForm");
            super.b(aVar);
            if (!h.this.a(aVar, true)) {
                c(aVar, new Error("Failed to setup ad element (" + aVar + ')'));
            }
            if (!h.this.f60211n.isEmpty()) {
                return;
            }
            h.this.r();
        }
    }

    public final class f implements io.bidmachine.rendering.internal.event.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f60220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f60221b;

        public static final class a implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f60222a;

            public a(Object obj) {
                this.f60222a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.g) this.f60222a).b();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class b implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f60223a;

            public b(Object obj) {
                this.f60223a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.g) this.f60223a).b();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class c implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f60224a;

            public c(Object obj) {
                this.f60224a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.g) this.f60224a).b();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class d implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f60225a;

            public d(Object obj) {
                this.f60225a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.g) this.f60225a).b();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class e extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60226a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60227b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60228c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60229d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60230e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60231f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ h f60232g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60233a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f60234b;

                public a(Object obj, h hVar) {
                    this.f60233a = obj;
                    this.f60234b = hVar;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    VisibilityChanger visibilityChanger = (VisibilityChanger) this.f60233a;
                    this.f60234b.a(visibilityChanger, false, (Runnable) new C0524f(visibilityChanger));
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(h hVar, String str, String str2, Class cls, String str3, rj.c cVar, h hVar2) {
                super(2, cVar);
                this.f60227b = hVar;
                this.f60228c = str;
                this.f60229d = str2;
                this.f60230e = cls;
                this.f60231f = str3;
                this.f60232g = hVar2;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((e) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new e(this.f60227b, this.f60228c, this.f60229d, this.f60230e, this.f60231f, cVar, this.f60232g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60226a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60227b.b(this.f60228c);
                if (objB == null) {
                    this.f60227b.a(this.f60229d, this.f60228c);
                } else if (!this.f60230e.isInstance(objB)) {
                    this.f60227b.a(this.f60229d, this.f60228c, this.f60231f);
                } else if (this.f60230e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f60232g));
                }
                return mj.r.f64562a;
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.h$f$f, reason: collision with other inner class name */
        public static final class C0524f implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ VisibilityChanger f60235a;

            public C0524f(VisibilityChanger visibilityChanger) {
                this.f60235a = visibilityChanger;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.f60235a.setVisibility(false);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class g extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60236a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60237b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60238c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60239d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60240e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60241f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f60242g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60243a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f60244b;

                public a(Object obj, boolean z10) {
                    this.f60243a = obj;
                    this.f60244b = z10;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((VisibilityChanger) this.f60243a).lockVisibility(this.f60244b);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(h hVar, String str, String str2, Class cls, String str3, rj.c cVar, boolean z10) {
                super(2, cVar);
                this.f60237b = hVar;
                this.f60238c = str;
                this.f60239d = str2;
                this.f60240e = cls;
                this.f60241f = str3;
                this.f60242g = z10;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((g) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new g(this.f60237b, this.f60238c, this.f60239d, this.f60240e, this.f60241f, cVar, this.f60242g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60236a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60237b.b(this.f60238c);
                if (objB == null) {
                    this.f60237b.a(this.f60239d, this.f60238c);
                } else if (!this.f60240e.isInstance(objB)) {
                    this.f60237b.a(this.f60239d, this.f60238c, this.f60241f);
                } else if (this.f60240e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f60242g));
                }
                return mj.r.f64562a;
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.h$f$h, reason: collision with other inner class name */
        public static final class C0525h extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60246b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60247c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60248d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60249e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60250f;

            /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.h$f$h$a */
            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60251a;

                public a(Object obj) {
                    this.f60251a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.q) this.f60251a).l();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0525h(h hVar, String str, String str2, Class cls, String str3, rj.c cVar) {
                super(2, cVar);
                this.f60246b = hVar;
                this.f60247c = str;
                this.f60248d = str2;
                this.f60249e = cls;
                this.f60250f = str3;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((C0525h) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new C0525h(this.f60246b, this.f60247c, this.f60248d, this.f60249e, this.f60250f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60245a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60246b.b(this.f60247c);
                if (objB == null) {
                    this.f60246b.a(this.f60248d, this.f60247c);
                } else if (!this.f60249e.isInstance(objB)) {
                    this.f60246b.a(this.f60248d, this.f60247c, this.f60250f);
                } else if (this.f60249e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return mj.r.f64562a;
            }
        }

        public static final class i implements io.bidmachine.rendering.internal.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f60252a;

            public i(h hVar) {
                this.f60252a = hVar;
            }

            public void a(boolean z10) {
                io.bidmachine.rendering.internal.controller.g gVarM = this.f60252a.m();
                if (gVarM != null) {
                    gVarM.c();
                }
            }

            @Override // io.bidmachine.rendering.internal.m, io.bidmachine.util.SafeExecutable, io.bidmachine.util.Executable
            @CallSuper
            public /* bridge */ /* synthetic */ void execute(Object obj) {
                super.execute(obj);
            }

            @Override // io.bidmachine.rendering.internal.m, io.bidmachine.util.SafeExecutable, io.bidmachine.util.Executable
            public /* bridge */ /* synthetic */ boolean executeSafely(Object obj) {
                return super.executeSafely(obj);
            }

            @Override // io.bidmachine.rendering.internal.m, io.bidmachine.util.SafeExecutable
            public /* bridge */ /* synthetic */ void onExecute(Object obj) {
                a(((Boolean) obj).booleanValue());
            }

            @Override // io.bidmachine.rendering.internal.m, io.bidmachine.util.SafeExecutable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }
        }

        public static final class j extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60253a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60254b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60255c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60256d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60257e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60258f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ long f60259g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ long f60260h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ float f60261i;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60262a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f60263b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f60264c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f60265d;

                public a(Object obj, long j10, long j11, float f10) {
                    this.f60262a = obj;
                    this.f60263b = j10;
                    this.f60264c = j11;
                    this.f60265d = f10;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.s) this.f60262a).a(this.f60263b, this.f60264c, this.f60265d);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(h hVar, String str, String str2, Class cls, String str3, rj.c cVar, long j10, long j11, float f10) {
                super(2, cVar);
                this.f60254b = hVar;
                this.f60255c = str;
                this.f60256d = str2;
                this.f60257e = cls;
                this.f60258f = str3;
                this.f60259g = j10;
                this.f60260h = j11;
                this.f60261i = f10;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((j) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new j(this.f60254b, this.f60255c, this.f60256d, this.f60257e, this.f60258f, cVar, this.f60259g, this.f60260h, this.f60261i);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60253a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60254b.b(this.f60255c);
                if (objB == null) {
                    this.f60254b.a(this.f60256d, this.f60255c);
                } else if (!this.f60257e.isInstance(objB)) {
                    this.f60254b.a(this.f60256d, this.f60255c, this.f60258f);
                } else if (this.f60257e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f60259g, this.f60260h, this.f60261i));
                }
                return mj.r.f64562a;
            }
        }

        public static final class k extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60266a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60267b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60268c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60269d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60270e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60271f;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60272a;

                public a(Object obj) {
                    this.f60272a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.t) this.f60272a).m();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(h hVar, String str, String str2, Class cls, String str3, rj.c cVar) {
                super(2, cVar);
                this.f60267b = hVar;
                this.f60268c = str;
                this.f60269d = str2;
                this.f60270e = cls;
                this.f60271f = str3;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((k) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new k(this.f60267b, this.f60268c, this.f60269d, this.f60270e, this.f60271f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60266a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60267b.b(this.f60268c);
                if (objB == null) {
                    this.f60267b.a(this.f60269d, this.f60268c);
                } else if (!this.f60270e.isInstance(objB)) {
                    this.f60267b.a(this.f60269d, this.f60268c, this.f60271f);
                } else if (this.f60270e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return mj.r.f64562a;
            }
        }

        public static final class l extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60273a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60274b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60275c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60276d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60277e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60278f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ long f60279g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60280a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f60281b;

                public a(Object obj, long j10) {
                    this.f60280a = obj;
                    this.f60281b = j10;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.v) this.f60280a).a(this.f60281b);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(h hVar, String str, String str2, Class cls, String str3, rj.c cVar, long j10) {
                super(2, cVar);
                this.f60274b = hVar;
                this.f60275c = str;
                this.f60276d = str2;
                this.f60277e = cls;
                this.f60278f = str3;
                this.f60279g = j10;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((l) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new l(this.f60274b, this.f60275c, this.f60276d, this.f60277e, this.f60278f, cVar, this.f60279g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60273a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60274b.b(this.f60275c);
                if (objB == null) {
                    this.f60274b.a(this.f60276d, this.f60275c);
                } else if (!this.f60277e.isInstance(objB)) {
                    this.f60274b.a(this.f60276d, this.f60275c, this.f60278f);
                } else if (this.f60277e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f60279g));
                }
                return mj.r.f64562a;
            }
        }

        public static final class m extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60282a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60283b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60284c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60285d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60286e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60287f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ h f60288g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60289a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f60290b;

                public a(Object obj, h hVar) {
                    this.f60289a = obj;
                    this.f60290b = hVar;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    VisibilityChanger visibilityChanger = (VisibilityChanger) this.f60289a;
                    this.f60290b.a(visibilityChanger, true, (Runnable) new n(visibilityChanger));
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(h hVar, String str, String str2, Class cls, String str3, rj.c cVar, h hVar2) {
                super(2, cVar);
                this.f60283b = hVar;
                this.f60284c = str;
                this.f60285d = str2;
                this.f60286e = cls;
                this.f60287f = str3;
                this.f60288g = hVar2;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((m) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new m(this.f60283b, this.f60284c, this.f60285d, this.f60286e, this.f60287f, cVar, this.f60288g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60282a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60283b.b(this.f60284c);
                if (objB == null) {
                    this.f60283b.a(this.f60285d, this.f60284c);
                } else if (!this.f60286e.isInstance(objB)) {
                    this.f60283b.a(this.f60285d, this.f60284c, this.f60287f);
                } else if (this.f60286e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f60288g));
                }
                return mj.r.f64562a;
            }
        }

        public static final class n implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ VisibilityChanger f60291a;

            public n(VisibilityChanger visibilityChanger) {
                this.f60291a = visibilityChanger;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.f60291a.setVisibility(true);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class o extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60293b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60294c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60295d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60296e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60297f;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60298a;

                public a(Object obj) {
                    this.f60298a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.c) this.f60298a).o();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(h hVar, String str, String str2, Class cls, String str3, rj.c cVar) {
                super(2, cVar);
                this.f60293b = hVar;
                this.f60294c = str;
                this.f60295d = str2;
                this.f60296e = cls;
                this.f60297f = str3;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((o) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new o(this.f60293b, this.f60294c, this.f60295d, this.f60296e, this.f60297f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60292a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60293b.b(this.f60294c);
                if (objB == null) {
                    this.f60293b.a(this.f60295d, this.f60294c);
                } else if (!this.f60296e.isInstance(objB)) {
                    this.f60293b.a(this.f60295d, this.f60294c, this.f60297f);
                } else if (this.f60296e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return mj.r.f64562a;
            }
        }

        public static final class p implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f60299a;

            public p(Object obj) {
                this.f60299a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((w) this.f60299a).e();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class q implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f60300a;

            public q(Object obj) {
                this.f60300a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((w) this.f60300a).e();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class r implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f60301a;

            public r(Object obj) {
                this.f60301a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((w) this.f60301a).e();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class s implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f60302a;

            public s(Object obj) {
                this.f60302a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((w) this.f60302a).e();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class t extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60303a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60304b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60305c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60306d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60307e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60308f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f60309g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60310a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f60311b;

                public a(Object obj, String str) {
                    this.f60310a = obj;
                    this.f60311b = str;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((x) this.f60310a).a(this.f60311b);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(h hVar, String str, String str2, Class cls, String str3, rj.c cVar, String str4) {
                super(2, cVar);
                this.f60304b = hVar;
                this.f60305c = str;
                this.f60306d = str2;
                this.f60307e = cls;
                this.f60308f = str3;
                this.f60309g = str4;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((t) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new t(this.f60304b, this.f60305c, this.f60306d, this.f60307e, this.f60308f, cVar, this.f60309g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60303a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60304b.b(this.f60305c);
                if (objB == null) {
                    this.f60304b.a(this.f60306d, this.f60305c);
                } else if (!this.f60307e.isInstance(objB)) {
                    this.f60304b.a(this.f60306d, this.f60305c, this.f60308f);
                } else if (this.f60307e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f60309g));
                }
                return mj.r.f64562a;
            }
        }

        public static final class u extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60312a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60313b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60314c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60315d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60316e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60317f;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60318a;

                public a(Object obj) {
                    this.f60318a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((VisibilityChanger) this.f60318a).unlockVisibility();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u(h hVar, String str, String str2, Class cls, String str3, rj.c cVar) {
                super(2, cVar);
                this.f60313b = hVar;
                this.f60314c = str;
                this.f60315d = str2;
                this.f60316e = cls;
                this.f60317f = str3;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((u) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new u(this.f60313b, this.f60314c, this.f60315d, this.f60316e, this.f60317f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60312a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60313b.b(this.f60314c);
                if (objB == null) {
                    this.f60313b.a(this.f60315d, this.f60314c);
                } else if (!this.f60316e.isInstance(objB)) {
                    this.f60313b.a(this.f60315d, this.f60314c, this.f60317f);
                } else if (this.f60316e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return mj.r.f64562a;
            }
        }

        public static final class v extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60319a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f60320b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f60321c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f60322d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f60323e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f60324f;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f60325a;

                public a(Object obj) {
                    this.f60325a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.q) this.f60325a).i();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v(h hVar, String str, String str2, Class cls, String str3, rj.c cVar) {
                super(2, cVar);
                this.f60320b = hVar;
                this.f60321c = str;
                this.f60322d = str2;
                this.f60323e = cls;
                this.f60324f = str3;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((v) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return new v(this.f60320b, this.f60321c, this.f60322d, this.f60323e, this.f60324f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60319a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f60320b.b(this.f60321c);
                if (objB == null) {
                    this.f60320b.a(this.f60322d, this.f60321c);
                } else if (!this.f60323e.isInstance(objB)) {
                    this.f60320b.a(this.f60322d, this.f60321c, this.f60324f);
                } else if (this.f60323e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return mj.r.f64562a;
            }
        }

        public f(h hVar, Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            this.f60221b = hVar;
            Context applicationContext = context.getApplicationContext();
            ck.p.i(applicationContext, "context.applicationContext");
            this.f60220a = applicationContext;
        }

        private final void l(String str) {
            io.bidmachine.rendering.internal.controller.g gVarM = this.f60221b.m();
            if (gVarM != null) {
                gVarM.a();
            }
            UrlHandler.openUrl(this.f60220a, str, new i(this.f60221b));
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str, boolean z10) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new g(hVar, str, "lockVisibility", VisibilityChanger.class, "VisibilityChanger", null, z10), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void b() {
            h hVar = this.f60221b;
            for (io.bidmachine.rendering.internal.c cVar : hVar.i()) {
                if (io.bidmachine.rendering.internal.g.class.isInstance(cVar)) {
                    UiUtils.onUiThread(new a(cVar));
                }
            }
            for (io.bidmachine.rendering.internal.c cVar2 : hVar.j()) {
                if (io.bidmachine.rendering.internal.g.class.isInstance(cVar2)) {
                    UiUtils.onUiThread(new b(cVar2));
                }
            }
            for (io.bidmachine.rendering.internal.p pVar : hVar.l()) {
                if (io.bidmachine.rendering.internal.g.class.isInstance(pVar)) {
                    UiUtils.onUiThread(new c(pVar));
                }
            }
            y yVarK = hVar.k();
            if (io.bidmachine.rendering.internal.g.class.isInstance(yVarK)) {
                UiUtils.onUiThread(new d(yVarK));
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void c(String str) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new e(hVar, str, "hide", VisibilityChanger.class, "VisibilityChanger", null, hVar), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void d(String str) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new C0525h(hVar, str, CampaignEx.JSON_NATIVE_VIDEO_MUTE, io.bidmachine.rendering.internal.q.class, "Mutable", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void e(String str) {
            ck.p.j(str, "url");
            l(str);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void f(String str) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new k(hVar, str, "repeat", io.bidmachine.rendering.internal.t.class, "Repeatable", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void g(String str) {
            ck.p.j(str, "url");
            io.bidmachine.rendering.internal.controller.g gVarM = this.f60221b.m();
            if (gVarM != null) {
                gVarM.d();
            }
            l(str);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void h(String str) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new u(hVar, str, "unlockVisibility", VisibilityChanger.class, "VisibilityChanger", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void i(String str) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new o(hVar, str, "simulateClick", io.bidmachine.rendering.internal.c.class, "AdElement", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void j(String str) {
            ck.p.j(str, "url");
            new NetworkRequest.Builder(str, NetworkRequest.Method.Get).setUserAgent(Rendering.getUserAgent()).send();
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void k(String str) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new v(hVar, str, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, io.bidmachine.rendering.internal.q.class, "Mutable", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(PrivacySheetParams privacySheetParams) {
            ck.p.j(privacySheetParams, "privacySheetParams");
            io.bidmachine.rendering.internal.controller.g gVarM = this.f60221b.m();
            if (gVarM != null) {
                gVarM.a(privacySheetParams);
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void b(String str) {
            ck.p.j(str, "stateGroups");
            this.f60221b.n().a(str);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void e() {
            h hVar = this.f60221b;
            for (io.bidmachine.rendering.internal.c cVar : hVar.i()) {
                if (w.class.isInstance(cVar)) {
                    UiUtils.onUiThread(new p(cVar));
                }
            }
            for (io.bidmachine.rendering.internal.c cVar2 : hVar.j()) {
                if (w.class.isInstance(cVar2)) {
                    UiUtils.onUiThread(new q(cVar2));
                }
            }
            for (io.bidmachine.rendering.internal.p pVar : hVar.l()) {
                if (w.class.isInstance(pVar)) {
                    UiUtils.onUiThread(new r(pVar));
                }
            }
            y yVarK = hVar.k();
            if (w.class.isInstance(yVarK)) {
                UiUtils.onUiThread(new s(yVarK));
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str, long j10, long j11, float f10) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new j(hVar, str, "progress", io.bidmachine.rendering.internal.s.class, VastTagName.PROGRESS, null, j10, j11, f10), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str, long j10) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new l(hVar, str, "schedule", io.bidmachine.rendering.internal.v.class, "Schedule", null, j10), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new m(hVar, str, C3605n2.f30216v, VisibilityChanger.class, "VisibilityChanger", null, hVar), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str, String str2) {
            ck.p.j(str, "targetElementName");
            h hVar = this.f60221b;
            nk.j.d(hVar.h(hVar), hVar.g(hVar).b(), null, new t(hVar, str, "start", x.class, "Startable", null, str2), 2, null);
        }
    }

    public final class g extends y {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f60326c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h hVar, io.bidmachine.rendering.internal.event.b bVar) {
            super(bVar);
            ck.p.j(bVar, "eventCallback");
            this.f60326c = hVar;
        }

        @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.g
        public void b() {
            io.bidmachine.rendering.internal.controller.g gVarM = this.f60326c.m();
            if (gVarM != null) {
                gVarM.b();
            }
        }

        @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.w
        public void e() {
            io.bidmachine.rendering.internal.controller.g gVarM = this.f60326c.m();
            if (gVarM != null) {
                gVarM.e();
            }
        }

        @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.q
        public void i() {
            q().c();
        }

        @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.q
        public void l() {
            q().f();
        }

        @Override // io.bidmachine.rendering.internal.y
        public String r() {
            return q().g();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.h$h, reason: collision with other inner class name */
    public static final class C0526h extends Lambda implements bk.a {
        public C0526h() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.adform.b invoke() {
            Context context = h.this.f60202e;
            ck.p.i(context, "applicationContext");
            return new io.bidmachine.rendering.internal.adform.b(context, h.this.f60203f);
        }
    }

    public static final class i extends Lambda implements bk.a {
        public i() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            ViewGroup viewGroupC = h.this.e().c();
            if (viewGroupC != null) {
                return Integer.valueOf(viewGroupC.getId());
            }
            return null;
        }
    }

    public static final class j extends Lambda implements bk.a {
        public j() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            h hVar = h.this;
            return new g(hVar, hVar.a("system"));
        }
    }

    public static final class k extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60330a;

        public k(rj.c cVar) {
            super(2, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((k) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return h.this.new k(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60330a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (h.this.o()) {
                h.this.p();
                h.this.q();
            }
            return mj.r.f64562a;
        }
    }

    public static final class l implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f60332a;

        public l(Object obj) {
            this.f60332a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f60332a).pause();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class m implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f60333a;

        public m(Object obj) {
            this.f60333a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f60333a).pause();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class n implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f60334a;

        public n(Object obj) {
            this.f60334a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f60334a).pause();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class o implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f60335a;

        public o(Object obj) {
            this.f60335a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f60335a).pause();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class p implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f60336a;

        public p(Object obj) {
            this.f60336a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f60336a).n();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class q implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f60337a;

        public q(Object obj) {
            this.f60337a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f60337a).n();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class r implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f60338a;

        public r(Object obj) {
            this.f60338a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f60338a).n();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class s implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f60339a;

        public s(Object obj) {
            this.f60339a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f60339a).n();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class t extends Lambda implements bk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdPhaseParams f60340a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(AdPhaseParams adPhaseParams) {
            super(0);
            this.f60340a = adPhaseParams;
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.groups.a invoke() {
            return new io.bidmachine.rendering.internal.groups.a(this.f60340a.getStateGroups());
        }
    }

    public h(Context context, AdPhaseParams adPhaseParams, Tag tag, io.bidmachine.rendering.internal.state.c cVar, io.bidmachine.rendering.internal.controller.f fVar, io.bidmachine.rendering.internal.animation.b bVar) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(adPhaseParams, "adPhaseParams");
        ck.p.j(tag, "tag");
        ck.p.j(cVar, "adState");
        ck.p.j(fVar, "adPhaseControllerListener");
        ck.p.j(bVar, "adAnimationController");
        this.f60198a = tag;
        this.f60199b = cVar;
        this.f60200c = fVar;
        this.f60201d = bVar;
        Context applicationContext = context.getApplicationContext();
        this.f60202e = applicationContext;
        ck.p.i(applicationContext, "applicationContext");
        io.bidmachine.rendering.internal.repository.b bVar2 = new io.bidmachine.rendering.internal.repository.b(applicationContext, h(this), g(this));
        this.f60203f = bVar2;
        ck.p.i(applicationContext, "applicationContext");
        this.f60204g = new io.bidmachine.rendering.internal.d(applicationContext, bVar2, adPhaseParams);
        this.f60206i = new f(this, context);
        this.f60207j = new c();
        this.f60208k = kotlin.b.a(new t(adPhaseParams));
        this.f60209l = kotlin.b.a(new j());
        this.f60210m = new CoroutineTaskManager(h(this).getCoroutineContext().plus(g(this).c()));
        this.f60211n = new ConcurrentHashMap();
        this.f60212o = new CopyOnWriteArrayList();
        this.f60213p = new CopyOnWriteArrayList();
        this.f60214q = new CopyOnWriteArrayList();
        this.f60215r = kotlin.b.a(new C0526h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y k() {
        return (y) this.f60209l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.rendering.internal.groups.b n() {
        return (io.bidmachine.rendering.internal.groups.b) this.f60208k.getValue();
    }

    public final void g() {
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Destroy AdPhase", new Object[0]);
        this.f60201d.a(e());
        final io.bidmachine.rendering.internal.d dVarE = e();
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.n() { // from class: zh.o
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                dVarE.a();
            }
        });
    }

    public final io.bidmachine.rendering.internal.adform.b h() {
        return (io.bidmachine.rendering.internal.adform.b) this.f60215r.getValue();
    }

    public final List i() {
        return this.f60212o;
    }

    public final List j() {
        return this.f60213p;
    }

    public final List l() {
        return this.f60214q;
    }

    public io.bidmachine.rendering.internal.controller.g m() {
        return this.f60205h;
    }

    public final boolean o() {
        Error error;
        List<AdElementParams> adsList = e().b().getAdsList();
        if (adsList.isEmpty()) {
            error = new Error("AdPhase does not contain any ads part");
        } else {
            if (b()) {
                r();
                return false;
            }
            if (!this.f60199b.c()) {
                return false;
            }
            this.f60212o.addAll(a(adsList, new a()));
            if (!this.f60212o.isEmpty()) {
                return true;
            }
            error = new Error("No supported ads found for the given parameters");
        }
        a(error);
        return false;
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void onShown() {
        if (this.f60199b.i()) {
            io.bidmachine.rendering.internal.o.b(this.f60198a, "AdPhase - onShown", new Object[0]);
            b(this.f60212o, true);
            b(this.f60213p, true);
            k().q().m();
        }
    }

    public final void p() {
        this.f60213p.addAll(a(e().b().getControlsList(), new e()));
    }

    public final void q() {
        List<MethodParams> methodParamsList = e().b().getMethodParamsList();
        List list = this.f60214q;
        ArrayList arrayList = new ArrayList(nj.t.v(methodParamsList, 10));
        for (MethodParams methodParams : methodParamsList) {
            arrayList.add(new io.bidmachine.rendering.internal.p(methodParams, a(methodParams.getName())));
        }
        list.addAll(arrayList);
    }

    public final void r() {
        if (this.f60199b.a(true)) {
            this.f60200c.a(this);
        }
    }

    public String toString() {
        String string = this.f60198a.toString();
        ck.p.i(string, "tag.toString()");
        return string;
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.rendering.internal.h g(h hVar) {
        return hVar.f60199b.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 h(h hVar) {
        return hVar.f60199b.o();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void c() {
        io.bidmachine.rendering.internal.o.b(this.f60198a, "AdPhase - load", new Object[0]);
        nk.j.d(h(this), g(this).c(), null, new k(null), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void d() {
        io.bidmachine.rendering.internal.o.b(this.f60198a, "AdPhase - performShow", new Object[0]);
        for (io.bidmachine.rendering.internal.c cVar : i()) {
            if (v.class.isInstance(cVar)) {
                UiUtils.onUiThread(new p(cVar));
            }
        }
        for (io.bidmachine.rendering.internal.c cVar2 : j()) {
            if (v.class.isInstance(cVar2)) {
                UiUtils.onUiThread(new q(cVar2));
            }
        }
        for (io.bidmachine.rendering.internal.p pVar : l()) {
            if (v.class.isInstance(pVar)) {
                UiUtils.onUiThread(new r(pVar));
            }
        }
        y yVarK = k();
        if (v.class.isInstance(yVarK)) {
            UiUtils.onUiThread(new s(yVarK));
        }
        if (this.f60199b.m()) {
            b(this.f60212o, false);
            b(this.f60213p, false);
        }
        this.f60199b.l();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public io.bidmachine.rendering.internal.d e() {
        return this.f60204g;
    }

    public final void f() {
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Cancel loading AdElements", new Object[0]);
        Iterator it = this.f60211n.entrySet().iterator();
        while (it.hasNext()) {
            this.f60210m.cancel((Runnable) ((Map.Entry) it.next()).getValue());
        }
        this.f60211n.clear();
    }

    public final void b(List list) {
        ck.p.j(list, "items");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Destroy TargetObjects", new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((y) it.next(), list);
        }
        list.clear();
    }

    public final Object b(String str) {
        Object next;
        Object next2;
        ck.p.j(str, "name");
        if (a0.n0(str)) {
            return null;
        }
        Iterator it = this.f60212o.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!lk.x.E(((io.bidmachine.rendering.internal.c) next).h().getName(), str, true));
        Object next3 = (io.bidmachine.rendering.internal.c) next;
        if (next3 == null) {
            Iterator it2 = this.f60213p.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!lk.x.E(((io.bidmachine.rendering.internal.c) next2).h().getName(), str, true));
            next3 = (io.bidmachine.rendering.internal.c) next2;
            if (next3 == null) {
                Iterator it3 = this.f60214q.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!lk.x.E(((io.bidmachine.rendering.internal.p) next3).s().getName(), str, true));
            }
        }
        if (next3 != null) {
            return next3;
        }
        if (ck.p.e(k().r(), str)) {
            return k();
        }
        return null;
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public boolean b() {
        return this.f60199b.b();
    }

    public final void b(final io.bidmachine.rendering.internal.c cVar, boolean z10) {
        ck.p.j(cVar, "item");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Show AdElement - " + cVar.h().getName() + ", animated: " + z10, new Object[0]);
        io.bidmachine.rendering.internal.n nVar = new io.bidmachine.rendering.internal.n() { // from class: zh.n
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.controller.h.b(cVar);
            }
        };
        if (z10) {
            io.bidmachine.rendering.internal.animation.b.a.a(this.f60201d, cVar, AnimationEventType.Appear, nVar, null, 8, null);
        } else {
            nVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(VisibilityChanger visibilityChanger, boolean z10, Runnable runnable) {
        if (!(visibilityChanger instanceof io.bidmachine.rendering.internal.c) || !this.f60199b.d() || this.f60199b.h()) {
            runnable.run();
            return;
        }
        AnimationEventType animationEventType = z10 ? AnimationEventType.Appear : AnimationEventType.Disappear;
        Runnable runnable2 = z10 ? runnable : null;
        if (z10) {
            runnable = null;
        }
        this.f60201d.a((io.bidmachine.rendering.internal.c) visibilityChanger, animationEventType, runnable2, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(io.bidmachine.rendering.internal.c cVar) {
        ck.p.j(cVar, "$item");
        cVar.d();
    }

    private final io.bidmachine.rendering.internal.detector.brokencreative.a a(AdElementParams adElementParams) {
        BrokenCreativeDetectorParams brokenCreativeDetectorParams = adElementParams.getBrokenCreativeDetectorParams();
        if (brokenCreativeDetectorParams != null) {
            return new io.bidmachine.rendering.internal.detector.brokencreative.a(e().b().getSequence(), adElementParams.getName(), brokenCreativeDetectorParams, this.f60207j);
        }
        return null;
    }

    public final void b(List list, boolean z10) {
        ck.p.j(list, "items");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Show AdElements, animated: " + z10, new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((io.bidmachine.rendering.internal.c) it.next(), z10);
        }
    }

    public final io.bidmachine.rendering.internal.adform.a a(AdElementParams adElementParams, io.bidmachine.rendering.internal.adform.c cVar) {
        ck.p.j(adElementParams, "elementParams");
        ck.p.j(cVar, "adFormListener");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Create AdElement - " + adElementParams.getName(), new Object[0]);
        return h().a(adElementParams, cVar, a(adElementParams.getName()), a(adElementParams));
    }

    public final List a(List list, io.bidmachine.rendering.internal.adform.c cVar) {
        ck.p.j(list, "elementsParams");
        ck.p.j(cVar, "adFormListener");
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((AdElementParams) it.next(), cVar));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((io.bidmachine.rendering.internal.adform.a) it2.next(), cVar);
        }
        return arrayList;
    }

    public final io.bidmachine.rendering.internal.event.b a(String str) {
        ck.p.j(str, "sourceName");
        return new io.bidmachine.rendering.internal.event.c(str, new io.bidmachine.rendering.internal.groups.c(n()), new io.bidmachine.rendering.internal.animation.c(this.f60201d, new i()), new io.bidmachine.rendering.internal.event.a(this.f60206i, str), h(this), g(this), e().b().getEventTypeMap(str));
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void a() {
        io.bidmachine.rendering.internal.o.b(this.f60198a, "AdPhase - destroy", new Object[0]);
        f();
        a(this.f60212o);
        a(this.f60213p);
        g();
        b(this.f60214q);
        a(this, k(), (List) null, 2, (Object) null);
        a((io.bidmachine.rendering.internal.controller.g) null);
        this.f60199b.a();
    }

    public final void a(final io.bidmachine.rendering.internal.c cVar, List list) {
        ck.p.j(cVar, "item");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Destroy AdElement - " + cVar.h().getName(), new Object[0]);
        this.f60201d.a(cVar);
        if (list != null) {
            list.remove(cVar);
        }
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.n() { // from class: zh.m
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                cVar.a();
            }
        });
    }

    public final void a(List list) {
        ck.p.j(list, "item");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Destroy AdElements", new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((io.bidmachine.rendering.internal.c) it.next(), list);
        }
        list.clear();
    }

    public final void a(final y yVar, List list) {
        ck.p.j(yVar, "item");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Destroy TargetObject - " + yVar.r(), new Object[0]);
        if (list != null) {
            ck.x.a(list).remove(yVar);
        }
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.n() { // from class: zh.q
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                yVar.a();
            }
        });
    }

    public static /* synthetic */ void a(h hVar, y yVar, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        hVar.a(yVar, list);
    }

    public final void a(final io.bidmachine.rendering.internal.c cVar, boolean z10) {
        ck.p.j(cVar, "item");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Hide AdElement - " + cVar.h().getName() + ", animated: " + z10, new Object[0]);
        io.bidmachine.rendering.internal.n nVar = new io.bidmachine.rendering.internal.n() { // from class: zh.p
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.controller.h.a(cVar);
            }
        };
        if (z10) {
            io.bidmachine.rendering.internal.animation.b.a.a(this.f60201d, cVar, AnimationEventType.Disappear, null, nVar, 4, null);
        } else {
            nVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(io.bidmachine.rendering.internal.c cVar) {
        ck.p.j(cVar, "$item");
        cVar.f();
    }

    public final void a(List list, boolean z10) {
        ck.p.j(list, "items");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Hide AdElements, animated: " + z10, new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((io.bidmachine.rendering.internal.c) it.next(), z10);
        }
    }

    public final void a(io.bidmachine.rendering.internal.adform.a aVar, io.bidmachine.rendering.internal.adform.c cVar) {
        ck.p.j(aVar, "adForm");
        ck.p.j(cVar, "adFormListener");
        io.bidmachine.rendering.internal.o.b(this.f60198a, "Load AdElement - " + aVar.h().getName(), new Object[0]);
        io.bidmachine.rendering.internal.controller.d dVar = new io.bidmachine.rendering.internal.controller.d(aVar);
        this.f60211n.put(aVar, dVar);
        try {
            this.f60210m.execute(dVar);
        } catch (Throwable th2) {
            cVar.c(aVar, Error.INSTANCE.create(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, String str2) {
        io.bidmachine.rendering.internal.o.a(this.f60198a, "EventTask - " + str + ", target object (" + str2 + ") not found", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, String str2, String str3) {
        io.bidmachine.rendering.internal.o.a(this.f60198a, "EventTask - " + str + ", target object (" + str2 + ") not " + str3, new Object[0]);
    }

    public final void a(Error error) {
        ck.p.j(error, "error");
        if (this.f60199b.a(false)) {
            this.f60200c.a(this, error);
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void a(boolean z10) {
        io.bidmachine.rendering.internal.o.b(this.f60198a, "AdPhase - performHide, isFinishing: " + z10, new Object[0]);
        for (io.bidmachine.rendering.internal.c cVar : i()) {
            if (v.class.isInstance(cVar)) {
                UiUtils.onUiThread(new l(cVar));
            }
        }
        for (io.bidmachine.rendering.internal.c cVar2 : j()) {
            if (v.class.isInstance(cVar2)) {
                UiUtils.onUiThread(new m(cVar2));
            }
        }
        for (io.bidmachine.rendering.internal.p pVar : l()) {
            if (v.class.isInstance(pVar)) {
                UiUtils.onUiThread(new n(pVar));
            }
        }
        y yVarK = k();
        if (v.class.isInstance(yVarK)) {
            UiUtils.onUiThread(new o(yVarK));
        }
        a(this.f60212o, z10);
        a(this.f60213p, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(BrokenCreativeEvent brokenCreativeEvent) {
        io.bidmachine.rendering.internal.controller.g gVarM;
        if (this.f60199b.h() || (gVarM = m()) == null) {
            return;
        }
        gVarM.a(brokenCreativeEvent);
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void a(io.bidmachine.rendering.internal.controller.g gVar) {
        this.f60205h = gVar;
    }

    public final boolean a(io.bidmachine.rendering.internal.adform.a aVar, boolean z10) {
        ck.p.j(aVar, "item");
        boolean zD = aVar.D();
        if (zD) {
            this.f60201d.a(aVar, z10);
            this.f60201d.a(aVar, AnimationEventType.Appear);
        }
        return zD;
    }

    public static /* synthetic */ boolean a(h hVar, io.bidmachine.rendering.internal.adform.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return hVar.a(aVar, z10);
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public boolean a(ViewGroup viewGroup) {
        ck.p.j(viewGroup, "container");
        return e().a(viewGroup, this.f60212o, this.f60213p);
    }
}
