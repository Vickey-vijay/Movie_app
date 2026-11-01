package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import ck.p;
import com.ironsource.Cf;
import com.ironsource.Lf;
import com.ironsource.Qf;
import com.ironsource.V8;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class TestSuiteActivity extends Activity implements V8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f30034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Qf f30035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Lf f30036c;

    private final String a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject b() {
        JSONObject jSONObjectJsonObjectInit;
        String strB = new Cf().b(this);
        if (strB != null) {
            try {
                jSONObjectJsonObjectInit = strB.length() == 0 ? IronSourceVideoBridge.jsonObjectInit() : IronSourceVideoBridge.jsonObjectInit(strB);
            } catch (Exception unused) {
                return IronSourceVideoBridge.jsonObjectInit();
            }
        }
        return jSONObjectJsonObjectInit;
    }

    private final RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44960f, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f30034a = relativeLayout;
        setContentView(relativeLayout, c());
        Qf qf2 = new Qf(this, this, b(), a());
        this.f30035b = qf2;
        Lf lf2 = new Lf(qf2);
        this.f30036c = lf2;
        lf2.d();
        RelativeLayout relativeLayout2 = this.f30034a;
        Qf qf3 = null;
        if (relativeLayout2 == null) {
            p.B("mContainer");
            relativeLayout2 = null;
        }
        Qf qf4 = this.f30035b;
        if (qf4 == null) {
            p.B("mWebViewWrapper");
        } else {
            qf3 = qf4;
        }
        relativeLayout2.addView(qf3.d(), c());
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f30034a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        p.B("mContainer");
        return null;
    }

    @Override // com.ironsource.V8
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: h7.b
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(this.f53795b);
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Lf lf2 = this.f30036c;
        Qf qf2 = null;
        if (lf2 == null) {
            p.B("mNativeBridge");
            lf2 = null;
        }
        lf2.a();
        RelativeLayout relativeLayout = this.f30034a;
        if (relativeLayout == null) {
            p.B("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        Qf qf3 = this.f30035b;
        if (qf3 == null) {
            p.B("mWebViewWrapper");
        } else {
            qf2 = qf3;
        }
        qf2.a();
        super.onDestroy();
    }

    @Override // com.ironsource.V8
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: h7.a
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(this.f53794b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity) {
        p.j(testSuiteActivity, "this$0");
        testSuiteActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity) {
        p.j(testSuiteActivity, "this$0");
        Qf qf2 = testSuiteActivity.f30035b;
        Qf qf3 = null;
        if (qf2 == null) {
            p.B("mWebViewWrapper");
            qf2 = null;
        }
        if (qf2.c().getParent() == null) {
            RelativeLayout relativeLayout = testSuiteActivity.f30034a;
            if (relativeLayout == null) {
                p.B("mContainer");
                relativeLayout = null;
            }
            Qf qf4 = testSuiteActivity.f30035b;
            if (qf4 == null) {
                p.B("mWebViewWrapper");
                qf4 = null;
            }
            relativeLayout.removeView(qf4.d());
            RelativeLayout relativeLayout2 = testSuiteActivity.f30034a;
            if (relativeLayout2 == null) {
                p.B("mContainer");
                relativeLayout2 = null;
            }
            Qf qf5 = testSuiteActivity.f30035b;
            if (qf5 == null) {
                p.B("mWebViewWrapper");
                qf5 = null;
            }
            relativeLayout2.addView(qf5.c(), testSuiteActivity.c());
            Qf qf6 = testSuiteActivity.f30035b;
            if (qf6 == null) {
                p.B("mWebViewWrapper");
            } else {
                qf3 = qf6;
            }
            qf3.b();
        }
    }
}
