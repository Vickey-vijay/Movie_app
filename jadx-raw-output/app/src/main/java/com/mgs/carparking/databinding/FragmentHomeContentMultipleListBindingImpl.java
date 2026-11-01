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
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListAdapter;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;
import com.mgs.carparking.widgets.FeedRootRecyclerView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import sl.e;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes11.dex */
public class FragmentHomeContentMultipleListBindingImpl extends FragmentHomeContentMultipleListBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40198n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40199o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final Button f40202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40204m;

    public FragmentHomeContentMultipleListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f40198n, f40199o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40204m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40204m = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (3 == i10) {
            d((HomeContentMultipleListAdapter) obj);
        } else {
            if (7 != i10) {
                return false;
            }
            e((HomeContentMultipleListViewModel) obj);
        }
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40199o = sparseIntArray;
        sparseIntArray.put(R.id.refresh_layout, 5);
        sparseIntArray.put(R.id.header, 6);
        sparseIntArray.put(R.id.tv_empty, 7);
        sparseIntArray.put(R.id.img_loading, 8);
    }

    public FragmentHomeContentMultipleListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (WaterDropHeader) objArr[6], (ImageView) objArr[8], (SmartRefreshLayout) objArr[5], (FeedRootRecyclerView) objArr[1], (TextView) objArr[7]);
        this.f40204m = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40200i = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.f40201j = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[3];
        this.f40202k = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f40203l = relativeLayout3;
        relativeLayout3.setTag(null);
        this.f40194e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40204m |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40204m |= 2;
        }
        return true;
    }

    public final boolean c(ObservableList<e> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40204m |= 1;
        }
        return true;
    }

    public void d(@Nullable HomeContentMultipleListAdapter homeContentMultipleListAdapter) {
        this.f40197h = homeContentMultipleListAdapter;
    }

    public void e(@Nullable HomeContentMultipleListViewModel homeContentMultipleListViewModel) {
        this.f40196g = homeContentMultipleListViewModel;
        synchronized (this) {
            this.f40204m |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        Boolean bool;
        Boolean bool2;
        c<e> cVar;
        ObservableList observableList;
        ObservableList observableList2;
        c<e> cVar2;
        synchronized (this) {
            j10 = this.f40204m;
            this.f40204m = 0L;
        }
        HomeContentMultipleListViewModel homeContentMultipleListViewModel = this.f40196g;
        if ((55 & j10) != 0) {
            if ((j10 & 49) != 0) {
                if (homeContentMultipleListViewModel != null) {
                    observableList2 = homeContentMultipleListViewModel.f41809p;
                    cVar2 = homeContentMultipleListViewModel.f41810q;
                } else {
                    observableList2 = null;
                    cVar2 = null;
                }
                updateRegistration(0, observableList2);
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            if ((j10 & 50) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField = homeContentMultipleListViewModel != null ? homeContentMultipleListViewModel.f41802i : null;
                updateRegistration(1, observableField);
                if (observableField != null) {
                    bool2 = observableField.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 52) == 0) {
                bool = null;
            } else {
                ObservableField<Boolean> observableField2 = homeContentMultipleListViewModel != null ? homeContentMultipleListViewModel.f41801h : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    bool = observableField2.get();
                } else {
                    bool = null;
                }
            }
            if ((j10 & 48) == 0 || homeContentMultipleListViewModel == null) {
                observableList = observableList2;
                cVar = cVar2;
                bVar = null;
            } else {
                bVar = homeContentMultipleListViewModel.f41811r;
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
        if ((j10 & 50) != 0) {
            a.a(this.f40201j, bool2);
        }
        if ((48 & j10) != 0) {
            a.b(this.f40202k, bVar, false);
        }
        if ((j10 & 52) != 0) {
            a.a(this.f40203l, bool);
        }
        if ((32 & j10) != 0) {
            ViewAdapter.a(this.f40194e, null);
            ViewAdapter.b(this.f40194e, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
        }
        if ((j10 & 49) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40194e, cVar, observableList, null, null, null, null);
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
