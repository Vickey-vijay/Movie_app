package fm;

import android.util.SparseArray;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: compiled from: ItemBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final d<T> f52983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @LayoutRes
    public int f52985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray<Object> f52986d;

    @NonNull
    public static <T> c<T> c(int i10, @LayoutRes int i11) {
        return new c(null).f(i10, i11);
    }

    @NonNull
    public static <T> c<T> d(@NonNull d<T> dVar) {
        if (dVar != null) {
            return new c<>(dVar);
        }
        throw new NullPointerException("onItemBind == null");
    }

    public boolean a(@NonNull ViewDataBinding viewDataBinding, T t10) {
        int i10 = this.f52984b;
        if (i10 == 0) {
            return false;
        }
        if (!viewDataBinding.setVariable(i10, t10)) {
            e.c(viewDataBinding, this.f52984b, this.f52985c);
        }
        SparseArray<Object> sparseArray = this.f52986d;
        if (sparseArray == null) {
            return true;
        }
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iKeyAt = this.f52986d.keyAt(i11);
            Object objValueAt = this.f52986d.valueAt(i11);
            if (iKeyAt != 0) {
                viewDataBinding.setVariable(iKeyAt, objValueAt);
            }
        }
        return true;
    }

    @LayoutRes
    public final int b() {
        return this.f52985c;
    }

    public void e(int i10, T t10) {
        d<T> dVar = this.f52983a;
        if (dVar != null) {
            this.f52984b = -1;
            this.f52985c = 0;
            dVar.a(this, i10, t10);
            if (this.f52984b == -1) {
                throw new IllegalStateException("variableId not set in onItemBind()");
            }
            if (this.f52985c == 0) {
                throw new IllegalStateException("layoutRes not set in onItemBind()");
            }
        }
    }

    @NonNull
    public final c<T> f(int i10, @LayoutRes int i11) {
        this.f52984b = i10;
        this.f52985c = i11;
        return this;
    }

    public final int g() {
        return this.f52984b;
    }

    public c(@Nullable d<T> dVar) {
        this.f52983a = dVar;
    }
}
