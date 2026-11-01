package com.bytedance.sdk.openadsdk.lh;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class ryl extends Dialog {
    private com.bytedance.sdk.openadsdk.core.le.pno fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.yu f13245le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.vt f13246lh;
    public ouw ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final tlj f13247ra;
    private com.bytedance.sdk.openadsdk.core.le.fkw vt;
    private com.bytedance.sdk.openadsdk.core.le.pno yu;

    public interface ouw {
        void lh();

        void ouw();

        void ouw(String str);

        void vt();
    }

    public ryl(@NonNull Context context, tlj tljVar) {
        super(context, vpp.le(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.f13247ra = tljVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.le.vt vtVar = this.f13246lh;
        if (vtVar != null && (inputMethodManager = (InputMethodManager) vtVar.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(this.vt.getWindowToken(), 0);
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        Context contextOuw = zih.ouw();
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(contextOuw);
        fkwVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        fkwVar.setOrientation(1);
        fkwVar.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(contextOuw, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(contextOuw);
        raVar.setLayoutParams(new LinearLayout.LayoutParams(-1, osn.ouw(contextOuw, 48.0f)));
        this.f13245le = new com.bytedance.sdk.openadsdk.core.le.yu(contextOuw);
        int iOuw = osn.ouw(contextOuw, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOuw, iOuw);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iOuw2 = osn.ouw(contextOuw, 10.0f);
        layoutParams.topMargin = iOuw2;
        layoutParams.rightMargin = iOuw2;
        this.f13245le.setLayoutParams(layoutParams);
        this.f13245le.setClickable(true);
        this.f13245le.setFocusable(true);
        this.f13245le.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(contextOuw, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(contextOuw);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = osn.ouw(contextOuw, 12.0f);
        pnoVar.setLayoutParams(layoutParams2);
        pnoVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        pnoVar.setGravity(17);
        pnoVar.setSingleLine(true);
        pnoVar.setText(vpp.ouw(contextOuw, "tt_other_reason"));
        pnoVar.setTextColor(Color.parseColor("#161823"));
        pnoVar.setTextSize(15.0f);
        pnoVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(contextOuw);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, osn.ouw(contextOuw, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(contextOuw);
        fkwVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        fkwVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.le.vt vtVar = new com.bytedance.sdk.openadsdk.core.le.vt(contextOuw);
        this.f13246lh = vtVar;
        vtVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = osn.ouw(contextOuw, 16.0f);
        layoutParams3.rightMargin = osn.ouw(contextOuw, 16.0f);
        layoutParams3.topMargin = osn.ouw(contextOuw, 11.5f);
        this.f13246lh.setLayoutParams(layoutParams3);
        this.f13246lh.setLines(4);
        this.f13246lh.setGravity(48);
        this.f13246lh.setTextSize(15.0f);
        this.f13246lh.setTextColor(Color.rgb(22, 24, 35));
        this.f13246lh.setHintTextColor(Color.parseColor("#57161823"));
        this.f13246lh.setBackground(null);
        this.f13246lh.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(contextOuw);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int iOuw3 = osn.ouw(contextOuw, 16.0f);
        int iOuw4 = osn.ouw(contextOuw, 17.0f);
        fkwVar3.setPadding(iOuw3, iOuw4, iOuw3, iOuw4);
        fkwVar3.setLayoutParams(layoutParams4);
        fkwVar3.setOrientation(0);
        this.yu = new com.bytedance.sdk.openadsdk.core.le.pno(contextOuw);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = GravityCompat.START;
        this.yu.setLayoutParams(layoutParams5);
        this.yu.setText(String.format("0%s", "/200"));
        this.yu.setGravity(GravityCompat.START);
        this.yu.setTextColor(Color.parseColor("#57161823"));
        this.yu.setTextSize(15.0f);
        this.fkw = new com.bytedance.sdk.openadsdk.core.le.pno(contextOuw);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = GravityCompat.END;
        this.fkw.setLayoutParams(layoutParams6);
        this.fkw.setTextSize(14.0f);
        this.fkw.setTextColor(-1);
        this.fkw.setVisibility(0);
        this.fkw.setSingleLine(true);
        int iOuw5 = osn.ouw(contextOuw, 27.0f);
        int iOuw6 = osn.ouw(contextOuw, 5.0f);
        this.fkw.setPadding(iOuw5, iOuw6, iOuw5, iOuw6);
        int iOuw7 = osn.ouw(contextOuw, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f10 = iOuw7;
        gradientDrawable.setCornerRadius(f10);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f10);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.fkw.setBackground(stateListDrawable);
        this.fkw.setText(vpp.ouw(contextOuw, "tt_done"));
        this.fkw.setEnabled(false);
        fkwVar.addView(raVar);
        fkwVar.addView(view);
        fkwVar.addView(fkwVar2);
        raVar.addView(this.f13245le);
        raVar.addView(pnoVar);
        fkwVar2.addView(this.f13246lh);
        fkwVar2.addView(fkwVar3);
        fkwVar3.addView(this.yu);
        fkwVar3.addView(this.fkw);
        this.vt = fkwVar;
        setContentView(fkwVar);
        this.f13246lh.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.4
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                while (i10 < i11) {
                    int type = Character.getType(charSequence.charAt(i10));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i10++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
        tlj tljVar = this.f13247ra;
        if (tljVar != null) {
            String str = tljVar.mwh;
            if (TextUtils.isEmpty(str)) {
                z10 = true;
            } else {
                this.f13246lh.setText(str);
                z10 = true;
                this.yu.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(str.length()), "/200"));
            }
            this.fkw.setEnabled(TextUtils.isEmpty(str) ^ z10);
        }
        this.fkw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/lh/ryl$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view2);
                safedk_ryl$1_onClick_4480e3608e7ebbafe58af75c75a60794(view2);
            }

            public void safedk_ryl$1_onClick_4480e3608e7ebbafe58af75c75a60794(View p10) {
                String string = ryl.this.f13246lh.getText().toString();
                if (ryl.this.ouw != null) {
                    ouw ouwVar = ryl.this.ouw;
                    FilterWord filterWord = tlj.ouw;
                    ouwVar.ouw(string);
                }
                ryl.this.dismiss();
            }
        });
        this.f13245le.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/lh/ryl$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view2);
                safedk_ryl$2_onClick_067c3906a3c219e07367f0cdfcacbeda(view2);
            }

            public void safedk_ryl$2_onClick_067c3906a3c219e07367f0cdfcacbeda(View p10) {
                if (ryl.this.ouw != null) {
                    ryl.this.ouw.vt();
                }
                ryl.this.dismiss();
            }
        });
        this.f13246lh.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.3
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                com.bytedance.sdk.openadsdk.core.le.pno pnoVar2;
                int iRound = Math.round(charSequence.length());
                ryl.this.yu.setText(iRound + "/200");
                boolean z11 = true;
                if (iRound <= 0) {
                    pnoVar2 = ryl.this.fkw;
                    if (ryl.this.f13247ra == null || TextUtils.isEmpty(ryl.this.f13247ra.mwh)) {
                        z11 = false;
                    }
                } else if (!ryl.this.fkw.isEnabled()) {
                    pnoVar2 = ryl.this.fkw;
                } else {
                    return;
                }
                pnoVar2.setEnabled(z11);
            }
        });
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
        com.bytedance.sdk.openadsdk.core.le.vt vtVar2 = this.f13246lh;
        if (vtVar2 != null) {
            vtVar2.requestFocus();
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(5);
            }
        }
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.5
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                if (ryl.this.ouw != null) {
                    ryl.this.ouw.lh();
                }
            }
        });
    }

    public final void ouw(String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        tlj tljVar = this.f13247ra;
        if (tljVar != null) {
            tljVar.ouw(str, vppVar);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.ouw();
        }
    }
}
