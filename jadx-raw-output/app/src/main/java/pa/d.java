package pa;

import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.ranklist.RankContentListViewModel;
import java.util.List;

/* JADX INFO: compiled from: ItemRankAdsMutipleFirstViewModel.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends sl.e<RankContentListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<RecommandVideosEntity> f66077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ul.b f66078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ul.b f66079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ul.b f66080f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((RankContentListViewModel) this.f72000a).f42159r.setValue(this.f66077c.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        ((RankContentListViewModel) this.f72000a).f42159r.setValue(this.f66077c.get(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        ((RankContentListViewModel) this.f72000a).f42159r.setValue(this.f66077c.get(2));
    }

    public d(@NonNull RankContentListViewModel rankContentListViewModel, List<RecommandVideosEntity> list, String str) {
        super(rankContentListViewModel);
        this.f66078d = new ul.b(new ul.a() { // from class: pa.a
            @Override // ul.a
            public final void call() {
                this.f66074a.e();
            }
        });
        this.f66079e = new ul.b(new ul.a() { // from class: pa.b
            @Override // ul.a
            public final void call() {
                this.f66075a.f();
            }
        });
        this.f66080f = new ul.b(new ul.a() { // from class: pa.c
            @Override // ul.a
            public final void call() {
                this.f66076a.g();
            }
        });
        this.f66077c = list;
        this.f72004b = str;
    }
}
