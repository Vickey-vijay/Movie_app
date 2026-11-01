package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
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
import com.mgs.carparking.model.DOWNLOADCOMPLETESECONDVIEWMODEL;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ul.b;
import w9.f1;

/* JADX INFO: loaded from: classes8.dex */
public class ItemDownloadCompleteSecondBindingImpl extends ItemDownloadCompleteSecondBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40346k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40347l = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CheckBox f40349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InverseBindingListener f40352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40353j;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemDownloadCompleteSecondBindingImpl.this.f40349f.isChecked();
            f1 f1Var = ItemDownloadCompleteSecondBindingImpl.this.f40345d;
            if (f1Var != null) {
                ObservableField<Boolean> observableField = f1Var.f73618f;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemDownloadCompleteSecondBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f40346k, f40347l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40353j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40353j = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((f1) obj);
        return true;
    }

    public ItemDownloadCompleteSecondBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (RelativeLayout) objArr[1], (RoundedImageView) objArr[3]);
        this.f40352i = new a();
        this.f40353j = -1L;
        this.f40343b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40348e = relativeLayout;
        relativeLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[2];
        this.f40349f = checkBox;
        checkBox.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40350g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f40351h = textView2;
        textView2.setTag(null);
        this.f40344c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40353j |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40353j |= 2;
        }
        return true;
    }

    public final boolean d(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40353j |= 4;
        }
        return true;
    }

    public void e(@Nullable f1 f1Var) {
        this.f40345d = f1Var;
        synchronized (this) {
            this.f40353j |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0049 A[PHI: r2
  0x0049: PHI (r2v5 long) = (r2v0 long), (r2v7 long) binds: [B:9:0x001e, B:25:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int i10;
        boolean zSafeUnbox;
        String str;
        String coverUrl;
        b bVar;
        b bVar2;
        String complete_name;
        ObservableField<String> observableField;
        ObservableField<Boolean> observableField2;
        Boolean bool;
        VideoDownloadEntity videoDownloadEntity;
        synchronized (this) {
            j10 = this.f40353j;
            this.f40353j = 0L;
        }
        f1 f1Var = this.f40345d;
        if ((31 & j10) != 0) {
            long j11 = j10 & 28;
            if (j11 == 0) {
                i10 = 0;
            } else {
                DOWNLOADCOMPLETESECONDVIEWMODEL downloadcompletesecondviewmodel = f1Var != null ? f1Var.f73614b : null;
                ObservableBoolean observableBoolean = downloadcompletesecondviewmodel != null ? downloadcompletesecondviewmodel.f41097o : null;
                updateRegistration(2, observableBoolean);
                boolean z10 = observableBoolean != null ? observableBoolean.get() : false;
                if (j11 != 0) {
                    j10 |= z10 ? 64L : 32L;
                }
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            }
            if ((j10 & 24) != 0) {
                if (f1Var != null) {
                    videoDownloadEntity = f1Var.f73616d;
                    bVar = f1Var.f73620h;
                    bVar2 = f1Var.f73619g;
                } else {
                    videoDownloadEntity = null;
                    bVar = null;
                    bVar2 = null;
                }
                if (videoDownloadEntity != null) {
                    complete_name = videoDownloadEntity.getComplete_name();
                    coverUrl = videoDownloadEntity.getCoverUrl();
                } else {
                    coverUrl = null;
                }
                if ((j10 & 25) != 0) {
                    if (f1Var != null) {
                        observableField2 = f1Var.f73618f;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(0, observableField2);
                    if (observableField2 != null) {
                        bool = observableField2.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox = ViewDataBinding.safeUnbox(bool);
                } else {
                    zSafeUnbox = false;
                }
                if ((j10 & 26) == 0) {
                    str = null;
                } else {
                    if (f1Var != null) {
                        observableField = f1Var.f73617e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(1, observableField);
                    if (observableField != null) {
                        str = observableField.get();
                    } else {
                        str = null;
                    }
                }
            } else {
                coverUrl = null;
                bVar = null;
                bVar2 = null;
            }
            complete_name = null;
            if ((j10 & 25) != 0) {
                if (f1Var != null) {
                    observableField2 = f1Var.f73618f;
                } else {
                    observableField2 = null;
                }
                updateRegistration(0, observableField2);
                if (observableField2 != null) {
                    bool = observableField2.get();
                } else {
                    bool = null;
                }
                zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            } else {
                zSafeUnbox = false;
            }
            if ((j10 & 26) == 0) {
                str = null;
            } else {
                if (f1Var != null) {
                    observableField = f1Var.f73617e;
                } else {
                    observableField = null;
                }
                updateRegistration(1, observableField);
                if (observableField != null) {
                    str = observableField.get();
                } else {
                    str = null;
                }
            }
        } else {
            i10 = 0;
            zSafeUnbox = false;
            str = null;
            coverUrl = null;
            bVar = null;
            bVar2 = null;
            complete_name = null;
        }
        if ((28 & j10) != 0) {
            this.f40343b.setVisibility(i10);
        }
        if ((24 & j10) != 0) {
            xl.a.b(this.f40343b, bVar, false);
            xl.a.b(this.f40348e, bVar2, false);
            TextViewBindingAdapter.setText(this.f40350g, complete_name);
            wl.a.a(this.f40344c, coverUrl, R.drawable.ic_video_default);
        }
        if ((25 & j10) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.f40349f, zSafeUnbox);
        }
        if ((16 & j10) != 0) {
            CompoundButtonBindingAdapter.setListeners(this.f40349f, null, this.f40352i);
        }
        if ((j10 & 26) != 0) {
            TextViewBindingAdapter.setText(this.f40351h, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return d((ObservableBoolean) obj, i11);
    }
}
