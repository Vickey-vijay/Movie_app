package com.ironsource;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class W1 implements X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3630o9 f27820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f27821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3424d2 f27822c;

    @Override // com.ironsource.X1
    public void a(String str) {
        List<String> listK;
        ck.p.j(str, "methodName");
        C3424d2 c3424d2 = this.f27822c;
        if (c3424d2 == null || (listK = c3424d2.b()) == null) {
            listK = nj.s.k();
        }
        a(listK, str);
    }

    public W1(C3630o9 c3630o9, com.ironsource.mediationsdk.d dVar, C3424d2 c3424d2) {
        ck.p.j(c3630o9, "instanceInfo");
        ck.p.j(dVar, "auctionDataUtils");
        this.f27820a = c3630o9;
        this.f27821b = dVar;
        this.f27822c = c3424d2;
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f27821b.a(str, this.f27820a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.f27820a.e(), this.f27820a.f(), this.f27820a.d(), "", "", "", ""));
        }
    }

    @Override // com.ironsource.X1
    public void b(String str) {
        List<String> listK;
        ck.p.j(str, "methodName");
        C3424d2 c3424d2 = this.f27822c;
        if (c3424d2 == null || (listK = c3424d2.a()) == null) {
            listK = nj.s.k();
        }
        a(listK, str);
    }

    @Override // com.ironsource.X1
    public void c(String str) {
        List<String> listK;
        ck.p.j(str, "methodName");
        C3424d2 c3424d2 = this.f27822c;
        if (c3424d2 == null || (listK = c3424d2.c()) == null) {
            listK = nj.s.k();
        }
        a(listK, str);
    }
}
