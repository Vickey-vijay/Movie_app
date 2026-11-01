package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import okio.ByteString;

/* JADX INFO: renamed from: com.inmobi.media.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2747b6 implements Ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC2721a6 f24039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f24040b;

    @Override // com.inmobi.media.Ne
    public final Object a() {
        return null;
    }

    public C2747b6(String str, EnumC2721a6 enumC2721a6) {
        ck.p.j(str, "url");
        ck.p.j(enumC2721a6, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f24039a = enumC2721a6;
        this.f24040b = ByteString.EMPTY;
    }

    @Override // com.inmobi.media.Ne
    public final Ie b() {
        return new Ie(0L, kotlin.collections.a.j(), 0, "");
    }

    @Override // com.inmobi.media.Ne
    public final int c() {
        return this.f24039a.f23963a;
    }

    @Override // com.inmobi.media.Ne
    public final ByteString d() {
        return this.f24040b;
    }

    @Override // com.inmobi.media.Ne
    public final String e() {
        return this.f24039a.name();
    }
}
