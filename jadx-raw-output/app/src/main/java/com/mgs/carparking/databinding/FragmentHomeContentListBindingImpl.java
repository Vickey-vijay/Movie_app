package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ca.e0;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.homecontent.HomeContentListViewModel;
import com.mgs.carparking.util.DotView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.mgs.carparking.widgets.cardbanner.CardBanner;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes3.dex */
public class FragmentHomeContentListBindingImpl extends FragmentHomeContentListBinding {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40184o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40185p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Button f40188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f40190n;

    public FragmentHomeContentListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, f40184o, f40185p));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40190n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40190n = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((HomeContentListViewModel) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40185p = sparseIntArray;
        sparseIntArray.put(R.id.refresh_layout, 5);
        sparseIntArray.put(R.id.header, 6);
        sparseIntArray.put(R.id.homeCardBanner, 7);
        sparseIntArray.put(R.id.dotView, 8);
        sparseIntArray.put(R.id.tv_empty, 9);
        sparseIntArray.put(R.id.img_loading, 10);
    }

    public FragmentHomeContentListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (DotView) objArr[8], (WaterDropHeader) objArr[6], (CardBanner) objArr[7], (ImageView) objArr[10], (SmartRefreshLayout) objArr[5], (RecyclerView) objArr[1], (TextView) objArr[9]);
        this.f40190n = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40186j = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.f40187k = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[3];
        this.f40188l = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f40189m = relativeLayout3;
        relativeLayout3.setTag(null);
        this.f40181g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40190n |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40190n |= 2;
        }
        return true;
    }

    public final boolean c(ObservableList<e0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40190n |= 1;
        }
        return true;
    }

    public void d(@Nullable HomeContentListViewModel homeContentListViewModel) {
        this.f40183i = homeContentListViewModel;
        synchronized (this) {
            this.f40190n |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        Boolean bool;
        Boolean bool2;
        c<e0> cVar;
        ObservableList observableList;
        ObservableList observableList2;
        c<e0> cVar2;
        synchronized (this) {
            j10 = this.f40190n;
            this.f40190n = 0L;
        }
        HomeContentListViewModel homeContentListViewModel = this.f40183i;
        if ((31 & j10) != 0) {
            if ((j10 & 25) != 0) {
                if (homeContentListViewModel != null) {
                    observableList2 = homeContentListViewModel.f41784p;
                    cVar2 = homeContentListViewModel.f41785q;
                } else {
                    observableList2 = null;
                    cVar2 = null;
                }
                updateRegistration(0, observableList2);
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            if ((j10 & 26) == 0) {
                bool = null;
            } else {
                ObservableField<Boolean> observableField = homeContentListViewModel != null ? homeContentListViewModel.f41778j : null;
                updateRegistration(1, observableField);
                if (observableField != null) {
                    bool = observableField.get();
                } else {
                    bool = null;
                }
            }
            if ((j10 & 28) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField2 = homeContentListViewModel != null ? homeContentListViewModel.f41777i : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    bool2 = observableField2.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 24) == 0 || homeContentListViewModel == null) {
                observableList = observableList2;
                cVar = cVar2;
                bVar = null;
            } else {
                bVar = homeContentListViewModel.f41787s;
                observableList = observableList2;
                cVar = cVar2;
            }
        } else {
            bVar = null;
            bool = null;
            bool2 = null;
            cVar = null;
            observableList = null;
        }
        if ((26 & j10) != 0) {
            a.a(this.f40187k, bool);
        }
        if ((24 & j10) != 0) {
            a.b(this.f40188l, bVar, false);
        }
        if ((j10 & 28) != 0) {
            a.a(this.f40189m, bool2);
        }
        if ((16 & j10) != 0) {
            ViewAdapter.b(this.f40181g, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(2));
        }
        if ((j10 & 25) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40181g, cVar, observableList, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableList) obj, i11);
        }
        if (i10 == 1) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return a((ObservableField) obj, i11);
    }
}
