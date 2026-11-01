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
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.EDITMINEVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import com.mgs.carparking.widgets.CircularImageView;
import com.mgs.carparking.widgets.ClearableEditText;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityEditMineBindingImpl extends ActivityEditMineBinding {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39795r;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f39799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f39800p;

    public ActivityEditMineBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f39794q, f39795r));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39800p != 0) {
                return true;
            }
            return this.f39784b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39800p = 128L;
        }
        this.f39784b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        g((EDITMINEVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        f39794q = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"actionbar_back"}, new int[]{8}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39795r = sparseIntArray;
        sparseIntArray.put(R.id.tv_1, 9);
        sparseIntArray.put(R.id.tv_2, 10);
        sparseIntArray.put(R.id.tv_3, 11);
        sparseIntArray.put(R.id.tv_4, 12);
    }

    public ActivityEditMineBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (ActionbarBackBinding) objArr[8], (ClearableEditText) objArr[3], (ClearableEditText) objArr[7], (ClearableEditText) objArr[6], (CircularImageView) objArr[2], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[12]);
        this.f39800p = -1L;
        setContainedBinding(this.f39784b);
        this.f39785c.setTag(null);
        this.f39786d.setTag(null);
        this.f39787e.setTag(null);
        this.f39788f.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f39796l = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.f39797m = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[4];
        this.f39798n = relativeLayout2;
        relativeLayout2.setTag(null);
        TextView textView = (TextView) objArr[5];
        this.f39799o = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39800p |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39800p |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39800p |= 32;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39800p |= 16;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39800p |= 4;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        String str;
        b bVar2;
        ToolbarViewModel toolbarViewModel;
        String str2;
        String str3;
        String str4;
        String str5;
        b bVar3;
        ToolbarViewModel toolbarViewModel2;
        String str6;
        synchronized (this) {
            j10 = this.f39800p;
            this.f39800p = 0L;
        }
        EDITMINEVIEWMODEL editmineviewmodel = this.f39793k;
        if ((247 & j10) != 0) {
            if ((j10 & 193) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField = editmineviewmodel != null ? editmineviewmodel.f41160w : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str = observableField.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 192) == 0 || editmineviewmodel == null) {
                bVar2 = null;
                bVar3 = null;
                toolbarViewModel2 = null;
            } else {
                bVar3 = editmineviewmodel.A;
                toolbarViewModel2 = editmineviewmodel.f42201n;
                bVar2 = editmineviewmodel.f41163z;
            }
            if ((j10 & 194) == 0) {
                str6 = null;
            } else {
                ObservableField<String> observableField2 = editmineviewmodel != null ? editmineviewmodel.f41156s : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str6 = observableField2.get();
                } else {
                    str6 = null;
                }
            }
            if ((j10 & 196) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField3 = editmineviewmodel != null ? editmineviewmodel.f41158u : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    str2 = observableField3.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 208) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField4 = editmineviewmodel != null ? editmineviewmodel.f41157t : null;
                updateRegistration(4, observableField4);
                if (observableField4 != null) {
                    str3 = observableField4.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 224) == 0) {
                bVar = bVar3;
                str5 = str6;
                toolbarViewModel = toolbarViewModel2;
                str4 = null;
            } else {
                ObservableField<String> observableField5 = editmineviewmodel != null ? editmineviewmodel.f41159v : null;
                updateRegistration(5, observableField5);
                if (observableField5 != null) {
                    str5 = str6;
                    str4 = observableField5.get();
                    bVar = bVar3;
                    toolbarViewModel = toolbarViewModel2;
                } else {
                    bVar = bVar3;
                    str5 = str6;
                    toolbarViewModel = toolbarViewModel2;
                    str4 = null;
                }
            }
        } else {
            bVar = null;
            str = null;
            bVar2 = null;
            toolbarViewModel = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        if ((j10 & 192) != 0) {
            this.f39784b.a(toolbarViewModel);
            a.b(this.f39797m, bVar2, false);
            a.b(this.f39798n, bVar, false);
        }
        if ((j10 & 208) != 0) {
            TextViewBindingAdapter.setText(this.f39785c, str3);
        }
        if ((193 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39786d, str);
        }
        if ((196 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39787e, str2);
        }
        if ((224 & j10) != 0) {
            wl.a.a(this.f39788f, str4, R.drawable.ic_avatar_login_default);
        }
        if ((j10 & 194) != 0) {
            TextViewBindingAdapter.setText(this.f39799o, str5);
        }
        ViewDataBinding.executeBindingsOn(this.f39784b);
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39800p |= 2;
        }
        return true;
    }

    public void g(@Nullable EDITMINEVIEWMODEL editmineviewmodel) {
        this.f39793k = editmineviewmodel;
        synchronized (this) {
            this.f39800p |= 64;
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
            return f((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return a((ActionbarBackBinding) obj, i11);
        }
        if (i10 == 4) {
            return d((ObservableField) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39784b.setLifecycleOwner(lifecycleOwner);
    }
}
