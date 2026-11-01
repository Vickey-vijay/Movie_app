package sg.bigo.ads.ad.splash.a;

import android.animation.ObjectAnimator;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f69173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f69174m;

    public f(int i10, @NonNull sg.bigo.ads.api.core.f fVar, @NonNull m mVar, @Nullable m mVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(fVar, mVar, mVar2, bVar);
        this.f69173l = i10;
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final void a(ViewGroup viewGroup, int i10) {
        this.f69174m = i10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c2  */
    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull final ViewGroup viewGroup, int i10) {
        super.a(z10, viewGroup, i10);
        if (z10) {
            final RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) viewGroup.findViewById(R.id.bigo_ad_splash_media_container);
            final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container_round);
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
            if (viewGroup2 == null || roundedFrameLayout == null) {
                return;
            }
            final int iA = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 20);
            final int iA2 = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 12);
            final int iA3 = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 38);
            final int iA4 = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 190);
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams();
            marginLayoutParams.width = 0;
            marginLayoutParams.height = 0;
            viewGroup2.setLayoutParams(marginLayoutParams);
            final int iC = sg.bigo.ads.common.utils.e.c(viewGroup2.getContext());
            final int i11 = viewGroup2.getContext().getResources().getDisplayMetrics().widthPixels;
            final int i12 = (iC - iA3) - iA;
            final p pVarA = r.a(this.f69126h.f69249z);
            final p pVarA2 = p.a(pVarA.f69806b, pVarA.f69807c, i11 - (iA * 2), i12);
            final ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
            marginLayoutParams2.width = pVarA2.f69806b;
            marginLayoutParams2.height = pVarA2.f69807c;
            roundedFrameLayout.setLayoutParams(marginLayoutParams2);
            roundedFrameLayout.setCornerRadius(iA2);
            u.c(mediaView, -1, -1);
            m mVar = this.f69121c;
            int iA5 = mVar == null ? 0 : mVar.a("video_play_page.ad_component_show_time");
            int i13 = 1;
            if (iA5 == 0) {
                i13 = 0;
            } else if (iA5 != 1) {
                if (iA5 == 2) {
                    i13 = 3;
                } else if (iA5 != 3) {
                    i13 = 0;
                } else {
                    i13 = 5;
                }
            }
            viewGroup2.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (f.this.f69126h.f67544i) {
                        return;
                    }
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addTransition(new Fade());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.splash.a.f.1.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(Transition transition) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup2, "alpha", 0.0f, 1.0f);
                            objectAnimatorOfFloat.setDuration(500L);
                            objectAnimatorOfFloat.start();
                        }
                    });
                    TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                    int iA6 = iA4;
                    if (5 == f.this.f69173l) {
                        iA6 = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 80);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
                    marginLayoutParams3.width = i11 - iA;
                    marginLayoutParams3.height = iA6;
                    viewGroup2.setLayoutParams(marginLayoutParams3);
                    int i14 = i12 - iA6;
                    p pVar = pVarA2;
                    int i15 = pVar.f69807c;
                    if (i15 > i14) {
                        int i16 = (int) (((i14 * 1.0f) * pVar.f69806b) / i15);
                        p pVar2 = pVarA;
                        p pVarA3 = p.a(pVar2.f69806b, pVar2.f69807c, i16, i14);
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                        marginLayoutParams4.width = pVarA3.f69806b;
                        marginLayoutParams4.height = pVarA3.f69807c;
                        roundedFrameLayout.setLayoutParams(marginLayoutParams4);
                        roundedFrameLayout.setCornerRadius(iA2);
                    }
                    int i17 = iC;
                    int i18 = iA3;
                    int i19 = (i17 - i18) / 2;
                    marginLayoutParams2.bottomMargin = Math.abs(((((i17 - i18) - iA6) - iA) / 2) - i19);
                    roundedFrameLayout.setLayoutParams(marginLayoutParams2);
                    ViewGroup viewGroup3 = viewGroup2;
                    if (f.this.f69174m == 0) {
                        viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container);
                    }
                    sg.bigo.ads.ad.splash.a.a(viewGroup3, f.this.f69174m);
                }
            }, i13 * 1000);
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final int e() {
        return 5 == this.f69173l ? R.layout.bigo_ad_splash_style_5_card_widget : R.layout.bigo_ad_splash_style_4_cta_widget;
    }
}
