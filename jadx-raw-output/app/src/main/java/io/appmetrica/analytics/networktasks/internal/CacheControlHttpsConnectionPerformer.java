package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.download.Command;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public class CacheControlHttpsConnectionPerformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f58258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f58259b;

    public interface Client {
        @Nullable
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(@NonNull String str, @NonNull byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(@Nullable SSLSocketFactory sSLSocketFactory) {
        this(new a(), sSLSocketFactory);
    }

    public CacheControlHttpsConnectionPerformer(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f58258a = aVar;
        this.f58259b = sSLSocketFactory;
    }

    public void performConnection(@NonNull String str, @NonNull Client client) {
        String str2;
        try {
            a aVar = this.f58258a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f58259b;
            aVar.getClass();
            Response responseA = a.a(oldETag, str, sSLSocketFactory);
            int code = responseA.getCode();
            if (code != 200) {
                if (code != 304) {
                    client.onError();
                    return;
                } else {
                    client.onNotModified();
                    return;
                }
            }
            List list = (List) CollectionUtils.getFromMapIgnoreCase(responseA.getHeaders(), Command.HTTP_HEADER_ETAG);
            if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
                str2 = "";
            }
            client.onResponse(str2, responseA.getResponseData());
        } catch (Throwable unused) {
        }
    }
}
