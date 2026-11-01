package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ul.b;
import w9.y2;
import wl.a;

/* JADX INFO: loaded from: classes5.dex */
public class ItemVideoMoreListBindingImpl extends ItemVideoMoreListBinding {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40959q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40960r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final View f40962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f40963p;

    public ItemVideoMoreListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f40959q, f40960r));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40963p != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40963p = 256L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        h((y2) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40960r = sparseIntArray;
        sparseIntArray.put(R.id.rl_left, 12);
    }

    public ItemVideoMoreListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (RoundedImageView) objArr[1], (ImageView) objArr[2], (RelativeLayout) objArr[12], (TextView) objArr[8], (TextView) objArr[10], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[11]);
        this.f40963p = -1L;
        this.f40947b.setTag(null);
        this.f40948c.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40961n = relativeLayout;
        relativeLayout.setTag(null);
        View view2 = (View) objArr[3];
        this.f40962o = view2;
        view2.setTag(null);
        this.f40950e.setTag(null);
        this.f40951f.setTag(null);
        this.f40952g.setTag(null);
        this.f40953h.setTag(null);
        this.f40954i.setTag(null);
        this.f40955j.setTag(null);
        this.f40956k.setTag(null);
        this.f40957l.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40963p |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40963p |= 64;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40963p |= 16;
        }
        return true;
    }

    public final boolean d(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40963p |= 4;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40963p |= 32;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0114  */
    /* JADX WARN: Code duplicated, block: B:84:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0129  */
    /* JADX WARN: Code duplicated, block: B:89:0x012c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0134  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String vod_pic;
        b bVar;
        String str5;
        String str6;
        Drawable drawable;
        String str7;
        SpannableString spannableString;
        boolean z10;
        int i10;
        String vod_name;
        String str8;
        ObservableField<String> observableField;
        ObservableField<String> observableField2;
        ObservableField<String> observableField3;
        ObservableField<String> observableField4;
        ObservableField<SpannableString> observableField5;
        ObservableField<String> observableField6;
        RecommandVideosEntity recommandVideosEntity;
        int type_pid;
        int icon_type;
        synchronized (this) {
            j10 = this.f40963p;
            this.f40963p = 0L;
        }
        y2 y2Var = this.f40958m;
        String str9 = null;
        if ((511 & j10) != 0) {
            if ((j10 & 385) == 0) {
                str4 = null;
            } else {
                ObservableField<String> observableField7 = y2Var != null ? y2Var.f73892g : null;
                updateRegistration(0, observableField7);
                if (observableField7 != null) {
                    str4 = observableField7.get();
                } else {
                    str4 = null;
                }
            }
            long j11 = j10 & 384;
            if (j11 != 0) {
                if (y2Var != null) {
                    recommandVideosEntity = y2Var.f73887b;
                    bVar = y2Var.f73896k;
                    drawable = y2Var.f73895j;
                } else {
                    recommandVideosEntity = null;
                    bVar = null;
                    drawable = null;
                }
                if (recommandVideosEntity != null) {
                    type_pid = recommandVideosEntity.getType_pid();
                    icon_type = recommandVideosEntity.getIcon_type();
                    vod_name = recommandVideosEntity.getVod_name();
                    vod_pic = recommandVideosEntity.getVod_pic();
                } else {
                    vod_pic = null;
                    vod_name = null;
                    type_pid = 0;
                    icon_type = 0;
                }
                z10 = type_pid != 1;
                boolean z11 = icon_type == 0;
                if (j11 != 0) {
                    j10 |= z11 ? 1024L : 512L;
                }
                int i11 = z11 ? 8 : 0;
                if ((j10 & 386) == 0) {
                    str7 = null;
                } else {
                    if (y2Var != null) {
                        observableField6 = y2Var.f73891f;
                    } else {
                        observableField6 = null;
                    }
                    updateRegistration(1, observableField6);
                    if (observableField6 != null) {
                        str7 = observableField6.get();
                    } else {
                        str7 = null;
                    }
                }
                if ((j10 & 388) == 0) {
                    spannableString = null;
                } else {
                    if (y2Var != null) {
                        observableField5 = y2Var.f73893h;
                    } else {
                        observableField5 = null;
                    }
                    updateRegistration(2, observableField5);
                    if (observableField5 != null) {
                        spannableString = observableField5.get();
                    } else {
                        spannableString = null;
                    }
                }
                if ((j10 & 392) == 0) {
                    str5 = null;
                } else {
                    if (y2Var != null) {
                        observableField4 = y2Var.f73889d;
                    } else {
                        observableField4 = null;
                    }
                    updateRegistration(3, observableField4);
                    if (observableField4 != null) {
                        str5 = observableField4.get();
                    } else {
                        str5 = null;
                    }
                }
                if ((j10 & 400) == 0) {
                    str6 = null;
                } else {
                    if (y2Var != null) {
                        observableField3 = y2Var.f73888c;
                    } else {
                        observableField3 = null;
                    }
                    updateRegistration(4, observableField3);
                    if (observableField3 != null) {
                        str6 = observableField3.get();
                    } else {
                        str6 = null;
                    }
                }
                if ((j10 & 416) == 0) {
                    str8 = null;
                } else {
                    if (y2Var != null) {
                        observableField2 = y2Var.f73894i;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(5, observableField2);
                    if (observableField2 != null) {
                        str8 = observableField2.get();
                    } else {
                        str8 = null;
                    }
                }
                if ((j10 & 448) != 0) {
                    if (y2Var != null) {
                        observableField = y2Var.f73890e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(6, observableField);
                    if (observableField != null) {
                        str9 = observableField.get();
                    }
                }
                str3 = str8;
                str2 = str9;
                i10 = i11;
                str = vod_name;
            } else {
                vod_pic = null;
                bVar = null;
                drawable = null;
                vod_name = null;
                z10 = false;
            }
            if ((j10 & 386) == 0) {
                str7 = null;
            } else {
                if (y2Var != null) {
                    observableField6 = y2Var.f73891f;
                } else {
                    observableField6 = null;
                }
                updateRegistration(1, observableField6);
                if (observableField6 != null) {
                    str7 = observableField6.get();
                } else {
                    str7 = null;
                }
            }
            if ((j10 & 388) == 0) {
                spannableString = null;
            } else {
                if (y2Var != null) {
                    observableField5 = y2Var.f73893h;
                } else {
                    observableField5 = null;
                }
                updateRegistration(2, observableField5);
                if (observableField5 != null) {
                    spannableString = observableField5.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 392) == 0) {
                str5 = null;
            } else {
                if (y2Var != null) {
                    observableField4 = y2Var.f73889d;
                } else {
                    observableField4 = null;
                }
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str5 = observableField4.get();
                } else {
                    str5 = null;
                }
            }
            if ((j10 & 400) == 0) {
                str6 = null;
            } else {
                if (y2Var != null) {
                    observableField3 = y2Var.f73888c;
                } else {
                    observableField3 = null;
                }
                updateRegistration(4, observableField3);
                if (observableField3 != null) {
                    str6 = observableField3.get();
                } else {
                    str6 = null;
                }
            }
            if ((j10 & 416) == 0) {
                str8 = null;
            } else {
                if (y2Var != null) {
                    observableField2 = y2Var.f73894i;
                } else {
                    observableField2 = null;
                }
                updateRegistration(5, observableField2);
                if (observableField2 != null) {
                    str8 = observableField2.get();
                } else {
                    str8 = null;
                }
            }
            if ((j10 & 448) != 0) {
                if (y2Var != null) {
                    observableField = y2Var.f73890e;
                } else {
                    observableField = null;
                }
                updateRegistration(6, observableField);
                if (observableField != null) {
                    str9 = observableField.get();
                }
            }
            str3 = str8;
            str2 = str9;
            i10 = i11;
            str = vod_name;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            vod_pic = null;
            bVar = null;
            str5 = null;
            str6 = null;
            drawable = null;
            str7 = null;
            spannableString = null;
            z10 = false;
            i10 = 0;
        }
        if ((j10 & 384) != 0) {
            a.a(this.f40947b, vod_pic, R.drawable.ic_video_default);
            this.f40948c.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40948c, drawable);
            xl.a.b(this.f40961n, bVar, false);
            xl.a.a(this.f40962o, Boolean.valueOf(z10));
            xl.a.a(this.f40953h, Boolean.valueOf(z10));
            TextViewBindingAdapter.setText(this.f40956k, str);
        }
        if ((j10 & 392) != 0) {
            TextViewBindingAdapter.setText(this.f40950e, str5);
        }
        if ((448 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40951f, str2);
        }
        if ((400 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40952g, str6);
        }
        if ((416 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40953h, str3);
        }
        if ((388 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40954i, spannableString);
        }
        if ((j10 & 385) != 0) {
            TextViewBindingAdapter.setText(this.f40955j, str4);
        }
        if ((j10 & 386) != 0) {
            TextViewBindingAdapter.setText(this.f40957l, str7);
        }
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40963p |= 1;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40963p |= 2;
        }
        return true;
    }

    public void h(@Nullable y2 y2Var) {
        this.f40958m = y2Var;
        synchronized (this) {
            this.f40963p |= 128;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return f((ObservableField) obj, i11);
            case 1:
                return g((ObservableField) obj, i11);
            case 2:
                return d((ObservableField) obj, i11);
            case 3:
                return a((ObservableField) obj, i11);
            case 4:
                return c((ObservableField) obj, i11);
            case 5:
                return e((ObservableField) obj, i11);
            case 6:
                return b((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
