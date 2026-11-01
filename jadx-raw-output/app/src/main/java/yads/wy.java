package yads;

import com.ironsource.C3426d4;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa2 f84378a;

    public /* synthetic */ wy() {
        this(new xa2());
    }

    public final fo2 a(d4 d4Var) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ck.x.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        xa2 xa2Var = this.f84378a;
        int i10 = d4Var.f76572n;
        xa2Var.getClass();
        if (i10 != 1) {
            str = i10 != 2 ? "undefined" : C3426d4.i.C;
        } else {
            str = C3426d4.i.D;
        }
        linkedHashMap.put("orientation", str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!ck.x.m(linkedHashMap2)) {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        linkedHashMap2.put("image_loading_automatically", Boolean.valueOf(d4Var.f76571m));
        return new fo2(kotlin.collections.a.q(linkedHashMap, linkedHashMap2), (c) null);
    }

    public wy(xa2 xa2Var) {
        this.f84378a = xa2Var;
    }
}
