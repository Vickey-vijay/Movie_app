package yads;

import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class qt1 extends ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cm2 f81966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f82 f81967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z11 f81968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d21 f81969d;

    @Override // yads.ho
    public final y11 a(po2 po2Var, Map map) {
        boolean z10;
        synchronized (eu1.f77192a) {
            z10 = eu1.f77193b;
        }
        return z10 ? (y11) new pt1(this, map).invoke(po2Var) : b(po2Var, map);
    }

    public final y11 b(po2 po2Var, Map map) {
        e82 e82VarA = this.f81967b.a(po2Var);
        if (e82VarA == null) {
            return this.f81969d.a(po2Var, map);
        }
        this.f81966a.getClass();
        ArrayList arrayList = new ArrayList();
        Map map2 = e82VarA.f76978c;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new q01((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return new y11(e82VarA.f76976a, arrayList, e82VarA.f76977b);
    }

    public qt1(SSLSocketFactory sSLSocketFactory, cm2 cm2Var, f82 f82Var, z11 z11Var, e21 e21Var) {
        this.f81966a = cm2Var;
        this.f81967b = f82Var;
        this.f81968c = z11Var;
        e21Var.getClass();
        this.f81969d = e21.a(sSLSocketFactory);
    }
}
