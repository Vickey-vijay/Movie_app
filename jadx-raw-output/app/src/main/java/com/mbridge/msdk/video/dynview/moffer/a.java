package com.mbridge.msdk.video.dynview.moffer;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.listener.g;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: MOfferEnergize.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f38638c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, SoftReference<MOfferModel>> f38639a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38640b = 500;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MOfferEnergize.java */
    public class C0397a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f38641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MOfferModel f38642b;

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            ViewGroup viewGroup2;
            if (viewGroup == null || (viewGroup2 = this.f38641a) == null) {
                return;
            }
            try {
                a.this.a(this.f38642b, viewGroup2, viewGroup, campaignUnit);
            } catch (Exception e10) {
                q0.b("MOfferEnergize", e10.getMessage());
            }
        }

        public C0397a(ViewGroup viewGroup, MOfferModel mOfferModel) {
            this.f38641a = viewGroup;
            this.f38642b = mOfferModel;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i10, String str) {
            q0.b("MOfferEnergize", str);
        }
    }

    /* JADX INFO: compiled from: MOfferEnergize.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MOfferModel f38644a;

        public b(MOfferModel mOfferModel) {
            this.f38644a = mOfferModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            MOfferModel mOfferModel = this.f38644a;
            if (mOfferModel != null) {
                mOfferModel.checkViewVisiableState();
            }
        }
    }

    /* JADX INFO: compiled from: MOfferEnergize.java */
    public class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MOfferModel f38646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f38647b;

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i10, String str) {
        }

        public c(MOfferModel mOfferModel, ViewGroup viewGroup) {
            this.f38646a = mOfferModel;
            this.f38647b = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            if (viewGroup == null || campaignUnit == null) {
                return;
            }
            try {
                a.this.a(this.f38646a, this.f38647b, viewGroup, campaignUnit);
            } catch (Exception e10) {
                q0.b("MOfferEnergize", e10.getMessage());
            }
        }
    }

    public boolean b(String str) {
        if (this.f38639a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f38639a.containsKey(str);
    }

    public static a a() {
        a aVar;
        if (f38638c != null) {
            return f38638c;
        }
        synchronized (a.class) {
            if (f38638c == null) {
                f38638c = new a();
            }
            aVar = f38638c;
        }
        return aVar;
    }

    private a() {
    }

    public void b() {
        MOfferModel mOfferModel;
        try {
            Map<String, SoftReference<MOfferModel>> map = this.f38639a;
            if (map != null) {
                for (SoftReference<MOfferModel> softReference : map.values()) {
                    if (softReference != null && (mOfferModel = softReference.get()) != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.f38639a.clear();
            }
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    public void a(ViewGroup viewGroup, String str, com.mbridge.msdk.video.module.listener.a aVar) {
        if (viewGroup == null || aVar == null || this.f38639a == null || TextUtils.isEmpty(str)) {
            return;
        }
        MOfferModel mOfferModel = null;
        if (this.f38639a.containsKey(str)) {
            SoftReference<MOfferModel> softReference = this.f38639a.get(str);
            if (softReference != null && softReference.get() != null) {
                mOfferModel = softReference.get();
            }
            if (mOfferModel == null) {
                return;
            }
            a(mOfferModel, viewGroup, aVar);
        }
    }

    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar) {
        if (mOfferModel == null) {
            return;
        }
        mOfferModel.setMoreOfferListener(new C0397a(viewGroup, mOfferModel), aVar);
        mOfferModel.showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2, CampaignUnit campaignUnit) {
        if (mOfferModel == null || viewGroup == null || viewGroup2 == null || campaignUnit == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.addRule(12, -1);
        int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
        layoutParams.setMargins(iA, iA, iA, iA);
        a(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        if (mOfferModel.getECParentTemplateCode() == 1302) {
            a(mOfferModel, viewGroup, viewGroup2);
        } else {
            a(viewGroup, viewGroup2);
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(viewGroup2, 0, v0.g(com.mbridge.msdk.foundation.controller.c.n().d()), 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), 0L);
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
        }
        viewGroup.postDelayed(new b(mOfferModel), this.f38640b + 500);
    }

    private void a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        RelativeLayout relativeLayout;
        try {
            if (viewGroup instanceof MBridgeNativeEndCardView) {
                if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                } else {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(relativeLayout);
                new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), this.f38640b);
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(a("mbridge_reward_moreoffer_layout"));
            if (relativeLayout2 == null) {
                relativeLayout2 = (RelativeLayout) viewGroup.findViewById(-82036151);
            }
            if (relativeLayout2 != null) {
                if (viewGroup.isShown()) {
                    relativeLayout2.setVisibility(0);
                    relativeLayout2.addView(viewGroup2);
                    return;
                }
                return;
            }
            viewGroup.addView(viewGroup2);
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2) {
        int iG;
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        if (mOfferModel != null) {
            try {
                if (mOfferModel.getmMainOfferCampaignEx() == null || mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode() == null) {
                    iG = 1;
                } else {
                    iG = mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode().g();
                    if (iG == 0) {
                        iG = m0.F(com.mbridge.msdk.foundation.controller.c.n().d());
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            iG = 1;
        }
        if (iG != 1 && (viewGroup instanceof MBridgeNativeEndCardView)) {
            if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                imageView2 = (ImageView) viewGroup.findViewById(-1803557032);
            } else {
                imageView2 = (ImageView) viewGroup.findViewById(a("mbridge_iv_adbanner"));
            }
            int iH = v0.h(com.mbridge.msdk.foundation.controller.c.n().d()) - v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 220.0f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams.height = iH;
            layoutParams.width = (iH * 16) / 9;
            imageView2.setLayoutParams(layoutParams);
        }
        RelativeLayout relativeLayout = null;
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                imageView = (ImageView) viewGroup.findViewById(389008949);
                textView = (TextView) viewGroup.findViewById(1561614848);
            } else {
                relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                imageView = (ImageView) viewGroup.findViewById(a("mbridge_iv_flag"));
                textView = (TextView) viewGroup.findViewById(a("mbridge_tv_flag"));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(imageView);
            arrayList.add(textView);
            new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), this.f38640b);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        layoutParams2.setMargins(0, 0, 0, 0);
        viewGroup2.setLayoutParams(layoutParams2);
        if (relativeLayout != null) {
            relativeLayout.addView(viewGroup2);
        }
    }

    private void a(ViewGroup viewGroup) {
        View viewFindViewById;
        if (viewGroup != null && viewGroup.getBackground() == null) {
            try {
                Drawable drawable = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getDrawable(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_more_offer_default_bg", "drawable"));
                if (drawable == null || (viewFindViewById = viewGroup.findViewById(a("mbridge_moreoffer_hls"))) == null) {
                    return;
                }
                viewFindViewById.setBackground(drawable);
            } catch (Exception e10) {
                q0.b("MOfferEnergize", e10.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, int i10) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f38639a == null) {
            this.f38639a = new ConcurrentHashMap();
        }
        if (this.f38639a.containsKey(str)) {
            return;
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i10);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f38639a.put(str, softReference);
                softReference.get().buildMofferAd(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    public void a(CampaignEx campaignEx, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar, int i10) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f38639a == null) {
            this.f38639a = new ConcurrentHashMap();
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i10);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f38639a.put(str, softReference);
                MOfferModel mOfferModel2 = softReference.get();
                mOfferModel2.setMoreOfferListener(new c(mOfferModel2, viewGroup), aVar);
                mOfferModel2.setIsRetry(true);
                mOfferModel2.buildMofferAd(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    private int a(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
    }
}
