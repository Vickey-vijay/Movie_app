package com.inmobi.media;

import okio.ByteString;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Oe implements Ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f23285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ie f23286c;

    @Override // com.inmobi.media.Ne
    public final String e() {
        return null;
    }

    public Oe(String str, int i10, ByteString byteString, Ie ie2) {
        ck.p.j(str, "resolvedUrl");
        ck.p.j(byteString, "bodyBytes");
        ck.p.j(ie2, "responseMetaData");
        this.f23284a = i10;
        this.f23285b = byteString;
        this.f23286c = ie2;
    }

    @Override // com.inmobi.media.Ne
    public final Object a() {
        ck.p.j(C3048n4.class, "clazz");
        ck.p.j(C3048n4.class, "type");
        JSONObject jSONObject = new JSONObject(this.f23285b.string(lk.c.f63591b));
        ck.p.j(jSONObject, "jsonObject");
        ck.p.j(C3048n4.class, "type");
        return C3048n4.class.cast(AbstractC3029ma.a(jSONObject, C3048n4.class, null, null));
    }

    @Override // com.inmobi.media.Ne
    public final Ie b() {
        return this.f23286c;
    }

    @Override // com.inmobi.media.Ne
    public final int c() {
        return this.f23284a;
    }

    @Override // com.inmobi.media.Ne
    public final ByteString d() {
        return this.f23285b;
    }
}
