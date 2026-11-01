package xo;

/* JADX INFO: compiled from: ByteArrayAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements a<byte[]> {
    @Override // xo.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int getArrayLength(byte[] bArr) {
        return bArr.length;
    }

    @Override // xo.a
    public int getElementSizeInBytes() {
        return 1;
    }

    @Override // xo.a
    public String getTag() {
        return "ByteArrayPool";
    }

    @Override // xo.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
