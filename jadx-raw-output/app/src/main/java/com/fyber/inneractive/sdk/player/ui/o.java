package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.u;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class o extends l {
    public ViewGroup J;
    public TextView K;
    public TextView L;
    public ImageView M;
    public ImageView N;
    public IAsmoothProgressBar O;
    public View P;
    public View Q;
    public View R;
    public TextView S;
    public TextView T;

    public o(Context context, com.fyber.inneractive.sdk.flow.g gVar, a aVar, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, String str) {
        super(context, gVar, aVar, rVar, str);
        this.P = null;
        this.f18082z.inflate(R.layout.ia_layout_video_view, (ViewGroup) this, true);
        q();
        com.fyber.inneractive.sdk.flow.g gVar2 = this.A;
        if (gVar2 != null) {
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar2.f15447d;
            iFyberAdIdentifier.f18536k = corner;
            iFyberAdIdentifier.a(this);
        }
        h(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i10, int i11) {
        IAsmoothProgressBar iAsmoothProgressBar = this.O;
        if (iAsmoothProgressBar == null) {
            return;
        }
        iAsmoothProgressBar.setMax(i10);
        super.a(i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void c() {
        this.f18074h = true;
        j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void d() {
        this.f18074h = false;
        k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44970p, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z10) {
        TextView textView = this.T;
        if (textView != null) {
            textView.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        g(false);
        d(false);
        f(false);
        TextView textView = this.L;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        c(false);
        a(false, (String) null);
        b(false);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z10) {
        TextView textView = this.S;
        if (textView != null) {
            textView.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z10) {
        View view = this.R;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z10) {
        IAsmoothProgressBar iAsmoothProgressBar = this.O;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return new View[]{this.L, this.S, this.T, this.M, this.O, this.P, this.f18132u};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[]{this.K, this.J};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public boolean i() {
        TextView textView = this.T;
        return textView != null && textView.getVisibility() == 0 && this.T.isEnabled();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return this.S == null && this.O == null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.N.setSelected(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.N.setSelected(false);
        }
    }

    public void q() {
        this.f18123l = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        this.f18128q = (ViewGroup) findViewById(R.id.ia_default_endcard_video_overlay);
        this.f18129r = (ViewGroup) findViewById(R.id.ia_endcard_video_overlay);
        this.f18124m = (Button) findViewById(R.id.ia_b_end_card_call_to_action);
        TextView textView = (TextView) findViewById(R.id.ia_endcard_tv_app_info_button);
        this.f18132u = textView;
        a(textView, 10);
        a(this.f18124m, 8);
        a(this.f18123l, 7);
        a(this.f18128q, -1);
        this.N = (ImageView) findViewById(R.id.ia_iv_expand_collapse_button);
        this.R = findViewById(R.id.ia_paused_video_overlay);
        this.K = (TextView) findViewById(R.id.ia_tv_app_info_button);
        this.L = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.O = (IAsmoothProgressBar) findViewById(R.id.ia_video_progressbar);
        this.J = (ViewGroup) findViewById(R.id.ia_identifier_overlay);
        this.P = findViewById(R.id.ia_click_overlay);
        this.O.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(R.id.ia_iv_mute_button);
        this.M = imageView;
        imageView.setVisibility(0);
        this.Q = findViewById(R.id.ia_buffering_overlay);
        this.S = (TextView) findViewById(R.id.ia_tv_remaining_time);
        this.T = (TextView) findViewById(R.id.ia_tv_skip);
        a(this, 7);
        a(this.L, 3);
        a(this.M, 1);
        a(this.K, 10);
        a(this.N, 5);
        a(this.R, 9);
        a(this.T, 6);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(R.drawable.ia_bg_circle_overlay);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Resources resources = getContext().getResources();
        int i10 = R.dimen.ia_image_control_size;
        layoutParams.width = (int) resources.getDimension(i10);
        layoutParams.height = (int) getContext().getResources().getDimension(i10);
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z10) {
        ImageView imageView = this.M;
        if (imageView != null) {
            imageView.setSelected(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        TextView textView = this.S;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        if (this.T != null) {
            try {
                Integer.parseInt(str);
                int i10 = R.string.ia_video_before_skip_format;
                str = String.format(Locale.US, IAConfigManager.O.f15027v.a().getString(i10), Integer.valueOf(Integer.parseInt(str)));
            } catch (Exception unused) {
            }
            this.T.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z10) {
        ViewGroup viewGroup = this.J;
        if (viewGroup != null) {
            viewGroup.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z10) {
        ImageView imageView = this.M;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final void destroy() {
        super.destroy();
        k kVar = this.D;
        if (kVar != null) {
            removeCallbacks(kVar);
            this.D = null;
        }
        p();
        ViewGroup viewGroup = this.f18123l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        TextView textView = this.T;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void a(int i10) {
        IAsmoothProgressBar iAsmoothProgressBar = this.O;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setProgress(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar) {
        String localizedCtaButtonText;
        Boolean boolC;
        TextView textView = this.L;
        if (textView != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f18133v;
            textView.setAllCaps((rVar == null || rVar.a(u.class) == null || (boolC = ((u) this.f18133v.a(u.class)).c("cta_text_all_caps")) == null) ? false : boolC.booleanValue());
            TextView textView2 = this.L;
            if (IAConfigManager.O.E.n()) {
                mVar.getClass();
                if (mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
                    localizedCtaButtonText = getContext().getString(R.string.ia_video_instant_install_text);
                } else {
                    localizedCtaButtonText = getLocalizedCtaButtonText();
                    if (TextUtils.isEmpty(localizedCtaButtonText)) {
                        localizedCtaButtonText = getContext().getString(R.string.ia_video_install_now_text);
                    }
                }
            } else {
                localizedCtaButtonText = getLocalizedCtaButtonText();
                if (TextUtils.isEmpty(localizedCtaButtonText)) {
                    localizedCtaButtonText = getContext().getString(R.string.ia_video_install_now_text);
                }
            }
            if (!TextUtils.isEmpty(this.f18134w)) {
                localizedCtaButtonText = this.f18134w;
            }
            textView2.setText(localizedCtaButtonText);
            this.L.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, String str) {
        TextView textView;
        TextView textView2 = this.K;
        if (textView2 != null) {
            textView2.setText(str);
            if (str != null && str.length() == 1) {
                setAppInfoButtonRound(this.K);
            }
            if (z10 && (textView = this.L) != null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = -2;
                this.L.setLayoutParams(layoutParams);
                this.L.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_for_cta));
            }
            this.K.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10) {
        View view = this.Q;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }
}
