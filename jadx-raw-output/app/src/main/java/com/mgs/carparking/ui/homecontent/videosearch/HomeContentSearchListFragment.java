package com.mgs.carparking.ui.homecontent.videosearch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cc.f;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.ironsource.C3426d4;
import com.mgs.carparking.databinding.FragmentHomeContentSearchListBinding;
import com.mgs.carparking.model.HOMECONTENTSEARCHLISTVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.ui.homecontent.videosearch.HomeContentSearchListFragment;
import com.mgs.carparking.ui.mine.feedback.FeedbackActivity;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import ec.e;
import ec.g;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import sa.o0;

/* JADX INFO: loaded from: classes5.dex */
public class HomeContentSearchListFragment extends BaseFragment<FragmentHomeContentSearchListBinding, HOMECONTENTSEARCHLISTVIEWMODEL> {
    private SearchMultipleListAdapter adapter;
    private String keyword;
    private LinearLayoutManager layoutManager;
    private int videoType;
    public boolean mIsPrepare = false;
    public boolean mIsVisible = false;
    public boolean mIsFirstLoad = true;
    public int visibleItemCount = 0;

    public class a extends RecyclerView.OnScrollListener {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i10, int i11) {
            HomeContentSearchListFragment.this.visibleItemCount = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
            HomeContentSearchListFragment homeContentSearchListFragment = HomeContentSearchListFragment.this;
            if (homeContentSearchListFragment.visibleItemCount == 6) {
                ((HOMECONTENTSEARCHLISTVIEWMODEL) homeContentSearchListFragment.viewModel).f41219j.set(true);
            }
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // ec.g
        public void d(@NonNull f fVar) {
            ((HOMECONTENTSEARCHLISTVIEWMODEL) HomeContentSearchListFragment.this.viewModel).x(true, HomeContentSearchListFragment.this.videoType, HomeContentSearchListFragment.this.keyword);
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // ec.e
        public void a(@NonNull f fVar) {
            ((HOMECONTENTSEARCHLISTVIEWMODEL) HomeContentSearchListFragment.this.viewModel).x(false, HomeContentSearchListFragment.this.videoType, HomeContentSearchListFragment.this.keyword);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initViewObservable$6(VideoBean videoBean) {
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_home_content_search_list;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    private void initRefresh() {
        ((FragmentHomeContentSearchListBinding) this.binding).f40207d.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(getActivity());
        ((FragmentHomeContentSearchListBinding) this.binding).f40207d.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(getActivity()).u(12.0f);
        ((FragmentHomeContentSearchListBinding) this.binding).f40207d.L(new b());
        ((FragmentHomeContentSearchListBinding) this.binding).f40207d.K(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(Void r10) {
        ((FragmentHomeContentSearchListBinding) this.binding).f40207d.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Void r10) {
        ((FragmentHomeContentSearchListBinding) this.binding).f40207d.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r10) {
        ((FragmentHomeContentSearchListBinding) this.binding).f40207d.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(RecommandVideosEntity recommandVideosEntity) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", recommandVideosEntity.getId());
        bundle.putInt(C3426d4.i.L, recommandVideosEntity.getComicPosition() - 1);
        startActivity(VideoPlayDetailActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$5(RecommandVideosEntity recommandVideosEntity) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", recommandVideosEntity.getId());
        bundle.putInt(C3426d4.i.L, recommandVideosEntity.getComicPosition() - 2);
        startActivity(VideoPlayDetailActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$7(Void r10) {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).x(true, this.videoType, this.keyword);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$8(Void r10) {
        Bundle bundle = new Bundle();
        bundle.putString("content", this.keyword);
        bundle.putInt("flag", 1);
        startActivity(FeedbackActivity.class, bundle);
    }

    private void lazyLoad() {
        if (this.mIsPrepare && this.mIsVisible && this.mIsFirstLoad) {
            loadData();
            this.mIsFirstLoad = false;
        }
    }

    private void loadData() {
        ((FragmentHomeContentSearchListBinding) this.binding).f40208e.setPadding(0, 0, 0, 0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.layoutManager = linearLayoutManager;
        ((FragmentHomeContentSearchListBinding) this.binding).f40208e.setLayoutManager(linearLayoutManager);
        SearchMultipleListAdapter searchMultipleListAdapter = new SearchMultipleListAdapter(getActivity(), getActivity());
        this.adapter = searchMultipleListAdapter;
        ((FragmentHomeContentSearchListBinding) this.binding).f40208e.setAdapter(searchMultipleListAdapter);
        this.adapter.notifyDataSetChanged();
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).x(false, this.videoType, this.keyword);
    }

    public static HomeContentSearchListFragment newInstance(int i10, String str) {
        HomeContentSearchListFragment homeContentSearchListFragment = new HomeContentSearchListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        bundle.putString("keyword", str);
        homeContentSearchListFragment.setArguments(bundle);
        return homeContentSearchListFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public HOMECONTENTSEARCHLISTVIEWMODEL initViewModel() {
        return new HOMECONTENTSEARCHLISTVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(RecommandVideosEntity recommandVideosEntity) {
        if (!sa.e.q()) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", recommandVideosEntity.getId());
            startActivity(VideoPlayDetailActivity.class, bundle);
            sa.c.j("50008", 2, 0, 0, recommandVideosEntity.getId(), o0.T());
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        this.videoType = arguments.getInt("resourceType", 0);
        this.keyword = arguments.getString("keyword");
        initRefresh();
        Glide.with(this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((FragmentHomeContentSearchListBinding) this.binding).f40206c);
        ((FragmentHomeContentSearchListBinding) this.binding).f40208e.addOnScrollListener(new a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f41221l.observe(this, new Observer() { // from class: ga.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53202b.lambda$initViewObservable$0((Void) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f41223n.observe(this, new Observer() { // from class: ga.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53203b.lambda$initViewObservable$1((Void) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f41222m.observe(this, new Observer() { // from class: ga.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53204b.lambda$initViewObservable$2((Void) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f41225p.observe(this, new Observer() { // from class: ga.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53205b.lambda$initViewObservable$3((RecommandVideosEntity) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f41227r.observe(this, new Observer() { // from class: ga.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53206b.lambda$initViewObservable$4((RecommandVideosEntity) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f41228s.observe(this, new Observer() { // from class: ga.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53207b.lambda$initViewObservable$5((RecommandVideosEntity) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f41226q.observe(this, new Observer() { // from class: ga.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeContentSearchListFragment.lambda$initViewObservable$6((VideoBean) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f41224o.observe(this, new Observer() { // from class: ga.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53208b.lambda$initViewObservable$7((Void) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f41220k.observe(this, new Observer() { // from class: ga.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53209b.lambda$initViewObservable$8((Void) obj);
            }
        });
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
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
