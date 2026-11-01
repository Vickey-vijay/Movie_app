package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.mraid.b;
import com.mbridge.msdk.video.signal.h;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MBridgeH5EndCardViewDiff extends MBridgeBaseView implements h, b, j {
    public String unitId;

    public MBridgeH5EndCardViewDiff(Context context) {
        super(context);
    }

    public abstract /* synthetic */ void close();

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public abstract /* synthetic */ void expand(String str, boolean z10);

    public abstract /* synthetic */ CampaignEx getMraidCampaign();

    public abstract /* synthetic */ void handlerPlayableException(String str);

    public abstract /* synthetic */ void install(CampaignEx campaignEx);

    public abstract /* synthetic */ void notifyCloseBtn(int i10);

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public abstract /* synthetic */ void orientation(Configuration configuration);

    public abstract /* synthetic */ void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar);

    public abstract /* synthetic */ void readyStatus(int i10);

    public abstract /* synthetic */ void toggleCloseBtn(int i10);

    public abstract /* synthetic */ void unload();

    public abstract /* synthetic */ void useCustomClose(boolean z10);

    public abstract /* synthetic */ void webviewshow();

    public MBridgeH5EndCardViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void open(String str) {
        try {
            String clickURL = this.f38831b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f38831b.setClickURL(str);
                reportOpen(str);
            }
            this.f38831b.setClickTempSource(2);
            this.f38831b.setClickType(2);
            this.f38831b.setTriggerClickSource(2);
            a aVar = new a(getContext(), this.unitId);
            aVar.a(this);
            aVar.a(this.f38831b);
            this.f38831b.setClickURL(clickURL);
            this.notifyListener.a(126, "");
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f38831b.isBidCampaign());
        }
    }
}
