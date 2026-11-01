package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.bt.component.d;
import com.mbridge.msdk.videocommon.setting.c;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f38414n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f38415o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CampaignEx f38417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f38420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutInflater f38421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f38424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f38425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f38426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38428m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    public JSONObject a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.f34898h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f38424i));
                jSONObject2.put(a.f34899i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f38425j));
                jSONObject2.put(a.f34903m, i10);
                try {
                    this.f38422g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                jSONObject2.put(a.f34901k, this.f38422g);
                jSONObject2.put(a.f34902l, v0.d(getContext()));
                return jSONObject2;
            } catch (JSONException e11) {
                e = e11;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e12) {
            e = e12;
        }
    }

    public void b() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public abstract void init(Context context);

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            if (viewArr[i10] == null) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    public abstract void onDestory();

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38419d = "";
        this.f38422g = 1;
        this.f38423h = false;
        this.f38416a = context;
        this.f38421f = LayoutInflater.from(context);
        init(context);
    }

    public void defaultShow() {
        q0.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return i0.a(this.f38416a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return i0.a(this.f38416a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return i0.a(this.f38416a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(this.f38416a.getApplicationContext(), str, "layout");
    }

    public CampaignEx getCampaign() {
        return this.f38417b;
    }

    public String getInstanceId() {
        return this.f38419d;
    }

    public Rect getRect() {
        return this.f38426k;
    }

    public String getUnitId() {
        return this.f38418c;
    }

    public int getViewHeight() {
        return this.f38428m;
    }

    public int getViewWidth() {
        return this.f38427l;
    }

    public boolean isLandscape() {
        return this.f38416a.getResources().getConfiguration().orientation == 2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f38422g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f38422g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f38417b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f38419d = str;
    }

    public void setLayout(int i10, int i11) {
        this.f38427l = i10;
        this.f38428m = i11;
    }

    public void setRect(Rect rect) {
        this.f38426k = rect;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f38420e = cVar;
    }

    public void setUnitId(String str) {
        this.f38418c = str;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f38424i = motionEvent.getRawX();
        this.f38425j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setLayoutCenter(int i10, int i11) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i10 != -999) {
                parentRelativeLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentRelativeLayoutParams.height = i11;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentLinearLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentLinearLayoutParams.height = i11;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentFrameLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentFrameLayoutParams.height = i11;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i11;
            parentRelativeLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentRelativeLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentRelativeLayoutParams.height = i13;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i11;
            parentLinearLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentLinearLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentLinearLayoutParams.height = i13;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i11;
            parentFrameLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentFrameLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentFrameLayoutParams.height = i13;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f38414n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            f.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            d.c().a(webView, e10.getMessage());
            q0.a(TAG, e10.getMessage());
        }
    }
}
