package io.bidmachine.analytics.internal;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/bidmachine/analytics/internal/o0;", "", "Ljava/net/URLConnection;", "connection", "Lmj/r;", "a", "(Ljava/net/URLConnection;)V", "", "Ljava/lang/String;", "methodString", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", "c", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public enum o0 {
    Get("GET"),
    Post("POST");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String methodString;

    public final void a(URLConnection connection) throws ProtocolException {
        if (connection instanceof HttpURLConnection) {
            ((HttpURLConnection) connection).setRequestMethod(this.methodString);
        }
    }

    o0(String str) {
        this.methodString = str;
    }
}
