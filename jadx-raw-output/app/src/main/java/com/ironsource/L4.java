package com.ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
final class L4 implements W3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L4 f26958a = new L4();

    @Override // com.ironsource.W3
    public InputStream a(String str) throws IOException {
        ck.p.j(str, "url");
        InputStream inputStreamOpenStream = new URL(str).openStream();
        ck.p.i(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }

    private L4() {
    }
}
