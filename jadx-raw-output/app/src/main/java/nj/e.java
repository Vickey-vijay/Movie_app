package nj;

import java.util.AbstractCollection;

/* JADX INFO: compiled from: AbstractMutableCollection.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e<E> extends AbstractCollection<E> implements dk.b {
    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }
}
