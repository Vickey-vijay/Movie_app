package zc;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: compiled from: QueryInfoCallback.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f86391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rc.a f86392c;

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f86392c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f86392c.a(this.f86391b, queryInfo.getQuery(), queryInfo);
    }

    public a(String str, rc.a aVar) {
        this.f86391b = str;
        this.f86392c = aVar;
    }
}
