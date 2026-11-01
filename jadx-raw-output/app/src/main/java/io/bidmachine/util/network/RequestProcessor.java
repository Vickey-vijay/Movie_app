package io.bidmachine.util.network;

import androidx.annotation.WorkerThread;
import ck.p;
import java.net.URLConnection;
import kotlin.Metadata;

/* JADX INFO: compiled from: RequestProcessor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/network/RequestProcessor;", "", "Ljava/net/URLConnection;", "urlConnection", "Lmj/r;", "setupConnection", "", "getBody", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public interface RequestProcessor {
    @WorkerThread
    default byte[] getBody() throws Throwable {
        return null;
    }

    default void setupConnection(URLConnection uRLConnection) throws Throwable {
        p.j(uRLConnection, "urlConnection");
    }
}
