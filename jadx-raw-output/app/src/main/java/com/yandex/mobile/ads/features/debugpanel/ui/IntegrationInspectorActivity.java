package com.yandex.mobile.ads.features.debugpanel.ui;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import java.util.Iterator;
import kotlin.b;
import mj.g;
import nk.j;
import nk.l0;
import yads.ac1;
import yads.b90;
import yads.cc1;
import yads.e90;
import yads.et;
import yads.kc1;
import yads.m70;
import yads.o90;
import yads.q90;
import yads.vb1;
import yads.xb1;
import yads.xk3;
import yads.y80;
import yads.z70;
import yads.zb1;

/* JADX INFO: loaded from: classes2.dex */
public final class IntegrationInspectorActivity extends BaseActivity<kc1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f51041d = b.a(new vb1(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f51042e = b.a(new cc1(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f51043f = b.a(new ac1(this));

    public static final m70 a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (m70) integrationInspectorActivity.f51041d.getValue();
    }

    public static final q90 c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (q90) integrationInspectorActivity.f51042e.getValue();
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44979y, me2);
        return super.dispatchTouchEvent(me2);
    }

    public static final o90 b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (o90) integrationInspectorActivity.f51043f.getValue();
    }

    private final void d() {
        ((ImageButton) findViewById(R$id.toolbar_share_button)).setOnClickListener(new View.OnClickListener() { // from class: pe.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntegrationInspectorActivity.a(this.f66131b, view);
            }
        });
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onDestroy() {
        z70 z70Var = (z70) ((m70) this.f51041d.getValue()).f80112r.getValue();
        Iterator it = z70Var.f85234b.iterator();
        while (it.hasNext()) {
            ((et) it.next()).cancel();
        }
        z70Var.f85234b.clear();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IntegrationInspectorActivity integrationInspectorActivity, View view) {
        integrationInspectorActivity.b().a(e90.f76989a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
    public final xk3 c() {
        return ((m70) this.f51041d.getValue()).a();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().a(b90.f75768a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_debug);
        d();
        b().a(y80.f84842a);
        l0 l0VarA = a();
        j.d(l0VarA, null, null, new xb1(this, null), 3, null);
        j.d(l0VarA, null, null, new zb1(this, null), 3, null);
    }
}
