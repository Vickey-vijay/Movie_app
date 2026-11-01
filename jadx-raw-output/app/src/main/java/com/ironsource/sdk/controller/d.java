package com.ironsource.sdk.controller;

import com.ironsource.A8;
import com.ironsource.C3426d4;
import com.ironsource.C3472fe;
import com.ironsource.C3534j5;
import com.ironsource.C3676r4;
import com.ironsource.C3748v8;
import com.ironsource.C8;
import com.ironsource.G5;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f30823h = "controllerSourceData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30824i = "next_";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30825j = "fallback_";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f30826k = "controllerSourceCode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f30827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f30829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC0282d f30830d = EnumC0282d.NONE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3534j5 f30833g;

    public class a extends JSONObject {
        public a() throws JSONException {
            putOpt(C3426d4.a.f28417j, Integer.valueOf(d.this.f30828b));
            putOpt(d.f30826k, Integer.valueOf(d.this.f30830d.b()));
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0282d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30847a;

        public int b() {
            return this.f30847a;
        }

        EnumC0282d(int i10) {
            this.f30847a = i10;
        }
    }

    private c a(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL;
        }
        return c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30835a;

        static {
            int[] iArr = new int[c.values().length];
            f30835a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30835a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30835a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C8 h() {
        return new C8(this.f30831e, "fallback_mobileController.html");
    }

    private C8 i() {
        return new C8(this.f30831e, "next_mobileController.html");
    }

    private void l() {
        C3748v8 c3748v8A = new C3748v8().a(G5.f26614y, Integer.valueOf(this.f30828b));
        if (this.f30827a > 0) {
            c3748v8A.a(G5.B, Long.valueOf(System.currentTimeMillis() - this.f30827a));
        }
        A8.a(C3472fe.f28932x, c3748v8A.a());
    }

    public C8 g() {
        return new C8(this.f30831e, C3426d4.f28388f);
    }

    public boolean k() {
        int i10 = b.f30835a[this.f30829c.ordinal()];
        if (i10 == 1) {
            e();
            a(new C8(this.f30831e, SDKUtils.getFileName(this.f30832f)));
            return false;
        }
        if (i10 == 2) {
            c();
            a(new C8(this.f30831e, SDKUtils.getFileName(this.f30832f)));
            return false;
        }
        if (i10 == 3) {
            try {
                C8 c8G = g();
                C8 c8I = i();
                if (!c8I.exists() && !c8G.exists()) {
                    a(new C8(this.f30831e, SDKUtils.getFileName(this.f30832f)));
                    return false;
                }
                if (!c8I.exists() && c8G.exists()) {
                    EnumC0282d enumC0282d = EnumC0282d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.f30830d = enumC0282d;
                    a(enumC0282d);
                    a(new C8(this.f30831e, c8I.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC0282d enumC0282d2 = EnumC0282d.PREPARED_CONTROLLER_LOADED;
                    this.f30830d = enumC0282d2;
                    a(enumC0282d2);
                    d();
                    a(new C8(this.f30831e, c8I.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C8(this.f30831e, SDKUtils.getFileName(this.f30832f)));
                    return false;
                }
                EnumC0282d enumC0282d3 = EnumC0282d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.f30830d = enumC0282d3;
                a(enumC0282d3);
                a(new C8(this.f30831e, c8I.getName()));
                return true;
            } catch (Exception e10) {
                C3676r4.d().a(e10);
            }
        }
        return false;
    }

    public boolean m() {
        return this.f30830d != EnumC0282d.NONE;
    }

    public d(JSONObject jSONObject, String str, String str2, C3534j5 c3534j5) {
        int iOptInt = jSONObject.optInt(C3426d4.a.f28417j, -1);
        this.f30828b = iOptInt;
        this.f30829c = a(iOptInt);
        this.f30831e = str;
        this.f30832f = str2;
        this.f30833g = c3534j5;
    }

    private void c() {
        try {
            C8 c8G = g();
            if (!c8G.exists()) {
                return;
            }
            C8 c8H = h();
            if (c8H.exists()) {
                c8H.delete();
            }
            IronSourceStorageUtils.renameFile(c8G.getPath(), c8H.getPath());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private boolean j() {
        return h().exists();
    }

    public void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.f30829c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0282d enumC0282d = EnumC0282d.CONTROLLER_FROM_SERVER;
        this.f30830d = enumC0282d;
        a(enumC0282d);
        runnable.run();
    }

    public JSONObject f() throws JSONException {
        return SafeIronSourceControllerBridge.com_ironsource_sdk_controller_d$a_jsonObjectInit(this);
    }

    public void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.f30829c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC0282d enumC0282d = EnumC0282d.FALLBACK_CONTROLLER_RECOVERY;
            this.f30830d = enumC0282d;
            a(enumC0282d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(C8 c10) {
        if (this.f30833g.c()) {
            return;
        }
        this.f30833g.a(c10, this.f30832f);
    }

    public void a(C3748v8 c3748v8) {
        c3748v8.a(G5.f26614y, Integer.valueOf(this.f30828b));
        A8.a(C3472fe.f28930v, c3748v8.a());
        this.f30827a = System.currentTimeMillis();
    }

    private void a(EnumC0282d enumC0282d) {
        C3748v8 c3748v8A = new C3748v8().a(G5.f26614y, Integer.valueOf(this.f30828b)).a(G5.f26615z, Integer.valueOf(enumC0282d.b()));
        if (this.f30827a > 0) {
            c3748v8A.a(G5.B, Long.valueOf(System.currentTimeMillis() - this.f30827a));
        }
        A8.a(C3472fe.f28931w, c3748v8A.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return false;
        }
    }
}
