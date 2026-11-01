package com.inmobi.media;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3222u4 extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3236ui f25428a;

    public C3222u4(AbstractC3236ui abstractC3236ui) {
        this.f25428a = abstractC3236ui;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return MediaType.parse(this.f25428a.a());
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        ck.p.j(bufferedSink, "sink");
        this.f25428a.a(bufferedSink);
    }
}
