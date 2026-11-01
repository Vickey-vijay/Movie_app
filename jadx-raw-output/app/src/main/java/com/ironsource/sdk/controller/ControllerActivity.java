package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.A8;
import com.ironsource.B7;
import com.ironsource.C3369a1;
import com.ironsource.C3426d4;
import com.ironsource.C3472fe;
import com.ironsource.C3546k;
import com.ironsource.C3564l;
import com.ironsource.C3664q8;
import com.ironsource.C3676r4;
import com.ironsource.C3742v2;
import com.ironsource.C3748v8;
import com.ironsource.G5;
import com.ironsource.InterfaceC3601mg;
import com.ironsource.Lb;
import com.ironsource.Og;
import com.ironsource.Qc;
import com.ironsource.S9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes11.dex */
public class ControllerActivity extends Activity implements Qc, InterfaceC3601mg {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f30737o = "ControllerActivity";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f30738p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f30739q = "removeWebViewContainerView | mContainer is null";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f30740r = "removeWebViewContainerView | view is null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f30742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f30743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f30744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private B7 f30745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedCallback f30746f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f30748h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C3369a1 f30752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30754n;
    public int currentRequestedRotation = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30747g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f30749i = new Handler();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f30750j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RelativeLayout.LayoutParams f30751k = new RelativeLayout.LayoutParams(-1, -1);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f30747g));
        }
    }

    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                controllerActivity.f30749i.removeCallbacks(controllerActivity.f30750j);
                ControllerActivity controllerActivity2 = ControllerActivity.this;
                controllerActivity2.f30749i.postDelayed(controllerActivity2.f30750j, 500L);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    private void c() {
        String str = f30737o;
        Logger.i(str, "clearWebviewController");
        v vVar = this.f30742b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.EnumC0288v.Gone);
        this.f30742b.C();
        this.f30742b.D();
        this.f30742b.g(this.f30748h, "onDestroy");
    }

    private void d() {
        Intent intent = getIntent();
        a(intent.getStringExtra(C3426d4.i.A), intent.getIntExtra(C3426d4.i.B, 0));
    }

    private boolean e() {
        return this.f30741a == null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44960f, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30745e = Lb.U().i();
        try {
            new C3564l(this).a();
            new C3546k(this).a();
            v vVar = (v) S9.b((Context) this).a().k();
            this.f30742b = vVar;
            vVar.r().setId(1);
            this.f30742b.a((Qc) this);
            this.f30742b.a((InterfaceC3601mg) this);
            Intent intent = getIntent();
            this.f30748h = intent.getStringExtra(C3426d4.i.f28552m);
            this.f30747g = intent.getBooleanExtra("immersive", false);
            this.f30741a = intent.getStringExtra("adViewId");
            this.f30753m = false;
            this.f30754n = intent.getBooleanExtra(C3426d4.i.f28579z0, false);
            if (this.f30747g) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f30750j);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f30743c = relativeLayout;
            setContentView(relativeLayout, this.f30751k);
            this.f30744d = a(this.f30741a);
            if (this.f30743c.findViewById(1) == null && this.f30744d.getParent() != null) {
                finish();
            }
            d();
            this.f30743c.addView(this.f30744d, this.f30751k);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
        a();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f30742b.x()) {
            this.f30742b.w();
            return true;
        }
        if (this.f30747g && (i10 == 25 || i10 == 24)) {
            this.f30749i.removeCallbacks(this.f30750j);
            this.f30749i.postDelayed(this.f30750j, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.ironsource.InterfaceC3601mg
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC3601mg
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC3601mg
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC3601mg
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC3601mg
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f30746f = new OnBackInvokedCallback() { // from class: com.ironsource.sdk.controller.w
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    this.f31206a.g();
                }
            };
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f30746f);
        }
    }

    private void b() {
        runOnUiThread(new d());
    }

    private void f() {
        runOnUiThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Logger.i(f30737o, "OnBackInvokedCallback");
        if (C3742v2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    private void h() {
        if (Build.VERSION.SDK_INT < 33 || this.f30746f == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f30746f);
            Logger.i(f30737o, "OnBackInvokedCallback unregistered");
            this.f30746f = null;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e10);
        }
    }

    private void i() {
        ViewGroup viewGroup;
        try {
            if (this.f30743c == null) {
                throw new Exception(f30739q);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f30744d.getParent();
            View viewA = a(viewGroup2);
            if (viewA == null) {
                throw new Exception(f30740r);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) viewA.getParent()) != null) {
                viewGroup.removeView(viewA);
            }
            viewGroup2.removeView(this.f30744d);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            A8.a(C3472fe.f28927s, new C3748v8().a(G5.A, e10.getMessage()).a());
            Logger.i(f30737o, "removeWebViewContainerView fail " + e10.getMessage());
        }
    }

    private void j() {
        int iK = this.f30745e.K(this);
        String str = f30737o;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (iK == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (iK != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void k() {
        int iK = this.f30745e.K(this);
        String str = f30737o;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (iK == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (iK != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f30737o, "onBackPressed");
        if (C3742v2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            Logger.i(f30737o, "Rotation: Req = " + i10 + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z10) {
        if (z10) {
            f();
        } else {
            b();
        }
    }

    @Override // com.ironsource.Qc
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // com.ironsource.Qc
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        String str = f30737o;
        Logger.i(str, "onDestroy");
        h();
        i();
        if (!this.f30753m) {
            Logger.i(str, "onDestroy | destroyedFromBackground");
            c();
        }
    }

    @Override // com.ironsource.Qc
    public void onOrientationChanged(String str, int i10) {
        a(str, i10);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f30737o, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.f30742b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.f30754n) {
                this.f30742b.B();
            }
            this.f30742b.b(false, C3426d4.i.Z);
            this.f30742b.g(this.f30748h, C3426d4.i.f28567t0);
        }
        if (isFinishing()) {
            this.f30753m = true;
            c();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f30737o, C3426d4.i.f28569u0);
        v vVar = this.f30742b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.f30754n) {
                this.f30742b.F();
            }
            this.f30742b.b(true, C3426d4.i.Z);
            this.f30742b.g(this.f30748h, C3426d4.i.f28569u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Logger.i(f30737o, "onStart");
        v vVar = this.f30742b;
        if (vVar != null) {
            vVar.g(this.f30748h, "onStart");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Logger.i(f30737o, "onStop");
        v vVar = this.f30742b;
        if (vVar != null) {
            vVar.g(this.f30748h, "onStop");
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f30737o, "onUserLeaveHint");
        v vVar = this.f30742b;
        if (vVar != null) {
            vVar.g(this.f30748h, "onUserLeaveHint");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f30747g && z10) {
            runOnUiThread(this.f30750j);
        }
    }

    private FrameLayout a(String str) {
        if (!b(str)) {
            return this.f30742b.r();
        }
        return Og.a(getApplicationContext(), C3664q8.a().a(str).getPresentingView());
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void a(String str, int i10) {
        if (str != null) {
            if (C3426d4.i.C.equalsIgnoreCase(str)) {
                j();
                return;
            }
            if (C3426d4.i.D.equalsIgnoreCase(str)) {
                k();
                return;
            }
            if (C3426d4.i.G.equalsIgnoreCase(str)) {
                if (this.f30745e.w(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private View a(ViewGroup viewGroup) {
        if (e()) {
            return viewGroup.findViewById(1);
        }
        return C3664q8.a().a(this.f30741a).getPresentingView();
    }
}
