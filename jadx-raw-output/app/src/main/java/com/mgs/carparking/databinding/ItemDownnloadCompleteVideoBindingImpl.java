package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.DOWNLOADCOMPLETEVIEWMODEL;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import java.util.List;
import ul.b;
import w9.c1;

/* JADX INFO: loaded from: classes11.dex */
public class ItemDownnloadCompleteVideoBindingImpl extends ItemDownnloadCompleteVideoBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40357l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40358m = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final CheckBox f40360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InverseBindingListener f40365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f40366k;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemDownnloadCompleteVideoBindingImpl.this.f40360e.isChecked();
            c1 c1Var = ItemDownnloadCompleteVideoBindingImpl.this.f40356c;
            if (c1Var != null) {
                ObservableField<Boolean> observableField = c1Var.f73570b;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemDownnloadCompleteVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f40357l, f40358m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40366k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40366k = 64L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        g((c1) obj);
        return true;
    }

    public ItemDownnloadCompleteVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (RelativeLayout) objArr[1]);
        this.f40365j = new a();
        this.f40366k = -1L;
        this.f40355b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40359d = linearLayout;
        linearLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[2];
        this.f40360e = checkBox;
        checkBox.setTag(null);
        RoundedImageView roundedImageView = (RoundedImageView) objArr[3];
        this.f40361f = roundedImageView;
        roundedImageView.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40362g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f40363h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f40364i = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40366k |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40366k |= 16;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40366k |= 2;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40366k |= 4;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004a A[PHI: r2
  0x004a: PHI (r2v3 long) = (r2v0 long), (r2v5 long) binds: [B:9:0x0020, B:25:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int i10;
        boolean zSafeUnbox;
        String str;
        b bVar;
        String coverUrl;
        b bVar2;
        String str2;
        String str3;
        b bVar3;
        List<VideoDownloadEntity> list;
        synchronized (this) {
            j10 = this.f40366k;
            this.f40366k = 0L;
        }
        c1 c1Var = this.f40356c;
        if ((127 & j10) != 0) {
            long j11 = j10 & 104;
            if (j11 == 0) {
                i10 = 0;
            } else {
                DOWNLOADCOMPLETEVIEWMODEL downloadcompleteviewmodel = c1Var != null ? c1Var.f73571c : null;
                ObservableBoolean observableBoolean = downloadcompleteviewmodel != null ? downloadcompleteviewmodel.f41107h : null;
                updateRegistration(3, observableBoolean);
                boolean z10 = observableBoolean != null ? observableBoolean.get() : false;
                if (j11 != 0) {
                    j10 |= z10 ? 256L : 128L;
                }
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            }
            if ((j10 & 96) != 0) {
                if (c1Var != null) {
                    bVar = c1Var.f73577i;
                    list = c1Var.f73572d;
                    bVar2 = c1Var.f73578j;
                    bVar3 = c1Var.f73576h;
                } else {
                    bVar = null;
                    list = null;
                    bVar2 = null;
                    bVar3 = null;
                }
                VideoDownloadEntity videoDownloadEntity = list != null ? list.get(0) : null;
                coverUrl = videoDownloadEntity != null ? videoDownloadEntity.getCoverUrl() : null;
            } else {
                bVar = null;
                coverUrl = null;
                bVar2 = null;
                bVar3 = null;
            }
            if ((j10 & 97) != 0) {
                ObservableField<Boolean> observableField = c1Var != null ? c1Var.f73570b : null;
                updateRegistration(0, observableField);
                zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
            } else {
                zSafeUnbox = false;
            }
            if ((j10 & 98) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField2 = c1Var != null ? c1Var.f73575g : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str2 = observableField2.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 100) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField3 = c1Var != null ? c1Var.f73573e : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    str3 = observableField3.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 112) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField4 = c1Var != null ? c1Var.f73574f : null;
                updateRegistration(4, observableField4);
                if (observableField4 != null) {
                    str = observableField4.get();
                } else {
                    str = null;
                }
            }
        } else {
            i10 = 0;
            zSafeUnbox = false;
            str = null;
            bVar = null;
            coverUrl = null;
            bVar2 = null;
            str2 = null;
            str3 = null;
            bVar3 = null;
        }
        if ((j10 & 104) != 0) {
            this.f40355b.setVisibility(i10);
        }
        if ((j10 & 96) != 0) {
            xl.a.b(this.f40355b, bVar, false);
            xl.a.c(this.f40359d, bVar3);
            xl.a.b(this.f40359d, bVar2, false);
            wl.a.a(this.f40361f, coverUrl, R.drawable.ic_video_default);
        }
        if ((97 & j10) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.f40360e, zSafeUnbox);
        }
        if ((64 & j10) != 0) {
            CompoundButtonBindingAdapter.setListeners(this.f40360e, null, this.f40365j);
        }
        if ((98 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40362g, str2);
        }
        if ((112 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40363h, str);
        }
        if ((j10 & 100) != 0) {
            TextViewBindingAdapter.setText(this.f40364i, str3);
        }
    }

    public final boolean f(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40366k |= 8;
        }
        return true;
    }

    public void g(@Nullable c1 c1Var) {
        this.f40356c = c1Var;
        synchronized (this) {
            this.f40366k |= 32;
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
            return d((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return f((ObservableBoolean) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }
}
