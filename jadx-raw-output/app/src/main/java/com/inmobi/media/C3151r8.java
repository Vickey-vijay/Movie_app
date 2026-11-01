package com.inmobi.media;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3151r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25252e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3151r8)) {
            return false;
        }
        C3151r8 c3151r8 = (C3151r8) obj;
        return ck.p.e(this.f25248a, c3151r8.f25248a) && ck.p.e(this.f25249b, c3151r8.f25249b) && ck.p.e(this.f25250c, c3151r8.f25250c) && ck.p.e(this.f25251d, c3151r8.f25251d) && this.f25252e == c3151r8.f25252e;
    }

    public C3151r8(ArrayList arrayList, Map map, String str, String str2, boolean z10) {
        ck.p.j(arrayList, "omidTrackers");
        ck.p.j(map, "macros");
        ck.p.j(str, "customReferenceData");
        this.f25248a = arrayList;
        this.f25249b = map;
        this.f25250c = str;
        this.f25251d = str2;
        this.f25252e = z10;
    }

    public final int hashCode() {
        int iHashCode = (this.f25250c.hashCode() + ((this.f25249b.hashCode() + (this.f25248a.hashCode() * 31)) * 31)) * 31;
        String str = this.f25251d;
        return Boolean.hashCode(this.f25252e) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HybridOmidInfo(omidTrackers=" + this.f25248a + ", macros=" + this.f25249b + ", customReferenceData=" + this.f25250c + ", contentUrl=" + this.f25251d + ", isolateVerificationScripts=" + this.f25252e + ")";
    }
}
