package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.le.th.AnonymousClass1;
import com.bytedance.sdk.component.utils.cd;
import com.bytedance.sdk.component.utils.vpp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ko implements ra<com.bytedance.sdk.component.adexpress.le.th> {
    private JSONObject bly;
    private String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11390le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw f11391lh;
    private com.bytedance.sdk.component.adexpress.le.th ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f11392ra;
    private Context vt;
    private com.bytedance.sdk.component.adexpress.dynamic.yu.ra yu;

    public ko(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, String str, int i10, int i11, int i12, JSONObject jSONObject) {
        this.vt = context;
        this.f11391lh = fkwVar;
        this.yu = raVar;
        this.fkw = str;
        this.f11390le = i10;
        this.f11392ra = i11;
        this.pno = i12;
        this.bly = jSONObject;
        final com.bytedance.sdk.component.adexpress.dynamic.le.ouw dynamicClickListener = fkwVar.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.fkw)) {
            Context context2 = this.vt;
            LinearLayout linearLayout = new LinearLayout(context2);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context2);
            textView.setId(2097610726);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, cd.ouw(context2, 12.0f), 0, 0);
            textView.setLayoutParams(layoutParams);
            textView.setVisibility(4);
            textView.setTextSize(1, 18.0f);
            linearLayout.addView(textView);
            TextView textView2 = new TextView(context2);
            textView2.setId(2097610728);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            textView2.setLayoutParams(layoutParams2);
            textView2.setVisibility(4);
            textView2.setTextSize(1, 14.0f);
            linearLayout.addView(textView2);
            LinearLayout linearLayout2 = new LinearLayout(context2);
            linearLayout2.setId(2097610727);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            linearLayout2.setLayoutParams(layoutParams3);
            linearLayout2.setGravity(17);
            linearLayout2.setOrientation(1);
            linearLayout.addView(linearLayout2);
            ImageView imageView = new ImageView(context2);
            imageView.setId(2097610725);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(cd.ouw(context2, 60.0f), cd.ouw(context2, 60.0f)));
            imageView.setImageDrawable(vpp.lh(context2, "tt_splash_rock"));
            linearLayout2.addView(imageView);
            TextView textView3 = new TextView(context2);
            textView3.setId(2097610724);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 17;
            layoutParams4.setMargins(0, cd.ouw(context2, 12.0f), 0, 0);
            textView3.setLayoutParams(layoutParams4);
            textView3.setSingleLine(true);
            textView3.setText(context2.getString(vpp.vt(context2, "tt_splash_rock_top_text")));
            textView3.setTextColor(-1);
            textView3.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#99000000"));
            textView3.setTextSize(1, 18.0f);
            linearLayout.addView(textView3);
            TextView textView4 = new TextView(context2);
            textView4.setId(2097610723);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams5.gravity = 17;
            layoutParams5.setMargins(0, cd.ouw(context2, 12.0f), 0, 0);
            textView4.setLayoutParams(layoutParams5);
            textView4.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#99000000"));
            textView4.setTextSize(1, 14.0f);
            textView4.setText(context2.getString(vpp.vt(context2, "tt_splash_rock_text")));
            textView4.setTextColor(-1);
            linearLayout.addView(textView4);
            com.bytedance.sdk.component.adexpress.le.th thVar = new com.bytedance.sdk.component.adexpress.le.th(context2, linearLayout, this.f11390le, this.f11392ra, this.pno, this.bly);
            this.ouw = thVar;
            if (thVar.getShakeLayout() != null) {
                this.ouw.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context3 = this.vt;
            LinearLayout linearLayout3 = new LinearLayout(context3);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout3.setOrientation(1);
            View textView5 = new TextView(context3);
            textView5.setId(2097610728);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams6.gravity = 17;
            layoutParams6.setMargins(0, cd.ouw(context3, 12.0f), 0, 0);
            textView5.setLayoutParams(layoutParams6);
            textView5.setVisibility(4);
            linearLayout3.addView(textView5);
            LinearLayout linearLayout4 = new LinearLayout(context3);
            linearLayout4.setId(2097610727);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(cd.ouw(context3, 110.0f), cd.ouw(context3, 110.0f));
            layoutParams7.gravity = 17;
            linearLayout4.setLayoutParams(layoutParams7);
            linearLayout4.setGravity(17);
            linearLayout4.setOrientation(1);
            linearLayout3.addView(linearLayout4);
            TextView textView6 = new TextView(context3);
            textView6.setId(2097610726);
            textView6.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView6.setVisibility(4);
            textView6.setTextSize(2, 14.0f);
            linearLayout4.addView(textView6);
            ImageView imageView2 = new ImageView(context3);
            imageView2.setId(2097610725);
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(cd.ouw(context3, 60.0f), cd.ouw(context3, 60.0f)));
            imageView2.setImageDrawable(vpp.lh(context3, "tt_splash_rock"));
            linearLayout4.addView(imageView2);
            TextView textView7 = new TextView(context3);
            textView7.setId(2097610724);
            textView7.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView7.setSingleLine(true);
            textView7.setText("Shake it");
            textView7.setTextColor(-1);
            textView7.setTextSize(2, 14.0f);
            linearLayout4.addView(textView7);
            TextView textView8 = new TextView(context3);
            textView8.setId(2097610723);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams8.gravity = 17;
            layoutParams8.setMargins(0, cd.ouw(context3, 12.0f), 0, 0);
            textView8.setLayoutParams(layoutParams8);
            textView8.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#99000000"));
            textView8.setText("Go to details page or third-party application");
            textView8.setTextColor(-1);
            linearLayout3.addView(textView8);
            this.ouw = new com.bytedance.sdk.component.adexpress.le.th(context3, linearLayout3, this.f11390le, this.f11392ra, this.pno, this.bly);
        }
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        this.ouw.setGravity(17);
        layoutParams9.gravity = 17;
        this.ouw.setLayoutParams(layoutParams9);
        this.ouw.setTranslationY(com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, this.yu.yu.qni));
        this.ouw.setShakeText(this.yu.yu.f11460vm);
        this.ouw.setClipChildren(false);
        this.ouw.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.le.th.ouw() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.ko.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        com.bytedance.sdk.component.adexpress.le.th thVar = this.ouw;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(thVar, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        thVar.postDelayed(thVar.new AnonymousClass1(), 500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        this.ouw.clearAnimation();
    }
}
