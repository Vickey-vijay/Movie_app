package okhttp3;

import androidx.core.app.NotificationCompat;
import ck.i;
import ck.p;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    /* JADX INFO: compiled from: EventListener.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: EventListener.kt */
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(response, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(response, "response");
    }

    public void cacheMiss(Call call) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void callEnd(Call call) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void callFailed(Call call, IOException iOException) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(iOException, "ioe");
    }

    public void callStart(Call call) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void canceled(Call call) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(inetSocketAddress, "inetSocketAddress");
        p.j(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(inetSocketAddress, "inetSocketAddress");
        p.j(proxy, "proxy");
        p.j(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(inetSocketAddress, "inetSocketAddress");
        p.j(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(str, "domainName");
        p.j(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(httpUrl, "url");
        p.j(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(httpUrl, "url");
    }

    public void requestBodyEnd(Call call, long j10) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void requestBodyStart(Call call) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void requestFailed(Call call, IOException iOException) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(request, AdActivity.REQUEST_KEY_EXTRA);
    }

    public void requestHeadersStart(Call call) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void responseBodyEnd(Call call, long j10) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void responseBodyStart(Call call) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void responseFailed(Call call, IOException iOException) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(response, "response");
    }

    public void responseHeadersStart(Call call) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void satisfactionFailure(Call call, Response response) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
        p.j(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }

    public void secureConnectStart(Call call) {
        p.j(call, NotificationCompat.CATEGORY_CALL);
    }
}
