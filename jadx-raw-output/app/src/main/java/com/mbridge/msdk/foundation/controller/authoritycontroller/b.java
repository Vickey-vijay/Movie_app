package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseSDKAuthorityController.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f34582h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f34583i = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AuthorityInfoBean f34585b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f34590g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f34584a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34586c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34587d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34588e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34589f = "";

    /* JADX INFO: compiled from: BaseSDKAuthorityController.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f34591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnCompletionListener f34592b;

        public a(Context context, OnCompletionListener onCompletionListener) {
            this.f34591a = context;
            this.f34592b = onCompletionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f34591a);
            this.f34592b.onCompletion();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseSDKAuthorityController.java */
    public class C0321b implements e.a {
        public C0321b() {
        }

        @Override // com.mbridge.msdk.foundation.controller.e.a
        public void a() {
            b.this.k();
        }
    }

    public static void b(boolean z10) {
        f34583i = z10;
    }

    public abstract int a(g gVar, String str);

    public int c() {
        return this.f34587d;
    }

    public int d() {
        return this.f34588e;
    }

    private void d(int i10) {
        this.f34586c = i10 != 1 ? 2 : 1;
    }

    public static boolean i() {
        return f34582h;
    }

    public static boolean j() {
        return f34583i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void k() {
        boolean zC = this.f34590g.c();
        b(this.f34590g.b());
        d(zC ? 1 : 2);
        this.f34585b.authDeviceIdStatus(zC ? 1 : 0);
    }

    public boolean b() {
        int i10 = this.f34586c;
        return i10 == 1 || i10 == 3;
    }

    public void c(int i10) {
        this.f34588e = i10;
    }

    public int e() {
        return this.f34586c;
    }

    public String f() {
        return this.f34589f;
    }

    public String g() {
        JSONArray jSONArray = new JSONArray();
        g gVarC = h.b().c();
        for (int i10 = 0; i10 < this.f34584a.size(); i10++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f34584a.get(i10)));
                jSONObject.put("client_status", a(this.f34584a.get(i10)));
                jSONObject.put("server_status", a(gVarC, this.f34584a.get(i10)));
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public void h() {
        AuthorityInfoBean authorityInfoBean = new AuthorityInfoBean();
        this.f34585b = authorityInfoBean;
        try {
            authorityInfoBean.authGenDataStatus(1);
            this.f34585b.authDeviceIdStatus(1);
            this.f34585b.authSerialIdStatus(1);
            this.f34585b.authOtherDataStatus(1);
            this.f34584a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f34584a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f34584a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f34584a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
        }
    }

    public b() {
        h();
    }

    public static void a(boolean z10) {
        f34582h = z10;
    }

    public void b(int i10) {
        this.f34587d = i10;
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34589f = str;
    }

    public AuthorityInfoBean a() {
        AuthorityInfoBean authorityInfoBean = this.f34585b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public void a(int i10) {
        this.f34586c = i10 != 1 ? 2 : 1;
        if (this.f34585b != null) {
            d(i10);
        }
    }

    public void a(Context context, OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context, onCompletionListener));
        } else {
            a(context);
        }
    }

    public int a(String str) {
        AuthorityInfoBean authorityInfoBean;
        try {
            if (TextUtils.isEmpty(str) || (authorityInfoBean = this.f34585b) == null) {
                return 0;
            }
            return authorityInfoBean.getStatusByKey(str);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
            return 0;
        }
    }

    public void a(String str, int i10) {
        if (TextUtils.isEmpty(str) || this.f34585b == null) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "authority_serial_id":
                this.f34585b.authSerialIdStatus(i10);
                break;
            case "authority_all_info":
                this.f34585b.a(i10);
                break;
            case "authority_device_id":
                this.f34585b.authDeviceIdStatus(i10);
                break;
            case "authority_general_data":
                this.f34585b.authGenDataStatus(i10);
                break;
            case "authority_other":
                this.f34585b.authOtherDataStatus(i10);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.f34590g == null) {
                e eVar = new e(context);
                this.f34590g = eVar;
                eVar.a(new C0321b());
            }
            k();
        } catch (Throwable th2) {
            q0.b("SDKAuthorityController", th2.getMessage());
        }
    }
}
