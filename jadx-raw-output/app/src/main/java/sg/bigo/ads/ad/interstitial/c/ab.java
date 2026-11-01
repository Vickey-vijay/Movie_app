package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes5.dex */
public class ab extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f67938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f67939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f67940r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f67941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f67942t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f67943u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f67944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private sg.bigo.ads.common.utils.n f67945w;

    public ab(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, 0, mVar, cVar);
        this.f67941s = false;
        this.f67941s = 1 == mVar.a("endpage.ep_sprt", 0);
        this.f67937o = mVar.a("endpage.ad_component_layout");
    }

    public static void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int iA = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 16);
            RoundedImageView roundedImageView = (RoundedImageView) viewGroup.findViewById(R.id.inter_icon);
            if (roundedImageView != null) {
                roundedImageView.setCornerRadius(iA);
            }
            float f10 = iA;
            viewGroup.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, (Rect) null, -1));
            sg.bigo.ads.ad.interstitial.b.f67864a.b(viewGroup);
        }
    }

    public static /* synthetic */ void a(ab abVar) {
        sg.bigo.ads.api.a.m mVar;
        String str;
        sg.bigo.ads.api.a.m mVar2;
        String str2;
        if (abVar.k() || (abVar instanceof ac)) {
            mVar = abVar.f68983g;
            str = "multi_ads_endpage.guide_click";
        } else {
            mVar = abVar.f68983g;
            str = "endpage.guide_click";
        }
        final int iA = mVar.a(str);
        if (iA > 0) {
            if (abVar.k() || (abVar instanceof ac)) {
                mVar2 = abVar.f68983g;
                str2 = "multi_ads_endpage.guide_click_timing";
            } else {
                mVar2 = abVar.f68983g;
                str2 = "endpage.guide_click_timing";
            }
            int iA2 = mVar2.a(str2, 0);
            final ViewGroup viewGroupN = abVar.n();
            ViewGroup viewGroup = abVar.f67938p;
            int i10 = R.id.inter_btn_cta_layout;
            final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(i10);
            ViewGroup viewGroup3 = null;
            if (viewGroupN != null) {
                viewGroup3 = (ViewGroup) viewGroupN.findViewById(i10);
                viewGroupN.setClipChildren(false);
            }
            final ViewGroup viewGroup4 = viewGroup3;
            if (viewGroup2 != null) {
                abVar.f67938p.setClipChildren(false);
                viewGroup2.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.ab.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ab.this.f68982f)) {
                            return;
                        }
                        int i11 = iA;
                        if (1 == i11) {
                            sg.bigo.ads.ad.interstitial.c.e(viewGroup2);
                            ViewGroup viewGroup5 = viewGroup4;
                            if (viewGroup5 != null) {
                                sg.bigo.ads.ad.interstitial.c.e(viewGroup5);
                                return;
                            }
                            return;
                        }
                        if (2 == i11) {
                            ab abVar2 = ab.this;
                            ab.a(abVar2, abVar2.f67938p);
                            ViewGroup viewGroup6 = viewGroupN;
                            if (viewGroup6 != null) {
                                ab.a(ab.this, viewGroup6);
                            }
                        }
                    }
                }, ((long) iA2) * 1000);
            }
        }
    }

    public static /* synthetic */ void a(ab abVar, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) new WeakReference(viewGroup).get();
        if (viewGroup2 != null) {
            View viewA = sg.bigo.ads.common.utils.a.a(viewGroup2.getContext(), R.layout.bigo_ad_endpage_cta_click_guide, viewGroup2, false);
            if (viewA != null) {
                viewGroup2.addView(viewA);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewA.getLayoutParams();
                layoutParams.gravity = BadgeDrawable.BOTTOM_END;
                layoutParams.bottomMargin = -sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 30);
                viewA.setLayoutParams(layoutParams);
                final View viewFindViewById = viewA.findViewById(R.id.click_gesture);
                final View viewFindViewById2 = viewA.findViewById(R.id.click_ripple);
                final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 10.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation.setDuration(200L);
                rotateAnimation.setStartOffset(560L);
                rotateAnimation.setFillAfter(true);
                final RotateAnimation rotateAnimation2 = new RotateAnimation(10.0f, 0.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation2.setDuration(240L);
                rotateAnimation2.setFillAfter(true);
                final AnimationSet animationSet = new AnimationSet(false);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                scaleAnimation.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                alphaAnimation.setFillAfter(true);
                animationSet.addAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new sg.bigo.ads.common.utils.b.d() { // from class: sg.bigo.ads.ad.interstitial.c.ab.5
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        viewFindViewById2.setVisibility(4);
                    }
                });
                rotateAnimation.setAnimationListener(new sg.bigo.ads.common.utils.b.d() { // from class: sg.bigo.ads.ad.interstitial.c.ab.6
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        viewFindViewById.startAnimation(rotateAnimation2);
                    }
                });
                rotateAnimation2.setAnimationListener(new sg.bigo.ads.common.utils.b.d() { // from class: sg.bigo.ads.ad.interstitial.c.ab.7
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        viewFindViewById.startAnimation(rotateAnimation);
                        viewFindViewById2.setVisibility(0);
                        viewFindViewById2.startAnimation(animationSet);
                    }
                });
                viewFindViewById.startAnimation(rotateAnimation);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final View a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, int i10) {
        View viewC;
        View view;
        if (qVar == 0 || viewGroup == null) {
            return this.f67930j;
        }
        this.f67930j = viewGroup;
        if (!(qVar instanceof sg.bigo.ads.ad.interstitial.g.b)) {
            if (qVar instanceof sg.bigo.ads.ad.interstitial.g.a) {
                viewC = ((sg.bigo.ads.ad.interstitial.g.a) qVar).c();
            }
            view = this.f67944v;
            if (view != null) {
                return super.a(qVar, viewGroup, i10);
            }
            this.f67930j.addView(view, new ViewGroup.LayoutParams(-1, -1));
            d(qVar);
            return this.f67944v;
        }
        viewC = ((sg.bigo.ads.ad.interstitial.g.b) qVar).g_();
        this.f67944v = viewC;
        view = this.f67944v;
        if (view != null) {
            return super.a(qVar, viewGroup, i10);
        }
        this.f67930j.addView(view, new ViewGroup.LayoutParams(-1, -1));
        d(qVar);
        return this.f67944v;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(int i10, boolean z10, boolean z11) {
        this.f67939q = z10;
        this.f67940r = i10;
        this.f67931k.setTag(34);
        ViewGroup viewGroup = this.f67930j;
        if (z11) {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f67931k, l(), m(), this.f67940r);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f67931k, l(), sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        o();
        String str = (k() || (this instanceof ac)) ? "multi_ads_endpage.ad_component_clickable_switch" : "endpage.ad_component_clickable_switch";
        sg.bigo.ads.api.a.m mVar = this.f68983g;
        a(mVar == null || mVar.a(str) == 1);
    }

    public final void a(Button button, sg.bigo.ads.ad.interstitial.q qVar) {
        sg.bigo.ads.api.a.m mVar;
        String str;
        if (button == null || qVar == null) {
            return;
        }
        int iIntValue = -16736769;
        if ((this instanceof w) || (this instanceof ac)) {
            mVar = this.f68983g;
            str = "multi_ads_endpage.cta_color";
        } else {
            mVar = this.f68983g;
            str = "endpage.cta_color";
        }
        int iA = mVar.a(str);
        if (iA == 2) {
            iIntValue = -14972829;
        } else if (iA == 3) {
            sg.bigo.ads.ad.b.b bVarM = m();
            if (bVarM.I() != null) {
                iIntValue = bVarM.I().intValue();
            }
        }
        sg.bigo.ads.ad.interstitial.d.a(button, iIntValue, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.c.ab.1
            @Override // sg.bigo.ads.common.w.b.a
            public final void b(int i10) {
                ab.a(ab.this);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        a((Button) this.f67938p.findViewById(R.id.inter_btn_cta), qVar);
    }

    public final void a(sg.bigo.ads.ad.interstitial.q qVar, final ViewGroup viewGroup, sg.bigo.ads.ad.b.b bVar) {
        a(true, false);
        if (viewGroup == null || qVar == null || bVar == null) {
            return;
        }
        final int iA = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 16);
        final RoundedImageView roundedImageView = new RoundedImageView(viewGroup.getContext());
        roundedImageView.setCornerRadius(iA);
        final int iA2 = roundedImageView.getContext().getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), p());
        final int iA3 = sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), q());
        roundedImageView.setLayoutParams(new FrameLayout.LayoutParams(iA2, iA3));
        roundedImageView.setTag(9);
        sg.bigo.ads.ad.interstitial.r.a(bVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.ab.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    return;
                }
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                if (width < iA2 || height < iA3) {
                    roundedImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    sg.bigo.ads.common.utils.d.a(roundedImageView.getContext(), bitmap2, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.ab.4.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(Bitmap bitmap3) {
                            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(viewGroup.getContext());
                            roundedFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, iA3));
                            roundedFrameLayout.setCornerRadius(iA);
                            sg.bigo.ads.common.utils.u.a(roundedFrameLayout, viewGroup, null, -1);
                            RoundedImageView roundedImageView2 = new RoundedImageView(viewGroup.getContext());
                            roundedImageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, iA3));
                            roundedImageView2.setImageBitmap(bitmap3);
                            roundedImageView2.setCornerRadius(iA);
                            roundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            roundedImageView2.setTag(9);
                            sg.bigo.ads.common.utils.u.a(roundedImageView2, roundedFrameLayout, null, -1);
                            int iA4 = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 10);
                            roundedImageView.setImageBitmap(bitmap2);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) roundedImageView.getLayoutParams();
                            layoutParams.width = -2;
                            layoutParams.height = -2;
                            layoutParams.gravity = 17;
                            layoutParams.setMargins(iA4, iA4, iA4, iA4);
                            roundedImageView.setLayoutParams(layoutParams);
                            sg.bigo.ads.common.utils.u.a(roundedImageView, roundedFrameLayout, null, -1);
                            ab.this.o();
                        }
                    });
                } else {
                    roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    sg.bigo.ads.common.utils.u.a(roundedImageView, viewGroup, null, -1);
                    roundedImageView.setImageBitmap(bitmap2);
                    ab.this.o();
                }
            }
        });
    }

    public void a(boolean z10) {
        if (this.f67943u) {
            return;
        }
        this.f67943u = true;
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f67938p, l(), m(), this.f67940r);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f67938p, l(), sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    public void a(boolean z10, boolean z11) {
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, sg.bigo.ads.ad.interstitial.t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        if (!this.f67941s) {
            return super.a(qVar, viewGroup, view, aVar, i10, i11, i12, viewArr);
        }
        View view2 = this.f67938p;
        if (view2 == null) {
            view2 = this.f67944v;
        }
        return super.a(this.f68982f, qVar, viewGroup, view2, aVar, i10, l(), i12, viewArr);
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void b() {
        super.b();
        sg.bigo.ads.common.utils.n nVar = this.f67945w;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.f67945w.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void c() {
        super.c();
        sg.bigo.ads.common.utils.n nVar = this.f67945w;
        if (nVar == null || nVar.e()) {
            return;
        }
        this.f67945w.d();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void d(final sg.bigo.ads.ad.interstitial.q qVar) {
        ViewGroup viewGroup = this.f67931k;
        if (viewGroup != null) {
            int i10 = this.f67937o;
            if (i10 == 2) {
                this.f67938p = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_all_wrap)).inflate();
            } else if (i10 == 3 || i10 == 4) {
                ViewGroup viewGroup2 = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_img_wrap)).inflate();
                this.f67938p = viewGroup2;
                a(qVar, viewGroup2, m());
            } else if (i10 != 5) {
                this.f67938p = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_half_wrap)).inflate();
                a(false, true);
            } else {
                this.f67938p = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_all_wrap)).inflate();
            }
            a((ViewGroup) this.f67938p.findViewById(R.id.bigo_ad_inter_layout_end_page));
        }
        KeyEvent.Callback callback = this.f67931k;
        if (callback == null) {
            callback = this.f67944v;
        }
        int i11 = this.f67944v == null ? 11 : 5;
        if (this.f67941s) {
            i11 = 12;
        }
        final int i12 = ((this instanceof w) || (this instanceof ac)) ? 13 : i11;
        if (qVar instanceof sg.bigo.ads.ad.interstitial.g.b) {
            ((sg.bigo.ads.ad.interstitial.g.b) qVar).b(i12);
        } else if (qVar instanceof sg.bigo.ads.ad.interstitial.g.a) {
            ((sg.bigo.ads.ad.interstitial.g.a) qVar).a(i12);
        }
        if (i12 == 12 || i12 == 13) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) m().f(), i12, 2);
        }
        if (qVar == 0 || callback == null) {
            return;
        }
        if (!(qVar instanceof sg.bigo.ads.ad.interstitial.g.a) || this.f67941s) {
            sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) this.f68983g.a("endpage.force_staying_time", 3)) * 1000) { // from class: sg.bigo.ads.ad.interstitial.c.ab.3
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    sg.bigo.ads.ad.interstitial.k.b bVar = qVar;
                    if (bVar instanceof sg.bigo.ads.ad.interstitial.g.b) {
                        ((sg.bigo.ads.ad.interstitial.g.b) bVar).a(i12);
                    } else if ((bVar instanceof sg.bigo.ads.ad.interstitial.g.a) && ab.this.f67941s) {
                        ((sg.bigo.ads.ad.interstitial.g.a) bVar).a(i12, 2);
                    }
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                }
            };
            this.f67945w = nVar;
            nVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public int h() {
        return R.layout.bigo_ad_activity_interstitial_multi_single_end;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void i() {
        AdOptionsView adOptionsView;
        if (m() == null || this.f67931k == null) {
            return;
        }
        String strI = ((sg.bigo.ads.core.a.a) m().f()).i();
        TextView textView = (TextView) this.f67931k.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.f67931k.findViewById(R.id.inter_ad_label);
        if (textView != null && textView2 != null) {
            textView.setVisibility(8);
            if (!TextUtils.isEmpty(strI)) {
                textView2.setText(sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + strI);
            }
        }
        TextView textView3 = this.f67932l;
        if (textView3 != null) {
            textView3.setText(m().getWarning());
        }
        ViewGroup viewGroup = this.f67931k;
        if (viewGroup == null || (adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.inter_options)) == 0) {
            return;
        }
        adOptionsView.setTag(4);
        adOptionsView.a((sg.bigo.ads.api.core.b) m().f(), ((sg.bigo.ads.core.a.a) m().f()).l());
    }

    public int l() {
        return this.f67941s ? 14 : 4;
    }

    public sg.bigo.ads.ad.b.b m() {
        return this.f68982f;
    }

    public ViewGroup n() {
        return null;
    }

    public void o() {
        if (this.f67942t) {
            return;
        }
        View viewFindViewWithTag = this.f67938p.findViewWithTag(9);
        if (this.f67939q && viewFindViewWithTag != null) {
            this.f67942t = true;
            sg.bigo.ads.ad.b.a.a(this.f67930j, viewFindViewWithTag, l(), m(), this.f67940r);
        } else if (viewFindViewWithTag != null) {
            this.f67942t = true;
            sg.bigo.ads.ad.b.a.a(this.f67930j, viewFindViewWithTag, l(), sg.bigo.ads.ad.interstitial.q.F, this.f67940r);
        }
    }

    public int p() {
        return 40;
    }

    public int q() {
        return 142;
    }
}
