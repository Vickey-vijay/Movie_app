package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.dycreator.utils.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MBButton extends Button implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f33998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f33999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34000c;

    public MBButton(Context context) {
        super(context);
        this.f34000c = "";
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f33998a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f33998a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f33998a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f33998a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f33998a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f33998a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f33998a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f33998a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f33998a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f33998a.get("mbridgeStrategy");
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f34000c = "";
        this.f33998a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.f33998a, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f33999b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f33999b.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f34000c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f33999b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f33999b.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f34000c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f33999b = c.a(str);
        if (campaignEx != null) {
            this.f34000c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34000c = "";
    }
}
