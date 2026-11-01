package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes3.dex */
public final class uk1 implements sk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f83518b;

    @Override // yads.sk1
    public final int a() {
        if (this.f83518b == null) {
            this.f83518b = new MediaCodecList(this.f83517a).getCodecInfos();
        }
        return this.f83518b.length;
    }

    @Override // yads.sk1
    public final boolean b() {
        return true;
    }

    public uk1(boolean z10, boolean z11) {
        int i10;
        if (!z10 && !z11) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f83517a = i10;
    }

    @Override // yads.sk1
    public final MediaCodecInfo a(int i10) {
        if (this.f83518b == null) {
            this.f83518b = new MediaCodecList(this.f83517a).getCodecInfos();
        }
        return this.f83518b[i10];
    }

    @Override // yads.sk1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // yads.sk1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
