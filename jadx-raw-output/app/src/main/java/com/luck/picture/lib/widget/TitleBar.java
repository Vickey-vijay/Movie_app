package com.luck.picture.lib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.TitleBarStyle;
import o8.e;
import o8.q;

/* JADX INFO: loaded from: classes2.dex */
public class TitleBar extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RelativeLayout f32490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f32491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f32492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f32493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MarqueeTextView f32494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f32495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f32496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f32497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PictureSelectionConfig f32498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f32499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f32500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f32501m;

    public static class a {
        public void a() {
            throw null;
        }

        public void b(View view) {
        }

        public void c() {
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public void a() {
    }

    public void d() {
        if (this.f32498j.L) {
            this.f32499k.getLayoutParams().height = e.i(getContext());
        }
        TitleBarStyle titleBarStyleD = PictureSelectionConfig.T0.d();
        int iH = titleBarStyleD.h();
        if (q.b(iH)) {
            this.f32500l.getLayoutParams().height = iH;
        } else {
            this.f32500l.getLayoutParams().height = e.a(getContext(), 48.0f);
        }
        if (this.f32496h != null) {
            if (titleBarStyleD.s()) {
                this.f32496h.setVisibility(0);
                if (q.c(titleBarStyleD.i())) {
                    this.f32496h.setBackgroundColor(titleBarStyleD.i());
                }
            } else {
                this.f32496h.setVisibility(8);
            }
        }
        int iG = titleBarStyleD.g();
        if (q.c(iG)) {
            setBackgroundColor(iG);
        }
        int iP = titleBarStyleD.p();
        if (q.c(iP)) {
            this.f32491c.setImageResource(iP);
        }
        String strN = titleBarStyleD.n();
        if (q.f(strN)) {
            this.f32494f.setText(strN);
        }
        int iR = titleBarStyleD.r();
        if (q.b(iR)) {
            this.f32494f.setTextSize(iR);
        }
        int iQ = titleBarStyleD.q();
        if (q.c(iQ)) {
            this.f32494f.setTextColor(iQ);
        }
        if (this.f32498j.f32229p0) {
            this.f32492d.setImageResource(R$drawable.ps_ic_trans_1px);
        } else {
            int iO = titleBarStyleD.o();
            if (q.c(iO)) {
                this.f32492d.setImageResource(iO);
            }
        }
        int iF = titleBarStyleD.f();
        if (q.c(iF)) {
            this.f32490b.setBackgroundResource(iF);
        }
        if (titleBarStyleD.t()) {
            this.f32495g.setVisibility(8);
        } else {
            this.f32495g.setVisibility(0);
            int iJ = titleBarStyleD.j();
            if (q.c(iJ)) {
                this.f32495g.setBackgroundResource(iJ);
            }
            String strK = titleBarStyleD.k();
            if (q.f(strK)) {
                this.f32495g.setText(strK);
            }
            int iL = titleBarStyleD.l();
            if (q.c(iL)) {
                this.f32495g.setTextColor(iL);
            }
            int iM = titleBarStyleD.m();
            if (q.b(iM)) {
                this.f32495g.setTextSize(iM);
            }
        }
        int iC = titleBarStyleD.c();
        if (q.c(iC)) {
            this.f32493e.setBackgroundResource(iC);
        } else {
            this.f32493e.setBackgroundResource(R$drawable.ps_ic_delete);
        }
    }

    public ImageView getImageArrow() {
        return this.f32492d;
    }

    public ImageView getImageDelete() {
        return this.f32493e;
    }

    public View getTitleBarLine() {
        return this.f32496h;
    }

    public TextView getTitleCancelView() {
        return this.f32495g;
    }

    public String getTitleText() {
        return this.f32494f.getText().toString();
    }

    public void setOnTitleBarListener(a aVar) {
        this.f32501m = aVar;
    }

    public void setTitle(String str) {
        this.f32494f.setText(str);
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }

    public void b() {
        LayoutInflater.from(getContext()).inflate(R$layout.ps_title_bar, this);
    }

    public void c() {
        Context context;
        int i10;
        b();
        setClickable(true);
        setFocusable(true);
        this.f32498j = PictureSelectionConfig.e();
        this.f32499k = findViewById(R$id.top_status_bar);
        this.f32500l = (RelativeLayout) findViewById(R$id.rl_title_bar);
        this.f32491c = (ImageView) findViewById(R$id.ps_iv_left_back);
        this.f32490b = (RelativeLayout) findViewById(R$id.ps_rl_album_bg);
        this.f32493e = (ImageView) findViewById(R$id.ps_iv_delete);
        this.f32497i = findViewById(R$id.ps_rl_album_click);
        this.f32494f = (MarqueeTextView) findViewById(R$id.ps_tv_title);
        this.f32492d = (ImageView) findViewById(R$id.ps_iv_arrow);
        this.f32495g = (TextView) findViewById(R$id.ps_tv_cancel);
        this.f32496h = findViewById(R$id.title_bar_line);
        this.f32491c.setOnClickListener(this);
        this.f32495g.setOnClickListener(this);
        this.f32490b.setOnClickListener(this);
        this.f32500l.setOnClickListener(this);
        this.f32497i.setOnClickListener(this);
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_grey));
        a();
        if (TextUtils.isEmpty(this.f32498j.f32205d0)) {
            if (this.f32498j.f32200b == a8.e.b()) {
                context = getContext();
                i10 = R$string.ps_all_audio;
            } else {
                context = getContext();
                i10 = R$string.ps_camera_roll;
            }
            setTitle(context.getString(i10));
            return;
        }
        setTitle(this.f32498j.f32205d0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        int id2 = view.getId();
        if (id2 != R$id.ps_iv_left_back && id2 != R$id.ps_tv_cancel) {
            if (id2 != R$id.ps_rl_album_bg && id2 != R$id.ps_rl_album_click) {
                if (id2 == R$id.rl_title_bar && (aVar = this.f32501m) != null) {
                    aVar.c();
                    return;
                }
                return;
            }
            a aVar2 = this.f32501m;
            if (aVar2 != null) {
                aVar2.b(this);
                return;
            }
            return;
        }
        a aVar3 = this.f32501m;
        if (aVar3 != null) {
            aVar3.a();
        }
    }
}
