package com.mgs.carparking.ui.homecontent;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.fvvcl.flickverse.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.adapter.PagerAdapter;
import com.mgs.carparking.databinding.FragmentHomeBinding;
import com.mgs.carparking.netbean.HomeTitleEntry;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.ui.channelcontent.ChannelFragment;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListFragment;
import em.n;
import ib.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import sa.g;
import sa.o0;
import x9.r;
import x9.w;

/* JADX INFO: loaded from: classes6.dex */
public class HomePageFragment extends BaseFragment<FragmentHomeBinding, HomePageViewModel> implements jb.a {
    private PagerAdapter pagerAdapter;
    private RelativeLayout.LayoutParams params;
    private List<HotNewSearchEntry> searchEntryList;
    private ArrayList<BaseFragment> fragmentList = new ArrayList<>();
    private ArrayList<String> titleList = new ArrayList<>();
    private int showOnce = 0;
    private int position = 0;
    private List<HomeTitleEntry> titleOperateList = new ArrayList();

    public class a implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ((FragmentHomeBinding) HomePageFragment.this.binding).f40166m.setCurrentItem(tab.getPosition());
            View customView = tab.getCustomView();
            if (customView == null || !(customView instanceof TextView)) {
                return;
            }
            TextView textView = (TextView) customView;
            textView.setTextSize(17.0f);
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextColor(ContextCompat.getColor(HomePageFragment.this.getActivity(), R.color.color_home_top_tab_selector));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null && (customView instanceof TextView)) {
                TextView textView = (TextView) customView;
                textView.setTextSize(17.0f);
                textView.setTypeface(Typeface.defaultFromStyle(0));
                textView.setTextColor(ContextCompat.getColor(HomePageFragment.this.getActivity(), R.color.color_home_top_tab_unselector));
            }
        }
    }

    public class b implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            HomePageFragment.this.position = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(r rVar) throws Exception {
        for (int i10 = 0; i10 < this.titleOperateList.size(); i10++) {
            if (this.titleOperateList.get(i10).getId() == rVar.getType()) {
                ((FragmentHomeBinding) this.binding).f40166m.setCurrentItem(i10);
            }
        }
    }

    @Override // jb.a
    public BaseFragment getFragment() {
        return this;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_home;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    public void onMenuItemClick() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(List list) {
        if (this.searchEntryList.size() != 0 || list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((HotNewSearchEntry) it.next()).getName());
        }
        ((FragmentHomeBinding) this.binding).f40160g.setList(arrayList);
        ((FragmentHomeBinding) this.binding).f40160g.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.titleOperateList = list;
        initTitle(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r10) {
        if (this.titleOperateList.size() > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt("video_type", this.titleOperateList.get(this.position).getVod_type_id());
            startActivity(ChannelFragment.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(w wVar) throws Exception {
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.a();
        }
        ((FragmentHomeBinding) this.binding).f40163j.removeAllTabs();
        ((FragmentHomeBinding) this.binding).f40166m.removeAllViews();
        ((HomePageViewModel) this.viewModel).E();
    }

    public void initTitle(List<HomeTitleEntry> list) {
        this.fragmentList.clear();
        this.titleList.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 == 0 && list.get(i10).getVod_type_id() == 0) {
                this.titleList.add(list.get(i10).getChannel_name());
                this.fragmentList.add(HomeRecommendMultipleListFragment.newInstance(list.get(i10).getId()));
            } else {
                this.titleList.add(list.get(i10).getChannel_name());
                this.fragmentList.add(HomeContentMultipleListFragment.newInstance(list.get(i10).getId()));
            }
        }
        ((FragmentHomeBinding) this.binding).f40163j.setTabMode(0);
        this.pagerAdapter = new PagerAdapter(getChildFragmentManager(), this);
        V v10 = this.binding;
        ((FragmentHomeBinding) v10).f40163j.setupWithViewPager(((FragmentHomeBinding) v10).f40166m);
        this.pagerAdapter.b(this.fragmentList);
        this.pagerAdapter.c(this.titleList);
        this.pagerAdapter.notifyDataSetChanged();
        ((FragmentHomeBinding) this.binding).f40166m.setAdapter(this.pagerAdapter);
        for (int i11 = 0; i11 < this.titleList.size(); i11++) {
            TabLayout.Tab tabAt = ((FragmentHomeBinding) this.binding).f40163j.getTabAt(i11);
            if (tabAt != null) {
                tabAt.setCustomView(getTabView(i11));
            }
        }
        this.params = (RelativeLayout.LayoutParams) ((FragmentHomeBinding) this.binding).f40161h.getLayoutParams();
        getActivity().getWindowManager().getDefaultDisplay();
        ((FragmentHomeBinding) this.binding).f40163j.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
        ((FragmentHomeBinding) this.binding).f40166m.addOnPageChangeListener(new b());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public HomePageViewModel initViewModel() {
        return new HomePageViewModel(BaseApplication.getInstance(), i9.a.a());
    }

    private View getTabView(int i10) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.layout_tab, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tab_item_textview);
        if (i10 == 0) {
            textView.setText(this.titleList.get(i10));
            textView.setTextSize(21.0f);
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextColor(getResources().getColor(R.color.color_home_top_tab_selector));
        } else {
            textView.setText(this.titleList.get(i10));
            textView.setTextSize(17.0f);
            ((TextView) viewInflate).setTypeface(Typeface.defaultFromStyle(0));
            textView.setTextColor(getResources().getColor(R.color.color_home_top_tab_unselector));
        }
        return viewInflate;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        d.b(getActivity(), R.drawable.ic_is_loading, ((FragmentHomeBinding) this.binding).f40155b, true);
        List<HotNewSearchEntry> listD = g.d("CACHE_HOT_SEARCH", HotNewSearchEntry.class);
        this.searchEntryList = listD;
        if (listD != null && listD.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<HotNewSearchEntry> it = this.searchEntryList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getName());
            }
            ((FragmentHomeBinding) this.binding).f40160g.setList(arrayList);
            ((FragmentHomeBinding) this.binding).f40160g.s();
        }
        ((HomePageViewModel) this.viewModel).E();
        ((HomePageViewModel) this.viewModel).G();
        ((HomePageViewModel) this.viewModel).H();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((HomePageViewModel) this.viewModel).f41828j.observe(this, new Observer() { // from class: ca.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5767b.lambda$initViewObservable$0((List) obj);
            }
        });
        ((HomePageViewModel) this.viewModel).f41827i.observe(this, new Observer() { // from class: ca.q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5769b.lambda$initViewObservable$1((List) obj);
            }
        });
        ((HomePageViewModel) this.viewModel).f41829k.observe(this, new Observer() { // from class: ca.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f5776b.lambda$initViewObservable$2((Void) obj);
            }
        });
        addSubscribe(tl.a.a().d(r.class).subscribe(new oi.g() { // from class: ca.s
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f5778b.lambda$initViewObservable$3((x9.r) obj);
            }
        }));
        addSubscribe(tl.a.a().d(w.class).subscribe(new oi.g() { // from class: ca.t
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f5787b.lambda$initViewObservable$4((x9.w) obj);
            }
        }));
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((FragmentHomeBinding) this.binding).f40160g.t();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        if (o0.N() == 0 && !z10) {
            this.showOnce++;
        }
        if (!z10) {
            n.a(getActivity());
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
