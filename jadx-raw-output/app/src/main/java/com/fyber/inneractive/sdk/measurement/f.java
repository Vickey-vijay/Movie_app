package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.z;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSession f15815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdEvents f15816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaEvents f15817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15818d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15819e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f15820f;

    public final void a(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String str = "OpenMeasurementNativeVideoTracker - " + th2.getMessage();
        t0 t0Var = this.f15820f;
        z.a(simpleName, str, t0Var != null ? t0Var.f15746a : null, t0Var != null ? t0Var.f15747b : null);
    }

    public final ArrayList a(List list) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (hVar.f15823a != null) {
                    if (!TextUtils.isEmpty(hVar.f15827e) && !TextUtils.isEmpty(hVar.f15826d)) {
                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(hVar.f15827e, hVar.f15823a, hVar.f15826d);
                    } else {
                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(hVar.f15823a);
                    }
                    verificationScriptResource = verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
                }
            } catch (Throwable th2) {
                a(th2);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }
}
