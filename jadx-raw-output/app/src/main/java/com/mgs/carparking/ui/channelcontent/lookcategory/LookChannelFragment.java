package com.mgs.carparking.ui.channelcontent.lookcategory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import cc.f;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.fvvcl.flickverse.R;
import com.google.android.material.appbar.AppBarLayout;
import com.mgs.carparking.databinding.FragmentChannelLookBinding;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.ui.channelcontent.TypeChannelAdapter;
import com.mgs.carparking.widgets.AppBarStateChangeListener;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import ec.e;
import ec.g;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;

/* JADX INFO: loaded from: classes9.dex */
public class LookChannelFragment extends BaseFragment<FragmentChannelLookBinding, LOOKCHANNELVIEWMODEL> {
    private TypeChannelAdapter typeChannelAdapter;

    public class a extends AppBarStateChangeListener {
        public a() {
        }

        @Override // com.mgs.carparking.widgets.AppBarStateChangeListener
        public void a(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            if (state == AppBarStateChangeListener.State.EXPANDED) {
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f40130n.setText("");
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f40127k.setVisibility(8);
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f40125i.setVisibility(0);
            } else if (state == AppBarStateChangeListener.State.COLLAPSED) {
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f40130n.setText(((LOOKCHANNELVIEWMODEL) LookChannelFragment.this.viewModel).H());
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f40127k.setVisibility(0);
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f40125i.setVisibility(8);
            } else {
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f40130n.setText("");
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f40127k.setVisibility(8);
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f40125i.setVisibility(0);
            }
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // ec.g
        public void d(@NonNull f fVar) {
            ((LOOKCHANNELVIEWMODEL) LookChannelFragment.this.viewModel).V(true);
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // ec.e
        public void a(@NonNull f fVar) {
            ((LOOKCHANNELVIEWMODEL) LookChannelFragment.this.viewModel).V(false);
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_channel_look;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    private void initRefresh() {
        ((FragmentChannelLookBinding) this.binding).f40126j.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(getActivity());
        ((FragmentChannelLookBinding) this.binding).f40126j.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(getActivity()).u(12.0f);
        ((FragmentChannelLookBinding) this.binding).f40126j.L(new b());
        ((FragmentChannelLookBinding) this.binding).f40126j.K(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(Void r10) {
        ((FragmentChannelLookBinding) this.binding).f40126j.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Void r10) {
        ((FragmentChannelLookBinding) this.binding).f40126j.s();
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f41254l.set(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r10) {
        ((FragmentChannelLookBinding) this.binding).f40126j.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(Void r10) {
        ((FragmentChannelLookBinding) this.binding).f40126j.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(Void r10) {
        ((FragmentChannelLookBinding) this.binding).f40126j.J(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$6(Void r10) {
        ((FragmentChannelLookBinding) this.binding).f40118b.setExpanded(true);
    }

    public static LookChannelFragment newInstance(int i10) {
        LookChannelFragment lookChannelFragment = new LookChannelFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        lookChannelFragment.setArguments(bundle);
        return lookChannelFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public LOOKCHANNELVIEWMODEL initViewModel() {
        return new LOOKCHANNELVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$5(Integer num) {
        if (num.intValue() - 3 >= 0) {
            ((FragmentChannelLookBinding) this.binding).f40128l.scrollToPosition(num.intValue() - 3);
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        ((FragmentChannelLookBinding) this.binding).f40118b.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a());
        initRefresh();
        RequestManager requestManagerWith = Glide.with(this);
        Integer numValueOf = Integer.valueOf(R.drawable.ic_is_loading);
        requestManagerWith.load(numValueOf).into(((FragmentChannelLookBinding) this.binding).f40123g);
        Glide.with(this).load(numValueOf).into(((FragmentChannelLookBinding) this.binding).f40124h);
        TypeChannelAdapter typeChannelAdapter = new TypeChannelAdapter();
        this.typeChannelAdapter = typeChannelAdapter;
        ((FragmentChannelLookBinding) this.binding).f40128l.setAdapter(typeChannelAdapter);
        ((LOOKCHANNELVIEWMODEL) this.viewModel).U();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f41262t.observe(this, new Observer() { // from class: ba.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5302b.lambda$initViewObservable$0((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f41259q.observe(this, new Observer() { // from class: ba.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5303b.lambda$initViewObservable$1((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f41261s.observe(this, new Observer() { // from class: ba.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5304b.lambda$initViewObservable$2((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f41260r.observe(this, new Observer() { // from class: ba.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5305b.lambda$initViewObservable$3((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f41263u.observe(this, new Observer() { // from class: ba.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5306b.lambda$initViewObservable$4((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f41264v.observe(this, new Observer() { // from class: ba.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5307b.lambda$initViewObservable$5((Integer) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f41265w.observe(this, new Observer() { // from class: ba.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5308b.lambda$initViewObservable$6((Void) obj);
            }
        });
    }
}
