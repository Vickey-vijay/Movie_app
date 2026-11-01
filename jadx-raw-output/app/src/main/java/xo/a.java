package xo;

/* JADX INFO: compiled from: ArrayAdapterInterface.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a<T> {
    int getArrayLength(T t10);

    int getElementSizeInBytes();

    String getTag();

    T newArray(int i10);
}
