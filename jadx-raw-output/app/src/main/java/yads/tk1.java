package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes11.dex */
public final class tk1 implements sk1 {
    @Override // yads.sk1
    public final MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // yads.sk1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // yads.sk1
    public final boolean b() {
        return false;
    }

    @Override // yads.sk1
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // yads.sk1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
