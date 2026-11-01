package com.mgs.carparking.ui.homecontent;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import ca.c1;
import ca.k0;
import ca.m0;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.widgets.BannerView;
import com.mgs.carparking.widgets.viewpager.GalleryAdapter;
import com.mgs.carparking.widgets.viewpager.MyGallyPageTransformer;
import com.mgs.carparking.widgets.viewpager.MyOnPageChangeListener;
import ea.q0;
import java.util.ArrayList;
import java.util.List;
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;
import sa.q;
import sl.e;

/* JADX INFO: loaded from: classes9.dex */
public class HomeContentMultipleListAdapter<T extends e> extends BindingRecyclerViewAdapter<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f41790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Activity f41791s;

    public class a implements BannerView.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f41792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c1 f41793b;

        public a(boolean z10, c1 c1Var) {
            this.f41792a = z10;
            this.f41793b = c1Var;
        }

        @Override // com.mgs.carparking.widgets.BannerView.c
        public void a(int i10, BannerView.Banner banner) {
            if (i10 > 0 && this.f41792a) {
                i10--;
            }
            if (this.f41793b.f5715c.get(i10).getJump_type() != 1) {
                q.a(HomeContentMultipleListAdapter.this.f41790r, this.f41793b.f5715c.get(i10).getJump_type(), this.f41793b.f5715c.get(i10).getJump_url(), this.f41793b.f5715c.get(i10).getContent());
                return;
            }
            this.f41793b.f5715c.get(i10).getVod_info().setModule_id(this.f41793b.f5717e);
            c1 c1Var = this.f41793b;
            c1Var.f5716d.setValue(c1Var.f5715c.get(i10).getVod_info());
            this.f41793b.f5719g.b();
        }
    }

    public class b implements GalleryAdapter.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k0 f41795a;

        public b(k0 k0Var) {
            this.f41795a = k0Var;
        }

        @Override // com.mgs.carparking.widgets.viewpager.GalleryAdapter.b
        public void a(int i10) {
            k0 k0Var = this.f41795a;
            k0Var.f5750d.setValue(k0Var.f5749c.getVideoList().get(i10));
            this.f41795a.f5752f.b();
        }
    }

    public HomeContentMultipleListAdapter(Context context, Activity activity) {
        this.f41790r = context;
        this.f41791s = activity;
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void f(ViewDataBinding viewDataBinding, int i10, int i11, int i12, T t10) {
        super.f(viewDataBinding, i10, i11, i12, t10);
        Object objA = t10.a();
        boolean z10 = false;
        if ("TYPE_HOME_VIDEO_SLIDE".equals(objA)) {
            if (t10 instanceof c1) {
                c1 c1Var = (c1) t10;
                BannerView bannerView = (BannerView) viewDataBinding.getRoot().findViewById(R.id.home_banner);
                ArrayList<BannerView.Banner> arrayList = new ArrayList<>();
                List<BlockListEntry> list = c1Var.f5715c;
                if (list != null && list.size() > 0) {
                    arrayList.add(new BannerView.Banner(null, null, c1Var.f5715c.get(0).getBanner_pic(), "", c1Var.f5715c.get(0).getContent(), true, true));
                    if (!c1Var.f5718f && AppApplication.adInfoEntry.getAd_position_2() != null && AppApplication.adInfoEntry.getAd_position_2().size() > 0) {
                        sa.b.g(this.f41791s, null, arrayList, AppApplication.adInfoEntry.getAd_position_2());
                        z10 = true;
                    }
                    if (c1Var.f5715c.size() > 1) {
                        for (int i13 = 1; i13 < c1Var.f5715c.size(); i13++) {
                            arrayList.add(new BannerView.Banner(null, null, c1Var.f5715c.get(i13).getBanner_pic(), "", c1Var.f5715c.get(i13).getContent(), true, true));
                        }
                    }
                    bannerView.f(arrayList, new a(z10, c1Var));
                    return;
                }
                return;
            }
            return;
        }
        if ("TYPE_HOME_VIDEO_GALLERY".equals(objA)) {
            if (t10 instanceof k0) {
                k0 k0Var = (k0) t10;
                ViewPager viewPager = (ViewPager) viewDataBinding.getRoot().findViewById(R.id.viewPager);
                viewPager.setPageTransformer(true, new MyGallyPageTransformer());
                GalleryAdapter galleryAdapter = new GalleryAdapter(this.f41790r, k0Var.f5749c.getVideoList());
                viewPager.setAdapter(galleryAdapter);
                viewPager.setOffscreenPageLimit(5);
                viewPager.setPageMargin(2);
                viewPager.addOnPageChangeListener(new MyOnPageChangeListener(viewPager));
                if (k0Var.f5749c.getVideoList().size() > 2) {
                    viewPager.setCurrentItem(1);
                } else {
                    viewPager.setCurrentItem(0);
                }
                galleryAdapter.a(new b(k0Var));
                return;
            }
            return;
        }
        if ("TYPE_HOME_VIDEO_ADS".equals(objA)) {
            if (t10 instanceof m0) {
                FrameLayout frameLayout = (FrameLayout) viewDataBinding.getRoot().findViewById(R.id.layout_adView);
                if (AppApplication.adInfoEntry.getAd_position_15() != null && AppApplication.adInfoEntry.getAd_position_15().size() > 0 && AppApplication.adInfoEntry.getAd_position_15() != null && AppApplication.adInfoEntry.getAd_position_15().size() > 0) {
                    sa.b.m(this.f41791s, frameLayout, AppApplication.adInfoEntry.getAd_position_15());
                    return;
                }
                return;
            }
            return;
        }
        if ("TYPE_HOME_VIDEO_SPECIAL_LIST".equals(objA) && (t10 instanceof q0)) {
            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) viewDataBinding.getRoot().getLayoutParams();
            layoutParams.setFullSpan(true);
            viewDataBinding.getRoot().setLayoutParams(layoutParams);
        }
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List<Object> list) {
        super.onBindViewHolder(viewHolder, i10, list);
    }
}
