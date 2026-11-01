package com.bytedance.sdk.component.adexpress.lh;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.vt.le;
import com.bytedance.sdk.component.utils.cd;
import com.bytedance.sdk.component.utils.vpp;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw {
    public static View ouw(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(2097610722);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(cd.ouw(context, 110.0f), cd.ouw(context, 110.0f));
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, cd.ouw(context, 4.0f));
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(0);
        linearLayout.addView(linearLayout2);
        le leVar = new le(context);
        leVar.setId(2097610706);
        leVar.setLayoutParams(new LinearLayout.LayoutParams(cd.ouw(context, 100.0f), cd.ouw(context, 100.0f)));
        linearLayout2.addView(leVar);
        TextView textView = new TextView(context);
        textView.setId(2097610719);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView.setLayoutParams(layoutParams2);
        textView.setSingleLine(true);
        textView.setText(context.getString(vpp.vt(context, "tt_splash_wriggle_top_text")));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(null, 1);
        textView.setShadowLayer(2.0f, 0.0f, 0.5f, Color.parseColor("#4D000000"));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610718);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        textView2.setLayoutParams(layoutParams3);
        textView2.setSingleLine(true);
        textView2.setText(context.getString(vpp.vt(context, "tt_splash_wriggle_text")));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(null, 1);
        textView2.setShadowLayer(2.0f, 0.0f, 0.5f, Color.parseColor("#4D000000"));
        linearLayout.addView(textView2);
        return linearLayout;
    }
}
