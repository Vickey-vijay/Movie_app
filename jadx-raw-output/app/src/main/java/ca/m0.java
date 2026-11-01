package ca;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleHotViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class m0 extends sl.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f5755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<q0> f5756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fm.c<q0> f5757e;

    public m0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeContentMultipleListViewModel);
        this.f5756d = new ObservableArrayList();
        this.f5757e = fm.c.d(new fm.d() { // from class: ca.l0
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_multiple_list_item_hot);
            }
        });
        this.f5755c = homeMultipleEntry;
        this.f72004b = str;
        if (homeMultipleEntry.getBlock_list().get(0).getVod_list() != null && homeMultipleEntry.getBlock_list().get(0).getVod_list().size() > 0) {
            this.f5756d.clear();
            for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
                this.f5756d.add(new q0(homeContentMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
            }
        }
    }
}
