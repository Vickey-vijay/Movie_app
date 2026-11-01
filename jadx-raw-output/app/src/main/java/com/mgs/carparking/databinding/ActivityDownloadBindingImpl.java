package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
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
import androidx.viewpager.widget.ViewPager;
import com.fvvcl.flickverse.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.DOWNLOADVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityDownloadBindingImpl extends ActivityDownloadBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39750l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39753j;

    public ActivityDownloadBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f39749k, f39750l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39753j != 0) {
                return true;
            }
            return this.f39743b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39753j = 64L;
        }
        this.f39743b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((DOWNLOADVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f39749k = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"actionbar_back"}, new int[]{4}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39750l = sparseIntArray;
        sparseIntArray.put(R.id.tab_layout, 5);
        sparseIntArray.put(R.id.vp_content, 6);
    }

    public ActivityDownloadBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (ActionbarBackBinding) objArr[4], (TextView) objArr[2], (TextView) objArr[3], (TabLayout) objArr[5], (ViewPager) objArr[6]);
        this.f39753j = -1L;
        setContainedBinding(this.f39743b);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f39751h = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.f39752i = relativeLayout;
        relativeLayout.setTag(null);
        this.f39744c.setTag(null);
        this.f39745d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39753j |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39753j |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39753j |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39753j |= 8;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39753j |= 16;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        Boolean bool;
        String str;
        ToolbarViewModel toolbarViewModel;
        b bVar;
        String str2;
        Boolean bool2;
        b bVar2;
        Boolean bool3;
        Boolean bool4;
        ToolbarViewModel toolbarViewModel2;
        synchronized (this) {
            j10 = this.f39753j;
            this.f39753j = 0L;
        }
        DOWNLOADVIEWMODEL downloadviewmodel = this.f39748g;
        if ((123 & j10) != 0) {
            if ((j10 & 97) == 0) {
                bool3 = null;
            } else {
                ObservableField<Boolean> observableField = downloadviewmodel != null ? downloadviewmodel.f41145r : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    bool3 = observableField.get();
                } else {
                    bool3 = null;
                }
            }
            if ((j10 & 98) == 0) {
                bool4 = null;
            } else {
                ObservableField<Boolean> observableField2 = downloadviewmodel != null ? downloadviewmodel.f41144q : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    bool4 = observableField2.get();
                } else {
                    bool4 = null;
                }
            }
            if ((j10 & 96) == 0 || downloadviewmodel == null) {
                bVar = null;
                toolbarViewModel2 = null;
                bVar2 = null;
            } else {
                toolbarViewModel2 = downloadviewmodel.f42201n;
                bVar2 = downloadviewmodel.f41150w;
                bVar = downloadviewmodel.f41151x;
            }
            if ((j10 & 104) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField3 = downloadviewmodel != null ? downloadviewmodel.f41142o : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    str2 = observableField3.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 112) == 0) {
                bool2 = bool3;
                bool = bool4;
                toolbarViewModel = toolbarViewModel2;
                str = null;
            } else {
                ObservableField<String> observableField4 = downloadviewmodel != null ? downloadviewmodel.f41143p : null;
                updateRegistration(4, observableField4);
                if (observableField4 != null) {
                    bool2 = bool3;
                    str = observableField4.get();
                    bool = bool4;
                    toolbarViewModel = toolbarViewModel2;
                } else {
                    bool2 = bool3;
                    bool = bool4;
                    toolbarViewModel = toolbarViewModel2;
                    str = null;
                }
            }
        } else {
            bool = null;
            str = null;
            toolbarViewModel = null;
            bVar = null;
            str2 = null;
            bool2 = null;
            bVar2 = null;
        }
        if ((j10 & 96) != 0) {
            this.f39743b.a(toolbarViewModel);
            a.b(this.f39744c, bVar2, false);
            a.b(this.f39745d, bVar, false);
        }
        if ((104 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39744c, str2);
        }
        if ((98 & j10) != 0) {
            a.a(this.f39744c, bool);
        }
        if ((112 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39745d, str);
        }
        if ((j10 & 97) != 0) {
            a.a(this.f39745d, bool2);
        }
        ViewDataBinding.executeBindingsOn(this.f39743b);
    }

    public void f(@Nullable DOWNLOADVIEWMODEL downloadviewmodel) {
        this.f39748g = downloadviewmodel;
        synchronized (this) {
            this.f39753j |= 32;
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
            return b((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return a((ActionbarBackBinding) obj, i11);
        }
        if (i10 == 3) {
            return d((ObservableField) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return e((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39743b.setLifecycleOwner(lifecycleOwner);
    }
}
