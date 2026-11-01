package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f15823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15824b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15828f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15825c = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15829g = false;

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f15825c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f15825c.put(xVar, arrayList);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final boolean b() {
        String str;
        return this.f15829g && this.f15823a != null && ((str = this.f15824b) == null || (!TextUtils.isEmpty(str) && this.f15824b.equalsIgnoreCase(CampaignEx.KEY_OMID)));
    }

    public final String toString() {
        return "Verification{mJavaScriptResource=" + this.f15823a + ", mTrackingEvents=" + this.f15825c + ", mVerificationParameters='" + this.f15826d + "', mVendor='" + this.f15827e + "'}";
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f15825c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final String a() {
        if (!this.f15829g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f15824b)) {
            return "apiFramework = ";
        }
        if (!this.f15824b.equalsIgnoreCase(CampaignEx.KEY_OMID)) {
            return "apiFramework = " + this.f15824b;
        }
        return "JavaScriptResource_url = " + (TextUtils.isEmpty(this.f15828f) ? "" : this.f15828f);
    }
}
