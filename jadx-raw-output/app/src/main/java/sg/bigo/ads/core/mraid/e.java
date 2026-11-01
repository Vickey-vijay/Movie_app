package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements sg.bigo.ads.common.d.d {
    private final sg.bigo.ads.core.mraid.c.b A;
    private final sg.bigo.ads.core.mraid.c.b B;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f71627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final n f71628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f71629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.core.mraid.a.a f71630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final j f71631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public o f71632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public b f71633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.core.mraid.c.C0741c f71634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.core.mraid.c f71635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.core.mraid.c f71636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final c f71637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private WeakReference<Activity> f71638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private ViewGroup f71639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private final C0742e f71640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private l f71641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.core.mraid.c.C0741c f71642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private Integer f71643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f71644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f71645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f71646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private i f71647u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f71648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f71649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f71650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private sg.bigo.ads.core.mraid.a f71651y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Handler f71652z;

    public interface a extends b {
        void a(String str, String str2);
    }

    public interface b {
        void a();

        void a(@NonNull String str, @Nullable sg.bigo.ads.common.i iVar);

        boolean a(Activity activity, int i10);

        void b();

        boolean b(Activity activity, int i10);

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f71662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f71663b;

        private c() {
            this.f71662a = -1;
            this.f71663b = -1;
        }

        public /* synthetic */ c(e eVar, byte b10) {
            this();
        }

        public final void a() {
            int measuredWidth = e.this.f71634h.getMeasuredWidth();
            int measuredHeight = e.this.f71634h.getMeasuredHeight();
            this.f71662a = measuredWidth;
            this.f71663b = measuredHeight;
        }
    }

    public interface d {
        void a();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.e$e, reason: collision with other inner class name */
    @VisibleForTesting
    public static class C0742e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Handler f71665a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public a f71666b;

        /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.e$e$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NonNull
            public final View[] f71667a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NonNull
            public final Handler f71668b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Runnable f71669c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f71670d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Runnable f71671e;

            private a(@NonNull Handler handler, @NonNull View[] viewArr) {
                this.f71671e = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.e.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (final View view : a.this.f71667a) {
                            if (view.getHeight() > 0 || view.getWidth() > 0) {
                                a.a(a.this);
                            } else {
                                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.e.e.a.1.1
                                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                    public final boolean onPreDraw() {
                                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                                        a.a(a.this);
                                        return true;
                                    }
                                });
                            }
                        }
                    }
                };
                this.f71668b = handler;
                this.f71667a = viewArr;
            }

            public /* synthetic */ a(Handler handler, View[] viewArr, byte b10) {
                this(handler, viewArr);
            }

            public static /* synthetic */ void a(a aVar) {
                Runnable runnable;
                int i10 = aVar.f71670d - 1;
                aVar.f71670d = i10;
                if (i10 != 0 || (runnable = aVar.f71669c) == null) {
                    return;
                }
                runnable.run();
                aVar.f71669c = null;
            }

            public final void a() {
                this.f71668b.removeCallbacks(this.f71671e);
                this.f71669c = null;
            }
        }

        public final void a() {
            a aVar = this.f71666b;
            if (aVar != null) {
                aVar.a();
                this.f71666b = null;
            }
        }
    }

    public e(@NonNull Context context, @NonNull n nVar) {
        this(context, nVar, new sg.bigo.ads.core.mraid.c(nVar), new sg.bigo.ads.core.mraid.c(n.INTERSTITIAL), new C0742e());
    }

    @VisibleForTesting
    private e(@NonNull Context context, @NonNull n nVar, @NonNull sg.bigo.ads.core.mraid.c cVar, @NonNull sg.bigo.ads.core.mraid.c cVar2, @NonNull C0742e c0742e) {
        o oVar = o.LOADING;
        this.f71632f = oVar;
        this.f71646t = true;
        this.f71647u = i.NONE;
        this.f71649w = true;
        byte b10 = 0;
        this.f71650x = false;
        sg.bigo.ads.core.mraid.c.a aVar = new sg.bigo.ads.core.mraid.c.a() { // from class: sg.bigo.ads.core.mraid.e.3
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                e eVar = e.this;
                eVar.f71635i.a(h.b(eVar.f71627a), h.a(eVar.f71627a), h.d(eVar.f71627a), h.c(eVar.f71627a), eVar.c());
                eVar.f71635i.a(eVar.f71628b);
                sg.bigo.ads.core.mraid.c cVar3 = eVar.f71635i;
                cVar3.a(cVar3.b());
                eVar.f71635i.a(eVar.f71631e);
                eVar.k();
                eVar.a(o.DEFAULT);
                eVar.f71635i.c("mraidbridge.notifyReadyEvent();");
                b bVar = e.this.f71633g;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i10, int i11, int i12, int i13, @NonNull sg.bigo.ads.core.mraid.a.a.EnumC0740a enumC0740a, boolean z10) throws sg.bigo.ads.core.mraid.d {
                e eVar = e.this;
                if (eVar.f71634h == null) {
                    throw new sg.bigo.ads.core.mraid.d("Unable to resize after the WebView is destroyed");
                }
                o oVar2 = eVar.f71632f;
                if (oVar2 == o.LOADING || oVar2 == o.HIDDEN) {
                    return;
                }
                if (oVar2 == o.EXPANDED) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an already expanded ad");
                }
                if (eVar.f71628b == n.INTERSTITIAL) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an interstitial ad");
                }
                eVar.f71637k.a();
                Context context2 = eVar.f71627a;
                int iA = sg.bigo.ads.common.utils.e.a(context2, i10);
                int iA2 = sg.bigo.ads.common.utils.e.a(context2, i11);
                int iA3 = sg.bigo.ads.common.utils.e.a(context2, i12);
                int iA4 = sg.bigo.ads.common.utils.e.a(context2, i13);
                Rect rect = eVar.f71631e.f71716g;
                int i14 = rect.left + iA3;
                int i15 = rect.top + iA4;
                Rect rect2 = new Rect(i14, i15, iA + i14, i15 + iA2);
                if (!z10) {
                    Rect rect3 = eVar.f71631e.f71712c;
                    if (rect2.width() > rect3.width() || rect2.height() > rect3.height()) {
                        throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i10 + ", " + i11 + ") and offset (" + i12 + ", " + i13 + ") that doesn't allow the ad to appear within the max allowed size (" + eVar.f71631e.f71713d.width() + ", " + eVar.f71631e.f71713d.height() + ")");
                    }
                    rect2.offsetTo(e.a(rect3.left, rect2.left, rect3.right - rect2.width()), e.a(rect3.top, rect2.top, rect3.bottom - rect2.height()));
                }
                Rect rect4 = new Rect();
                eVar.f71630d.a(enumC0740a, rect2, rect4);
                if (!eVar.f71631e.f71712c.contains(rect4)) {
                    throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i10 + ", " + i11 + ") and offset (" + i12 + ", " + i13 + ") that doesn't allow the close region to appear within the max allowed size (" + eVar.f71631e.f71713d.width() + ", " + eVar.f71631e.f71713d.height() + ")");
                }
                if (!rect2.contains(rect4)) {
                    throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i10 + ", " + iA2 + ") and offset (" + i12 + ", " + i13 + ") that don't allow the close region to appear within the resized ad.");
                }
                eVar.f71630d.setCloseVisible(false);
                eVar.f71630d.setClosePosition(enumC0740a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect2.width(), rect2.height());
                int i16 = rect2.left;
                Rect rect5 = eVar.f71631e.f71712c;
                layoutParams.leftMargin = i16 - rect5.left;
                layoutParams.topMargin = rect2.top - rect5.top;
                o oVar3 = eVar.f71632f;
                if (oVar3 == o.DEFAULT) {
                    eVar.f71629c.removeView(eVar.f71634h);
                    eVar.f71629c.setVisibility(4);
                    eVar.f71630d.addView(eVar.f71634h, new FrameLayout.LayoutParams(-1, -1));
                    eVar.j().addView(eVar.f71630d, layoutParams);
                } else if (oVar3 == o.RESIZED) {
                    eVar.f71630d.setLayoutParams(layoutParams);
                }
                eVar.f71630d.setClosePosition(enumC0740a);
                eVar.a(o.RESIZED);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@NonNull String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.a
            public final void a(String str, String str2) {
                b bVar = e.this.f71633g;
                if (bVar == null || !(bVar instanceof a)) {
                    return;
                }
                ((a) bVar).a(str, str2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, sg.bigo.ads.common.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@Nullable String str, boolean z10) throws sg.bigo.ads.core.mraid.d {
                e.this.a(str, z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar) {
                if (e.this.f71636j.c()) {
                    return;
                }
                e.this.f71635i.a(bVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10) {
                if (e.this.f71636j.c()) {
                    return;
                }
                e.this.f71635i.a(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10, i iVar) throws sg.bigo.ads.core.mraid.d {
                e.this.a(z10, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(@NonNull JsResult jsResult) {
                return e.this.a(jsResult);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
                b bVar = e.this.f71633g;
                if (bVar != null) {
                    bVar.b();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z10) {
                e.this.b(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }
        };
        this.A = aVar;
        sg.bigo.ads.core.mraid.c.b bVar = new sg.bigo.ads.core.mraid.c.b() { // from class: sg.bigo.ads.core.mraid.e.4
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                final e eVar = e.this;
                eVar.a(new Runnable() { // from class: sg.bigo.ads.core.mraid.e.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar2 = e.this;
                        eVar2.f71636j.a(h.b(eVar2.f71627a), h.a(e.this.f71627a), h.d(e.this.f71627a), h.c(e.this.f71627a), e.this.c());
                        e eVar3 = e.this;
                        eVar3.f71636j.a(eVar3.f71632f);
                        e eVar4 = e.this;
                        eVar4.f71636j.a(eVar4.f71628b);
                        sg.bigo.ads.core.mraid.c cVar3 = e.this.f71636j;
                        cVar3.a(cVar3.b());
                        e.this.f71636j.c("mraidbridge.notifyReadyEvent();");
                    }
                });
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i10, int i11, int i12, int i13, @NonNull sg.bigo.ads.core.mraid.a.a.EnumC0740a enumC0740a, boolean z10) throws sg.bigo.ads.core.mraid.d {
                throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an expanded state");
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@NonNull String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, @Nullable sg.bigo.ads.common.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@Nullable String str, boolean z10) {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar2) {
                e.this.f71635i.a(bVar2);
                e.this.f71636j.a(bVar2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10) {
                e.this.f71635i.a(z10);
                e.this.f71636j.a(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10, i iVar) throws sg.bigo.ads.core.mraid.d {
                e.this.a(z10, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(@NonNull JsResult jsResult) {
                return e.this.a(jsResult);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z10) {
                e.this.b(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }
        };
        this.B = bVar;
        this.C = -1;
        this.f71652z = new Handler(Looper.getMainLooper());
        this.f71627a = context;
        this.f71638l = context instanceof Activity ? new WeakReference<>((Activity) context) : new WeakReference<>(null);
        this.f71628b = nVar;
        this.f71635i = cVar;
        this.f71636j = cVar2;
        this.f71640n = c0742e;
        this.f71637k = new c(this, b10);
        this.f71632f = oVar;
        this.f71631e = new j(context, context.getResources().getDisplayMetrics().density);
        this.f71629c = new FrameLayout(context);
        sg.bigo.ads.core.mraid.a.a aVar2 = new sg.bigo.ads.core.mraid.a.a(context);
        this.f71630d = aVar2;
        aVar2.setOnCloseListener(new sg.bigo.ads.core.mraid.a.a.b() { // from class: sg.bigo.ads.core.mraid.e.1
            @Override // sg.bigo.ads.core.mraid.a.a.b
            public final void a() {
                e.this.g();
            }
        });
        View view = new View(context);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.mraid.e.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        aVar2.addView(view, new FrameLayout.LayoutParams(-1, -1));
        sg.bigo.ads.common.d.a.a().a(context, this);
        cVar.f71607a = aVar;
        cVar2.f71607a = bVar;
        this.f71648v = new h();
        this.f71644r = 4871;
    }

    public static int a(int i10, int i11, int i12) {
        return Math.max(i10, Math.min(i11, i12));
    }

    @VisibleForTesting
    private void a(int i10) throws sg.bigo.ads.core.mraid.d {
        Activity activity = this.f71638l.get();
        if (activity == null || !a(this.f71647u)) {
            throw new sg.bigo.ads.core.mraid.d("Attempted to lock orientation to unsupported value: " + this.f71647u.name());
        }
        if (this.f71643q == null) {
            this.f71643q = Integer.valueOf(activity.getRequestedOrientation());
        }
        b bVar = this.f71633g;
        if (bVar == null || !bVar.a(activity, i10)) {
            activity.setRequestedOrientation(i10);
        }
    }

    private static void a(@NonNull WebView webView, boolean z10) {
        if (z10) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    private static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    @VisibleForTesting
    private boolean a(i iVar) {
        if (iVar == i.NONE) {
            return true;
        }
        Activity activity = this.f71638l.get();
        if (activity == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            return a(activityInfo.configChanges, 128) && a(activityInfo.configChanges, 1024);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private void l() {
        this.f71635i.a();
        this.f71634h = null;
    }

    private void m() {
        this.f71636j.a();
        this.f71642p = null;
    }

    @VisibleForTesting
    private void n() throws sg.bigo.ads.core.mraid.d {
        int iA;
        i iVar = this.f71647u;
        if (iVar != i.NONE) {
            iA = iVar.f71709d;
        } else {
            if (this.f71646t) {
                o();
                return;
            }
            Activity activity = this.f71638l.get();
            if (activity == null) {
                throw new sg.bigo.ads.core.mraid.d("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            }
            iA = sg.bigo.ads.common.aa.b.a(activity);
        }
        a(iA);
    }

    @VisibleForTesting
    private void o() {
        Integer num;
        j().setSystemUiVisibility(this.f71645s);
        Activity activity = this.f71638l.get();
        if (activity != null && (num = this.f71643q) != null) {
            b bVar = this.f71633g;
            if (bVar != null && bVar.b(activity, num.intValue())) {
                return;
            } else {
                activity.setRequestedOrientation(this.f71643q.intValue());
            }
        }
        this.f71643q = null;
    }

    private boolean p() {
        return !this.f71630d.f71580a.isVisible();
    }

    private void q() {
        if (this.f71651y != null) {
            this.f71627a.getContentResolver().unregisterContentObserver(this.f71651y);
            this.f71651y = null;
        }
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        int rotation;
        if (!"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (rotation = ((WindowManager) this.f71627a.getSystemService("window")).getDefaultDisplay().getRotation()) == this.C) {
            return;
        }
        this.C = rotation;
        a((Runnable) null);
    }

    public final void a(@Nullable final Runnable runnable) {
        this.f71640n.a();
        final sg.bigo.ads.core.mraid.c.C0741c c0741cB = b();
        if (c0741cB == null) {
            return;
        }
        C0742e c0742e = this.f71640n;
        C0742e.a aVar = new C0742e.a(c0742e.f71665a, new View[]{this.f71629c, c0741cB}, (byte) 0);
        c0742e.f71666b = aVar;
        aVar.f71669c = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.6
            @Override // java.lang.Runnable
            public final void run() {
                DisplayMetrics displayMetrics = e.this.f71627a.getResources().getDisplayMetrics();
                j jVar = e.this.f71631e;
                jVar.f71710a.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                jVar.a(jVar.f71710a, jVar.f71711b);
                int[] iArr = new int[2];
                ViewGroup viewGroupI = e.this.i();
                viewGroupI.getLocationOnScreen(iArr);
                j jVar2 = e.this.f71631e;
                int i10 = iArr[0];
                int i11 = iArr[1];
                jVar2.f71712c.set(i10, i11, viewGroupI.getWidth() + i10, viewGroupI.getHeight() + i11);
                jVar2.a(jVar2.f71712c, jVar2.f71713d);
                e.this.f71629c.getLocationOnScreen(iArr);
                e eVar = e.this;
                j jVar3 = eVar.f71631e;
                int i12 = iArr[0];
                int i13 = iArr[1];
                jVar3.f71716g.set(i12, i13, eVar.f71629c.getWidth() + i12, e.this.f71629c.getHeight() + i13);
                jVar3.a(jVar3.f71716g, jVar3.f71717h);
                c0741cB.getLocationOnScreen(iArr);
                j jVar4 = e.this.f71631e;
                int i14 = iArr[0];
                int i15 = iArr[1];
                jVar4.f71714e.set(i14, i15, c0741cB.getWidth() + i14, c0741cB.getHeight() + i15);
                jVar4.a(jVar4.f71714e, jVar4.f71715f);
                e eVar2 = e.this;
                eVar2.f71635i.a(eVar2.f71631e);
                if (e.this.f71636j.c()) {
                    e eVar3 = e.this;
                    eVar3.f71636j.a(eVar3.f71631e);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        aVar.f71670d = aVar.f71667a.length;
        aVar.f71668b.post(aVar.f71671e);
    }

    @VisibleForTesting
    public final void a(@NonNull String str) {
        MraidVideoActivity.a(this.f71627a, str);
    }

    @VisibleForTesting
    public final void a(@NonNull String str, @Nullable sg.bigo.ads.common.i iVar) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if ("tel".equalsIgnoreCase(scheme) || "voicemail".equalsIgnoreCase(scheme) || "sms".equalsIgnoreCase(scheme) || "mailto".equalsIgnoreCase(scheme) || "geo".equalsIgnoreCase(scheme) || "google.streetview".equalsIgnoreCase(scheme)) {
            sg.bigo.ads.common.t.a.a(2, "MraidController", String.format("Uri scheme %s is not allowed.", uri.getScheme()));
            return;
        }
        b bVar = this.f71633g;
        if (bVar != null) {
            bVar.a(str, iVar);
        }
    }

    public final void a(@NonNull String str, @Nullable d dVar) {
        a(dVar);
        this.f71635i.a(str);
    }

    public final void a(@Nullable String str, boolean z10) throws sg.bigo.ads.core.mraid.d {
        sg.bigo.ads.core.mraid.a.a aVar;
        sg.bigo.ads.core.mraid.c.C0741c c0741c;
        if (this.f71634h == null) {
            throw new sg.bigo.ads.core.mraid.d("Unable to expand after the WebView is destroyed");
        }
        if (this.f71628b == n.INTERSTITIAL) {
            return;
        }
        o oVar = this.f71632f;
        o oVar2 = o.DEFAULT;
        if (oVar == oVar2 || oVar == o.RESIZED) {
            n();
            boolean z11 = str != null;
            if (z11) {
                sg.bigo.ads.core.mraid.c.C0741c c0741cA = sg.bigo.ads.core.mraid.c.a(this.f71627a);
                this.f71642p = c0741cA;
                if (c0741cA == null) {
                    return;
                }
                this.f71636j.a(c0741cA);
                this.f71636j.b(str);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            o oVar3 = this.f71632f;
            if (oVar3 == oVar2) {
                this.f71645s = j().getSystemUiVisibility();
                j().setSystemUiVisibility(this.f71644r);
                if (z11) {
                    aVar = this.f71630d;
                    c0741c = this.f71642p;
                } else {
                    this.f71637k.a();
                    this.f71629c.removeView(this.f71634h);
                    this.f71629c.setVisibility(4);
                    aVar = this.f71630d;
                    c0741c = this.f71634h;
                }
                aVar.addView(c0741c, layoutParams);
                j().addView(this.f71630d, new FrameLayout.LayoutParams(-1, -1));
            } else if (oVar3 == o.RESIZED && z11) {
                this.f71630d.removeView(this.f71634h);
                this.f71629c.addView(this.f71634h, layoutParams);
                this.f71629c.setVisibility(4);
                this.f71630d.addView(this.f71642p, layoutParams);
            }
            this.f71630d.setLayoutParams(layoutParams);
            b(z10);
            a(o.EXPANDED);
        }
    }

    public final void a(@Nullable d dVar) {
        sg.bigo.ads.core.mraid.c.C0741c c0741cA = sg.bigo.ads.core.mraid.c.a(this.f71627a);
        this.f71634h = c0741cA;
        if (c0741cA == null) {
            return;
        }
        if (dVar != null) {
            dVar.a();
        }
        this.f71635i.a(this.f71634h);
        this.f71629c.addView(this.f71634h, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(@NonNull o oVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "MraidController", "MRAID state set to ".concat(String.valueOf(oVar)));
        o oVar2 = this.f71632f;
        this.f71632f = oVar;
        this.f71635i.a(oVar);
        sg.bigo.ads.core.mraid.c cVar = this.f71636j;
        if (cVar.f71610d) {
            cVar.a(oVar);
        }
        b bVar = this.f71633g;
        if (bVar != null) {
            o oVar3 = o.EXPANDED;
            if (oVar == oVar3) {
                bVar.d();
            } else if ((oVar2 == oVar3 && oVar == o.DEFAULT) || oVar == o.HIDDEN) {
                bVar.f();
            } else {
                o oVar4 = o.RESIZED;
                if ((oVar2 == oVar4 && oVar == o.DEFAULT) || oVar == oVar4) {
                    bVar.e();
                }
            }
        }
        a((Runnable) null);
    }

    public final void a(boolean z10) {
        this.f71649w = true;
        q();
        sg.bigo.ads.core.mraid.c.C0741c c0741c = this.f71634h;
        if (c0741c != null) {
            a(c0741c, z10);
        }
        sg.bigo.ads.core.mraid.c.C0741c c0741c2 = this.f71642p;
        if (c0741c2 != null) {
            a(c0741c2, z10);
        }
    }

    @VisibleForTesting
    public final void a(boolean z10, i iVar) throws sg.bigo.ads.core.mraid.d {
        if (!a(iVar)) {
            throw new sg.bigo.ads.core.mraid.d("Unable to force orientation to ".concat(String.valueOf(iVar)));
        }
        this.f71646t = z10;
        this.f71647u = iVar;
        if (this.f71632f == o.EXPANDED || (this.f71628b == n.INTERSTITIAL && !this.f71649w)) {
            n();
        }
    }

    @VisibleForTesting
    public final boolean a() {
        l lVar = this.f71641o;
        if (lVar != null) {
            return lVar.b();
        }
        return true;
    }

    @VisibleForTesting
    public final boolean a(@NonNull JsResult jsResult) {
        l lVar = this.f71641o;
        if (lVar != null) {
            return lVar.a();
        }
        jsResult.confirm();
        return true;
    }

    @Nullable
    public final sg.bigo.ads.core.mraid.c.C0741c b() {
        return this.f71636j.c() ? this.f71642p : this.f71634h;
    }

    @VisibleForTesting
    public final void b(boolean z10) {
        if (z10 == p()) {
            return;
        }
        this.f71630d.setCloseVisible(!z10);
    }

    @VisibleForTesting
    public final boolean c() {
        Activity activity = this.f71638l.get();
        if (activity == null || b() == null) {
            return false;
        }
        if (this.f71628b != n.INLINE) {
            return true;
        }
        return h.a(activity);
    }

    public final void d() {
        this.f71649w = false;
        k();
        sg.bigo.ads.core.mraid.c.C0741c c0741c = this.f71634h;
        if (c0741c != null) {
            c0741c.onResume();
        }
        sg.bigo.ads.core.mraid.c.C0741c c0741c2 = this.f71642p;
        if (c0741c2 != null) {
            c0741c2.onResume();
        }
    }

    public final void e() {
        this.f71640n.a();
        try {
            sg.bigo.ads.common.d.a.a().a(this);
        } catch (IllegalArgumentException e10) {
            if (!e10.getMessage().contains("Receiver not registered")) {
                throw e10;
            }
        }
        if (!this.f71649w) {
            a(true);
        }
        u.b(this.f71630d);
        l();
        m();
        o();
        q();
        this.f71639m = null;
        u.b(this.f71629c);
        u.b(this.f71630d);
        this.f71650x = true;
    }

    public final void f() {
        b bVar;
        if (this.f71628b != n.INTERSTITIAL || (bVar = this.f71633g) == null) {
            return;
        }
        bVar.g();
    }

    @VisibleForTesting
    public final void g() {
        o oVar;
        o oVar2;
        ViewGroup.LayoutParams layoutParams;
        sg.bigo.ads.core.mraid.c.C0741c c0741c;
        if (this.f71634h == null || (oVar = this.f71632f) == o.LOADING || oVar == (oVar2 = o.HIDDEN)) {
            return;
        }
        o oVar3 = o.EXPANDED;
        if (oVar == oVar3 || this.f71628b == n.INTERSTITIAL) {
            o();
        }
        o oVar4 = this.f71632f;
        if (oVar4 != o.RESIZED && oVar4 != oVar3) {
            if (oVar4 == o.DEFAULT) {
                this.f71629c.setVisibility(4);
                a(oVar2);
                return;
            }
            return;
        }
        if (!this.f71636j.c() || (c0741c = this.f71642p) == null) {
            this.f71630d.removeView(this.f71634h);
            this.f71629c.addView(this.f71634h, new FrameLayout.LayoutParams(-1, -1));
            this.f71629c.setVisibility(0);
        } else {
            m();
            this.f71630d.removeView(c0741c);
        }
        c cVar = this.f71637k;
        sg.bigo.ads.core.mraid.c.C0741c c0741c2 = e.this.f71634h;
        if (c0741c2 != null && cVar.f71662a > 0 && cVar.f71663b > 0 && (layoutParams = c0741c2.getLayoutParams()) != null) {
            layoutParams.width = cVar.f71662a;
            layoutParams.height = cVar.f71663b;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            e.this.f71634h.setLayoutParams(layoutParams);
        }
        u.b(this.f71630d);
        a(o.DEFAULT);
    }

    @VisibleForTesting
    public final void h() {
        b bVar = this.f71633g;
        if (bVar != null) {
            bVar.c();
        }
    }

    @NonNull
    public final ViewGroup i() {
        ViewGroup viewGroup = this.f71639m;
        if (viewGroup != null) {
            return viewGroup;
        }
        View viewA = u.a(this.f71638l.get(), this.f71629c);
        return viewA instanceof ViewGroup ? (ViewGroup) viewA : this.f71629c;
    }

    @NonNull
    public final ViewGroup j() {
        if (this.f71639m == null) {
            this.f71639m = i();
        }
        return this.f71639m;
    }

    public final void k() {
        o oVar;
        if (this.f71650x || (oVar = this.f71632f) == o.LOADING || oVar == o.HIDDEN || this.f71634h == null) {
            return;
        }
        Context context = this.f71627a;
        if (this.f71651y != null) {
            q();
        }
        this.f71651y = new sg.bigo.ads.core.mraid.a(this.f71652z, context.getApplicationContext(), new sg.bigo.ads.core.mraid.a.InterfaceC0739a() { // from class: sg.bigo.ads.core.mraid.e.7
            @Override // sg.bigo.ads.core.mraid.a.InterfaceC0739a
            public final void a(float f10) {
                e.this.f71635i.c("mraidbridge.notifyAudioVolumeChangeEvent(" + f10 + ");");
            }
        });
        context.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f71651y);
    }
}
