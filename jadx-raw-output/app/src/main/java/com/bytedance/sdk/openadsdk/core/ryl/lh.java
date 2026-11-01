package com.bytedance.sdk.openadsdk.core.ryl;

import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class lh {
    public String bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public vpp f12997cf;
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f12998le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw f12999lh;
    public int ouw;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f13000ra;
    private final AtomicBoolean ryl = new AtomicBoolean(false);
    public String tlj = "endcard_click";
    public int vt;
    public com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt yu;

    public final void ouw(long j10) {
        com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(null, this.f12998le, null, j10, this.bly, new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.vt(this.tlj, this.f12997cf), null);
    }

    public final int vt() {
        return this.ouw;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ryl.lh$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.values().length];
            ouw = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    public static float ouw(int i10, int i11, int i12, int i13, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt vtVar, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw) {
        float f10 = 0.0f;
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f11 = i10;
        float f12 = i12;
        float fAbs = Math.abs((f11 / i11) - (f12 / i13)) + Math.abs((f11 - f12) / f11);
        int i14 = AnonymousClass1.ouw[vtVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                f10 = 1.2f;
            } else if (i14 == 3) {
                f10 = 1.0f;
            }
        } else if (com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.JAVASCRIPT.equals(enumC0133ouw)) {
            f10 = 1.0f;
        } else if (com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.IMAGE.equals(enumC0133ouw)) {
            f10 = 0.8f;
        }
        return f10 / (fAbs + 1.0f);
    }

    public final String fkw() {
        if (this.yu == com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.STATIC_RESOURCE && this.f12999lh == com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.IMAGE) {
            return this.fkw;
        }
        return null;
    }

    public final String le() {
        return this.fkw;
    }

    public final int lh() {
        return this.vt;
    }

    public final void vt(long j10) {
        if (this.ryl.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.ryl.vt.lh.vt(null, this.f13000ra, null, j10, this.bly, null);
        }
    }

    public final String yu() {
        int i10 = AnonymousClass1.ouw[this.yu.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.fkw;
            }
            if (i10 != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.ouw + "\" height=\"" + this.vt + "\" src=\"" + this.fkw + "\"></iframe>";
        }
        com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw = this.f12999lh;
        if (enumC0133ouw == com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.fkw + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (enumC0133ouw != com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.JAVASCRIPT) {
            return null;
        }
        return "<script src=\"" + this.fkw + "\"></script>";
    }

    public lh(int i10, int i11, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt vtVar, String str, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list2, String str2) {
        this.f12998le = new ArrayList();
        this.f13000ra = new ArrayList();
        this.ouw = i10;
        this.vt = i11;
        this.f12999lh = enumC0133ouw;
        this.yu = vtVar;
        this.fkw = str;
        this.f12998le = list;
        this.f13000ra = list2;
        this.pno = str2;
    }

    public static lh vt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONArrayOptJSONArray.optString(i10)).ouw());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
            arrayList2.add(new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONArrayOptJSONArray2.optString(i11)).ouw());
        }
        return new lh(iOptInt, iOptInt2, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.valueOf(strOptString), com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    public JSONObject ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.ouw);
        jSONObject.put("height", this.vt);
        jSONObject.put("creativeType", this.f12999lh.toString());
        jSONObject.put("resourceType", this.yu.toString());
        jSONObject.put("contentUrl", this.fkw);
        jSONObject.put("clickThroughUri", this.pno);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f12998le));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f13000ra));
        return jSONObject;
    }
}
