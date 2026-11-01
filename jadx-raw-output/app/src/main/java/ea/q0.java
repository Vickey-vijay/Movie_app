package ea;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import java.util.List;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleSpecialListViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class q0 extends sl.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<BlockListEntry> f52540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HomeMultipleEntry f52541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableList<o0> f52542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fm.c<o0> f52543f;

    public q0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f52542e = new ObservableArrayList();
        this.f52543f = fm.c.d(new fm.d() { // from class: ea.p0
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_special_list);
            }
        });
        this.f52541d = homeMultipleEntry;
        this.f72004b = str;
        this.f52540c = homeMultipleEntry.getBlock_list();
        for (int i10 = 0; i10 < this.f52540c.size(); i10++) {
            this.f52542e.add(new o0(homeRecommendMultipleListViewModel, this.f52540c.get(i10), i10));
        }
    }
}
