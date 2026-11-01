package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes8.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38106a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f38109d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f38114i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38107b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38108c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38112g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f38113h = 604800000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38115j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38116k = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f38111f = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38110e = UUID.randomUUID().toString();

    public void a(int i10) {
        this.f38108c = i10;
    }

    public void b(int i10) {
        this.f38107b = i10;
    }

    public void a(JSONObject jSONObject) {
        this.f38109d = jSONObject;
    }

    public void b(long j10) {
        this.f38113h = j10;
    }

    public void c(long j10) {
        this.f38111f = j10;
    }

    public long d() {
        return this.f38112g;
    }

    public String g() {
        return this.f38106a;
    }

    public int h() {
        return this.f38108c;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.f38109d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f38109d = jSONObject2;
        return jSONObject2;
    }

    public h j() {
        return this.f38114i;
    }

    public long k() {
        return this.f38113h;
    }

    public long l() {
        return this.f38111f;
    }

    public int m() {
        return this.f38107b;
    }

    public String n() {
        return this.f38110e;
    }

    public boolean o() {
        return this.f38116k;
    }

    public boolean p() {
        return this.f38115j;
    }

    public e(String str) {
        this.f38106a = str;
    }

    public void a(String str) {
        this.f38110e = str;
    }

    public void a(long j10) {
        this.f38112g = j10;
    }

    public void a(h hVar) {
        this.f38114i = hVar;
    }

    public void a(boolean z10) {
        this.f38116k = z10;
    }
}
