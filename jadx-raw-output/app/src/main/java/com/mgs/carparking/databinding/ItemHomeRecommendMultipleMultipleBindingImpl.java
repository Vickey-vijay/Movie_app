package com.mgs.carparking.databinding;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ea.a0;
import ea.g0;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes11.dex */
public class ItemHomeRecommendMultipleMultipleBindingImpl extends ItemHomeRecommendMultipleMultipleBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40764n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40765o = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f40770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f40771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f40772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f40773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40774m;

    public ItemHomeRecommendMultipleMultipleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f40764n, f40765o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40774m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40774m = 128L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        g((g0) obj);
        return true;
    }

    public ItemHomeRecommendMultipleMultipleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (RecyclerView) objArr[9], (TextView) objArr[2]);
        this.f40774m = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40766e = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.f40767f = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[3];
        this.f40768g = relativeLayout2;
        relativeLayout2.setTag(null);
        RoundedImageView roundedImageView = (RoundedImageView) objArr[4];
        this.f40769h = roundedImageView;
        roundedImageView.setTag(null);
        View view2 = (View) objArr[5];
        this.f40770i = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f40771j = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.f40772k = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.f40773l = textView3;
        textView3.setTag(null);
        this.f40761b.setTag(null);
        this.f40762c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40774m |= 32;
        }
        return true;
    }

    public final boolean b(ObservableList<a0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40774m |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40774m |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40774m |= 8;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40774m |= 16;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        String str;
        boolean z10;
        String module_name;
        Boolean bool;
        SpannableString spannableString;
        String str2;
        String str3;
        b bVar2;
        c<a0> cVar;
        ObservableList observableList;
        b bVar3;
        b bVar4;
        c<a0> cVar2;
        ObservableList observableList2;
        Boolean bool2;
        HomeMultipleEntry homeMultipleEntry;
        synchronized (this) {
            j10 = this.f40774m;
            this.f40774m = 0L;
        }
        g0 g0Var = this.f40763d;
        if ((255 & j10) != 0) {
            if ((j10 & 192) != 0) {
                if (g0Var != null) {
                    homeMultipleEntry = g0Var.f52491c;
                    bVar4 = g0Var.f52499k;
                    bVar3 = g0Var.f52500l;
                } else {
                    homeMultipleEntry = null;
                    bVar3 = null;
                    bVar4 = null;
                }
                module_name = homeMultipleEntry != null ? homeMultipleEntry.getModule_name() : null;
            } else {
                module_name = null;
                bVar3 = null;
                bVar4 = null;
            }
            if ((j10 & 196) != 0) {
                if (g0Var != null) {
                    cVar2 = g0Var.f52498j;
                    observableList2 = g0Var.f52497i;
                } else {
                    cVar2 = null;
                    observableList2 = null;
                }
                updateRegistration(2, observableList2);
            } else {
                cVar2 = null;
                observableList2 = null;
            }
            if ((j10 & 193) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField = g0Var != null ? g0Var.f52493e : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    spannableString = observableField.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 194) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField2 = g0Var != null ? g0Var.f52495g : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str2 = observableField2.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 200) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField3 = g0Var != null ? g0Var.f52494f : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    str3 = observableField3.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 208) != 0) {
                ObservableField<Boolean> observableField4 = g0Var != null ? g0Var.f52496h : null;
                updateRegistration(4, observableField4);
                bool2 = observableField4 != null ? observableField4.get() : null;
                z10 = !ViewDataBinding.safeUnbox(bool2);
            } else {
                bool2 = null;
                z10 = false;
            }
            if ((j10 & 224) == 0) {
                cVar = cVar2;
                observableList = observableList2;
                bVar = bVar4;
                bVar2 = bVar3;
                bool = bool2;
                str = null;
            } else {
                ObservableField<String> observableField5 = g0Var != null ? g0Var.f52492d : null;
                updateRegistration(5, observableField5);
                if (observableField5 != null) {
                    cVar = cVar2;
                    observableList = observableList2;
                    Boolean bool3 = bool2;
                    str = observableField5.get();
                    bVar = bVar4;
                    bVar2 = bVar3;
                    bool = bool3;
                } else {
                    cVar = cVar2;
                    observableList = observableList2;
                    bVar = bVar4;
                    bVar2 = bVar3;
                    bool = bool2;
                    str = null;
                }
            }
        } else {
            bVar = null;
            str = null;
            z10 = false;
            module_name = null;
            bool = null;
            spannableString = null;
            str2 = null;
            str3 = null;
            bVar2 = null;
            cVar = null;
            observableList = null;
        }
        if ((j10 & 192) != 0) {
            a.b(this.f40767f, bVar2, false);
            a.b(this.f40768g, bVar, false);
            TextViewBindingAdapter.setText(this.f40762c, module_name);
        }
        if ((j10 & 224) != 0) {
            wl.a.a(this.f40769h, str, R.drawable.ic_video_default_horizontal);
        }
        if ((208 & j10) != 0) {
            a.a(this.f40770i, Boolean.valueOf(z10));
            a.a(this.f40772k, bool);
            a.a(this.f40773l, Boolean.valueOf(z10));
        }
        if ((194 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40771j, str2);
        }
        if ((193 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40772k, spannableString);
        }
        if ((200 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40773l, str3);
        }
        if ((128 & j10) != 0) {
            ViewAdapter.b(this.f40761b, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(3));
        }
        if ((j10 & 196) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40761b, cVar, observableList, null, null, null, null);
        }
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40774m |= 2;
        }
        return true;
    }

    public void g(@Nullable g0 g0Var) {
        this.f40763d = g0Var;
        synchronized (this) {
            this.f40774m |= 64;
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
            return f((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return b((ObservableList) obj, i11);
        }
        if (i10 == 3) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 4) {
            return e((ObservableField) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return a((ObservableField) obj, i11);
    }
}
