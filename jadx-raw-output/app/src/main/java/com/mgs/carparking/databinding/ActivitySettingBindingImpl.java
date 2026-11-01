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
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.SETTINGVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes6.dex */
public class ActivitySettingBindingImpl extends ActivitySettingBinding {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39957t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f39961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f39963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f39967r;

    public ActivitySettingBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f39956s, f39957t));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39967r != 0) {
                return true;
            }
            return this.f39949b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39967r = 32L;
        }
        this.f39949b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((SETTINGVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        f39956s = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"actionbar_back"}, new int[]{10}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39957t = sparseIntArray;
        sparseIntArray.put(R.id.iv_right, 11);
        sparseIntArray.put(R.id.iv_right1, 12);
        sparseIntArray.put(R.id.iv_right5, 13);
        sparseIntArray.put(R.id.iv_right2, 14);
    }

    public ActivitySettingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ActionbarBackBinding) objArr[10], (Button) objArr[9], (ImageView) objArr[11], (ImageView) objArr[12], (ImageView) objArr[14], (ImageView) objArr[13]);
        this.f39967r = -1L;
        setContainedBinding(this.f39949b);
        this.f39950c.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39958i = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f39959j = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.f39960k = relativeLayout2;
        relativeLayout2.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f39961l = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f39962m = relativeLayout3;
        relativeLayout3.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f39963n = textView2;
        textView2.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[6];
        this.f39964o = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[7];
        this.f39965p = relativeLayout5;
        relativeLayout5.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[8];
        this.f39966q = relativeLayout6;
        relativeLayout6.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39967r |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39967r |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39967r |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39967r |= 1;
        }
        return true;
    }

    public void e(@Nullable SETTINGVIEWMODEL settingviewmodel) {
        this.f39955h = settingviewmodel;
        synchronized (this) {
            this.f39967r |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        Boolean bool;
        String str;
        String str2;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        ToolbarViewModel toolbarViewModel;
        b bVar6;
        synchronized (this) {
            j10 = this.f39967r;
            this.f39967r = 0L;
        }
        SETTINGVIEWMODEL settingviewmodel = this.f39955h;
        Boolean bool2 = null;
        if ((55 & j10) != 0) {
            if ((j10 & 49) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField = settingviewmodel != null ? settingviewmodel.f41347o : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str = observableField.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 48) == 0 || settingviewmodel == null) {
                bVar = null;
                bVar2 = null;
                bVar3 = null;
                bVar4 = null;
                bVar5 = null;
                toolbarViewModel = null;
                bVar6 = null;
            } else {
                bVar3 = settingviewmodel.f41358z;
                bVar4 = settingviewmodel.f41357y;
                bVar6 = settingviewmodel.f41355w;
                bVar5 = settingviewmodel.f41356x;
                toolbarViewModel = settingviewmodel.f42201n;
                bVar = settingviewmodel.f41354v;
                bVar2 = settingviewmodel.A;
            }
            if ((j10 & 50) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField2 = settingviewmodel != null ? settingviewmodel.f41350r : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str2 = observableField2.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 52) != 0) {
                ObservableField<Boolean> observableField3 = settingviewmodel != null ? settingviewmodel.f41353u : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    bool2 = observableField3.get();
                }
            }
            bool = bool2;
            j11 = 48;
        } else {
            j11 = 48;
            bool = null;
            str = null;
            str2 = null;
            bVar = null;
            bVar2 = null;
            bVar3 = null;
            bVar4 = null;
            bVar5 = null;
            toolbarViewModel = null;
            bVar6 = null;
        }
        if ((j10 & j11) != 0) {
            this.f39949b.a(toolbarViewModel);
            a.b(this.f39950c, bVar4, false);
            a.b(this.f39960k, bVar6, false);
            a.b(this.f39962m, bVar, false);
            a.b(this.f39964o, bVar2, false);
            a.b(this.f39965p, bVar3, false);
            a.b(this.f39966q, bVar5, false);
        }
        if ((52 & j10) != 0) {
            a.a(this.f39950c, bool);
        }
        if ((49 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39961l, str);
        }
        if ((j10 & 50) != 0) {
            TextViewBindingAdapter.setText(this.f39963n, str2);
        }
        ViewDataBinding.executeBindingsOn(this.f39949b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return a((ActionbarBackBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39949b.setLifecycleOwner(lifecycleOwner);
    }
}
