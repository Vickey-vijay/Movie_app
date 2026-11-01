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
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.ranklist.RankContentListViewModel;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import fm.c;
import sl.e;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes11.dex */
public class FragmentRankContentListBindingImpl extends FragmentRankContentListBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40270n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40271o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Button f40274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40277m;

    public FragmentRankContentListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f40270n, f40271o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40277m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40277m = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((RankContentListViewModel) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40271o = sparseIntArray;
        sparseIntArray.put(R.id.refresh_layout, 6);
        sparseIntArray.put(R.id.header, 7);
        sparseIntArray.put(R.id.tv_empty, 8);
        sparseIntArray.put(R.id.img_loading, 9);
    }

    public FragmentRankContentListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (WaterDropHeader) objArr[7], (ImageView) objArr[9], (SmartRefreshLayout) objArr[6], (RecyclerView) objArr[1], (TextView) objArr[8]);
        this.f40277m = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40272h = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.f40273i = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[3];
        this.f40274j = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f40275k = relativeLayout3;
        relativeLayout3.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[5];
        this.f40276l = relativeLayout4;
        relativeLayout4.setTag(null);
        this.f40267e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40277m |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40277m |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40277m |= 2;
        }
        return true;
    }

    public final boolean d(ObservableList<e> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40277m |= 1;
        }
        return true;
    }

    public void e(@Nullable RankContentListViewModel rankContentListViewModel) {
        this.f40269g = rankContentListViewModel;
        synchronized (this) {
            this.f40277m |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        c<e> cVar;
        ObservableList observableList;
        ObservableList observableList2;
        c<e> cVar2;
        synchronized (this) {
            j10 = this.f40277m;
            this.f40277m = 0L;
        }
        RankContentListViewModel rankContentListViewModel = this.f40269g;
        if ((63 & j10) != 0) {
            if ((j10 & 49) != 0) {
                if (rankContentListViewModel != null) {
                    observableList2 = rankContentListViewModel.f42162u;
                    cVar2 = rankContentListViewModel.f42163v;
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
                bool3 = null;
            } else {
                ObservableField<Boolean> observableField = rankContentListViewModel != null ? rankContentListViewModel.f42154m : null;
                updateRegistration(1, observableField);
                if (observableField != null) {
                    bool3 = observableField.get();
                } else {
                    bool3 = null;
                }
            }
            if ((j10 & 52) == 0) {
                bool = null;
            } else {
                ObservableField<Boolean> observableField2 = rankContentListViewModel != null ? rankContentListViewModel.f42153l : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    bool = observableField2.get();
                } else {
                    bool = null;
                }
            }
            if ((j10 & 56) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField3 = rankContentListViewModel != null ? rankContentListViewModel.f42152k : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    bool2 = observableField3.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 48) == 0 || rankContentListViewModel == null) {
                observableList = observableList2;
                cVar = cVar2;
                bVar = null;
            } else {
                bVar = rankContentListViewModel.f42164w;
                observableList = observableList2;
                cVar = cVar2;
            }
        } else {
            bVar = null;
            bool = null;
            bool2 = null;
            bool3 = null;
            cVar = null;
            observableList = null;
        }
        if ((j10 & 50) != 0) {
            a.a(this.f40273i, bool3);
        }
        if ((48 & j10) != 0) {
            a.b(this.f40274j, bVar, false);
        }
        if ((j10 & 56) != 0) {
            a.a(this.f40275k, bool2);
        }
        if ((52 & j10) != 0) {
            a.a(this.f40276l, bool);
        }
        if ((j10 & 49) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40267e, cVar, observableList, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableList) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return a((ObservableField) obj, i11);
    }
}
