package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import ea.p;
import ea.w;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes10.dex */
public class ItemHomeRecommendMultipleCategoryBindingImpl extends ItemHomeRecommendMultipleCategoryBinding {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40640j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40641k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f40644i;

    public ItemHomeRecommendMultipleCategoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f40640j, f40641k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40644i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40644i = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((p) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40641k = sparseIntArray;
        sparseIntArray.put(R.id.tv_more, 4);
        sparseIntArray.put(R.id.iv_right, 5);
    }

    public ItemHomeRecommendMultipleCategoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[5], (RecyclerView) objArr[3], (TextView) objArr[4], (TextView) objArr[2]);
        this.f40644i = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40642g = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.f40643h = relativeLayout;
        relativeLayout.setTag(null);
        this.f40636c.setTag(null);
        this.f40638e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableList<w> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40644i |= 1;
        }
        return true;
    }

    public void b(@Nullable p pVar) {
        this.f40639f = pVar;
        synchronized (this) {
            this.f40644i |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        c<w> cVar;
        ObservableList<w> observableList;
        ObservableList<w> observableList2;
        b bVar;
        HomeMultipleEntry homeMultipleEntry;
        synchronized (this) {
            j10 = this.f40644i;
            this.f40644i = 0L;
        }
        p pVar = this.f40639f;
        long j11 = 7 & j10;
        b bVar2 = null;
        bVar2 = null;
        if (j11 != 0) {
            if (pVar != null) {
                observableList2 = pVar.f52537d;
                cVar = pVar.f52538e;
            } else {
                observableList2 = null;
                cVar = null;
            }
            updateRegistration(0, observableList2);
            if ((j10 & 6) != 0) {
                if (pVar != null) {
                    homeMultipleEntry = pVar.f52536c;
                    bVar = pVar.f52539f;
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
            a.b(this.f40643h, bVar2, false);
            TextViewBindingAdapter.setText(this.f40638e, str);
        }
        if ((j10 & 4) != 0) {
            ViewAdapter.b(this.f40636c, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.c(0, false));
        }
        if (j11 != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40636c, cVar, observableList, null, null, null, null);
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
