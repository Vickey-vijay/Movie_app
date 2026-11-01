package com.bytedance.sdk.openadsdk.lh;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public final class fkw extends com.bytedance.sdk.openadsdk.core.le.fkw implements View.OnClickListener, tlj.lh {
    private FilterWord fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private StateListDrawable f13240le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final int f13241ra;
    private final tlj yu;
    public static FilterWord ouw = new FilterWord("100:1", "GOOD");
    public static FilterWord vt = new FilterWord("100:2", "NOT_BAD");

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static FilterWord f13239lh = new FilterWord("100:3", "BAD");

    @Override // com.bytedance.sdk.openadsdk.core.le.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/lh/fkw;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(g.f44975u, view);
        safedk_fkw_onClick_3b400ae0a8d2aaea4653ce88f76fb3d5(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.fkw, android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.lh
    public final void ouw(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.fkw) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }

    public fkw(@NonNull Context context, int i10, tlj tljVar) {
        int i11;
        float f10;
        int i12;
        super(context);
        this.f13241ra = i10;
        this.yu = tljVar;
        if (tljVar != null) {
            tljVar.ouw(this);
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.fkw = f13239lh;
                }
            } else {
                this.fkw = vt;
            }
        } else {
            this.fkw = ouw;
        }
        if (this.f13240le == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(osn.ouw(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(osn.ouw(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(osn.ouw(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f13240le = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.f13240le.addState(new int[0], gradientDrawable);
        }
        setBackground(this.f13240le);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(getContext());
        if (tljVar.fkw()) {
            i11 = 40;
        } else {
            i11 = 30;
        }
        pnoVar.setTextSize(i11);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        Context context2 = getContext();
        if (tljVar.fkw()) {
            f10 = 8.0f;
        } else {
            f10 = 4.0f;
        }
        layoutParams2.setMargins(0, osn.ouw(getContext(), 12.0f), 0, osn.ouw(context2, f10));
        addView(pnoVar, layoutParams2);
        ouw ouwVar = new ouw(getContext());
        if (tljVar.fkw()) {
            i12 = 17;
        } else {
            i12 = 12;
        }
        ouwVar.setTextSize(i12);
        ouwVar.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        ouwVar.setMaxLines(1);
        ouwVar.setSingleLine();
        ouwVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.setMargins(0, 0, 0, osn.ouw(getContext(), 12.0f));
        addView(ouwVar, layoutParams3);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ouwVar.setText(vpp.ouw(getContext(), "tt_bad"));
                    pnoVar.setText("😡");
                    return;
                }
                return;
            }
            ouwVar.setText(vpp.ouw(getContext(), "tt_not_bad"));
            pnoVar.setText("😐");
            return;
        }
        pnoVar.setText("😍");
        ouwVar.setText(vpp.ouw(getContext(), "tt_good"));
    }

    public void safedk_fkw_onClick_3b400ae0a8d2aaea4653ce88f76fb3d5(View p10) {
        if (isSelected()) {
            this.yu.ouw(tlj.ouw);
        } else {
            this.yu.ouw(this.fkw);
        }
    }
}
