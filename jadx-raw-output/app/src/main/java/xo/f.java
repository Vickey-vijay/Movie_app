package xo;

/* JADX INFO: compiled from: IntegerArrayAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements a<int[]> {
    @Override // xo.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int getArrayLength(int[] iArr) {
        return iArr.length;
    }

    @Override // xo.a
    public int getElementSizeInBytes() {
        return 4;
    }

    @Override // xo.a
    public String getTag() {
        return "IntegerArrayPool";
    }

    @Override // xo.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
