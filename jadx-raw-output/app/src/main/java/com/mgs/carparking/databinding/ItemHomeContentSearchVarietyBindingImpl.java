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
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import com.ruffian.library.widget.RTextView;
import ul.b;
import w9.t2;
import wl.a;

/* JADX INFO: loaded from: classes7.dex */
public class ItemHomeContentSearchVarietyBindingImpl extends ItemHomeContentSearchVarietyBinding {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40619t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40620u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f40623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f40624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RTextView f40625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ImageView f40626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f40627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f40628s;

    public ItemHomeContentSearchVarietyBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f40619t, f40620u));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40628s != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40628s = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        m((t2) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40620u = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 15);
    }

    public ItemHomeContentSearchVarietyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 12, (RoundedImageView) objArr[2], (RelativeLayout) objArr[15], (TextView) objArr[11], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[12], (TextView) objArr[7], (TextView) objArr[8]);
        this.f40628s = -1L;
        this.f40609b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40621l = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f40622m = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[13];
        this.f40623n = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[14];
        this.f40624o = textView2;
        textView2.setTag(null);
        RTextView rTextView = (RTextView) objArr[3];
        this.f40625p = rTextView;
        rTextView.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.f40626q = imageView;
        imageView.setTag(null);
        TextView textView3 = (TextView) objArr[5];
        this.f40627r = textView3;
        textView3.setTag(null);
        this.f40611d.setTag(null);
        this.f40612e.setTag(null);
        this.f40613f.setTag(null);
        this.f40614g.setTag(null);
        this.f40615h.setTag(null);
        this.f40616i.setTag(null);
        this.f40617j.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 32;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 128;
        }
        return true;
    }

    public final boolean d(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 16;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 1024;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0158  */
    /* JADX WARN: Code duplicated, block: B:104:0x0160  */
    /* JADX WARN: Code duplicated, block: B:105:0x0163  */
    /* JADX WARN: Code duplicated, block: B:109:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0170  */
    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:114:0x017a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0181  */
    /* JADX WARN: Code duplicated, block: B:118:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x018c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0193  */
    /* JADX WARN: Code duplicated, block: B:123:0x019d  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01db  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:150:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:153:0x0206  */
    /* JADX WARN: Code duplicated, block: B:154:0x0222  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0136  */
    /* JADX WARN: Code duplicated, block: B:91:0x013b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0144  */
    /* JADX WARN: Code duplicated, block: B:95:0x014b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0154  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        int i10;
        boolean z10;
        int i11;
        String str;
        String vod_pic;
        b bVar2;
        b bVar3;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        Drawable drawable;
        SpannableString spannableString;
        String str5;
        SpannableString spannableString2;
        SpannableString spannableString3;
        String str6;
        String str7;
        boolean z11;
        long j11;
        long j12;
        int i12;
        String str8;
        ObservableField<SpannableString> observableField;
        ObservableField<Boolean> observableField2;
        ObservableField<String> observableField3;
        int i13;
        ObservableField<String> observableField4;
        ObservableField<String> observableField5;
        ObservableField<Boolean> observableField6;
        Boolean bool2;
        boolean zSafeUnbox;
        long j13;
        b bVar4;
        RecommandVideosEntity recommandVideosEntity;
        int i14;
        int icon_type;
        synchronized (this) {
            j10 = this.f40628s;
            this.f40628s = 0L;
        }
        t2 t2Var = this.f40618k;
        if ((16383 & j10) != 0) {
            if ((j10 & 12289) == 0) {
                str6 = null;
            } else {
                ObservableField<String> observableField7 = t2Var != null ? t2Var.f73791f : null;
                updateRegistration(0, observableField7);
                if (observableField7 != null) {
                    str6 = observableField7.get();
                } else {
                    str6 = null;
                }
            }
            if ((j10 & 12290) == 0) {
                str7 = null;
            } else {
                ObservableField<String> observableField8 = t2Var != null ? t2Var.f73793h : null;
                updateRegistration(1, observableField8);
                if (observableField8 != null) {
                    str7 = observableField8.get();
                } else {
                    str7 = null;
                }
            }
            if ((j10 & 12292) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField9 = t2Var != null ? t2Var.f73796k : null;
                updateRegistration(2, observableField9);
                if (observableField9 != null) {
                    str2 = observableField9.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 12296) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField10 = t2Var != null ? t2Var.f73795j : null;
                updateRegistration(3, observableField10);
                if (observableField10 != null) {
                    spannableString = observableField10.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 12304) == 0) {
                spannableString2 = null;
            } else {
                ObservableField<SpannableString> observableField11 = t2Var != null ? t2Var.f73792g : null;
                updateRegistration(4, observableField11);
                if (observableField11 != null) {
                    spannableString2 = observableField11.get();
                } else {
                    spannableString2 = null;
                }
            }
            long j14 = j10 & 12288;
            if (j14 != 0) {
                if (t2Var != null) {
                    drawable = t2Var.f73800o;
                    bVar4 = t2Var.f73806u;
                    recommandVideosEntity = t2Var.f73789d;
                    bVar2 = t2Var.f73805t;
                    bVar3 = t2Var.f73804s;
                } else {
                    bVar4 = null;
                    recommandVideosEntity = null;
                    bVar2 = null;
                    bVar3 = null;
                    drawable = null;
                }
                if (recommandVideosEntity != null) {
                    int type_pid = recommandVideosEntity.getType_pid();
                    vod_pic = recommandVideosEntity.getVod_pic();
                    icon_type = recommandVideosEntity.getIcon_type();
                    i14 = type_pid;
                } else {
                    i14 = 0;
                    icon_type = 0;
                    vod_pic = null;
                }
                boolean z12 = i14 != 1;
                boolean z13 = icon_type == 0;
                if (j14 != 0) {
                    j10 |= z13 ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 16384L;
                }
                i11 = z13 ? 8 : 0;
                j11 = 12320;
                z11 = z12;
                bVar = bVar4;
            } else {
                bVar = null;
                z11 = false;
                i11 = 0;
                bVar2 = null;
                bVar3 = null;
                drawable = null;
                j11 = 12320;
                vod_pic = null;
            }
            if ((j10 & j11) != 0) {
                ObservableField<String> observableField12 = t2Var != null ? t2Var.f73794i : null;
                updateRegistration(5, observableField12);
                String str9 = observableField12 != null ? observableField12.get() : null;
                j12 = j10 & 12352;
                str5 = str9;
                if (j12 != 0) {
                    if (t2Var != null) {
                        observableField6 = t2Var.f73803r;
                    } else {
                        observableField6 = null;
                    }
                    updateRegistration(6, observableField6);
                    if (observableField6 != null) {
                        bool2 = observableField6.get();
                    } else {
                        bool2 = null;
                    }
                    zSafeUnbox = ViewDataBinding.safeUnbox(bool2);
                    if (j12 != 0) {
                        if (zSafeUnbox) {
                            j13 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        } else {
                            j13 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        }
                        j10 |= j13;
                    }
                    if (zSafeUnbox) {
                        i12 = 8;
                    }
                    if ((j10 & 12416) == 0) {
                        str8 = null;
                    } else {
                        if (t2Var != null) {
                            observableField5 = t2Var.f73802q;
                        } else {
                            observableField5 = null;
                        }
                        updateRegistration(7, observableField5);
                        if (observableField5 != null) {
                            str8 = observableField5.get();
                        } else {
                            str8 = null;
                        }
                    }
                    if ((j10 & 12544) != 0) {
                        if (t2Var != null) {
                            observableField4 = t2Var.f73797l;
                            i13 = 8;
                        } else {
                            i13 = 8;
                            observableField4 = null;
                        }
                        updateRegistration(i13, observableField4);
                        str = observableField4 != null ? observableField4.get() : null;
                        if ((j10 & 12800) != 0) {
                            if (t2Var != null) {
                                observableField3 = t2Var.f73799n;
                            } else {
                                observableField3 = null;
                            }
                            updateRegistration(9, observableField3);
                            str4 = observableField3 != null ? observableField3.get() : null;
                            if ((j10 & 13312) != 0) {
                                if (t2Var != null) {
                                    observableField2 = t2Var.f73798m;
                                } else {
                                    observableField2 = null;
                                }
                                updateRegistration(10, observableField2);
                                Boolean bool3 = observableField2 != null ? observableField2.get() : null;
                                if ((j10 & 14336) == 0) {
                                    spannableString3 = null;
                                } else {
                                    if (t2Var != null) {
                                        observableField = t2Var.f73790e;
                                    } else {
                                        observableField = null;
                                    }
                                    updateRegistration(11, observableField);
                                    if (observableField != null) {
                                        spannableString3 = observableField.get();
                                    } else {
                                        spannableString3 = null;
                                    }
                                }
                                bool = bool3;
                                str3 = str8;
                                i10 = i12;
                                z10 = z11;
                            } else {
                                str4 = str4;
                            }
                            if ((j10 & 14336) == 0) {
                                spannableString3 = null;
                            } else {
                                if (t2Var != null) {
                                    observableField = t2Var.f73790e;
                                } else {
                                    observableField = null;
                                }
                                updateRegistration(11, observableField);
                                if (observableField != null) {
                                    spannableString3 = observableField.get();
                                } else {
                                    spannableString3 = null;
                                }
                            }
                            bool = bool3;
                            str3 = str8;
                            i10 = i12;
                            z10 = z11;
                        } else {
                            str = str;
                        }
                        if ((j10 & 13312) != 0) {
                            if (t2Var != null) {
                                observableField2 = t2Var.f73798m;
                            } else {
                                observableField2 = null;
                            }
                            updateRegistration(10, observableField2);
                            if (observableField2 != null) {
                            }
                            if ((j10 & 14336) == 0) {
                                spannableString3 = null;
                            } else {
                                if (t2Var != null) {
                                    observableField = t2Var.f73790e;
                                } else {
                                    observableField = null;
                                }
                                updateRegistration(11, observableField);
                                if (observableField != null) {
                                    spannableString3 = observableField.get();
                                } else {
                                    spannableString3 = null;
                                }
                            }
                            bool = bool3;
                            str3 = str8;
                            i10 = i12;
                            z10 = z11;
                        } else {
                            str4 = str4;
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        i12 = i12;
                    }
                    if ((j10 & 12800) != 0) {
                        if (t2Var != null) {
                            observableField3 = t2Var.f73799n;
                        } else {
                            observableField3 = null;
                        }
                        updateRegistration(9, observableField3);
                        if (observableField3 != null) {
                        }
                        if ((j10 & 13312) != 0) {
                            if (t2Var != null) {
                                observableField2 = t2Var.f73798m;
                            } else {
                                observableField2 = null;
                            }
                            updateRegistration(10, observableField2);
                            if (observableField2 != null) {
                            }
                            if ((j10 & 14336) == 0) {
                                spannableString3 = null;
                            } else {
                                if (t2Var != null) {
                                    observableField = t2Var.f73790e;
                                } else {
                                    observableField = null;
                                }
                                updateRegistration(11, observableField);
                                if (observableField != null) {
                                    spannableString3 = observableField.get();
                                } else {
                                    spannableString3 = null;
                                }
                            }
                            bool = bool3;
                            str3 = str8;
                            i10 = i12;
                            z10 = z11;
                        } else {
                            str4 = str4;
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        str = str;
                    }
                    if ((j10 & 13312) != 0) {
                        if (t2Var != null) {
                            observableField2 = t2Var.f73798m;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(10, observableField2);
                        if (observableField2 != null) {
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        str4 = str4;
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    z11 = z11;
                }
                i12 = 0;
                if ((j10 & 12416) == 0) {
                    str8 = null;
                } else {
                    if (t2Var != null) {
                        observableField5 = t2Var.f73802q;
                    } else {
                        observableField5 = null;
                    }
                    updateRegistration(7, observableField5);
                    if (observableField5 != null) {
                        str8 = observableField5.get();
                    } else {
                        str8 = null;
                    }
                }
                if ((j10 & 12544) != 0) {
                    if (t2Var != null) {
                        observableField4 = t2Var.f73797l;
                        i13 = 8;
                    } else {
                        i13 = 8;
                        observableField4 = null;
                    }
                    updateRegistration(i13, observableField4);
                    if (observableField4 != null) {
                    }
                    if ((j10 & 12800) != 0) {
                        if (t2Var != null) {
                            observableField3 = t2Var.f73799n;
                        } else {
                            observableField3 = null;
                        }
                        updateRegistration(9, observableField3);
                        if (observableField3 != null) {
                        }
                        if ((j10 & 13312) != 0) {
                            if (t2Var != null) {
                                observableField2 = t2Var.f73798m;
                            } else {
                                observableField2 = null;
                            }
                            updateRegistration(10, observableField2);
                            if (observableField2 != null) {
                            }
                            if ((j10 & 14336) == 0) {
                                spannableString3 = null;
                            } else {
                                if (t2Var != null) {
                                    observableField = t2Var.f73790e;
                                } else {
                                    observableField = null;
                                }
                                updateRegistration(11, observableField);
                                if (observableField != null) {
                                    spannableString3 = observableField.get();
                                } else {
                                    spannableString3 = null;
                                }
                            }
                            bool = bool3;
                            str3 = str8;
                            i10 = i12;
                            z10 = z11;
                        } else {
                            str4 = str4;
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        str = str;
                    }
                    if ((j10 & 13312) != 0) {
                        if (t2Var != null) {
                            observableField2 = t2Var.f73798m;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(10, observableField2);
                        if (observableField2 != null) {
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        str4 = str4;
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    i12 = i12;
                }
                if ((j10 & 12800) != 0) {
                    if (t2Var != null) {
                        observableField3 = t2Var.f73799n;
                    } else {
                        observableField3 = null;
                    }
                    updateRegistration(9, observableField3);
                    if (observableField3 != null) {
                    }
                    if ((j10 & 13312) != 0) {
                        if (t2Var != null) {
                            observableField2 = t2Var.f73798m;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(10, observableField2);
                        if (observableField2 != null) {
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        str4 = str4;
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    str = str;
                }
                if ((j10 & 13312) != 0) {
                    if (t2Var != null) {
                        observableField2 = t2Var.f73798m;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(10, observableField2);
                    if (observableField2 != null) {
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    str4 = str4;
                }
                if ((j10 & 14336) == 0) {
                    spannableString3 = null;
                } else {
                    if (t2Var != null) {
                        observableField = t2Var.f73790e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(11, observableField);
                    if (observableField != null) {
                        spannableString3 = observableField.get();
                    } else {
                        spannableString3 = null;
                    }
                }
                bool = bool3;
                str3 = str8;
                i10 = i12;
                z10 = z11;
            } else {
                bVar = bVar;
            }
            j12 = j10 & 12352;
            str5 = str9;
            if (j12 != 0) {
                if (t2Var != null) {
                    observableField6 = t2Var.f73803r;
                } else {
                    observableField6 = null;
                }
                updateRegistration(6, observableField6);
                if (observableField6 != null) {
                    bool2 = observableField6.get();
                } else {
                    bool2 = null;
                }
                zSafeUnbox = ViewDataBinding.safeUnbox(bool2);
                if (j12 != 0) {
                    if (zSafeUnbox) {
                        j13 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                    } else {
                        j13 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                    }
                    j10 |= j13;
                }
                if (zSafeUnbox) {
                    i12 = 8;
                }
                if ((j10 & 12416) == 0) {
                    str8 = null;
                } else {
                    if (t2Var != null) {
                        observableField5 = t2Var.f73802q;
                    } else {
                        observableField5 = null;
                    }
                    updateRegistration(7, observableField5);
                    if (observableField5 != null) {
                        str8 = observableField5.get();
                    } else {
                        str8 = null;
                    }
                }
                if ((j10 & 12544) != 0) {
                    if (t2Var != null) {
                        observableField4 = t2Var.f73797l;
                        i13 = 8;
                    } else {
                        i13 = 8;
                        observableField4 = null;
                    }
                    updateRegistration(i13, observableField4);
                    if (observableField4 != null) {
                    }
                    if ((j10 & 12800) != 0) {
                        if (t2Var != null) {
                            observableField3 = t2Var.f73799n;
                        } else {
                            observableField3 = null;
                        }
                        updateRegistration(9, observableField3);
                        if (observableField3 != null) {
                        }
                        if ((j10 & 13312) != 0) {
                            if (t2Var != null) {
                                observableField2 = t2Var.f73798m;
                            } else {
                                observableField2 = null;
                            }
                            updateRegistration(10, observableField2);
                            if (observableField2 != null) {
                            }
                            if ((j10 & 14336) == 0) {
                                spannableString3 = null;
                            } else {
                                if (t2Var != null) {
                                    observableField = t2Var.f73790e;
                                } else {
                                    observableField = null;
                                }
                                updateRegistration(11, observableField);
                                if (observableField != null) {
                                    spannableString3 = observableField.get();
                                } else {
                                    spannableString3 = null;
                                }
                            }
                            bool = bool3;
                            str3 = str8;
                            i10 = i12;
                            z10 = z11;
                        } else {
                            str4 = str4;
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        str = str;
                    }
                    if ((j10 & 13312) != 0) {
                        if (t2Var != null) {
                            observableField2 = t2Var.f73798m;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(10, observableField2);
                        if (observableField2 != null) {
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        str4 = str4;
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    i12 = i12;
                }
                if ((j10 & 12800) != 0) {
                    if (t2Var != null) {
                        observableField3 = t2Var.f73799n;
                    } else {
                        observableField3 = null;
                    }
                    updateRegistration(9, observableField3);
                    if (observableField3 != null) {
                    }
                    if ((j10 & 13312) != 0) {
                        if (t2Var != null) {
                            observableField2 = t2Var.f73798m;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(10, observableField2);
                        if (observableField2 != null) {
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        str4 = str4;
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    str = str;
                }
                if ((j10 & 13312) != 0) {
                    if (t2Var != null) {
                        observableField2 = t2Var.f73798m;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(10, observableField2);
                    if (observableField2 != null) {
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    str4 = str4;
                }
                if ((j10 & 14336) == 0) {
                    spannableString3 = null;
                } else {
                    if (t2Var != null) {
                        observableField = t2Var.f73790e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(11, observableField);
                    if (observableField != null) {
                        spannableString3 = observableField.get();
                    } else {
                        spannableString3 = null;
                    }
                }
                bool = bool3;
                str3 = str8;
                i10 = i12;
                z10 = z11;
            } else {
                z11 = z11;
            }
            i12 = 0;
            if ((j10 & 12416) == 0) {
                str8 = null;
            } else {
                if (t2Var != null) {
                    observableField5 = t2Var.f73802q;
                } else {
                    observableField5 = null;
                }
                updateRegistration(7, observableField5);
                if (observableField5 != null) {
                    str8 = observableField5.get();
                } else {
                    str8 = null;
                }
            }
            if ((j10 & 12544) != 0) {
                if (t2Var != null) {
                    observableField4 = t2Var.f73797l;
                    i13 = 8;
                } else {
                    i13 = 8;
                    observableField4 = null;
                }
                updateRegistration(i13, observableField4);
                if (observableField4 != null) {
                }
                if ((j10 & 12800) != 0) {
                    if (t2Var != null) {
                        observableField3 = t2Var.f73799n;
                    } else {
                        observableField3 = null;
                    }
                    updateRegistration(9, observableField3);
                    if (observableField3 != null) {
                    }
                    if ((j10 & 13312) != 0) {
                        if (t2Var != null) {
                            observableField2 = t2Var.f73798m;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(10, observableField2);
                        if (observableField2 != null) {
                        }
                        if ((j10 & 14336) == 0) {
                            spannableString3 = null;
                        } else {
                            if (t2Var != null) {
                                observableField = t2Var.f73790e;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                spannableString3 = observableField.get();
                            } else {
                                spannableString3 = null;
                            }
                        }
                        bool = bool3;
                        str3 = str8;
                        i10 = i12;
                        z10 = z11;
                    } else {
                        str4 = str4;
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    str = str;
                }
                if ((j10 & 13312) != 0) {
                    if (t2Var != null) {
                        observableField2 = t2Var.f73798m;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(10, observableField2);
                    if (observableField2 != null) {
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    str4 = str4;
                }
                if ((j10 & 14336) == 0) {
                    spannableString3 = null;
                } else {
                    if (t2Var != null) {
                        observableField = t2Var.f73790e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(11, observableField);
                    if (observableField != null) {
                        spannableString3 = observableField.get();
                    } else {
                        spannableString3 = null;
                    }
                }
                bool = bool3;
                str3 = str8;
                i10 = i12;
                z10 = z11;
            } else {
                i12 = i12;
            }
            if ((j10 & 12800) != 0) {
                if (t2Var != null) {
                    observableField3 = t2Var.f73799n;
                } else {
                    observableField3 = null;
                }
                updateRegistration(9, observableField3);
                if (observableField3 != null) {
                }
                if ((j10 & 13312) != 0) {
                    if (t2Var != null) {
                        observableField2 = t2Var.f73798m;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(10, observableField2);
                    if (observableField2 != null) {
                    }
                    if ((j10 & 14336) == 0) {
                        spannableString3 = null;
                    } else {
                        if (t2Var != null) {
                            observableField = t2Var.f73790e;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            spannableString3 = observableField.get();
                        } else {
                            spannableString3 = null;
                        }
                    }
                    bool = bool3;
                    str3 = str8;
                    i10 = i12;
                    z10 = z11;
                } else {
                    str4 = str4;
                }
                if ((j10 & 14336) == 0) {
                    spannableString3 = null;
                } else {
                    if (t2Var != null) {
                        observableField = t2Var.f73790e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(11, observableField);
                    if (observableField != null) {
                        spannableString3 = observableField.get();
                    } else {
                        spannableString3 = null;
                    }
                }
                bool = bool3;
                str3 = str8;
                i10 = i12;
                z10 = z11;
            } else {
                str = str;
            }
            if ((j10 & 13312) != 0) {
                if (t2Var != null) {
                    observableField2 = t2Var.f73798m;
                } else {
                    observableField2 = null;
                }
                updateRegistration(10, observableField2);
                if (observableField2 != null) {
                }
                if ((j10 & 14336) == 0) {
                    spannableString3 = null;
                } else {
                    if (t2Var != null) {
                        observableField = t2Var.f73790e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(11, observableField);
                    if (observableField != null) {
                        spannableString3 = observableField.get();
                    } else {
                        spannableString3 = null;
                    }
                }
                bool = bool3;
                str3 = str8;
                i10 = i12;
                z10 = z11;
            } else {
                str4 = str4;
            }
            if ((j10 & 14336) == 0) {
                spannableString3 = null;
            } else {
                if (t2Var != null) {
                    observableField = t2Var.f73790e;
                } else {
                    observableField = null;
                }
                updateRegistration(11, observableField);
                if (observableField != null) {
                    spannableString3 = observableField.get();
                } else {
                    spannableString3 = null;
                }
            }
            bool = bool3;
            str3 = str8;
            i10 = i12;
            z10 = z11;
        } else {
            bVar = null;
            i10 = 0;
            z10 = false;
            i11 = 0;
            str = null;
            vod_pic = null;
            bVar2 = null;
            bVar3 = null;
            str2 = null;
            bool = null;
            str3 = null;
            str4 = null;
            drawable = null;
            spannableString = null;
            str5 = null;
            spannableString2 = null;
            spannableString3 = null;
            str6 = null;
            str7 = null;
        }
        if ((j10 & 12288) != 0) {
            a.a(this.f40609b, vod_pic, R.drawable.ic_video_default);
            xl.a.b(this.f40622m, bVar3, false);
            xl.a.b(this.f40623n, bVar2, false);
            xl.a.b(this.f40624o, bVar, false);
            this.f40626q.setVisibility(i11);
            ImageViewBindingAdapter.setImageDrawable(this.f40626q, drawable);
            xl.a.a(this.f40627r, Boolean.valueOf(z10));
            xl.a.b(this.f40615h, bVar3, false);
        }
        if ((j10 & 12292) != 0) {
            TextViewBindingAdapter.setText(this.f40623n, str2);
        }
        if ((j10 & 12544) != 0) {
            TextViewBindingAdapter.setText(this.f40624o, str);
        }
        if ((j10 & 13312) != 0) {
            xl.a.a(this.f40624o, bool);
        }
        if ((j10 & 12416) != 0) {
            TextViewBindingAdapter.setText(this.f40625p, str3);
        }
        if ((12352 & j10) != 0) {
            this.f40625p.setVisibility(i10);
        }
        if ((12800 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40627r, str4);
        }
        if ((j10 & 12296) != 0) {
            TextViewBindingAdapter.setText(this.f40611d, spannableString);
        }
        if ((12320 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40612e, str5);
        }
        if ((12304 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40613f, spannableString2);
        }
        if ((14336 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40614g, spannableString3);
        }
        if ((j10 & 12289) != 0) {
            TextViewBindingAdapter.setText(this.f40616i, str6);
        }
        if ((j10 & 12290) != 0) {
            TextViewBindingAdapter.setText(this.f40617j, str7);
        }
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 4;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 256;
        }
        return true;
    }

    public final boolean h(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    public final boolean i(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 512;
        }
        return true;
    }

    public final boolean j(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 64;
        }
        return true;
    }

    public final boolean k(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 1;
        }
        return true;
    }

    public final boolean l(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40628s |= 2;
        }
        return true;
    }

    public void m(@Nullable t2 t2Var) {
        this.f40618k = t2Var;
        synchronized (this) {
            this.f40628s |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return k((ObservableField) obj, i11);
            case 1:
                return l((ObservableField) obj, i11);
            case 2:
                return f((ObservableField) obj, i11);
            case 3:
                return a((ObservableField) obj, i11);
            case 4:
                return d((ObservableField) obj, i11);
            case 5:
                return b((ObservableField) obj, i11);
            case 6:
                return j((ObservableField) obj, i11);
            case 7:
                return c((ObservableField) obj, i11);
            case 8:
                return g((ObservableField) obj, i11);
            case 9:
                return i((ObservableField) obj, i11);
            case 10:
                return e((ObservableField) obj, i11);
            case 11:
                return h((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
