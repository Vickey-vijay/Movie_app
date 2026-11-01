package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.widgets.rv.SV_RV_inner;
import ea.s;
import ea.y;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeRecommendMultipleGusslikeHorizationBindingImpl extends ItemHomeRecommendMultipleGusslikeHorizationBinding {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40665h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40666i = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40668g;

    public ItemHomeRecommendMultipleGusslikeHorizationBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f40665h, f40666i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40668g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40668g = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((s) obj);
        return true;
    }

    public ItemHomeRecommendMultipleGusslikeHorizationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (LinearLayout) objArr[0], (SV_RV_inner) objArr[3], (TextView) objArr[2]);
        this.f40668g = -1L;
        this.f40661b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.f40667f = relativeLayout;
        relativeLayout.setTag(null);
        this.f40662c.setTag(null);
        this.f40663d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableList<y> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40668g |= 1;
        }
        return true;
    }

    public void b(@Nullable s sVar) {
        this.f40664e = sVar;
        synchronized (this) {
            this.f40668g |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        c<y> cVar;
        ObservableList<y> observableList;
        ObservableList<y> observableList2;
        b bVar;
        HomeMultipleEntry homeMultipleEntry;
        synchronized (this) {
            j10 = this.f40668g;
            this.f40668g = 0L;
        }
        s sVar = this.f40664e;
        long j11 = 7 & j10;
        b bVar2 = null;
        bVar2 = null;
        if (j11 != 0) {
            if (sVar != null) {
                observableList2 = sVar.f52546d;
                cVar = sVar.f52547e;
            } else {
                observableList2 = null;
                cVar = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                if (sVar != null) {
                    homeMultipleEntry = sVar.f52545c;
                    bVar = sVar.f52548f;
                } else {
                    bVar = null;
                    homeMultipleEntry = null;
                }
                String module_name = homeMultipleEntry != null ? homeMultipleEntry.getModule_name() : null;
                observableList = observableList2;
                String str2 = module_name;
                bVar2 = bVar;
                str = str2;
            } else {
                str = null;
                observableList = observableList2;
            }
        } else {
            str = null;
            cVar = null;
            observableList = null;
        }
        if ((6 & j10) != 0) {
            a.b(this.f40667f, bVar2, false);
            TextViewBindingAdapter.setText(this.f40663d, str);
        }
        if ((j10 & 4) != 0) {
            ViewAdapter.b(this.f40662c, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.c(0, false));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40662c, cVar, observableList, null, null, null, null);
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
