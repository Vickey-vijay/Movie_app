package io.bidmachine.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.offline.FilterableManifest;
import io.bidmachine.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class FilteringManifestParser<T extends FilterableManifest<T>> implements ParsingLoadable.Parser<T> {
    private final ParsingLoadable.Parser<? extends T> parser;

    @Nullable
    private final List<StreamKey> streamKeys;

    @Override // io.bidmachine.media3.exoplayer.upstream.ParsingLoadable.Parser
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t10 = this.parser.parse(uri, inputStream);
        List<StreamKey> list = this.streamKeys;
        return (list == null || list.isEmpty()) ? t10 : (T) t10.copy(this.streamKeys);
    }

    public FilteringManifestParser(ParsingLoadable.Parser<? extends T> parser, @Nullable List<StreamKey> list) {
        this.parser = parser;
        this.streamKeys = list;
    }
}
