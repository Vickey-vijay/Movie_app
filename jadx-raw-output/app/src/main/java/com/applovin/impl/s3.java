package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class s3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f9010c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f9011d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s3 f9012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s3 f9013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s3 f9014g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f9016b;

    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9020a;

        public String b() {
            return this.f9020a;
        }

        a(String str) {
            this.f9020a = str;
        }
    }

    public interface b {
        Object a(Object obj);
    }

    public boolean a(Object obj) {
        return obj instanceof s3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (!s3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = s3Var.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        Set setB = b();
        Set setB2 = s3Var.b();
        return setB != null ? setB.equals(setB2) : setB2 == null;
    }

    static {
        a aVar = a.SESSION;
        f9012e = a("ars", aVar, a.INSTALL);
        f9013f = a("ar", aVar);
        f9014g = a("ttdasi_ms", aVar);
    }

    public String a() {
        return this.f9015a;
    }

    public Set b() {
        return this.f9016b;
    }

    public String toString() {
        return this.f9015a;
    }

    private s3(String str, Set set) {
        this.f9015a = str;
        this.f9016b = set;
    }

    private static s3 a(String str, a... aVarArr) {
        Set set = f9010c;
        if (!set.contains(str)) {
            s3 s3Var = new s3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            f9011d.put(str, s3Var);
            return s3Var;
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public int hashCode() {
        int iHashCode;
        String strA = a();
        int iHashCode2 = 43;
        if (strA == null) {
            iHashCode = 43;
        } else {
            iHashCode = strA.hashCode();
        }
        Set setB = b();
        int i10 = (iHashCode + 59) * 59;
        if (setB != null) {
            iHashCode2 = setB.hashCode();
        }
        return i10 + iHashCode2;
    }

    public boolean a(a aVar) {
        return this.f9016b.contains(aVar);
    }

    public static s3 a(String str) {
        return (s3) f9011d.get(str);
    }
}
