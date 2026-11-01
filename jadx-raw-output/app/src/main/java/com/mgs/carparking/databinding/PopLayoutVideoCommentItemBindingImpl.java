package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class PopLayoutVideoCommentItemBindingImpl extends PopLayoutVideoCommentItemBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f41010f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f41011g = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f41012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41013e;

    public PopLayoutVideoCommentItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f41010f, f41011g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f41013e;
            this.f41013e = 0L;
        }
        b bVar = null;
        VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel = this.f41009c;
        long j11 = j10 & 3;
        if (j11 != 0 && videoplaydetailviewmodel != null) {
            bVar = videoplaydetailviewmodel.U0;
        }
        if (j11 != 0) {
            a.b(this.f41008b, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f41013e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f41013e = 2L;
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
        a((VIDEOPLAYDETAILVIEWMODEL) obj);
        return true;
    }

    public PopLayoutVideoCommentItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.f41013e = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f41012d = linearLayout;
        linearLayout.setTag(null);
        this.f41008b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.PopLayoutVideoCommentItemBinding
    public void a(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        this.f41009c = videoplaydetailviewmodel;
        synchronized (this) {
            this.f41013e |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
