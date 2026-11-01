package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class cn {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private a f1372;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ds f1373;

    public static abstract class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f1374;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public abstract boolean mo1617(hv hvVar);

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final Class m1616() {
            return this.f1374;
        }

        public a(Class cls) {
            this.f1374 = cls;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private cn f1375 = new cn();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m1622(Class cls) {
            this.f1375.f1372 = new b(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final e m1618(Class cls) {
            this.f1375.f1372 = new d(cls);
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final e m1619(Class cls) {
            this.f1375.f1372 = new c(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final cn m1620() {
            return this.f1375;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m1621(ds dsVar) {
            this.f1375.f1373 = dsVar;
            return this;
        }
    }

    public static class b extends a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo1617(hv hvVar) {
            return m1616().isInstance(hvVar.mo2354());
        }
    }

    public static class c extends a {
        public c(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo1617(hv hvVar) {
            return m1616().equals(hvVar.mo2353().getType());
        }
    }

    public static class d extends a {
        public d(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo1617(hv hvVar) {
            return m1616().isAssignableFrom(hvVar.mo2353().getType());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m1615(hv hvVar, du duVar, cq cqVar, List<Object> list) {
        a aVar = this.f1372;
        if (aVar != null && !aVar.mo1617(hvVar)) {
            return false;
        }
        if (this.f1373 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, hvVar);
        return this.f1373.m2097(duVar, cqVar, arrayList).m2091();
    }
}
