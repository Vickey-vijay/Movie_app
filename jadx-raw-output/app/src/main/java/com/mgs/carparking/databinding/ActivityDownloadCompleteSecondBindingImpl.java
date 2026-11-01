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
import com.mgs.carparking.model.DOWNLOADCOMPLETESECONDVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import w9.f1;
import xl.a;

/* JADX INFO: loaded from: classes11.dex */
public class ActivityDownloadCompleteSecondBindingImpl extends ActivityDownloadCompleteSecondBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39757l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f39760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f39762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f39763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39764j;

    public ActivityDownloadCompleteSecondBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f39756k, f39757l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39764j != 0) {
                return true;
            }
            return this.f39754b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39764j = 32L;
        }
        this.f39754b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((DOWNLOADCOMPLETESECONDVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f39756k = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"actionbar_back"}, new int[]{6}, new int[]{R.layout.actionbar_back});
        f39757l = null;
    }

    public ActivityDownloadCompleteSecondBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ActionbarBackBinding) objArr[6]);
        this.f39764j = -1L;
        setContainedBinding(this.f39754b);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39758d = relativeLayout;
        relativeLayout.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[1];
        this.f39759e = recyclerView;
        recyclerView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f39760f = textView;
        textView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[3];
        this.f39761g = linearLayout;
        linearLayout.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f39762h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[5];
        this.f39763i = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39764j |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39764j |= 1;
        }
        return true;
    }

    public final boolean c(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39764j |= 8;
        }
        return true;
    }

    public final boolean d(ObservableArrayList<f1> observableArrayList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39764j |= 2;
        }
        return true;
    }

    public void e(@Nullable DOWNLOADCOMPLETESECONDVIEWMODEL downloadcompletesecondviewmodel) {
        this.f39755c = downloadcompletesecondviewmodel;
        synchronized (this) {
            this.f39764j |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        boolean z10;
        b bVar;
        int i10;
        String str;
        b bVar2;
        ToolbarViewModel toolbarViewModel;
        c<f1> cVar;
        ObservableArrayList<f1> observableArrayList;
        String str2;
        ToolbarViewModel toolbarViewModel2;
        b bVar3;
        synchronized (this) {
            j10 = this.f39764j;
            this.f39764j = 0L;
        }
        DOWNLOADCOMPLETESECONDVIEWMODEL downloadcompletesecondviewmodel = this.f39755c;
        if ((59 & j10) != 0) {
            if ((j10 & 49) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField = downloadcompletesecondviewmodel != null ? downloadcompletesecondviewmodel.f41099q : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str2 = observableField.get();
                } else {
                    str2 = null;
                }
            }
            long j12 = j10 & 50;
            if (j12 != 0) {
                if (downloadcompletesecondviewmodel != null) {
                    observableArrayList = downloadcompletesecondviewmodel.f41100r;
                    cVar = downloadcompletesecondviewmodel.f41101s;
                } else {
                    observableArrayList = null;
                    cVar = null;
                }
                updateRegistration(1, observableArrayList);
                boolean z11 = (observableArrayList != null ? observableArrayList.size() : 0) == 0;
                if (j12 != 0) {
                    j10 |= z11 ? 128L : 64L;
                }
                i10 = z11 ? 0 : 8;
            } else {
                i10 = 0;
                observableArrayList = null;
                cVar = null;
            }
            if ((j10 & 48) == 0 || downloadcompletesecondviewmodel == null) {
                toolbarViewModel2 = null;
                bVar2 = null;
                bVar3 = null;
            } else {
                toolbarViewModel2 = downloadcompletesecondviewmodel.f42201n;
                bVar3 = downloadcompletesecondviewmodel.f41102t;
                bVar2 = downloadcompletesecondviewmodel.f41103u;
            }
            if ((j10 & 56) == 0) {
                z10 = false;
            } else {
                ObservableBoolean observableBoolean = downloadcompletesecondviewmodel != null ? downloadcompletesecondviewmodel.f41097o : null;
                updateRegistration(3, observableBoolean);
                if (observableBoolean != null) {
                    z10 = observableBoolean.get();
                } else {
                    z10 = false;
                }
            }
            j11 = 48;
            ToolbarViewModel toolbarViewModel3 = toolbarViewModel2;
            str = str2;
            bVar = bVar3;
            toolbarViewModel = toolbarViewModel3;
        } else {
            j11 = 48;
            z10 = false;
            bVar = null;
            i10 = 0;
            str = null;
            bVar2 = null;
            toolbarViewModel = null;
            cVar = null;
            observableArrayList = null;
        }
        if ((j11 & j10) != 0) {
            this.f39754b.a(toolbarViewModel);
            a.b(this.f39762h, bVar2, false);
            a.b(this.f39763i, bVar, false);
        }
        if ((32 & j10) != 0) {
            ViewAdapter.b(this.f39759e, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
        }
        if ((50 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f39759e, cVar, observableArrayList, null, null, null, null);
            this.f39760f.setVisibility(i10);
        }
        if ((j10 & 56) != 0) {
            a.a(this.f39761g, Boolean.valueOf(z10));
        }
        if ((j10 & 49) != 0) {
            TextViewBindingAdapter.setText(this.f39762h, str);
        }
        ViewDataBinding.executeBindingsOn(this.f39754b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return d((ObservableArrayList) obj, i11);
        }
        if (i10 == 2) {
            return a((ActionbarBackBinding) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return c((ObservableBoolean) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39754b.setLifecycleOwner(lifecycleOwner);
    }
}
