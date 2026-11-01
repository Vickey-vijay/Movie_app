package sg.bigo.ads.ad.interstitial.d;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public class n extends m {
    private LinearLayout G;
    private RoundedFrameLayout H;
    private TextView I;
    private IconListView J;
    private RoundedFrameLayout K;
    private Button L;
    private sg.bigo.ads.common.utils.n M;
    private ImageView N;
    private boolean O;
    private boolean P;
    private int Q;

    public n(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.O = false;
        this.P = false;
    }

    private void a(sg.bigo.ads.common.w.b.a aVar, boolean z10) {
        a.C0679a c0679aU = u();
        Button button = this.L;
        if (button != null) {
            sg.bigo.ads.ad.interstitial.d.a(button, c0679aU.f68146a, aVar);
        }
        TextView textView = this.I;
        if (textView != null) {
            textView.setTextColor(c0679aU.f68146a);
        }
        if (z10 && c0679aU.f68147b) {
            a(this.L, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.d.n.8
                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i10) {
                    super.b(i10);
                    if (n.this.I != null) {
                        n.this.I.setTextColor(i10);
                    }
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    public static /* synthetic */ void b(n nVar, int i10) {
        long jA;
        sg.bigo.ads.common.utils.r rVar;
        final boolean zV = nVar.v();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.n.7
            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                if (zV) {
                    sg.bigo.ads.ad.interstitial.c.e(n.this.K);
                }
                n.this.I();
            }
        });
        TransitionManager.beginDelayedTransition(nVar.f68119r, transitionSet);
        nVar.a(new sg.bigo.ads.common.w.b.a(), true);
        nVar.c(i10);
        sg.bigo.ads.ad.interstitial.f fVar = nVar.f68122u;
        if (fVar != null) {
            int i11 = fVar.f68408b;
            int i12 = 3;
            if (i11 == 1) {
                rVar = sg.bigo.ads.common.utils.r.f70030a;
            } else if (i11 == 2) {
                rVar = sg.bigo.ads.common.utils.r.f70030a;
                i12 = 5;
            } else if (i11 != 3) {
                jA = 0;
            } else {
                rVar = sg.bigo.ads.common.utils.r.f70030a;
                i12 = 10;
            }
            jA = rVar.a(i12);
        } else {
            jA = 0;
        }
        long jMax = Math.max(0L, jA);
        if (jMax == 0) {
            nVar.N.setVisibility(0);
        } else {
            nVar.N.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.t) n.this).f68936c)) {
                        return;
                    }
                    TransitionSet transitionSet2 = new TransitionSet();
                    transitionSet2.addTransition(new Fade());
                    TransitionManager.beginDelayedTransition(n.this.H, transitionSet2);
                    n.this.N.setVisibility(0);
                }
            }, jMax);
        }
        nVar.N.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.d.n.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.g(n.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        if (this.E == null) {
            return;
        }
        int iN = N();
        int iM = M();
        Context context = this.f68189z.getContext();
        this.E.f68734k.setCornerRadius(L());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.E.f68734k.getLayoutParams();
        marginLayoutParams.leftMargin = iM;
        boolean z10 = this.P;
        marginLayoutParams.topMargin = z10 ? this.Q + iN : iN;
        marginLayoutParams.rightMargin = iM;
        if (z10) {
            iN += this.Q;
        }
        marginLayoutParams.bottomMargin = iN;
        this.E.f68734k.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f68189z.getLayoutParams();
        int i11 = this.Q;
        marginLayoutParams2.topMargin = -i11;
        marginLayoutParams2.height = i10 + (i11 * 2);
        this.f68189z.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.E.f68717a.getLayoutParams();
        marginLayoutParams3.bottomMargin = this.Q + sg.bigo.ads.common.utils.e.a(context, 12);
        this.E.f68717a.setLayoutParams(marginLayoutParams3);
        RoundedFrameLayout roundedFrameLayout = this.H;
        int i12 = this.Q;
        roundedFrameLayout.a(i12, i12, 0.0f, 0.0f);
        this.H.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.H.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 0;
        layoutParams.weight = 1.0f;
        layoutParams.topMargin = -this.Q;
        this.H.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void c(n nVar) {
        nVar.O = true;
        nVar.P = true;
        nVar.f68118q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.3
            @Override // java.lang.Runnable
            public final void run() {
                n nVar2 = n.this;
                nVar2.G.getMeasuredWidth();
                nVar2.c(n.this.G.getMeasuredHeight());
                n.this.N.setVisibility(4);
            }
        });
        final float fA = sg.bigo.ads.common.utils.e.a(nVar.f68118q.getContext(), 252);
        final float measuredWidth = nVar.f68189z.getMeasuredWidth();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) nVar).f68936c);
        if (pVarA.a()) {
            float f10 = measuredWidth / fA;
            int i10 = pVarA.f69806b;
            int i11 = pVarA.f69807c;
            if (f10 < (i10 * 1.0f) / i11) {
                fA = ((i11 * measuredWidth) * 1.0f) / i10;
            }
        }
        nVar.f68118q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.4
            @Override // java.lang.Runnable
            public final void run() {
                n.b(n.this, (int) fA);
            }
        });
    }

    public static /* synthetic */ void g(n nVar) {
        nVar.P = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        TransitionManager.beginDelayedTransition(nVar.f68119r, transitionSet);
        nVar.G.getMeasuredWidth();
        nVar.c(nVar.G.getMeasuredHeight());
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final boolean C() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final int D() {
        return Integer.MIN_VALUE;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final sg.bigo.ads.ad.interstitial.multi_img.c F() {
        return sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void I() {
        if (this.P) {
            super.I();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void J() {
        super.J();
        if (this.f68120s.f69010h) {
            sg.bigo.ads.ad.b.a.a(this.H, 18);
            sg.bigo.ads.ad.b.a.a(this.f68118q, this.H, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, this.f68120s.f69011i);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f68118q, this.H, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        IconListView iconListView = this.J;
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
        sg.bigo.ads.ad.interstitial.w wVar = this.f68120s;
        if (wVar == null || !wVar.f69009g) {
            sg.bigo.ads.ad.b.a.a(this.f68118q, this.E.f68733j, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
        } else {
            sg.bigo.ads.ad.b.a.a(this.E.f68733j, 9);
            sg.bigo.ads.ad.b.a.a(this.f68118q, this.E.f68733j, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, this.f68120s.f69011i);
        }
    }

    public int L() {
        return 0;
    }

    public int M() {
        return 0;
    }

    public int N() {
        return 0;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void a(int i10, boolean z10, int i11, boolean z11) {
        super.a(i10, z10, i10, false);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void a(sg.bigo.ads.ad.interstitial.q qVar) {
        super.a(qVar);
        this.G = (LinearLayout) this.f68118q.findViewById(R.id.inter_media_container);
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.f68118q.findViewById(R.id.inter_media_gp_container);
        this.H = roundedFrameLayout;
        this.I = (TextView) roundedFrameLayout.findViewById(R.id.inter_company);
        this.J = (IconListView) this.H.findViewById(R.id.inter_download_msg);
        RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) this.H.findViewById(R.id.inter_btn_cta_layout);
        this.K = roundedFrameLayout2;
        this.L = (Button) roundedFrameLayout2.findViewById(R.id.inter_btn_cta);
        this.N = (ImageView) this.H.findViewById(R.id.inter_gp_btn_close);
        this.Q = sg.bigo.ads.common.utils.e.a(this.f68118q.getContext(), 12);
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void b() {
        super.b();
        sg.bigo.ads.common.utils.n nVar = this.M;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.M.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void b(int i10) {
        super.b(i10);
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) Math.max(1, i10)) * 1000) { // from class: sg.bigo.ads.ad.interstitial.d.n.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                n.this.f68118q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.c(n.this);
                    }
                });
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
        this.M = nVar;
        nVar.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void c() {
        super.c();
        sg.bigo.ads.common.utils.n nVar = this.M;
        if (nVar == null || nVar.e()) {
            return;
        }
        this.M.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    public final void t() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar;
        super.t();
        this.f68123v.setTextColor(sg.bigo.ads.ad.interstitial.d.f68105b);
        ((m) this).f68187x.removeView(this.f68189z);
        this.f68189z.setCornerRadius(0.0f);
        int i10 = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.G.addView(this.f68189z, 0, layoutParams);
        sg.bigo.ads.common.utils.u.a(this.G, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.n.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (n.this.O) {
                    return;
                }
                n nVar = n.this;
                nVar.G.getMeasuredWidth();
                nVar.c(n.this.G.getMeasuredHeight());
            }
        });
        this.J.a(this.f68122u);
        if (sg.bigo.ads.common.utils.k.a((Collection) this.J.getItems())) {
            this.J.setVisibility(8);
        } else {
            this.J.setVisibility(0);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.B;
        if (cVar != null) {
            cVar.a(false);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.C;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        sg.bigo.ads.ad.interstitial.multi_img.a aVar = this.D;
        if (aVar != null) {
            aVar.f68647f = false;
        }
        int iW = w();
        if (iW != 1) {
            if (iW == 2) {
                bVar = this.E;
                i10 = ViewCompat.MEASURED_STATE_MASK;
            }
            K();
            a((sg.bigo.ads.common.w.b.a) null, false);
        }
        bVar = this.E;
        bVar.b(sg.bigo.ads.common.w.b.b(i10));
        K();
        a((sg.bigo.ads.common.w.b.a) null, false);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final int x() {
        return 2;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final boolean z() {
        return true;
    }
}
