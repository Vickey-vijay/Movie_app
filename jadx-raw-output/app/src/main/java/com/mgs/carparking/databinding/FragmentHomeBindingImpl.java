package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.fvvcl.flickverse.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.ui.homecontent.HomePageViewModel;
import com.mgs.carparking.util.ScrollTextView;
import com.mgs.carparking.widgets.viewpager.SuperViewPager;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes11.dex */
public class FragmentHomeBindingImpl extends FragmentHomeBinding {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40168u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40169v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f40170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final View f40171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final Button f40174s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f40175t;

    public FragmentHomeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, f40168u, f40169v));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40175t != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40175t = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((HomePageViewModel) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40169v = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 10);
        sparseIntArray.put(R.id.iv_home_search, 11);
        sparseIntArray.put(R.id.marqueeText, 12);
        sparseIntArray.put(R.id.tab_layout, 13);
        sparseIntArray.put(R.id.vp_content, 14);
        sparseIntArray.put(R.id.img_loading, 15);
        sparseIntArray.put(R.id.tv_empty, 16);
    }

    public FragmentHomeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ImageView) objArr[15], (ImageView) objArr[3], (ImageView) objArr[11], (ImageView) objArr[4], (RelativeLayout) objArr[0], (ScrollTextView) objArr[12], (RelativeLayout) objArr[1], (RelativeLayout) objArr[10], (TabLayout) objArr[13], (TextView) objArr[16], (TextView) objArr[5], (SuperViewPager) objArr[14]);
        this.f40175t = -1L;
        this.f40156c.setTag(null);
        this.f40158e.setTag(null);
        this.f40159f.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f40170o = textView;
        textView.setTag(null);
        View view2 = (View) objArr[6];
        this.f40171p = view2;
        view2.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[7];
        this.f40172q = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[8];
        this.f40173r = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[9];
        this.f40174s = button;
        button.setTag(null);
        this.f40161h.setTag(null);
        this.f40165l.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40175t |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40175t |= 1;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40175t |= 2;
        }
        return true;
    }

    public void d(@Nullable HomePageViewModel homePageViewModel) {
        this.f40167n = homePageViewModel;
        synchronized (this) {
            this.f40175t |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        Boolean bool;
        b bVar;
        Boolean bool2;
        b bVar2;
        b bVar3;
        Boolean bool3;
        long j11;
        b bVar4;
        b bVar5;
        synchronized (this) {
            j10 = this.f40175t;
            this.f40175t = 0L;
        }
        HomePageViewModel homePageViewModel = this.f40167n;
        Boolean bool4 = null;
        if ((31 & j10) != 0) {
            if ((j10 & 24) == 0 || homePageViewModel == null) {
                bVar = null;
                bVar2 = null;
                bVar3 = null;
                bVar4 = null;
                bVar5 = null;
            } else {
                bVar = homePageViewModel.f41834p;
                bVar4 = homePageViewModel.f41835q;
                bVar5 = homePageViewModel.f41833o;
                bVar2 = homePageViewModel.f41832n;
                bVar3 = homePageViewModel.f41831m;
            }
            if ((j10 & 25) == 0) {
                bool3 = null;
            } else {
                ObservableField<Boolean> observableField = homePageViewModel != null ? homePageViewModel.f41826h : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    bool3 = observableField.get();
                } else {
                    bool3 = null;
                }
            }
            if ((j10 & 26) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField2 = homePageViewModel != null ? homePageViewModel.f41825g : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    bool2 = observableField2.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 28) != 0) {
                ObservableField<Boolean> observableField3 = homePageViewModel != null ? homePageViewModel.f41824f : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    bool4 = observableField3.get();
                }
            }
            bool = bool4;
            j11 = 24;
        } else {
            bool = null;
            bVar = null;
            bool2 = null;
            bVar2 = null;
            bVar3 = null;
            bool3 = null;
            j11 = 24;
            bVar4 = null;
            bVar5 = null;
        }
        if ((j10 & j11) != 0) {
            a.b(this.f40156c, bVar5, false);
            a.b(this.f40158e, bVar, false);
            a.b(this.f40170o, bVar3, false);
            a.b(this.f40174s, bVar4, false);
            a.b(this.f40161h, bVar3, false);
            a.b(this.f40165l, bVar2, false);
        }
        if ((25 & j10) != 0) {
            a.a(this.f40171p, bool3);
        }
        if ((28 & j10) != 0) {
            a.a(this.f40172q, bool);
        }
        if ((j10 & 26) != 0) {
            a.a(this.f40173r, bool2);
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
