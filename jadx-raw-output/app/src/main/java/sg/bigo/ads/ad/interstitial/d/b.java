package sg.bigo.ads.ad.interstitial.d;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes9.dex */
public class b extends sg.bigo.ads.ad.interstitial.d.a implements sg.bigo.ads.ad.interstitial.f.c {

    @Nullable
    public ViewGroup A;

    @Nullable
    public Button B;

    @Nullable
    public RoundedFrameLayout C;

    @Nullable
    public MediaView D;

    @Nullable
    public TextView E;

    @Nullable
    public TextView F;

    @Nullable
    public Button G;

    @Nullable
    public Button H;

    @Nullable
    public RoundedImageView I;
    public int J;
    public int K;
    public boolean L;
    private int M;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RelativeLayout f68152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public RealtimeBlurLinearLayout f68153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewGroup f68154z;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.b$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68164a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.b.values().length];
            f68164a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.b.f67864a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68164a[sg.bigo.ads.ad.interstitial.b.f67866c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68164a[sg.bigo.ads.ad.interstitial.b.f67865b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68164a[sg.bigo.ads.ad.interstitial.b.f67868e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68164a[sg.bigo.ads.ad.interstitial.b.f67867d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @RequiresApi(api = 19)
    public class a extends sg.bigo.ads.common.utils.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RectF f68166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RectF f68167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RectF f68168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f68169e = Float.NaN;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private RectF f68170f;

        public a() {
        }

        @Override // sg.bigo.ads.common.utils.b.a
        @CallSuper
        public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
            if (transitionValues.view == b.this.f68153y) {
                Rect rect = (Rect) transitionValues.values.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
                b bVar = b.this;
                Rect rect3 = new Rect(sg.bigo.ads.common.utils.u.a(bVar.B, bVar.J));
                this.f68166b = new RectF(rect3);
                if (rect3.intersect(rect2)) {
                    this.f68167c = new RectF(rect);
                    this.f68168d = new RectF(rect2);
                    this.f68169e = b.this.B.getTranslationY();
                    this.f68170f = new RectF(rect2);
                }
            }
        }

        @Override // sg.bigo.ads.common.utils.b.a
        public final void a(Object obj, Object obj2) {
            if (obj != b.this.f68153y || this.f68167c == null || this.f68168d == null || this.f68170f == null || this.f68166b == null || !(obj2 instanceof PointF) || Float.isNaN(this.f68169e)) {
                return;
            }
            PointF pointF = (PointF) obj2;
            if (this.f68167c.centerX() != this.f68168d.centerX()) {
                b.this.B.setTranslationY(this.f68169e - (Math.abs(this.f68170f.top - this.f68166b.bottom) * (Math.abs(pointF.x - this.f68167c.left) / Math.abs(this.f68168d.left - this.f68167c.left))));
            } else {
                this.f68170f.offsetTo(pointF.x, pointF.y);
                if (new RectF(this.f68166b).intersect(this.f68170f)) {
                    b.this.B.setTranslationY((this.f68169e + this.f68170f.top) - this.f68166b.bottom);
                }
            }
        }
    }

    public b(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.K = -1;
        this.L = false;
    }

    private boolean M() {
        return ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f68936c.f()).aR();
    }

    private void a(@ColorInt int i10, @ColorInt int i11, int i12) {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f68153y;
        if (realtimeBlurLinearLayout != null) {
            float f10 = i12;
            this.f68153y.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, i10, i11, sg.bigo.ads.common.utils.e.a(realtimeBlurLinearLayout.getContext(), 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sg.bigo.ads.common.p b(int i10, int i11, int i12, int i13) {
        sg.bigo.ads.common.p pVar;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) this).f68936c);
        if (pVarA.a(i10, i11)) {
            this.C.setCornerRadius(0.0f);
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            pVar = new sg.bigo.ads.common.p(i10, i11);
        } else {
            RoundedFrameLayout roundedFrameLayout = this.C;
            roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(roundedFrameLayout.getContext(), 8));
            marginLayoutParams.setMargins(i12, i13, i12, i13);
            sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarA.f69806b, pVarA.f69807c, i10 - (i12 * 2), i11 - (i13 * 2));
            int i14 = pVarA2.f69806b;
            marginLayoutParams.width = i14;
            int i15 = pVarA2.f69807c;
            marginLayoutParams.height = i15;
            pVar = new sg.bigo.ads.common.p(i14, i15);
        }
        sg.bigo.ads.common.utils.u.c(this.D, -1, -1);
        this.C.setLayoutParams(marginLayoutParams);
        return pVar;
    }

    private void b(@ColorInt int i10, @ColorInt int i11, int i12) {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f68153y;
        if (realtimeBlurLinearLayout != null) {
            float f10 = i12;
            this.f68153y.setBlurStyle(new sg.bigo.ads.common.view.a.b(f10, f10, f10, f10, i10, i11, sg.bigo.ads.common.utils.e.a(realtimeBlurLinearLayout.getContext(), 1)));
        }
    }

    public void A() {
        B();
    }

    public final void B() {
        if (v()) {
            Button button = this.G;
            if (button != null) {
                sg.bigo.ads.ad.interstitial.c.e(button);
            }
            Button button2 = this.H;
            if (button2 != null) {
                sg.bigo.ads.ad.interstitial.c.e(button2);
            }
        }
    }

    public final void C() {
        Button button;
        if (this.f68118q == null || (button = this.B) == null || button.getVisibility() != 0) {
            return;
        }
        float translationY = this.B.getTranslationY();
        RectF rectF = new RectF(sg.bigo.ads.common.utils.u.a(this.B, this.J));
        rectF.offset(0.0f, -translationY);
        float f10 = rectF.top;
        RectF rectF2 = new RectF(sg.bigo.ads.common.utils.u.a(this.f68123v, 0));
        float f11 = rectF2.top;
        if (rectF2.intersect(rectF)) {
            rectF.offset(0.0f, f11 - rectF.bottom);
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f68153y;
        if (realtimeBlurLinearLayout != null && realtimeBlurLinearLayout.getVisibility() == 0) {
            RectF rectF3 = new RectF(sg.bigo.ads.common.utils.u.a(this.f68153y, 0));
            float f12 = rectF3.top;
            if (rectF3.intersect(rectF)) {
                rectF.offset(0.0f, f12 - rectF.bottom);
            }
        }
        float f13 = rectF.top;
        if (f13 != f10) {
            this.B.setTranslationY(f13 - f10);
        } else {
            this.B.setTranslationY(0.0f);
        }
    }

    public final void D() {
        sg.bigo.ads.common.utils.u.a(this.C, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.C();
            }
        });
    }

    public void E() {
        if (this.f68153y == null) {
            return;
        }
        final int iY = y();
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.4
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f68153y.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(iY > 0);
                    }
                });
            }
        };
        if (iY == 0) {
            runnable.run();
        } else {
            a(iY, runnable);
        }
    }

    public void F() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f68153y;
        if (realtimeBlurLinearLayout == null || this.f68118q == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -(this.f68118q.getMeasuredHeight() - sg.bigo.ads.common.utils.u.a(this.f68118q, this.f68153y).y);
            this.f68153y.requestLayout();
        }
    }

    public void G() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f68153y;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.M;
            this.f68153y.requestLayout();
        }
    }

    public void H() {
        sg.bigo.ads.ad.interstitial.w wVar = this.f68120s;
        int i10 = wVar != null ? wVar.f69011i : 0;
        View viewFindViewById = this.f68118q.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.interstitial.w wVar2 = this.f68120s;
        if (wVar2 == null || !wVar2.f69009g) {
            MediaView mediaView = this.D;
            if (mediaView != null) {
                mediaView.setOtherClickAreaClick(false);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(this.f68118q, viewFindViewById, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        } else {
            MediaView mediaView2 = this.D;
            if (mediaView2 != null) {
                mediaView2.setOtherClickAreaClick(true);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(this.f68118q, viewFindViewById, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, i10);
            }
        }
        sg.bigo.ads.ad.interstitial.w wVar3 = this.f68120s;
        boolean z10 = wVar3 != null && wVar3.f69008f;
        MediaView mediaView3 = this.D;
        if (mediaView3 != null) {
            sg.bigo.ads.ad.b.a.a(this.f68118q, mediaView3, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, i10);
            this.D.setMediaAreaClickable(z10);
            this.D.b().a(!z10);
        }
        sg.bigo.ads.ad.interstitial.w wVar4 = this.f68120s;
        boolean z11 = wVar4 != null && wVar4.f69010h;
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f68153y;
        if (realtimeBlurLinearLayout != null) {
            sg.bigo.ads.ad.b.a.a(realtimeBlurLinearLayout, 18);
            ViewGroup viewGroup = this.f68118q;
            if (z11) {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.f68153y, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, this.f68120s.f69011i);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.f68153y, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final int I() {
        if (this.K == -1) {
            sg.bigo.ads.api.a.m mVar = this.f68121t;
            this.K = mVar != null ? mVar.a("video_play_page.webview_layout") : 0;
        }
        int i10 = this.K;
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return i10;
            default:
                return 0;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final int J() {
        return sg.bigo.ads.ad.interstitial.d.a.b(this.f68121t, "video_play_page.webview_force_time");
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final boolean K() {
        int I = I();
        return I == 5 || I == 6;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final boolean L() {
        return this.L;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d10) {
        if (d10 <= 3.0d) {
            TextView textView = this.f68123v;
            if (textView != null) {
                textView.setTextColor(sg.bigo.ads.common.w.b.a(sg.bigo.ads.ad.interstitial.d.f68105b, 0.6f));
                return;
            }
            return;
        }
        TextView textView2 = this.f68123v;
        if (textView2 != null) {
            textView2.setTextColor(sg.bigo.ads.common.w.b.a(sg.bigo.ads.ad.interstitial.d.f68104a, 0.6f));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final void a(int i10, int i11, int i12, int i13) {
        if (K()) {
            if (i10 >= i12) {
                this.L = true;
                return;
            }
            this.L = false;
            if (this.f68152x != null) {
                int iMin = (i12 - Math.min(i10, i11)) + i13;
                ViewGroup.LayoutParams layoutParams = this.f68152x.getLayoutParams();
                if (iMin != layoutParams.height) {
                    layoutParams.height = iMin;
                    this.f68152x.requestLayout();
                    b(this.f68152x.getMeasuredWidth(), layoutParams.height, sg.bigo.ads.common.utils.e.a(this.C.getContext(), 12), sg.bigo.ads.common.utils.e.a(this.C.getContext(), 12));
                    C();
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, int i10, int i11, int i12, @Nullable View... viewArr) {
        super.a(viewGroup, view, i10, i11, i12, viewArr);
        H();
        sg.bigo.ads.ad.interstitial.t.a((View) this.f68118q);
    }

    public final void a(boolean z10) {
        if (this.f68153y == null || this.f68124w) {
            return;
        }
        final sg.bigo.ads.ad.interstitial.d.a.C0679a c0679aU = u();
        Button button = this.G;
        if (button != null) {
            sg.bigo.ads.ad.interstitial.d.b(button, c0679aU.f68146a);
        }
        if (z10) {
            F();
            this.f68153y.setVisibility(0);
            this.f68153y.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(b.this.new a());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.b.5.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            b.this.A();
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            if (c0679aU.f68147b) {
                                b bVar = b.this;
                                bVar.a(bVar.G, new sg.bigo.ads.common.w.b.a());
                            }
                        }

                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(Transition transition) {
                        }
                    });
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(b.this.f68119r, transitionSet);
                    b.this.G();
                }
            });
        } else {
            this.f68153y.setVisibility(0);
            C();
            A();
            if (c0679aU.f68147b) {
                a(this.G, new sg.bigo.ads.common.w.b.a());
            }
        }
    }

    public boolean a(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        ViewGroup viewGroup;
        if (y() < 0 || (viewGroup = this.f68118q) == null) {
            return false;
        }
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(z());
        if (viewStub != null) {
            this.f68154z = (ViewGroup) viewStub.inflate();
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = (RealtimeBlurLinearLayout) this.f68118q.findViewById(R.id.inter_component_layout);
        this.f68153y = realtimeBlurLinearLayout;
        if (realtimeBlurLinearLayout == null) {
            return false;
        }
        this.I = (RoundedImageView) realtimeBlurLinearLayout.findViewById(R.id.inter_icon);
        this.E = (TextView) this.f68153y.findViewById(R.id.inter_title);
        TextView textView = (TextView) this.f68153y.findViewById(R.id.inter_description);
        this.F = textView;
        bVar.a(this.E, textView);
        bVar.a(this.I);
        sg.bigo.ads.common.utils.u.a(this.f68153y, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.E();
            }
        });
        ViewGroup.LayoutParams layoutParams = this.f68153y.getLayoutParams();
        layoutParams.width = -1;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.M = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        this.f68153y.setVisibility(4);
        this.f68153y.requestLayout();
        return true;
    }

    public void b(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        float fA = sg.bigo.ads.common.utils.e.a(this.f68153y.getContext(), 8);
        Button button = (Button) this.f68153y.findViewById(R.id.inter_btn_cta_main);
        this.H = button;
        if (button != null) {
            button.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, -16724924));
            bVar.a(this.H);
        }
        Button button2 = (Button) this.f68153y.findViewById(R.id.inter_btn_cta);
        this.G = button2;
        if (button2 != null) {
            button2.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, 0));
            bVar.a(this.G);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final ViewGroup k() {
        return this.C;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final MediaView l() {
        return this.D;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final Button m() {
        return this.B;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final boolean n() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void q() {
        String strI = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f68936c.f()).i();
        TextView textView = (TextView) this.f68118q.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    @Override // sg.bigo.ads.ad.interstitial.d.a
    public void t() {
        sg.bigo.ads.ad.interstitial.b bVar;
        Integer numA;
        Integer numA2;
        super.t();
        this.f68152x = (RelativeLayout) this.f68118q.findViewById(R.id.inter_media_component);
        this.A = (ViewGroup) this.f68118q.findViewById(R.id.inter_warning_layout);
        this.B = (Button) this.f68118q.findViewById(R.id.inter_btn_mute);
        this.C = (RoundedFrameLayout) this.f68118q.findViewById(R.id.inter_media_layout);
        this.D = (MediaView) this.f68118q.findViewById(R.id.inter_media);
        this.J = sg.bigo.ads.common.utils.e.a(this.B.getContext(), 12);
        this.D.setImageBlurBorder(false);
        sg.bigo.ads.common.utils.u.a(this.C, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int iA = sg.bigo.ads.common.utils.e.a(b.this.C.getContext(), 12);
                b bVar2 = b.this;
                bVar2.b(bVar2.C.getMeasuredWidth(), b.this.C.getMeasuredHeight(), iA, iA);
                b.this.D();
            }
        });
        sg.bigo.ads.api.a.m mVar = this.f68121t;
        int iA = mVar != null ? mVar.a("video_play_page.ad_component_colour", 2) : 2;
        if (iA == 1) {
            bVar = sg.bigo.ads.ad.interstitial.b.f67864a;
        } else if (iA != 3) {
            bVar = M() ? sg.bigo.ads.ad.interstitial.b.f67865b : sg.bigo.ads.ad.interstitial.b.f67867d;
        } else {
            bVar = M() ? sg.bigo.ads.ad.interstitial.b.f67866c : sg.bigo.ads.ad.interstitial.b.f67868e;
        }
        a(bVar);
        b(bVar);
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f68153y;
        if (realtimeBlurLinearLayout != null) {
            int iA2 = sg.bigo.ads.common.utils.e.a(realtimeBlurLinearLayout.getContext(), 12);
            if (M()) {
                if (this.f68153y != null) {
                    int i10 = AnonymousClass6.f68164a[bVar.ordinal()];
                    if (i10 != 1) {
                        a(sg.bigo.ads.common.w.b.a((i10 == 2 && (numA2 = sg.bigo.ads.ad.interstitial.r.a((NativeAd) ((sg.bigo.ads.ad.interstitial.t) this).f68936c)) != null) ? numA2.intValue() : -12303292, 0.5f), sg.bigo.ads.common.w.b.a(-1, 0.1f), iA2);
                    } else {
                        a(-1, -1, iA2);
                    }
                }
            } else if (this.f68153y != null) {
                int i11 = AnonymousClass6.f68164a[bVar.ordinal()];
                if (i11 == 1) {
                    a(-1, -1, iA2);
                } else if (i11 == 4 && (numA = sg.bigo.ads.ad.interstitial.r.a((NativeAd) ((sg.bigo.ads.ad.interstitial.t) this).f68936c)) != null) {
                    b(sg.bigo.ads.common.w.b.a(numA.intValue(), 0.35f), sg.bigo.ads.common.w.b.a(numA.intValue(), 0.1f), iA2);
                } else {
                    b(sg.bigo.ads.common.w.b.a(-3355444, 0.35f), sg.bigo.ads.common.w.b.a(-1, 0.1f), iA2);
                }
            }
            bVar.b(this.f68153y);
            bVar.a(this.E, this.F);
        }
    }

    public int z() {
        return R.id.inter_component_19;
    }
}
