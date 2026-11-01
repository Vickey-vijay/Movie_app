package ea;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleSpecialListItemViewModel.java */
/* JADX INFO: loaded from: classes8.dex */
public class o0 extends sl.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BlockListEntry f52533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ul.b f52535d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f52533b.getTopic_id());
        ((HomeRecommendMultipleListViewModel) this.f72000a).startActivity(SpecialDetailNewActivity.class, bundle);
    }

    public o0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, BlockListEntry blockListEntry, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f52535d = new ul.b(new ul.a() { // from class: ea.n0
            @Override // ul.a
            public final void call() {
                this.f52531a.b();
            }
        });
        this.f52533b = blockListEntry;
        this.f52534c = i10;
    }
}
