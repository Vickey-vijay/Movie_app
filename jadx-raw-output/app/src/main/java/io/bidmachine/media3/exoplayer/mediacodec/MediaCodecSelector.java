package io.bidmachine.media3.exoplayer.mediacodec;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: lg.h
        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z10, boolean z11) {
            return MediaCodecUtil.getDecoderInfos(str, z10, z11);
        }
    };

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException;
}
