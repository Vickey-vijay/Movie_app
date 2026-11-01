package ca;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleCategoryViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class j0 extends sl.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f5744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<o0> f5745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fm.c<o0> f5746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ul.b f5747f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f5744c.getBlock_list().get(0).getTopic_id());
        ((HomeContentMultipleListViewModel) this.f72000a).startActivity(SpecialDetailNewActivity.class, bundle);
    }

    public j0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeContentMultipleListViewModel);
        this.f5745d = new ObservableArrayList();
        this.f5746e = fm.c.d(new fm.d() { // from class: ca.h0
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_multiple_list_item_category);
            }
        });
        this.f5747f = new ul.b(new ul.a() { // from class: ca.i0
            @Override // ul.a
            public final void call() {
                this.f5742a.e();
            }
        });
        this.f5744c = homeMultipleEntry;
        this.f72004b = str;
        if (homeMultipleEntry.getBlock_list().get(0).getVod_list() != null && homeMultipleEntry.getBlock_list().get(0).getVod_list().size() > 0) {
            this.f5745d.clear();
            for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
                this.f5745d.add(new o0(homeContentMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
            }
        }
    }
}
