package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class XMLView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, View> f33759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.inter.a f33760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.config.dynamic.baseview.touch.a f33762d;

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/cusview/XMLView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(g.f44969o, this, motionEvent);
        return safedk_XMLView_dispatchTouchEvent_73dcae2311a452433743f3d1112f61c6(motionEvent);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public Map<String, View> getRenderMap() {
        return this.f33759a;
    }

    public String getSelfTag() {
        return this.f33761c;
    }

    public com.mbridge.msdk.config.dynamic.baseview.touch.a getTouchEventData() {
        return this.f33762d;
    }

    public com.mbridge.msdk.config.component.style.inter.a getXmlViewActionListener() {
        return this.f33760b;
    }

    public void setXmlViewActionListener(com.mbridge.msdk.config.component.style.inter.a aVar) {
        this.f33760b = aVar;
    }

    public void updateTouchView(View view) {
        com.mbridge.msdk.config.dynamic.baseview.touch.a aVar = this.f33762d;
        if (aVar != null) {
            aVar.c(view);
        }
    }

    public XMLView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33759a = new HashMap();
        this.f33761c = "";
        this.f33762d = new com.mbridge.msdk.config.dynamic.baseview.touch.a();
        a();
    }

    public boolean safedk_XMLView_dispatchTouchEvent_73dcae2311a452433743f3d1112f61c6(MotionEvent p10) {
        try {
            int action = p10.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f33762d.c(p10);
                        }
                    } else {
                        this.f33762d.e(p10);
                    }
                } else {
                    this.f33762d.f(p10);
                }
            } else {
                this.f33762d.c();
                this.f33762d.d(p10);
            }
        } catch (Exception e10) {
            q0.b("RenderView", "处理触摸事件异常: " + e10.getMessage());
        }
        return super.dispatchTouchEvent(p10);
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33761c = SameMD5.getMD5(str);
    }
}
