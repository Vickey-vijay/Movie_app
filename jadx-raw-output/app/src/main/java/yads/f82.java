package yads;

import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public final class f82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fm2 f77333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hm2 f77334b;

    public /* synthetic */ f82() {
        this(new fm2(), hm2.f78284b.a());
    }

    public final e82 a(po2 po2Var) {
        String str;
        hm2 hm2Var = this.f77334b;
        hm2Var.getClass();
        synchronized (hm2.f78285c) {
            str = (String) hm2Var.f78287a.get(po2Var);
            hm2Var.f78287a.remove(po2Var);
        }
        if (str == null) {
            return null;
        }
        try {
            this.f77333a.getClass();
            dm2 dm2VarA = fm2.a(str);
            byte[] bytes = dm2VarA.f76736b.getBytes(lk.c.f63591b);
            ck.p.i(bytes, "getBytes(...)");
            Map map = dm2VarA.f76735a;
            return new e82(200, bytes, map, e82.a(map), false);
        } catch (JSONException unused) {
            return null;
        }
    }

    public f82(fm2 fm2Var, hm2 hm2Var) {
        this.f77333a = fm2Var;
        this.f77334b = hm2Var;
    }
}
