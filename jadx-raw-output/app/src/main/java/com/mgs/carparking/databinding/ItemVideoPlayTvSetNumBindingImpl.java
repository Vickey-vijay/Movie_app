package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.fvvcl.flickverse.R;
import ul.b;
import w9.c3;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemVideoPlayTvSetNumBindingImpl extends ItemVideoPlayTvSetNumBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40966g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40967h = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40970f;

    public ItemVideoPlayTvSetNumBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f40966g, f40967h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40970f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40970f = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((c3) obj);
        return true;
    }

    public ItemVideoPlayTvSetNumBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ImageView) objArr[2]);
        this.f40970f = -1L;
        this.f40964b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40968d = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f40969e = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40970f |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40970f |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40970f |= 2;
        }
        return true;
    }

    public void d(@Nullable c3 c3Var) {
        this.f40965c = c3Var;
        synchronized (this) {
            this.f40970f |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x0114  */
    /* JADX WARN: Code duplicated, block: B:88:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean zSafeUnbox;
        int i10;
        b bVar;
        Drawable drawable;
        String str;
        long j11;
        int colorFromResource;
        long j12;
        ObservableField<Boolean> observableField;
        Boolean bool;
        boolean zSafeUnbox2;
        long j13;
        ObservableField<String> observableField2;
        long j14;
        long j15;
        synchronized (this) {
            j10 = this.f40970f;
            this.f40970f = 0L;
        }
        c3 c3Var = this.f40965c;
        if ((31 & j10) != 0) {
            bVar = ((j10 & 24) == 0 || c3Var == null) ? null : c3Var.f73589g;
            if ((j10 & 27) != 0) {
                ObservableField<Boolean> observableField3 = c3Var != null ? c3Var.f73587e : null;
                updateRegistration(1, observableField3);
                zSafeUnbox = ViewDataBinding.safeUnbox(observableField3 != null ? observableField3.get() : null);
                if ((j10 & 26) != 0) {
                    if (zSafeUnbox) {
                        j14 = j10 | 64;
                        j15 = 256;
                    } else {
                        j14 = j10 | 32;
                        j15 = 128;
                    }
                    j10 = j14 | j15;
                }
                if ((j10 & 27) != 0) {
                    j10 = zSafeUnbox ? j10 | 1024 : j10 | 512;
                }
                if ((j10 & 26) != 0) {
                    i10 = zSafeUnbox ? 0 : 8;
                    drawable = AppCompatResources.getDrawable(this.f40969e.getContext(), zSafeUnbox ? R.drawable.bg_home_search_tv_set_num_selector : R.drawable.bg_home_search_tv_set_num);
                } else {
                    i10 = 0;
                }
                if ((j10 & 28) == 0) {
                    if (c3Var != null) {
                        observableField2 = c3Var.f73585c;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(2, observableField2);
                    str = observableField2 != null ? observableField2.get() : null;
                }
                j11 = 512 & j10;
                if (j11 != 0) {
                    if (c3Var != null) {
                        observableField = c3Var.f73586d;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(0, observableField);
                    if (observableField != null) {
                        bool = observableField.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox2 = ViewDataBinding.safeUnbox(bool);
                    if (j11 != 0) {
                        if (zSafeUnbox2) {
                            j13 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                        } else {
                            j13 = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                        }
                        j10 |= j13;
                    }
                    colorFromResource = ViewDataBinding.getColorFromResource(this.f40969e, R.color.color_999999);
                } else {
                    colorFromResource = 0;
                }
                j12 = j10 & 27;
                if (j12 == 0) {
                    colorFromResource = 0;
                } else if (zSafeUnbox) {
                    colorFromResource = ViewDataBinding.getColorFromResource(this.f40969e, R.color.color_commen);
                }
                if ((26 & j10) != 0) {
                    this.f40964b.setVisibility(i10);
                    ViewBindingAdapter.setBackground(this.f40969e, drawable);
                }
                if ((24 & j10) != 0) {
                    a.b(this.f40968d, bVar, false);
                }
                if ((j10 & 28) != 0) {
                    TextViewBindingAdapter.setText(this.f40969e, str);
                }
                if (j12 != 0) {
                    this.f40969e.setTextColor(colorFromResource);
                }
            }
            zSafeUnbox = false;
            i10 = 0;
            drawable = null;
            if ((j10 & 28) == 0) {
                if (c3Var != null) {
                    observableField2 = c3Var.f73585c;
                } else {
                    observableField2 = null;
                }
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                }
            }
            j11 = 512 & j10;
            if (j11 != 0) {
                if (c3Var != null) {
                    observableField = c3Var.f73586d;
                } else {
                    observableField = null;
                }
                updateRegistration(0, observableField);
                if (observableField != null) {
                    bool = observableField.get();
                } else {
                    bool = null;
                }
                zSafeUnbox2 = ViewDataBinding.safeUnbox(bool);
                if (j11 != 0) {
                    if (zSafeUnbox2) {
                        j13 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    } else {
                        j13 = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    }
                    j10 |= j13;
                }
                colorFromResource = ViewDataBinding.getColorFromResource(this.f40969e, R.color.color_999999);
            } else {
                colorFromResource = 0;
            }
            j12 = j10 & 27;
            if (j12 == 0) {
                colorFromResource = 0;
            } else if (zSafeUnbox) {
                colorFromResource = ViewDataBinding.getColorFromResource(this.f40969e, R.color.color_commen);
            }
            if ((26 & j10) != 0) {
                this.f40964b.setVisibility(i10);
                ViewBindingAdapter.setBackground(this.f40969e, drawable);
            }
            if ((24 & j10) != 0) {
                a.b(this.f40968d, bVar, false);
            }
            if ((j10 & 28) != 0) {
                TextViewBindingAdapter.setText(this.f40969e, str);
            }
            if (j12 != 0) {
                this.f40969e.setTextColor(colorFromResource);
            }
        }
        zSafeUnbox = false;
        i10 = 0;
        bVar = null;
        drawable = null;
        j11 = 512 & j10;
        if (j11 != 0) {
            if (c3Var != null) {
                observableField = c3Var.f73586d;
            } else {
                observableField = null;
            }
            updateRegistration(0, observableField);
            if (observableField != null) {
                bool = observableField.get();
            } else {
                bool = null;
            }
            zSafeUnbox2 = ViewDataBinding.safeUnbox(bool);
            if (j11 != 0) {
                if (zSafeUnbox2) {
                    j13 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                } else {
                    j13 = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                }
                j10 |= j13;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(this.f40969e, R.color.color_999999);
        } else {
            colorFromResource = 0;
        }
        j12 = j10 & 27;
        if (j12 == 0) {
            colorFromResource = 0;
        } else if (zSafeUnbox) {
            colorFromResource = ViewDataBinding.getColorFromResource(this.f40969e, R.color.color_commen);
        }
        if ((26 & j10) != 0) {
            this.f40964b.setVisibility(i10);
            ViewBindingAdapter.setBackground(this.f40969e, drawable);
        }
        if ((24 & j10) != 0) {
            a.b(this.f40968d, bVar, false);
        }
        if ((j10 & 28) != 0) {
            TextViewBindingAdapter.setText(this.f40969e, str);
        }
        if (j12 != 0) {
            this.f40969e.setTextColor(colorFromResource);
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
        return a((ObservableField) obj, i11);
    }
}
