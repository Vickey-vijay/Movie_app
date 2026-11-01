package okhttp3.internal.http2;

import ck.p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.List;
import okio.BufferedSource;

/* JADX INFO: compiled from: PushObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* JADX INFO: compiled from: PushObserver.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: PushObserver.kt */
        public static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i10, List<Header> list, boolean z10) {
                p.j(list, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i10, List<Header> list) {
                p.j(list, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i10, ErrorCode errorCode) {
                p.j(errorCode, IronSourceConstants.EVENTS_ERROR_CODE);
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i10, BufferedSource bufferedSource, int i11, boolean z10) throws IOException {
                p.j(bufferedSource, "source");
                bufferedSource.skip(i11);
                return true;
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i10, BufferedSource bufferedSource, int i11, boolean z10) throws IOException;

    boolean onHeaders(int i10, List<Header> list, boolean z10);

    boolean onRequest(int i10, List<Header> list);

    void onReset(int i10, ErrorCode errorCode);
}
