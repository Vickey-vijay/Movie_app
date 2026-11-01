package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10192b;

    public boolean a(Object obj) {
        return obj instanceof z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!zVar.a(this)) {
            return false;
        }
        Map mapA = a();
        Map mapA2 = zVar.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List listB = b();
        List listB2 = zVar.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public Map a() {
        return this.f10191a;
    }

    public List b() {
        return this.f10192b;
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public z(Map map, List list) {
        this.f10191a = map;
        this.f10192b = list;
    }

    public int hashCode() {
        int iHashCode;
        Map mapA = a();
        int iHashCode2 = 43;
        if (mapA == null) {
            iHashCode = 43;
        } else {
            iHashCode = mapA.hashCode();
        }
        List listB = b();
        int i10 = (iHashCode + 59) * 59;
        if (listB != null) {
            iHashCode2 = listB.hashCode();
        }
        return i10 + iHashCode2;
    }
}
