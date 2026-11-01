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
import ea.c0;
import ea.k0;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes11.dex */
public class ItemHomeRecommendMultipleNewBindingImpl extends ItemHomeRecommendMultipleNewBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40778i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40779j = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40783h;

    public ItemHomeRecommendMultipleNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40778i, f40779j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40783h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40783h = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((k0) obj);
        return true;
    }

    public ItemHomeRecommendMultipleNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.f40783h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40780e = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.f40781f = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[4];
        this.f40782g = linearLayout3;
        linearLayout3.setTag(null);
        this.f40775b.setTag(null);
        this.f40776c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableList<c0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40783h |= 1;
        }
        return true;
    }

    public void b(@Nullable k0 k0Var) {
        this.f40777d = k0Var;
        synchronized (this) {
            this.f40783h |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        String module_name;
        b bVar2;
        c<c0> cVar;
        ObservableList<c0> observableList;
        boolean z10;
        boolean z11;
        ObservableList<c0> observableList2;
        c<c0> cVar2;
        HomeMultipleEntry homeMultipleEntry;
        int iIs_more;
        int iIs_change;
        synchronized (this) {
            j10 = this.f40783h;
            this.f40783h = 0L;
        }
        k0 k0Var = this.f40777d;
        long j11 = 7 & j10;
        if (j11 != 0) {
            if (k0Var != null) {
                observableList2 = k0Var.f52514e;
                cVar2 = k0Var.f52515f;
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                if (k0Var != null) {
                    homeMultipleEntry = k0Var.f52513d;
                    bVar2 = k0Var.f52517h;
                    bVar = k0Var.f52516g;
                } else {
                    bVar = null;
                    homeMultipleEntry = null;
                    bVar2 = null;
                }
                if (homeMultipleEntry != null) {
                    iIs_more = homeMultipleEntry.is_more();
                    iIs_change = homeMultipleEntry.is_change();
                    module_name = homeMultipleEntry.getModule_name();
                } else {
                    module_name = null;
                    iIs_more = 0;
                    iIs_change = 0;
                }
                z10 = iIs_more == 1;
                z11 = iIs_change == 1;
                observableList = observableList2;
                cVar = cVar2;
            } else {
                bVar = null;
                module_name = null;
                bVar2 = null;
                observableList = observableList2;
                cVar = cVar2;
            }
            if ((6 & j10) != 0) {
                a.a(this.f40781f, Boolean.valueOf(z10));
                a.b(this.f40781f, bVar, false);
                a.a(this.f40782g, Boolean.valueOf(z11));
                a.b(this.f40782g, bVar2, false);
                TextViewBindingAdapter.setText(this.f40776c, module_name);
            }
            if ((j10 & 4) != 0) {
                ViewAdapter.b(this.f40775b, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(3));
            }
            if (j11 != 0) {
                me.tatarka.bindingcollectionadapter2.a.a(this.f40775b, cVar, observableList, null, null, null, null);
            }
        }
        bVar = null;
        module_name = null;
        bVar2 = null;
        cVar = null;
        observableList = null;
        z10 = false;
        z11 = false;
        if ((6 & j10) != 0) {
            a.a(this.f40781f, Boolean.valueOf(z10));
            a.b(this.f40781f, bVar, false);
            a.a(this.f40782g, Boolean.valueOf(z11));
            a.b(this.f40782g, bVar2, false);
            TextViewBindingAdapter.setText(this.f40776c, module_name);
        }
        if ((j10 & 4) != 0) {
            ViewAdapter.b(this.f40775b, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(3));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40775b, cVar, observableList, null, null, null, null);
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
