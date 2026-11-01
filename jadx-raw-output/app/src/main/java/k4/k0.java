package k4;

/* JADX INFO: compiled from: ShuffleOrder.java */
/* JADX INFO: loaded from: classes2.dex */
public interface k0 {
    k0 cloneAndClear();

    k0 cloneAndInsert(int i10, int i11);

    k0 cloneAndRemove(int i10, int i11);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i10);

    int getPreviousIndex(int i10);
}
