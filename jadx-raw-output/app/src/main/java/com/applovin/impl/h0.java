package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f7594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f7599i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f7603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f7604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f7605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Handler f7606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HandlerThread f7607q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f7609s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f7600j = new WeakReference(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f7608r = new Runnable() { // from class: com.applovin.impl.va
        @Override // java.lang.Runnable
        public final void run() {
            this.f9754b.a();
        }
    };

    public class a implements d {
        @Override // com.applovin.impl.h0.d
        public void a(Bitmap bitmap) {
            try {
                h0.a(h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = width / h0.this.f7597g;
                int i11 = height / h0.this.f7597g;
                int i12 = i10 / 2;
                for (int i13 = i11 / 2; i13 < height; i13 += i11) {
                    for (int i14 = i12; i14 < width; i14 += i10) {
                        int pixel = bitmap.getPixel(i14, i13);
                        if (h0.this.a(pixel)) {
                            bitmap.recycle();
                            h0.this.j();
                            h0.this.g();
                            return;
                        }
                        if (h0.this.f7603m == null) {
                            h0.this.f7603m = Integer.valueOf(pixel);
                        }
                    }
                }
                h0.f(h0.this);
                bitmap.recycle();
                h0.this.g();
            } catch (Exception e10) {
                h0.this.f7591a.D().a("BlackViewDetector", "onScreenshotCaptured", e10);
                h0.this.k();
            }
        }

        public a() {
        }

        @Override // com.applovin.impl.h0.d
        public void a(boolean z10) {
            if (z10) {
                h0.this.k();
            } else {
                h0.this.g();
            }
        }
    }

    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f7611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bitmap f7612b;

        public b(d dVar, Bitmap bitmap) {
            this.f7611a = dVar;
            this.f7612b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f7611a.a(this.f7612b);
                return;
            }
            com.applovin.impl.sdk.o unused = h0.this.f7592b;
            if (com.applovin.impl.sdk.o.a()) {
                h0.this.f7592b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
            }
            this.f7611a.a(true);
        }
    }

    public interface c {
        void a(int i10, int i11);

        void a(int i10, int i11, int i12);
    }

    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public static /* synthetic */ int a(h0 h0Var) {
        int i10 = h0Var.f7602l;
        h0Var.f7602l = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f(h0 h0Var) {
        int i10 = h0Var.f7601k;
        h0Var.f7601k = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f7601k = 0;
        this.f7603m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f7600j.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7592b.a("BlackViewDetector", "Stopped monitoring view: " + this.f7600j.get());
            }
            this.f7600j.clear();
        }
        Handler handler = this.f7606p;
        if (handler != null) {
            handler.removeCallbacks(this.f7608r);
            this.f7606p = null;
        }
        if (this.f7609s != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.wa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9848b.f();
                }
            });
        }
    }

    private void c() {
        if (this.f7601k >= this.f7596f && !this.f7605o) {
            this.f7605o = true;
            h();
        }
        if (this.f7601k < this.f7595e || this.f7604n) {
            return;
        }
        this.f7604n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f7609s;
        if (cVar != null) {
            cVar.a(this.f7595e, this.f7601k, this.f7602l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f7609s;
        if (cVar != null) {
            cVar.a(this.f7601k, this.f7602l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f7609s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f7593c <= 0) {
            if (this.f7601k == 1) {
                if (!this.f7605o) {
                    this.f7605o = true;
                    h();
                }
                if (!this.f7604n) {
                    this.f7604n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f7606p == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7592b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f7604n && this.f7605o) {
            k();
        } else {
            this.f7606p.postDelayed(this.f7608r, this.f7593c);
        }
    }

    private void h() {
        View view = (View) this.f7600j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7592b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ua
            @Override // java.lang.Runnable
            public final void run() {
                this.f9697b.d();
            }
        });
    }

    private void i() {
        View view = (View) this.f7600j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7592b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.xa
            @Override // java.lang.Runnable
            public final void run() {
                this.f10103b.e();
            }
        });
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f7607q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f7607q = null;
        }
    }

    public h0(com.applovin.impl.sdk.k kVar) {
        this.f7591a = kVar;
        this.f7592b = kVar.O();
        this.f7593c = ((Long) kVar.a(x4.f9961j6)).longValue();
        this.f7594d = ((Long) kVar.a(x4.f9952i6)).longValue();
        this.f7597g = ((Integer) kVar.a(x4.f9970k6)).intValue();
        this.f7598h = ((Integer) kVar.a(x4.f9979l6)).intValue();
        this.f7599i = ((Integer) kVar.a(x4.f9988m6)).intValue();
        this.f7595e = ((Integer) kVar.a(x4.f10036s6)).intValue();
        this.f7596f = ((Integer) kVar.a(x4.f10044t6)).intValue();
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f7591a.a(x4.f9943h6)).booleanValue()) {
            View view2 = (View) this.f7600j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7592b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7592b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f7607q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f7607q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f7591a.D().a(d2.L0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f7609s = cVar;
                this.f7600j = new WeakReference(view);
                j();
                this.f7604n = false;
                this.f7605o = false;
                Handler handler = new Handler(this.f7607q.getLooper());
                this.f7606p = handler;
                handler.postDelayed(this.f7608r, this.f7594d);
            } catch (Throwable th2) {
                k();
                this.f7591a.D().a("BlackViewDetector", "maybeStartMonitoring", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f7600j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7592b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l10 = (Long) this.f7591a.a(x4.f10020q6);
        if (l10.longValue() > 0 && (memoryInfoA = n7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY))) != null && memoryInfoA.availMem < l10.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7592b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f7591a.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7592b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7592b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7592b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    public boolean a(int i10) {
        boolean z10;
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        Integer num = this.f7603m;
        if (num != null) {
            int iRed2 = Color.red(num.intValue());
            int iGreen2 = Color.green(this.f7603m.intValue());
            int iBlue2 = Color.blue(this.f7603m.intValue());
            if (Math.abs(iRed - iRed2) > this.f7599i || Math.abs(iGreen - iGreen2) > this.f7599i || Math.abs(iBlue - iBlue2) > this.f7599i) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        int i11 = this.f7598h;
        return iRed > i11 || iGreen > i11 || iBlue > i11 || z10;
    }

    private void a(View view, d dVar) {
        if (o0.g()) {
            Activity activityA = this.f7591a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7592b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7592b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th2);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7592b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
