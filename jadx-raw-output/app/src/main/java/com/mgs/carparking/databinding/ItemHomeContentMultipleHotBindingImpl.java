package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import ca.m0;
import ca.q0;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeContentMultipleHotBindingImpl extends ItemHomeContentMultipleHotBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40467g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40468h = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40470f;

    public ItemHomeContentMultipleHotBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f40467g, f40468h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40470f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40470f = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((m0) obj);
        return true;
    }

    public ItemHomeContentMultipleHotBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.f40470f = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40469e = linearLayout;
        linearLayout.setTag(null);
        this.f40464b.setTag(null);
        this.f40465c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableList<q0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40470f |= 1;
        }
        return true;
    }

    public void b(@Nullable m0 m0Var) {
        this.f40466d = m0Var;
        synchronized (this) {
            this.f40470f |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        c<q0> cVar;
        ObservableList<q0> observableList;
        ObservableList<q0> observableList2;
        c<q0> cVar2;
        synchronized (this) {
            j10 = this.f40470f;
            this.f40470f = 0L;
        }
        m0 m0Var = this.f40466d;
        long j11 = 7 & j10;
        String module_name = null;
        if (j11 != 0) {
            if (m0Var != null) {
                observableList2 = m0Var.f5756d;
                cVar2 = m0Var.f5757e;
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                HomeMultipleEntry homeMultipleEntry = m0Var != null ? m0Var.f5755c : null;
                if (homeMultipleEntry != null) {
                    module_name = homeMultipleEntry.getModule_name();
                }
            }
            observableList = observableList2;
            cVar = cVar2;
        } else {
            cVar = null;
            observableList = null;
        }
        if ((4 & j10) != 0) {
            ViewAdapter.b(this.f40464b, a.a(2));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40464b, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f40465c, module_name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return a((ObservableList) obj, i11);
    }
}
