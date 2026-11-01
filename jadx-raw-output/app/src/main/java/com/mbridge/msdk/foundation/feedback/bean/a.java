package com.mbridge.msdk.foundation.feedback.bean;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: FeedBackBtnBean.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {
    private static int A = -1;
    private static String B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f34858c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FeedBackButton f34860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34861f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f34864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBFeedBackDialog f34865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Dialog f34866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONArray f34867l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f34872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<g> f34873r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f34876u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34856a = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34859d = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f34862g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34863h = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34868m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34869n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34870o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34871p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f34874s = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 20.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f34875t = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f34877v = new C0326a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f34878w = A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f34879x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f34880y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f34881z = -1;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class C0326a implements com.mbridge.msdk.widget.dialog.b {
        public C0326a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class c implements com.mbridge.msdk.widget.dialog.b {
        public c() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (z10) {
                String unused = a.B = (String) compoundButton.getText();
            }
            if (a.this.f34865j != null) {
                a.this.f34865j.setCancelButtonClickable(!TextUtils.isEmpty(a.B));
            }
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f34866k == null || !a.this.f34866k.isShowing()) {
                    return;
                }
                a.this.f34866k.dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public static class g implements com.mbridge.msdk.widget.dialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.feedback.a f34888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f34889b;

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            com.mbridge.msdk.foundation.feedback.b.f34851f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f34888a;
            if (aVar != null) {
                aVar.close();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            com.mbridge.msdk.foundation.feedback.b.f34851f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f34888a;
            if (aVar != null) {
                aVar.a(a.B);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            com.mbridge.msdk.foundation.feedback.a aVar = this.f34888a;
            if (aVar != null) {
                aVar.close();
            }
        }

        public g(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
            this.f34888a = aVar;
            this.f34889b = str;
        }

        public void a(int i10) {
            if (this.f34888a == null || i10 != 2) {
                return;
            }
            com.mbridge.msdk.foundation.feedback.b.f34851f = true;
            this.f34888a.a();
        }
    }

    private void c() {
        try {
            if (com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()) != null) {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                com.mbridge.msdk.setting.b.C0376b c0376bZ = gVarD.z();
                if (c0376bZ == null) {
                    q0.c("", "feedback fbk is null");
                    return;
                }
                d();
                this.f34865j = new MBFeedBackDialog(com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()), this.f34877v);
                FeedbackRadioGroup feedbackRadioGroupA = a(c0376bZ);
                this.f34865j.setCancelText(c0376bZ.d());
                this.f34865j.setConfirmText(c0376bZ.a());
                this.f34865j.setPrivacyText(c0376bZ.c());
                this.f34875t = c0376bZ.e();
                this.f34865j.setTitle(c0376bZ.f());
                this.f34865j.setContent(feedbackRadioGroupA);
                this.f34865j.setCancelButtonClickable(!TextUtils.isEmpty(B));
                a(feedbackRadioGroupA, c0376bZ);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        if (this.f34877v == null) {
            this.f34877v = new c();
        }
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextD);
                this.f34860e = feedBackButton;
                int i10 = 8;
                if (this.f34878w != 8) {
                    i10 = 0;
                }
                feedBackButton.setVisibility(i10);
                this.f34860e.setOnClickListener(new b());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void o() {
        if (TextUtils.isEmpty(this.f34875t)) {
            return;
        }
        try {
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            if (activityA != null) {
                View viewInflate = LayoutInflater.from(activityA).inflate(i0.a(activityA, "mbridge_cm_feedback_notice_layout", "layout"), (ViewGroup) null);
                Dialog dialog = new Dialog(activityA, 3);
                this.f34866k = dialog;
                dialog.requestWindowFeature(1);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f34866k.getWindow();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                this.f34866k.setContentView(viewInflate);
                this.f34866k.show();
                window.setAttributes(layoutParams);
                viewInflate.postDelayed(new e(), 2000L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        this.f34859d = str;
    }

    public void f() {
        FeedBackButton feedBackButton = this.f34860e;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f34860e.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f34860e.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f34860e);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f34865j;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f34865j.setListener(null);
        }
        this.f34865j = null;
        this.f34873r = null;
        this.f34860e = null;
        this.f34877v = null;
    }

    public void g() {
        MBFeedBackDialog mBFeedBackDialog = this.f34865j;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f34865j.cancel();
    }

    public CampaignEx h() {
        return this.f34858c;
    }

    public FeedBackButton i() {
        if (this.f34860e == null) {
            e();
        }
        return this.f34860e;
    }

    public int j() {
        return this.f34872q;
    }

    public int k() {
        return this.f34876u;
    }

    public a(String str) {
        this.f34873r = new ArrayList();
        this.f34864i = str;
        if (this.f34873r == null) {
            this.f34873r = new ArrayList();
        }
        d();
        e();
        c();
    }

    private void b() {
        FeedBackButton feedBackButton = this.f34860e;
        if (feedBackButton != null) {
            int i10 = this.f34880y;
            if (i10 > -1) {
                feedBackButton.setX(i10);
            }
            int i11 = this.f34881z;
            if (i11 > -1) {
                this.f34860e.setY(i11);
            }
            float f10 = this.f34856a;
            if (f10 >= 0.0f) {
                this.f34860e.setAlpha(f10);
                this.f34860e.setEnabled(this.f34856a != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f34860e.getLayoutParams();
            int i12 = this.f34879x;
            if (i12 > 0) {
                this.f34860e.setWidth(i12);
                if (layoutParams != null) {
                    layoutParams.width = this.f34879x;
                }
            }
            int i13 = this.f34863h;
            if (i13 > 0) {
                this.f34860e.setHeight(i13);
                if (layoutParams != null) {
                    layoutParams.height = this.f34863h;
                }
            }
            if (layoutParams != null) {
                this.f34860e.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f34861f)) {
                    this.f34860e.setTextColor(Color.parseColor(this.f34861f));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            float f11 = this.f34862g;
            if (f11 > 0.0f) {
                this.f34860e.setTextSize(f11);
            }
            JSONArray jSONArray = this.f34867l;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                this.f34860e.setPadding(v0.a(contextD, (float) this.f34867l.optDouble(0)), v0.a(contextD, (float) this.f34867l.optDouble(1)), v0.a(contextD, (float) this.f34867l.optDouble(2)), v0.a(contextD, (float) this.f34867l.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i14 = this.f34874s;
            if (i14 > 0) {
                gradientDrawable.setCornerRadius(i14);
            }
            if (!TextUtils.isEmpty(this.f34857b)) {
                gradientDrawable.setColor(Color.parseColor(this.f34857b));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f34860e.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f34864i, 1, 4, B, this.f34859d);
        List<g> list = this.f34873r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.b();
                }
            }
        }
        o();
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f34864i, 0, 4, B, this.f34859d);
        List<g> list = this.f34873r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f34864i, 0, 4, B, this.f34859d);
        Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
        if (contextF == null) {
            contextF = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        List<g> list = this.f34873r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        a(contextF);
        B = "";
    }

    public void p() {
        int i10;
        try {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f34864i, 0, 1, B, this.f34859d);
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            MBFeedBackDialog mBFeedBackDialog = this.f34865j;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != activityA) {
                c();
            }
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            FeedBackButton feedBackButton = this.f34860e;
            if (feedBackButton != null) {
                contextD = feedBackButton.getContext();
            }
            boolean zA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f34864i, contextD, this.f34865j);
            if (zA) {
                i10 = 2;
            } else {
                i10 = 3;
            }
            a(i10);
            if (!zA) {
                a(contextD);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(g gVar) {
        if (this.f34873r == null) {
            this.f34873r = new ArrayList();
        }
        this.f34873r.add(gVar);
    }

    public void d(int i10) {
        this.f34878w = i10;
        FeedBackButton feedBackButton = this.f34860e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i10);
        }
    }

    public void a(CampaignEx campaignEx) {
        this.f34858c = campaignEx;
    }

    private void a(int i10) {
        if (i10 == 2) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f34864i, 0, 2, B, this.f34859d);
        } else {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f34864i, 0, 3, B, this.f34859d);
        }
        List<g> list = this.f34873r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a(i10);
                }
            }
        }
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, v0.a(this.f34858c));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, v0.a(this.f34858c));
            }
        }
    }

    private FeedbackRadioGroup a(com.mbridge.msdk.setting.b.C0376b c0376b) {
        JSONArray jSONArrayB = c0376b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextD);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    public void c(int i10) {
        this.f34876u = i10;
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, com.mbridge.msdk.setting.b.C0376b c0376b) {
        JSONArray jSONArrayB = c0376b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return;
        }
        i0.a(contextD, "mbridge_cm_feedback_choice_btn_bg", "drawable");
        Resources resourcesA = i0.a(contextD);
        int iA = i0.a(contextD, "mbridge_cm_feedback_rb_text_color_color_list", "color");
        ColorStateList colorStateList = null;
        if (resourcesA != null) {
            try {
                colorStateList = resourcesA.getColorStateList(iA);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        int iA2 = v0.a(contextD, 1.0f);
        int iA3 = v0.a(contextD, 1.0f);
        int iA4 = v0.a(contextD, 1.0f);
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            String strOptString = jSONArrayB.optString(i10);
            RadioButton radioButton = new RadioButton(contextD);
            radioButton.setButtonTintList(colorStateList);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setCompoundDrawablePadding(iA2);
            radioButton.setPadding(iA2, iA3, iA2, iA3);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            int i11 = iA4 / 4;
            layoutParams.setMargins(iA4, i11, iA4, i11);
            a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    public void b(int i10) {
        this.f34872q = i10;
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new d());
        }
    }

    public void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f34860e;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f34856a);
            feedBackButton.setEnabled(this.f34856a != 0.0f);
            feedBackButton.setVisibility(this.f34878w != 8 ? 0 : 8);
            this.f34860e = feedBackButton;
            CampaignEx campaignEx = this.f34858c;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                b();
            }
            feedBackButton.setOnClickListener(new f());
        }
    }

    public void a(int i10, int i11, int i12, int i13, int i14, float f10, String str, String str2, float f11, JSONArray jSONArray) {
        if (i10 > -1) {
            this.f34880y = i10;
        }
        if (i11 > -1) {
            this.f34881z = i11;
        }
        if (i12 > -1) {
            this.f34879x = i12;
        }
        if (i13 > -1) {
            this.f34863h = i13;
        }
        if (f11 > -1.0f) {
            this.f34862g = f11;
        }
        if (jSONArray != null) {
            this.f34867l = jSONArray;
        }
        this.f34861f = str;
        this.f34857b = str2;
        this.f34856a = f10;
        this.f34874s = i14;
        b();
    }
}
