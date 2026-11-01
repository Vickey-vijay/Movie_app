package yads;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;

/* JADX INFO: loaded from: classes7.dex */
public final class zw1 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f85635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiBannerControlsContainer f85636b;

    public zw1(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
        this.f85635a = viewPager2;
        this.f85636b = multiBannerControlsContainer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i10) {
        RecyclerView.Adapter adapter = this.f85635a.getAdapter();
        this.f85636b.a(i10, adapter != null ? adapter.getItemCount() : 0);
    }
}
