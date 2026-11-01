package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class ToInt16PcmAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = audioFormat.encoding;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 2 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 2) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.inputAudioFormat.encoding;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 21) {
                    if (i11 != 22) {
                        if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                                i10 /= 2;
                            }
                        }
                    } else {
                        i10 /= 2;
                    }
                }
                i10 /= 3;
                i10 *= 2;
            } else {
                i10 /= 2;
            }
        } else {
            i10 *= 2;
        }
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(i10);
        int i12 = this.inputAudioFormat.encoding;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 21) {
                    if (i12 != 22) {
                        if (i12 != 268435456) {
                            if (i12 != 1342177280) {
                                if (i12 == 1610612736) {
                                    while (iPosition < iLimit) {
                                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                                        iPosition += 4;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                while (iPosition < iLimit) {
                                    byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                                    byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                                    iPosition += 3;
                                }
                            }
                        } else {
                            while (iPosition < iLimit) {
                                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                                iPosition += 2;
                            }
                        }
                    } else {
                        while (iPosition < iLimit) {
                            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 3));
                            iPosition += 4;
                        }
                    }
                } else {
                    while (iPosition < iLimit) {
                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                        iPosition += 3;
                    }
                }
            } else {
                while (iPosition < iLimit) {
                    short sConstrainValue = (short) (Util.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                    byteBufferReplaceOutputBuffer.put((byte) (sConstrainValue & 255));
                    byteBufferReplaceOutputBuffer.put((byte) ((sConstrainValue >> 8) & 255));
                    iPosition += 4;
                }
            }
        } else {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put((byte) 0);
                byteBufferReplaceOutputBuffer.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
