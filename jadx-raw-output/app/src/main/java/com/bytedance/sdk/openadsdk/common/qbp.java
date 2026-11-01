package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class qbp extends Dialog {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final String[] f12221lh = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private Button fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private ImageView f12222le;
    public String ouw;
    private final Handler vt;
    private TextView yu;

    public qbp(@NonNull Context context) {
        super(context, vpp.le(context, "tt_privacy_dialog_theme_ad_report"));
        this.vt = new Handler(Looper.getMainLooper());
        this.ouw = "";
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        fkwVar.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_ad_report_info_bg"));
        fkwVar.setOrientation(1);
        fkwVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        raVar.setLayoutParams(new ViewGroup.LayoutParams(-1, ouw(44.0f)));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ouw(191.0f), ouw(24.0f));
        layoutParams2.addRule(13);
        pnoVar.setGravity(17);
        pnoVar.setText("Ad Report");
        pnoVar.setTextColor(Color.parseColor("#161823"));
        pnoVar.setTextSize(1, 17.0f);
        pnoVar.setLayoutParams(layoutParams2);
        this.f12222le = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ouw(40.0f), ouw(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = ouw(8.0f);
        this.f12222le.setPadding(ouw(12.0f), ouw(14.0f), ouw(12.0f), ouw(14.0f));
        this.f12222le.setImageResource(vpp.yu(context, "tt_ad_xmark"));
        this.f12222le.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, ouw(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = ouw(16.0f);
        layoutParams5.rightMargin = ouw(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(ouw(16.0f));
        layoutParams5.setMarginEnd(ouw(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        fkwVar2.setOrientation(1);
        fkwVar2.setLayoutParams(layoutParams6);
        String strRa = uoy.ra();
        String strBly = uoy.bly();
        StringBuilder sb2 = new StringBuilder("Android ");
        String str = Build.VERSION.RELEASE;
        sb2.append(str);
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        String str2 = Build.BRAND;
        sb3.append(str2);
        sb3.append(Z7.f27998r);
        String str3 = Build.MODEL;
        sb3.append(str3);
        String string2 = sb3.toString();
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVarOuw = ouw(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVarOuw2 = ouw(context, "App", strRa);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVarOuw3 = ouw(context, "App version", strBly);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVarOuw4 = ouw(context, "OS", string);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVarOuw5 = ouw(context, "Device", string2);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVarOuw6 = ouw(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, ouw(76.0f));
        fkwVar3.setBackgroundColor(-1);
        fkwVar3.setLayoutParams(layoutParams7);
        this.fkw = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iOuw = ouw(16.0f);
        layoutParams8.setMargins(iOuw, iOuw, iOuw, iOuw);
        this.fkw.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_ad_report_info_button_bg"));
        this.fkw.setText("copy all");
        this.fkw.setTextColor(Color.parseColor("#333333"));
        this.fkw.setTextSize(14.0f);
        this.fkw.setLayoutParams(layoutParams8);
        fkwVar.addView(raVar);
        raVar.addView(pnoVar);
        raVar.addView(this.f12222le);
        fkwVar.addView(view);
        fkwVar.addView(scrollView);
        scrollView.addView(fkwVar2);
        fkwVar2.addView(fkwVarOuw);
        fkwVar2.addView(fkwVarOuw2);
        fkwVar2.addView(fkwVarOuw3);
        fkwVar2.addView(fkwVarOuw4);
        fkwVar2.addView(fkwVarOuw5);
        fkwVar2.addView(fkwVarOuw6);
        fkwVar.addView(fkwVar3);
        fkwVar3.addView(this.fkw);
        setContentView(fkwVar, new ViewGroup.LayoutParams(osn.yu(getContext()), (int) (((double) osn.le(getContext())) * 0.9d)));
        final String strRa2 = uoy.ra();
        final String strBly2 = uoy.bly();
        final String str4 = "Android " + str;
        final String str5 = str2 + Z7.f27998r + str3;
        this.fkw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.qbp.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/qbp$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view2);
                safedk_qbp$1_onClick_5036710b31c2168f088d141dfa93719b(view2);
            }

            public void safedk_qbp$1_onClick_5036710b31c2168f088d141dfa93719b(View p10) {
                ClipboardManager clipboardManager = (ClipboardManager) qbp.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb4 = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strRa2, strBly2, str4, str5, qbp.this.ouw};
                    for (int i10 = 0; i10 < qbp.f12221lh.length; i10++) {
                        sb4.append(qbp.f12221lh[i10]);
                        sb4.append(": ");
                        sb4.append(strArr[i10]);
                        sb4.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb4));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.f12222le.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.qbp.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/qbp$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view2);
                safedk_qbp$2_onClick_a50731299aaa68bc37df873e42b1f09a(view2);
            }

            public void safedk_qbp$2_onClick_a50731299aaa68bc37df873e42b1f09a(View p10) {
                qbp.this.yu.setText("loading ...");
                qbp.this.cancel();
            }
        });
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    private com.bytedance.sdk.openadsdk.core.le.fkw ouw(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : ouw(74.0f));
        fkwVar.setOrientation(1);
        fkwVar.setPadding(0, ouw(16.0f), 0, ouw(16.0f));
        fkwVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = ouw(7.0f);
        pnoVar.setIncludeFontPadding(false);
        pnoVar.setText(str);
        pnoVar.setTextColor(Color.parseColor("#333333"));
        pnoVar.setTextSize(16.0f);
        pnoVar.setTypeface(Typeface.defaultFromStyle(1));
        pnoVar.setLayoutParams(layoutParams2);
        fkwVar.addView(pnoVar);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        if (str.equals("Creative info")) {
            this.yu = pnoVar2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        pnoVar2.setIncludeFontPadding(false);
        pnoVar2.setTextColor(Color.parseColor("#666666"));
        pnoVar2.setText(str2);
        pnoVar2.setTextSize(14.0f);
        pnoVar2.setLayoutParams(layoutParams3);
        fkwVar.addView(pnoVar2);
        return fkwVar;
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
            this.vt.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.qbp.3
                @Override // java.lang.Runnable
                public final void run() {
                    qbp.this.yu.setText(qbp.this.ouw);
                }
            }, 1000L);
        } catch (Exception e10) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e10);
        }
    }

    private int ouw(float f10) {
        return osn.ouw(getContext(), f10);
    }
}
