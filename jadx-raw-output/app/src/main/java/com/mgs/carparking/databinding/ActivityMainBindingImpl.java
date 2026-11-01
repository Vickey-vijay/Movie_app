package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
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
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.MAINVIEWMODEL;
import com.mgs.carparking.widgets.tab.TabLayout;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityMainBindingImpl extends ActivityMainBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39888l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39889m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f39892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f39893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f39894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f39895k;

    public ActivityMainBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f39888l, f39889m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f39895k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39895k = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((MAINVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39889m = sparseIntArray;
        sparseIntArray.put(R.id.mFragmentContainerLayout, 6);
        sparseIntArray.put(R.id.mTabLayout, 7);
    }

    public ActivityMainBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ImageView) objArr[2], (FrameLayout) objArr[6], (TabLayout) objArr[7]);
        this.f39895k = -1L;
        this.f39884b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39890f = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f39891g = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f39892h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f39893i = textView2;
        textView2.setTag(null);
        View view2 = (View) objArr[5];
        this.f39894j = view2;
        view2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39895k |= 2;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39895k |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39895k |= 1;
        }
        return true;
    }

    public void d(@Nullable MAINVIEWMODEL mainviewmodel) {
        this.f39887e = mainviewmodel;
        synchronized (this) {
            this.f39895k |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        Boolean bool;
        b bVar;
        String str;
        long j11;
        b bVar2;
        Boolean bool2;
        synchronized (this) {
            j10 = this.f39895k;
            this.f39895k = 0L;
        }
        MAINVIEWMODEL mainviewmodel = this.f39887e;
        Boolean bool3 = null;
        if ((31 & j10) != 0) {
            if ((j10 & 24) == 0 || mainviewmodel == null) {
                bVar = null;
                bVar2 = null;
            } else {
                bVar = mainviewmodel.f41280n;
                bVar2 = mainviewmodel.f41281o;
            }
            if ((j10 & 25) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField = mainviewmodel != null ? mainviewmodel.f41274h : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    bool2 = observableField.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 26) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField2 = mainviewmodel != null ? mainviewmodel.f41273g : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str = observableField2.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 28) != 0) {
                ObservableField<Boolean> observableField3 = mainviewmodel != null ? mainviewmodel.f41275i : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    bool3 = observableField3.get();
                }
            }
            bool = bool3;
            j11 = 24;
        } else {
            bool = null;
            bVar = null;
            str = null;
            j11 = 24;
            bVar2 = null;
            bool2 = null;
        }
        if ((j10 & j11) != 0) {
            a.b(this.f39884b, bVar, false);
            a.b(this.f39893i, bVar2, false);
        }
        if ((j10 & 25) != 0) {
            a.a(this.f39891g, bool2);
        }
        if ((26 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39892h, str);
        }
        if ((j10 & 28) != 0) {
            a.a(this.f39894j, bool);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return a((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }
}
