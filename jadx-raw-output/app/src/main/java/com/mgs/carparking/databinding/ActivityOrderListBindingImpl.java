package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.ORDERLISTVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import w9.d2;
import xl.a;

/* JADX INFO: loaded from: classes10.dex */
public class ActivityOrderListBindingImpl extends ActivityOrderListBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39901l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f39904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Button f39906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39907j;

    public ActivityOrderListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f39900k, f39901l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39907j != 0) {
                return true;
            }
            return this.f39897b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39907j = 32L;
        }
        this.f39897b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((ORDERLISTVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f39900k = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"actionbar_back"}, new int[]{5}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39901l = sparseIntArray;
        sparseIntArray.put(R.id.tv_empty, 6);
    }

    public ActivityOrderListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ActionbarBackBinding) objArr[5], (TextView) objArr[6]);
        this.f39907j = -1L;
        setContainedBinding(this.f39897b);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f39902e = linearLayout;
        linearLayout.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[1];
        this.f39903f = recyclerView;
        recyclerView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f39904g = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[3];
        this.f39905h = relativeLayout;
        relativeLayout.setTag(null);
        Button button = (Button) objArr[4];
        this.f39906i = button;
        button.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39907j |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39907j |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39907j |= 2;
        }
        return true;
    }

    public final boolean d(ObservableArrayList<d2> observableArrayList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39907j |= 1;
        }
        return true;
    }

    public void e(@Nullable ORDERLISTVIEWMODEL orderlistviewmodel) {
        this.f39899d = orderlistviewmodel;
        synchronized (this) {
            this.f39907j |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        Boolean bool;
        Boolean bool2;
        b bVar;
        ToolbarViewModel toolbarViewModel;
        c<d2> cVar;
        ObservableList observableList;
        ObservableList observableList2;
        c<d2> cVar2;
        synchronized (this) {
            j10 = this.f39907j;
            this.f39907j = 0L;
        }
        ORDERLISTVIEWMODEL orderlistviewmodel = this.f39899d;
        Boolean bool3 = null;
        if ((55 & j10) != 0) {
            if ((j10 & 49) != 0) {
                if (orderlistviewmodel != null) {
                    observableList2 = orderlistviewmodel.f41309q;
                    cVar2 = orderlistviewmodel.f41310r;
                } else {
                    observableList2 = null;
                    cVar2 = null;
                }
                updateRegistration(0, observableList2);
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            if ((j10 & 48) == 0 || orderlistviewmodel == null) {
                bVar = null;
                toolbarViewModel = null;
            } else {
                toolbarViewModel = orderlistviewmodel.f42201n;
                bVar = orderlistviewmodel.f41311s;
            }
            if ((j10 & 50) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField = orderlistviewmodel != null ? orderlistviewmodel.f41307o : null;
                updateRegistration(1, observableField);
                if (observableField != null) {
                    bool2 = observableField.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 52) != 0) {
                ObservableField<Boolean> observableField2 = orderlistviewmodel != null ? orderlistviewmodel.f41308p : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    bool3 = observableField2.get();
                }
            }
            observableList = observableList2;
            cVar = cVar2;
            bool = bool3;
        } else {
            bool = null;
            bool2 = null;
            bVar = null;
            toolbarViewModel = null;
            cVar = null;
            observableList = null;
        }
        if ((48 & j10) != 0) {
            this.f39897b.a(toolbarViewModel);
            a.b(this.f39906i, bVar, false);
        }
        if ((32 & j10) != 0) {
            ViewAdapter.b(this.f39903f, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
        }
        if ((49 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f39903f, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 52) != 0) {
            a.a(this.f39904g, bool);
        }
        if ((j10 & 50) != 0) {
            a.a(this.f39905h, bool2);
        }
        ViewDataBinding.executeBindingsOn(this.f39897b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableArrayList) obj, i11);
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
        return a((ActionbarBackBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39897b.setLifecycleOwner(lifecycleOwner);
    }
}
