package com.mbridge.msdk.dycreator.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.dycreator.binding.b;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;

/* JADX INFO: loaded from: classes11.dex */
public class MBSplashViewVModel implements BaseViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f34474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f34475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f34476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f34477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f34478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DyOption f34479f;

    private void a(Object obj) {
        c cVar = this.f34475b;
        if (cVar != null) {
            cVar.a(obj);
        }
    }

    private void b(Object obj) {
        d dVar = this.f34474a;
        if (dVar != null) {
            dVar.a(obj);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34480a;

        static {
            int[] iArr = new int[EAction.values().length];
            f34480a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34480a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void c(Object obj) {
        f fVar = this.f34476c;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f34475b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f34474a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f34478e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f34476c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        MBSplashData mBSplashData = new MBSplashData(this.f34479f);
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            DyOption dyOption = this.f34479f;
            if (dyOption != null) {
                CampaignEx campaignEx = dyOption.getCampaignEx();
                if (campaignEx != null) {
                    mBSplashData.setAdClickText(campaignEx.getAdCall());
                }
                mBSplashData.setCountDownText(contextD.getResources().getString(i0.a(contextD, this.f34479f.isCanSkip() ? "mbridge_splash_count_time_can_skip" : "mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING)));
            }
            mBSplashData.setNoticeImage(i0.a(contextD, "mbridge_splash_notice", "drawable"));
            String strP = m0.p(contextD);
            mBSplashData.setLogoText((TextUtils.isEmpty(strP) || !strP.contains("zh")) ? "AD" : "广告");
        }
        b(mBSplashData);
        a(mBSplashData);
        c(mBSplashData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f34477d = hVar;
        }
    }

    public MBSplashViewVModel(DyOption dyOption) {
        String campaignUnitId;
        this.f34479f = dyOption;
        if (dyOption != null && dyOption.getCampaignEx() != null) {
            campaignUnitId = dyOption.getCampaignEx().getCampaignUnitId();
        } else {
            campaignUnitId = "";
        }
        if (!TextUtils.isEmpty(campaignUnitId)) {
            EventBus.getDefault().register(campaignUnitId, this);
        } else {
            EventBus.getDefault().register(this);
        }
    }

    private void a(SplashResData splashResData) {
        if (this.f34478e == null || splashResData == null) {
            return;
        }
        int i10 = AnonymousClass1.f34480a[splashResData.geteAction().ordinal()];
        if (i10 == 1 || i10 == 2) {
            b(splashResData);
        }
        this.f34478e.viewClicked(splashResData);
    }

    private void b(SplashResData splashResData) {
        try {
            String campaignUnitId = "";
            if (splashResData.getBaseViewData() != null && splashResData.getBaseViewData().getBindData() != null) {
                campaignUnitId = splashResData.getBaseViewData().getBindData().getCampaignUnitId();
            }
            if (!TextUtils.isEmpty(campaignUnitId)) {
                EventBus.getDefault().unregister(campaignUnitId);
                b.a().b();
            } else {
                EventBus.getDefault().unregister(this);
                b.a().b();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            EventBus.getDefault().unregister(this);
            EventBus.getDefault().release();
            b.a().b();
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        a(splashResData);
    }
}
