package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.FEEDBACKRECORDVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import sl.e;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityFeedbackRecordBindingImpl extends ActivityFeedbackRecordBinding {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39846n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f39850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Button f39852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f39853k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f39854l;

    public ActivityFeedbackRecordBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f39845m, f39846n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39854l != 0) {
                return true;
            }
            return this.f39842b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39854l = 64L;
        }
        this.f39842b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((FEEDBACKRECORDVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f39845m = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"actionbar_back"}, new int[]{7}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39846n = sparseIntArray;
        sparseIntArray.put(R.id.tv_empty, 8);
    }

    public ActivityFeedbackRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (ActionbarBackBinding) objArr[7], (TextView) objArr[8]);
        this.f39854l = -1L;
        setContainedBinding(this.f39842b);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39847e = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f39848f = linearLayout;
        linearLayout.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[2];
        this.f39849g = recyclerView;
        recyclerView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f39850h = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[4];
        this.f39851i = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[5];
        this.f39852j = button;
        button.setTag(null);
        ImageView imageView = (ImageView) objArr[6];
        this.f39853k = imageView;
        imageView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39854l |= 16;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39854l |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39854l |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39854l |= 4;
        }
        return true;
    }

    public final boolean e(ObservableList<e> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39854l |= 2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        ToolbarViewModel toolbarViewModel;
        b bVar;
        b bVar2;
        c<e> cVar;
        ObservableList observableList;
        ObservableList observableList2;
        c<e> cVar2;
        ToolbarViewModel toolbarViewModel2;
        synchronized (this) {
            j10 = this.f39854l;
            this.f39854l = 0L;
        }
        FEEDBACKRECORDVIEWMODEL feedbackrecordviewmodel = this.f39844d;
        if ((111 & j10) != 0) {
            if ((j10 & 97) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField = feedbackrecordviewmodel != null ? feedbackrecordviewmodel.f41183q : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    bool2 = observableField.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 98) != 0) {
                if (feedbackrecordviewmodel != null) {
                    observableList2 = feedbackrecordviewmodel.f41185s;
                    cVar2 = feedbackrecordviewmodel.f41186t;
                } else {
                    observableList2 = null;
                    cVar2 = null;
                }
                updateRegistration(1, observableList2);
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            if ((j10 & 96) == 0 || feedbackrecordviewmodel == null) {
                bVar = null;
                bVar2 = null;
                toolbarViewModel2 = null;
            } else {
                toolbarViewModel2 = feedbackrecordviewmodel.f42201n;
                bVar = feedbackrecordviewmodel.f41188v;
                bVar2 = feedbackrecordviewmodel.f41187u;
            }
            if ((j10 & 100) == 0) {
                bool3 = null;
            } else {
                ObservableField<Boolean> observableField2 = feedbackrecordviewmodel != null ? feedbackrecordviewmodel.f41181o : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    bool3 = observableField2.get();
                } else {
                    bool3 = null;
                }
            }
            if ((j10 & 104) == 0) {
                observableList = observableList2;
                cVar = cVar2;
                toolbarViewModel = toolbarViewModel2;
                bool = null;
            } else {
                ObservableField<Boolean> observableField3 = feedbackrecordviewmodel != null ? feedbackrecordviewmodel.f41182p : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    bool = observableField3.get();
                    observableList = observableList2;
                    cVar = cVar2;
                    toolbarViewModel = toolbarViewModel2;
                } else {
                    observableList = observableList2;
                    cVar = cVar2;
                    toolbarViewModel = toolbarViewModel2;
                    bool = null;
                }
            }
        } else {
            bool = null;
            bool2 = null;
            bool3 = null;
            toolbarViewModel = null;
            bVar = null;
            bVar2 = null;
            cVar = null;
            observableList = null;
        }
        if ((j10 & 96) != 0) {
            this.f39842b.a(toolbarViewModel);
            a.b(this.f39852j, bVar2, false);
            a.b(this.f39853k, bVar, false);
        }
        if ((64 & j10) != 0) {
            ViewAdapter.b(this.f39849g, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
        }
        if ((98 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f39849g, cVar, observableList, null, null, null, null);
        }
        if ((104 & j10) != 0) {
            a.a(this.f39850h, bool);
        }
        if ((100 & j10) != 0) {
            a.a(this.f39851i, bool3);
        }
        if ((j10 & 97) != 0) {
            a.a(this.f39853k, bool2);
        }
        ViewDataBinding.executeBindingsOn(this.f39842b);
    }

    public void f(@Nullable FEEDBACKRECORDVIEWMODEL feedbackrecordviewmodel) {
        this.f39844d = feedbackrecordviewmodel;
        synchronized (this) {
            this.f39854l |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return e((ObservableList) obj, i11);
        }
        if (i10 == 2) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return a((ActionbarBackBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39842b.setLifecycleOwner(lifecycleOwner);
    }
}
