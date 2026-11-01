package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.REGISTERVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes9.dex */
public class ActivityRegisterBindingImpl extends ActivityRegisterBinding {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39917q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f39919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InverseBindingListener f39920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InverseBindingListener f39921m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InverseBindingListener f39922n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f39923o;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityRegisterBindingImpl.this.f39910d);
            REGISTERVIEWMODEL registerviewmodel = ActivityRegisterBindingImpl.this.f39915i;
            if (registerviewmodel != null) {
                ObservableField<String> observableField = registerviewmodel.f41316r;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    public class b implements InverseBindingListener {
        public b() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityRegisterBindingImpl.this.f39911e);
            REGISTERVIEWMODEL registerviewmodel = ActivityRegisterBindingImpl.this.f39915i;
            if (registerviewmodel != null) {
                ObservableField<String> observableField = registerviewmodel.f41317s;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    public class c implements InverseBindingListener {
        public c() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityRegisterBindingImpl.this.f39912f);
            REGISTERVIEWMODEL registerviewmodel = ActivityRegisterBindingImpl.this.f39915i;
            if (registerviewmodel != null) {
                ObservableField<String> observableField = registerviewmodel.f41315q;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    public ActivityRegisterBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f39916p, f39917q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39923o != 0) {
                return true;
            }
            return this.f39908b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39923o = 32L;
        }
        this.f39908b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((REGISTERVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f39916p = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"actionbar_back"}, new int[]{8}, new int[]{R.layout.actionbar_back});
        f39917q = null;
    }

    public ActivityRegisterBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ActionbarBackBinding) objArr[8], (Button) objArr[6], (EditText) objArr[2], (EditText) objArr[4], (ClearableEditText) objArr[1], (ImageView) objArr[3], (ImageView) objArr[5]);
        this.f39920l = new a();
        this.f39921m = new b();
        this.f39922n = new c();
        this.f39923o = -1L;
        setContainedBinding(this.f39908b);
        this.f39909c.setTag(null);
        this.f39910d.setTag(null);
        this.f39911e.setTag(null);
        this.f39912f.setTag(null);
        this.f39913g.setTag(null);
        this.f39914h.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f39918j = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[7];
        this.f39919k = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39923o |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39923o |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39923o |= 2;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39923o |= 1;
        }
        return true;
    }

    public void e(@Nullable REGISTERVIEWMODEL registerviewmodel) {
        this.f39915i = registerviewmodel;
        synchronized (this) {
            this.f39923o |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        String str;
        ul.b bVar;
        String str2;
        String str3;
        ToolbarViewModel toolbarViewModel;
        ul.b bVar2;
        ul.b bVar3;
        ul.b bVar4;
        synchronized (this) {
            j10 = this.f39923o;
            this.f39923o = 0L;
        }
        REGISTERVIEWMODEL registerviewmodel = this.f39915i;
        if ((59 & j10) != 0) {
            if ((j10 & 48) == 0 || registerviewmodel == null) {
                bVar = null;
                toolbarViewModel = null;
                bVar2 = null;
                bVar3 = null;
                bVar4 = null;
            } else {
                bVar = registerviewmodel.f41320v;
                bVar2 = registerviewmodel.f41319u;
                toolbarViewModel = registerviewmodel.f42201n;
                bVar3 = registerviewmodel.f41322x;
                bVar4 = registerviewmodel.f41321w;
            }
            if ((j10 & 49) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField = registerviewmodel != null ? registerviewmodel.f41315q : null;
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
                ObservableField<String> observableField2 = registerviewmodel != null ? registerviewmodel.f41317s : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str2 = observableField2.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 56) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField3 = registerviewmodel != null ? registerviewmodel.f41316r : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    str = observableField3.get();
                } else {
                    str = null;
                }
            }
            j11 = 48;
        } else {
            j11 = 48;
            str = null;
            bVar = null;
            str2 = null;
            str3 = null;
            toolbarViewModel = null;
            bVar2 = null;
            bVar3 = null;
            bVar4 = null;
        }
        if ((j10 & j11) != 0) {
            this.f39908b.a(toolbarViewModel);
            xl.a.b(this.f39909c, bVar4, false);
            xl.a.b(this.f39913g, bVar2, false);
            xl.a.b(this.f39914h, bVar, false);
            xl.a.b(this.f39919k, bVar3, false);
        }
        if ((56 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39910d, str);
        }
        if ((32 & j10) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.f39910d, null, null, null, this.f39920l);
            TextViewBindingAdapter.setTextWatcher(this.f39911e, null, null, null, this.f39921m);
            TextViewBindingAdapter.setTextWatcher(this.f39912f, null, null, null, this.f39922n);
        }
        if ((50 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39911e, str2);
        }
        if ((j10 & 49) != 0) {
            TextViewBindingAdapter.setText(this.f39912f, str3);
        }
        ViewDataBinding.executeBindingsOn(this.f39908b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return a((ActionbarBackBinding) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39908b.setLifecycleOwner(lifecycleOwner);
    }
}
