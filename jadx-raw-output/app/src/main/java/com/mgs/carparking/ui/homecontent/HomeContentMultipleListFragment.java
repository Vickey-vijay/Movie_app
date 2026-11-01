package com.mgs.carparking.ui.homecontent;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import cc.f;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.databinding.FragmentHomeContentMultipleListBinding;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import ec.e;
import ec.g;
import ib.d;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import sa.c;
import sa.o0;

/* JADX INFO: loaded from: classes2.dex */
public class HomeContentMultipleListFragment extends BaseFragment<FragmentHomeContentMultipleListBinding, HomeContentMultipleListViewModel> {
    private HomeContentMultipleListAdapter adapter;
    public boolean mIsPrepare = false;
    public boolean mIsVisible = false;
    public boolean mIsFirstLoad = true;
    private Handler handler = new Handler();

    public class a implements g {
        public a() {
        }

        @Override // ec.g
        public void d(@NonNull f fVar) {
            if (((FragmentHomeContentMultipleListBinding) HomeContentMultipleListFragment.this.binding).f40193d.A()) {
                return;
            }
            AppApplication.bannerIndex = 0;
            ((HomeContentMultipleListViewModel) HomeContentMultipleListFragment.this.viewModel).v(true, false);
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // ec.e
        public void a(@NonNull f fVar) {
            if (((FragmentHomeContentMultipleListBinding) HomeContentMultipleListFragment.this.binding).f40193d.B()) {
                return;
            }
            ((HomeContentMultipleListViewModel) HomeContentMultipleListFragment.this.viewModel).v(false, false);
        }
    }

    private void initRefresh() {
        AppApplication.bannerIndex = 0;
        ((FragmentHomeContentMultipleListBinding) this.binding).f40193d.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(getActivity());
        ((FragmentHomeContentMultipleListBinding) this.binding).f40193d.I(true);
        classicsHeader.u(12.0f);
        classicsHeader.s(getResources().getColor(R.color.color_f7f7f7));
        ClassicsFooter classicsFooter = new ClassicsFooter(getActivity());
        ((FragmentHomeContentMultipleListBinding) this.binding).f40193d.G(true);
        classicsFooter.u(12.0f);
        ((FragmentHomeContentMultipleListBinding) this.binding).f40193d.L(new a());
        ((FragmentHomeContentMultipleListBinding) this.binding).f40193d.K(new b());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_home_content_multiple_list;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(Void r10) {
        ((FragmentHomeContentMultipleListBinding) this.binding).f40193d.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Void r10) {
        ((FragmentHomeContentMultipleListBinding) this.binding).f40193d.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r10) {
        ((FragmentHomeContentMultipleListBinding) this.binding).f40193d.r();
    }

    private void lazyLoad() {
        if (this.mIsPrepare && this.mIsVisible && this.mIsFirstLoad) {
            loadData();
            this.mIsFirstLoad = false;
        }
    }

    private void loadData() {
        ((FragmentHomeContentMultipleListBinding) this.binding).f40193d.m();
        HomeContentMultipleListAdapter homeContentMultipleListAdapter = new HomeContentMultipleListAdapter(getActivity(), getActivity());
        this.adapter = homeContentMultipleListAdapter;
        ((FragmentHomeContentMultipleListBinding) this.binding).f40194e.setAdapter(homeContentMultipleListAdapter);
        ((HomeContentMultipleListViewModel) this.viewModel).u(this.handler);
    }

    public static HomeContentMultipleListFragment newInstance(int i10) {
        HomeContentMultipleListFragment homeContentMultipleListFragment = new HomeContentMultipleListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        homeContentMultipleListFragment.setArguments(bundle);
        return homeContentMultipleListFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public HomeContentMultipleListViewModel initViewModel() {
        return new HomeContentMultipleListViewModel(BaseApplication.getInstance(), i9.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(RecommandVideosEntity recommandVideosEntity) {
        if (!sa.e.q()) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", recommandVideosEntity.getId());
            startActivity(VideoPlayDetailActivity.class, bundle);
            c.j("50000", 2, recommandVideosEntity.getModule_id(), ((HomeContentMultipleListViewModel) this.viewModel).f41799f, recommandVideosEntity.getId(), o0.T());
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        ((HomeContentMultipleListViewModel) this.viewModel).w(arguments.getInt("resourceType", 0));
        initRefresh();
        d.b(getActivity(), R.drawable.ic_is_loading, ((FragmentHomeContentMultipleListBinding) this.binding).f40192c, true);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((HomeContentMultipleListViewModel) this.viewModel).f41803j.observe(this, new Observer() { // from class: ca.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5748b.lambda$initViewObservable$0((Void) obj);
            }
        });
        ((HomeContentMultipleListViewModel) this.viewModel).f41805l.observe(this, new Observer() { // from class: ca.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5753b.lambda$initViewObservable$1((Void) obj);
            }
        });
        ((HomeContentMultipleListViewModel) this.viewModel).f41804k.observe(this, new Observer() { // from class: ca.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5754b.lambda$initViewObservable$2((Void) obj);
            }
        });
        ((HomeContentMultipleListViewModel) this.viewModel).f41806m.observe(this, new Observer() { // from class: ca.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5758b.lambda$initViewObservable$3((RecommandVideosEntity) obj);
            }
        });
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.adapter != null) {
            this.adapter = null;
        }
        if (this.handler != null) {
            this.handler = null;
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mIsPrepare = true;
        lazyLoad();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (z10) {
            this.mIsVisible = true;
            lazyLoad();
        } else {
            this.mIsVisible = false;
        }
    }
}
