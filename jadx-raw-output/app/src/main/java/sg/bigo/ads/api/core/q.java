package sg.bigo.ads.api.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f69419a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f69420b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69421c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69422d = 0;

    public q() {
        a();
    }

    private void a() {
        this.f69419a = false;
        this.f69420b = "";
        this.f69421c = 3;
        this.f69422d = 20000;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            a();
            return;
        }
        this.f69419a = true;
        this.f69420b = jSONObject.optString("http_succ_code");
        this.f69421c = jSONObject.optInt("retry_cnt", 3);
        int iOptInt = jSONObject.optInt("retry_interval") * 1000;
        this.f69422d = iOptInt;
        if (iOptInt < 20000) {
            this.f69422d = 20000;
        }
    }

    public final boolean a(int i10) {
        if (i10 >= 100) {
            return this.f69420b.contains(String.valueOf(i10));
        }
        return false;
    }

    public final boolean a(long j10, long j11) {
        return j10 + ((long) this.f69422d) < j11;
    }

    public final boolean b(int i10) {
        return i10 < this.f69421c;
    }
}
