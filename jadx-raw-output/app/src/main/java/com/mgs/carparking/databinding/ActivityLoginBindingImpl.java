package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.LOGINVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes7.dex */
public class ActivityLoginBindingImpl extends ActivityLoginBinding {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39873p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39874q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f39876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f39877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f39878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InverseBindingListener f39879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InverseBindingListener f39880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f39881o;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityLoginBindingImpl.this.f39867c);
            LOGINVIEWMODEL loginviewmodel = ActivityLoginBindingImpl.this.f39872h;
            if (loginviewmodel != null) {
                ObservableField<String> observableField = loginviewmodel.f41239g;
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
            String textString = TextViewBindingAdapter.getTextString(ActivityLoginBindingImpl.this.f39868d);
            LOGINVIEWMODEL loginviewmodel = ActivityLoginBindingImpl.this.f39872h;
            if (loginviewmodel != null) {
                ObservableField<String> observableField = loginviewmodel.f41238f;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    public ActivityLoginBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f39873p, f39874q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f39881o != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39881o = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((LOGINVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39874q = sparseIntArray;
        sparseIntArray.put(R.id.iv_top, 9);
    }

    public ActivityLoginBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (Button) objArr[5], (EditText) objArr[3], (ClearableEditText) objArr[2], (ImageView) objArr[4], (ImageView) objArr[9], (TextView) objArr[8]);
        this.f39879m = new a();
        this.f39880n = new b();
        this.f39881o = -1L;
        this.f39866b.setTag(null);
        this.f39867c.setTag(null);
        this.f39868d.setTag(null);
        this.f39869e.setTag(null);
        this.f39871g.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39875i = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f39876j = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f39877k = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.f39878l = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39881o |= 2;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39881o |= 1;
        }
        return true;
    }

    public void c(@Nullable LOGINVIEWMODEL loginviewmodel) {
        this.f39872h = loginviewmodel;
        synchronized (this) {
            this.f39881o |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        String str;
        ul.b bVar;
        ul.b bVar2;
        String str2;
        ul.b bVar3;
        ul.b bVar4;
        ul.b bVar5;
        ul.b bVar6;
        synchronized (this) {
            j10 = this.f39881o;
            this.f39881o = 0L;
        }
        LOGINVIEWMODEL loginviewmodel = this.f39872h;
        if ((15 & j10) != 0) {
            if ((j10 & 12) == 0 || loginviewmodel == null) {
                bVar = null;
                bVar2 = null;
                bVar3 = null;
                bVar4 = null;
                bVar5 = null;
                bVar6 = null;
            } else {
                bVar = loginviewmodel.f41242j;
                bVar6 = loginviewmodel.f41246n;
                bVar5 = loginviewmodel.f41241i;
                bVar3 = loginviewmodel.f41244l;
                bVar4 = loginviewmodel.f41245m;
                bVar2 = loginviewmodel.f41243k;
            }
            if ((j10 & 13) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField = loginviewmodel != null ? loginviewmodel.f41238f : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str2 = observableField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 14) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField2 = loginviewmodel != null ? loginviewmodel.f41239g : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str = observableField2.get();
                } else {
                    str = null;
                }
            }
            j11 = 12;
        } else {
            j11 = 12;
            str = null;
            bVar = null;
            bVar2 = null;
            str2 = null;
            bVar3 = null;
            bVar4 = null;
            bVar5 = null;
            bVar6 = null;
        }
        if ((j11 & j10) != 0) {
            xl.a.b(this.f39866b, bVar4, false);
            xl.a.b(this.f39869e, bVar5, false);
            xl.a.b(this.f39871g, bVar6, false);
            xl.a.b(this.f39876j, bVar, false);
            xl.a.b(this.f39877k, bVar2, false);
            xl.a.b(this.f39878l, bVar3, false);
        }
        if ((14 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39867c, str);
        }
        if ((8 & j10) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.f39867c, null, null, null, this.f39879m);
            TextViewBindingAdapter.setTextWatcher(this.f39868d, null, null, null, this.f39880n);
        }
        if ((j10 & 13) != 0) {
            TextViewBindingAdapter.setText(this.f39868d, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return a((ObservableField) obj, i11);
    }
}
