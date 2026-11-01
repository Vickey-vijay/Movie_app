package com.mgs.carparking.databinding;

import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
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
import com.mgs.carparking.netbean.FeedbackRecordEntry;
import com.mgs.carparking.widgets.CircularImageView;
import w9.o1;
import xl.a;

/* JADX INFO: loaded from: classes10.dex */
public class ItemFeedbackRecordBindingImpl extends ItemFeedbackRecordBinding {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40394m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40395n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f40397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CircularImageView f40399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f40402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40403l;

    public ItemFeedbackRecordBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f40394m, f40395n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40403l != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40403l = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((o1) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40395n = sparseIntArray;
        sparseIntArray.put(R.id.iv_right, 7);
        sparseIntArray.put(R.id.iv_left, 8);
    }

    public ItemFeedbackRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[8], (ImageView) objArr[7]);
        this.f40403l = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40396e = linearLayout;
        linearLayout.setTag(null);
        View view2 = (View) objArr[1];
        this.f40397f = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f40398g = textView;
        textView.setTag(null);
        CircularImageView circularImageView = (CircularImageView) objArr[3];
        this.f40399h = circularImageView;
        circularImageView.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f40400i = textView2;
        textView2.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[5];
        this.f40401j = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f40402k = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40403l |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40403l |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<SpannableStringBuilder> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40403l |= 2;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40403l |= 1;
        }
        return true;
    }

    public void e(@Nullable o1 o1Var) {
        this.f40393d = o1Var;
        synchronized (this) {
            this.f40403l |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        Boolean bool;
        String str2;
        Boolean bool2;
        SpannableStringBuilder spannableStringBuilder;
        long j11;
        String content;
        String create_at;
        Boolean bool3;
        synchronized (this) {
            j10 = this.f40403l;
            this.f40403l = 0L;
        }
        o1 o1Var = this.f40393d;
        String str3 = null;
        if ((63 & j10) != 0) {
            if ((j10 & 49) == 0) {
                bool = null;
            } else {
                ObservableField<Boolean> observableField = o1Var != null ? o1Var.f73713d : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    bool = observableField.get();
                } else {
                    bool = null;
                }
            }
            if ((j10 & 48) == 0) {
                content = null;
                create_at = null;
            } else {
                FeedbackRecordEntry feedbackRecordEntry = o1Var != null ? o1Var.f73712c : null;
                if (feedbackRecordEntry != null) {
                    create_at = feedbackRecordEntry.getCreate_at();
                    content = feedbackRecordEntry.getContent();
                } else {
                    content = null;
                    create_at = null;
                }
            }
            if ((j10 & 50) == 0) {
                spannableStringBuilder = null;
            } else {
                ObservableField<SpannableStringBuilder> observableField2 = o1Var != null ? o1Var.f73716g : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    spannableStringBuilder = observableField2.get();
                } else {
                    spannableStringBuilder = null;
                }
            }
            if ((j10 & 52) == 0) {
                bool3 = null;
            } else {
                ObservableField<Boolean> observableField3 = o1Var != null ? o1Var.f73714e : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    bool3 = observableField3.get();
                } else {
                    bool3 = null;
                }
            }
            if ((j10 & 56) != 0) {
                ObservableField<String> observableField4 = o1Var != null ? o1Var.f73715f : null;
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str3 = observableField4.get();
                }
            }
            bool2 = bool3;
            str = create_at;
            str2 = str3;
            j11 = 49;
        } else {
            str = null;
            bool = null;
            str2 = null;
            bool2 = null;
            spannableStringBuilder = null;
            j11 = 49;
            content = null;
        }
        if ((j10 & j11) != 0) {
            a.a(this.f40397f, bool);
        }
        if ((48 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40398g, str);
            TextViewBindingAdapter.setText(this.f40400i, content);
        }
        if ((j10 & 56) != 0) {
            wl.a.a(this.f40399h, str2, R.drawable.ic_avatar_login_default);
        }
        if ((52 & j10) != 0) {
            a.a(this.f40401j, bool2);
        }
        if ((50 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40402k, spannableStringBuilder);
        }
        if ((j10 & 32) != 0) {
            a.d(this.f40402k, Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return a((ObservableField) obj, i11);
    }
}
