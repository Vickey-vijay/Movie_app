package da;

import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoMoreEntry;
import ii.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.f0;
import t9.e;
import w9.l;

/* JADX INFO: compiled from: VideoMoreImp.java */
/* JADX INFO: loaded from: classes7.dex */
public class c implements da.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f51905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51906b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51907c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<RecommandVideosEntity> f51908d = new ArrayList();

    /* JADX INFO: compiled from: VideoMoreImp.java */
    public class a implements u<BaseResponse<VideoMoreEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f51909b;

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public a(boolean z10) {
            this.f51909b = z10;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            if (c.this.f51905a != null) {
                c.this.f51905a.isLoading(false);
                c.this.f51905a.loadNoNet(true);
            }
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<VideoMoreEntry> baseResponse) {
            if (baseResponse.isOk() && !e.a(baseResponse.getResult().getVod_list())) {
                if (!e.a(baseResponse.getResult().getVod_list())) {
                    if (c.this.f51905a != null) {
                        c.this.f51905a.isLoading(false);
                    }
                    if (this.f51909b) {
                        c.this.f51908d.clear();
                        c.this.f51906b = 0;
                    }
                    for (RecommandVideosEntity recommandVideosEntity : baseResponse.getResult().getVod_list()) {
                        c.this.f51906b++;
                        c.this.f51908d.add(recommandVideosEntity);
                        if (c.this.f51906b == 2 && AppApplication.adInfoEntry.getAd_position_17() != null && AppApplication.adInfoEntry.getAd_position_17().size() > 0 && AppApplication.adInfoEntry.getAd_position_17() != null && AppApplication.adInfoEntry.getAd_position_17().size() > 0) {
                            c.this.f51908d.add(null);
                        }
                    }
                    c.this.f51907c++;
                    if (c.this.f51905a != null) {
                        c.this.f51905a.showData(c.this.f51908d);
                        return;
                    }
                    return;
                }
                c.this.f51905a.resetNoMoreData();
                return;
            }
            if (!e.a(c.this.f51908d)) {
                c.this.f51905a.resetNoMoreData();
            }
        }
    }

    public void g(boolean z10, int i10) {
        if (z10) {
            this.f51907c = 1;
        }
        HashMap map = new HashMap();
        map.put("pn", Integer.valueOf(this.f51907c));
        map.put("topic_id", Integer.valueOf(i10));
        i9.a.a().a(map).k(new f0()).e(new l()).e(new w9.c()).b(new a(z10));
    }

    @Override // da.a
    public void onClick(RecommandVideosEntity recommandVideosEntity) {
        b bVar = this.f51905a;
        if (bVar != null) {
            bVar.onClick(recommandVideosEntity);
        }
    }

    public c(b bVar) {
        this.f51905a = bVar;
    }
}
