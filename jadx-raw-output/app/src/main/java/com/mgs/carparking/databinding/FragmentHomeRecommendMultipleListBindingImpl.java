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
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListAdapter;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import com.mgs.carparking.widgets.FeedRootRecyclerView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import sl.e;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentHomeRecommendMultipleListBindingImpl extends FragmentHomeRecommendMultipleListBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40232n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40233o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final Button f40236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40238m;

    public FragmentHomeRecommendMultipleListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f40232n, f40233o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40238m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40238m = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (3 == i10) {
            d((HomeRecommendMultipleListAdapter) obj);
        } else {
            if (7 != i10) {
                return false;
            }
            e((HomeRecommendMultipleListViewModel) obj);
        }
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40233o = sparseIntArray;
        sparseIntArray.put(R.id.refresh_layout, 5);
        sparseIntArray.put(R.id.header, 6);
        sparseIntArray.put(R.id.tv_empty, 7);
        sparseIntArray.put(R.id.img_loading, 8);
    }

    public FragmentHomeRecommendMultipleListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (WaterDropHeader) objArr[6], (ImageView) objArr[8], (SmartRefreshLayout) objArr[5], (FeedRootRecyclerView) objArr[1], (TextView) objArr[7]);
        this.f40238m = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40234i = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.f40235j = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[3];
        this.f40236k = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f40237l = relativeLayout3;
        relativeLayout3.setTag(null);
        this.f40228e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40238m |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40238m |= 2;
        }
        return true;
    }

    public final boolean c(ObservableList<e> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40238m |= 1;
        }
        return true;
    }

    public void d(@Nullable HomeRecommendMultipleListAdapter homeRecommendMultipleListAdapter) {
        this.f40231h = homeRecommendMultipleListAdapter;
    }

    public void e(@Nullable HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel) {
        this.f40230g = homeRecommendMultipleListViewModel;
        synchronized (this) {
            this.f40238m |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        Boolean bool;
        Boolean bool2;
        c<e> cVar;
        ObservableList observableList;
        c<e> cVar2;
        synchronized (this) {
            j10 = this.f40238m;
            this.f40238m = 0L;
        }
        HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel = this.f40230g;
        if ((55 & j10) != 0) {
            if ((j10 & 49) != 0) {
                if (homeRecommendMultipleListViewModel != null) {
                    observableList = homeRecommendMultipleListViewModel.f41889s;
                    cVar2 = homeRecommendMultipleListViewModel.f41890t;
                } else {
                    observableList = null;
                    cVar2 = null;
                }
                updateRegistration(0, observableList);
            } else {
                observableList = null;
                cVar2 = null;
            }
            if ((j10 & 50) == 0) {
                bool = null;
            } else {
                ObservableField<Boolean> observableField = homeRecommendMultipleListViewModel != null ? homeRecommendMultipleListViewModel.f41881k : null;
                updateRegistration(1, observableField);
                if (observableField != null) {
                    bool = observableField.get();
                } else {
                    bool = null;
                }
            }
            if ((j10 & 52) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField2 = homeRecommendMultipleListViewModel != null ? homeRecommendMultipleListViewModel.f41880j : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    bool2 = observableField2.get();
                } else {
                    bool2 = null;
                }
            }
            bVar = ((j10 & 48) == 0 || homeRecommendMultipleListViewModel == null) ? null : homeRecommendMultipleListViewModel.f41891u;
            cVar = cVar2;
        } else {
            bVar = null;
            bool = null;
            bool2 = null;
            cVar = null;
            observableList = null;
        }
        if ((j10 & 50) != 0) {
            a.a(this.f40235j, bool);
        }
        if ((48 & j10) != 0) {
            a.b(this.f40236k, bVar, false);
        }
        if ((j10 & 52) != 0) {
            a.a(this.f40237l, bool2);
        }
        if ((32 & j10) != 0) {
            ViewAdapter.a(this.f40228e, null);
            ViewAdapter.b(this.f40228e, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.d(2, 1));
        }
        if ((j10 & 49) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40228e, cVar, observableList, null, null, null, null);
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
