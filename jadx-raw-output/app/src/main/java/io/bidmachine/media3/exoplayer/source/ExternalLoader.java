package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import io.bidmachine.media3.common.util.UnstableApi;
import q5.i;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public interface ExternalLoader {
    i<?> load(LoadRequest loadRequest);

    public static final class LoadRequest {
        public final Uri uri;

        public LoadRequest(Uri uri) {
            this.uri = uri;
        }
    }
}
