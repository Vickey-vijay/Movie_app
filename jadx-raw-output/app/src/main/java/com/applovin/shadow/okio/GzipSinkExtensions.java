package com.applovin.shadow.okio;

import ck.p;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        p.j(sink, "<this>");
        return new GzipSink(sink);
    }
}
