package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class m extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f7935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f7936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i8 f7937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f7938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f7939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f7940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f7941k;

    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public class b extends z3 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final i8 f7947p;

        @Override // com.applovin.impl.r2
        public int g() {
            return -12303292;
        }

        public b(i8 i8Var, String str, boolean z10) {
            super(i8Var.b().d(), m.this.f9006a);
            this.f7947p = i8Var;
            this.f8898c = StringUtils.createSpannedString(i8Var.b().a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.f8899d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f8897b = z10;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public boolean o() {
            return this.f8897b;
        }

        public i8 v() {
            return this.f7947p;
        }
    }

    @Override // com.applovin.impl.s2
    public int d(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f7939i.size();
        }
        return i10 == a.BIDDERS.ordinal() ? this.f7940j.size() : this.f7941k.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return new v4("INFO");
        }
        return i10 == a.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f7936f.b() != null) {
            arrayList.add(f());
        }
        if (this.f7937g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private List l() {
        i8 i8Var = this.f7937g;
        if (i8Var != null && i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listE = this.f7936f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (i8 i8Var2 : listE) {
            i8 i8Var3 = this.f7937g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, null, this.f7937g == null));
                for (a4 a4Var : i8Var2.c()) {
                    arrayList.add(r2.a().d(a4Var.a()).c(a4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f7939i;
        }
        return i10 == a.BIDDERS.ordinal() ? this.f7940j : this.f7941k;
    }

    public o j() {
        return this.f7936f;
    }

    public String k() {
        return this.f7938h;
    }

    public m(n nVar, o oVar, i8 i8Var, Context context) {
        o oVarF;
        String strD;
        super(context);
        this.f7935e = nVar;
        this.f7937g = i8Var;
        if (oVar != null) {
            oVarF = oVar;
        } else {
            oVarF = nVar.f();
        }
        this.f7936f = oVarF;
        if (oVar != null) {
            strD = oVar.c();
        } else {
            strD = nVar.d();
        }
        this.f7938h = strD;
        this.f7939i = h();
        this.f7940j = e();
        this.f7941k = l();
        notifyDataSetChanged();
    }

    private r2 f() {
        return r2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private r2 g() {
        return r2.a().d("ID").c(this.f7935e.c()).a();
    }

    private r2 i() {
        return r2.a().d("Selected Network").c(this.f7937g.b().a()).a();
    }

    private r2 d() {
        return r2.a().d("Ad Format").c(this.f7935e.b()).a();
    }

    private List e() {
        i8 i8Var = this.f7937g;
        if (i8Var != null && !i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listA = this.f7936f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (i8 i8Var2 : listA) {
            i8 i8Var3 = this.f7937g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, i8Var2.a() != null ? i8Var2.a().a() : "", this.f7937g == null));
            }
        }
        return arrayList;
    }
}
