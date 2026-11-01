package com.mbridge.msdk.config.component.log.model;

import java.util.Map;

/* JADX INFO: compiled from: LogSenderModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33419a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33420b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33421c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33422d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33423e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33424f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33425g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f33426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f33427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f33428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33429k;

    public void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey("size")) {
                this.f33419a = ((Integer) map.get("size")).intValue();
            }
            if (map.containsKey("timeout")) {
                this.f33420b = ((Integer) map.get("timeout")).intValue();
            }
            if (map.containsKey("report_on_network_changed")) {
                this.f33421c = ((Integer) map.get("report_on_network_changed")).intValue();
            }
            if (map.containsKey("report_on_succeed")) {
                this.f33422d = ((Integer) map.get("report_on_succeed")).intValue();
            }
            if (map.containsKey("retry")) {
                this.f33423e = ((Integer) map.get("retry")).intValue();
            }
            if (map.containsKey("max_count")) {
                this.f33424f = ((Integer) map.get("max_count")).intValue();
            }
            if (map.containsKey("ttl")) {
                this.f33425g = ((Integer) map.get("ttl")).intValue();
            }
            if (map.containsKey("http_config")) {
                this.f33426h = (Map) map.get("http_config");
            }
            if (map.containsKey("tcp_config")) {
                this.f33427i = (Map) map.get("tcp_config");
            }
            if (map.containsKey("shared_info")) {
                this.f33428j = (Map) map.get("shared_info");
            }
            this.f33429k = map.containsKey("trigger_report") ? ((Integer) map.get("trigger_report")).intValue() : 0;
        }
    }

    public int b() {
        return this.f33420b;
    }

    public String c() {
        Map<String, Object> map = this.f33426h;
        return (map == null || !map.containsKey("url")) ? "" : (String) this.f33426h.get("url");
    }

    public int d() {
        return this.f33424f;
    }

    public int e() {
        return this.f33429k;
    }

    public int f() {
        Map<String, Object> map = this.f33426h;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.f33423e;
    }

    public Map<String, Object> h() {
        return this.f33428j;
    }

    public String i() {
        Map<String, Object> map = this.f33427i;
        return (map == null || !map.containsKey("host")) ? "" : (String) this.f33427i.get("host");
    }

    public int j() {
        Map<String, Object> map = this.f33427i;
        if (map == null || !map.containsKey("port")) {
            return 0;
        }
        return ((Integer) this.f33427i.get("port")).intValue();
    }

    public int k() {
        return this.f33425g;
    }

    public int a() {
        return this.f33419a;
    }
}
