package okhttp3;

import ck.p;
import okio.ByteString;

/* JADX INFO: compiled from: WebSocketListener.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i10, String str) {
        p.j(webSocket, "webSocket");
        p.j(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i10, String str) {
        p.j(webSocket, "webSocket");
        p.j(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        p.j(webSocket, "webSocket");
        p.j(th2, "t");
    }

    public void onMessage(WebSocket webSocket, String str) {
        p.j(webSocket, "webSocket");
        p.j(str, "text");
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        p.j(webSocket, "webSocket");
        p.j(byteString, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        p.j(webSocket, "webSocket");
        p.j(response, "response");
    }
}
