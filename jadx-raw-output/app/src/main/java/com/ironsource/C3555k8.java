package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3555k8 extends FrameLayout implements K8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29343b = "IronSourceAdContainer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3647p8 f29344a;

    /* JADX INFO: renamed from: com.ironsource.k8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29346b;

        public a(String str, String str2) {
            this.f29345a = str;
            this.f29346b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3555k8 c3555k8 = C3555k8.this;
            c3555k8.removeView(c3555k8.f29344a.getPresentingView());
            C3555k8.this.f29344a.a(this.f29345a, this.f29346b);
            C3555k8.this.f29344a = null;
        }
    }

    public C3555k8(Context context) {
        super(context);
    }

    private void b() throws Exception {
        JSONObject jSONObjectJsonObjectInit;
        try {
            jSONObjectJsonObjectInit = this.f29344a.b().a().getJSONObject(C3537j8.f29262p).getJSONObject(C3537j8.f29265s);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        }
        jSONObjectJsonObjectInit.put("adViewId", this.f29344a.a());
        this.f29344a.b().a(C3426d4.h.S, jSONObjectJsonObjectInit);
    }

    public void a() throws Exception {
        C3647p8 c3647p8 = this.f29344a;
        if (c3647p8 == null || c3647p8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44960f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public C3555k8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ironsource.K8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f29344a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.K8
    public WebView getPresentingView() {
        return this.f29344a.getPresentingView();
    }

    public C3520i8 getSize() {
        C3647p8 c3647p8 = this.f29344a;
        return c3647p8 != null ? c3647p8.c() : new C3520i8();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        Logger.i(f29343b, "onVisibilityChanged: " + i10);
        C3647p8 c3647p8 = this.f29344a;
        if (c3647p8 == null) {
            return;
        }
        try {
            c3647p8.b().a(C3537j8.f29257k, i10, isShown());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(f29343b, "onWindowVisibilityChanged: " + i10);
        C3647p8 c3647p8 = this.f29344a;
        if (c3647p8 == null) {
            return;
        }
        try {
            c3647p8.b().a(C3537j8.f29258l, i10, isShown());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C3555k8(C3647p8 c3647p8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c3647p8.c().c(), c3647p8.c().a()));
        this.f29344a = c3647p8;
        addView(c3647p8.getPresentingView());
    }

    @Override // com.ironsource.K8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f29344a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.K8
    public synchronized void a(String str, String str2) {
        C3647p8 c3647p8 = this.f29344a;
        if (c3647p8 != null && c3647p8.b() != null && this.f29344a.getPresentingView() != null) {
            this.f29344a.b().e();
            V7.f27797a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.K8
    public void a(String str, String str2, String str3) {
        C3647p8 c3647p8 = this.f29344a;
        if (c3647p8 == null) {
            return;
        }
        c3647p8.a(str, str2, str3);
    }

    @Override // com.ironsource.K8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f29344a.b(jSONObject, str, str2);
    }
}
