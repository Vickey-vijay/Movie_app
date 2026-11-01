package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import ca.f0;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeContentMultipleListItemCategoryListBindingImpl extends ItemHomeContentMultipleListItemCategoryListBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40483e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40484f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40486d;

    public ItemHomeContentMultipleListItemCategoryListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f40483e, f40484f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        synchronized (this) {
            j10 = this.f40486d;
            this.f40486d = 0L;
        }
        f0 f0Var = this.f40482b;
        long j11 = j10 & 3;
        String str = null;
        if (j11 == 0 || f0Var == null) {
            bVar = null;
        } else {
            bVar = f0Var.f5732c;
            str = f0Var.f5731b;
        }
        if (j11 != 0) {
            TextViewBindingAdapter.setText(this.f40485c, str);
            a.b(this.f40485c, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40486d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40486d = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        a((f0) obj);
        return true;
    }

    public ItemHomeContentMultipleListItemCategoryListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f40486d = -1L;
        TextView textView = (TextView) objArr[0];
        this.f40485c = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable f0 f0Var) {
        this.f40482b = f0Var;
        synchronized (this) {
            this.f40486d |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
