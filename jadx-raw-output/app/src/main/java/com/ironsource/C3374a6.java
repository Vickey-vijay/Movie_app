package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C3374a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3534j5 f28121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z5 f28122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ob f28123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B7 f28124e = Lb.U().i();

    /* JADX INFO: renamed from: com.ironsource.a6$a */
    public class a implements Oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Oc f28125a;

        /* JADX INFO: renamed from: com.ironsource.a6$a$a, reason: collision with other inner class name */
        public class C0252a extends JSONObject {
            public C0252a() throws JSONException {
                put(Y5.d.f27937b, System.currentTimeMillis());
            }
        }

        @Override // com.ironsource.Oc
        public void a(C8 c10) {
            this.f28125a.a(c10);
            try {
                C3374a6.this.f28123d.a(c10.getName(), SafeIronSourceIronsourceBridge.com_ironsource_a6$a$a_jsonObjectInit(this));
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        public a(Oc oc2) {
            this.f28125a = oc2;
        }

        @Override // com.ironsource.Oc
        public void a(C8 c10, C3731u8 c3731u8) {
            this.f28125a.a(c10, c3731u8);
        }
    }

    public void a(C8 c10, String str, int i10, int i11, Oc oc2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(Y5.a.f27913a);
        }
        if (this.f28124e.a(this.f28121b.a()) <= 0) {
            throw new Exception(C3462f4.A);
        }
        if (!Z3.h(this.f28120a)) {
            throw new Exception(C3462f4.C);
        }
        this.f28122c.a(c10.getPath(), new a(oc2));
        if (!c10.exists()) {
            this.f28121b.a(c10, str, i10, i11, this.f28122c);
            return;
        }
        Message message = new Message();
        message.obj = c10;
        message.what = 1015;
        this.f28122c.sendMessage(message);
    }

    public C3374a6(Context context, C3534j5 c3534j5, Z5 z10, Ob ob2) {
        this.f28120a = context;
        this.f28121b = c3534j5;
        this.f28122c = z10;
        this.f28123d = ob2;
    }

    public void b(C8 c10) throws Exception {
        if (!c10.exists()) {
            return;
        }
        ArrayList<C8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c10);
        if (IronSourceStorageUtils.deleteFolderContentRecursive(c10) && c10.delete()) {
            this.f28123d.a(filesInFolderRecursive);
            return;
        }
        throw new Exception(Y5.a.f27918f);
    }

    public JSONObject c(C8 c10) throws Exception {
        if (c10.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c10, this.f28123d.b());
        }
        throw new Exception(Y5.a.f27916d);
    }

    public long d(C8 c10) throws Exception {
        if (c10.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c10);
        }
        throw new Exception(Y5.a.f27916d);
    }

    public void a(C8 c10) throws Exception {
        if (c10.exists()) {
            if (c10.delete()) {
                this.f28123d.a(c10.getName());
                return;
            }
            throw new Exception(Y5.a.f27917e);
        }
    }

    public void a(C8 c10, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c10.exists()) {
                if (!this.f28123d.b(c10.getName(), jSONObject)) {
                    throw new Exception(Y5.a.f27920h);
                }
                return;
            }
            throw new Exception(Y5.a.f27915c);
        }
        throw new Exception(Y5.a.f27919g);
    }
}
