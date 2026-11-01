package io.bidmachine.media3.extractor.metadata;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MetadataInputBuffer extends DecoderInputBuffer {
    public long subsampleOffsetUs;

    public MetadataInputBuffer() {
        super(1);
    }
}
