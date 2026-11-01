package com.ironsource;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<A> f31673a;

    public final List<A> a() {
        return this.f31673a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg) && ck.p.e(this.f31673a, ((yg) obj).f31673a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yg(List<? extends A> list) {
        ck.p.j(list, com.ironsource.mediationsdk.d.f29599k);
        this.f31673a = list;
    }

    public final yg a(List<? extends A> list) {
        ck.p.j(list, com.ironsource.mediationsdk.d.f29599k);
        return new yg(list);
    }

    public final List<A> b() {
        return this.f31673a;
    }

    public final int c() {
        return this.f31673a.size();
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (A a10 : this.f31673a) {
            arrayList.add(a(a10.h(), a10.r()));
        }
        return nj.b0.p0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    public int hashCode() {
        return this.f31673a.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.f31673a + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ yg a(yg ygVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ygVar.f31673a;
        }
        return ygVar.a(list);
    }

    private final String a(C3605n2 c3605n2, int i10) {
        ck.w wVar = ck.w.f6066a;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), c3605n2.c()}, 2));
        ck.p.i(str, "format(format, *args)");
        return str;
    }
}
