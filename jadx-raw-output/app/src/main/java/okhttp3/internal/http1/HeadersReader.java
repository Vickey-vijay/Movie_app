package okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import ck.i;
import ck.p;
import java.io.IOException;
import okhttp3.Headers;
import okio.BufferedSource;

/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final BufferedSource source;

    /* JADX INFO: compiled from: HeadersReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public HeadersReader(BufferedSource bufferedSource) {
        p.j(bufferedSource, "source");
        this.source = bufferedSource;
        this.headerLimit = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public final BufferedSource getSource() {
        return this.source;
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    public final String readLine() throws IOException {
        String utf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
        this.headerLimit -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }
}
