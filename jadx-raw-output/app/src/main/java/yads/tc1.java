package yads;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import yads.tc1;

/* JADX INFO: loaded from: classes11.dex */
public abstract class tc1 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4 f82955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lu2 f82956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mh1 f82957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rh1 f82958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dw2 f82959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final km f82960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final uc1 f82961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f82962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f82963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f82964j;

    public /* synthetic */ tc1(Context context, AttributeSet attributeSet, int i10, d4 d4Var, iu3 iu3Var) {
        mh1 mh1Var = new mh1();
        rh1 rh1Var = new rh1(context);
        w5 w5Var = new w5();
        jm jmVar = new jm(context, d4Var, iu3Var, w5Var);
        Object obj = dw2.f76819j;
        this(context, attributeSet, i10, d4Var, iu3Var, mh1Var, rh1Var, w5Var, jmVar, cw2.a());
    }

    private final uc1 a() {
        return xc1.a(this, this.f82960f);
    }

    public abstract km a(Context context, d4 d4Var, jm jmVar, w5 w5Var);

    public final List b() {
        List listA;
        this.f82958d.a();
        um umVar = this.f82960f.K;
        return (umVar == null || (listA = umVar.a()) == null) ? nj.s.k() : listA;
    }

    public final c00 a(String str) {
        List listK;
        this.f82958d.a();
        i00 i00VarC = c();
        la laVar = i00VarC != null ? new la(i00VarC.f75579a.getWidth(), i00VarC.f75579a.getHeight()) : null;
        String strD = d();
        this.f82958d.a();
        um umVar = this.f82960f.K;
        if (umVar == null || (listK = umVar.b()) == null) {
            listK = nj.s.k();
        }
        return new c00(str, laVar, strD, listK);
    }

    public final void addVisibilityChangeListener(ll3 ll3Var) {
        this.f82962h.add(ll3Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public final i00 c() {
        a03 a03Var;
        this.f82958d.a();
        km kmVar = this.f82960f;
        v9 v9Var = kmVar.f85516v;
        if (v9Var != null) {
            nv0 nv0VarC = v9Var.c();
            if (nv0VarC.f80817c == 0 && nv0VarC.f80818d == 0) {
                a03Var = nv0VarC;
                a03Var = nv0VarC;
                a03Var = null;
            }
            if (a03Var == null) {
                a03Var = kmVar.f85497c.f76562d.f75685a;
            }
        } else {
            a03Var = kmVar.f85497c.f76562d.f75685a;
        }
        if (a03Var != null) {
            return new i00(a03Var);
        }
        return null;
    }

    public final String d() {
        this.f82958d.a();
        um umVar = this.f82960f.K;
        if (umVar != null) {
            return umVar.getAdInfo();
        }
        return null;
    }

    public void destroy() {
        this.f82958d.a();
        this.f82957c.a();
        this.f82962h.clear();
        int i10 = tb.f82950b;
        if (tb.a((mu) this.f82960f)) {
            return;
        }
        this.f82960f.d();
    }

    public final lh3 e() {
        this.f82958d.a();
        return this.f82960f.E;
    }

    public final d4 getAdConfiguration$mobileads_externalRelease() {
        return this.f82955a;
    }

    public final int getHeightMeasureSpec$mobileads_externalRelease() {
        return this.f82964j;
    }

    public final lu2 getSdkEnvironmentModule$mobileads_externalRelease() {
        return this.f82956b;
    }

    public final int getWidthMeasureSpec$mobileads_externalRelease() {
        return this.f82963i;
    }

    public final void removeVisibilityChangeListener(ll3 ll3Var) {
        this.f82962h.remove(ll3Var);
    }

    public void setAdUnitId(String str) {
        this.f82958d.a();
        this.f82960f.f85497c.a(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        boolean z10 = ad1.f75480a;
        uc1 uc1Var = this.f82961g;
        getContext();
        uc1Var.onAttachedToWindow();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        g9 g9Var;
        int i10;
        super.onConfigurationChanged(configuration);
        int i11 = tb.f82950b;
        if (!tb.a((mu) this.f82960f)) {
            km kmVar = this.f82960f;
            v9 v9Var = kmVar.f85516v;
            nv0 nv0VarC = null;
            if (v9Var != null) {
                nv0VarC = v9Var.c();
            }
            if (nv0VarC != null) {
                a03 a03Var = kmVar.f85497c.f76562d.f75685a;
                v9 v9Var2 = kmVar.f85516v;
                if (v9Var2 != null && a03Var != null && c03.a(kmVar.f85495a, v9Var2, nv0VarC, kmVar.F, a03Var)) {
                    i10 = 0;
                } else {
                    g9Var = this.f82955a.f76563e;
                    if (g9Var != null) {
                        a(g9Var);
                    }
                    i10 = 8;
                }
            } else {
                g9Var = this.f82955a.f76563e;
                if (g9Var != null) {
                    a(g9Var);
                }
                i10 = 8;
            }
            setVisibility(i10);
        }
        Objects.toString(configuration);
        boolean z10 = ad1.f75480a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        boolean z10 = ad1.f75480a;
        uc1 uc1Var = this.f82961g;
        getContext();
        uc1Var.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f82963i = i10;
        this.f82964j = i11;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.f82959e == null) {
            return;
        }
        Objects.toString(view);
        boolean z10 = ad1.f75480a;
        nt2 nt2VarA = this.f82959e.a(getContext());
        if (nt2VarA != null && nt2VarA.h()) {
            if (this == view) {
                a(i10);
                return;
            }
            return;
        }
        a(i10);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        int i11;
        super.onWindowVisibilityChanged(i10);
        getVisibility();
        boolean z10 = ad1.f75480a;
        if (i10 == 0 && getVisibility() == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        a(i11);
    }

    public tc1(Context context, AttributeSet attributeSet, int i10, d4 d4Var, iu3 iu3Var, mh1 mh1Var, rh1 rh1Var, w5 w5Var, jm jmVar, dw2 dw2Var) {
        super(context, attributeSet, i10);
        this.f82955a = d4Var;
        this.f82956b = iu3Var;
        this.f82957c = mh1Var;
        this.f82958d = rh1Var;
        this.f82959e = dw2Var;
        this.f82962h = new ArrayList();
        rh1Var.a();
        km kmVarA = a(context, d4Var, jmVar, w5Var);
        this.f82960f = kmVarA;
        jmVar.a(kmVarA.e());
        uc1 uc1VarA = a();
        this.f82961g = uc1VarA;
        uc1VarA.a(context, this);
    }

    public final void a(final g9 g9Var) {
        this.f82958d.a();
        this.f82957c.a(new Runnable() { // from class: cp.da
            @Override // java.lang.Runnable
            public final void run() {
                tc1.a(this.f51288b, g9Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(tc1 tc1Var, g9 g9Var) {
        tc1Var.f82960f.b(g9Var);
    }

    private final void a(int i10) {
        boolean z10 = ad1.f75480a;
        int i11 = tb.f82950b;
        if (tb.a((mu) this.f82960f)) {
            return;
        }
        Iterator it = this.f82962h.iterator();
        while (it.hasNext()) {
            ((rm2) ((ll3) it.next())).p();
        }
    }

    public final void a(h00 h00Var) {
        this.f82958d.a();
        km kmVar = this.f82960f;
        jm jmVar = kmVar.D;
        kmVar.f85515u = jmVar;
        jmVar.f79094c = h00Var;
        jmVar.f79093b.a(h00Var);
    }

    public final void a(i00 i00Var) {
        this.f82958d.a();
        this.f82960f.a(i00Var.f75579a);
    }
}
