package com.inmobi.media;

import java.io.IOException;
import okio.BufferedSink;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Ba extends AbstractC3236ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f22411a;

    @Override // com.inmobi.media.AbstractC3236ui
    public final String a() {
        return com.ironsource.G5.L;
    }

    public Ba(JSONObject jSONObject) {
        ck.p.j(jSONObject, "jsonObject");
        this.f22411a = jSONObject;
    }

    @Override // com.inmobi.media.AbstractC3236ui
    public final void a(BufferedSink bufferedSink) throws IOException {
        ck.p.j(bufferedSink, "bufferedSink");
        String string = this.f22411a.toString();
        ck.p.i(string, "toString(...)");
        bufferedSink.writeUtf8(string);
    }
}
