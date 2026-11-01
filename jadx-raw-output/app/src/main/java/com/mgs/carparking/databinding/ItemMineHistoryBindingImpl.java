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
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.model.HISTORYVIEWMODEL;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ul.b;
import w9.v1;

/* JADX INFO: loaded from: classes9.dex */
public class ItemMineHistoryBindingImpl extends ItemMineHistoryBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40824k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40825l = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CheckBox f40827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InverseBindingListener f40830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40831j;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemMineHistoryBindingImpl.this.f40827f.isChecked();
            v1 v1Var = ItemMineHistoryBindingImpl.this.f40823d;
            if (v1Var != null) {
                ObservableField<Boolean> observableField = v1Var.f73826d;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemMineHistoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f40824k, f40825l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40831j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40831j = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        f((v1) obj);
        return true;
    }

    public ItemMineHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (RoundedImageView) objArr[3], (RelativeLayout) objArr[1]);
        this.f40830i = new a();
        this.f40831j = -1L;
        this.f40821b.setTag(null);
        this.f40822c.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40826e = relativeLayout;
        relativeLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[2];
        this.f40827f = checkBox;
        checkBox.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40828g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f40829h = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40831j |= 4;
        }
        return true;
    }

    public final boolean c(VideoLookHistoryEntry videoLookHistoryEntry, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40831j |= 1;
        }
        return true;
    }

    public final boolean d(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40831j |= 8;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40831j |= 2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004a A[PHI: r2
  0x004a: PHI (r2v5 long) = (r2v0 long), (r2v7 long) binds: [B:9:0x0020, B:25:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        int i10;
        b bVar;
        String coverUrl;
        boolean zSafeUnbox;
        String name;
        b bVar2;
        synchronized (this) {
            j10 = this.f40831j;
            this.f40831j = 0L;
        }
        v1 v1Var = this.f40823d;
        if ((63 & j10) != 0) {
            long j11 = j10 & 56;
            if (j11 == 0) {
                i10 = 0;
            } else {
                HISTORYVIEWMODEL historyviewmodel = v1Var != null ? v1Var.f73827e : null;
                ObservableBoolean observableBoolean = historyviewmodel != null ? historyviewmodel.f41206o : null;
                updateRegistration(3, observableBoolean);
                boolean z10 = observableBoolean != null ? observableBoolean.get() : false;
                if (j11 != 0) {
                    j10 |= z10 ? 128L : 64L;
                }
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            }
            if ((j10 & 49) == 0) {
                coverUrl = null;
                name = null;
            } else {
                VideoLookHistoryEntry videoLookHistoryEntry = v1Var != null ? v1Var.f73824b : null;
                updateRegistration(0, videoLookHistoryEntry);
                if (videoLookHistoryEntry != null) {
                    name = videoLookHistoryEntry.getName();
                    coverUrl = videoLookHistoryEntry.getCoverUrl();
                } else {
                    coverUrl = null;
                    name = null;
                }
            }
            if ((j10 & 48) == 0 || v1Var == null) {
                bVar = null;
                bVar2 = null;
            } else {
                bVar2 = v1Var.f73828f;
                bVar = v1Var.f73829g;
            }
            if ((j10 & 50) != 0) {
                ObservableField<Boolean> observableField = v1Var != null ? v1Var.f73826d : null;
                updateRegistration(1, observableField);
                zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
            } else {
                zSafeUnbox = false;
            }
            if ((j10 & 52) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField2 = v1Var != null ? v1Var.f73825c : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    str = observableField2.get();
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
            i10 = 0;
            bVar = null;
            coverUrl = null;
            zSafeUnbox = false;
            name = null;
            bVar2 = null;
        }
        if ((49 & j10) != 0) {
            wl.a.a(this.f40821b, coverUrl, R.drawable.ic_video_default);
            TextViewBindingAdapter.setText(this.f40828g, name);
        }
        if ((56 & j10) != 0) {
            this.f40822c.setVisibility(i10);
        }
        if ((j10 & 48) != 0) {
            xl.a.b(this.f40822c, bVar2, false);
            xl.a.b(this.f40826e, bVar, false);
        }
        if ((50 & j10) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.f40827f, zSafeUnbox);
        }
        if ((32 & j10) != 0) {
            CompoundButtonBindingAdapter.setListeners(this.f40827f, null, this.f40830i);
        }
        if ((j10 & 52) != 0) {
            TextViewBindingAdapter.setText(this.f40829h, str);
        }
    }

    public void f(@Nullable v1 v1Var) {
        this.f40823d = v1Var;
        synchronized (this) {
            this.f40831j |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((VideoLookHistoryEntry) obj, i11);
        }
        if (i10 == 1) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return d((ObservableBoolean) obj, i11);
    }
}
