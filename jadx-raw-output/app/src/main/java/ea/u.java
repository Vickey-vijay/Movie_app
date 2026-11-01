package ea;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleHotViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class u extends sl.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f52549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<j> f52550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fm.c<j> f52551e;

    public u(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f52550d = new ObservableArrayList();
        this.f52551e = fm.c.d(new fm.d() { // from class: ea.t
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_hot);
            }
        });
        this.f52549c = homeMultipleEntry;
        this.f72004b = str;
        if (homeMultipleEntry.getBlock_list() != null && homeMultipleEntry.getBlock_list().size() > 0 && homeMultipleEntry.getBlock_list().get(0).getVod_list() != null && homeMultipleEntry.getBlock_list().get(0).getVod_list().size() > 0) {
            this.f52550d.clear();
            for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
                this.f52550d.add(new j(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
            }
        }
    }
}
