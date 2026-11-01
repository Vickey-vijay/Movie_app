package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import java.util.HashMap;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes7.dex */
public final class Y6 extends AbstractC3236ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23819a;

    public Y6(HashMap map, int i10) {
        ck.p.j(map, "payload");
        this.f23819a = map;
    }

    @Override // com.inmobi.media.AbstractC3236ui
    public final String a() {
        return ShareTarget.ENCODING_TYPE_URL_ENCODED;
    }

    @Override // com.inmobi.media.AbstractC3236ui
    public final void a(BufferedSink bufferedSink) throws IOException {
        ck.p.j(bufferedSink, "bufferedSink");
        bufferedSink.writeUtf8(F3.a(this.f23819a));
    }

    public Y6(HashMap map) {
        ck.p.j(map, "payload");
        this.f23819a = map;
    }
}
