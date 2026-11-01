package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Qk extends AbstractC3277w9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ak f23406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23410f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qk(String str, Ak ak2, String str2, int i10, int i11, int i12) {
        super(str);
        ck.p.j(str, "url");
        ck.p.j(ak2, "uidMap");
        this.f23406b = ak2;
        this.f23407c = str2;
        this.f23408d = i10;
        this.f23409e = i11;
        this.f23410f = i12;
    }

    public final Le a() {
        String string;
        InMobiUserDataTypes emailId;
        InMobiUserDataTypes phoneNumber;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Objects.toString(C2722a7.f23964a);
        String str = (String) Tg.a().get("u-age");
        if (str != null) {
        }
        String string2 = Ok.b().toString();
        ck.p.i(string2, "toString(...)");
        linkedHashMap.put("ufids", string2);
        C3194t1 c3194t1 = AbstractC3363zk.f25867a;
        Boolean bool = c3194t1 != null ? c3194t1.f25367c : null;
        if (bool == null || (string = bool.toString()) == null) {
            string = "true";
        }
        linkedHashMap.put(com.ironsource.Q6.f27466s, string);
        linkedHashMap.put("mk-version", Ki.a());
        String str2 = A1.f22333a;
        if (str2 != null) {
        }
        linkedHashMap.put(com.ironsource.Q6.f27422d0, Ji.c());
        linkedHashMap.put("ts", String.valueOf(System.currentTimeMillis()));
        String str3 = this.f23407c;
        if (str3 != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = C2722a7.f23965b;
        if (inMobiUserDataModel == null || (emailId = inMobiUserDataModel.getEmailId()) == null || (emailId.getMd5() == null && emailId.getSha1() == null && emailId.getSha256() == null)) {
            emailId = null;
        }
        if (emailId != null) {
            ck.p.j(emailId, IconCompat.EXTRA_OBJ);
        }
        InMobiUserDataModel inMobiUserDataModel2 = C2722a7.f23965b;
        if (inMobiUserDataModel2 == null || (phoneNumber = inMobiUserDataModel2.getPhoneNumber()) == null || (phoneNumber.getMd5() == null && phoneNumber.getSha1() == null && phoneNumber.getSha256() == null)) {
            phoneNumber = null;
        }
        if (phoneNumber != null) {
            ck.p.j(phoneNumber, IconCompat.EXTRA_OBJ);
        }
        InMobiUserDataModel inMobiUserDataModel3 = C2722a7.f23965b;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        linkedHashMap.putAll(this.f23406b.a());
        ck.p.j(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f22337e);
        linkedHashMap.putAll(C3298x5.f25687a.a(false));
        linkedHashMap.putAll(AbstractC3351z8.a());
        ck.p.j(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string3 = jSONObjectB.toString();
            ck.p.i(string3, "toString(...)");
            linkedHashMap.put("consentObject", string3);
        }
        String str4 = this.f25628a;
        Y6 y10 = new Y6(linkedHashMap);
        int i10 = this.f23408d;
        int i11 = this.f23409e;
        ik.i iVar = Se.f23518a;
        Ai ai2 = new Ai(i10, i11 * 1000, 0);
        long j10 = this.f23410f * 1000;
        return new Le(str4, null, new C3114pk(j10, j10, j10), y10, ai2, 32);
    }
}
