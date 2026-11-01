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
import ul.b;
import w9.y1;
import wl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemLookChannnelSearchResultBindingImpl extends ItemLookChannnelSearchResultBinding {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40814j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40815k = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RTextView f40817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RTextView f40818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f40820i;

    public ItemLookChannnelSearchResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f40814j, f40815k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40820i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40820i = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((y1) obj);
        return true;
    }

    public ItemLookChannnelSearchResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (RoundedImageView) objArr[1], (TextView) objArr[5]);
        this.f40820i = -1L;
        this.f40811b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40816e = linearLayout;
        linearLayout.setTag(null);
        RTextView rTextView = (RTextView) objArr[2];
        this.f40817f = rTextView;
        rTextView.setTag(null);
        RTextView rTextView2 = (RTextView) objArr[3];
        this.f40818g = rTextView2;
        rTextView2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40819h = textView;
        textView.setTag(null);
        this.f40812c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40820i |= 2;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40820i |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40820i |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40820i |= 1;
        }
        return true;
    }

    public void e(@Nullable y1 y1Var) {
        this.f40813d = y1Var;
        synchronized (this) {
            this.f40820i |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a A[PHI: r2
  0x004a: PHI (r2v3 long) = (r2v0 long), (r2v5 long) binds: [B:9:0x0020, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        int i10;
        boolean z10;
        String str2;
        String str3;
        String str4;
        String str5;
        b bVar;
        String vod_name;
        String vod_pic;
        String str6;
        RecommandVideosEntity recommandVideosEntity;
        synchronized (this) {
            j10 = this.f40820i;
            this.f40820i = 0L;
        }
        y1 y1Var = this.f40813d;
        int i11 = 0;
        if ((63 & j10) != 0) {
            long j11 = j10 & 49;
            if (j11 == 0) {
                i10 = 0;
            } else {
                ObservableField<Boolean> observableField = y1Var != null ? y1Var.f73885g : null;
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
            if ((j10 & 48) != 0) {
                if (y1Var != null) {
                    recommandVideosEntity = y1Var.f73880b;
                    bVar = y1Var.f73886h;
                } else {
                    recommandVideosEntity = null;
                    bVar = null;
                }
                if (recommandVideosEntity != null) {
                    vod_pic = recommandVideosEntity.getVod_pic();
                    int type_pid = recommandVideosEntity.getType_pid();
                    vod_name = recommandVideosEntity.getVod_name();
                    i11 = type_pid;
                } else {
                    vod_name = null;
                    vod_pic = null;
                }
                z10 = i11 != 1;
            } else {
                z10 = false;
                vod_name = null;
                bVar = null;
                vod_pic = null;
            }
            if ((j10 & 50) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField2 = y1Var != null ? y1Var.f73884f : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str3 = observableField2.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 52) == 0) {
                str6 = null;
            } else {
                ObservableField<String> observableField3 = y1Var != null ? y1Var.f73882d : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    str6 = observableField3.get();
                } else {
                    str6 = null;
                }
            }
            if ((j10 & 56) == 0) {
                str = vod_name;
                str5 = str6;
                str2 = vod_pic;
                str4 = null;
            } else {
                ObservableField<String> observableField4 = y1Var != null ? y1Var.f73883e : null;
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str5 = str6;
                    str4 = observableField4.get();
                    str = vod_name;
                    str2 = vod_pic;
                } else {
                    str = vod_name;
                    str5 = str6;
                    str2 = vod_pic;
                    str4 = null;
                }
            }
        } else {
            str = null;
            i10 = 0;
            z10 = false;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            bVar = null;
        }
        if ((48 & j10) != 0) {
            a.a(this.f40811b, str2, R.drawable.ic_video_default);
            xl.a.b(this.f40816e, bVar, false);
            xl.a.a(this.f40819h, Boolean.valueOf(z10));
            TextViewBindingAdapter.setText(this.f40812c, str);
        }
        if ((50 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40817f, str3);
        }
        if ((49 & j10) != 0) {
            this.f40817f.setVisibility(i10);
        }
        if ((56 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40818g, str4);
        }
        if ((j10 & 52) != 0) {
            TextViewBindingAdapter.setText(this.f40819h, str5);
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
