package ea;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleGusslikeHorizationViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class s extends sl.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f52545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<y> f52546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fm.c<y> f52547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ul.b f52548f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((HomeRecommendMultipleListViewModel) this.f72000a).s();
    }

    public s(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f52546d = new ObservableArrayList();
        this.f52547e = fm.c.d(new fm.d() { // from class: ea.q
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_gusslike_horization);
            }
        });
        this.f52548f = new ul.b(new ul.a() { // from class: ea.r
            @Override // ul.a
            public final void call() {
                this.f52544a.e();
            }
        });
        this.f52545c = homeMultipleEntry;
        this.f72004b = str;
        if (homeMultipleEntry.getBlock_list() != null && homeMultipleEntry.getBlock_list().size() > 0 && homeMultipleEntry.getBlock_list().get(0).getVod_list() != null && homeMultipleEntry.getBlock_list().get(0).getVod_list().size() > 0) {
            this.f52546d.clear();
            homeMultipleEntry.getBlock_list().get(0).getVod_list().add(new RecommandVideosEntity());
            for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
                this.f52546d.add(new y(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
            }
        }
    }
}
