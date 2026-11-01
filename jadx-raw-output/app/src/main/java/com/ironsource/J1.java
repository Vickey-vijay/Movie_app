package com.ironsource;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f26851a;

    /* JADX WARN: Multi-variable type inference failed */
    public J1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> a() {
        return this.f26851a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J1) && ck.p.e(this.f26851a, ((J1) obj).f26851a);
    }

    public J1(Map<String, String> map) {
        ck.p.j(map, Ne.f27163p0);
        this.f26851a = map;
    }

    public final J1 a(Map<String, String> map) {
        ck.p.j(map, Ne.f27163p0);
        return new J1(map);
    }

    public final Map<String, String> b() {
        return this.f26851a;
    }

    public int hashCode() {
        return this.f26851a.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f26851a + ")";
    }

    public /* synthetic */ J1(Map map, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? kotlin.collections.a.j() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ J1 a(J1 j10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = j10.f26851a;
        }
        return j10.a(map);
    }
}
