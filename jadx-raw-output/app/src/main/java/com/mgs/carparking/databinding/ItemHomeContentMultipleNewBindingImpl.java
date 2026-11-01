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
import ca.s0;
import ca.y0;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes5.dex */
public class ItemHomeContentMultipleNewBindingImpl extends ItemHomeContentMultipleNewBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40521i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40522j = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40526h;

    public ItemHomeContentMultipleNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40521i, f40522j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40526h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40526h = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((y0) obj);
        return true;
    }

    public ItemHomeContentMultipleNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.f40526h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40523e = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.f40524f = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[4];
        this.f40525g = linearLayout3;
        linearLayout3.setTag(null);
        this.f40518b.setTag(null);
        this.f40519c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40526h |= 1;
        }
        return true;
    }

    public void b(@Nullable y0 y0Var) {
        this.f40520d = y0Var;
        synchronized (this) {
            this.f40526h |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String module_name;
        b bVar;
        c<s0> cVar;
        ObservableList<s0> observableList;
        ObservableList<s0> observableList2;
        c<s0> cVar2;
        b bVar2;
        HomeMultipleEntry homeMultipleEntry;
        synchronized (this) {
            j10 = this.f40526h;
            this.f40526h = 0L;
        }
        y0 y0Var = this.f40520d;
        long j11 = 7 & j10;
        b bVar3 = null;
        bVar3 = null;
        if (j11 != 0) {
            if (y0Var != null) {
                observableList2 = y0Var.f5803e;
                cVar2 = y0Var.f5804f;
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                if (y0Var != null) {
                    homeMultipleEntry = y0Var.f5802d;
                    bVar = y0Var.f5806h;
                    bVar2 = y0Var.f5805g;
                } else {
                    bVar2 = null;
                    homeMultipleEntry = null;
                    bVar = null;
                }
                observableList = observableList2;
                cVar = cVar2;
                bVar3 = bVar2;
                module_name = homeMultipleEntry != null ? homeMultipleEntry.getModule_name() : null;
            } else {
                module_name = null;
                bVar = null;
                observableList = observableList2;
                cVar = cVar2;
            }
        } else {
            module_name = null;
            bVar = null;
            cVar = null;
            observableList = null;
        }
        if ((6 & j10) != 0) {
            a.b(this.f40524f, bVar3, false);
            a.b(this.f40525g, bVar, false);
            TextViewBindingAdapter.setText(this.f40519c, module_name);
        }
        if ((j10 & 4) != 0) {
            ViewAdapter.b(this.f40518b, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(3));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40518b, cVar, observableList, null, null, null, null);
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
