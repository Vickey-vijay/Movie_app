package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class hs {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hs f2397;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private dn f2398;

    public static class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private hr f2399;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f2400;

        private a() {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final boolean m2341(Method method) {
            if (this.f2399 == null || (method.getModifiers() & this.f2399.m2290()) != this.f2399.m2290() || (method.getModifiers() & this.f2399.m2291()) != 0 || this.f2399.m2316().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2399.m2311() != -1 && this.f2399.m2311() != parameterTypes.length) {
                return false;
            }
            List<Class> listM2312 = this.f2399.m2312();
            if (listM2312 != null) {
                if (listM2312.size() != parameterTypes.length) {
                    return false;
                }
                for (int i10 = 0; i10 < listM2312.size(); i10++) {
                    if (!listM2312.get(i10).equals(parameterTypes[i10])) {
                        return false;
                    }
                }
            }
            if (this.f2399.m2315() != null ? this.f2399.m2313() ? method.getReturnType().equals(this.f2399.m2315()) : this.f2399.m2315().isAssignableFrom(method.getReturnType()) : true) {
                int i11 = this.f2400;
                if (i11 == 0) {
                    return true;
                }
                this.f2400 = i11 - 1;
            }
            return false;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m2342(hr hrVar) {
            this.f2399 = hrVar;
            this.f2400 = hrVar.m2314();
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final hr m2343() {
            return this.f2399;
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public hs() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2331(Class cls, a aVar, List<Method> list) {
        hr hrVarM2343 = aVar.m2343();
        for (Method method : (hrVarM2343 == null || !hrVarM2343.m2289()) ? Arrays.asList(cls.getDeclaredMethods()) : m2334(cls, hrVarM2343.m2289(), hrVarM2343.m2292())) {
            if (aVar.m2341(method)) {
                list.add(method);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<Method> m2332(Class cls, hr hrVar) {
        ArrayList arrayList = new ArrayList();
        m2333(cls, hrVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<Method> m2334(Class cls, boolean z10, int i10) {
        Method[] methodArrM2855 = new Method[0];
        if (cls != null) {
            methodArrM2855 = kb.m2855(cls.getDeclaredMethods(), cls.getMethods());
            if (!z10) {
                return Arrays.asList(methodArrM2855);
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                methodArrM2855 = kb.m2855(kb.m2855(methodArrM2855, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM2855);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2338() {
        return this.f2398.m2021();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2333(Class cls, hr hrVar, List<Method> list) {
        a aVar = new a((byte) 0);
        aVar.m2342(hrVar);
        m2331(cls, aVar, list);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ds m2337(String str) {
        ds dsVar;
        hs hsVar = this;
        do {
            dsVar = hsVar.f2398.m2019().get(str);
            if (dsVar != null) {
                break;
            }
            hsVar = hsVar.f2397;
        } while (hsVar != null);
        return dsVar;
    }

    public hs(dn dnVar, hs hsVar) {
        this.f2398 = dnVar;
        this.f2397 = hsVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hs m2336() {
        return this.f2397;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method m2330(Class cls, hr hrVar) {
        ArrayList arrayList = new ArrayList();
        m2333(cls, hrVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m2340() {
        ArrayList arrayList = new ArrayList(this.f2398.m2022());
        hs hsVar = this.f2397;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m2340());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<Cdo> m2335() {
        ArrayList arrayList = new ArrayList(this.f2398.m2017());
        hs hsVar = this.f2397;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m2335());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final dl m2339(String str) {
        dl dlVar;
        hs hsVar = this;
        do {
            dlVar = hsVar.f2398.m2016().get(str);
            if (dlVar != null) {
                break;
            }
            hsVar = hsVar.f2397;
        } while (hsVar != null);
        return dlVar;
    }
}
