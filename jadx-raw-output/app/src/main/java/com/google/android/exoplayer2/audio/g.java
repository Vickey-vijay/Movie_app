package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ResamplingAudioProcessor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends c {
    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f18991c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new AudioProcessor.a(aVar.f18989a, aVar.f18990b, 2) : AudioProcessor.a.f18988e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f19069b.f18991c;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 268435456) {
                    if (i11 != 536870912) {
                        if (i11 != 805306368) {
                            throw new IllegalStateException();
                        }
                        i10 /= 2;
                    } else {
                        i10 /= 3;
                        i10 *= 2;
                    }
                }
            } else {
                i10 /= 2;
            }
        } else {
            i10 *= 2;
        }
        ByteBuffer byteBufferG = g(i10);
        int i12 = this.f19069b.f18991c;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 268435456) {
                    if (i12 != 536870912) {
                        if (i12 == 805306368) {
                            while (iPosition < iLimit) {
                                byteBufferG.put(byteBuffer.get(iPosition + 2));
                                byteBufferG.put(byteBuffer.get(iPosition + 3));
                                iPosition += 4;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        while (iPosition < iLimit) {
                            byteBufferG.put(byteBuffer.get(iPosition + 1));
                            byteBufferG.put(byteBuffer.get(iPosition + 2));
                            iPosition += 3;
                        }
                    }
                } else {
                    while (iPosition < iLimit) {
                        byteBufferG.put(byteBuffer.get(iPosition + 1));
                        byteBufferG.put(byteBuffer.get(iPosition));
                        iPosition += 2;
                    }
                }
            } else {
                while (iPosition < iLimit) {
                    short s10 = (short) (byteBuffer.getFloat(iPosition) * 32767.0f);
                    byteBufferG.put((byte) (s10 & 255));
                    byteBufferG.put((byte) ((s10 >> 8) & 255));
                    iPosition += 4;
                }
            }
        } else {
            while (iPosition < iLimit) {
                byteBufferG.put((byte) 0);
                byteBufferG.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferG.flip();
    }
}
