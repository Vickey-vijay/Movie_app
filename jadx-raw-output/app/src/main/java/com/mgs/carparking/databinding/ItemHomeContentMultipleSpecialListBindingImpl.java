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
import ca.e1;
import ca.g1;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;

/* JADX INFO: loaded from: classes10.dex */
public class ItemHomeContentMultipleSpecialListBindingImpl extends ItemHomeContentMultipleSpecialListBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40542g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40543h = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40545f;

    public ItemHomeContentMultipleSpecialListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f40542g, f40543h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40545f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40545f = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((g1) obj);
        return true;
    }

    public ItemHomeContentMultipleSpecialListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.f40545f = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40544e = linearLayout;
        linearLayout.setTag(null);
        this.f40539b.setTag(null);
        this.f40540c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableList<e1> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40545f |= 1;
        }
        return true;
    }

    public void b(@Nullable g1 g1Var) {
        this.f40541d = g1Var;
        synchronized (this) {
            this.f40545f |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        c<e1> cVar;
        ObservableList<e1> observableList;
        ObservableList<e1> observableList2;
        c<e1> cVar2;
        synchronized (this) {
            j10 = this.f40545f;
            this.f40545f = 0L;
        }
        g1 g1Var = this.f40541d;
        long j11 = 7 & j10;
        String module_name = null;
        if (j11 != 0) {
            if (g1Var != null) {
                observableList2 = g1Var.f5739f;
                cVar2 = g1Var.f5740g;
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                HomeMultipleEntry homeMultipleEntry = g1Var != null ? g1Var.f5736c : null;
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
            ViewAdapter.b(this.f40539b, a.c(0, false));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40539b, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f40540c, module_name);
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
