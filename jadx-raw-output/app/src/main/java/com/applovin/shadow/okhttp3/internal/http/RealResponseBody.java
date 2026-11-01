package com.applovin.shadow.okhttp3.internal.http;

import ck.p;
import com.applovin.shadow.okhttp3.MediaType;
import com.applovin.shadow.okhttp3.ResponseBody;
import com.applovin.shadow.okio.BufferedSource;

/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final BufferedSource source;

    public RealResponseBody(String str, long j10, BufferedSource bufferedSource) {
        p.j(bufferedSource, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = bufferedSource;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public BufferedSource source() {
        return this.source;
    }
}
