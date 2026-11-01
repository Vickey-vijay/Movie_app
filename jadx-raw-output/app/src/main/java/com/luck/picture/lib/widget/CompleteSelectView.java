package com.luck.picture.lib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import f8.c0;
import o8.q;
import o8.s;

/* JADX INFO: loaded from: classes.dex */
public class CompleteSelectView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f32440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f32441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animation f32442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PictureSelectionConfig f32443e;

    public CompleteSelectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public void c() {
        n8.a aVar = PictureSelectionConfig.T0;
        SelectMainStyle selectMainStyleC = aVar.c();
        if (q.c(selectMainStyleC.K())) {
            setBackgroundResource(selectMainStyleC.K());
        }
        String strL = selectMainStyleC.L();
        if (q.f(strL)) {
            if (q.e(strL)) {
                this.f32441c.setText(String.format(strL, Integer.valueOf(j8.a.l()), Integer.valueOf(this.f32443e.f32220l)));
            } else {
                this.f32441c.setText(strL);
            }
        }
        int iN = selectMainStyleC.N();
        if (q.b(iN)) {
            this.f32441c.setTextSize(iN);
        }
        int iM = selectMainStyleC.M();
        if (q.c(iM)) {
            this.f32441c.setTextColor(iM);
        }
        BottomNavBarStyle bottomNavBarStyleB = aVar.b();
        if (bottomNavBarStyleB.u()) {
            int iR = bottomNavBarStyleB.r();
            if (q.c(iR)) {
                this.f32440b.setBackgroundResource(iR);
            }
            int iT = bottomNavBarStyleB.t();
            if (q.b(iT)) {
                this.f32440b.setTextSize(iT);
            }
            int iS = bottomNavBarStyleB.s();
            if (q.c(iS)) {
                this.f32440b.setTextColor(iS);
            }
        }
    }

    public void setSelectedChange(boolean z10) {
        n8.a aVar = PictureSelectionConfig.T0;
        SelectMainStyle selectMainStyleC = aVar.c();
        if (j8.a.l() <= 0) {
            if (z10 && selectMainStyleC.T()) {
                setEnabled(true);
                int iJ = selectMainStyleC.J();
                if (q.c(iJ)) {
                    setBackgroundResource(iJ);
                } else {
                    setBackgroundResource(R$drawable.ps_ic_trans_1px);
                }
                int iP = selectMainStyleC.P();
                if (q.c(iP)) {
                    this.f32441c.setTextColor(iP);
                } else {
                    this.f32441c.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_9b));
                }
            } else {
                setEnabled(this.f32443e.O);
                int iK = selectMainStyleC.K();
                if (q.c(iK)) {
                    setBackgroundResource(iK);
                } else {
                    setBackgroundResource(R$drawable.ps_ic_trans_1px);
                }
                int iM = selectMainStyleC.M();
                if (q.c(iM)) {
                    this.f32441c.setTextColor(iM);
                } else {
                    this.f32441c.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_9b));
                }
            }
            this.f32440b.setVisibility(8);
            String strL = selectMainStyleC.L();
            if (!q.f(strL)) {
                this.f32441c.setText(getContext().getString(R$string.ps_please_select));
            } else if (q.e(strL)) {
                this.f32441c.setText(String.format(strL, Integer.valueOf(j8.a.l()), Integer.valueOf(this.f32443e.f32220l)));
            } else {
                this.f32441c.setText(strL);
            }
            int iN = selectMainStyleC.N();
            if (q.b(iN)) {
                this.f32441c.setTextSize(iN);
                return;
            }
            return;
        }
        setEnabled(true);
        int iJ2 = selectMainStyleC.J();
        if (q.c(iJ2)) {
            setBackgroundResource(iJ2);
        } else {
            setBackgroundResource(R$drawable.ps_ic_trans_1px);
        }
        String strO = selectMainStyleC.O();
        if (!q.f(strO)) {
            this.f32441c.setText(getContext().getString(R$string.ps_completed));
        } else if (q.e(strO)) {
            this.f32441c.setText(String.format(strO, Integer.valueOf(j8.a.l()), Integer.valueOf(this.f32443e.f32220l)));
        } else {
            this.f32441c.setText(strO);
        }
        int iQ = selectMainStyleC.Q();
        if (q.b(iQ)) {
            this.f32441c.setTextSize(iQ);
        }
        int iP2 = selectMainStyleC.P();
        if (q.c(iP2)) {
            this.f32441c.setTextColor(iP2);
        } else {
            this.f32441c.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_fa632d));
        }
        if (!aVar.b().u()) {
            this.f32440b.setVisibility(8);
            return;
        }
        if (this.f32440b.getVisibility() == 8 || this.f32440b.getVisibility() == 4) {
            this.f32440b.setVisibility(0);
        }
        if (TextUtils.equals(s.g(Integer.valueOf(j8.a.l())), this.f32440b.getText())) {
            return;
        }
        this.f32440b.setText(s.g(Integer.valueOf(j8.a.l())));
        c0 c0Var = PictureSelectionConfig.f32196o1;
        if (c0Var != null) {
            c0Var.a(this.f32440b);
        } else {
            this.f32440b.startAnimation(this.f32442d);
        }
    }

    public CompleteSelectView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }

    public void a() {
        LayoutInflater.from(getContext()).inflate(R$layout.ps_complete_selected_layout, this);
    }

    public final void b() {
        a();
        setOrientation(0);
        this.f32440b = (TextView) findViewById(R$id.ps_tv_select_num);
        this.f32441c = (TextView) findViewById(R$id.ps_tv_complete);
        setGravity(16);
        this.f32442d = AnimationUtils.loadAnimation(getContext(), R$anim.ps_anim_modal_in);
        this.f32443e = PictureSelectionConfig.e();
    }
}
