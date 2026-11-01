package yads;

import com.ironsource.C3426d4;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class sx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aq2 f82796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9 f82797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f82798c;

    public /* synthetic */ sx() {
        this(new aq2(), new n9(), new wy());
    }

    public final fo2 a(v9 v9Var, d4 d4Var) {
        String str;
        fo2 fo2VarB = this.f82796a.b(v9Var, d4Var);
        fo2 fo2VarA = this.f82797b.a(d4Var.f76563e);
        wy wyVar = this.f82798c;
        wyVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ck.x.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        xa2 xa2Var = wyVar.f84378a;
        int i10 = d4Var.f76572n;
        xa2Var.getClass();
        if (i10 != 1) {
            str = i10 != 2 ? "undefined" : C3426d4.i.C;
        } else {
            str = C3426d4.i.D;
        }
        linkedHashMap.put("orientation", str);
        fo2 fo2VarA2 = go2.a(fo2VarB, fo2VarA);
        c cVar = fo2VarA2.f77472b;
        return new fo2(kotlin.collections.a.q(fo2VarA2.f77471a, linkedHashMap), cVar != null ? cVar : null);
    }

    public sx(aq2 aq2Var, n9 n9Var, wy wyVar) {
        this.f82796a = aq2Var;
        this.f82797b = n9Var;
        this.f82798c = wyVar;
    }
}
