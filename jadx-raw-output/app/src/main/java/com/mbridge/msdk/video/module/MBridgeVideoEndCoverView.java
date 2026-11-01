package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.listener.impl.j;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f38951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f38952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f38953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f38954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f38955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f38956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f38957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f38958t;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.notifyListener.a(104, "");
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f38951m = "MBridgeVideoEndCoverView";
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f38953o = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f38954p = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f38955q = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f38956r = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f38957s = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th2) {
            q0.b("MBridgeVideoEndCoverView", th2.getMessage());
            return false;
        }
    }

    private void e() {
        ImageView imageView;
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f38953o) != null) {
                b1.a(imageView, this.f38831b.getLocalRequestId(), this.f38831b.getLocalAllowTrackClick());
                com.mbridge.msdk.foundation.same.image.b.a(this.f38830a.getApplicationContext()).a(this.f38831b.getIconUrl(), new j(this.f38953o, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
            }
            TextView textView = this.f38955q;
            if (textView != null) {
                textView.setText(this.f38831b.getAppName());
            }
            TextView textView2 = this.f38957s;
            if (textView2 != null) {
                b1.a(textView2, this.f38831b.getLocalRequestId(), this.f38831b.getLocalAllowTrackClick());
                this.f38957s.setText(this.f38831b.getAdCall());
            }
            TextView textView3 = this.f38956r;
            if (textView3 != null) {
                textView3.setText(this.f38831b.getAppDesc());
            }
        }
    }

    private void f() {
        View view = this.f38952n;
        if (view == null) {
            init(this.f38830a);
            preLoadData(this.f38958t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f38952n.getParent()).removeView(this.f38952n);
        }
        addView(this.f38952n);
        a(this.f38952n);
        d();
    }

    public void g() {
        JSONException e10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONException e11;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34898h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f38835f));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34899i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f38836g));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34903m, 0);
                    try {
                        this.f38833d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34901k, this.f38833d);
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34902l, v0.d(getContext()));
                } catch (JSONException e13) {
                    e11 = e13;
                    q0.b("MBridgeVideoEndCoverView", e11.getMessage());
                }
            } catch (JSONException e14) {
                jSONObject2 = jSONObject3;
                e11 = e14;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f34900j, jSONObject2);
            } catch (JSONException e15) {
                e10 = e15;
                e10.printStackTrace();
            }
        } catch (JSONException e16) {
            e10 = e16;
            jSONObject = null;
        }
        this.notifyListener.a(105, jSONObject);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoend_cover");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f38832c.inflate(iFindLayout, (ViewGroup) null);
            this.f38952n = viewInflate;
            if (viewInflate != null) {
                this.f38834e = a(viewInflate);
                addView(this.f38952n, -1, -1);
                d();
            }
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f38958t = bVar;
        try {
            if (this.f38831b == null || !this.f38834e) {
                return;
            }
            e();
        } catch (Throwable th2) {
            q0.a("MBridgeVideoEndCoverView", th2.getMessage());
        }
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38951m = "MBridgeVideoEndCoverView";
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        this.f38954p.setOnClickListener(new a());
        this.f38953o.setOnClickListener(new b());
        this.f38957s.setOnClickListener(new c());
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f38835f = motionEvent.getRawX();
        this.f38836g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f38833d = configuration.orientation;
        removeView(this.f38952n);
        f();
    }
}
