package io.bidmachine.rendering.internal.detector.brokencreative;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import bk.l;
import bk.p;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmResult;
import io.bidmachine.rendering.model.BrokenCreativeDetectorParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.StopDetectorAfter;
import io.bidmachine.util.ImageUtilsKt;
import io.bidmachine.util.taskmanager.CancelableTask;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import io.bidmachine.util.taskmanager.handler.HandlerTaskManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import mj.g;
import mj.r;
import nj.t;
import nk.j2;
import nk.k0;
import nk.w0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BrokenCreativeDetectorParams f60358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.detector.brokencreative.b f60359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f60360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f60361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f60362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f60363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f60364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f60365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f60366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f60367l;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.detector.brokencreative.a$a, reason: collision with other inner class name */
    public static final class C0528a extends CancelableTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a f60368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f60369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p f60370c;

        public C0528a(io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a aVar, Bitmap bitmap, p pVar) {
            ck.p.j(aVar, "algorithm");
            ck.p.j(bitmap, "image");
            ck.p.j(pVar, "callback");
            this.f60368a = aVar;
            this.f60369b = bitmap;
            this.f60370c = pVar;
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Boolean boolB = this.f60368a.b(this.f60369b);
            if (boolB != null) {
                this.f60370c.mo1invoke(this, new BrokenCreativeAlgorithmResult(boolB.booleanValue(), this.f60368a.a(), System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                this.f60370c.mo1invoke(this, null);
            }
        }
    }

    public static final class b extends CancelableTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f60371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f60372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f60373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final l f60374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final CoroutineTaskManager f60375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final WeakReference f60376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f60377g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f60378h;

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.detector.brokencreative.a$b$a, reason: collision with other inner class name */
        public final class C0529a implements io.bidmachine.rendering.internal.screenshot.b {
            public C0529a() {
            }

            @Override // io.bidmachine.rendering.internal.screenshot.b
            public void a() {
                b.this.c();
            }

            @Override // io.bidmachine.rendering.internal.screenshot.b
            public void a(Bitmap bitmap) {
                ck.p.j(bitmap, "bitmap");
                b.this.a(bitmap);
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.detector.brokencreative.a$b$b, reason: collision with other inner class name */
        public static final class C0530b extends Lambda implements p {
            public C0530b() {
                super(2);
            }

            public final void a(C0528a c0528a, BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult) {
                ck.p.j(c0528a, "algorithmTask");
                b.this.a(c0528a, brokenCreativeAlgorithmResult);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object obj, Object obj2) {
                a((C0528a) obj, (BrokenCreativeAlgorithmResult) obj2);
                return r.f64562a;
            }
        }

        public b(View view, Handler handler, double d10, List list, l lVar) {
            ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ck.p.j(handler, "screenshotCallbackHandler");
            ck.p.j(list, "algorithms");
            ck.p.j(lVar, "callback");
            this.f60371a = handler;
            this.f60372b = d10;
            this.f60373c = list;
            this.f60374d = lVar;
            this.f60375e = new CoroutineTaskManager(kotlinx.coroutines.d.a(new k0("DetectorTaskManager").plus(j2.b(null, 1, null)).plus(w0.a())));
            this.f60376f = new WeakReference(view);
            this.f60377g = new CopyOnWriteArrayList();
            this.f60378h = new CopyOnWriteArrayList();
        }

        private final void b() {
            if (a()) {
                this.f60374d.invoke(this.f60378h);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c() {
            b();
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            View view = (View) this.f60376f.get();
            if (view == null) {
                return;
            }
            io.bidmachine.rendering.internal.screenshot.a.f60538a.a(view, this.f60371a, new C0529a());
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask, io.bidmachine.util.Cancelable
        public void setCancel(boolean z10) {
            super.setCancel(z10);
            if (z10) {
                Iterator it = this.f60377g.iterator();
                while (it.hasNext()) {
                    this.f60375e.cancel((C0528a) it.next());
                }
                this.f60377g.clear();
            }
        }

        private final boolean a() {
            return !isCanceled();
        }

        private final void a(C0528a c0528a) {
            this.f60377g.remove(c0528a);
            if (!this.f60377g.isEmpty()) {
                return;
            }
            b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(C0528a c0528a, BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult) {
            if (brokenCreativeAlgorithmResult != null) {
                this.f60378h.add(brokenCreativeAlgorithmResult);
            }
            a(c0528a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(Bitmap bitmap) {
            if (!a()) {
                ImageUtilsKt.recycleSafely(bitmap);
                return;
            }
            Bitmap bitmapCreateDownscaledBitmapSafely = ImageUtilsKt.createDownscaledBitmapSafely(bitmap, this.f60372b);
            if (!ck.p.e(bitmapCreateDownscaledBitmapSafely, bitmap)) {
                ImageUtilsKt.recycleSafely(bitmap);
            }
            if (!a()) {
                ImageUtilsKt.recycleSafely(bitmap);
                return;
            }
            List list = this.f60373c;
            ArrayList<C0528a> arrayList = new ArrayList(t.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0528a((io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a) it.next(), bitmapCreateDownscaledBitmapSafely, new C0530b()));
            }
            this.f60377g.addAll(arrayList);
            for (C0528a c0528a : arrayList) {
                if (!this.f60375e.executeSafely(c0528a)) {
                    a(c0528a);
                }
            }
        }
    }

    public static final class c extends Lambda implements bk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f60381a = new c();

        public c() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerTaskManager invoke() {
            HandlerThread handlerThread = new HandlerThread("BrokenCreativeDetectorTaskManager");
            handlerThread.start();
            return new HandlerTaskManager(new Handler(handlerThread.getLooper()));
        }
    }

    public static final class d extends Lambda implements l {
        public d() {
            super(1);
        }

        public final void a(List list) {
            ck.p.j(list, "it");
            a.this.a(list);
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return r.f64562a;
        }
    }

    public a(int i10, String str, BrokenCreativeDetectorParams brokenCreativeDetectorParams, io.bidmachine.rendering.internal.detector.brokencreative.b bVar) {
        ck.p.j(str, "adElementName");
        ck.p.j(brokenCreativeDetectorParams, "brokenCreativeDetectorParams");
        ck.p.j(bVar, "brokenCreativeDetectorListener");
        this.f60356a = i10;
        this.f60357b = str;
        this.f60358c = brokenCreativeDetectorParams;
        this.f60359d = bVar;
        this.f60360e = kotlin.b.a(c.f60381a);
        this.f60361f = new CopyOnWriteArrayList();
        this.f60362g = new AtomicBoolean(false);
        this.f60363h = new AtomicBoolean(false);
        this.f60364i = new AtomicBoolean(false);
        this.f60365j = new Object();
    }

    private final void b() {
        synchronized (this.f60365j) {
            b bVar = this.f60367l;
            if (bVar != null) {
                d().cancel(bVar);
            }
        }
    }

    private final HandlerTaskManager d() {
        return (HandlerTaskManager) this.f60360e.getValue();
    }

    private final boolean e() {
        return this.f60363h.get();
    }

    private final boolean f() {
        return this.f60362g.get();
    }

    private final boolean g() {
        return this.f60364i.get();
    }

    private final void h() {
        synchronized (this.f60365j) {
            b();
            if (a()) {
                b bVar = this.f60367l;
                if (bVar != null) {
                    d().scheduleSafely(bVar, this.f60358c.getTimeout());
                }
            }
        }
    }

    public final void c() {
        this.f60363h.set(true);
        i();
    }

    public final void i() {
        synchronized (this.f60365j) {
            this.f60362g.set(false);
            b();
            this.f60367l = null;
            r rVar = r.f64562a;
        }
    }

    private final boolean a() {
        return (!f() || g() || e()) ? false : true;
    }

    private final void a(BrokenCreativeEvent brokenCreativeEvent) {
        if (a()) {
            o.b("BrokenCreativeDetector", "Notify detector result: %s", brokenCreativeEvent);
            this.f60359d.a(brokenCreativeEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List list) {
        if (a()) {
            Iterator it = list.iterator();
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (it.hasNext()) {
                BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult = (BrokenCreativeAlgorithmResult) it.next();
                float f10 = brokenCreativeAlgorithmResult.getAlgorithmParams().getAndroidx.appcompat.widget.ActivityChooserModel.ATTRIBUTE_WEIGHT java.lang.String();
                if (brokenCreativeAlgorithmResult.getIsBroken()) {
                    d11 += (double) f10;
                }
                d10 += (double) f10;
            }
            boolean z10 = (d10 != 0.0d ? d11 / d10 : 0.0d) >= this.f60358c.getWeightThreshold();
            if (!this.f60358c.getIsErrorOnly() || z10) {
                BrokenCreativeEvent brokenCreativeEvent = new BrokenCreativeEvent(io.bidmachine.rendering.internal.detector.brokencreative.c.f60386a.a(z10), this.f60356a, this.f60357b, System.currentTimeMillis() - this.f60366k, list);
                if (this.f60358c.getIsAllowDuplicate() || !this.f60361f.contains(brokenCreativeEvent)) {
                    this.f60361f.add(brokenCreativeEvent);
                    a(brokenCreativeEvent);
                }
            }
            StopDetectorAfter stopAfter = this.f60358c.getStopAfter();
            if (!(stopAfter == StopDetectorAfter.ValidCreative && z10) && ((stopAfter != StopDetectorAfter.BrokenCreative || z10) && stopAfter != StopDetectorAfter.Never)) {
                this.f60364i.set(true);
            } else {
                h();
            }
        }
    }

    public final void a(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (g() || e()) {
            return;
        }
        synchronized (this.f60365j) {
            if (this.f60362g.compareAndSet(false, true)) {
                List<BrokenCreativeAlgorithmParams> algorithms = this.f60358c.getAlgorithms();
                ArrayList arrayList = new ArrayList(t.v(algorithms, 10));
                Iterator<T> it = algorithms.iterator();
                while (it.hasNext()) {
                    arrayList.add(io.bidmachine.rendering.internal.detector.brokencreative.algorithm.b.f60384a.a((BrokenCreativeAlgorithmParams) it.next()));
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f60366k = System.currentTimeMillis();
                this.f60367l = new b(view, d().getHandler(), this.f60358c.getDownscaleFactor(), arrayList, new d());
                h();
                r rVar = r.f64562a;
            }
        }
    }
}
