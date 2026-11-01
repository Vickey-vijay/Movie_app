package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.b;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile PglSSManager f43292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f43293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f43294c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile PglSSCallBack f43295d;

    public long getECForBidding() {
        return 0L;
    }

    public String getSofChara() {
        return null;
    }

    public static PglSSManager getInstance() {
        return f43292a;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f43292a == null) {
            synchronized (PglSSManager.class) {
                if (f43292a == null) {
                    f43292a = new PglSSManager(context, pglSSConfig);
                    if (b.d() == 0) {
                        f43292a.f43295d = pglSSConfig.getCallBack();
                        f43292a.f43293b.a(pglSSConfig.getCustomInfo());
                        f43292a.f43293b.a(str, str3, str2, str4);
                    }
                }
            }
        }
        return f43292a;
    }

    public PglSSCallBack getPglCallBack() {
        return this.f43295d;
    }

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f43293b = b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return b.d();
    }

    public static String getLoadError() {
        if (b.f() != null) {
            return b.f().f43259b;
        }
        return null;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (b.d() == 0) {
            this.f43293b.a(motionEvent);
        }
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (b.d() == 0) {
            return this.f43293b.a(str, bArr);
        }
        return null;
    }

    public String getToken() {
        if (b.d() == 0) {
            return this.f43293b.g();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (b.d() == 0) {
            this.f43293b.a(str);
            int i10 = this.f43294c;
            b bVar = this.f43293b;
            if (i10 % bVar.f43276p == 0) {
                bVar.a(str, map);
            }
            this.f43294c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (b.d() == 0) {
            this.f43293b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (b.d() == 0) {
            this.f43293b.c(str);
        }
    }

    public void setGaid(String str) {
        if (b.d() == 0) {
            this.f43293b.d(str);
        }
    }
}
