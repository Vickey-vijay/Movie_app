package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.BottomNavBarStyle;
import o8.e;
import o8.k;
import o8.q;

/* JADX INFO: loaded from: classes10.dex */
public class BottomNavBar extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f32434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f32435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CheckBox f32436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PictureSelectionConfig f32437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f32438f;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            BottomNavBar bottomNavBar = BottomNavBar.this;
            bottomNavBar.f32437e.T = z10;
            bottomNavBar.f32436d.setChecked(BottomNavBar.this.f32437e.T);
            b bVar = BottomNavBar.this.f32438f;
            if (bVar != null) {
                bVar.a();
                if (z10 && j8.a.l() == 0) {
                    BottomNavBar.this.f32438f.c();
                }
            }
        }
    }

    public static class b {
        public void a() {
            throw null;
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public BottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public void c() {
    }

    public final void b() {
        if (!this.f32437e.f32247y0) {
            this.f32436d.setText(getContext().getString(R$string.ps_default_original_image));
            return;
        }
        long jA = 0;
        for (int i10 = 0; i10 < j8.a.l(); i10++) {
            jA += j8.a.n().get(i10).A();
        }
        if (jA <= 0) {
            this.f32436d.setText(getContext().getString(R$string.ps_default_original_image));
        } else {
            this.f32436d.setText(getContext().getString(R$string.ps_original_image, k.e(jA)));
        }
    }

    public void f() {
        if (this.f32437e.f32204d) {
            setVisibility(8);
            return;
        }
        BottomNavBarStyle bottomNavBarStyleB = PictureSelectionConfig.T0.b();
        if (this.f32437e.f32247y0) {
            this.f32436d.setVisibility(0);
            int iH = bottomNavBarStyleB.h();
            if (q.c(iH)) {
                this.f32436d.setButtonDrawable(iH);
            }
            String strI = bottomNavBarStyleB.i();
            if (q.f(strI)) {
                this.f32436d.setText(strI);
            }
            int iK = bottomNavBarStyleB.k();
            if (q.b(iK)) {
                this.f32436d.setTextSize(iK);
            }
            int iJ = bottomNavBarStyleB.j();
            if (q.c(iJ)) {
                this.f32436d.setTextColor(iJ);
            }
        }
        int iG = bottomNavBarStyleB.g();
        if (q.b(iG)) {
            getLayoutParams().height = iG;
        } else {
            getLayoutParams().height = e.a(getContext(), 46.0f);
        }
        int iF = bottomNavBarStyleB.f();
        if (q.c(iF)) {
            setBackgroundColor(iF);
        }
        int iN = bottomNavBarStyleB.n();
        if (q.c(iN)) {
            this.f32434b.setTextColor(iN);
        }
        int iO = bottomNavBarStyleB.o();
        if (q.b(iO)) {
            this.f32434b.setTextSize(iO);
        }
        String strM = bottomNavBarStyleB.m();
        if (q.f(strM)) {
            this.f32434b.setText(strM);
        }
        String strC = bottomNavBarStyleB.c();
        if (q.f(strC)) {
            this.f32435c.setText(strC);
        }
        int iE = bottomNavBarStyleB.e();
        if (q.b(iE)) {
            this.f32435c.setTextSize(iE);
        }
        int iD = bottomNavBarStyleB.d();
        if (q.c(iD)) {
            this.f32435c.setTextColor(iD);
        }
        int iH2 = bottomNavBarStyleB.h();
        if (q.c(iH2)) {
            this.f32436d.setButtonDrawable(iH2);
        }
        String strI2 = bottomNavBarStyleB.i();
        if (q.f(strI2)) {
            this.f32436d.setText(strI2);
        }
        int iK2 = bottomNavBarStyleB.k();
        if (q.b(iK2)) {
            this.f32436d.setTextSize(iK2);
        }
        int iJ2 = bottomNavBarStyleB.j();
        if (q.c(iJ2)) {
            this.f32436d.setTextColor(iJ2);
        }
    }

    public void g() {
        this.f32436d.setChecked(this.f32437e.T);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f32438f != null && view.getId() == R$id.ps_tv_preview) {
            this.f32438f.d();
        }
    }

    public void setOnBottomNavBarListener(b bVar) {
        this.f32438f = bVar;
    }

    public BottomNavBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e();
    }

    public void d() {
        View.inflate(getContext(), R$layout.ps_bottom_nav_bar, this);
    }

    public void e() {
        d();
        setClickable(true);
        setFocusable(true);
        this.f32437e = PictureSelectionConfig.e();
        this.f32434b = (TextView) findViewById(R$id.ps_tv_preview);
        this.f32435c = (TextView) findViewById(R$id.ps_tv_editor);
        this.f32436d = (CheckBox) findViewById(R$id.cb_original);
        this.f32434b.setOnClickListener(this);
        this.f32435c.setVisibility(8);
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_grey));
        this.f32436d.setChecked(this.f32437e.T);
        this.f32436d.setOnCheckedChangeListener(new a());
        c();
    }

    public void h() {
        b();
        BottomNavBarStyle bottomNavBarStyleB = PictureSelectionConfig.T0.b();
        if (j8.a.l() > 0) {
            this.f32434b.setEnabled(true);
            int iQ = bottomNavBarStyleB.q();
            if (q.c(iQ)) {
                this.f32434b.setTextColor(iQ);
            } else {
                this.f32434b.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_fa632d));
            }
            String strP = bottomNavBarStyleB.p();
            if (q.f(strP)) {
                if (q.d(strP)) {
                    this.f32434b.setText(String.format(strP, Integer.valueOf(j8.a.l())));
                    return;
                } else {
                    this.f32434b.setText(strP);
                    return;
                }
            }
            this.f32434b.setText(getContext().getString(R$string.ps_preview_num, Integer.valueOf(j8.a.l())));
            return;
        }
        this.f32434b.setEnabled(false);
        int iN = bottomNavBarStyleB.n();
        if (q.c(iN)) {
            this.f32434b.setTextColor(iN);
        } else {
            this.f32434b.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_9b));
        }
        String strM = bottomNavBarStyleB.m();
        if (q.f(strM)) {
            this.f32434b.setText(strM);
        } else {
            this.f32434b.setText(getContext().getString(R$string.ps_preview));
        }
    }
}
