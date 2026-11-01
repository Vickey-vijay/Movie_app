package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MBBaseActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Display f32527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OrientationEventListener f32528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32529c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f32530d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f32531e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e10) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    public class b extends OrientationEventListener {
        public b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation = MBBaseActivity.this.f32527a != null ? MBBaseActivity.this.f32527a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.f32529c != 1) {
                MBBaseActivity.this.f32529c = 1;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.f32529c != 2) {
                MBBaseActivity.this.f32529c = 2;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.f32529c != 3) {
                MBBaseActivity.this.f32529c = 3;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.f32529c == 4) {
                    return;
                }
                MBBaseActivity.this.f32529c = 4;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44969o, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32530d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            f1.c(getWindow());
        } catch (Exception e10) {
            q0.b("MBBaseActivity", e10.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f32530d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.f32528b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.f32528b = null;
            }
            if (this.f32531e != null) {
                getWindow().getDecorView().removeCallbacks(this.f32531e);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    public abstract void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i10;
        int safeInsetLeft;
        int i11;
        int i12;
        int safeInsetBottom;
        DisplayCutout displayCutout;
        int i13;
        int i14 = Build.VERSION.SDK_INT;
        if (this.f32530d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i15 = -1;
        if (rootWindowInsets == null || i14 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            i10 = -1;
            safeInsetLeft = 0;
            i11 = 0;
            i12 = 0;
            safeInsetBottom = 0;
        } else {
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f32527a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.f32529c == -1) {
                if (rotation == 0) {
                    i13 = 3;
                } else if (rotation == 1) {
                    i13 = 1;
                } else if (rotation == 2) {
                    i13 = 4;
                } else {
                    i13 = rotation == 3 ? 2 : -1;
                }
                this.f32529c = i13;
                q0.b("MBBaseActivity", this.f32529c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i15 = 90;
                } else if (rotation == 2) {
                    i15 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                } else if (rotation == 3) {
                    i15 = 270;
                }
                i10 = i15;
            } else {
                i10 = 0;
            }
            i11 = safeInsetRight;
            i12 = safeInsetTop;
        }
        setTopControllerPadding(i10, safeInsetLeft, i11, i12, safeInsetBottom);
        if (this.f32528b == null) {
            d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } catch (Throwable th2) {
            q0.b("MBBaseActivity", th2.getMessage());
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.f32528b = bVar;
        if (bVar.canDetectOrientation()) {
            this.f32528b.enable();
        } else {
            this.f32528b.disable();
            this.f32528b = null;
        }
    }

    public void getNotchParams() {
        if (this.f32530d) {
            return;
        }
        this.f32531e = new a();
        getWindow().getDecorView().postDelayed(this.f32531e, 500L);
    }

    private int a() {
        if (this.f32527a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f32527a = getDisplay();
            } else {
                this.f32527a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f32527a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f34851f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c();
    }
}
