package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes3.dex */
public class ActionbarBackBindingImpl extends ActionbarBackBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39738l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39739m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f39740k;

    public ActionbarBackBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f39738l, f39739m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f39740k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39740k = 128L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (6 != i10) {
            return false;
        }
        a((ToolbarViewModel) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39739m = sparseIntArray;
        sparseIntArray.put(R.id.iv_actionbar_back, 7);
    }

    public ActionbarBackBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (ImageView) objArr[7], (ImageView) objArr[6], (RelativeLayout) objArr[0], (LinearLayout) objArr[1], (RelativeLayout) objArr[4], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[3]);
        this.f39740k = -1L;
        this.f39730c.setTag(null);
        this.f39731d.setTag(null);
        this.f39732e.setTag(null);
        this.f39733f.setTag(null);
        this.f39734g.setTag(null);
        this.f39735h.setTag(null);
        this.f39736i.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.ActionbarBackBinding
    public void a(@Nullable ToolbarViewModel toolbarViewModel) {
        this.f39737j = toolbarViewModel;
        synchronized (this) {
            this.f39740k |= 64;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    public final boolean b(ObservableField<Drawable> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39740k |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39740k |= 16;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39740k |= 4;
        }
        return true;
    }

    public final boolean e(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39740k |= 32;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[PHI: r2
  0x0064: PHI (r2v3 long) = (r2v0 long), (r2v8 long) binds: [B:18:0x003f, B:31:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        String str;
        String str2;
        int i10;
        String str3;
        int i11;
        Drawable drawable;
        b bVar2;
        Drawable drawable2;
        synchronized (this) {
            j10 = this.f39740k;
            this.f39740k = 0L;
        }
        ToolbarViewModel toolbarViewModel = this.f39737j;
        if ((255 & j10) != 0) {
            if ((j10 & 193) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField = toolbarViewModel != null ? toolbarViewModel.f42195h : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str = observableField.get();
                } else {
                    str = null;
                }
            }
            long j11 = j10 & 194;
            if (j11 == 0) {
                i11 = 0;
            } else {
                ObservableBoolean observableBoolean = toolbarViewModel != null ? toolbarViewModel.f42197j : null;
                updateRegistration(1, observableBoolean);
                boolean z10 = observableBoolean != null ? observableBoolean.get() : false;
                if (j11 != 0) {
                    j10 |= z10 ? PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH : 1024L;
                }
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
            }
            if ((j10 & 192) == 0 || toolbarViewModel == null) {
                bVar = null;
                bVar2 = null;
            } else {
                bVar = toolbarViewModel.f42200m;
                bVar2 = toolbarViewModel.f42199l;
            }
            if ((j10 & 196) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField2 = toolbarViewModel != null ? toolbarViewModel.f42194g : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    str3 = observableField2.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 200) == 0) {
                drawable2 = null;
            } else {
                ObservableField<Drawable> observableField3 = toolbarViewModel != null ? toolbarViewModel.f42198k : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    drawable2 = observableField3.get();
                } else {
                    drawable2 = null;
                }
            }
            if ((j10 & 208) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField4 = toolbarViewModel != null ? toolbarViewModel.f42193f : null;
                updateRegistration(4, observableField4);
                if (observableField4 != null) {
                    str2 = observableField4.get();
                } else {
                    str2 = null;
                }
            }
            long j12 = j10 & 224;
            if (j12 != 0) {
                ObservableBoolean observableBoolean2 = toolbarViewModel != null ? toolbarViewModel.f42196i : null;
                updateRegistration(5, observableBoolean2);
                boolean z11 = observableBoolean2 != null ? observableBoolean2.get() : false;
                if (j12 != 0) {
                    j10 |= z11 ? 512L : 256L;
                }
                i10 = z11 ? 0 : 8;
            } else {
                i10 = 0;
            }
            drawable = drawable2;
        } else {
            bVar = null;
            str = null;
            str2 = null;
            i10 = 0;
            str3 = null;
            i11 = 0;
            drawable = null;
            bVar2 = null;
        }
        if ((j10 & 200) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.f39730c, drawable);
        }
        if ((j10 & 194) != 0) {
            this.f39731d.setVisibility(i11);
        }
        if ((192 & j10) != 0) {
            a.b(this.f39732e, bVar2, false);
            a.b(this.f39733f, bVar, false);
        }
        if ((224 & j10) != 0) {
            this.f39733f.setVisibility(i10);
        }
        if ((j10 & 193) != 0) {
            TextViewBindingAdapter.setText(this.f39734g, str);
        }
        if ((208 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39735h, str2);
        }
        if ((j10 & 196) != 0) {
            TextViewBindingAdapter.setText(this.f39736i, str3);
        }
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39740k |= 1;
        }
        return true;
    }

    public final boolean g(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39740k |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return f((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return g((ObservableBoolean) obj, i11);
        }
        if (i10 == 2) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 4) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return e((ObservableBoolean) obj, i11);
    }
}
