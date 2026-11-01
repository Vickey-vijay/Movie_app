package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: MediaCodecSelector.java */
/* JADX INFO: loaded from: classes10.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f19259a = new a();

    List<com.google.android.exoplayer2.mediacodec.a> getDecoderInfos(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException;

    @Nullable
    com.google.android.exoplayer2.mediacodec.a getPassthroughDecoderInfo() throws MediaCodecUtil.DecoderQueryException;

    /* JADX INFO: compiled from: MediaCodecSelector.java */
    public class a implements b {
        @Override // com.google.android.exoplayer2.mediacodec.b
        public List<com.google.android.exoplayer2.mediacodec.a> getDecoderInfos(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
            return MediaCodecUtil.n(str, z10, z11);
        }

        @Override // com.google.android.exoplayer2.mediacodec.b
        @Nullable
        public com.google.android.exoplayer2.mediacodec.a getPassthroughDecoderInfo() throws MediaCodecUtil.DecoderQueryException {
            return MediaCodecUtil.s();
        }
    }
}
