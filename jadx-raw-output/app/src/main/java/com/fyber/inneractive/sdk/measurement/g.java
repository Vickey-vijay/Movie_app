package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f15822b;

    public g(List list, i iVar) {
        this.f15821a = list;
        this.f15822b = iVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f15821a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f15821a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f15822b.mReason)));
            }
        }
        return arrayList;
    }
}
