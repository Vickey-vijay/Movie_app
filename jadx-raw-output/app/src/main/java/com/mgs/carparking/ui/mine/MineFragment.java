package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.databinding.FragmentMineBinding;
import com.mgs.carparking.model.MINEVIEWMODEL;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.ui.mine.MineFragment;
import com.mgs.carparking.ui.mine.languageswitching.LanguageSwitchingDialog;
import em.l;
import em.o;
import g5.m;
import gb.d;
import java.util.ArrayList;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import sa.c;
import sa.g;
import sa.o0;
import x9.c0;
import x9.d0;
import x9.h0;
import x9.n;
import x9.w;

/* JADX INFO: loaded from: classes5.dex */
public class MineFragment extends BaseFragment<FragmentMineBinding, MINEVIEWMODEL> implements jb.a {
    private d showAdLoadingPop;
    public ArrayList<Object> nulllist = new ArrayList<>();
    private boolean internalChange = false;

    public class a implements LanguageSwitchingDialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LanguageSwitchingDialog f42072a;

        @Override // com.mgs.carparking.ui.mine.languageswitching.LanguageSwitchingDialog.b
        public void a(String str) {
            o0.X0(1);
            this.f42072a.dismiss();
            MineFragment.this.switchLanguage(str);
        }

        public a(LanguageSwitchingDialog languageSwitchingDialog) {
            this.f42072a = languageSwitchingDialog;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0() {
        this.internalChange = true;
        ((FragmentMineBinding) this.binding).f40242e.setEnabled(true);
        this.internalChange = false;
        this.showAdLoadingPop.f53324d.stop();
        this.showAdLoadingPop.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initViewObservable$6(Void r10) {
    }

    @Override // jb.a
    public BaseFragment getFragment() {
        return this;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_mine;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    public void onMenuItemClick() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(CompoundButton compoundButton, boolean z10) {
        if (this.internalChange) {
            return;
        }
        ((FragmentMineBinding) this.binding).f40242e.setEnabled(false);
        m.c("dadqadadadad", "11111111");
        g.f("CACHE_HOME_TITLE_LIST", this.nulllist);
        g.f("CACHE_RANK_TITLE_LIST", this.nulllist);
        if (z10) {
            o0.W0(1);
        } else {
            o0.W0(0);
        }
        if (this.showAdLoadingPop == null) {
            this.showAdLoadingPop = new d(getActivity());
        }
        this.showAdLoadingPop.showAsDropDown(((FragmentMineBinding) this.binding).f40239b);
        this.showAdLoadingPop.f53324d.start();
        tl.a.a().b(new w());
        ((FragmentMineBinding) this.binding).f40242e.postDelayed(new Runnable() { // from class: ka.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f62733b.lambda$initViewObservable$0();
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$11(Void r10) {
        LanguageSwitchingDialog languageSwitchingDialog = new LanguageSwitchingDialog(getContext());
        languageSwitchingDialog.e(new a(languageSwitchingDialog));
        languageSwitchingDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(h0 h0Var) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(c0 c0Var) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).f41283f.set(Boolean.TRUE);
        ((MINEVIEWMODEL) this.viewModel).f41286i.set(o0.V());
        ((MINEVIEWMODEL) this.viewModel).f41287j.set("ID:" + o0.T());
        if (o.b(o0.S())) {
            ((FragmentMineBinding) this.binding).f40239b.setImageResource(R.drawable.ic_avatar_login_default);
        } else {
            ib.d.c(getActivity(), o0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((FragmentMineBinding) this.binding).f40239b, false);
        }
        ((MINEVIEWMODEL) this.viewModel).P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$7(n nVar) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).f41289l.set(Boolean.valueOf(nVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$8(x9.m mVar) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).f41286i.set(o0.V());
        if (o.b(o0.S())) {
            ((FragmentMineBinding) this.binding).f40239b.setImageResource(R.drawable.ic_avatar_login_default);
        } else {
            ib.d.c(getActivity(), o0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((FragmentMineBinding) this.binding).f40239b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$9(d0 d0Var) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).f41283f.set(Boolean.FALSE);
        ((MINEVIEWMODEL) this.viewModel).A("logout");
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public MINEVIEWMODEL initViewModel() {
        return new MINEVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    public void switchLanguage(String str) {
        ArrayList arrayList = new ArrayList();
        g.f("CACHE_HOME_TITLE_LIST", arrayList);
        g.f("CACHE_RANK_TITLE_LIST", arrayList);
        g.f("CACHE_RANK_MODEL_LIST", arrayList);
        AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(str));
        o0.r0(str);
        c.f("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$10(Void r10) {
        if (!TextUtils.isEmpty(o0.r())) {
            try {
                sa.a.a(getContext(), o0.r());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r10) {
        if (!o.b(o0.S())) {
            ib.d.c(getActivity(), o0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((FragmentMineBinding) this.binding).f40239b, false);
        } else {
            ((FragmentMineBinding) this.binding).f40239b.setImageResource(R.drawable.ic_avatar_login_default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$5(Void r10) {
        sa.w.a(getActivity(), VideoPlayDetailActivity.class, "", "", 21365);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        if (o0.G().equals("none")) {
            ((FragmentMineBinding) this.binding).f40248k.setVisibility(8);
        } else {
            ((FragmentMineBinding) this.binding).f40248k.setVisibility(0);
        }
        ((MINEVIEWMODEL) this.viewModel).P();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        if (o0.M() == 0) {
            ((FragmentMineBinding) this.binding).f40242e.setChecked(false);
        } else {
            ((FragmentMineBinding) this.binding).f40242e.setChecked(true);
        }
        ((FragmentMineBinding) this.binding).f40242e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ka.q
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                this.f62731a.lambda$initViewObservable$1(compoundButton, z10);
            }
        });
        ((MINEVIEWMODEL) this.viewModel).f41290m.observe(this, new Observer() { // from class: ka.u
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62735b.lambda$initViewObservable$2((Void) obj);
            }
        });
        addSubscribe(tl.a.a().d(h0.class).subscribe(new oi.g() { // from class: ka.v
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62736b.lambda$initViewObservable$3((x9.h0) obj);
            }
        }));
        addSubscribe(tl.a.a().d(c0.class).subscribe(new oi.g() { // from class: ka.w
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62737b.lambda$initViewObservable$4((x9.c0) obj);
            }
        }));
        ((MINEVIEWMODEL) this.viewModel).f41293p.observe(this, new Observer() { // from class: ka.x
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62738b.lambda$initViewObservable$5((Void) obj);
            }
        });
        ((MINEVIEWMODEL) this.viewModel).f41292o.observe(this, new Observer() { // from class: ka.y
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MineFragment.lambda$initViewObservable$6((Void) obj);
            }
        });
        addSubscribe(tl.a.a().e(n.class).subscribe(new oi.g() { // from class: ka.z
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62739b.lambda$initViewObservable$7((x9.n) obj);
            }
        }));
        addSubscribe(tl.a.a().d(x9.m.class).subscribe(new oi.g() { // from class: ka.a0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62666b.lambda$initViewObservable$8((x9.m) obj);
            }
        }));
        addSubscribe(tl.a.a().d(d0.class).subscribe(new oi.g() { // from class: ka.b0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62668b.lambda$initViewObservable$9((x9.d0) obj);
            }
        }));
        ((MINEVIEWMODEL) this.viewModel).f41291n.observe(this, new Observer() { // from class: ka.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62732b.lambda$initViewObservable$10((Void) obj);
            }
        });
        ((MINEVIEWMODEL) this.viewModel).f41298u.observe(this, new Observer() { // from class: ka.t
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62734b.lambda$initViewObservable$11((Void) obj);
            }
        });
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l.d(getActivity(), false, R.color.color_1b202b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        if (!z10) {
            ((MINEVIEWMODEL) this.viewModel).P();
        }
    }
}
