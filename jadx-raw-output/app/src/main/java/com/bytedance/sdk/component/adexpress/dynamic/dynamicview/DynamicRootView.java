package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.yu, com.bytedance.sdk.component.adexpress.theme.ouw {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private fkw dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.le.ouw mDynamicClickListener;
    public boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.vt.cf mRenderListener;
    private com.bytedance.sdk.component.adexpress.vt.mwh mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.vt muteListener;
    public final com.bytedance.sdk.component.adexpress.vt.jg renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.lh> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.fkw videoListener;
    public View videoView;

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
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

    public fkw renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, ViewGroup viewGroup, int i10) {
        fkw uqVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar;
        com.bytedance.sdk.component.adexpress.vt.mwh renderRequest;
        if (pnoVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list = pnoVar.tlj;
        Context context = this.mContext;
        if (context != null && (fkwVar = pnoVar.bly) != null) {
            switch (fkwVar.ouw()) {
                case -1:
                    uqVar = new uq(context, this, pnoVar);
                    break;
                case 0:
                    uqVar = new tc(context, this, pnoVar);
                    break;
                case 1:
                    uqVar = new cf(context, this, pnoVar);
                    break;
                case 2:
                    uqVar = new ra(context, this, pnoVar);
                    break;
                case 3:
                    uqVar = new bly(context, this, pnoVar);
                    break;
                case 4:
                    uqVar = new mwh(context, this, pnoVar);
                    break;
                case 5:
                    uqVar = new jg(context, this, pnoVar);
                    break;
                case 6:
                case 9:
                case 17:
                    uqVar = new le(context, this, pnoVar);
                    break;
                case 7:
                    uqVar = new fvf(context, this, pnoVar);
                    break;
                case 8:
                    uqVar = new vm(context, this, pnoVar);
                    break;
                case 10:
                    uqVar = new rn(context, this, pnoVar);
                    break;
                case 11:
                    uqVar = new ex(context, this, pnoVar);
                    break;
                case 12:
                    uqVar = new tlj(context, this, pnoVar);
                    break;
                case 13:
                    uqVar = new ksc(context, this, pnoVar);
                    break;
                case 14:
                    uqVar = new jae(context, this, pnoVar);
                    break;
                case 15:
                    uqVar = !com.bytedance.sdk.component.adexpress.yu.vt() ? new cd(context, this, pnoVar) : new od(context, this, pnoVar);
                    break;
                case 16:
                    uqVar = new cf(context, this, pnoVar);
                    break;
                case 18:
                    uqVar = new jqy(context, this, pnoVar);
                    break;
                case 19:
                    uqVar = new vpp(context, this, pnoVar);
                    break;
                case 20:
                    uqVar = new qbp(context, this, pnoVar);
                    break;
                case 21:
                    uqVar = new zin(context, this, pnoVar);
                    break;
                case 22:
                    uqVar = new pno(context, this, pnoVar);
                    break;
                case 23:
                    uqVar = new zih(context, this, pnoVar);
                    break;
                case 24:
                    uqVar = new yu(context, this, pnoVar);
                    break;
                case 25:
                    uqVar = new ryl(context, this, pnoVar);
                    break;
                case 26:
                    uqVar = !"vertical".equals(pnoVar.bly.f11431lh.fwd) ? new lh(context, this, pnoVar) : new pd(context, this, pnoVar);
                    break;
                case 27:
                    uqVar = new cd(context, this, pnoVar);
                    break;
                case 28:
                    if (com.bytedance.sdk.component.adexpress.yu.vt() && (renderRequest = getRenderRequest()) != null) {
                        com.bytedance.sdk.component.utils.ko.vt("DynamicViewFactory", "type is lottie");
                        uqVar = new ko(context, this, pnoVar, renderRequest.jqy);
                    } else {
                        uqVar = null;
                    }
                    break;
                default:
                    uqVar = null;
                    break;
            }
        } else {
            uqVar = null;
        }
        if (uqVar instanceof uq) {
            callBackRenderFail(i10 == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(pnoVar);
        uqVar.vt();
        if (viewGroup != null) {
            viewGroup.addView(uqVar);
            setClipChildren(viewGroup, pnoVar);
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), uqVar, i10);
        }
        return uqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < this.timeOutListener.size(); i12++) {
            if (this.timeOutListener.get(i12) != null) {
                this.timeOutListener.get(i12).ouw(charSequence, i10 == 1, i11, z10);
            }
        }
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar = pnoVar.bly;
        if (fkwVar == null || (leVar = fkwVar.f11431lh) == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = this.renderResult;
        boolean z10 = leVar.zjp;
        if (jgVar.f11586ko) {
            return;
        }
        jgVar.f11586ko = z10;
    }

    private boolean checkSizeValid() {
        fkw fkwVar = this.dynamicBaseWidget;
        return fkwVar.fkw > 0.0f && fkwVar.f11365le > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = pnoVar.bly.f11431lh;
        if (leVar.zvq < 0 || leVar.myk < 0 || leVar.mt < 0 || leVar.xdk < 0) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(false);
                viewGroup3.setClipToPadding(false);
            }
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible(fkw fkwVar, int i10) {
        if (fkwVar == null) {
            return;
        }
        if (fkwVar.getBeginInvisibleAndShow()) {
            fkwVar.setVisibility(i10);
            View view = fkwVar.f11364ko;
            if (view != null) {
                view.setVisibility(i10);
            }
        }
        int childCount = fkwVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            if (fkwVar.getChildAt(i11) instanceof fkw) {
                beginShowFromInvisible((fkw) fkwVar.getChildAt(i11), i10);
            }
        }
    }

    public void callBackRenderFail(int i10, String str) {
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = this.renderResult;
        jgVar.vt = false;
        jgVar.f11585jg = i10;
        jgVar.mwh = str;
        this.mRenderListener.ouw(jgVar);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.le.ouw getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.vt.cf getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.vt.mwh getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.lh> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.ouw
    public void onThemeChanged(int i10) {
        fkw fkwVar = this.dynamicBaseWidget;
        if (fkwVar == null) {
            return;
        }
        fkwVar.ouw(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void onvideoComplate() {
        try {
            this.videoListener.ouw();
        } catch (Exception unused) {
        }
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i10) {
        this.logoUnionHeight = i10;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.vt vtVar) {
        this.muteListener = vtVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.vt.cf cfVar) {
        this.mRenderListener = cfVar;
        this.mDynamicClickListener.ouw(cfVar);
    }

    public void setScoreCountWithIcon(int i10) {
        this.scoreCountWithIcon = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setSoundMute(boolean z10) {
        com.bytedance.sdk.component.adexpress.dynamic.vt vtVar = this.muteListener;
        if (vtVar != null) {
            vtVar.setSoundMute(z10);
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.lh lhVar) {
        this.timeOutListener.add(lhVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTimeUpdate(int i10) {
        this.videoListener.setTimeUpdate(i10);
    }

    public void setTimedown(int i10) {
        this.timedown = i10;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.fkw fkwVar) {
        this.videoListener = fkwVar;
    }

    public void updateRenderInfoForVideo(double d10, double d11, double d12, double d13, float f10) {
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = this.renderResult;
        jgVar.fkw = d10;
        jgVar.f11587le = d11;
        jgVar.f11584cf = d12;
        jgVar.ryl = d13;
        jgVar.f11589ra = f10;
        jgVar.pno = f10;
        jgVar.bly = f10;
        jgVar.tlj = f10;
    }

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar, com.bytedance.sdk.component.adexpress.dynamic.le.ouw ouwVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
        this.renderResult = jgVar;
        jgVar.ouw = 2;
        this.mDynamicClickListener = ouwVar;
        ouwVar.ouw(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.ouw(this);
        this.mIsMute = z10;
        this.mRenderRequest = mwhVar;
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, int i10) {
        fkw fkwVarRenderDynamicView = renderDynamicView(pnoVar, this, i10);
        this.dynamicBaseWidget = fkwVarRenderDynamicView;
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = this.renderResult;
        jgVar.vt = true;
        jgVar.f11588lh = fkwVarRenderDynamicView.fkw;
        jgVar.yu = fkwVarRenderDynamicView.f11365le;
        jgVar.f11590rn = this.videoView;
        this.mRenderListener.ouw(jgVar);
    }
}
