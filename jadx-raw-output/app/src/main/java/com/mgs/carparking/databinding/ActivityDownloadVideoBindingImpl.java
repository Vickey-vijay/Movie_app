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
import com.mgs.carparking.model.DOWNLOADVIDEOVIEWMODEL;
import com.mgs.carparking.model.a;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;

/* JADX INFO: loaded from: classes11.dex */
public class ActivityDownloadVideoBindingImpl extends ActivityDownloadVideoBinding {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39769m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39770n = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f39773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f39775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f39776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f39777l;

    public ActivityDownloadVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f39769m, f39770n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f39777l != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39777l = 256L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        h((DOWNLOADVIDEOVIEWMODEL) obj);
        return true;
    }

    public ActivityDownloadVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (RecyclerView) objArr[2], (TextView) objArr[4], (TextView) objArr[5]);
        this.f39777l = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39771f = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f39772g = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f39773h = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[6];
        this.f39774i = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.f39775j = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.f39776k = textView3;
        textView3.setTag(null);
        this.f39765b.setTag(null);
        this.f39766c.setTag(null);
        this.f39767d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39777l |= 32;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39777l |= 64;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39777l |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39777l |= 2;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39777l |= 8;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        String str;
        b bVar2;
        Boolean bool;
        Boolean bool2;
        boolean z10;
        c<a> cVar;
        ObservableList observableList;
        String str2;
        String str3;
        b bVar3;
        Boolean bool3;
        String str4;
        synchronized (this) {
            j10 = this.f39777l;
            this.f39777l = 0L;
        }
        DOWNLOADVIDEOVIEWMODEL downloadvideoviewmodel = this.f39768e;
        if ((511 & j10) != 0) {
            if ((j10 & 385) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField = downloadvideoviewmodel != null ? downloadvideoviewmodel.f41120g : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str = observableField.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 384) == 0 || downloadvideoviewmodel == null) {
                bVar2 = null;
                bVar3 = null;
            } else {
                bVar3 = downloadvideoviewmodel.A;
                bVar2 = downloadvideoviewmodel.f41139z;
            }
            if ((j10 & 400) != 0) {
                if (downloadvideoviewmodel != null) {
                    cVar = downloadvideoviewmodel.f41136w;
                    observableList = downloadvideoviewmodel.f41135v;
                } else {
                    cVar = null;
                    observableList = null;
                }
                updateRegistration(4, observableList);
            } else {
                cVar = null;
                observableList = null;
            }
            if ((j10 & 386) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField2 = downloadvideoviewmodel != null ? downloadvideoviewmodel.f41125l : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    bool2 = observableField2.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 388) == 0) {
                z10 = false;
            } else {
                ObservableBoolean observableBoolean = downloadvideoviewmodel != null ? downloadvideoviewmodel.f41119f : null;
                updateRegistration(2, observableBoolean);
                if (observableBoolean != null) {
                    z10 = observableBoolean.get();
                } else {
                    z10 = false;
                }
            }
            if ((j10 & 392) == 0) {
                bool3 = null;
            } else {
                ObservableField<Boolean> observableField3 = downloadvideoviewmodel != null ? downloadvideoviewmodel.f41126m : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    bool3 = observableField3.get();
                } else {
                    bool3 = null;
                }
            }
            if ((j10 & 416) == 0) {
                str4 = null;
            } else {
                ObservableField<String> observableField4 = downloadvideoviewmodel != null ? downloadvideoviewmodel.f41122i : null;
                updateRegistration(5, observableField4);
                if (observableField4 != null) {
                    str4 = observableField4.get();
                } else {
                    str4 = null;
                }
            }
            if ((j10 & 448) == 0) {
                bVar = bVar3;
                bool = bool3;
                str3 = str4;
                str2 = null;
            } else {
                ObservableField<String> observableField5 = downloadvideoviewmodel != null ? downloadvideoviewmodel.f41123j : null;
                updateRegistration(6, observableField5);
                if (observableField5 != null) {
                    str3 = str4;
                    str2 = observableField5.get();
                    bVar = bVar3;
                    bool = bool3;
                } else {
                    bVar = bVar3;
                    bool = bool3;
                    str3 = str4;
                    str2 = null;
                }
            }
        } else {
            bVar = null;
            str = null;
            bVar2 = null;
            bool = null;
            bool2 = null;
            z10 = false;
            cVar = null;
            observableList = null;
            str2 = null;
            str3 = null;
        }
        if ((j10 & 392) != 0) {
            xl.a.a(this.f39772g, bool);
        }
        if ((j10 & 386) != 0) {
            xl.a.a(this.f39773h, bool2);
        }
        if ((388 & j10) != 0) {
            xl.a.a(this.f39774i, Boolean.valueOf(z10));
        }
        if ((j10 & 385) != 0) {
            TextViewBindingAdapter.setText(this.f39775j, str);
        }
        if ((384 & j10) != 0) {
            xl.a.b(this.f39775j, bVar2, false);
            xl.a.b(this.f39776k, bVar, false);
        }
        if ((256 & j10) != 0) {
            ViewAdapter.b(this.f39765b, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
        }
        if ((400 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f39765b, cVar, observableList, null, null, null, null);
        }
        if ((416 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39766c, str3);
        }
        if ((j10 & 448) != 0) {
            TextViewBindingAdapter.setText(this.f39767d, str2);
        }
    }

    public final boolean f(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39777l |= 4;
        }
        return true;
    }

    public final boolean g(ObservableArrayList<a> observableArrayList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39777l |= 16;
        }
        return true;
    }

    public void h(@Nullable DOWNLOADVIDEOVIEWMODEL downloadvideoviewmodel) {
        this.f39768e = downloadvideoviewmodel;
        synchronized (this) {
            this.f39777l |= 128;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return c((ObservableField) obj, i11);
            case 1:
                return d((ObservableField) obj, i11);
            case 2:
                return f((ObservableBoolean) obj, i11);
            case 3:
                return e((ObservableField) obj, i11);
            case 4:
                return g((ObservableArrayList) obj, i11);
            case 5:
                return a((ObservableField) obj, i11);
            case 6:
                return b((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
