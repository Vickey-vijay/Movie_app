package com.yandex.mobile.ads.features.debugpanel.common;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import kotlinx.coroutines.d;
import nk.l0;
import yads.kc1;
import yads.mn;
import yads.xk3;
import yads.z10;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseActivity<T extends kc1> extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f51039a = z10.b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kc1 f51040c;

    public abstract xk3 c();

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44979y, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final l0 a() {
        return this.f51039a;
    }

    public final kc1 b() {
        kc1 kc1Var = this.f51040c;
        if (kc1Var != null) {
            return kc1Var;
        }
        kc1 kc1VarA = c().a();
        this.f51040c = kc1VarA;
        return kc1VarA;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return new mn(b());
    }

    public BaseActivity() {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        if (lastNonConfigurationInstance instanceof mn) {
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        mn mnVar;
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        kc1 kc1Var = null;
        if (lastNonConfigurationInstance instanceof mn) {
            mnVar = (mn) lastNonConfigurationInstance;
        } else {
            mnVar = null;
        }
        if (mnVar != null) {
            kc1 kc1Var2 = mnVar.f80285a;
            if (kc1Var2 instanceof kc1) {
                kc1Var = kc1Var2;
            }
            this.f51040c = kc1Var;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        kc1 kc1Var;
        super.onDestroy();
        d.d(this.f51039a, null, 1, null);
        if (!isChangingConfigurations() && (kc1Var = this.f51040c) != null) {
            d.d(kc1Var.f79369a, null, 1, null);
        }
    }
}
