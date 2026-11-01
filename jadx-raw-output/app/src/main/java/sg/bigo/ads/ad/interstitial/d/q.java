package sg.bigo.ads.ad.interstitial.d;

import android.graphics.Bitmap;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.bidmachine.media3.ui.DefaultTimeBar;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends m {
    private RoundedFrameLayout G;
    private LinearLayout H;
    private RoundedFrameLayout I;
    private ImageView J;
    private TextView K;
    private TextView L;
    private ImageView M;
    private RoundedFrameLayout N;
    private Button O;
    private boolean P;

    public q(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.P = false;
    }

    public static /* synthetic */ boolean b(q qVar) {
        qVar.P = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void J() {
        ViewGroup viewGroup;
        RoundedFrameLayout roundedFrameLayout;
        sg.bigo.ads.core.adview.h hVar;
        int i10;
        super.J();
        if (this.f68120s.f69010h) {
            sg.bigo.ads.ad.b.a.a(this.G, 18);
            viewGroup = this.f68118q;
            roundedFrameLayout = this.G;
            hVar = ((sg.bigo.ads.ad.interstitial.t) this).f68936c;
            i10 = this.f68120s.f69011i;
        } else {
            viewGroup = this.f68118q;
            roundedFrameLayout = this.G;
            hVar = sg.bigo.ads.ad.interstitial.q.F;
            i10 = 0;
        }
        sg.bigo.ads.ad.b.a.a(viewGroup, roundedFrameLayout, 8, hVar, i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d10) {
        super.a(d10);
        if (this.P) {
            return;
        }
        if (d10 <= 3.0d) {
            Button button = this.O;
            if (button != null) {
                button.setBackgroundColor(857743652);
                return;
            }
            return;
        }
        Button button2 = this.O;
        if (button2 != null) {
            button2.setBackgroundColor(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void a(sg.bigo.ads.ad.interstitial.q qVar) {
        Bitmap bitmapA;
        super.a(qVar);
        if (C()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((m) this).f68188y.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.height = sg.bigo.ads.common.utils.e.a(this.f68118q.getContext(), 24);
            ((m) this).f68188y.setLayoutParams(marginLayoutParams);
            ((m) this).f68188y.setVisibility(4);
        }
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.f68118q.findViewById(R.id.inter_media_ad_card_layout);
        this.G = roundedFrameLayout;
        this.H = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_info_container);
        this.I = (RoundedFrameLayout) this.G.findViewById(R.id.inter_rounded_icon_layout);
        this.J = (ImageView) this.G.findViewById(R.id.inter_icon);
        this.K = (TextView) this.G.findViewById(R.id.inter_title);
        this.L = (TextView) this.G.findViewById(R.id.inter_description);
        this.N = (RoundedFrameLayout) this.f68118q.findViewById(R.id.inter_btn_cta_layout);
        this.O = (Button) this.G.findViewById(R.id.inter_btn_cta);
        this.M = (ImageView) this.G.findViewById(R.id.inter_star);
        RoundedFrameLayout roundedFrameLayout2 = this.G;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.G.getCornerRadiusTopRight(), this.N.getCornerRadiusBottomLeft(), this.N.getCornerRadiusBottomRight());
        ImageView imageView = this.M;
        if (imageView != null && (bitmapA = sg.bigo.ads.ad.interstitial.r.a(imageView.getContext(), ((sg.bigo.ads.ad.interstitial.t) this).f68936c, this.f68122u, sg.bigo.ads.ad.interstitial.g.BLACK)) != null) {
            this.M.setImageBitmap(bitmapA);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f68123v.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.f68123v.getContext(), 0);
        this.f68123v.setLayoutParams(marginLayoutParams2);
        this.f68116o.b(this.K);
        this.f68116o.b(this.L);
        this.f68116o.b(this.f68123v);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void b(int i10) {
        super.b(i10);
        final int iA = sg.bigo.ads.common.utils.e.a(this.f68118q.getContext(), 12);
        final int iA2 = sg.bigo.ads.common.utils.e.a(this.f68118q.getContext(), 16);
        final int iA3 = sg.bigo.ads.common.utils.e.a(this.f68118q.getContext(), 20);
        final int iA4 = sg.bigo.ads.common.utils.e.a(this.f68118q.getContext(), 72);
        int iMax = Math.max(1, i10);
        final boolean[] zArr = {false, false};
        final boolean zV = v();
        this.f68118q.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.q.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.t) q.this).f68936c)) {
                    return;
                }
                q.b(q.this);
                final a.C0679a c0679aU = q.this.u();
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.addTransition(new Fade());
                transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.q.1.1
                    @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                    public final void onTransitionEnd(Transition transition) {
                        q.this.H();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        zArr[0] = true;
                        RoundedFrameLayout roundedFrameLayout = q.this.N;
                        AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                        boolean[] zArr2 = zArr;
                        sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, zArr2[0], zArr2[1], zV);
                        if (c0679aU.f68147b) {
                            q qVar = q.this;
                            qVar.a(qVar.O, new sg.bigo.ads.common.w.b.a());
                        }
                    }

                    @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                    public final void onTransitionStart(final Transition transition) {
                        q.this.G();
                        sg.bigo.ads.common.w.b.a(q.this.H, -1, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.d.q.1.1.1
                            @Override // sg.bigo.ads.common.w.b.a
                            public final long a() {
                                return transition.getDuration();
                            }
                        });
                        RoundedFrameLayout roundedFrameLayout = q.this.N;
                        Button button = q.this.O;
                        int i11 = c0679aU.f68146a;
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, button, i11, zArr, zV, transition.getDuration());
                    }
                });
                TransitionManager.beginDelayedTransition(q.this.f68119r, transitionSet);
                q.this.G.setCornerRadius(iA);
                if (q.this.C()) {
                    ViewGroup.LayoutParams layoutParams = ((m) q.this).f68188y.getLayoutParams();
                    layoutParams.height = iA2;
                    ((m) q.this).f68188y.setLayoutParams(layoutParams);
                }
                int childCount = q.this.H.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = q.this.H.getChildAt(i11);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    int i12 = iA2;
                    layoutParams2.leftMargin = i12;
                    layoutParams2.rightMargin = i12;
                    if (i11 == 0) {
                        layoutParams2.topMargin = i12;
                    }
                    if (i11 == childCount - 1) {
                        layoutParams2.bottomMargin = i12;
                    }
                    if (childAt.getId() == R.id.inter_btn_cta_layout) {
                        layoutParams2.topMargin = iA3;
                    }
                    childAt.setLayoutParams(layoutParams2);
                }
                q.this.I.setCornerRadius(iA2);
                ViewGroup.LayoutParams layoutParams3 = q.this.J.getLayoutParams();
                int i13 = iA4;
                layoutParams3.width = i13;
                layoutParams3.height = i13;
                q.this.J.setLayoutParams(layoutParams3);
                q qVar = q.this;
                qVar.f68116o.a(qVar.K);
                q qVar2 = q.this;
                qVar2.f68116o.a(qVar2.L);
                q.this.K.setTextColor(sg.bigo.ads.ad.interstitial.d.f68105b);
                q.this.L.setTextColor(sg.bigo.ads.ad.interstitial.d.f68105b);
                q.this.M.setVisibility(0);
            }
        }, ((long) iMax) * 1000);
    }
}
