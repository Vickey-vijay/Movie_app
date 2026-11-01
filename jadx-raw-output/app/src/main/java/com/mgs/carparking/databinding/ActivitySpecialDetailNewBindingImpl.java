package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.SPECIALDETAILNEWVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import w9.w2;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ActivitySpecialDetailNewBindingImpl extends ActivitySpecialDetailNewBinding {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39981r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39982s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f39984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Button f39987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f39990q;

    public ActivitySpecialDetailNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f39981r, f39982s));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f39990q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39990q = 64L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((SPECIALDETAILNEWVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39982s = sparseIntArray;
        sparseIntArray.put(R.id.sortToolbar, 8);
        sparseIntArray.put(R.id.rl_title, 9);
        sparseIntArray.put(R.id.tv_empty, 10);
        sparseIntArray.put(R.id.img_loading1, 11);
        sparseIntArray.put(R.id.refresh_layout, 12);
        sparseIntArray.put(R.id.header, 13);
    }

    public ActivitySpecialDetailNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (WaterDropHeader) objArr[13], (ImageView) objArr[11], (SmartRefreshLayout) objArr[12], (RelativeLayout) objArr[9], (Toolbar) objArr[8], (TextView) objArr[2], (TextView) objArr[10]);
        this.f39990q = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39983j = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f39984k = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[3];
        this.f39985l = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f39986m = relativeLayout3;
        relativeLayout3.setTag(null);
        Button button = (Button) objArr[5];
        this.f39987n = button;
        button.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[6];
        this.f39988o = relativeLayout4;
        relativeLayout4.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[7];
        this.f39989p = recyclerView;
        recyclerView.setTag(null);
        this.f39978g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39990q |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39990q |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39990q |= 16;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39990q |= 8;
        }
        return true;
    }

    public final boolean e(ObservableList<w2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39990q |= 2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str;
        b bVar2;
        c<w2> cVar;
        ObservableList observableList;
        b bVar3;
        b bVar4;
        c<w2> cVar2;
        ObservableList observableList2;
        synchronized (this) {
            j10 = this.f39990q;
            this.f39990q = 0L;
        }
        SPECIALDETAILNEWVIEWMODEL specialdetailnewviewmodel = this.f39980i;
        if ((127 & j10) != 0) {
            if ((j10 & 96) == 0 || specialdetailnewviewmodel == null) {
                bVar3 = null;
                bVar4 = null;
            } else {
                bVar3 = specialdetailnewviewmodel.f41377x;
                bVar4 = specialdetailnewviewmodel.f41378y;
            }
            if ((j10 & 98) != 0) {
                if (specialdetailnewviewmodel != null) {
                    cVar2 = specialdetailnewviewmodel.f41376w;
                    observableList2 = specialdetailnewviewmodel.f41375v;
                } else {
                    cVar2 = null;
                    observableList2 = null;
                }
                updateRegistration(1, observableList2);
            } else {
                cVar2 = null;
                observableList2 = null;
            }
            if ((j10 & 97) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField = specialdetailnewviewmodel != null ? specialdetailnewviewmodel.f41369p : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    bool2 = observableField.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 100) == 0) {
                bool3 = null;
            } else {
                ObservableField<Boolean> observableField2 = specialdetailnewviewmodel != null ? specialdetailnewviewmodel.f41368o : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    bool3 = observableField2.get();
                } else {
                    bool3 = null;
                }
            }
            if ((j10 & 104) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField3 = specialdetailnewviewmodel != null ? specialdetailnewviewmodel.f41361h : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    str = observableField3.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 112) == 0) {
                bVar = bVar4;
                cVar = cVar2;
                observableList = observableList2;
                bVar2 = bVar3;
                bool = null;
            } else {
                ObservableField<Boolean> observableField4 = specialdetailnewviewmodel != null ? specialdetailnewviewmodel.f41367n : null;
                updateRegistration(4, observableField4);
                if (observableField4 != null) {
                    cVar = cVar2;
                    observableList = observableList2;
                    b bVar5 = bVar3;
                    bool = observableField4.get();
                    bVar = bVar4;
                    bVar2 = bVar5;
                } else {
                    bVar = bVar4;
                    cVar = cVar2;
                    observableList = observableList2;
                    bVar2 = bVar3;
                    bool = null;
                }
            }
        } else {
            bVar = null;
            bool = null;
            bool2 = null;
            bool3 = null;
            str = null;
            bVar2 = null;
            cVar = null;
            observableList = null;
        }
        if ((j10 & 96) != 0) {
            a.b(this.f39984k, bVar2, false);
            a.b(this.f39987n, bVar, false);
        }
        if ((j10 & 97) != 0) {
            a.a(this.f39985l, bool2);
        }
        if ((112 & j10) != 0) {
            a.a(this.f39986m, bool);
        }
        if ((100 & j10) != 0) {
            a.a(this.f39988o, bool3);
        }
        if ((64 & j10) != 0) {
            ViewAdapter.b(this.f39989p, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
        }
        if ((98 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f39989p, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 104) != 0) {
            TextViewBindingAdapter.setText(this.f39978g, str);
        }
    }

    public void f(@Nullable SPECIALDETAILNEWVIEWMODEL specialdetailnewviewmodel) {
        this.f39980i = specialdetailnewviewmodel;
        synchronized (this) {
            this.f39990q |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return e((ObservableList) obj, i11);
        }
        if (i10 == 2) {
            return a((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return d((ObservableField) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }
}
