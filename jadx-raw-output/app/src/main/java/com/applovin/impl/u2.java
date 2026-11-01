package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class u2 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e3 f9665d;

    public String a() {
        return this.f9663b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u2 u2Var = (u2) obj;
        String str = this.f9662a;
        if (str == null ? u2Var.f9662a != null : !str.equals(u2Var.f9662a)) {
            return false;
        }
        String str2 = this.f9663b;
        if (str2 == null ? u2Var.f9663b == null : str2.equals(u2Var.f9663b)) {
            return this.f9664c == u2Var.f9664c;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u2 u2Var) {
        return this.f9663b.compareToIgnoreCase(u2Var.f9663b);
    }

    public List b() {
        List listL = this.f9665d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f9662a) : listL;
    }

    public String c() {
        return this.f9662a;
    }

    public e3 d() {
        return this.f9665d;
    }

    public int hashCode() {
        String str = this.f9662a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9663b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f9664c ? 1 : 0);
    }

    public u2(String str, String str2, boolean z10, e3 e3Var) {
        this.f9662a = str;
        this.f9663b = str2;
        this.f9664c = z10;
        this.f9665d = e3Var;
    }
}
