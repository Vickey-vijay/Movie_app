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
import com.mgs.carparking.netbean.HomeMultipleEntry;
import ea.o0;
import ea.q0;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;

/* JADX INFO: loaded from: classes11.dex */
public class ItemRecommendMultipleSpecialListBindingImpl extends ItemRecommendMultipleSpecialListBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40881g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40882h = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40884f;

    public ItemRecommendMultipleSpecialListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f40881g, f40882h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40884f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40884f = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((q0) obj);
        return true;
    }

    public ItemRecommendMultipleSpecialListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.f40884f = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40883e = linearLayout;
        linearLayout.setTag(null);
        this.f40878b.setTag(null);
        this.f40879c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableList<o0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40884f |= 1;
        }
        return true;
    }

    public void b(@Nullable q0 q0Var) {
        this.f40880d = q0Var;
        synchronized (this) {
            this.f40884f |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        c<o0> cVar;
        ObservableList<o0> observableList;
        ObservableList<o0> observableList2;
        c<o0> cVar2;
        synchronized (this) {
            j10 = this.f40884f;
            this.f40884f = 0L;
        }
        q0 q0Var = this.f40880d;
        long j11 = 7 & j10;
        String module_name = null;
        if (j11 != 0) {
            if (q0Var != null) {
                observableList2 = q0Var.f52542e;
                cVar2 = q0Var.f52543f;
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                HomeMultipleEntry homeMultipleEntry = q0Var != null ? q0Var.f52541d : null;
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
            ViewAdapter.b(this.f40878b, a.c(0, false));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40878b, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f40879c, module_name);
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
