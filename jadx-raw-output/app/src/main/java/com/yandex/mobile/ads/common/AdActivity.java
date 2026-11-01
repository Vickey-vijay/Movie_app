package com.yandex.mobile.ads.common;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Iterator;
import mj.r;
import yads.a2;
import yads.ad1;
import yads.b2;
import yads.c2;
import yads.fa2;
import yads.h2;
import yads.hl3;
import yads.i2;
import yads.ia2;
import yads.k2;
import yads.q2;
import yads.w1;
import yads.x1;
import yads.y1;
import yads.z1;
import yads.z9;

/* JADX INFO: loaded from: classes2.dex */
public final class AdActivity extends ComponentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fa2 f50964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f50965b;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44979y, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        w1 w1Var = this.f50965b;
        if (w1Var == null || w1Var.f84070c.d()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        w1 w1Var = this.f50965b;
        if (w1Var != null) {
            w1Var.f84070c.onAdClosed();
            w1Var.f84070c.g();
            w1Var.f84069b.removeAllViews();
        }
        fa2 fa2Var = this.f50964a;
        if (fa2Var != null) {
            fa2Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        w1 w1Var = this.f50965b;
        if (w1Var != null) {
            w1Var.f84070c.b();
            Iterator it = w1Var.f84071d.f75697b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).b();
            }
        }
        super.onPause();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.f50965b;
        if (w1Var != null) {
            b2 b2Var = w1Var.f84071d;
            b2Var.getClass();
            int i10 = configuration.orientation;
            if (i10 != b2Var.f75698c) {
                Iterator it = b2Var.f75696a.iterator();
                if (!it.hasNext()) {
                    b2Var.f75698c = i10;
                } else {
                    a2.a(it.next());
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Long lValueOf;
        x1 x1VarA;
        z9 z9Var;
        i2 i2Var;
        h2 h2VarA;
        w1 w1Var;
        super.onCreate(bundle);
        b2 b2Var = new b2(this);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        Intent intent = getIntent();
        r rVar = null;
        if (intent == null) {
            h2VarA = null;
        } else {
            Window window = getWindow();
            Object obj = z1.f85173b;
            z1 z1VarA = y1.a();
            try {
                if (intent.hasExtra("data_identifier")) {
                    long longExtra = intent.getLongExtra("data_identifier", -1L);
                    lValueOf = Long.valueOf(longExtra);
                    if (longExtra == -1) {
                        lValueOf = null;
                    }
                } else {
                    lValueOf = null;
                }
            } catch (Exception unused) {
                boolean z10 = ad1.f75480a;
            }
            if (lValueOf != null) {
                x1VarA = z1VarA.a(lValueOf.longValue());
            } else {
                x1VarA = null;
            }
            if (x1VarA != null) {
                try {
                    z9Var = x1VarA.f84406c;
                } catch (Exception unused2) {
                    boolean z11 = ad1.f75480a;
                    z9Var = null;
                }
            } else {
                z9Var = null;
            }
            q2 q2Var = new q2(this, z9Var);
            k2 k2VarA = k2.f79282b.a();
            synchronized (k2VarA) {
                String stringExtra = intent.getStringExtra("window_type");
                if (stringExtra == null || (i2Var = (i2) k2VarA.f79284a.get(stringExtra)) == null) {
                    h2VarA = null;
                } else {
                    h2VarA = i2Var.a(this, relativeLayout, q2Var, b2Var, intent, window, x1VarA);
                }
            }
        }
        if (h2VarA != null) {
            w1Var = new w1(this, relativeLayout, h2VarA, b2Var, new hl3());
        } else {
            w1Var = null;
        }
        this.f50965b = w1Var;
        if (w1Var != null) {
            w1Var.f84070c.f();
            w1Var.f84070c.c();
            RelativeLayout relativeLayout2 = w1Var.f84069b;
            w1Var.f84072e.getClass();
            relativeLayout2.setTag(hl3.a("root_layout"));
            w1Var.f84068a.setContentView(w1Var.f84069b);
            rVar = r.f64562a;
        }
        if (rVar == null) {
            finish();
        }
        fa2 fa2VarA = ia2.a(this, this.f50965b);
        this.f50964a = fa2VarA;
        if (fa2VarA != null) {
            fa2VarA.a();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        w1 w1Var = this.f50965b;
        if (w1Var != null) {
            w1Var.f84070c.a();
            Iterator it = w1Var.f84071d.f75697b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).a();
            }
        }
    }
}
