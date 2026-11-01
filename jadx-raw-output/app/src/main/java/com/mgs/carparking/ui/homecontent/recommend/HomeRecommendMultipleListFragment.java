package com.mgs.carparking.ui.homecontent.recommend;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cc.f;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.databinding.FragmentHomeRecommendMultipleListBinding;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.widgets.rv.StaggeredDividerItemDecoration;
import com.mgs.carparking.widgets.rv.TopSmoothScroller;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import ec.e;
import ec.g;
import ib.d;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import sa.c;
import sa.o0;
import x9.q;
import x9.s;

/* JADX INFO: loaded from: classes5.dex */
public class HomeRecommendMultipleListFragment extends BaseFragment<FragmentHomeRecommendMultipleListBinding, HomeRecommendMultipleListViewModel> {
    private HomeRecommendMultipleListAdapter adapter;
    private StaggeredGridLayoutManager layoutManager;
    private boolean mShouldScroll;
    private int mToPosition;
    public boolean mIsPrepare = false;
    public boolean mIsVisible = false;
    public boolean mIsFirstLoad = true;

    public class a implements g {
        @Override // ec.g
        public void d(@NonNull f fVar) {
            AppApplication.bannerIndex = 0;
            ((HomeRecommendMultipleListViewModel) HomeRecommendMultipleListFragment.this.viewModel).w(true, false);
        }

        public a() {
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // ec.e
        public void a(@NonNull f fVar) {
            ((HomeRecommendMultipleListViewModel) HomeRecommendMultipleListFragment.this.viewModel).x(false);
        }
    }

    private void initRefresh() {
        AppApplication.bannerIndex = 0;
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40227d.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(getActivity());
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40227d.I(true);
        classicsHeader.u(12.0f);
        classicsHeader.s(getResources().getColor(R.color.color_f7f7f7));
        ClassicsFooter classicsFooter = new ClassicsFooter(getActivity());
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40227d.G(true);
        classicsFooter.u(12.0f);
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40227d.L(new a());
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40227d.K(new b());
    }

    private void smoothMoveToPosition(RecyclerView recyclerView, int i10) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0));
        int childLayoutPosition2 = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
        if (i10 < childLayoutPosition) {
            recyclerView.smoothScrollToPosition(i10);
            return;
        }
        if (i10 > childLayoutPosition2) {
            recyclerView.smoothScrollToPosition(i10);
            this.mToPosition = i10;
            this.mShouldScroll = true;
        } else {
            int i11 = i10 - childLayoutPosition;
            if (i11 < 0 || i11 >= recyclerView.getChildCount()) {
                return;
            }
            recyclerView.smoothScrollBy(0, recyclerView.getChildAt(i11).getTop());
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_home_recommend_multiple_list;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(Void r10) {
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40227d.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Void r10) {
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40227d.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r10) {
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40227d.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(Void r10) {
        TopSmoothScroller topSmoothScroller = new TopSmoothScroller(getActivity());
        topSmoothScroller.setTargetPosition(((HomeRecommendMultipleListViewModel) this.viewModel).f41879i - 1);
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40228e.getLayoutManager().startSmoothScroll(topSmoothScroller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$5(s sVar) throws Exception {
        if (this.mIsVisible) {
            ((FragmentHomeRecommendMultipleListBinding) this.binding).f40228e.smoothScrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$6(q qVar) throws Exception {
        ((HomeRecommendMultipleListViewModel) this.viewModel).w(true, true);
    }

    private void lazyLoad() {
        if (this.mIsPrepare && this.mIsVisible && this.mIsFirstLoad) {
            loadData();
            this.mIsFirstLoad = false;
        }
    }

    private void loadData() {
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40228e.setPadding(0, 0, 0, 0);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        this.layoutManager = staggeredGridLayoutManager;
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40228e.setLayoutManager(staggeredGridLayoutManager);
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40228e.addItemDecoration(new StaggeredDividerItemDecoration(getActivity(), (int) getResources().getDimension(R.dimen.dp_6)));
        HomeRecommendMultipleListAdapter homeRecommendMultipleListAdapter = new HomeRecommendMultipleListAdapter(getActivity(), getActivity());
        this.adapter = homeRecommendMultipleListAdapter;
        ((FragmentHomeRecommendMultipleListBinding) this.binding).f40228e.setAdapter(homeRecommendMultipleListAdapter);
        this.adapter.notifyDataSetChanged();
        ((HomeRecommendMultipleListViewModel) this.viewModel).v();
    }

    public static HomeRecommendMultipleListFragment newInstance(int i10) {
        HomeRecommendMultipleListFragment homeRecommendMultipleListFragment = new HomeRecommendMultipleListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        homeRecommendMultipleListFragment.setArguments(bundle);
        return homeRecommendMultipleListFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public HomeRecommendMultipleListViewModel initViewModel() {
        return new HomeRecommendMultipleListViewModel(BaseApplication.getInstance(), i9.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(RecommandVideosEntity recommandVideosEntity) {
        if (!sa.e.q()) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", recommandVideosEntity.getId());
            startActivity(VideoPlayDetailActivity.class, bundle);
            c.j("50000", 2, recommandVideosEntity.getModule_id(), ((HomeRecommendMultipleListViewModel) this.viewModel).f41876f, recommandVideosEntity.getId(), o0.T());
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        ((HomeRecommendMultipleListViewModel) this.viewModel).y(arguments.getInt("resourceType", 0));
        initRefresh();
        d.b(getActivity(), R.drawable.ic_is_loading, ((FragmentHomeRecommendMultipleListBinding) this.binding).f40226c, true);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((HomeRecommendMultipleListViewModel) this.viewModel).f41883m.observe(this, new Observer() { // from class: ea.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52467b.lambda$initViewObservable$0((Void) obj);
            }
        });
        ((HomeRecommendMultipleListViewModel) this.viewModel).f41885o.observe(this, new Observer() { // from class: ea.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52474b.lambda$initViewObservable$1((Void) obj);
            }
        });
        ((HomeRecommendMultipleListViewModel) this.viewModel).f41884n.observe(this, new Observer() { // from class: ea.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52476b.lambda$initViewObservable$2((Void) obj);
            }
        });
        ((HomeRecommendMultipleListViewModel) this.viewModel).f41886p.observe(this, new Observer() { // from class: ea.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52485b.lambda$initViewObservable$3((RecommandVideosEntity) obj);
            }
        });
        ((HomeRecommendMultipleListViewModel) this.viewModel).f41887q.observe(this, new Observer() { // from class: ea.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f52486b.lambda$initViewObservable$4((Void) obj);
            }
        });
        addSubscribe(tl.a.a().d(s.class).subscribe(new oi.g() { // from class: ea.f
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52488b.lambda$initViewObservable$5((x9.s) obj);
            }
        }));
        addSubscribe(tl.a.a().d(q.class).subscribe(new oi.g() { // from class: ea.g
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f52490b.lambda$initViewObservable$6((x9.q) obj);
            }
        }));
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.adapter != null) {
            this.adapter = null;
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
