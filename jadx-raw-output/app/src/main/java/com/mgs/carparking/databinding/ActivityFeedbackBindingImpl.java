package com.mgs.carparking.databinding;

import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import w9.q1;
import xl.a;

/* JADX INFO: loaded from: classes11.dex */
public class ActivityFeedbackBindingImpl extends ActivityFeedbackBinding {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39833s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f39835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f39838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f39839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final Button f39840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f39841q;

    public ActivityFeedbackBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f39832r, f39833s));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f39841q != 0) {
                return true;
            }
            return this.f39824b.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39841q = 128L;
        }
        this.f39824b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        g((FEEDBACKVIEWMODEL) obj);
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f39832r = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"actionbar_back"}, new int[]{10}, new int[]{R.layout.actionbar_back});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39833s = sparseIntArray;
        sparseIntArray.put(R.id.scrollview, 11);
        sparseIntArray.put(R.id.et_input, 12);
        sparseIntArray.put(R.id.iv_image_select, 13);
    }

    public ActivityFeedbackBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (ActionbarBackBinding) objArr[10], (EditText) objArr[12], (ImageView) objArr[6], (ImageView) objArr[13], (ImageView) objArr[4], (RelativeLayout) objArr[1], (ScrollView) objArr[11]);
        this.f39841q = -1L;
        setContainedBinding(this.f39824b);
        this.f39826d.setTag(null);
        this.f39828f.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39834j = relativeLayout;
        relativeLayout.setTag(null);
        View view2 = (View) objArr[2];
        this.f39835k = view2;
        view2.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[3];
        this.f39836l = recyclerView;
        recyclerView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[5];
        this.f39837m = relativeLayout2;
        relativeLayout2.setTag(null);
        TextView textView = (TextView) objArr[7];
        this.f39838n = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[8];
        this.f39839o = textView2;
        textView2.setTag(null);
        Button button = (Button) objArr[9];
        this.f39840p = button;
        button.setTag(null);
        this.f39829g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ActionbarBackBinding actionbarBackBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39841q |= 16;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39841q |= 1;
        }
        return true;
    }

    public final boolean c(ObservableList<q1> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39841q |= 2;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39841q |= 32;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39841q |= 4;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        Boolean bool;
        SpannableStringBuilder spannableStringBuilder;
        b bVar2;
        b bVar3;
        ToolbarViewModel toolbarViewModel;
        b bVar4;
        Boolean bool2;
        String str;
        c<q1> cVar;
        ObservableList observableList;
        b bVar5;
        ToolbarViewModel toolbarViewModel2;
        c<q1> cVar2;
        ObservableList observableList2;
        SpannableStringBuilder spannableStringBuilder2;
        synchronized (this) {
            j10 = this.f39841q;
            this.f39841q = 0L;
        }
        FEEDBACKVIEWMODEL feedbackviewmodel = this.f39831i;
        if ((239 & j10) != 0) {
            if ((j10 & 192) == 0 || feedbackviewmodel == null) {
                bVar2 = null;
                bVar3 = null;
                bVar5 = null;
                toolbarViewModel2 = null;
                bVar4 = null;
            } else {
                bVar2 = feedbackviewmodel.A;
                bVar5 = feedbackviewmodel.B;
                toolbarViewModel2 = feedbackviewmodel.f42201n;
                bVar4 = feedbackviewmodel.C;
                bVar3 = feedbackviewmodel.f41202z;
            }
            if ((j10 & 194) != 0) {
                if (feedbackviewmodel != null) {
                    cVar2 = feedbackviewmodel.f41201y;
                    observableList2 = feedbackviewmodel.f41200x;
                } else {
                    cVar2 = null;
                    observableList2 = null;
                }
                updateRegistration(1, observableList2);
            } else {
                cVar2 = null;
                observableList2 = null;
            }
            if ((j10 & 193) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField = feedbackviewmodel != null ? feedbackviewmodel.f41191o : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str = observableField.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 196) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField2 = feedbackviewmodel != null ? feedbackviewmodel.f41195s : null;
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    bool2 = observableField2.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 200) == 0) {
                spannableStringBuilder2 = null;
            } else {
                ObservableField<SpannableStringBuilder> observableField3 = feedbackviewmodel != null ? feedbackviewmodel.f41196t : null;
                updateRegistration(3, observableField3);
                if (observableField3 != null) {
                    spannableStringBuilder2 = observableField3.get();
                } else {
                    spannableStringBuilder2 = null;
                }
            }
            if ((j10 & 224) == 0) {
                spannableStringBuilder = spannableStringBuilder2;
                bVar = bVar5;
                toolbarViewModel = toolbarViewModel2;
                cVar = cVar2;
                observableList = observableList2;
                bool = null;
            } else {
                ObservableField<Boolean> observableField4 = feedbackviewmodel != null ? feedbackviewmodel.f41193q : null;
                updateRegistration(5, observableField4);
                if (observableField4 != null) {
                    spannableStringBuilder = spannableStringBuilder2;
                    cVar = cVar2;
                    observableList = observableList2;
                    bool = observableField4.get();
                    bVar = bVar5;
                    toolbarViewModel = toolbarViewModel2;
                } else {
                    spannableStringBuilder = spannableStringBuilder2;
                    bVar = bVar5;
                    toolbarViewModel = toolbarViewModel2;
                    cVar = cVar2;
                    observableList = observableList2;
                    bool = null;
                }
            }
        } else {
            bVar = null;
            bool = null;
            spannableStringBuilder = null;
            bVar2 = null;
            bVar3 = null;
            toolbarViewModel = null;
            bVar4 = null;
            bool2 = null;
            str = null;
            cVar = null;
            observableList = null;
        }
        if ((j10 & 192) != 0) {
            this.f39824b.a(toolbarViewModel);
            a.b(this.f39826d, bVar, false);
            a.b(this.f39828f, bVar2, false);
            a.b(this.f39837m, bVar4, false);
            a.b(this.f39840p, bVar3, false);
        }
        if ((j10 & 224) != 0) {
            a.a(this.f39835k, bool);
        }
        if ((128 & j10) != 0) {
            ViewAdapter.b(this.f39836l, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(1));
            a.d(this.f39839o, Boolean.TRUE);
        }
        if ((194 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f39836l, cVar, observableList, null, null, null, null);
        }
        if ((196 & j10) != 0) {
            a.a(this.f39837m, bool2);
        }
        if ((193 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39838n, str);
        }
        if ((j10 & 200) != 0) {
            TextViewBindingAdapter.setText(this.f39839o, spannableStringBuilder);
        }
        ViewDataBinding.executeBindingsOn(this.f39824b);
    }

    public final boolean f(ObservableField<SpannableStringBuilder> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39841q |= 8;
        }
        return true;
    }

    public void g(@Nullable FEEDBACKVIEWMODEL feedbackviewmodel) {
        this.f39831i = feedbackviewmodel;
        synchronized (this) {
            this.f39841q |= 64;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableList) obj, i11);
        }
        if (i10 == 2) {
            return e((ObservableField) obj, i11);
        }
        if (i10 == 3) {
            return f((ObservableField) obj, i11);
        }
        if (i10 == 4) {
            return a((ActionbarBackBinding) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return d((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f39824b.setLifecycleOwner(lifecycleOwner);
    }
}
