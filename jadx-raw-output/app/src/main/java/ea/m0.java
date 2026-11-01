package ea;

import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import java.util.List;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleSlideViewModel.java */
/* JADX INFO: loaded from: classes8.dex */
public class m0 extends sl.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<BlockListEntry> f52526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f52527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f52530g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((HomeRecommendMultipleListViewModel) this.f72000a).f41886p.setValue(this.f52527d.getValue());
    }

    public m0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, List<BlockListEntry> list, int i10, boolean z10, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f52527d = new SingleLiveEvent<>();
        this.f52530g = new ul.b(new ul.a() { // from class: ea.l0
            @Override // ul.a
            public final void call() {
                this.f52525a.c();
            }
        });
        this.f52526c = list;
        this.f72004b = str;
        this.f52528e = i10;
        this.f52529f = z10;
    }
}
