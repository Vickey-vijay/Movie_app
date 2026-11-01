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
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.viewpager.widget.ViewPager;
import ca.k0;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleVideoEntry;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeContentMultipleGalleryBindingImpl extends ItemHomeContentMultipleGalleryBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40459i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40460j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40463h;

    public ItemHomeContentMultipleGalleryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40459i, f40460j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String moduleName;
        b bVar;
        HomeMultipleVideoEntry homeMultipleVideoEntry;
        synchronized (this) {
            j10 = this.f40463h;
            this.f40463h = 0L;
        }
        k0 k0Var = this.f40458e;
        long j11 = j10 & 3;
        b bVar2 = null;
        if (j11 != 0) {
            if (k0Var != null) {
                bVar = k0Var.f5751e;
                homeMultipleVideoEntry = k0Var.f5749c;
            } else {
                bVar = null;
                homeMultipleVideoEntry = null;
            }
            b bVar3 = bVar;
            moduleName = homeMultipleVideoEntry != null ? homeMultipleVideoEntry.getModuleName() : null;
            bVar2 = bVar3;
        } else {
            moduleName = null;
        }
        if (j11 != 0) {
            a.b(this.f40462g, bVar2, false);
            TextViewBindingAdapter.setText(this.f40456c, moduleName);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40463h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40463h = 2L;
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
        a((k0) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40460j = sparseIntArray;
        sparseIntArray.put(R.id.iv_right, 3);
        sparseIntArray.put(R.id.viewPager, 4);
    }

    public ItemHomeContentMultipleGalleryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (TextView) objArr[2], (ViewPager) objArr[4]);
        this.f40463h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40461f = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.f40462g = relativeLayout;
        relativeLayout.setTag(null);
        this.f40456c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable k0 k0Var) {
        this.f40458e = k0Var;
        synchronized (this) {
            this.f40463h |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
