package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes7.dex */
public class MBAdChoice extends MBImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f39630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f39631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f39632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f39633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f39634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.feedback.a f39635h;

    public class a implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }

        public a() {
        }
    }

    public class b implements c {
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBAdChoice.this.setImageBitmap(bitmap);
        }
    }

    public MBAdChoice(Context context) {
        super(context);
        this.f39631d = "";
        this.f39632e = "";
        this.f39633f = "";
        this.f39630c = context;
        b();
    }

    private boolean a(CampaignEx campaignEx) {
        this.f39634g = campaignEx;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        c(campaignEx, gVarD);
        a(campaignEx, gVarD);
        b(campaignEx, gVarD);
        boolean z10 = (TextUtils.isEmpty(this.f39631d) || TextUtils.isEmpty(this.f39632e) || TextUtils.isEmpty(this.f39633f)) ? false : true;
        setImageUrl(this.f39631d);
        return z10;
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void c(CampaignEx campaignEx, g gVar) {
        this.f39634g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f39632e = gVar.c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.f39632e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.f39632e = adchoice.h();
            }
            if (TextUtils.isEmpty(this.f39632e) && gVar != null) {
                this.f39632e = gVar.c();
            }
            if (TextUtils.isEmpty(this.f39632e)) {
                this.f39632e = d.h().f35036g;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f39635h == null) {
            this.f39635h = new a();
        }
        v0.a(this.f39634g, this.f39635h, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.f39634g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.f39634g = campaignEx;
        if (a(campaignEx)) {
            a();
        }
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.f39635h = aVar;
    }

    private void b(CampaignEx campaignEx, g gVar) {
        this.f39634g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f39633f = gVar.d();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f39633f = adchoice.i();
        }
        if (!TextUtils.isEmpty(this.f39633f) || gVar == null) {
            return;
        }
        this.f39633f = gVar.d();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39631d = "";
        this.f39632e = "";
        this.f39633f = "";
        this.f39630c = context;
        b();
    }

    private void a() {
        if (this.f39630c != null) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f39631d, new b());
        }
    }

    private void a(CampaignEx campaignEx, g gVar) {
        this.f39634g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f39631d = gVar.b();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f39631d = adchoice.g();
        }
        if (!TextUtils.isEmpty(this.f39631d) || gVar == null) {
            return;
        }
        this.f39631d = gVar.b();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39631d = "";
        this.f39632e = "";
        this.f39633f = "";
        this.f39630c = context;
        b();
    }
}
