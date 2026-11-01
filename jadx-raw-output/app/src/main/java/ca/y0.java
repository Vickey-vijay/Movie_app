package ca;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;
import com.mgs.carparking.ui.homecontent.more.VideoMoreListActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: ItemHomeContentMultipleNewViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class y0 extends sl.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HomeMultipleEntry f5802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableList<s0> f5803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fm.c<s0> f5804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ul.b f5805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ul.b f5806h;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        Bundle bundle = new Bundle();
        bundle.putString("videoTitle", this.f5802d.getModule_name());
        bundle.putInt("videoModuleId", this.f5802d.getBlock_list().get(0).getTopic_id());
        ((HomeContentMultipleListViewModel) this.f72000a).startActivity(VideoMoreListActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        ((HomeContentMultipleListViewModel) this.f72000a).r(this, this.f5802d.getBlock_list().get(0).getTopic_id(), this.f5803e, this.f5801c, this.f5802d.getModule_id());
    }

    public y0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeContentMultipleListViewModel);
        this.f5801c = "";
        this.f5803e = new ObservableArrayList();
        this.f5804f = fm.c.d(new fm.d() { // from class: ca.v0
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_multiple_list_item_new);
            }
        });
        this.f5805g = new ul.b(new ul.a() { // from class: ca.w0
            @Override // ul.a
            public final void call() {
                this.f5797a.f();
            }
        });
        this.f5806h = new ul.b(new ul.a() { // from class: ca.x0
            @Override // ul.a
            public final void call() {
                this.f5799a.g();
            }
        });
        this.f5802d = homeMultipleEntry;
        this.f72004b = str;
        if (homeMultipleEntry.getBlock_list() != null && homeMultipleEntry.getBlock_list().size() > 0 && homeMultipleEntry.getBlock_list().get(0).getVod_list() != null && homeMultipleEntry.getBlock_list().get(0).getVod_list().size() > 0) {
            this.f5803e.clear();
            this.f5801c = "";
            for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
                if (i10 == homeMultipleEntry.getBlock_list().get(0).getVod_list().size() - 1) {
                    this.f5801c += homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10).getId();
                } else {
                    this.f5801c += homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10).getId() + StringUtils.COMMA;
                }
                this.f5803e.add(new s0(homeContentMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
            }
        }
    }
}
