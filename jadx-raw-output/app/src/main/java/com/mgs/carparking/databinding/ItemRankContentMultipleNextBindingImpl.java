package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import com.ruffian.library.widget.RTextView;
import pa.f;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes10.dex */
public class ItemRankContentMultipleNextBindingImpl extends ItemRankContentMultipleNextBinding {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40871j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40872k = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RTextView f40874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RTextView f40875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f40877i;

    public ItemRankContentMultipleNextBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f40871j, f40872k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40877i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40877i = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((f) obj);
        return true;
    }

    public ItemRankContentMultipleNextBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (RoundedImageView) objArr[1], (TextView) objArr[5]);
        this.f40877i = -1L;
        this.f40868b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40873e = linearLayout;
        linearLayout.setTag(null);
        RTextView rTextView = (RTextView) objArr[2];
        this.f40874f = rTextView;
        rTextView.setTag(null);
        RTextView rTextView2 = (RTextView) objArr[3];
        this.f40875g = rTextView2;
        rTextView2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40876h = textView;
        textView.setTag(null);
        this.f40869c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40877i |= 2;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40877i |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40877i |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40877i |= 1;
        }
        return true;
    }

    public void e(@Nullable f fVar) {
        this.f40870d = fVar;
        synchronized (this) {
            this.f40877i |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a A[PHI: r2
  0x004a: PHI (r2v3 long) = (r2v0 long), (r2v5 long) binds: [B:9:0x0020, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        b bVar;
        String str5;
        String str6;
        String vod_pic;
        String vod_name;
        String str7;
        RecommandVideosEntity recommandVideosEntity;
        int type_pid;
        synchronized (this) {
            j10 = this.f40877i;
            this.f40877i = 0L;
        }
        f fVar = this.f40870d;
        if ((63 & j10) != 0) {
            long j11 = j10 & 49;
            if (j11 == 0) {
                i10 = 0;
            } else {
                ObservableField<Boolean> observableField = fVar != null ? fVar.f66096q : null;
                updateRegistration(0, observableField);
                boolean zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
                if (j11 != 0) {
                    j10 |= zSafeUnbox ? 128L : 64L;
                }
                if (zSafeUnbox) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            }
            z10 = true;
            if ((j10 & 50) == 0) {
                str6 = null;
            } else {
                ObservableField<String> observableField2 = fVar != null ? fVar.f66095p : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str6 = observableField2.get();
                } else {
                    str6 = null;
                }
            }
            if ((j10 & 48) != 0) {
                if (fVar != null) {
                    recommandVideosEntity = fVar.f66082c;
                    bVar = fVar.f66097r;
                } else {
                    bVar = null;
                    recommandVideosEntity = null;
                }
                if (recommandVideosEntity != null) {
                    type_pid = recommandVideosEntity.getType_pid();
                    vod_name = recommandVideosEntity.getVod_name();
                    vod_pic = recommandVideosEntity.getVod_pic();
                } else {
                    type_pid = 0;
                    vod_pic = null;
                    vod_name = null;
                }
                if (type_pid == 1) {
                    z10 = false;
                }
            } else {
                z10 = false;
                bVar = null;
                vod_pic = null;
                vod_name = null;
            }
            if ((j10 & 52) == 0) {
                str7 = null;
            } else {
                ObservableField<String> observableField3 = fVar != null ? fVar.f66091l : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    str7 = observableField3.get();
                } else {
                    str7 = null;
                }
            }
            if ((j10 & 56) == 0) {
                str5 = str7;
                str2 = str6;
                str4 = vod_pic;
                str = vod_name;
                str3 = null;
            } else {
                ObservableField<String> observableField4 = fVar != null ? fVar.f66093n : null;
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str3 = observableField4.get();
                    str5 = str7;
                    str2 = str6;
                    str4 = vod_pic;
                    str = vod_name;
                } else {
                    str5 = str7;
                    str2 = str6;
                    str4 = vod_pic;
                    str = vod_name;
                    str3 = null;
                }
            }
        } else {
            i10 = 0;
            z10 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            bVar = null;
            str5 = null;
        }
        if ((j10 & 48) != 0) {
            a.a(this.f40868b, str4, R.drawable.ic_video_default);
            xl.a.b(this.f40873e, bVar, false);
            xl.a.a(this.f40876h, Boolean.valueOf(z10));
            TextViewBindingAdapter.setText(this.f40869c, str);
        }
        if ((50 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40874f, str2);
        }
        if ((49 & j10) != 0) {
            this.f40874f.setVisibility(i10);
        }
        if ((56 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40875g, str3);
        }
        if ((j10 & 52) != 0) {
            TextViewBindingAdapter.setText(this.f40876h, str5);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return a((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }
}
