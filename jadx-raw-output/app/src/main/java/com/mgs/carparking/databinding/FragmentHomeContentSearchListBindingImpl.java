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
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.HOMECONTENTSEARCHLISTVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import sl.e;
import ul.b;
import w9.w1;
import xl.a;

/* JADX INFO: loaded from: classes10.dex */
public class FragmentHomeContentSearchListBindingImpl extends FragmentHomeContentSearchListBinding {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40213t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40214u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f40217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Button f40219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f40224s;

    public FragmentHomeContentSearchListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f40213t, f40214u));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40224s != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40224s = 64L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((HOMECONTENTSEARCHLISTVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40214u = sparseIntArray;
        sparseIntArray.put(R.id.refresh_layout, 10);
        sparseIntArray.put(R.id.header, 11);
        sparseIntArray.put(R.id.tv2, 12);
        sparseIntArray.put(R.id.tv_empty, 13);
        sparseIntArray.put(R.id.tv1, 14);
        sparseIntArray.put(R.id.img_loading, 15);
    }

    public FragmentHomeContentSearchListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (WaterDropHeader) objArr[11], (ImageView) objArr[15], (SmartRefreshLayout) objArr[10], (RecyclerView) objArr[1], (TextView) objArr[14], (TextView) objArr[12], (TextView) objArr[13]);
        this.f40224s = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40215j = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.f40216k = relativeLayout2;
        relativeLayout2.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.f40217l = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f40218m = relativeLayout3;
        relativeLayout3.setTag(null);
        Button button = (Button) objArr[5];
        this.f40219n = button;
        button.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[6];
        this.f40220o = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[7];
        this.f40221p = relativeLayout5;
        relativeLayout5.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[8];
        this.f40222q = recyclerView;
        recyclerView.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[9];
        this.f40223r = relativeLayout6;
        relativeLayout6.setTag(null);
        this.f40208e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40224s |= 16;
        }
        return true;
    }

    public final boolean b(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40224s |= 4;
        }
        return true;
    }

    public final boolean c(ObservableList<e> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40224s |= 2;
        }
        return true;
    }

    public final boolean d(ObservableList<w1> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40224s |= 1;
        }
        return true;
    }

    public final boolean e(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40224s |= 8;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5 A[PHI: r2
  0x00a5: PHI (r2v3 long) = (r2v0 long), (r2v5 long) binds: [B:37:0x007f, B:50:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        b bVar2;
        b bVar3;
        c<e> cVar;
        ObservableList observableList;
        c<w1> cVar2;
        ObservableList observableList2;
        boolean z10;
        int i10;
        boolean z11;
        c<w1> cVar3;
        ObservableList observableList3;
        synchronized (this) {
            j10 = this.f40224s;
            this.f40224s = 0L;
        }
        HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel = this.f40212i;
        if ((127 & j10) != 0) {
            if ((j10 & 96) == 0 || homecontentsearchlistviewmodel == null) {
                bVar = null;
                bVar2 = null;
                bVar3 = null;
            } else {
                bVar = homecontentsearchlistviewmodel.f41233x;
                bVar2 = homecontentsearchlistviewmodel.f41234y;
                bVar3 = homecontentsearchlistviewmodel.f41235z;
            }
            if ((j10 & 98) != 0) {
                if (homecontentsearchlistviewmodel != null) {
                    cVar = homecontentsearchlistviewmodel.f41230u;
                    observableList = homecontentsearchlistviewmodel.f41229t;
                } else {
                    cVar = null;
                    observableList = null;
                }
                updateRegistration(1, observableList);
            } else {
                cVar = null;
                observableList = null;
            }
            if ((j10 & 97) != 0) {
                if (homecontentsearchlistviewmodel != null) {
                    observableList3 = homecontentsearchlistviewmodel.f41231v;
                    cVar3 = homecontentsearchlistviewmodel.f41232w;
                } else {
                    cVar3 = null;
                    observableList3 = null;
                }
                updateRegistration(0, observableList3);
            } else {
                cVar3 = null;
                observableList3 = null;
            }
            if ((j10 & 100) == 0) {
                z11 = false;
            } else {
                ObservableBoolean observableBoolean = homecontentsearchlistviewmodel != null ? homecontentsearchlistviewmodel.f41217h : null;
                updateRegistration(2, observableBoolean);
                if (observableBoolean != null) {
                    z11 = observableBoolean.get();
                } else {
                    z11 = false;
                }
            }
            long j11 = j10 & 104;
            if (j11 == 0) {
                i10 = 0;
            } else {
                ObservableBoolean observableBoolean2 = homecontentsearchlistviewmodel != null ? homecontentsearchlistviewmodel.f41216g : null;
                updateRegistration(3, observableBoolean2);
                boolean z12 = observableBoolean2 != null ? observableBoolean2.get() : false;
                if (j11 != 0) {
                    j10 |= z12 ? 256L : 128L;
                }
                if (z12) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            }
            if ((j10 & 112) == 0) {
                cVar2 = cVar3;
                observableList2 = observableList3;
                z10 = false;
            } else {
                ObservableBoolean observableBoolean3 = homecontentsearchlistviewmodel != null ? homecontentsearchlistviewmodel.f41218i : null;
                updateRegistration(4, observableBoolean3);
                if (observableBoolean3 != null) {
                    z10 = observableBoolean3.get();
                    cVar2 = cVar3;
                    observableList2 = observableList3;
                } else {
                    cVar2 = cVar3;
                    observableList2 = observableList3;
                    z10 = false;
                }
            }
        } else {
            bVar = null;
            bVar2 = null;
            bVar3 = null;
            cVar = null;
            observableList = null;
            cVar2 = null;
            observableList2 = null;
            z10 = false;
            i10 = 0;
            z11 = false;
        }
        if ((j10 & 96) != 0) {
            a.b(this.f40216k, bVar2, false);
            a.b(this.f40217l, bVar3, false);
            a.b(this.f40219n, bVar, false);
            a.b(this.f40221p, bVar2, false);
        }
        if ((100 & j10) != 0) {
            a.a(this.f40218m, Boolean.valueOf(z11));
        }
        if ((104 & j10) != 0) {
            this.f40220o.setVisibility(i10);
        }
        if ((64 & j10) != 0) {
            ViewAdapter.b(this.f40222q, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
            ViewAdapter.b(this.f40208e, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
        }
        if ((97 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40222q, cVar2, observableList2, null, null, null, null);
        }
        if ((112 & j10) != 0) {
            a.a(this.f40223r, Boolean.valueOf(z10));
        }
        if ((j10 & 98) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40208e, cVar, observableList, null, null, null, null);
        }
    }

    public void f(@Nullable HOMECONTENTSEARCHLISTVIEWMODEL homecontentsearchlistviewmodel) {
        this.f40212i = homecontentsearchlistviewmodel;
        synchronized (this) {
            this.f40224s |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableList) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableList) obj, i11);
        }
        if (i10 == 2) {
            return b((ObservableBoolean) obj, i11);
        }
        if (i10 == 3) {
            return e((ObservableBoolean) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return a((ObservableBoolean) obj, i11);
    }
}
