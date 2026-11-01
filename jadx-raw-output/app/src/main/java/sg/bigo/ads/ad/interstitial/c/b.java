package sg.bigo.ads.ad.interstitial.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.d f67974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.multi_img.b f67975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewFlow f67976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Indicator f67977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f67978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.view.c f67979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.view.c f67980u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.a f67981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ValueCallback<Double> f67982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f67983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<Runnable> f67984y;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.c.b$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67996a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f67996a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67996a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67996a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67996a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar2, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
        this.f67982w = new ValueCallback<Double>() { // from class: sg.bigo.ads.ad.interstitial.c.b.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d10) {
                Double d11 = d10;
                if (d11 != null) {
                    b.this.b(d11.doubleValue());
                }
            }
        };
        this.f67983x = new AtomicBoolean(false);
        this.f67984y = new ArrayList();
        this.f67975p = bVar2;
        this.f67974o = new sg.bigo.ads.ad.interstitial.d();
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(final sg.bigo.ads.ad.interstitial.q qVar, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i10, String str, boolean z10) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(this.f67930j.getContext(), this.f67975p, cVar, e(), i10, str, z10, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.ad.interstitial.c.b.12
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                sg.bigo.ads.ad.interstitial.u.a(qVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.b.12.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            aVar3.a(bitmap2);
                        }
                    }
                });
            }
        });
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.f70196a = -1;
        bVar.f70197b = -1;
        bVar.f70198c = false;
        bVar.f70199d = cVar.f68672d;
        this.f67976q.addView(aVar.f68733j, bVar);
        if (this.f67981v != null) {
            aVar.f68741r = new sg.bigo.ads.ad.interstitial.multi_img.view.d.a() { // from class: sg.bigo.ads.ad.interstitial.c.b.2
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    b.this.f67981v.a(b.this.f67976q.a(aVar.f68733j));
                }

                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void b() {
                    aVar.f68741r = null;
                    a();
                }
            };
        }
        return aVar;
    }

    public static /* synthetic */ void a(b bVar, final long j10, long j11, final long j12) {
        if (j10 > 0) {
            ViewFlow viewFlow = bVar.f67976q;
            if (!viewFlow.f70159g && !viewFlow.e()) {
                bVar.f67976q.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(bVar.f67930j.getContext(), 40);
                final int scrollX = bVar.f67976q.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j12);
                valueAnimatorOfInt.setStartDelay(j11);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.c.b.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        b.a(b.this, j10 - 1, 300L, j12);
                    }
                };
                valueAnimatorOfInt.addListener(animatorListenerAdapter);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.c.b.8
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (b.this.f67983x.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            b.this.f67984y.add(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    b.a(b.this, j10, 300L, j12);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            b.this.f67976q.scrollTo(scrollX + ((Integer) animatedValue).intValue(), b.this.f67976q.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        bVar.f67976q.setScrollEnabled(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d10) {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(int i10, boolean z10, boolean z11) {
        boolean z12;
        List<View> items = this.f67976q.getItems();
        sg.bigo.ads.ad.b.a.a(this.f67931k, 9);
        sg.bigo.ads.ad.b.a.a(this.f67976q, 9);
        if (z11) {
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f67931k, 4, this.f68982f, i10);
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f67976q, 4, this.f68982f, i10);
        } else {
            ViewGroup viewGroup = this.f67930j;
            ViewGroup viewGroup2 = this.f67931k;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.q.F;
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup2, 4, hVar, 0);
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f67976q, 4, hVar, 0);
        }
        if (l()) {
            z12 = false;
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f67975p;
            z12 = true;
            int iA = bVar != null ? bVar.f68652a.a("endpage.multi_click_type") : 1;
            if (iA == 2) {
                z12 = false;
            } else if (iA != 3) {
                z12 = false;
            } else if (i10 != 1 && i10 != 2) {
                z12 = false;
            }
            i10 = 3;
        }
        Iterator<View> it = items.iterator();
        while (it.hasNext()) {
            Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f68727e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                sg.bigo.ads.ad.b.a.a(dVar.f68733j, 5);
                ViewGroup viewGroup3 = this.f67930j;
                RoundedFrameLayout roundedFrameLayout = dVar.f68733j;
                if (z10) {
                    sg.bigo.ads.ad.b.b bVar2 = this.f68982f;
                    if (z12) {
                        sg.bigo.ads.ad.b.a.a(viewGroup3, roundedFrameLayout, 4, bVar2, new sg.bigo.ads.ad.b.a.InterfaceC0651a() { // from class: sg.bigo.ads.ad.interstitial.c.b.3
                            @Override // sg.bigo.ads.ad.b.a.InterfaceC0651a
                            public final boolean a() {
                                return b.this.f67976q.f70160h;
                            }
                        });
                    } else {
                        sg.bigo.ads.ad.b.a.a(viewGroup3, roundedFrameLayout, 4, bVar2, i10);
                    }
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup3, roundedFrameLayout, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, View view) {
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, final sg.bigo.ads.ad.interstitial.t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        return super.a(qVar, viewGroup, view, new sg.bigo.ads.ad.interstitial.t.a() { // from class: sg.bigo.ads.ad.interstitial.c.b.5
            @Override // sg.bigo.ads.ad.interstitial.t.a
            public final Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
                if (textView.getTag() == 2 && sg.bigo.ads.common.utils.q.a((CharSequence) str2)) {
                    str2 = b.this.f68982f.getDescription();
                }
                sg.bigo.ads.ad.interstitial.t.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i10, i11, i12, viewArr);
    }

    public void b(double d10) {
        if (d10 <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.f67979t;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.f67980u;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.f67979t;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.f67980u;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void d(sg.bigo.ads.ad.interstitial.q qVar) {
        Context context = this.f67930j.getContext();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f67975p;
        List<String> listA = bVar != null ? bVar.a() : null;
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = this.f67975p;
        boolean z10 = bVar2 != null && bVar2.f68656e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVar = bVar2 != null ? bVar2.f68653b : sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = bVar2 != null ? bVar2.f68655d : sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(this.f68982f);
        this.f67976q = (ViewFlow) this.f67931k.findViewById(R.id.inter_media_ad_view_flow);
        this.f67977r = (Indicator) this.f67931k.findViewById(R.id.inter_vf_indicator);
        sg.bigo.ads.api.a.m mVar = this.f68983g;
        int iA = sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar != null ? mVar.a("endpage.background_colour") : 1);
        if (iA == 2) {
            this.f67931k.setBackgroundColor(this.f67974o.a(ViewCompat.MEASURED_STATE_MASK));
        } else if (iA == 3 || iA == 4) {
            this.f67931k.setBackgroundColor(this.f67974o.a(ViewCompat.MEASURED_STATE_MASK));
            this.f67981v = new sg.bigo.ads.ad.interstitial.multi_img.a(this.f67931k, this.f67976q, this.f67974o, iA);
        } else {
            this.f67931k.setBackgroundColor(this.f67974o.a(-1));
        }
        this.f67978s = (LinearLayout) this.f67931k.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.q.a((CharSequence) this.f68982f.getWarning())) {
            ((ViewGroup.MarginLayoutParams) this.f67978s.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.e.a(context, 8);
        }
        g(qVar);
        this.f67974o.a(this.f67982w);
        if (this.f67975p != null) {
            Context context2 = this.f67930j.getContext();
            this.f67976q.setDividerWidth(sg.bigo.ads.common.utils.e.a(context2, dVar.f68680f));
            this.f67976q.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context2, dVar.f68683i));
            this.f67976q.setViewStyle(dVar.f68684j);
            this.f67976q.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVar, this.f67977r, this.f67981v));
            int i10 = 0;
            int i11 = 0;
            while (listA != null && i11 < listA.size()) {
                String str = listA.get(i11);
                if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                    a(qVar, cVar, iA, str, ((sg.bigo.ads.core.a.a) this.f68982f.f()).al());
                    i10++;
                }
                i11++;
                context2 = context2;
            }
            Context context3 = context2;
            int iMax = Math.max(dVar == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? 3 - i10 : 0, 0);
            if (z10) {
                iMax = Math.max(iMax, 1);
            }
            int i12 = iMax;
            for (int i13 = 0; i13 < i12; i13++) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = a(qVar, cVar, iA, (String) null, false);
                sg.bigo.ads.ad.interstitial.u.a(qVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.b.6
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        aVarA.a(bitmap);
                    }
                });
            }
            this.f67976q.setMainChildSize(pVarA);
            int i14 = AnonymousClass4.f67996a[dVar.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.interstitial.c.b.11
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        b.this.f68982f.a((sg.bigo.ads.common.i) null, 4, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context3, true);
                this.f67979t = cVar2;
                this.f67976q.setStartView(cVar2.f68720a);
                this.f67976q.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context3, false);
                this.f67980u = cVar3;
                this.f67976q.setEndView(cVar3.f68720a);
                this.f67976q.setOnEndViewShowListener(dVar2);
            }
            int itemCount = dVar == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? this.f67976q.getItemCount() >> 1 : 0;
            this.f67976q.b(itemCount);
            sg.bigo.ads.ad.interstitial.multi_img.a aVar = this.f67981v;
            if (aVar != null) {
                aVar.b(itemCount);
            }
        }
        if (l()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar3 = this.f67975p;
        int iA2 = bVar3 != null ? bVar3.f68652a.a("endpage.multi_guide") : 0;
        switch (iA2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(iA2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.f67976q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.10.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                b bVar4 = b.this;
                                if (bVar4.f67976q.f70159g) {
                                    return;
                                }
                                b.a(bVar4, 3L, 0L, 300L);
                            }
                        });
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f67976q.setFlipInterval((iA2 - 5) * 1000);
                this.f67976q.c();
                break;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        return false;
    }

    public void g(sg.bigo.ads.ad.interstitial.q qVar) {
    }

    public final boolean l() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f67975p;
        return bVar == null || bVar.f68653b == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public final void m() {
        this.f67983x.set(true);
    }

    public final void n() {
        this.f67983x.set(false);
        if (sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f67976q)) {
            sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f67976q, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.c.b.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = b.this.f67984y.iterator();
                    while (it.hasNext()) {
                        b.this.f67976q.post((Runnable) it.next());
                    }
                    b.this.f67984y.clear();
                    sg.bigo.ads.ad.interstitial.multi_img.f.a(b.this.f67976q, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.f67984y.iterator();
        while (it.hasNext()) {
            this.f67976q.post(it.next());
        }
        this.f67984y.clear();
    }
}
