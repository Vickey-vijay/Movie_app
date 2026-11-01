package sg.bigo.ads.ad.interstitial.d;

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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes.dex */
public class m extends a {
    public LinearLayout A;
    public sg.bigo.ads.ad.interstitial.multi_img.view.c B;
    public sg.bigo.ads.ad.interstitial.multi_img.view.c C;
    public sg.bigo.ads.ad.interstitial.multi_img.a D;
    public sg.bigo.ads.ad.interstitial.multi_img.view.b E;
    public sg.bigo.ads.ad.interstitial.multi_img.b F;
    private final Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> G;
    private final sg.bigo.ads.ad.b.a.InterfaceC0651a H;
    private final AtomicBoolean I;
    private final List<Runnable> J;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewFlow f68187x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Indicator f68188y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RoundedFrameLayout f68189z;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.m$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68215a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f68215a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68215a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68215a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68215a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public m(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.G = new HashSet();
        this.H = new sg.bigo.ads.ad.b.a.InterfaceC0651a() { // from class: sg.bigo.ads.ad.interstitial.d.m.1
            @Override // sg.bigo.ads.ad.b.a.InterfaceC0651a
            public final boolean a() {
                ViewFlow viewFlow = m.this.f68187x;
                if (viewFlow != null) {
                    return viewFlow.f70160h;
                }
                return false;
            }
        };
        this.I = new AtomicBoolean(false);
        this.J = new ArrayList();
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i10, String str, boolean z10) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(context, this.F, cVar, D(), i10, str, z10, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.ad.interstitial.d.m.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                m.this.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.4.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            synchronized (m.this.G) {
                                m.this.G.remove(aVar3);
                            }
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
        this.f68187x.addView(aVar.f68733j, bVar);
        if (this.D != null) {
            aVar.f68741r = new sg.bigo.ads.ad.interstitial.multi_img.view.d.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.5
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    m.this.D.a(m.this.f68187x.a(aVar.f68733j));
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

    public static /* synthetic */ void a(m mVar, final long j10, long j11, final long j12) {
        if (j10 > 0) {
            ViewFlow viewFlow = mVar.f68187x;
            if (!viewFlow.f70159g && !viewFlow.e()) {
                mVar.f68187x.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(mVar.f68118q.getContext(), 40);
                final int scrollX = mVar.f68187x.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j12);
                valueAnimatorOfInt.setStartDelay(j11);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.d.m.12
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        m.a(m.this, j10 - 1, 300L, j12);
                    }
                };
                valueAnimatorOfInt.addListener(animatorListenerAdapter);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.d.m.13
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (m.this.I.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            m.this.J.add(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.13.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                                    m.a(m.this, j10, 300L, j12);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            m.this.f68187x.scrollTo(scrollX + ((Integer) animatedValue).intValue(), m.this.f68187x.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        mVar.f68187x.setScrollEnabled(true);
    }

    public final void A() {
        int iA = this.f68187x.a(this.E.f68733j);
        if (iA < 0 || iA == this.f68187x.getCurrentItem()) {
            return;
        }
        this.f68187x.b(iA);
    }

    @Nullable
    public final sg.bigo.ads.api.a.m B() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        if (bVar != null) {
            return bVar.f68652a;
        }
        return null;
    }

    public boolean C() {
        return E() == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public int D() {
        return w();
    }

    public sg.bigo.ads.ad.interstitial.multi_img.d E() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        return bVar != null ? bVar.f68653b : sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public sg.bigo.ads.ad.interstitial.multi_img.c F() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        return bVar != null ? bVar.f68655d : sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
    }

    public final void G() {
        this.I.set(true);
    }

    public final void H() {
        this.I.set(false);
        if (sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f68187x)) {
            sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f68187x, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.d.m.14
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = m.this.J.iterator();
                    while (it.hasNext()) {
                        m.this.f68187x.post((Runnable) it.next());
                    }
                    m.this.J.clear();
                    sg.bigo.ads.ad.interstitial.multi_img.f.a(m.this.f68187x, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.J.iterator();
        while (it.hasNext()) {
            this.f68187x.post(it.next());
        }
        this.J.clear();
    }

    public void I() {
        if (C()) {
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        int iA = bVar != null ? bVar.f68652a.a("video_play_page.multi_guide") : 0;
        switch (iA) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(iA, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.f68187x.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                m mVar = m.this;
                                if (mVar.f68187x.f70159g) {
                                    return;
                                }
                                m.a(mVar, 3L, 0L, 300L);
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
                this.f68187x.setFlipInterval((iA - 5) * 1000);
                this.f68187x.c();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    public void J() {
        T t10;
        boolean z10;
        T t11;
        sg.bigo.ads.ad.interstitial.w wVar = this.f68120s;
        int i10 = wVar != null ? wVar.f69011i : 0;
        View viewFindViewById = this.f68118q.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.b.a.a(this.f68187x, 9);
        sg.bigo.ads.ad.interstitial.w wVar2 = this.f68120s;
        if (wVar2 == null || !wVar2.f69009g) {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
            if (bVar != null && (t10 = bVar.f68735l) != 0) {
                ((MediaView) t10).setOtherClickAreaClick(false);
            }
            ViewGroup viewGroup = this.f68118q;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.q.F;
            sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, hVar, 0);
            sg.bigo.ads.ad.b.a.a(this.f68118q, this.f68187x, 8, hVar, 0);
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar2 = this.E;
            if (bVar2 != null && (t11 = bVar2.f68735l) != 0) {
                ((MediaView) t11).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.ad.b.a.a(this.f68118q, viewFindViewById, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, i10);
            sg.bigo.ads.ad.b.a.a(this.f68118q, this.f68187x, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, i10);
        }
        int i11 = 3;
        if (C()) {
            i11 = i10;
            z10 = false;
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.b bVar3 = this.F;
            int iA = bVar3 != null ? bVar3.f68652a.a("video_play_page.multi_click_type") : 1;
            if (iA == 2) {
                z10 = false;
            } else {
                if (iA != 3) {
                    i11 = i10;
                } else if (i10 == 1 || i10 == 2) {
                    z10 = true;
                }
                z10 = false;
            }
        }
        sg.bigo.ads.ad.interstitial.w wVar3 = this.f68120s;
        boolean z11 = wVar3 != null && wVar3.f69008f;
        a(i10, z11, i11, z10);
        Iterator<View> it = this.f68187x.getItems().iterator();
        while (it.hasNext()) {
            Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f68727e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                sg.bigo.ads.ad.b.a.a(dVar.f68733j, 5);
                ViewGroup viewGroup2 = this.f68118q;
                RoundedFrameLayout roundedFrameLayout = dVar.f68733j;
                if (z11) {
                    sg.bigo.ads.ad.b.b bVar4 = ((sg.bigo.ads.ad.interstitial.t) this).f68936c;
                    if (z10) {
                        sg.bigo.ads.ad.b.a.a(viewGroup2, roundedFrameLayout, 8, bVar4, this.H);
                    } else {
                        sg.bigo.ads.ad.b.a.a(viewGroup2, roundedFrameLayout, 8, bVar4, i11);
                    }
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup2, roundedFrameLayout, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
                }
            }
        }
    }

    public final boolean K() {
        View viewA;
        ViewFlow viewFlow = this.f68187x;
        if (viewFlow == null) {
            return false;
        }
        List<View> items = viewFlow.getItems();
        if (sg.bigo.ads.common.utils.k.a((Collection) items) || items.size() != 1 || (viewA = this.f68187x.a(0)) == null) {
            return false;
        }
        Object tag = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f68727e);
        if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
            sg.bigo.ads.ad.interstitial.multi_img.c cVar = sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_PARENT;
            dVar.a(cVar);
            dVar.a(4);
            this.f68187x.setViewStyle(3);
            ((ViewFlow.b) viewA.getLayoutParams()).f70199d = cVar.f68672d;
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public void a(double d10) {
        if (d10 <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.B;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.C;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.B;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.C;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    public void a(int i10, boolean z10, int i11, boolean z11) {
        T t10;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar == null || (t10 = bVar.f68735l) == 0) {
            return;
        }
        if (z11) {
            sg.bigo.ads.ad.b.a.a(this.f68118q, t10, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, this.H);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f68118q, t10, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, i11);
        }
        if (z10) {
            ((MediaView) this.E.f68735l).setMediaAreaClickable(true);
            ((MediaView) this.E.f68735l).b().a(false);
        } else {
            ((MediaView) this.E.f68735l).setMediaAreaClickable(false);
            ((MediaView) this.E.f68735l).b().a(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, final sg.bigo.ads.ad.interstitial.t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        super.a(viewGroup, view, new sg.bigo.ads.ad.interstitial.t.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.7
            @Override // sg.bigo.ads.ad.interstitial.t.a
            public final Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
                if (textView != null && textView.getTag() == 2 && sg.bigo.ads.common.utils.q.a((CharSequence) str2)) {
                    str2 = ((sg.bigo.ads.ad.interstitial.t) m.this).f68936c.getDescription();
                }
                sg.bigo.ads.ad.interstitial.t.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i10, i11, i12, viewArr);
        J();
    }

    public final void a(sg.bigo.ads.ad.interstitial.a aVar, @NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.interstitial.w wVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.f fVar) {
        this.F = bVar;
        a(aVar, viewGroup, wVar, bVar.f68652a, fVar);
    }

    public void a(sg.bigo.ads.ad.interstitial.q qVar) {
    }

    public void b(int i10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a, sg.bigo.ads.ad.interstitial.t
    public final void f() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            ((MediaView) bVar.f68735l).c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final ViewGroup k() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            return bVar.f68734k;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final MediaView l() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            return (MediaView) bVar.f68735l;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final Button m() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            return bVar.f68717a;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void p() {
        super.p();
        synchronized (this.G) {
            if (this.G.isEmpty()) {
                return;
            }
            final HashSet hashSet = new HashSet(this.G);
            this.G.clear();
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.11
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        synchronized (m.this.G) {
                            m.this.G.addAll(hashSet);
                        }
                        return;
                    }
                    for (sg.bigo.ads.ad.interstitial.multi_img.view.d dVar : hashSet) {
                        if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.b) {
                            ((sg.bigo.ads.ad.interstitial.multi_img.view.b) dVar).a(bitmap2);
                        } else if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.a) {
                            ((sg.bigo.ads.ad.interstitial.multi_img.view.a) dVar).a(bitmap2);
                        }
                    }
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void r() {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void s() {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @CallSuper
    public void t() {
        super.t();
        Context context = this.f68118q.getContext();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        List<String> listA = bVar != null ? bVar.a() : null;
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = this.F;
        boolean z10 = bVar2 != null && bVar2.f68656e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVarE = E();
        sg.bigo.ads.ad.interstitial.multi_img.c cVarF = F();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) this).f68936c);
        this.f68187x = (ViewFlow) this.f68118q.findViewById(R.id.inter_media_ad_view_flow);
        this.f68188y = (Indicator) this.f68118q.findViewById(R.id.inter_vf_indicator);
        int iX = x();
        if (iX == 3 || iX == 4) {
            this.D = new sg.bigo.ads.ad.interstitial.multi_img.a(this.f68118q, this.f68187x, this.f68116o, iX);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context, cVarF, z(), w(), iX);
        this.E = bVar3;
        this.f68189z = bVar3.f68733j;
        ((MediaView) bVar3.f68735l).setImageBlurBorder(false);
        this.E.a(pVarA.f69806b, pVarA.f69807c);
        if (this.E.b()) {
            final boolean zAR = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f68936c.f()).aR();
            if (zAR) {
                synchronized (this.G) {
                    this.G.add(this.E);
                }
            }
            if (this.D != null) {
                this.E.f68741r = new sg.bigo.ads.ad.interstitial.multi_img.view.d.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.8
                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        m mVar = m.this;
                        m.this.D.a(mVar.f68187x.a(mVar.E.f68733j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        m.this.E.f68741r = null;
                        a();
                    }
                };
            }
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        if (zAR) {
                            synchronized (m.this.G) {
                                m.this.G.remove(m.this.E);
                            }
                        }
                        m.this.E.a(bitmap2);
                    }
                }
            });
        }
        this.A = (LinearLayout) this.f68118q.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.q.a((CharSequence) ((sg.bigo.ads.ad.interstitial.t) this).f68936c.getWarning())) {
            ((ViewGroup.MarginLayoutParams) this.A.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.e.a(context, 8);
        }
        a(this.f68117p);
        if (this.F != null) {
            this.f68187x.setDividerWidth(sg.bigo.ads.common.utils.e.a(context, dVarE.f68680f));
            this.f68187x.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, dVarE.f68683i));
            this.f68187x.setViewStyle(dVarE.f68684j);
            this.f68187x.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVarE, this.f68188y, this.D));
            int i10 = 0;
            for (int i11 = 0; listA != null && i11 < listA.size(); i11++) {
                String str = listA.get(i11);
                if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                    a(context, cVarF, iX, str, ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f68936c.f()).al());
                    i10++;
                }
            }
            int iMax = Math.max(dVarE == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? 2 - i10 : 0, 0);
            if (z10) {
                iMax = Math.max(iMax, 1);
            }
            int i12 = iMax;
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i10 + 1;
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = a(context, cVarF, iX, (String) null, false);
                final boolean zAR2 = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f68936c.f()).aR();
                if (zAR2) {
                    synchronized (this.G) {
                        this.G.add(aVarA);
                    }
                }
                a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.10
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            if (zAR2) {
                                synchronized (m.this.G) {
                                    m.this.G.remove(aVarA);
                                }
                            }
                            aVarA.a(bitmap2);
                        }
                    }
                });
                i13++;
                i10 = i14;
            }
            sg.bigo.ads.ad.interstitial.multi_img.d dVar = sg.bigo.ads.ad.interstitial.multi_img.d.CENTER;
            int i15 = dVarE == dVar ? i10 >> 1 : 0;
            ViewFlow.b bVar4 = new ViewFlow.b();
            bVar4.f70196a = pVarA.f69806b;
            bVar4.f70197b = pVarA.f69807c;
            bVar4.f70198c = true;
            bVar4.f70199d = cVarF.f68672d;
            this.f68187x.addView(this.f68189z, Math.max(0, i15), bVar4);
            int i16 = AnonymousClass6.f68215a[dVarE.ordinal()];
            if (i16 == 1 || i16 == 2 || i16 == 3 || i16 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.interstitial.d.m.3
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        ((sg.bigo.ads.ad.interstitial.t) m.this).f68936c.a((sg.bigo.ads.common.i) null, 8, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, true);
                this.B = cVar;
                this.f68187x.setStartView(cVar.f68720a);
                this.f68187x.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, false);
                this.C = cVar2;
                this.f68187x.setEndView(cVar2.f68720a);
                this.f68187x.setOnEndViewShowListener(dVar2);
            }
            int iA = dVarE == dVar ? this.f68187x.a(this.f68189z) : 0;
            this.f68187x.b(iA);
            sg.bigo.ads.ad.interstitial.multi_img.a aVar = this.D;
            if (aVar != null) {
                aVar.b(iA);
            }
        }
        b(y());
        I();
    }

    public boolean z() {
        return false;
    }
}
