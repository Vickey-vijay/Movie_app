package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ChannelMappingAudioProcessor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public int[] f19076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public int[] f19077j;

    @Override // com.google.android.exoplayer2.audio.c
    public void f() {
        this.f19077j = null;
        this.f19076i = null;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f19076i;
        if (iArr == null) {
            return AudioProcessor.a.f18988e;
        }
        if (aVar.f18991c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f18990b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f18990b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new AudioProcessor.a(aVar.f18989a, iArr.length, 2) : AudioProcessor.a.f18988e;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void d() {
        this.f19077j = this.f19076i;
    }

    public void h(@Nullable int[] iArr) {
        this.f19076i = iArr;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) g5.a.e(this.f19077j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferG = g(((iLimit - iPosition) / this.f19069b.f18992d) * this.f19070c.f18992d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferG.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f19069b.f18992d;
        }
        byteBuffer.position(iLimit);
        byteBufferG.flip();
    }
}
