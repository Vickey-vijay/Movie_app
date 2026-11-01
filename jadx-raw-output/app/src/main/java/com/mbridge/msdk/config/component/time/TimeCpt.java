package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, Object> f33596h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, Object> f33597i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f33599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f33601m;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33602a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f33603b;

        public a(boolean z10) {
            this.f33603b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            int i10 = this.f33602a;
            this.f33602a = i10 + 1;
            map.put("triggered_count", Integer.valueOf(i10));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", map));
            if (this.f33603b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f33596h.get(timeCpt2.f33598j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.f33599k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get("componentConfig");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("name");
                if (obj2 instanceof String) {
                    return this.f33598j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f32957f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get("name");
        if (obj != null) {
            this.f33598j = String.valueOf(obj);
        }
        Object obj2 = map.get("duration");
        if (obj2 != null) {
            String strValueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.f33599k = ((long) Integer.parseInt(strValueOf)) * 1000;
            }
        }
        Object obj3 = map.get("repeat");
        if (obj3 != null) {
            String strValueOf2 = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf2)) {
                this.f33600l = Integer.parseInt(strValueOf2);
            }
        }
        Object obj4 = map.get("action");
        if (obj4 != null) {
            this.f33601m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        super.c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Handler handler;
        Runnable aVar;
        boolean z10;
        super.d();
        if (this.f33596h.containsKey(this.f33598j)) {
            handler = (Handler) this.f33596h.get(this.f33598j);
        } else {
            handler = new Handler();
            this.f33596h.put(this.f33598j, handler);
        }
        if (this.f33597i.containsKey(this.f33598j)) {
            aVar = (Runnable) this.f33597i.get(this.f33598j);
        } else {
            if (this.f33600l == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar = new a(z10);
            this.f33597i.put(this.f33598j, aVar);
        }
        if (handler != null && aVar != null) {
            String str = this.f33601m;
            str.hashCode();
            switch (str) {
                case "resume":
                case "start":
                    handler.postDelayed(aVar, this.f33599k);
                    break;
                case "stop":
                    handler.removeCallbacks(aVar);
                    this.f33596h.remove(this.f33598j);
                    break;
                case "pause":
                    handler.removeCallbacks(aVar);
                    break;
            }
        }
    }
}
