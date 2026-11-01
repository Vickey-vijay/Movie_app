package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;
import w9.a3;

/* JADX INFO: loaded from: classes5.dex */
public class PopLayoutVideoSeasonItemBindingImpl extends PopLayoutVideoSeasonItemBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f41028e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f41029f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f41030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41031d;

    public PopLayoutVideoSeasonItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f41028e, f41029f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f41031d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f41031d = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        a((VIDEOPLAYDETAILVIEWMODEL) obj);
        return true;
    }

    public PopLayoutVideoSeasonItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f41031d = -1L;
        RecyclerView recyclerView = (RecyclerView) objArr[0];
        this.f41030c = recyclerView;
        recyclerView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.PopLayoutVideoSeasonItemBinding
    public void a(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        this.f41027b = videoplaydetailviewmodel;
        synchronized (this) {
            this.f41031d |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    public final boolean b(ObservableList<a3> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f41031d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        c<a3> cVar;
        ObservableList<a3> observableList;
        c<a3> cVar2;
        synchronized (this) {
            j10 = this.f41031d;
            this.f41031d = 0L;
        }
        VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel = this.f41027b;
        long j11 = 7 & j10;
        ObservableList<a3> observableList2 = null;
        if (j11 != 0) {
            if (videoplaydetailviewmodel != null) {
                c<a3> cVar3 = videoplaydetailviewmodel.f41417r0;
                observableList2 = videoplaydetailviewmodel.f41419s0;
                cVar2 = cVar3;
            } else {
                cVar2 = null;
            }
            updateRegistration(0, observableList2);
            cVar = cVar2;
            observableList = observableList2;
        } else {
            cVar = null;
            observableList = null;
        }
        if ((j10 & 4) != 0) {
            ViewAdapter.b(this.f41030c, a.b());
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f41030c, cVar, observableList, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return b((ObservableList) obj, i11);
    }
}
