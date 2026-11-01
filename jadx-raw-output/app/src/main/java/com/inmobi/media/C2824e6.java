package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2824e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24297b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2824e6)) {
            return false;
        }
        C2824e6 c2824e6 = (C2824e6) obj;
        return ck.p.e(this.f24296a, c2824e6.f24296a) && ck.p.e(this.f24297b, c2824e6.f24297b);
    }

    public C2824e6(String str, ArrayList arrayList) {
        ck.p.j(arrayList, "eventIDs");
        ck.p.j(str, "payload");
        this.f24296a = arrayList;
        this.f24297b = str;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f24297b.hashCode() + (this.f24296a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.f24296a + ", payload=" + this.f24297b + ", shouldFlushOnFailure=false)";
    }
}
