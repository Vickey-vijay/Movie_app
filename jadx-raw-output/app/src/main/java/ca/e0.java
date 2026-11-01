package ca;

import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentListViewModel;

/* JADX INFO: compiled from: ItemHomeContentListViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class e0 extends sl.c<HomeContentListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f5724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ul.b f5725c;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((HomeContentListViewModel) this.f72000a).f41786r.c(this);
    }

    public e0(@NonNull HomeContentListViewModel homeContentListViewModel, RecommandVideosEntity recommandVideosEntity) {
        super(homeContentListViewModel);
        this.f5725c = new ul.b(new ul.a() { // from class: ca.d0
            @Override // ul.a
            public final void call() {
                this.f5721a.b();
            }
        });
        this.f5724b = recommandVideosEntity;
    }
}
