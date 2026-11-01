package x9;

import com.mgs.carparking.dbtable.VideoDownloadEntity;
import java.util.List;

/* JADX INFO: compiled from: DownloadCompleteListEvent.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<VideoDownloadEntity> f74391a;

    public j(List<VideoDownloadEntity> list) {
        ck.p.j(list, "downloadEntityList");
        this.f74391a = list;
    }

    public final List<VideoDownloadEntity> a() {
        return this.f74391a;
    }
}
