package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface dk1 {
    int a(MediaCodec.BufferInfo bufferInfo);

    MediaFormat a();

    ByteBuffer a(int i10);

    void a(int i10, int i11, long j10, int i12);

    void a(int i10, long j10);

    void a(int i10, m20 m20Var, long j10);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(ck1 ck1Var, Handler handler);

    void a(boolean z10, int i10);

    int b();

    ByteBuffer b(int i10);

    void flush();

    void release();

    void setVideoScalingMode(int i10);
}
