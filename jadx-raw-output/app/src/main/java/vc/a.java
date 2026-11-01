package vc;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: compiled from: QueryInfoCallback.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f73155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rc.a f73156c;

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f73156c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f73156c.a(this.f73155b, queryInfo.getQuery(), queryInfo);
    }

    public a(String str, rc.a aVar) {
        this.f73155b = str;
        this.f73156c = aVar;
    }
}
