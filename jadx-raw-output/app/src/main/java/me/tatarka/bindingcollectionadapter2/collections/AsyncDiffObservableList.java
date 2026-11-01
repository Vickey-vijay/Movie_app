package me.tatarka.bindingcollectionadapter2.collections;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ListChangeRegistry;
import androidx.databinding.ObservableList;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes9.dex */
public class AsyncDiffObservableList<T> extends AbstractList<T> implements ObservableList<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsyncListDiffer<T> f64491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListChangeRegistry f64492c = new ListChangeRegistry();

    public class a implements ListUpdateCallback {
        public a() {
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i10, int i11, Object obj) {
            AsyncDiffObservableList.this.f64492c.notifyChanged(AsyncDiffObservableList.this, i10, i11);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i10, int i11) {
            AsyncDiffObservableList.this.f64492c.notifyInserted(AsyncDiffObservableList.this, i10, i11);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i10, int i11) {
            AsyncDiffObservableList.this.f64492c.notifyMoved(AsyncDiffObservableList.this, i10, i11, 1);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i10, int i11) {
            AsyncDiffObservableList.this.f64492c.notifyRemoved(AsyncDiffObservableList.this, i10, i11);
        }
    }

    @Override // androidx.databinding.ObservableList
    public void addOnListChangedCallback(@NonNull ObservableList.OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback) {
        this.f64492c.add(onListChangedCallback);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AsyncDiffObservableList) {
            return this.f64491b.getCurrentList().equals(((AsyncDiffObservableList) obj).f64491b.getCurrentList());
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f64491b.getCurrentList().get(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.f64491b.getCurrentList().hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return this.f64491b.getCurrentList().indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return this.f64491b.getCurrentList().lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    @NonNull
    public ListIterator<T> listIterator(int i10) {
        return this.f64491b.getCurrentList().listIterator(i10);
    }

    @Override // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(@NonNull ObservableList.OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback) {
        this.f64492c.remove(onListChangedCallback);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f64491b.getCurrentList().size();
    }

    @Override // java.util.AbstractList, java.util.List
    @NonNull
    public List<T> subList(int i10, int i11) {
        return this.f64491b.getCurrentList().subList(i10, i11);
    }

    public void update(@Nullable List<T> list) {
        this.f64491b.submitList(list);
    }

    public AsyncDiffObservableList(@NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.f64491b = new AsyncListDiffer<>(new a(), asyncDifferConfig);
    }
}
