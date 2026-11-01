package o3;

/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    private int flags;

    public void clear() {
        this.flags = 0;
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void addFlag(int i10) {
        this.flags = i10 | this.flags;
    }

    public final void clearFlag(int i10) {
        this.flags = (~i10) & this.flags;
    }

    public final boolean getFlag(int i10) {
        return (this.flags & i10) == i10;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isDecodeOnly() {
        return getFlag(Integer.MIN_VALUE);
    }

    public final void setFlags(int i10) {
        this.flags = i10;
    }
}
