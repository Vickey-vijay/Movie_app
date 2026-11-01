package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.HISTORYVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import w9.v1;
import xl.a;

/* JADX INFO: loaded from: classes8.dex */
public class ActivityHistoryBindingImpl extends ActivityHistoryBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39859l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f39861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f39863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f39864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39865j;

    public ActivityHistoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f39858k, f39859l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39865j != 0) {
                return true;
            }
            return this.f39855b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39865j = 32L;
        }
        this.f39855b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((HISTORYVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f39858k = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"actionbar_back"}, new int[]{6}, new int[]{R.layout.actionbar_back});
        f39859l = null;
    }

    public ActivityHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ActionbarBackBinding) objArr[6], (RecyclerView) objArr[1]);
        this.f39865j = -1L;
        setContainedBinding(this.f39855b);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39860e = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f39861f = textView;
        textView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[3];
        this.f39862g = linearLayout;
        linearLayout.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f39863h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[5];
        this.f39864i = textView3;
        textView3.setTag(null);
        this.f39856c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39865j |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39865j |= 1;
        }
        return true;
    }

    public final boolean c(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39865j |= 2;
        }
        return true;
    }

    public final boolean d(ObservableArrayList<v1> observableArrayList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39865j |= 4;
        }
        return true;
    }

    public void e(@Nullable HISTORYVIEWMODEL historyviewmodel) {
        this.f39857d = historyviewmodel;
        synchronized (this) {
            this.f39865j |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean z10;
        String str;
        b bVar;
        b bVar2;
        c<v1> cVar;
        ToolbarViewModel toolbarViewModel;
        int i10;
        ObservableArrayList<v1> observableArrayList;
        long j11;
        synchronized (this) {
            j10 = this.f39865j;
            this.f39865j = 0L;
        }
        HISTORYVIEWMODEL historyviewmodel = this.f39857d;
        long j12 = 48;
        if ((55 & j10) != 0) {
            if ((j10 & 49) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField = historyviewmodel != null ? historyviewmodel.f41207p : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str = observableField.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 48) == 0 || historyviewmodel == null) {
                bVar = null;
                bVar2 = null;
                toolbarViewModel = null;
            } else {
                bVar2 = historyviewmodel.f41213v;
                bVar = historyviewmodel.f41214w;
                toolbarViewModel = historyviewmodel.f42201n;
            }
            long j13 = j10 & 52;
            if (j13 != 0) {
                if (historyviewmodel != null) {
                    cVar = historyviewmodel.f41212u;
                    observableArrayList = historyviewmodel.f41211t;
                } else {
                    cVar = null;
                    observableArrayList = null;
                }
                updateRegistration(2, observableArrayList);
                boolean z11 = (observableArrayList != null ? observableArrayList.size() : 0) == 0;
                if (j13 != 0) {
                    j10 |= z11 ? 128L : 64L;
                }
                i10 = z11 ? 0 : 8;
                j11 = 50;
            } else {
                cVar = null;
                i10 = 0;
                j11 = 50;
                observableArrayList = null;
            }
            if ((j10 & j11) == 0) {
                z10 = false;
            } else {
                ObservableBoolean observableBoolean = historyviewmodel != null ? historyviewmodel.f41206o : null;
                updateRegistration(1, observableBoolean);
                if (observableBoolean != null) {
                    z10 = observableBoolean.get();
                } else {
                    z10 = false;
                }
            }
            j12 = 48;
        } else {
            z10 = false;
            str = null;
            bVar = null;
            bVar2 = null;
            cVar = null;
            toolbarViewModel = null;
            i10 = 0;
            observableArrayList = null;
        }
        if ((j12 & j10) != 0) {
            this.f39855b.a(toolbarViewModel);
            a.b(this.f39863h, bVar, false);
            a.b(this.f39864i, bVar2, false);
        }
        if ((52 & j10) != 0) {
            this.f39861f.setVisibility(i10);
            me.tatarka.bindingcollectionadapter2.a.a(this.f39856c, cVar, observableArrayList, null, null, null, null);
        }
        if ((50 & j10) != 0) {
            a.a(this.f39862g, Boolean.valueOf(z10));
        }
        if ((49 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39863h, str);
        }
        if ((j10 & 32) != 0) {
            this.f39856c.setItemAnimator(null);
            ViewAdapter.b(this.f39856c, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
        }
        ViewDataBinding.executeBindingsOn(this.f39855b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableBoolean) obj, i11);
        }
        if (i10 == 2) {
            return d((ObservableArrayList) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return a((ActionbarBackBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39855b.setLifecycleOwner(lifecycleOwner);
    }
}
