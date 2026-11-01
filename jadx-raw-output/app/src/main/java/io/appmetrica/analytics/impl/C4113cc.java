package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4113cc extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4139dc f56511a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4113cc(C4139dc c4139dc) {
        super(0);
        this.f56511a = c4139dc;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @Override // bk.a
    public final Object invoke() {
        InterfaceC4594vc le2;
        C4139dc c4139dc = this.f56511a;
        C4619wc c4619wc = c4139dc.f56587f;
        InterfaceC4516s9 interfaceC4516s9 = c4139dc.f56583b;
        Rg rg2 = c4139dc.f56582a;
        C4437p4 c4437p4 = c4139dc.f56584c;
        Xe xe2 = c4139dc.f56585d;
        c4619wc.getClass();
        if (FrameworkDetector.isNative()) {
            N9 n9I = C4418oa.I.i();
            Bundle applicationMetaData = n9I.f55620d.getApplicationMetaData(n9I.f55617a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                le2 = new Rd();
            } else {
                le2 = new Le(interfaceC4516s9, rg2, c4437p4, xe2);
            }
        } else {
            le2 = new Le(interfaceC4516s9, rg2, c4437p4, xe2);
        }
        return le2.a();
    }
}
