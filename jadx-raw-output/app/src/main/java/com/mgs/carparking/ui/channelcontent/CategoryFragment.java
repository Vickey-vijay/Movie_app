package com.mgs.carparking.ui.channelcontent;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.fvvcl.flickverse.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.adapter.PagerAdapter;
import com.mgs.carparking.databinding.FragmentCategoryBinding;
import com.mgs.carparking.model.CATEGORYVIEWMODEL;
import com.mgs.carparking.ui.channelcontent.lookcategory.LookChannelFragment;
import em.n;
import java.util.ArrayList;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;

/* JADX INFO: loaded from: classes8.dex */
public class CategoryFragment extends BaseFragment<FragmentCategoryBinding, CATEGORYVIEWMODEL> implements jb.a {
    private PagerAdapter pagerAdapter;
    private ArrayList<BaseFragment> fragmentList = new ArrayList<>();
    private ArrayList<String> titleList = new ArrayList<>();

    public class a implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ((FragmentCategoryBinding) CategoryFragment.this.binding).f40086d.setCurrentItem(tab.getPosition());
            View customView = tab.getCustomView();
            if (customView == null || !(customView instanceof TextView)) {
                return;
            }
            TextView textView = (TextView) customView;
            textView.setTextSize(19.0f);
            textView.setTextColor(ContextCompat.getColor(CategoryFragment.this.getActivity(), R.color.color_home_top_tab_selector));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null && (customView instanceof TextView)) {
                TextView textView = (TextView) customView;
                textView.setTextSize(19.0f);
                textView.setTextColor(ContextCompat.getColor(CategoryFragment.this.getActivity(), R.color.color_home_top_tab_unselector));
            }
        }
    }

    @Override // jb.a
    public BaseFragment getFragment() {
        return this;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_category;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    public void onMenuItemClick() {
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public CATEGORYVIEWMODEL initViewModel() {
        return new CATEGORYVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    private View getTabView(int i10) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.layout_tab, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tab_item_textview);
        if (i10 == 0) {
            textView.setText(this.titleList.get(i10));
            textView.setTextSize(19.0f);
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextColor(getResources().getColor(R.color.color_home_top_tab_selector));
        } else {
            textView.setText(this.titleList.get(i10));
            textView.setTextSize(19.0f);
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextColor(getResources().getColor(R.color.color_home_top_tab_unselector));
        }
        return viewInflate;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        this.titleList.add(getString(R.string.text_tab_classi));
        this.fragmentList.add(LookChannelFragment.newInstance(0));
        ((FragmentCategoryBinding) this.binding).f40084b.setTabMode(1);
        this.pagerAdapter = new PagerAdapter(getChildFragmentManager(), this);
        V v10 = this.binding;
        ((FragmentCategoryBinding) v10).f40084b.setupWithViewPager(((FragmentCategoryBinding) v10).f40086d);
        this.pagerAdapter.b(this.fragmentList);
        this.pagerAdapter.c(this.titleList);
        ((FragmentCategoryBinding) this.binding).f40086d.setAdapter(this.pagerAdapter);
        for (int i10 = 0; i10 < this.titleList.size(); i10++) {
            TabLayout.Tab tabAt = ((FragmentCategoryBinding) this.binding).f40084b.getTabAt(i10);
            if (tabAt != null) {
                tabAt.setCustomView(getTabView(i10));
            }
        }
        ((FragmentCategoryBinding) this.binding).f40084b.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
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
