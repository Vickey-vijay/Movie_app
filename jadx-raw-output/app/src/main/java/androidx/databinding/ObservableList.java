package androidx.databinding;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface ObservableList<T> extends List<T> {

    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public abstract void onChanged(T t10);

        public abstract void onItemRangeChanged(T t10, int i10, int i11);

        public abstract void onItemRangeInserted(T t10, int i10, int i11);

        public abstract void onItemRangeMoved(T t10, int i10, int i11, int i12);

        public abstract void onItemRangeRemoved(T t10, int i10, int i11);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);
}
