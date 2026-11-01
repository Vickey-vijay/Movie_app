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
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.model.DOWNLOADCOMPLETEVIEWMODEL;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;
import ul.b;
import w9.c1;

/* JADX INFO: loaded from: classes6.dex */
public class FragmentDownloadCompleteBindingImpl extends FragmentDownloadCompleteBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40146l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40147m = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f40153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f40154k;

    public FragmentDownloadCompleteBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f40146l, f40147m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40154k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40154k = 128L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        g((DOWNLOADCOMPLETEVIEWMODEL) obj);
        return true;
    }

    public FragmentDownloadCompleteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (TextView) objArr[3], (TextView) objArr[4]);
        this.f40154k = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40148e = relativeLayout;
        relativeLayout.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[1];
        this.f40149f = recyclerView;
        recyclerView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f40150g = textView;
        textView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[5];
        this.f40151h = linearLayout;
        linearLayout.setTag(null);
        TextView textView2 = (TextView) objArr[6];
        this.f40152i = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[7];
        this.f40153j = textView3;
        textView3.setTag(null);
        this.f40143b.setTag(null);
        this.f40144c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40154k |= 16;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40154k |= 32;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40154k |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40154k |= 4;
        }
        return true;
    }

    public final boolean e(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40154k |= 8;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        String str2;
        Boolean bool;
        b bVar;
        b bVar2;
        boolean z10;
        String str3;
        c<c1> cVar;
        ObservableList observableList;
        ObservableList observableList2;
        c<c1> cVar2;
        Boolean bool2;
        synchronized (this) {
            j10 = this.f40154k;
            this.f40154k = 0L;
        }
        DOWNLOADCOMPLETEVIEWMODEL downloadcompleteviewmodel = this.f40145d;
        if ((255 & j10) != 0) {
            if ((j10 & 193) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField = downloadcompleteviewmodel != null ? downloadcompleteviewmodel.f41108i : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str2 = observableField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 194) != 0) {
                if (downloadcompleteviewmodel != null) {
                    cVar2 = downloadcompleteviewmodel.f41112m;
                    observableList2 = downloadcompleteviewmodel.f41111l;
                } else {
                    observableList2 = null;
                    cVar2 = null;
                }
                updateRegistration(1, observableList2);
            } else {
                observableList2 = null;
                cVar2 = null;
            }
            if ((j10 & 192) == 0 || downloadcompleteviewmodel == null) {
                bVar = null;
                bVar2 = null;
            } else {
                bVar = downloadcompleteviewmodel.f41114o;
                bVar2 = downloadcompleteviewmodel.f41113n;
            }
            if ((j10 & 196) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField2 = downloadcompleteviewmodel != null ? downloadcompleteviewmodel.f41109j : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    bool2 = observableField2.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 200) == 0) {
                z10 = false;
            } else {
                ObservableBoolean observableBoolean = downloadcompleteviewmodel != null ? downloadcompleteviewmodel.f41107h : null;
                updateRegistration(3, observableBoolean);
                if (observableBoolean != null) {
                    z10 = observableBoolean.get();
                } else {
                    z10 = false;
                }
            }
            if ((j10 & 208) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField3 = downloadcompleteviewmodel != null ? downloadcompleteviewmodel.f41105f : null;
                updateRegistration(4, observableField3);
                if (observableField3 != null) {
                    str3 = observableField3.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 224) == 0) {
                observableList = observableList2;
                cVar = cVar2;
                bool = bool2;
                str = null;
            } else {
                ObservableField<String> observableField4 = downloadcompleteviewmodel != null ? downloadcompleteviewmodel.f41106g : null;
                updateRegistration(5, observableField4);
                if (observableField4 != null) {
                    str = observableField4.get();
                    observableList = observableList2;
                    cVar = cVar2;
                    bool = bool2;
                } else {
                    observableList = observableList2;
                    cVar = cVar2;
                    bool = bool2;
                    str = null;
                }
            }
        } else {
            str = null;
            str2 = null;
            bool = null;
            bVar = null;
            bVar2 = null;
            z10 = false;
            str3 = null;
            cVar = null;
            observableList = null;
        }
        if ((128 & j10) != 0) {
            ViewAdapter.b(this.f40149f, a.b());
        }
        if ((j10 & 194) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40149f, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 196) != 0) {
            xl.a.a(this.f40150g, bool);
        }
        if ((200 & j10) != 0) {
            xl.a.a(this.f40151h, Boolean.valueOf(z10));
        }
        if ((j10 & 193) != 0) {
            TextViewBindingAdapter.setText(this.f40152i, str2);
        }
        if ((192 & j10) != 0) {
            xl.a.b(this.f40152i, bVar2, false);
            xl.a.b(this.f40153j, bVar, false);
        }
        if ((208 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40143b, str3);
        }
        if ((j10 & 224) != 0) {
            TextViewBindingAdapter.setText(this.f40144c, str);
        }
    }

    public final boolean f(ObservableArrayList<c1> observableArrayList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40154k |= 2;
        }
        return true;
    }

    public void g(@Nullable DOWNLOADCOMPLETEVIEWMODEL downloadcompleteviewmodel) {
        this.f40145d = downloadcompleteviewmodel;
        synchronized (this) {
            this.f40154k |= 64;
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
            return f((ObservableArrayList) obj, i11);
        }
        if (i10 == 2) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return e((ObservableBoolean) obj, i11);
        }
        if (i10 == 4) {
            return a((ObservableField) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }
}
