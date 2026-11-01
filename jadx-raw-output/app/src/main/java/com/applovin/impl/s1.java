package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9004c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9002a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9005d = System.currentTimeMillis();

    public long a() {
        return this.f9005d;
    }

    public String b() {
        return this.f9002a;
    }

    public String c() {
        return this.f9003b;
    }

    public Map d() {
        return this.f9004c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.f9005d == s1Var.f9005d && Objects.equals(this.f9003b, s1Var.f9003b) && Objects.equals(this.f9004c, s1Var.f9004c)) {
            return Objects.equals(this.f9002a, s1Var.f9002a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9003b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f9004c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f9005d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f9002a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f9003b + "', id='" + this.f9002a + "', creationTimestampMillis=" + this.f9005d + ", parameters=" + this.f9004c + '}';
    }

    public s1(String str, Map map) {
        this.f9003b = str;
        this.f9004c = map;
    }
}
