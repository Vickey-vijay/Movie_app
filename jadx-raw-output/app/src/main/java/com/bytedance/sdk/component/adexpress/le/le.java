package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cd;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class le extends vpp {
    private qbp ouw;

    @Override // com.bytedance.sdk.component.adexpress.le.vpp, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final qbp getShakeView() {
        return this.ouw;
    }

    public final void setShakeText(String str) {
        if (this.ouw == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.ouw.setShakeText("");
        } else {
            this.ouw.setShakeText(str);
        }
    }

    public le(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setBackground(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_splash_unlock_btn_bg"));
        linearLayout.setPadding(cd.ouw(context, 38.0f), cd.ouw(context, 20.0f), cd.ouw(context, 38.0f), cd.ouw(context, 20.0f));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        View imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView.setBackground(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_splash_shake_hand"));
        TextView textView = new TextView(context);
        textView.setId(2097610747);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(cd.ouw(context, 8.0f), 0, 0, 0);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(2, 17.0f);
        textView.setTextColor(-1);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        qbp qbpVar = new qbp(context, linearLayout, i10, i11, i12, jSONObject);
        this.ouw = qbpVar;
        addView(qbpVar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        this.ouw.setLayoutParams(layoutParams2);
    }
}
