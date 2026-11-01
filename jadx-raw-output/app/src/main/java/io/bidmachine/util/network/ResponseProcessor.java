package io.bidmachine.util.network;

import java.net.URLConnection;
import kotlin.Metadata;

/* JADX INFO: compiled from: ResponseProcessor.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lio/bidmachine/util/network/ResponseProcessor;", "ResponseType", "", "process", "urlConnection", "Ljava/net/URLConnection;", "(Ljava/net/URLConnection;)Ljava/lang/Object;", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ResponseProcessor<ResponseType> {
    ResponseType process(URLConnection urlConnection) throws Throwable;
}
