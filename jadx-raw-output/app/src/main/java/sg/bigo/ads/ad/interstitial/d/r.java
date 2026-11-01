package sg.bigo.ads.ad.interstitial.d;

import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.bidmachine.media3.ui.DefaultTimeBar;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends m {
    private RoundedFrameLayout G;
    private LinearLayout H;
    private LinearLayout I;
    private RoundedFrameLayout J;
    private ImageView K;
    private TextView L;
    private TextView M;
    private TextView N;
    private IconListView O;
    private RoundedFrameLayout P;
    private Button Q;
    private boolean R;

    public r(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.R = false;
    }

    public static /* synthetic */ boolean b(r rVar) {
        rVar.R = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void J() {
        super.J();
        if (this.f68120s.f69010h) {
            sg.bigo.ads.ad.b.a.a(this.G, 18);
            sg.bigo.ads.ad.b.a.a(this.f68118q, this.G, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, this.f68120s.f69011i);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f68118q, this.G, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        IconListView iconListView = this.O;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i10 = 0; items != null && i10 < items.size(); i10++) {
                IconListView.a aVar = items.get(i10);
                sg.bigo.ads.ad.b.a.a(aVar.f68701d, 26);
                sg.bigo.ads.ad.b.a.a(this.f68118q, aVar.f68701d, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, this.f68120s.f69011i);
                sg.bigo.ads.ad.b.a.a(aVar.f68704g, 26);
                sg.bigo.ads.ad.b.a.a(this.f68118q, aVar.f68704g, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, this.f68120s.f69011i);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d10) {
        super.a(d10);
        if (this.R) {
            return;
        }
        if (d10 <= 3.0d) {
            Button button = this.Q;
            if (button != null) {
                button.setBackgroundColor(857743652);
                return;
            }
            return;
        }
        Button button2 = this.Q;
        if (button2 != null) {
            button2.setBackgroundColor(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void a(sg.bigo.ads.ad.interstitial.q qVar) {
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
        this.H = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_container);
        this.I = (LinearLayout) this.G.findViewById(R.id.inter_media_ad_card_top_layout);
        this.J = (RoundedFrameLayout) this.G.findViewById(R.id.inter_rounded_icon_layout);
        this.K = (ImageView) this.G.findViewById(R.id.inter_icon);
        this.L = (TextView) this.G.findViewById(R.id.inter_title);
        this.M = (TextView) this.G.findViewById(R.id.inter_company);
        this.N = (TextView) this.G.findViewById(R.id.inter_description);
        this.P = (RoundedFrameLayout) this.G.findViewById(R.id.inter_btn_cta_layout);
        this.Q = (Button) this.G.findViewById(R.id.inter_btn_cta);
        RoundedFrameLayout roundedFrameLayout2 = this.G;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.P.getCornerRadiusTopRight(), this.G.getCornerRadiusBottomLeft(), this.P.getCornerRadiusBottomRight());
        IconListView iconListView = (IconListView) this.G.findViewById(R.id.inter_download_msg);
        this.O = iconListView;
        iconListView.a(this.f68122u);
        this.O.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f68123v.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.f68123v.getContext(), 0);
        this.f68123v.setLayoutParams(marginLayoutParams2);
        this.f68116o.b(this.L);
        this.f68116o.b(this.N);
        this.f68116o.b(this.f68123v);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void b(int i10) {
        super.b(i10);
        final int iA = sg.bigo.ads.common.utils.e.a(this.f68118q.getContext(), 16);
        final int iA2 = sg.bigo.ads.common.utils.e.a(this.f68118q.getContext(), 40);
        final int iA3 = sg.bigo.ads.common.utils.e.a(this.f68118q.getContext(), 72);
        final boolean zV = v();
        if (this.f68122u != null) {
            final boolean[] zArr = {false, false};
            this.f68118q.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.r.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.t) r.this).f68936c)) {
                        return;
                    }
                    r.b(r.this);
                    final a.C0679a c0679aU = r.this.u();
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.r.1.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            r.this.H();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            zArr[0] = true;
                            RoundedFrameLayout roundedFrameLayout = r.this.P;
                            AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                            boolean[] zArr2 = zArr;
                            sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, zArr2[0], zArr2[1], zV);
                            if (c0679aU.f68147b) {
                                r rVar = r.this;
                                rVar.a(rVar.Q, new sg.bigo.ads.common.w.b.a());
                            }
                        }

                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(final Transition transition) {
                            r.this.G();
                            sg.bigo.ads.common.w.b.a(r.this.H, -1, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.d.r.1.1.1
                                @Override // sg.bigo.ads.common.w.b.a
                                public final long a() {
                                    return transition.getDuration();
                                }
                            });
                            RoundedFrameLayout roundedFrameLayout = r.this.P;
                            Button button = r.this.Q;
                            int i11 = c0679aU.f68146a;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, button, i11, zArr, zV, transition.getDuration());
                        }
                    });
                    TransitionManager.beginDelayedTransition(r.this.f68119r, transitionSet);
                    r.this.G.setCornerRadius(iA);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r.this.I.getLayoutParams();
                    int i11 = iA;
                    marginLayoutParams.setMargins(i11, i11, i11, 0);
                    r.this.I.setLayoutParams(marginLayoutParams);
                    r.this.J.setCornerRadius(iA);
                    ViewGroup.LayoutParams layoutParams = r.this.K.getLayoutParams();
                    int i12 = iA3;
                    layoutParams.width = i12;
                    layoutParams.height = i12;
                    r.this.K.setLayoutParams(layoutParams);
                    r.this.M.setVisibility(0);
                    r.this.M.setTextColor(c0679aU.f68146a);
                    r.this.N.setTextSize(2, 12.0f);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r.this.N.getLayoutParams();
                    marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(r.this.f68118q.getContext(), 4);
                    r.this.N.setLayoutParams(marginLayoutParams2);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) r.this.O.getLayoutParams();
                    marginLayoutParams3.topMargin = iA;
                    r.this.O.setLayoutParams(marginLayoutParams3);
                    if (sg.bigo.ads.common.utils.k.a((Collection) r.this.O.getItems())) {
                        r.this.O.setVisibility(8);
                    } else {
                        r.this.O.setVisibility(0);
                    }
                    r.this.I.removeView(r.this.P);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iA2);
                    int i13 = iA;
                    layoutParams2.setMargins(i13, i13, i13, i13);
                    r.this.H.addView(r.this.P, layoutParams2);
                    r rVar = r.this;
                    rVar.f68116o.a(rVar.L);
                    r rVar2 = r.this;
                    rVar2.f68116o.a(rVar2.N);
                    r.this.L.setTextColor(sg.bigo.ads.ad.interstitial.d.f68105b);
                    r.this.N.setTextColor(sg.bigo.ads.ad.interstitial.d.f68105b);
                }
            }, ((long) Math.max(1, i10)) * 1000);
        } else {
            RoundedFrameLayout roundedFrameLayout = this.P;
            if (roundedFrameLayout == null || !zV) {
                return;
            }
            sg.bigo.ads.ad.interstitial.c.e(roundedFrameLayout);
        }
    }
}
