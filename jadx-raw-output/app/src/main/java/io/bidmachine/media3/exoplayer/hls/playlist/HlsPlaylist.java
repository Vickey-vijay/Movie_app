package io.bidmachine.media3.exoplayer.hls.playlist;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.offline.FilterableManifest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public abstract class HlsPlaylist implements FilterableManifest<HlsPlaylist> {
    public final String baseUri;
    public final boolean hasIndependentSegments;
    public final List<String> tags;

    @Override // io.bidmachine.media3.exoplayer.offline.FilterableManifest
    public abstract /* synthetic */ HlsPlaylist copy(List list);

    public HlsPlaylist(String str, List<String> list, boolean z10) {
        this.baseUri = str;
        this.tags = Collections.unmodifiableList(list);
        this.hasIndependentSegments = z10;
    }
}
