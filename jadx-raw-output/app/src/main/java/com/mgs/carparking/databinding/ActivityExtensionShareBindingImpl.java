package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.EXTENSIONSHAREVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import com.ruffian.library.widget.RConstraintLayout;
import com.ruffian.library.widget.RTextView;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityExtensionShareBindingImpl extends ActivityExtensionShareBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39820m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f39822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f39823k;

    public ActivityExtensionShareBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f39819l, f39820m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39823k != 0) {
                return true;
            }
            return this.f39812b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39823k = 32L;
        }
        this.f39812b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((EXTENSIONSHAREVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        f39819l = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"actionbar_back"}, new int[]{5}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39820m = sparseIntArray;
        sparseIntArray.put(R.id.cl_code, 6);
        sparseIntArray.put(R.id.ll_add, 7);
    }

    public ActivityExtensionShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ActionbarBackBinding) objArr[5], (RConstraintLayout) objArr[6], (ImageView) objArr[2], (LinearLayout) objArr[7], (TextView) objArr[1], (RTextView) objArr[4]);
        this.f39823k = -1L;
        setContainedBinding(this.f39812b);
        this.f39814d.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39821i = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f39822j = textView;
        textView.setTag(null);
        this.f39816f.setTag(null);
        this.f39817g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39823k |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39823k |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39823k |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39823k |= 8;
        }
        return true;
    }

    public void e(@Nullable EXTENSIONSHAREVIEWMODEL extensionshareviewmodel) {
        this.f39818h = extensionshareviewmodel;
        synchronized (this) {
            this.f39823k |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        b bVar;
        String str2;
        long j11;
        ToolbarViewModel toolbarViewModel;
        String str3;
        synchronized (this) {
            j10 = this.f39823k;
            this.f39823k = 0L;
        }
        EXTENSIONSHAREVIEWMODEL extensionshareviewmodel = this.f39818h;
        String str4 = null;
        if ((59 & j10) != 0) {
            if ((j10 & 48) == 0 || extensionshareviewmodel == null) {
                bVar = null;
                toolbarViewModel = null;
            } else {
                bVar = extensionshareviewmodel.f41179u;
                toolbarViewModel = extensionshareviewmodel.f42201n;
            }
            if ((j10 & 49) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField = extensionshareviewmodel != null ? extensionshareviewmodel.f41177s : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str3 = observableField.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 50) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField2 = extensionshareviewmodel != null ? extensionshareviewmodel.f41176r : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str2 = observableField2.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 56) != 0) {
                ObservableField<String> observableField3 = extensionshareviewmodel != null ? extensionshareviewmodel.f41175q : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    str4 = observableField3.get();
                }
            }
            str = str4;
            j11 = 48;
        } else {
            str = null;
            bVar = null;
            str2 = null;
            j11 = 48;
            toolbarViewModel = null;
            str3 = null;
        }
        if ((j10 & j11) != 0) {
            this.f39812b.a(toolbarViewModel);
            a.b(this.f39817g, bVar, false);
        }
        if ((j10 & 56) != 0) {
            wl.a.a(this.f39814d, str, 0);
        }
        if ((j10 & 50) != 0) {
            TextViewBindingAdapter.setText(this.f39822j, str2);
        }
        if ((j10 & 49) != 0) {
            TextViewBindingAdapter.setText(this.f39816f, str3);
        }
        ViewDataBinding.executeBindingsOn(this.f39812b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return a((ActionbarBackBinding) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return d((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39812b.setLifecycleOwner(lifecycleOwner);
    }
}
