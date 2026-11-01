package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannableString;
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
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import com.ruffian.library.widget.RTextView;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import w9.k2;
import w9.u2;
import wl.a;

/* JADX INFO: loaded from: classes11.dex */
public class ItemHomeContentSearchComicBindingImpl extends ItemHomeContentSearchComicBinding {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40556s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40557t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RTextView f40561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final ImageView f40562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f40563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f40564r;

    public ItemHomeContentSearchComicBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f40556s, f40557t));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40564r != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40564r = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        k((k2) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40557t = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 14);
    }

    public ItemHomeContentSearchComicBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 10, (RoundedImageView) objArr[2], (RelativeLayout) objArr[14], (TextView) objArr[11], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[6], (TextView) objArr[12], (TextView) objArr[7], (TextView) objArr[8]);
        this.f40564r = -1L;
        this.f40546b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40558l = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f40559m = linearLayout2;
        linearLayout2.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[13];
        this.f40560n = recyclerView;
        recyclerView.setTag(null);
        RTextView rTextView = (RTextView) objArr[3];
        this.f40561o = rTextView;
        rTextView.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.f40562p = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[5];
        this.f40563q = textView;
        textView.setTag(null);
        this.f40548d.setTag(null);
        this.f40549e.setTag(null);
        this.f40550f.setTag(null);
        this.f40551g.setTag(null);
        this.f40552h.setTag(null);
        this.f40553i.setTag(null);
        this.f40554j.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 16;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 64;
        }
        return true;
    }

    public final boolean d(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 8;
        }
        return true;
    }

    public final boolean e(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 512;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:103:0x014c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x016d  */
    /* JADX WARN: Code duplicated, block: B:113:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0180  */
    /* JADX WARN: Code duplicated, block: B:115:0x0185  */
    /* JADX WARN: Code duplicated, block: B:118:0x0190  */
    /* JADX WARN: Code duplicated, block: B:119:0x0197  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x012c  */
    /* JADX WARN: Code duplicated, block: B:94:0x012f A[PHI: r2
  0x012f: PHI (r2v5 long) = (r2v4 long), (r2v7 long) binds: [B:77:0x0101, B:91:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x013a  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        b bVar;
        String str2;
        SpannableString spannableString;
        String str3;
        SpannableString spannableString2;
        SpannableString spannableString3;
        String str4;
        Drawable drawable;
        String str5;
        c<u2> cVar;
        ObservableList observableList;
        String str6;
        boolean z10;
        int i10;
        int i11;
        String str7;
        String str8;
        b bVar2;
        String vod_pic;
        boolean z11;
        long j11;
        ObservableList observableList2;
        c<u2> cVar2;
        String str9;
        ObservableField<SpannableString> observableField;
        ObservableField<String> observableField2;
        ObservableField<String> observableField3;
        ObservableField<Boolean> observableField4;
        Boolean bool;
        boolean zSafeUnbox;
        long j12;
        ObservableField<String> observableField5;
        RecommandVideosEntity recommandVideosEntity;
        int type_pid;
        int icon_type;
        synchronized (this) {
            j10 = this.f40564r;
            this.f40564r = 0L;
        }
        k2 k2Var = this.f40555k;
        SpannableString spannableString4 = null;
        if ((4095 & j10) != 0) {
            if ((j10 & 3073) == 0) {
                str7 = null;
            } else {
                ObservableField<String> observableField6 = k2Var != null ? k2Var.f73662f : null;
                updateRegistration(0, observableField6);
                if (observableField6 != null) {
                    str7 = observableField6.get();
                } else {
                    str7 = null;
                }
            }
            if ((j10 & 3074) == 0) {
                str8 = null;
            } else {
                ObservableField<String> observableField7 = k2Var != null ? k2Var.f73664h : null;
                updateRegistration(1, observableField7);
                if (observableField7 != null) {
                    str8 = observableField7.get();
                } else {
                    str8 = null;
                }
            }
            if ((j10 & 3076) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField8 = k2Var != null ? k2Var.f73666j : null;
                updateRegistration(2, observableField8);
                if (observableField8 != null) {
                    spannableString = observableField8.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 3080) == 0) {
                spannableString3 = null;
            } else {
                ObservableField<SpannableString> observableField9 = k2Var != null ? k2Var.f73663g : null;
                updateRegistration(3, observableField9);
                if (observableField9 != null) {
                    spannableString3 = observableField9.get();
                } else {
                    spannableString3 = null;
                }
            }
            long j13 = j10 & 3072;
            if (j13 != 0) {
                if (k2Var != null) {
                    drawable = k2Var.f73667k;
                    recommandVideosEntity = k2Var.f73660d;
                    bVar2 = k2Var.f73673q;
                } else {
                    bVar2 = null;
                    recommandVideosEntity = null;
                    drawable = null;
                }
                if (recommandVideosEntity != null) {
                    type_pid = recommandVideosEntity.getType_pid();
                    vod_pic = recommandVideosEntity.getVod_pic();
                    icon_type = recommandVideosEntity.getIcon_type();
                } else {
                    vod_pic = null;
                    type_pid = 0;
                    icon_type = 0;
                }
                z11 = type_pid != 1;
                boolean z12 = icon_type == 0;
                if (j13 != 0) {
                    j10 |= z12 ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                }
                i10 = z12 ? 8 : 0;
                if ((j10 & 3088) == 0) {
                    str4 = null;
                } else {
                    if (k2Var != null) {
                        observableField5 = k2Var.f73665i;
                    } else {
                        observableField5 = null;
                    }
                    updateRegistration(4, observableField5);
                    if (observableField5 != null) {
                        str4 = observableField5.get();
                    } else {
                        str4 = null;
                    }
                }
                j11 = j10 & 3104;
                if (j11 == 0) {
                    i11 = 0;
                } else {
                    if (k2Var != null) {
                        observableField4 = k2Var.f73672p;
                    } else {
                        observableField4 = null;
                    }
                    updateRegistration(5, observableField4);
                    if (observableField4 != null) {
                        bool = observableField4.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox = ViewDataBinding.safeUnbox(bool);
                    if (j11 != 0) {
                        if (zSafeUnbox) {
                            j12 = PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        } else {
                            j12 = 16384;
                        }
                        j10 |= j12;
                    }
                    if (zSafeUnbox) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                }
                if ((j10 & 3136) == 0) {
                    str3 = null;
                } else {
                    if (k2Var != null) {
                        observableField3 = k2Var.f73671o;
                    } else {
                        observableField3 = null;
                    }
                    updateRegistration(6, observableField3);
                    if (observableField3 != null) {
                        str3 = observableField3.get();
                    } else {
                        str3 = null;
                    }
                }
                if ((j10 & 3200) != 0) {
                    if (k2Var != null) {
                        cVar2 = k2Var.f73670n;
                        observableList2 = k2Var.f73669m;
                    } else {
                        observableList2 = null;
                        cVar2 = null;
                    }
                    updateRegistration(7, observableList2);
                } else {
                    bVar2 = bVar2;
                    z11 = z11;
                    observableList2 = null;
                    cVar2 = null;
                }
                if ((j10 & 3328) != 0) {
                    if (k2Var != null) {
                        observableField2 = k2Var.f73668l;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(8, observableField2);
                    if (observableField2 != null) {
                        str9 = observableField2.get();
                    }
                    if ((j10 & 3584) != 0) {
                        if (k2Var != null) {
                            observableField = k2Var.f73661e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(9, observableField);
                        if (observableField != null) {
                            spannableString4 = observableField.get();
                        }
                    }
                    str6 = str8;
                    observableList = observableList2;
                    spannableString2 = spannableString4;
                    str = vod_pic;
                    z10 = z11;
                    cVar = cVar2;
                    str5 = str7;
                    str2 = str9;
                    bVar = bVar2;
                } else {
                    observableList2 = observableList2;
                }
                str9 = null;
                if ((j10 & 3584) != 0) {
                    if (k2Var != null) {
                        observableField = k2Var.f73661e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(9, observableField);
                    if (observableField != null) {
                        spannableString4 = observableField.get();
                    }
                }
                str6 = str8;
                observableList = observableList2;
                spannableString2 = spannableString4;
                str = vod_pic;
                z10 = z11;
                cVar = cVar2;
                str5 = str7;
                str2 = str9;
                bVar = bVar2;
            } else {
                bVar2 = null;
                drawable = null;
                vod_pic = null;
                z11 = false;
            }
            if ((j10 & 3088) == 0) {
                str4 = null;
            } else {
                if (k2Var != null) {
                    observableField5 = k2Var.f73665i;
                } else {
                    observableField5 = null;
                }
                updateRegistration(4, observableField5);
                if (observableField5 != null) {
                    str4 = observableField5.get();
                } else {
                    str4 = null;
                }
            }
            j11 = j10 & 3104;
            if (j11 == 0) {
                i11 = 0;
            } else {
                if (k2Var != null) {
                    observableField4 = k2Var.f73672p;
                } else {
                    observableField4 = null;
                }
                updateRegistration(5, observableField4);
                if (observableField4 != null) {
                    bool = observableField4.get();
                } else {
                    bool = null;
                }
                zSafeUnbox = ViewDataBinding.safeUnbox(bool);
                if (j11 != 0) {
                    if (zSafeUnbox) {
                        j12 = PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                    } else {
                        j12 = 16384;
                    }
                    j10 |= j12;
                }
                if (zSafeUnbox) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
            }
            if ((j10 & 3136) == 0) {
                str3 = null;
            } else {
                if (k2Var != null) {
                    observableField3 = k2Var.f73671o;
                } else {
                    observableField3 = null;
                }
                updateRegistration(6, observableField3);
                if (observableField3 != null) {
                    str3 = observableField3.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 3200) != 0) {
                if (k2Var != null) {
                    cVar2 = k2Var.f73670n;
                    observableList2 = k2Var.f73669m;
                } else {
                    observableList2 = null;
                    cVar2 = null;
                }
                updateRegistration(7, observableList2);
            } else {
                bVar2 = bVar2;
                z11 = z11;
                observableList2 = null;
                cVar2 = null;
            }
            if ((j10 & 3328) != 0) {
                if (k2Var != null) {
                    observableField2 = k2Var.f73668l;
                } else {
                    observableField2 = null;
                }
                updateRegistration(8, observableField2);
                if (observableField2 != null) {
                    str9 = observableField2.get();
                }
                if ((j10 & 3584) != 0) {
                    if (k2Var != null) {
                        observableField = k2Var.f73661e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(9, observableField);
                    if (observableField != null) {
                        spannableString4 = observableField.get();
                    }
                }
                str6 = str8;
                observableList = observableList2;
                spannableString2 = spannableString4;
                str = vod_pic;
                z10 = z11;
                cVar = cVar2;
                str5 = str7;
                str2 = str9;
                bVar = bVar2;
            } else {
                observableList2 = observableList2;
            }
            str9 = null;
            if ((j10 & 3584) != 0) {
                if (k2Var != null) {
                    observableField = k2Var.f73661e;
                } else {
                    observableField = null;
                }
                updateRegistration(9, observableField);
                if (observableField != null) {
                    spannableString4 = observableField.get();
                }
            }
            str6 = str8;
            observableList = observableList2;
            spannableString2 = spannableString4;
            str = vod_pic;
            z10 = z11;
            cVar = cVar2;
            str5 = str7;
            str2 = str9;
            bVar = bVar2;
        } else {
            str = null;
            bVar = null;
            str2 = null;
            spannableString = null;
            str3 = null;
            spannableString2 = null;
            spannableString3 = null;
            str4 = null;
            drawable = null;
            str5 = null;
            cVar = null;
            observableList = null;
            str6 = null;
            z10 = false;
            i10 = 0;
            i11 = 0;
        }
        if ((j10 & 3072) != 0) {
            a.a(this.f40546b, str, R.drawable.ic_video_default);
            xl.a.b(this.f40559m, bVar, false);
            this.f40562p.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40562p, drawable);
            xl.a.a(this.f40563q, Boolean.valueOf(z10));
            xl.a.b(this.f40552h, bVar, false);
        }
        if ((PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH & j10) != 0) {
            ViewAdapter.b(this.f40560n, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(6));
        }
        if ((j10 & 3200) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40560n, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 3136) != 0) {
            TextViewBindingAdapter.setText(this.f40561o, str3);
        }
        if ((3104 & j10) != 0) {
            this.f40561o.setVisibility(i11);
        }
        if ((3328 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40563q, str2);
        }
        if ((j10 & 3076) != 0) {
            TextViewBindingAdapter.setText(this.f40548d, spannableString);
        }
        if ((3088 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40549e, str4);
        }
        if ((3080 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40550f, spannableString3);
        }
        if ((3584 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40551g, spannableString2);
        }
        if ((j10 & 3073) != 0) {
            TextViewBindingAdapter.setText(this.f40553i, str5);
        }
        if ((j10 & 3074) != 0) {
            TextViewBindingAdapter.setText(this.f40554j, str6);
        }
    }

    public final boolean f(ObservableList<u2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 128;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 256;
        }
        return true;
    }

    public final boolean h(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 32;
        }
        return true;
    }

    public final boolean i(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 1;
        }
        return true;
    }

    public final boolean j(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40564r |= 2;
        }
        return true;
    }

    public void k(@Nullable k2 k2Var) {
        this.f40555k = k2Var;
        synchronized (this) {
            this.f40564r |= 1024;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return i((ObservableField) obj, i11);
            case 1:
                return j((ObservableField) obj, i11);
            case 2:
                return a((ObservableField) obj, i11);
            case 3:
                return d((ObservableField) obj, i11);
            case 4:
                return b((ObservableField) obj, i11);
            case 5:
                return h((ObservableField) obj, i11);
            case 6:
                return c((ObservableField) obj, i11);
            case 7:
                return f((ObservableList) obj, i11);
            case 8:
                return g((ObservableField) obj, i11);
            case 9:
                return e((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
