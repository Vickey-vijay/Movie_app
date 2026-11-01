package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SenCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static b f33538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Map<String, a> f33539l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33542j;

    private int g() {
        String str = this.f33541i;
        str.hashCode();
        switch (str) {
            case "magnetic":
                return 2;
            case "rotation":
                return 11;
            case "gyroscope":
                return 4;
            case "accelerometer":
                return 1;
            default:
                return -1;
        }
    }

    private void h() {
        if (f33538k == null) {
            f33538k = new b();
        }
        if (f33539l == null) {
            f33539l = new HashMap();
        }
        a aVar = new a() { // from class: com.mbridge.msdk.config.component.sen.c
            @Override // com.mbridge.msdk.config.component.sen.a
            public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                this.f33547a.c(bVar);
            }
        };
        f33539l.put(this.f33541i, aVar);
        f33538k.a(aVar);
        f33538k.a(g(), this.f33541i, this.f33542j);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f32957f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                key.hashCode();
                switch (key) {
                    case "action":
                        this.f33540h = String.valueOf(entry.getValue());
                        break;
                    case "frequency":
                        double d10 = Double.parseDouble(String.valueOf(entry.getValue()));
                        if (d10 > 0.0d) {
                            this.f33542j = (int) (d10 * 1000.0d * 1000.0d);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "sensor_type":
                        this.f33541i = String.valueOf(entry.getValue());
                        break;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.mbridge.msdk.config.component.base.b bVar) {
        a(a(bVar.c(), bVar.b()));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Map<String, a> map;
        super.d();
        if (this.f33540h.equals("start")) {
            h();
        }
        if (this.f33540h.equals("end") && f33538k != null && (map = f33539l) != null) {
            f33538k.b(map.get(this.f33541i));
            f33539l.remove(this.f33541i);
            if (f33539l.isEmpty()) {
                f33538k.a();
                f33538k = null;
            }
        }
    }
}
