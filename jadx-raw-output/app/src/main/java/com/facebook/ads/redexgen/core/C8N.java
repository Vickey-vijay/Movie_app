package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface C8N {
    void A51(C2654or c2654or, int i10, int[] iArr) throws C8G;

    void A5r();

    void A6E();

    void A6L();

    long A7X(boolean z10);

    C2638ob A8e();

    boolean A9W(ByteBuffer byteBuffer, long j10, int i10) throws C8M, C8H;

    void A9Z();

    boolean A9g();

    boolean AAG();

    void AGG();

    void AGI() throws C8M;

    void AIW(C2660oy c2660oy);

    void AIX(int i10);

    void AIY(C1P c1p);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AIg(boolean z10);

    void AIl(C8J c8j);

    void AIt(C2638ob c2638ob);

    void AIw(C10567m c10567m);

    void AIy(AudioDeviceInfo audioDeviceInfo);

    void AJ4(boolean z10);

    boolean AJc(C2654or c2654or);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AJe(int i10, int i11);

    void flush();

    void pause();

    void setVolume(float f10);
}
