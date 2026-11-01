package yads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uv3 extends gw3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f83674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f83675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f83676e;

    public uv3(fw3 fw3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(fw3Var);
        this.f83674c = new HashSet(hashSet);
        this.f83675d = jSONObject;
        this.f83676e = j10;
    }
}
