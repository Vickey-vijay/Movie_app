package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class Q9 extends AbstractC2922i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q9(String str, String str2, String str3, String str4) {
        super(str3, str4);
        ck.p.j(str, "eventId");
        ck.p.j(str2, "componentType");
        ck.p.j(str3, "eventType");
        this.f23378e = str;
        this.f23379f = str2;
    }

    public final String toString() {
        return this.f24528a + "@" + this.f23379f + com.ironsource.Z7.f27998r;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Q9(String str, String str2, String str3) {
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        this(string, str, str2, str3);
    }
}
