package sg.bigo.ads.ad.interstitial;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.YandexWarningTextView;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends q implements sg.bigo.ads.ad.c.a, sg.bigo.ads.ad.interstitial.f.b.InterfaceC0686b {
    private final List<Integer> G;

    @NonNull
    private final l H;
    private final WeakHashMap<Object, Integer> I;
    private final Map<Integer, WeakHashMap<Object, Runnable>> J;
    private final sg.bigo.ads.common.e.a.AbstractC0702a K;
    private boolean O;
    private Runnable P;
    private int Q;
    private int R;
    private final Runnable S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public View f67742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.a.m f67743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.a.m f67744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f67747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f67748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f67749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.interstitial.multi_img.b f67750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f67751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f67752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f67753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f67754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f67755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AtomicBoolean f67757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f67758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public p f67759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.interstitial.e.c f67760s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.interstitial.h.a f67761t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f67762u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f67763v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f67764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f67765x;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a$2, reason: invalid class name */
    public class AnonymousClass2 extends sg.bigo.ads.common.utils.n {
        public AnonymousClass2(long j10) {
            super(j10, 1000L);
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a() {
            a aVar = a.this;
            aVar.a(aVar.f67763v, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup = a.this.D;
                    if (viewGroup != null) {
                        Context context = viewGroup.getContext();
                        int i10 = R.layout.bigo_ad_view_slide_gesture;
                        ViewGroup viewGroup2 = a.this.D;
                        sg.bigo.ads.common.utils.a.a(context, i10, viewGroup2, viewGroup2 != null);
                        View viewFindViewById = a.this.D.findViewById(R.id.inter_slide_gesture_contain);
                        a aVar2 = a.this;
                        aVar2.f67742a = aVar2.D.findViewById(R.id.inter_slide_gesture);
                        View view = a.this.f67742a;
                        if (view == null) {
                            return;
                        }
                        view.setTag(16);
                        t tVarAj = a.this.aj();
                        a aVar3 = a.this;
                        tVarAj.a(aVar3.D, viewFindViewById, aVar3.ai(), 8, 0, a.this.f67742a);
                        a.this.y();
                        final View view2 = a.this.f67742a;
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(300L);
                        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation2.setDuration(200L);
                        alphaAnimation2.setStartOffset(200L);
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 160.0f, 0.0f);
                        translateAnimation.setDuration(300L);
                        final AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.addAnimation(alphaAnimation);
                        animationSet.setAnimationListener(new sg.bigo.ads.common.utils.b.d() { // from class: sg.bigo.ads.ad.interstitial.c.9

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ View f67926a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ AlphaAnimation f67927b;

                            public AnonymousClass9() {
                                view = view2;
                                alphaAnimation = alphaAnimation2;
                            }

                            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                view.startAnimation(alphaAnimation);
                            }
                        });
                        alphaAnimation2.setAnimationListener(new sg.bigo.ads.common.utils.b.d() { // from class: sg.bigo.ads.ad.interstitial.c.10

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ AnimationSet f67895a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ View f67896b;

                            public AnonymousClass10() {
                                animationSet = animationSet;
                                view = view2;
                            }

                            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                animationSet.setStartOffset(200L);
                                view.startAnimation(animationSet);
                            }
                        });
                        view2.startAnimation(animationSet);
                        a.this.f67742a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.2.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) a.this.f68586y)) {
                                    return;
                                }
                                a.this.x();
                            }
                        }, 5000L);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a(long j10) {
        }
    }

    public a(@NonNull Activity activity) {
        super(activity);
        this.G = new ArrayList();
        this.f67745d = false;
        this.f67746e = false;
        this.f67747f = false;
        this.f67748g = false;
        this.f67752k = new Handler(Looper.getMainLooper());
        this.f67754m = 0;
        this.f67755n = 0;
        this.f67756o = 0;
        this.f67757p = new AtomicBoolean(false);
        this.f67758q = true;
        this.H = new l();
        this.I = new WeakHashMap<>();
        this.J = new HashMap();
        this.K = new sg.bigo.ads.common.e.a.AbstractC0702a() { // from class: sg.bigo.ads.ad.interstitial.a.1
            @Override // sg.bigo.ads.common.e.a.AbstractC0702a
            public final void a(boolean z10) {
                a.this.c(z10);
            }
        };
        this.O = false;
        this.P = null;
        this.Q = 0;
        this.R = 0;
        this.S = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.A();
            }
        };
        sg.bigo.ads.ad.interstitial.f.b.f68433a = new WeakReference<>(this);
    }

    public static /* synthetic */ double a(int i10, int i11, int i12, int i13) {
        return Math.max(Math.abs(i10 - i12), Math.abs(i11 - i13));
    }

    private void a(sg.bigo.ads.api.a.m mVar) {
        if (mVar == null) {
            return;
        }
        this.f67750i = ((s) this.f68586y).F();
        sg.bigo.ads.core.a.a aVarI = ((s) this.f68586y).f();
        this.f67751j = new f(mVar.a("video_play_page.gp_element"), mVar.a("video_play_page.gp_force_time"), aVarI != null ? aVarI.n() : "");
    }

    private boolean ao() {
        if (!this.O) {
            return true;
        }
        if (e_() == 0) {
            return !j() || k();
        }
        return false;
    }

    private void ap() {
        t tVarAj = aj();
        if (tVarAj instanceof sg.bigo.ads.ad.interstitial.d.a) {
            if (tVarAj instanceof sg.bigo.ads.ad.interstitial.d.m) {
                ((sg.bigo.ads.ad.interstitial.d.m) tVarAj).a(this, this.D, this.f67749h, this.f67750i, this.f67751j);
            } else {
                ((sg.bigo.ads.ad.interstitial.d.a) tVarAj).a(this, this.D, this.f67749h, this.f67744c, this.f67751j);
            }
            p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void aq() {
        ViewGroup viewGroup;
        final View viewFindViewById;
        Bitmap bitmapA;
        if (!aH() || (viewGroup = this.D) == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_ad_info_card_right_bottom)) == null) {
            return;
        }
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.inter_star);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.bigo_ad_info_card_background);
        if (imageView != null && viewFindViewById2 != 0) {
            f fVar = this.f67751j;
            String creativeId = fVar != null ? fVar.f68409c : "";
            if (this.C != null && sg.bigo.ads.common.utils.q.a((CharSequence) creativeId)) {
                creativeId = this.C.getCreativeId();
            }
            float fA = (sg.bigo.ads.ad.b.e.a(creativeId, 4) * 0.5f) + 3.5f;
            d dVar = new d();
            TextView textView = (TextView) viewFindViewById.findViewById(R.id.inter_title);
            TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.inter_description);
            if (textView != null) {
                dVar.b(textView);
            }
            if (textView2 != null) {
                dVar.b(textView2);
            }
            sg.bigo.ads.api.a.m mVar = this.f67744c;
            int iA = mVar != null ? mVar.a("video_play_page.card_background_colour") : -1;
            if (iA == 1) {
                bitmapA = sg.bigo.ads.common.utils.d.a(this.D.getContext(), fA, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
                viewFindViewById2.setBackgroundColor(-1);
                dVar.a(-1);
            } else {
                if (iA == 2) {
                    viewFindViewById2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                    dVar.a(ViewCompat.MEASURED_STATE_MASK);
                } else {
                    sg.bigo.ads.ad.interstitial.e.b bVar = new sg.bigo.ads.ad.interstitial.e.b(sg.bigo.ads.common.utils.e.a(imageView.getContext(), 12), 0.0f, new sg.bigo.ads.ad.interstitial.e.a.b() { // from class: sg.bigo.ads.ad.interstitial.a.13
                    }.c());
                    Drawable drawableA = bVar.a();
                    if (drawableA != null) {
                        viewFindViewById2.setBackground(drawableA);
                    } else if (viewFindViewById2 instanceof sg.bigo.ads.common.view.a.c) {
                        ((sg.bigo.ads.common.view.a.c) viewFindViewById2).setBlurStyle(bVar);
                    }
                }
                bitmapA = sg.bigo.ads.common.utils.d.a(this.D.getContext(), fA, R.drawable.bigo_ad_ic_star_white, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half_white);
            }
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                imageView.setVisibility(0);
            }
        }
        viewFindViewById.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.14
            @Override // java.lang.Runnable
            public final void run() {
                AnimationSet animationSet = new AnimationSet(true);
                Interpolator interpolatorA = sg.bigo.ads.common.utils.b.a(2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(interpolatorA);
                animationSet.addAnimation(alphaAnimation);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 1.0f, 1, 1.0f);
                scaleAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(interpolatorA);
                animationSet.addAnimation(scaleAnimation);
                viewFindViewById.startAnimation(animationSet);
            }
        });
    }

    private void ar() {
        ViewGroup viewGroup;
        sg.bigo.ads.api.a.m mVar;
        if ((aj() instanceof sg.bigo.ads.ad.interstitial.d.a) || (viewGroup = this.D) == null) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.inter_download_msg);
        if (viewFindViewById != null) {
            f fVar = this.f67751j;
            if (fVar == null || !fVar.f68410d) {
                viewFindViewById.setVisibility(8);
                return;
            }
            Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
            if (button != null) {
                button.setText(R.string.bigo_ad_cta_download_default);
            }
            aj().a(viewGroup, viewFindViewById, ai(), 8, this.f67749h.f69011i, new View[0]);
        }
        if (aH()) {
            IconListView iconListView = (IconListView) viewGroup.findViewById(R.id.inter_iconlist_download_msg_list);
            if (this.f67751j == null || iconListView == null) {
                return;
            }
            boolean z10 = true;
            if (aH() && P() && (mVar = this.f67744c) != null) {
                int iA = mVar.a("video_play_page.background_colour");
                if (!aH() ? iA == 1 : iA == 1) {
                    z10 = false;
                }
            }
            iconListView.setThemeWhite(z10);
            iconListView.a(this.f67751j);
            iconListView.setVisibility(0);
        }
    }

    private void as() {
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            return;
        }
        Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
        TextView textView = (TextView) this.D.findViewById(R.id.inter_company);
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        if (mVar != null) {
            int iA = mVar.a("video_play_page.cta_color");
            int iA2 = this.f67744c.a("endpage.cta_color");
            int iA3 = this.f67744c.a("layer.cta_color");
            this.f67754m = r.a(((s) this.f68586y).H(), iA, null);
            this.f67755n = r.a(((s) this.f68586y).H(), iA2, null);
            this.f67756o = r.a(((s) this.f68586y).H(), iA3, null);
            if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a)) {
                if (button != null) {
                    button.setBackgroundColor(this.f67754m);
                }
                if (textView != null) {
                    textView.setTextColor(this.f67754m);
                }
            }
        }
        if (!P() || this.f67744c == null) {
            return;
        }
        View viewFindViewById = this.D.findViewById(R.id.inter_media_container);
        int iA4 = this.f67744c.a("video_play_page.background_colour");
        boolean z10 = false;
        if (!aH() ? iA4 == 3 || iA4 == 4 : iA4 == 4 || iA4 == 5) {
            z10 = true;
        }
        if (!z10 || viewFindViewById == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#66000000", -7829368));
        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_warning);
        if (textView2 != null) {
            textView2.setTextColor(sg.bigo.ads.common.utils.q.b("#66FFFFFF", -1));
        }
    }

    @NonNull
    private LandingPageStyleConfig at() {
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        if (mVar == null || !this.f67745d) {
            mVar = null;
        }
        int iA = sg.bigo.ads.ad.interstitial.h.a.a(mVar);
        int iB = sg.bigo.ads.ad.interstitial.h.a.b(mVar);
        sg.bigo.ads.ad.interstitial.h.a aVar = this.f67761t;
        int iA2 = (aVar == null || !aVar.d()) ? 0 : aj().f68942i;
        if (iA2 == 0) {
            iA2 = r.a(this.C, 0);
        }
        int i10 = iA2;
        Class<? extends sg.bigo.ads.controller.landing.d> clsI = i(iA);
        ViewGroup viewGroup = this.D;
        return new LandingPageStyleConfig(clsI, 9, iA, iB, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, i10, 0.8f);
    }

    private boolean au() {
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        return mVar != null && mVar.c("layer.is_show_layer");
    }

    private void av() {
        ViewGroup viewGroup;
        if (!P() || (viewGroup = this.D) == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_description);
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        int i10 = (mVar != null ? mVar.a("video_play_page.background_colour") : -1) == 1 ? ViewCompat.MEASURED_STATE_MASK : -1;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        if (textView2 != null) {
            textView2.setTextColor(i10);
        }
    }

    public static Class<? extends sg.bigo.ads.controller.landing.d> i(int i10) {
        if (i10 == 0) {
            return sg.bigo.ads.ad.interstitial.f.d.class;
        }
        return (7 == i10 || 8 == i10) ? sg.bigo.ads.ad.interstitial.f.a.class : sg.bigo.ads.ad.interstitial.f.e.class;
    }

    public static boolean j(int i10) {
        return (i10 == 7 || i10 == 8 || i10 == 0) ? false : true;
    }

    private void l(int i10) {
        sg.bigo.ads.ad.interstitial.multi_img.b bVarG;
        if (i10 != 0) {
            if (i10 == 1 && (bVarG = ((s) this.f68586y).G()) != null) {
                bVarG.a(2, 2);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f67750i;
        if (bVar != null) {
            bVar.a(1, 2);
        }
    }

    public void A() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.A.setVisibility(0);
            c.b((View) this.A);
        }
        if (e_() == 0) {
            int i10 = this.f67749h.f69005c;
            int iB = (i10 >= 0 || ((s) this.f68586y).f().x() == 4) ? i10 : 0;
            if (((s) this.f68586y).B()) {
                sg.bigo.ads.core.a.a aVarI = ((s) this.f68586y).f();
                if (this.f67757p.get() && aVarI.bh() == null) {
                    iB = w.b(this.f67749h.f69017o);
                }
            }
            this.A.a(iB, (AdCountDownButton.b) null);
        }
    }

    public final void B() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.getVisibility() != 0) {
            return;
        }
        this.A.clearAnimation();
        this.A.setVisibility(4);
    }

    public boolean C() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        sg.bigo.ads.api.a.m mVar;
        int i10 = R.layout.bigo_ad_view_click_guide;
        int iA = -1;
        if (aH()) {
            sg.bigo.ads.api.a.m mVar2 = this.f67744c;
            iA = mVar2 != null ? mVar2.a("layer.guided_click") : -1;
            if (iA == 1) {
                i10 = R.layout.bigo_ad_view_click_guide_landscape_1;
            } else if (iA == 3) {
                i10 = R.layout.bigo_ad_view_click_guide_landscape_3;
            } else {
                i10 = R.layout.bigo_ad_view_click_guide_landscape_2;
                iA = 2;
            }
        }
        boolean z10 = false;
        if (this.D == null || e_() == 2 || e_() == 8 || !this.f67749h.f69006d) {
            return false;
        }
        sg.bigo.ads.ad.interstitial.h.a aVar = this.f67761t;
        if (aVar != null) {
            viewFindViewById = aVar.a(this, this.D, ai(), new u.a() { // from class: sg.bigo.ads.ad.interstitial.a.4
                @Override // sg.bigo.ads.ad.interstitial.u.a
                public final void a(View view) {
                    a.this.a(view);
                }
            });
        } else {
            Context context = this.D.getContext();
            ViewGroup viewGroup = this.D;
            sg.bigo.ads.common.utils.a.a(context, i10, viewGroup, viewGroup != null);
            viewFindViewById = this.D.findViewById(R.id.inter_click_guide_container);
            if (viewFindViewById != null) {
                aj().a(this.D, viewFindViewById, ai(), 10, this.f67749h.f69015m, viewFindViewById);
                viewFindViewById.setTag(12);
                Button button = (Button) viewFindViewById.findViewById(R.id.inter_btn_cta);
                if (button != null) {
                    button.setTag(17);
                }
                viewFindViewById.findViewById(R.id.inter_icon).setTag(17);
                if (this.f67745d) {
                    if (button != null) {
                        button.setBackgroundColor(this.f67756o);
                    }
                    if (this.f67749h.f69014l) {
                        a(viewFindViewById, 10, ((s) this.f68586y).H(), this.f67749h.f69015m);
                    } else {
                        a(viewFindViewById, 10, q.F, 0);
                    }
                } else {
                    a(viewFindViewById, 5, ((s) this.f68586y).H(), this.f67749h.f69015m);
                }
                c.b(viewFindViewById);
                int i11 = R.id.inter_click_guide;
                View viewFindViewById4 = viewFindViewById.findViewById(i11);
                View viewFindViewById5 = viewFindViewById.findViewById(R.id.inter_click_ripple);
                if (viewFindViewById4 != null && viewFindViewById5 != null) {
                    c.a(viewFindViewById4, viewFindViewById5);
                }
                if (iA == 1 && (viewFindViewById3 = viewFindViewById.findViewById(R.id.inter_btn_cta_layout)) != null) {
                    c.e(viewFindViewById3);
                } else if (iA == 3 && (viewFindViewById2 = viewFindViewById.findViewById(i11)) != null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(600L);
                    alphaAnimation.setStartOffset(1000L);
                    alphaAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -sg.bigo.ads.common.utils.e.a(viewFindViewById2.getContext(), 160));
                    translateAnimation.setDuration(600L);
                    translateAnimation.setStartOffset(1000L);
                    translateAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                    AnimationSet animationSet = new AnimationSet(false);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.addAnimation(translateAnimation);
                    alphaAnimation.setRepeatCount(Integer.MAX_VALUE);
                    alphaAnimation.setRepeatMode(1);
                    translateAnimation.setRepeatCount(Integer.MAX_VALUE);
                    translateAnimation.setRepeatMode(1);
                    viewFindViewById2.startAnimation(animationSet);
                }
            }
            View viewFindViewById6 = this.D.findViewById(R.id.bigo_ad_layout_click_guide);
            a(viewFindViewById6);
            if (viewFindViewById6 != null) {
                viewFindViewById = viewFindViewById6;
            }
        }
        View view = viewFindViewById;
        if (view != null && (mVar = this.f67744c) != null) {
            int iA2 = this.f67745d ? mVar.a("layer.below_area_dp") : 0;
            boolean z11 = this.f67745d && this.f67744c.a("layer.below_area_clickable") == 1;
            int iA3 = this.f67745d ? this.f67744c.a("layer.up_area_dp") : 0;
            if (this.f67745d && this.f67744c.a("layer.up_area_clickable") == 1) {
                z10 = true;
            }
            a(view, iA2, z11, iA3, z10, 10, this.f67749h.f69015m);
        }
        f(9);
        a(((long) this.f67749h.f69007e) * 1000);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int D() {
        int iE_ = e_();
        int iD = d();
        switch (iE_) {
            case 1:
                return 2;
            case 2:
                return iD == 5 ? 4 : 2;
            case 3:
                return 3;
            case 4:
            default:
                return 1;
            case 5:
            case 6:
                return 4;
            case 7:
            case 8:
                return 5;
            case 9:
                if (iD == 1) {
                    return 2;
                }
                return iD == 5 ? 4 : 9;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void E() {
        if (I()) {
            at();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void F() {
        super.F();
        this.f67752k.removeCallbacksAndMessages(null);
        sg.bigo.ads.ad.interstitial.e.c cVar = this.f67760s;
        if (cVar != null) {
            IconAds iconAds = cVar.f68345e;
            if (iconAds != null) {
                iconAds.destroy();
            }
            sg.bigo.ads.common.utils.n nVar = cVar.f68352l;
            if (nVar != null) {
                nVar.b();
                cVar.f68352l = null;
            }
            sg.bigo.ads.common.utils.n nVar2 = cVar.f68353m;
            if (nVar2 != null) {
                nVar2.b();
                cVar.f68353m = null;
            }
            cVar.f68357q.clear();
            cVar.f68358r.clear();
            cVar.f68359s.clear();
            cVar.f68360t.clear();
            cVar.f68354n = true;
            cVar.b();
            cVar.c();
        }
        sg.bigo.ads.common.e.a.b(this.A, this.K);
    }

    public final void G() {
        TextView textView = (TextView) this.D.findViewById(R.id.inter_advertiser);
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f67753l)) {
            textView.setVisibility(8);
            return;
        }
        if (!aH() && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(2, R.id.inter_ad_info);
            layoutParams.addRule(12, 0);
            layoutParams.leftMargin = 18;
            layoutParams.setMarginStart(18);
            layoutParams.bottomMargin = 15;
            textView.setLayoutParams(layoutParams);
            textView.setText(this.f67753l);
        }
    }

    public final boolean H() {
        at();
        return false;
    }

    public final boolean I() {
        int iE_ = e_();
        return iE_ == 2 || iE_ == 6 || iE_ == 8 || iE_ == 9;
    }

    public abstract void J();

    /* JADX WARN: Code duplicated, block: B:24:0x004d A[PHI: r0
  0x004d: PHI (r0v16 java.lang.Integer) = (r0v15 java.lang.Integer), (r0v18 java.lang.Integer) binds: [B:23:0x004b, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    public void K() {
        Integer numA;
        if (this.D != null) {
            sg.bigo.ads.api.a.m mVar = this.f67744c;
            int iIntValue = ViewCompat.MEASURED_STATE_MASK;
            if (mVar == null || !P()) {
                if (!aH()) {
                    aj().a(this.D);
                    return;
                }
                sg.bigo.ads.api.a.m mVar2 = this.f67744c;
                if (mVar2 != null) {
                    int iA = mVar2.a("video_play_page.background_colour");
                    if (iA == 1) {
                        aj().a(this.D, -1);
                        return;
                    }
                    if (iA == 2) {
                        aj().a(this.D, ViewCompat.MEASURED_STATE_MASK);
                        return;
                    }
                    if (iA == 4) {
                        aj().a(this.D, this.f67754m);
                        return;
                    } else if (iA == 5) {
                        aj().a(this.D);
                        return;
                    } else {
                        aj().a(this.D, sg.bigo.ads.common.utils.q.b("#262E33", -7829368));
                        return;
                    }
                }
                return;
            }
            int iA2 = this.f67744c.a("video_play_page.background_colour");
            if (iA2 == 1) {
                iIntValue = -1;
            } else if (iA2 != 2) {
                if (aH()) {
                    if (iA2 == 4) {
                        numA = r.a((NativeAd) this.C);
                        if (numA != null) {
                            iIntValue = numA.intValue();
                        }
                    } else if (iA2 != 3) {
                        iIntValue = -100;
                    }
                    iIntValue = sg.bigo.ads.common.utils.q.b("#262E33", -7829368);
                } else if (iA2 == 3) {
                    numA = r.a((NativeAd) this.C);
                    if (numA != null) {
                        iIntValue = numA.intValue();
                    } else {
                        iIntValue = sg.bigo.ads.common.utils.q.b("#262E33", -7829368);
                    }
                } else {
                    iIntValue = -100;
                }
            }
            t tVarAj = aj();
            ViewGroup viewGroup = this.D;
            if (iIntValue != -100) {
                tVarAj.a(viewGroup, iIntValue);
            } else {
                tVarAj.a(viewGroup);
            }
        }
    }

    public final boolean L() {
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        return mVar != null && 1 == mVar.a("endpage.is_endpage", 1);
    }

    public final boolean M() {
        sg.bigo.ads.api.a.m mVar;
        return (this instanceof sg.bigo.ads.ad.interstitial.g.b) && (mVar = this.f67744c) != null && 1 == mVar.a("endpage.ep_sprt", 0);
    }

    public final boolean N() {
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        return (mVar == null || mVar.a("mid_page.show_time") != 0 || L() || au() || this.f67757p.get()) ? false : true;
    }

    public final boolean O() {
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        return (mVar == null || mVar.a("mid_page.show_time") <= 0 || L() || au() || this.f67757p.get()) ? false : true;
    }

    public final boolean P() {
        int iY = Y();
        return iY == R.layout.bigo_ad_activity_interstitial_percent_warning || iY == R.layout.bigo_ad_activity_interstitial_percent_warning_landscape;
    }

    @Override // sg.bigo.ads.ad.c.a
    public LandingPageStyleConfig a(Context context, String str, int i10, boolean z10) {
        p pVar;
        LandingPageStyleConfig landingPageStyleConfig;
        sg.bigo.ads.api.a.m mVar = null;
        mVar = null;
        sg.bigo.ads.api.a.m mVar2 = null;
        LandingPageStyleConfig landingPageStyleConfig2 = null;
        mVar = null;
        if (!z10) {
            int iE_ = e_();
            if (iE_ == 0) {
                t tVarAj = aj();
                sg.bigo.ads.api.a.m mVar3 = this.f67744c;
                if (mVar3 != null && this.f67745d) {
                    mVar = mVar3;
                }
                int iA = sg.bigo.ads.ad.interstitial.d.a.a(tVarAj, mVar);
                int iB = sg.bigo.ads.ad.interstitial.d.a.b(tVarAj, mVar);
                float f10 = sg.bigo.ads.ad.interstitial.d.a.a(tVarAj) ? 0.67f : 0.8f;
                Class<? extends sg.bigo.ads.controller.landing.d> clsI = i(iA);
                ViewGroup viewGroup = this.D;
                landingPageStyleConfig2 = new LandingPageStyleConfig(clsI, 0, iA, iB, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, r.a(this.C, 0), f10);
            } else if (iE_ == 9) {
                landingPageStyleConfig2 = at();
            } else if (iE_ == 10) {
                sg.bigo.ads.api.a.m mVar4 = this.f67744c;
                if (mVar4 != null && this.f67745d) {
                    mVar2 = mVar4;
                }
                int iA2 = sg.bigo.ads.ad.interstitial.d.a.a(mVar2, "layer.webview_layout");
                int iB2 = sg.bigo.ads.ad.interstitial.d.a.b(mVar2, "layer.webview_force_time");
                Class<? extends sg.bigo.ads.controller.landing.d> clsI2 = i(iA2);
                ViewGroup viewGroup2 = this.D;
                landingPageStyleConfig2 = new LandingPageStyleConfig(clsI2, 10, iA2, iB2, viewGroup2 != null ? viewGroup2.getMeasuredHeight() : 0, r.a(this.C, 0), 0.8f);
                if (!landingPageStyleConfig2.b() && (pVar = this.f67759r) != null) {
                    pVar.e();
                }
            }
            sg.bigo.ads.ad.interstitial.f.b.a(landingPageStyleConfig2);
            return landingPageStyleConfig2;
        }
        int iE_2 = e_();
        if (iE_2 == 0) {
            t tVarAj2 = aj();
            sg.bigo.ads.api.a.m mVar5 = this.f67744c;
            if (mVar5 == null || !this.f67745d) {
                mVar5 = null;
            }
            int iA3 = sg.bigo.ads.ad.interstitial.d.a.a(tVarAj2, mVar5);
            if (j(iA3)) {
                return null;
            }
            landingPageStyleConfig = new LandingPageStyleConfig(i(iA3), 0, iA3, sg.bigo.ads.ad.interstitial.d.a.b(tVarAj2, mVar5), 0, 0, 0.0f);
        } else if (iE_2 == 9) {
            sg.bigo.ads.api.a.m mVar6 = this.f67744c;
            if (mVar6 == null || !this.f67745d) {
                mVar6 = null;
            }
            int iA4 = sg.bigo.ads.ad.interstitial.h.a.a(mVar6);
            if (j(iA4)) {
                return null;
            }
            landingPageStyleConfig = new LandingPageStyleConfig(i(iA4), 9, iA4, sg.bigo.ads.ad.interstitial.h.a.b(mVar6), 0, 0, 0.0f);
        } else {
            if (iE_2 != 10) {
                return null;
            }
            sg.bigo.ads.api.a.m mVar7 = this.f67744c;
            if (mVar7 == null || !this.f67745d) {
                mVar7 = null;
            }
            int iA5 = sg.bigo.ads.ad.interstitial.d.a.a(mVar7, "layer.webview_layout");
            if (j(iA5)) {
                return null;
            }
            landingPageStyleConfig = new LandingPageStyleConfig(i(iA5), 10, iA5, sg.bigo.ads.ad.interstitial.d.a.b(mVar7, "layer.webview_force_time"), 0, 0, 0.0f);
        }
        return landingPageStyleConfig;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0686b
    public final void a(int i10, int i11, int i12, int i13, int i14) {
        if (e_() == e_() && i14 == 0) {
            Object objAj = aj();
            if (objAj instanceof sg.bigo.ads.ad.interstitial.f.c) {
                sg.bigo.ads.ad.interstitial.f.c cVar = (sg.bigo.ads.ad.interstitial.f.c) objAj;
                cVar.a(i10, i11, i12, i13);
                if (cVar.L() && this.O && !this.B.get()) {
                    i();
                }
            }
        }
    }

    public final void a(long j10) {
        if (j10 <= 0) {
            A();
            return;
        }
        B();
        this.f67752k.removeCallbacks(this.S);
        this.f67752k.postDelayed(this.S, j10);
    }

    public final void a(View view) {
        sg.bigo.ads.ad.interstitial.e.a.c cVar;
        String str;
        sg.bigo.ads.ad.interstitial.e.c cVar2 = this.f67760s;
        if (cVar2 == null || !(view instanceof ViewGroup)) {
            return;
        }
        sg.bigo.ads.ad.interstitial.e.c.a(cVar2.f68350j, cVar2.f68348h);
        final sg.bigo.ads.ad.interstitial.e.c cVar3 = this.f67760s;
        final ViewGroup viewGroup = (ViewGroup) view;
        cVar3.f68356p = false;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) cVar3.f68341a.f(), 2);
        if (viewGroup == null) {
            cVar = cVar3.f68343c;
            str = "layerView is null";
        } else if (sg.bigo.ads.ad.interstitial.e.a.b.b(cVar3.f68343c)) {
            cVar = cVar3.f68343c;
            str = "config is invalid";
        } else {
            if (cVar3.a(2)) {
                cVar3.c();
                sg.bigo.ads.ad.interstitial.e.a aVar = cVar3.f68351k;
                if (aVar != null) {
                    aVar.f68310b.d();
                    sg.bigo.ads.common.utils.u.b(cVar3.f68351k.f68309a);
                }
                cVar3.f68351k = null;
                final sg.bigo.ads.ad.interstitial.e.a.c cVar4 = cVar3.f68343c;
                sg.bigo.ads.ad.interstitial.e.c.b bVar = new sg.bigo.ads.ad.interstitial.e.c.b(viewGroup, cVar4) { // from class: sg.bigo.ads.ad.interstitial.e.c.4

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ ViewGroup f68368a;

                    /* JADX INFO: renamed from: e */
                    private boolean f68370e = false;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass4(final ViewGroup viewGroup2, final sg.bigo.ads.ad.interstitial.e.a.b cVar5) {
                        super(viewGroup2, cVar5, (byte) 0);
                        viewGroup = viewGroup2;
                        this.f68370e = false;
                    }

                    @Override // sg.bigo.ads.ad.interstitial.e.c.b
                    public final void a(sg.bigo.ads.ad.interstitial.e.a aVar2) {
                        sg.bigo.ads.ad.interstitial.h.a aVar3;
                        RealtimeBlurLinearLayout realtimeBlurLinearLayout;
                        super.a(aVar2);
                        if (!this.f68370e || (aVar3 = c.this.f68344d) == null || (realtimeBlurLinearLayout = aVar2.f68309a) == null) {
                            return;
                        }
                        aVar3.a(realtimeBlurLinearLayout);
                    }

                    @Override // sg.bigo.ads.ad.interstitial.e.c.b
                    public final boolean a() {
                        sg.bigo.ads.ad.interstitial.e.a.c cVar5;
                        String str2;
                        c cVar6 = c.this;
                        if (cVar6.f68345e == null) {
                            cVar5 = cVar6.f68343c;
                            str2 = "icon ads is null";
                        } else {
                            if (!cVar6.f68354n) {
                                if (cVar6.a()) {
                                    c.this.c();
                                    c cVar7 = c.this;
                                    cVar7.a(cVar7.f68343c, "host ad is destroyed", 2);
                                    return true;
                                }
                                List listA = c.a(c.this.f68345e);
                                if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                                    c.this.c();
                                    c cVar8 = c.this;
                                    cVar8.a(cVar8.f68343c, "icon ads download failed", 2);
                                    return true;
                                }
                                boolean zA = c.this.f68343c.a();
                                if (u.c(this.f68377c) && u.d(this.f68377c)) {
                                    c.a(c.this, 2);
                                    c cVar9 = c.this;
                                    Context context = this.f68377c.getContext();
                                    c cVar10 = c.this;
                                    cVar9.f68351k = sg.bigo.ads.ad.interstitial.e.a.a(context, cVar10.f68343c, listA, cVar10.f68358r);
                                    c.a(c.this, zA);
                                    RealtimeBlurLinearLayout realtimeBlurLinearLayout = c.this.f68351k.f68309a;
                                    int iE = this.f68378d.e();
                                    if (iE == 5 || iE == 6) {
                                        View viewFindViewById = viewGroup.findViewById(R.id.inter_icons_bottom_anchor);
                                        View viewFindViewById2 = viewGroup.findViewById(R.id.inter_icons_center_anchor);
                                        if (viewFindViewById != null) {
                                            ViewParent parent = viewFindViewById.getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).addView(realtimeBlurLinearLayout, viewFindViewById.getLayoutParams());
                                            }
                                        }
                                        if (viewFindViewById2 != null) {
                                            sg.bigo.ads.ad.interstitial.e.a aVar2 = c.this.f68351k;
                                            ViewParent parent2 = viewFindViewById2.getParent();
                                            if (parent2 instanceof ViewGroup) {
                                                ViewGroup viewGroup2 = (ViewGroup) parent2;
                                                viewGroup2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.3

                                                    /* JADX INFO: renamed from: a */
                                                    public final /* synthetic */ View f68386a;

                                                    /* JADX INFO: renamed from: b */
                                                    public final /* synthetic */ ViewGroup f68387b;

                                                    /* JADX INFO: renamed from: c */
                                                    public final /* synthetic */ View f68388c;

                                                    /* JADX INFO: renamed from: d */
                                                    public final /* synthetic */ Integer f68389d;

                                                    /* JADX INFO: renamed from: e */
                                                    public final /* synthetic */ sg.bigo.ads.ad.interstitial.e.a f68390e;

                                                    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.e.c$b$3$1 */
                                                    public class AnonymousClass1 extends sg.bigo.ads.common.h {

                                                        /* JADX INFO: renamed from: a */
                                                        public final /* synthetic */ ValueAnimator f68392a;

                                                        public AnonymousClass1() {
                                                            valueAnimator = valueAnimator;
                                                        }

                                                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                        public final void onTransitionEnd(Transition transition) {
                                                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                            b.this.a(aVar);
                                                        }

                                                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                        public final void onTransitionStart(Transition transition) {
                                                            ValueAnimator valueAnimator = valueAnimator;
                                                            if (valueAnimator != null) {
                                                                valueAnimator.start();
                                                            }
                                                        }
                                                    }

                                                    public AnonymousClass3() {
                                                        view = realtimeBlurLinearLayout;
                                                        viewGroup = viewGroup2;
                                                        view = viewFindViewById2;
                                                        num = num;
                                                        aVar = aVar2;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        u.b(view);
                                                        viewGroup.addView(view, view.getLayoutParams());
                                                        ValueAnimator valueAnimatorA = b.this.a(num);
                                                        TransitionSet transitionSet = new TransitionSet();
                                                        transitionSet.addTransition(new ChangeBounds());
                                                        transitionSet.setDuration(300L);
                                                        transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.3.1

                                                            /* JADX INFO: renamed from: a */
                                                            public final /* synthetic */ ValueAnimator f68392a;

                                                            public AnonymousClass1() {
                                                                valueAnimator = valueAnimatorA;
                                                            }

                                                            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                            public final void onTransitionEnd(Transition transition) {
                                                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                                b.this.a(aVar);
                                                            }

                                                            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                            public final void onTransitionStart(Transition transition) {
                                                                ValueAnimator valueAnimator = valueAnimator;
                                                                if (valueAnimator != null) {
                                                                    valueAnimator.start();
                                                                }
                                                            }
                                                        });
                                                        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                                                    }
                                                });
                                            }
                                        }
                                    } else {
                                        this.f68370e = true;
                                        a(viewGroup, realtimeBlurLinearLayout, -234881024, c.this.f68351k);
                                    }
                                    c.a(c.this, this.f68378d, 2, listA);
                                    c cVar11 = c.this;
                                    cVar11.f68353m = c.a(cVar11, cVar11.f68343c, cVar11.f68358r);
                                    n nVar = c.this.f68353m;
                                    if (nVar != null) {
                                        nVar.c();
                                    }
                                }
                                c.this.c();
                                return true;
                            }
                            cVar5 = cVar6.f68343c;
                            str2 = "page is Paused";
                        }
                        cVar6.a(cVar5, str2, 2);
                        return false;
                    }
                };
                cVar3.f68349i = bVar;
                bVar.d();
                return;
            }
            cVar = cVar3.f68343c;
            str = "icon request hasScene return false";
        }
        cVar3.a(cVar, str, 2);
    }

    public final void a(@NonNull View view, int i10, @Nullable sg.bigo.ads.core.adview.h hVar, int i11) {
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            sg.bigo.ads.common.t.a.a(0, "InterstitialNativeActivityImpl", "Failed to set ad click due to native ad view is null.");
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, view, i10, hVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public final void a(final View view, int i10, boolean z10, int i11, boolean z11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams2;
        if (!(view instanceof FrameLayout) && !(view instanceof RelativeLayout)) {
            sg.bigo.ads.common.t.a.a(0, "InterstitialNativeActivityImpl", "Failed to update up or below area click due to unsupported view.");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        if (i10 > 0) {
            View view2 = new View(context);
            view2.setId(R.id.bigo_ad_interstitial_below_area_click);
            view2.setTag(25);
            if (viewGroup2 instanceof FrameLayout) {
                layoutParams2 = new FrameLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, i10), 80);
            } else if (viewGroup2 instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, i10));
                layoutParams3.addRule(12);
                layoutParams2 = layoutParams3;
            } else {
                viewGroup = this.D;
                if (z10) {
                    if (viewGroup != null) {
                        a(view2, i12, ((s) this.f68586y).H(), i13);
                    }
                } else if (viewGroup != null) {
                    sg.bigo.ads.ad.b.a.a(viewGroup, view2, i12, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.6
                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(int i14, int i15, int i16, int i17, int i18, int i19) {
                            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeActivityImpl", "Forbidden click for below area: " + view);
                        }
                    }, i13);
                }
            }
            viewGroup2.addView(view2, layoutParams2);
            viewGroup = this.D;
            if (z10) {
                if (viewGroup != null) {
                    a(view2, i12, ((s) this.f68586y).H(), i13);
                }
            } else if (viewGroup != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, view2, i12, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.6
                    @Override // sg.bigo.ads.core.adview.h
                    public final void a(int i14, int i15, int i16, int i17, int i18, int i19) {
                        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeActivityImpl", "Forbidden click for below area: " + view);
                    }
                }, i13);
            }
        }
        if (i11 > 0) {
            View view3 = new View(context);
            view3.setTag(24);
            if (!(viewGroup2 instanceof FrameLayout)) {
                if (viewGroup2 instanceof RelativeLayout) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, i11));
                }
                if (z11) {
                    if (this.D != null) {
                        a(view3, i12, ((s) this.f68586y).H(), i13);
                    }
                } else if (this.C != null) {
                    sg.bigo.ads.ad.b.a.a(this.D, view3, i12, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.7
                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(int i14, int i15, int i16, int i17, int i18, int i19) {
                            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeActivityImpl", "Forbidden click for up area: " + view);
                        }
                    }, i13);
                }
            }
            layoutParams = new FrameLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, i11));
            viewGroup2.addView(view3, layoutParams);
            if (z11) {
                if (this.D != null) {
                    a(view3, i12, ((s) this.f68586y).H(), i13);
                }
            } else if (this.C != null) {
                sg.bigo.ads.ad.b.a.a(this.D, view3, i12, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.7
                    @Override // sg.bigo.ads.core.adview.h
                    public final void a(int i14, int i15, int i16, int i17, int i18, int i19) {
                        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeActivityImpl", "Forbidden click for up area: " + view);
                    }
                }, i13);
            }
        }
    }

    public void a(@NonNull ViewGroup viewGroup) {
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (this.f67749h.f69003a) {
            viewGroup.setTag(11);
            a(viewGroup, 1, ((s) this.f68586y).H(), this.f67749h.f69011i);
            if (mediaView != null) {
                mediaView.b().a(false);
                return;
            }
            return;
        }
        if (!this.f67745d) {
            a(viewGroup, 8, (sg.bigo.ads.core.adview.h) null, 0);
            return;
        }
        if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a) && mediaView != null) {
            a(mediaView, 8, ((s) this.f68586y).H(), this.f67749h.f69011i);
            if (this.f67749h.f69008f) {
                mediaView.setMediaAreaClickable(true);
                mediaView.b().a(false);
            } else {
                mediaView.setMediaAreaClickable(false);
                mediaView.b().a(true);
            }
        }
        if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a)) {
            View viewFindViewById = viewGroup.findViewById(R.id.inter_media_container);
            if (v()) {
                viewFindViewById = viewGroup.findViewById(R.id.inter_media_layout);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setTag(9);
                if (this.f67749h.f69009g) {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(true);
                    }
                    a(viewFindViewById, 8, ((s) this.f68586y).H(), this.f67749h.f69011i);
                } else {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(false);
                    }
                    a(viewFindViewById, 8, q.F, 0);
                }
            }
        }
        if (aj() instanceof sg.bigo.ads.ad.interstitial.d.a) {
            return;
        }
        View viewFindViewById2 = viewGroup.findViewById(R.id.inter_ad_info);
        if (P() && aH()) {
            viewFindViewById2 = viewGroup.findViewById(R.id.inter_ad_info_inner);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setTag(18);
            if (v()) {
                viewFindViewById2 = viewGroup.findViewById(R.id.inter_media_container);
                viewFindViewById2.setTag(18);
            }
            if (this.f67749h.f69010h) {
                a(viewFindViewById2, 8, ((s) this.f68586y).H(), this.f67749h.f69011i);
            } else {
                a(viewFindViewById2, 8, q.F, 0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0107  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r12 == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r12) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.a(boolean):void");
    }

    public final void a(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.I) {
            for (Object obj : objArr) {
                if (obj != null) {
                    this.I.put(obj, 1);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0686b
    public boolean a(@NonNull MotionEvent motionEvent, @Nullable sg.bigo.ads.ad.interstitial.f.b.a aVar, int i10) {
        boolean zB;
        AdCountDownButton adCountDownButton = this.A;
        boolean z10 = false;
        if (adCountDownButton != null) {
            if (motionEvent == null || adCountDownButton.f67724f == null) {
                zB = false;
            } else {
                zB = sg.bigo.ads.common.utils.u.b(adCountDownButton.f67724f, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            }
            if (zB) {
                if (motionEvent.getAction() == 1) {
                    if (aVar != null && aVar.a()) {
                        z10 = true;
                    }
                    if (z10 && this.P == null) {
                        if (this.O) {
                            this.P = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AdCountDownButton adCountDownButton2 = a.this.A;
                                    if (adCountDownButton2 != null) {
                                        adCountDownButton2.a();
                                    }
                                }
                            };
                        } else {
                            AdCountDownButton adCountDownButton2 = this.A;
                            if (adCountDownButton2 != null) {
                                adCountDownButton2.a();
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean a(Object obj, Runnable runnable) {
        Integer num;
        if (obj == null || runnable == null) {
            return false;
        }
        synchronized (this.I) {
            num = this.I.get(obj);
        }
        if (num == null) {
            runnable.run();
            return false;
        }
        synchronized (this.J) {
            WeakHashMap<Object, Runnable> weakHashMap = this.J.get(num);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap<>();
                this.J.put(num, weakHashMap);
            }
            weakHashMap.put(obj, runnable);
        }
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0686b
    @CallSuper
    public void a_(int i10) {
        this.O = true;
    }

    @NonNull
    public abstract w b();

    public void b(boolean z10) {
        sg.bigo.ads.common.utils.n nVar;
        sg.bigo.ads.common.utils.n nVar2 = this.f67763v;
        if (nVar2 != null) {
            nVar2.b();
            this.f67763v = null;
        }
        sg.bigo.ads.common.utils.n nVar3 = this.f67762u;
        if (nVar3 != null) {
            nVar3.b();
            this.f67762u = null;
        }
        if (z10 && (nVar = this.f67764w) != null) {
            nVar.b();
            this.f67764w = null;
        }
        sg.bigo.ads.common.utils.n nVar4 = this.f67765x;
        if (nVar4 != null) {
            nVar4.b();
            this.f67765x = null;
        }
    }

    public final void b(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.I) {
            for (Object obj : objArr) {
                if (obj != null) {
                    this.I.remove(obj);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0686b
    public final void b_(int i10) {
        if (e_() == 0 && i10 == 0 && j() && !k() && this.O && this.B.get()) {
            g();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0686b
    public final void c(int i10) {
        if (e_() == 0 && i10 == 0 && j() && !k() && this.O && !this.B.get()) {
            i();
        }
    }

    @CallSuper
    public void c(boolean z10) {
        if (z10) {
            ac();
        } else {
            ae();
        }
    }

    public final void c(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.J) {
            WeakHashMap<Object, Runnable> weakHashMap = this.J.get(1);
            if (sg.bigo.ads.common.utils.k.a(weakHashMap)) {
                return;
            }
            for (Object obj : objArr) {
                if (obj != null) {
                    weakHashMap.remove(obj);
                }
            }
        }
    }

    public final int d() {
        synchronized (this.G) {
            if (this.G.size() < 2) {
                return -1;
            }
            return this.G.get(1).intValue();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0686b
    public void d(int i10) {
        this.O = false;
        Runnable runnable = this.P;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.a(2, runnable);
            this.P = null;
        } else if (this.B.get()) {
            g();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z10) {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || (adCountDownButton.getVisibility() == 0 && this.A.f67721c)) {
            e(z10);
        } else if (this.A.getVisibility() == 0 && this.A.f67723e) {
            e(z10);
        }
    }

    public final void e() {
        synchronized (this.J) {
            WeakHashMap<Object, Runnable> weakHashMapRemove = this.J.remove(1);
            if (sg.bigo.ads.common.utils.k.a(weakHashMapRemove)) {
                return;
            }
            Iterator<Map.Entry<Object, Runnable>> it = weakHashMapRemove.entrySet().iterator();
            while (it.hasNext()) {
                Runnable value = it.next().getValue();
                if (value != null) {
                    sg.bigo.ads.common.n.d.a(2, value);
                }
            }
        }
    }

    public final void e(int i10) {
        String str;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_ad_label);
        if (aH()) {
            if (TextUtils.isEmpty(this.f67753l) || textView2 == null || textView2.getContext() == null) {
                return;
            }
            String strA = sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]);
            if (!P()) {
                textView2.setText(this.f67753l + " · " + strA);
                return;
            }
            str = strA + " · " + this.f67753l;
        } else {
            if (textView == null || textView2 == null) {
                return;
            }
            if (TextUtils.isEmpty(this.f67753l)) {
                textView.setVisibility(8);
                return;
            }
            if (!P()) {
                if (i10 != R.layout.bigo_ad_activity_interstitial_native_top) {
                    textView.bringToFront();
                }
                textView.setText(this.f67753l);
                textView.setPadding(sg.bigo.ads.common.utils.e.a(this.D.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1));
                textView2.setText(R.string.bigo_ad_tag);
                return;
            }
            textView.setVisibility(8);
            str = sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + this.f67753l;
        }
        textView2.setText(str);
    }

    public final void e(boolean z10) {
        if (f(z10)) {
            l(e_());
            super.d(true);
        }
    }

    public final int e_() {
        synchronized (this.G) {
            if (this.G.isEmpty()) {
                return -1;
            }
            return this.G.get(0).intValue();
        }
    }

    public void f(int i10) {
        p pVar;
        sg.bigo.ads.ad.b.b bVar;
        sg.bigo.ads.ad.interstitial.e.c cVar = this.f67760s;
        if (cVar != null) {
            sg.bigo.ads.ad.interstitial.e.c.a aVar = cVar.f68347g;
            if (i10 == 0) {
                aVar.f68374a = 1;
            } else if (i10 == 1) {
                aVar.f68374a = 3;
            } else if (i10 == 9) {
                aVar.f68374a = 4;
            } else if (i10 == 10) {
                aVar.f68374a = 2;
            }
        }
        synchronized (this.G) {
            synchronized (this.G) {
                this.G.remove(Integer.valueOf(i10));
            }
            this.G.add(0, Integer.valueOf(i10));
        }
        int iD = d();
        int iE_ = e_();
        if (iE_ != iD) {
            l(iD);
        }
        sg.bigo.ads.ad.b.b bVar2 = this.C;
        if (bVar2 != null) {
            bVar2.d(i10);
        }
        if (((i10 == 0) | (i10 == 1) | (i10 == 2) | (i10 == 4) | (i10 == 5) | (i10 == 6) | (i10 == 7) | (i10 == 8) | (i10 == 9)) && (bVar = this.C) != null) {
            ((sg.bigo.ads.core.a.a) bVar.f()).b(SystemClock.elapsedRealtime());
        }
        if (i10 != 0 && i10 != 10 && i10 != 3 && (pVar = this.f67759r) != null) {
            pVar.b();
        }
        switch (iE_) {
            case 0:
                sg.bigo.ads.ad.interstitial.multi_img.b bVar3 = this.f67750i;
                if (bVar3 != null) {
                    bVar3.a(1, 1);
                }
                l lVar = this.H;
                lVar.a(lVar.f68620b);
                return;
            case 1:
                sg.bigo.ads.ad.interstitial.multi_img.b bVarG = ((s) this.f68586y).G();
                if (bVarG != null) {
                    bVarG.a(2, 1);
                }
                l lVar2 = this.H;
                lVar2.a(lVar2.f68622d);
                w wVar = this.f67749h;
                if (wVar == null || !wVar.f69006d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 2:
            case 8:
            case 9:
                k(R.drawable.bigo_ad_ic_close);
                l lVar3 = this.H;
                lVar3.a(lVar3.f68623e);
                return;
            case 3:
            case 6:
            default:
                return;
            case 4:
                l lVar4 = this.H;
                lVar4.a(lVar4.f68625g);
                return;
            case 5:
                l lVar5 = this.H;
                lVar5.a(lVar5.f68624f);
                w wVar2 = this.f67749h;
                if (wVar2 == null || !wVar2.f69006d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 7:
                l lVar6 = this.H;
                lVar6.a(lVar6.f68626h);
                w wVar3 = this.f67749h;
                if (wVar3 == null || !wVar3.f69006d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 10:
                l lVar7 = this.H;
                lVar7.a(lVar7.f68621c);
                return;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean f() {
        return ao();
    }

    public abstract boolean f(boolean z10);

    @Override // sg.bigo.ads.ad.c.a
    public final boolean f_() {
        return this.O;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void g() {
        l lVar;
        sg.bigo.ads.core.a.a aVarI;
        int i10;
        sg.bigo.ads.ad.interstitial.e.c cVar;
        sg.bigo.ads.ad.interstitial.h.a aVar;
        sg.bigo.ads.common.utils.n nVar;
        sg.bigo.ads.common.utils.n nVar2;
        super.g();
        int iE_ = e_();
        p pVar = this.f67759r;
        if (pVar != null) {
            pVar.c();
        }
        if (iE_ == 0) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68620b;
        } else if (iE_ == 10) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68621c;
        } else if (iE_ == 1) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68622d;
        } else if (iE_ == 2 || iE_ == 8 || iE_ == 9) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68623e;
        } else if (iE_ == 5) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68624f;
        } else {
            if (iE_ != 4) {
                if (iE_ == 7) {
                    lVar = this.H;
                    aVarI = ((s) this.f68586y).f();
                    i10 = lVar.f68626h;
                }
                cVar = this.f67760s;
                if (cVar != null) {
                    cVar.f68354n = false;
                    sg.bigo.ads.ad.interstitial.e.c.b(cVar.f68351k, cVar.f68349i);
                    sg.bigo.ads.ad.interstitial.e.c.b(cVar.f68350j, cVar.f68348h);
                    nVar = cVar.f68352l;
                    if (nVar != null && nVar.e()) {
                        cVar.f68352l.c();
                    }
                    nVar2 = cVar.f68353m;
                    if (nVar2 != null && nVar2.e()) {
                        cVar.f68353m.c();
                    }
                }
                aVar = this.f67761t;
                if (aVar != null) {
                    aVar.b();
                }
            }
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68625g;
        }
        lVar.b(aVarI, i10);
        cVar = this.f67760s;
        if (cVar != null) {
            cVar.f68354n = false;
            sg.bigo.ads.ad.interstitial.e.c.b(cVar.f68351k, cVar.f68349i);
            sg.bigo.ads.ad.interstitial.e.c.b(cVar.f68350j, cVar.f68348h);
            nVar = cVar.f68352l;
            if (nVar != null) {
                cVar.f68352l.c();
            }
            nVar2 = cVar.f68353m;
            if (nVar2 != null) {
                cVar.f68353m.c();
            }
        }
        aVar = this.f67761t;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void g(@LayoutRes int i10) {
        super.g(i10);
        if (this.D == null) {
            return;
        }
        ((s) this.f68586y).E = this.H;
        ap();
        q();
        s();
        as();
        ar();
        t();
        w();
        f(0);
        J();
        ((s) this.f68586y).f().a(this.f67745d);
        a(this.D);
        z();
        a(((long) this.f67749h.f69004b) * 1000);
        aq();
        av();
        o();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void h(int i10) {
        super.g(i10);
        if (this.D == null) {
            return;
        }
        ((s) this.f68586y).E = this.H;
        ap();
        s();
        as();
        ar();
        t();
        w();
        f(0);
        J();
        ((s) this.f68586y).f().a(this.f67745d);
        a(this.D);
        aq();
        av();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean h() {
        return ao();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void i() {
        l lVar;
        sg.bigo.ads.core.a.a aVarI;
        int i10;
        sg.bigo.ads.ad.interstitial.e.c cVar;
        sg.bigo.ads.ad.interstitial.h.a aVar;
        sg.bigo.ads.common.utils.n nVar;
        sg.bigo.ads.common.utils.n nVar2;
        super.i();
        int iE_ = e_();
        p pVar = this.f67759r;
        if (pVar != null) {
            pVar.d();
        }
        if (iE_ == 0) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68620b;
        } else if (iE_ == 10) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68621c;
        } else if (iE_ == 1) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68622d;
        } else if (iE_ == 2 || iE_ == 8 || iE_ == 9) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68623e;
        } else if (iE_ == 5) {
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68624f;
        } else {
            if (iE_ != 4) {
                if (iE_ == 7) {
                    lVar = this.H;
                    aVarI = ((s) this.f68586y).f();
                    i10 = lVar.f68626h;
                }
                cVar = this.f67760s;
                if (cVar != null) {
                    cVar.f68354n = true;
                    sg.bigo.ads.ad.interstitial.e.c.a(cVar.f68351k, cVar.f68349i);
                    sg.bigo.ads.ad.interstitial.e.c.a(cVar.f68350j, cVar.f68348h);
                    nVar = cVar.f68352l;
                    if (nVar != null) {
                        nVar.d();
                    }
                    nVar2 = cVar.f68353m;
                    if (nVar2 != null) {
                        nVar2.d();
                    }
                }
                aVar = this.f67761t;
                if (aVar != null) {
                    aVar.c();
                }
            }
            lVar = this.H;
            aVarI = ((s) this.f68586y).f();
            i10 = lVar.f68625g;
        }
        lVar.a(aVarI, i10);
        cVar = this.f67760s;
        if (cVar != null) {
            cVar.f68354n = true;
            sg.bigo.ads.ad.interstitial.e.c.a(cVar.f68351k, cVar.f68349i);
            sg.bigo.ads.ad.interstitial.e.c.a(cVar.f68350j, cVar.f68348h);
            nVar = cVar.f68352l;
            if (nVar != null) {
                nVar.d();
            }
            nVar2 = cVar.f68353m;
            if (nVar2 != null) {
                nVar2.d();
            }
        }
        aVar = this.f67761t;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final boolean j() {
        Object objAj = aj();
        if (objAj instanceof sg.bigo.ads.ad.interstitial.f.c) {
            return ((sg.bigo.ads.ad.interstitial.f.c) objAj).K();
        }
        return false;
    }

    public final boolean k() {
        if (e_() != 0 || !this.O) {
            return false;
        }
        Object objAj = aj();
        if (objAj instanceof sg.bigo.ads.ad.interstitial.f.c) {
            return ((sg.bigo.ads.ad.interstitial.f.c) objAj).L();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    @CallSuper
    public void l() {
        super.l();
        this.f67753l = ((s) this.f68586y).f().i();
        sg.bigo.ads.api.a.m mVarE = ((s) this.f68586y).f().e();
        this.f67744c = mVarE;
        if (mVarE != null) {
            this.f67745d = true;
        }
        this.f67743b = ((s) this.f68586y).f().d().q();
        this.f67749h = b();
        m();
    }

    public void m() {
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        if (mVar == null || !this.f67745d) {
            sg.bigo.ads.api.a.m mVar2 = this.f67743b;
            if (mVar2 != null) {
                a(mVar2);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.h.a aVarA = sg.bigo.ads.ad.interstitial.h.a.a(this.L, this.C, mVar, aH());
        this.f67761t = aVarA;
        this.f67760s = new sg.bigo.ads.ad.interstitial.e.c((s) this.f68586y, this.f67744c, aVarA);
        a(this.f67744c);
        this.C.f67558w = new WeakReference<>(this);
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final int n() {
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        if (mVar == null) {
            return 0;
        }
        if (this.f67745d) {
            return mVar.a("video_play_page.ad_component_layout");
        }
        return 1;
    }

    public void o() {
        this.f67759r = new p(this.L, ((s) this.f68586y).H(), ((s) this.f68586y).f(), this.f67744c, aH(), this.f67751j, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.9
            @Override // java.lang.Runnable
            public final void run() {
                AdCountDownButton adCountDownButton = a.this.A;
                if (adCountDownButton != null) {
                    adCountDownButton.setAlpha(0.0f);
                }
                a.this.f(10);
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.10
            @Override // java.lang.Runnable
            public final void run() {
                AdCountDownButton adCountDownButton = a.this.A;
                if (adCountDownButton != null) {
                    adCountDownButton.setAlpha(1.0f);
                }
                a aVar = a.this;
                aVar.f(aVar.d());
                a.this.aF();
                if (a.this.e_() == 0) {
                    a.this.g();
                }
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.11
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(false);
            }
        });
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.12
            @Override // java.lang.Runnable
            public final void run() {
                final p pVar = a.this.f67759r;
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Active mid page.");
                sg.bigo.ads.api.a.m mVar = pVar.f68770d;
                Context context = pVar.f68767a;
                if (mVar == null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to empty style config.");
                    return;
                }
                if (context == null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to empty context.");
                    return;
                }
                int iA = mVar.a("mid_page.show_time");
                if (iA != -1 && iA != 0 && iA != 3 && iA != 5 && iA != 10) {
                    iA = 0;
                }
                pVar.E = iA;
                if (iA == 0) {
                    pVar.f68775i = false;
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to show_time in config.");
                    return;
                }
                p.d dVar = pVar.A;
                dVar.f68903b = mVar.a("mid_page.pop_layout");
                dVar.f68902a = mVar.a("mid_page.pop_method");
                dVar.f68904c = mVar.a("mid_page.cta_color");
                p.a aVar = pVar.f68792z;
                aVar.f68885p = pVar;
                aVar.f68874e = mVar.c("mid_page.is_cta_show_animation");
                aVar.f68870a = mVar.a("mid_page.click_type");
                aVar.f68871b = mVar.c("mid_page.ad_component_clickable_switch");
                aVar.f68872c = mVar.c("mid_page.media_view_clickable_switch");
                aVar.f68873d = mVar.c("mid_page.other_space_clickable_switch");
                int iA2 = mVar.a("mid_page.below_area_dp");
                if (iA2 > 0) {
                    aVar.f68875f = sg.bigo.ads.common.utils.e.a(context, iA2);
                }
                aVar.f68876g = mVar.a("mid_page.below_area_clickable") == 1;
                int iA3 = mVar.a("mid_page.up_area_dp");
                if (iA3 > 0) {
                    aVar.f68877h = sg.bigo.ads.common.utils.e.a(context, iA3);
                }
                aVar.f68878i = mVar.a("mid_page.up_area_clickable") == 1;
                aVar.f68879j = sg.bigo.ads.common.utils.e.c(context);
                aVar.f68883n = new View(context);
                aVar.f68884o = new View(context);
                final Context context2 = pVar.f68767a;
                final sg.bigo.ads.ad.b.b bVar = pVar.f68768b;
                final sg.bigo.ads.api.core.b bVar2 = pVar.f68769c;
                if (pVar.a(context2, bVar, bVar2, pVar.f68770d)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Start render mid page.");
                    int i10 = pVar.A.f68902a;
                    ArrayList arrayList = new ArrayList();
                    if (pVar.f68781o) {
                        arrayList.add(2);
                    } else {
                        if (i10 == 1) {
                            arrayList.add(1);
                        }
                        if (i10 == 2) {
                            arrayList.add(1);
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i10 == 3) {
                            arrayList.add(2);
                        }
                        if (i10 == 4) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i10 == 5) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i10 == 6) {
                            arrayList.add(3);
                        }
                        if (i10 == 7) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i10 == 8) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(4);
                        }
                        if (i10 == 9) {
                        }
                        pVar.f68786t = arrayList;
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.3

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ Context f68846a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ sg.bigo.ads.ad.b.b f68847b;

                            /* JADX INFO: renamed from: c */
                            public final /* synthetic */ sg.bigo.ads.api.core.b f68848c;

                            public AnonymousClass3() {
                                context = context2;
                                bVar = bVar;
                                bVar = bVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                p.a(p.this, context, bVar, bVar);
                            }
                        });
                    }
                    arrayList.add(4);
                    pVar.f68786t = arrayList;
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.3

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ Context f68846a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ sg.bigo.ads.ad.b.b f68847b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ sg.bigo.ads.api.core.b f68848c;

                        public AnonymousClass3() {
                            context = context2;
                            bVar = bVar;
                            bVar = bVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            p.a(p.this, context, bVar, bVar);
                        }
                    });
                }
                Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!p.a(p.this)) {
                            Runnable runnable2 = p.this.f68790x;
                            if (runnable2 != null) {
                                runnable2.run();
                                p.this.f68790x = null;
                            }
                            p.this.g();
                        }
                        p.b(p.this);
                    }
                };
                int i11 = pVar.E;
                if (i11 <= 0) {
                    if (i11 != -1) {
                        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page can not be shown due to invalid show delay.");
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page will be shown after video completion.");
                    pVar.f68789w = runnable;
                    pVar.a();
                    return;
                }
                pVar.f68787u = ((long) i11) * 1000;
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page will be shown after " + pVar.E + "s.");
                pVar.f68788v = runnable;
                pVar.a(pVar.f68787u);
                pVar.a();
            }
        });
    }

    @NonNull
    public final h.a p() {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        if (mVar != null) {
            int iA = this.f67745d ? mVar.a("video_play_page.below_area_dp") : 0;
            boolean z12 = this.f67745d && this.f67744c.a("video_play_page.below_area_clickable") == 1;
            int iA2 = this.f67745d ? this.f67744c.a("video_play_page.up_area_dp") : 0;
            boolean z13 = this.f67745d && this.f67744c.a("video_play_page.up_area_clickable") == 1;
            int iA3 = this.f67744c.a("video_play_page.click_type");
            a(this.D, iA, z12, iA2, z13, 8, iA3);
            i10 = iA;
            z10 = z12;
            i11 = iA2;
            z11 = z13;
            i12 = iA3;
        } else {
            i10 = 0;
            z10 = false;
            i11 = 0;
            z11 = false;
            i12 = 0;
        }
        return new h.a(i10, z10, i11, z11, i12);
    }

    public void q() {
        int i10;
        sg.bigo.ads.api.a.m mVar = this.f67744c;
        if (mVar == null || !this.f67745d) {
            return;
        }
        int iA = mVar.a("video_play_page.close_button_style");
        if (iA == 2) {
            i10 = R.drawable.bigo_ad_ic_close2;
        } else if (iA == 3) {
            i10 = R.drawable.bigo_ad_ic_close3;
        } else if (iA != 4) {
            i10 = iA != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5;
        } else {
            i10 = R.drawable.bigo_ad_ic_close4;
        }
        k(i10);
    }

    public int r() {
        w wVar = this.f67749h;
        if (wVar == null) {
            return 0;
        }
        return w.b(wVar.f69017o);
    }

    public void s() {
        int iR;
        if ((((s) this.f68586y).f() instanceof sg.bigo.ads.core.a.a) && ((s) this.f68586y).B()) {
            final sg.bigo.ads.core.a.a aVarI = ((s) this.f68586y).f();
            this.f67757p.set(!aVarI.aZ());
            if (this.f67757p.get() && aVarI.bh() == null && (iR = r()) > 0) {
                sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) iR) * 1000) { // from class: sg.bigo.ads.ad.interstitial.a.15
                    @Override // sg.bigo.ads.common.utils.n
                    public final void a() {
                        aVarI.bc();
                        a aVar = a.this;
                        aVar.a(aVar.f67765x, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.15.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.this.u();
                            }
                        });
                    }

                    @Override // sg.bigo.ads.common.utils.n
                    public final void a(long j10) {
                    }
                };
                this.f67765x = nVar;
                nVar.c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    @CallSuper
    public void t() {
        final YandexWarningTextView yandexWarningTextView;
        ViewGroup viewGroup = this.D;
        sg.bigo.ads.ad.b.b bVar = this.C;
        if (viewGroup == null || bVar == null) {
            return;
        }
        sg.bigo.ads.api.c.b.a(aH());
        if (v() && ((s) this.f68586y).f().w() == 2) {
            sg.bigo.ads.api.c.b.a();
        }
        ViewGroup viewGroup2 = this.D;
        if (viewGroup2 != null) {
            int i10 = R.id.inter_media;
            MediaView mediaView = (MediaView) viewGroup2.findViewById(i10);
            if (mediaView != null && P()) {
                mediaView.setImageBlurBorder(false);
                final ViewGroup viewGroup3 = this.D;
                final sg.bigo.ads.ad.b.b bVar2 = this.C;
                if (viewGroup3 != null && (yandexWarningTextView = (YandexWarningTextView) viewGroup3.findViewById(R.id.inter_warning)) != null) {
                    if (bVar2 == null || ((sg.bigo.ads.core.a.a) bVar2.f()).B() == null || ((sg.bigo.ads.core.a.a) bVar2.f()).B().f() < 0) {
                        yandexWarningTextView.setVisibility(8);
                    } else {
                        final int iF = ((sg.bigo.ads.core.a.a) bVar2.f()).B().f();
                        final View viewFindViewById = viewGroup3.findViewById(R.id.inter_ad_info_exclude_warning);
                        final MediaView mediaView2 = (MediaView) viewGroup3.findViewById(i10);
                        final RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) viewGroup3.findViewById(R.id.inter_media_layout);
                        float f10 = iF * 0.01f;
                        final float f11 = f10 > 0.15f ? 0.15f : f10;
                        if (viewFindViewById != null) {
                            yandexWarningTextView.setIsHorizontal(false);
                            sg.bigo.ads.common.utils.u.a(viewFindViewById, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.r.1

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ View f68910a;

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ YandexWarningTextView f68911b;

                                /* JADX INFO: renamed from: c */
                                public final /* synthetic */ RoundedFrameLayout f68912c;

                                /* JADX INFO: renamed from: d */
                                public final /* synthetic */ float f68913d;

                                /* JADX INFO: renamed from: e */
                                public final /* synthetic */ ViewGroup f68914e;

                                /* JADX INFO: renamed from: f */
                                public final /* synthetic */ sg.bigo.ads.ad.b.b f68915f;

                                /* JADX INFO: renamed from: g */
                                public final /* synthetic */ MediaView f68916g;

                                /* JADX INFO: renamed from: h */
                                public final /* synthetic */ int f68917h;

                                public AnonymousClass1() {
                                    view = viewFindViewById;
                                    yandexWarningTextView = yandexWarningTextView;
                                    roundedFrameLayout = roundedFrameLayout;
                                    f = f11;
                                    viewGroup = viewGroup3;
                                    bVar = bVar2;
                                    mediaView = mediaView2;
                                    i = iF;
                                }

                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public final void onGlobalLayout() {
                                    int measuredHeight = view.getMeasuredHeight();
                                    int iC = sg.bigo.ads.common.utils.e.c(view.getContext());
                                    if (measuredHeight <= 0) {
                                        measuredHeight = sg.bigo.ads.common.utils.e.a(view.getContext(), 130);
                                    }
                                    int paddingTop = yandexWarningTextView.getPaddingTop();
                                    int paddingBottom = yandexWarningTextView.getPaddingBottom();
                                    int iA = sg.bigo.ads.common.utils.e.a(yandexWarningTextView.getContext(), 16);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yandexWarningTextView.getLayoutParams();
                                    int i11 = marginLayoutParams.topMargin;
                                    if (iC < 2000) {
                                        iA *= 2;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                                    int i12 = marginLayoutParams2.topMargin;
                                    int i13 = marginLayoutParams2.bottomMargin;
                                    int i14 = marginLayoutParams2.leftMargin;
                                    int i15 = marginLayoutParams2.rightMargin;
                                    int iRound = Math.round(f * iC) + paddingBottom + paddingTop;
                                    int i16 = (((((iC - measuredHeight) - iRound) - i11) - iA) - i12) - i13;
                                    if (iC <= 1000) {
                                        i16 = iC / 2;
                                        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
                                        if (textView != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                                            marginLayoutParams3.topMargin = 0;
                                            textView.setLayoutParams(marginLayoutParams3);
                                        }
                                        ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_btn_class);
                                        if (viewGroup4 != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) viewGroup4.getLayoutParams();
                                            marginLayoutParams4.topMargin = 0;
                                            viewGroup4.setLayoutParams(marginLayoutParams4);
                                        }
                                        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_title);
                                        if (textView2 != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                                            marginLayoutParams5.topMargin = 0;
                                            textView2.setLayoutParams(marginLayoutParams5);
                                        }
                                    }
                                    int i17 = (view.getContext().getResources().getDisplayMetrics().widthPixels - i14) - i15;
                                    sg.bigo.ads.common.p pVarA = r.a(bVar);
                                    sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarA.f69806b, pVarA.f69807c, i17, i16);
                                    RoundedFrameLayout roundedFrameLayout2 = roundedFrameLayout;
                                    roundedFrameLayout2.setCornerRadius(sg.bigo.ads.common.utils.e.a(roundedFrameLayout2.getContext(), 8));
                                    marginLayoutParams2.setMargins(i14, i12, i15, i13);
                                    marginLayoutParams2.height = pVarA2.f69807c;
                                    marginLayoutParams2.width = pVarA2.f69806b;
                                    sg.bigo.ads.common.utils.u.c(mediaView, -1, -1);
                                    roundedFrameLayout.setLayoutParams(marginLayoutParams2);
                                    if (i == 0) {
                                        yandexWarningTextView.setVisibility(8);
                                        return;
                                    }
                                    marginLayoutParams.height = iRound;
                                    marginLayoutParams.bottomMargin = iA;
                                    yandexWarningTextView.setLayoutParams(marginLayoutParams);
                                }
                            });
                        } else if (iF != 0) {
                            yandexWarningTextView.setIsHorizontal(true);
                            final float f12 = f11;
                            yandexWarningTextView.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.r.2

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ float f68919b;

                                /* JADX INFO: renamed from: c */
                                public final /* synthetic */ sg.bigo.ads.ad.b.b f68920c;

                                /* JADX INFO: renamed from: d */
                                public final /* synthetic */ RoundedFrameLayout f68921d;

                                /* JADX INFO: renamed from: e */
                                public final /* synthetic */ MediaView f68922e;

                                public AnonymousClass2() {
                                    f = f12;
                                    bVar = bVar2;
                                    roundedFrameLayout = roundedFrameLayout;
                                    mediaView = mediaView2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int iC = sg.bigo.ads.common.utils.e.c(yandexWarningTextView.getContext());
                                    int i11 = yandexWarningTextView.getContext().getResources().getDisplayMetrics().widthPixels;
                                    int iRound = Math.round(f * iC) + yandexWarningTextView.getPaddingBottom() + yandexWarningTextView.getPaddingTop();
                                    ViewGroup.LayoutParams layoutParams = yandexWarningTextView.getLayoutParams();
                                    int iA = sg.bigo.ads.common.utils.e.a(yandexWarningTextView.getContext(), 20);
                                    int i12 = (i11 / 2) - (iA * 3);
                                    sg.bigo.ads.common.p pVarA = r.a(bVar);
                                    RoundedFrameLayout roundedFrameLayout2 = roundedFrameLayout;
                                    roundedFrameLayout2.setCornerRadius(sg.bigo.ads.common.utils.e.a(roundedFrameLayout2.getContext(), 8));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                                    marginLayoutParams.setMargins(iA, iA, iA, iA);
                                    if (pVarA.getHeight() <= pVarA.getWidth()) {
                                        marginLayoutParams.width = i12;
                                        marginLayoutParams.height = (int) (((pVarA.getHeight() * 1.0f) * i12) / pVarA.getWidth());
                                        sg.bigo.ads.common.utils.u.c(mediaView, -1, -1);
                                    }
                                    roundedFrameLayout.setLayoutParams(marginLayoutParams);
                                    layoutParams.height = iRound;
                                    yandexWarningTextView.setLayoutParams(layoutParams);
                                }
                            });
                        } else {
                            yandexWarningTextView.setVisibility(8);
                        }
                    }
                }
            }
        }
        aj().a(viewGroup, viewGroup, ai(), Z() ? 8 : 1, this.f67749h.f69011i, this.A);
    }

    public void u() {
    }

    public boolean v() {
        if (!this.f67745d) {
            return false;
        }
        switch (n()) {
            case 6:
                this.f67748g = false;
                this.f67747f = false;
                return !aH();
            case 7:
            case 8:
            case 9:
                this.f67748g = false;
                this.f67747f = false;
                return true;
            case 10:
                this.f67748g = false;
                this.f67747f = true;
                return true;
            case 11:
            case 12:
                this.f67748g = true;
                this.f67747f = false;
                return true;
            default:
                this.f67748g = false;
                this.f67747f = false;
                return false;
        }
    }

    public void w() {
        sg.bigo.ads.api.a.m mVar;
        if (this.f67745d && (mVar = this.f67744c) != null) {
            long jA = ((long) mVar.a("video_play_page.guided_click_gesture_show_time")) * 1000;
            if (jA == 0) {
                return;
            }
            this.f67763v = new AnonymousClass2(jA);
        }
    }

    public final void x() {
        final View viewFindViewById;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_slide_gesture_contain)) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new sg.bigo.ads.common.utils.b.d() { // from class: sg.bigo.ads.ad.interstitial.c.11

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f67897a;

            public AnonymousClass11() {
                view = viewFindViewById;
            }

            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                sg.bigo.ads.common.utils.u.b(view);
            }
        });
        viewFindViewById.startAnimation(alphaAnimation);
        viewFindViewById.setVisibility(8);
    }

    public final void y() {
        View viewFindViewById = this.D.findViewById(R.id.inter_slide_gesture_contain);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setTag(16);
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.a.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    a.this.Q = (int) motionEvent.getX();
                    a.this.R = (int) motionEvent.getY();
                } else if (action == 1 && a.a(a.this.Q, a.this.R, (int) motionEvent.getX(), (int) motionEvent.getY()) > 10.0d) {
                    a.this.x();
                    ((s) a.this.f68586y).H().a((int) motionEvent.getX(), (int) motionEvent.getY(), a.this.Q, a.this.R, 8, ((Integer) view.getTag()).intValue());
                }
                return true;
            }
        });
    }

    @CallSuper
    public void z() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null) {
            return;
        }
        sg.bigo.ads.common.e.a.a(adCountDownButton, this.K);
    }
}
