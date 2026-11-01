package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.listener.a;
import com.mbridge.msdk.video.module.listener.impl.f;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CampaignEx f38831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f38832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f38835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f38836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38841l;
    public a notifyListener;

    public MBridgeBaseView(Context context) {
        this(context, null);
    }

    public String c() {
        return a(0).toString();
    }

    public void d() {
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

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet);
        this.f38833d = 1;
        this.notifyListener = new f();
        this.f38834e = false;
        this.f38840k = 1;
        this.f38841l = 0;
        this.f38830a = context;
        this.f38832c = LayoutInflater.from(context);
        this.f38837h = z10;
        this.f38838i = i10;
        this.f38839j = z11;
        this.f38840k = i11;
        this.f38841l = i12;
        init(context);
    }

    public JSONObject a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34898h, v0.b(c.n().d(), this.f38835f));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34899i, v0.b(c.n().d(), this.f38836g));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34903m, i10);
                try {
                    this.f38833d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34901k, this.f38833d);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f34902l, v0.d(getContext()));
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

    public void defaultShow() {
        q0.a(TAG, "defaultShow");
    }

    public int filterFindViewId(boolean z10, String str) {
        return z10 ? findDyID(str) : findID(str);
    }

    public int findColor(String str) {
        return i0.a(this.f38830a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return i0.a(this.f38830a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return i0.a(this.f38830a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(this.f38830a.getApplicationContext(), str, "layout");
    }

    public CampaignEx getCampaign() {
        return this.f38831b;
    }

    public boolean isLandscape() {
        return this.f38830a.getResources().getConfiguration().orientation == 2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f38833d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f38833d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f38831b = campaignEx;
    }

    public void setNotifyListener(a aVar) {
        this.notifyListener = aVar;
    }

    public int findDyID(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
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
        this.f38835f = motionEvent.getRawX();
        this.f38836g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setLayoutCenter(int i10, int i11) {
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
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
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

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38833d = 1;
        this.notifyListener = new f();
        this.f38834e = false;
        this.f38840k = 1;
        this.f38841l = 0;
        this.f38830a = context;
        this.f38832c = LayoutInflater.from(context);
        init(context);
    }
}
