package com.mgs.carparking.ui.ranklist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.adapter.PagerAdapter;
import com.mgs.carparking.databinding.FragmentRankNewBinding;
import com.mgs.carparking.netbean.SpecialList;
import com.mgs.carparking.netbean.TopicPidList;
import em.n;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import oi.g;
import x9.w;

/* JADX INFO: loaded from: classes8.dex */
public class RankNumberNewFragment extends BaseFragment<FragmentRankNewBinding, RankNumberNewViewModel> implements jb.a {
    private RankTopicListAdapter adapter;
    private PagerAdapter pagerAdapter;
    private ArrayList<BaseFragment> fragmentList = new ArrayList<>();
    private ArrayList<String> titleList = new ArrayList<>();
    private int mPid = 0;

    public class a implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            RankContentListFragment rankContentListFragment = (RankContentListFragment) RankNumberNewFragment.this.getChildFragmentManager().findFragmentByTag("android:switcher:" + ((FragmentRankNewBinding) RankNumberNewFragment.this.binding).f40284h.getId() + StringUtils.PROCESS_POSTFIX_DELIMITER + tab.getPosition());
            if (rankContentListFragment != null) {
                rankContentListFragment.refreshPid(RankNumberNewFragment.this.mPid);
            }
        }
    }

    public class b implements RankTopicListAdapter.c {
        public b() {
        }

        @Override // com.mgs.carparking.ui.ranklist.RankTopicListAdapter.c
        public void a(List<TopicPidList> list, int i10) {
            if (!list.get(i10).isSelector()) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    list.get(i11).setSelector(false);
                }
                list.get(i10).setSelector(true);
                RankNumberNewFragment.this.adapter.notifyDataSetChanged();
                RankContentListFragment rankContentListFragment = (RankContentListFragment) RankNumberNewFragment.this.getChildFragmentManager().findFragmentByTag("android:switcher:" + ((FragmentRankNewBinding) RankNumberNewFragment.this.binding).f40284h.getId() + StringUtils.PROCESS_POSTFIX_DELIMITER + ((FragmentRankNewBinding) RankNumberNewFragment.this.binding).f40284h.getCurrentItem());
                if (rankContentListFragment != null) {
                    rankContentListFragment.setPid(list.get(i10).getPid());
                }
                RankNumberNewFragment.this.mPid = list.get(i10).getPid();
            }
        }
    }

    @Override // jb.a
    public BaseFragment getFragment() {
        return this;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_rank_new;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    public void onMenuItemClick() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(w wVar) throws Exception {
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.a();
        }
        ((FragmentRankNewBinding) this.binding).f40280d.removeAllTabs();
        ((FragmentRankNewBinding) this.binding).f40284h.removeAllViews();
        ((RankNumberNewViewModel) this.viewModel).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(List list) {
        this.fragmentList.clear();
        this.titleList.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            V v10 = this.binding;
            ((FragmentRankNewBinding) v10).f40280d.addTab(((FragmentRankNewBinding) v10).f40280d.newTab().setText(((SpecialList) list.get(i10)).getName()));
            this.titleList.add(((SpecialList) list.get(i10)).getName());
            this.fragmentList.add(RankContentListFragment.newInstance(0, ((SpecialList) list.get(i10)).getId()));
        }
        ((FragmentRankNewBinding) this.binding).f40280d.setTabMode(0);
        ((FragmentRankNewBinding) this.binding).f40281e.setVisibility(0);
        this.pagerAdapter = new PagerAdapter(getChildFragmentManager(), this);
        V v11 = this.binding;
        ((FragmentRankNewBinding) v11).f40280d.setupWithViewPager(((FragmentRankNewBinding) v11).f40284h);
        this.pagerAdapter.b(this.fragmentList);
        this.pagerAdapter.c(this.titleList);
        ((FragmentRankNewBinding) this.binding).f40284h.setAdapter(this.pagerAdapter);
        ((FragmentRankNewBinding) this.binding).f40280d.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(List list) {
        if (list == null) {
            ((FragmentRankNewBinding) this.binding).f40279c.setVisibility(8);
            return;
        }
        ((TopicPidList) list.get(0)).setSelector(true);
        ((FragmentRankNewBinding) this.binding).f40279c.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        RankTopicListAdapter rankTopicListAdapter = new RankTopicListAdapter(getActivity());
        this.adapter = rankTopicListAdapter;
        ((FragmentRankNewBinding) this.binding).f40279c.setAdapter(rankTopicListAdapter);
        this.adapter.g(new b());
        this.adapter.h(list);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public RankNumberNewViewModel initViewModel() {
        return new RankNumberNewViewModel(BaseApplication.getInstance(), i9.a.a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        Glide.with(this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((FragmentRankNewBinding) this.binding).f40278b);
        ((RankNumberNewViewModel) this.viewModel).o();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        super.initViewObservable();
        addSubscribe(tl.a.a().d(w.class).subscribe(new g() { // from class: pa.m
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f66104b.lambda$initViewObservable$0((w) obj);
            }
        }));
        ((RankNumberNewViewModel) this.viewModel).f42174f.observe(this, new Observer() { // from class: pa.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f66105b.lambda$initViewObservable$1((List) obj);
            }
        });
        ((RankNumberNewViewModel) this.viewModel).f42175g.observe(this, new Observer() { // from class: pa.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f66106b.lambda$initViewObservable$2((List) obj);
            }
        });
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        if (!z10) {
            n.a(getActivity());
        }
    }
}
