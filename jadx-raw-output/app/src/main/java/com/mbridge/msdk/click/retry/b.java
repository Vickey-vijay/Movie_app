package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* JADX INFO: compiled from: RetryUrlRecordData.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f32927k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f32928l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<String> f32931c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32932d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f32933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f32934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f32936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f32937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32938j;

    public void a(boolean z10) {
        this.f32936h = z10;
    }

    public void b(boolean z10) {
        this.f32937i = z10;
    }

    public void a(int i10) {
        this.f32938j = i10;
    }

    public void b(int i10) {
        this.f32935g = i10;
    }

    public long c() {
        return this.f32932d;
    }

    public int d() {
        return this.f32938j;
    }

    public int e() {
        return this.f32930b;
    }

    public String f() {
        return this.f32934f;
    }

    public String g() {
        return this.f32929a;
    }

    public int h() {
        return this.f32935g;
    }

    public boolean i() {
        return this.f32936h;
    }

    public boolean j() {
        return this.f32937i;
    }

    public b(String str, String str2) {
        this.f32929a = str;
        a(str2);
    }

    public CampaignEx a() {
        return this.f32933e;
    }

    public void b(String str) {
        this.f32934f = str;
    }

    public void a(CampaignEx campaignEx) {
        this.f32933e = campaignEx;
    }

    public HashSet<String> b() {
        return this.f32931c;
    }

    public void a(String str) {
        this.f32930b++;
        this.f32931c.add(str);
    }
}
