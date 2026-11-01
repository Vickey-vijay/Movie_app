package qh;

/* JADX INFO: compiled from: WavFormat.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public b(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.formatType = i10;
        this.numChannels = i11;
        this.frameRateHz = i12;
        this.averageBytesPerSecond = i13;
        this.blockSize = i14;
        this.bitsPerSample = i15;
        this.extraData = bArr;
    }
}
