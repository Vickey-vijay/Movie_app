package com.ironsource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Te implements O8, O8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Integer> f27718a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Integer> f27719b = new HashMap();

    @Override // com.ironsource.O8.a
    public void a(List<? extends O8.b> list) {
        ck.p.j(list, "smashes");
        for (O8.b bVar : list) {
            this.f27718a.put(bVar.c(), 0);
            this.f27719b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.ironsource.O8
    public boolean b(O8.b bVar) {
        boolean z10;
        ck.p.j(bVar, "smash");
        synchronized (this) {
            String strC = bVar.c();
            if (this.f27718a.containsKey(strC)) {
                Integer num = this.f27718a.get(strC);
                ck.p.g(num);
                if (num.intValue() >= bVar.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.ironsource.O8.a
    public void a(O8.b bVar) {
        ck.p.j(bVar, "smash");
        synchronized (this) {
            String strC = bVar.c();
            if (this.f27718a.containsKey(strC)) {
                Map<String, Integer> map = this.f27718a;
                Integer num = map.get(strC);
                ck.p.g(num);
                map.put(strC, Integer.valueOf(num.intValue() + 1));
            }
            mj.r rVar = mj.r.f64562a;
        }
    }

    @Override // com.ironsource.O8
    public boolean a() {
        for (String str : this.f27719b.keySet()) {
            Integer num = this.f27718a.get(str);
            ck.p.g(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f27719b.get(str);
            ck.p.g(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
