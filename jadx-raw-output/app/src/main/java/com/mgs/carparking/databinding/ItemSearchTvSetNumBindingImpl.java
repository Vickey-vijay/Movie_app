package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import ul.b;
import w9.u2;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemSearchTvSetNumBindingImpl extends ItemSearchTvSetNumBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40893e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40894f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40896d;

    public ItemSearchTvSetNumBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f40893e, f40894f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f40896d;
            this.f40896d = 0L;
        }
        u2 u2Var = this.f40892b;
        b bVar = null;
        long j11 = j10 & 3;
        if (j11 != 0 && u2Var != null) {
            bVar = u2Var.f73819b;
        }
        if (j11 != 0) {
            a.b(this.f40895c, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40896d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40896d = 2L;
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
        a((u2) obj);
        return true;
    }

    public ItemSearchTvSetNumBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f40896d = -1L;
        TextView textView = (TextView) objArr[0];
        this.f40895c = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable u2 u2Var) {
        this.f40892b = u2Var;
        synchronized (this) {
            this.f40896d |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
