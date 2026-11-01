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
import ea.j;
import ea.u;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;

/* JADX INFO: loaded from: classes10.dex */
public class ItemHomeRecommendMultipleHotBindingImpl extends ItemHomeRecommendMultipleHotBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40678g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40679h = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40681f;

    public ItemHomeRecommendMultipleHotBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f40678g, f40679h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40681f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40681f = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((u) obj);
        return true;
    }

    public ItemHomeRecommendMultipleHotBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.f40681f = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40680e = linearLayout;
        linearLayout.setTag(null);
        this.f40675b.setTag(null);
        this.f40676c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableList<j> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40681f |= 1;
        }
        return true;
    }

    public void b(@Nullable u uVar) {
        this.f40677d = uVar;
        synchronized (this) {
            this.f40681f |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        c<j> cVar;
        ObservableList<j> observableList;
        ObservableList<j> observableList2;
        c<j> cVar2;
        synchronized (this) {
            j10 = this.f40681f;
            this.f40681f = 0L;
        }
        u uVar = this.f40677d;
        long j11 = 7 & j10;
        String module_name = null;
        if (j11 != 0) {
            if (uVar != null) {
                observableList2 = uVar.f52550d;
                cVar2 = uVar.f52551e;
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                HomeMultipleEntry homeMultipleEntry = uVar != null ? uVar.f52549c : null;
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
            ViewAdapter.b(this.f40675b, a.a(2));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40675b, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f40676c, module_name);
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
