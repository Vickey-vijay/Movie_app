package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* JADX INFO: compiled from: LaunchCrashAssembly.java */
/* JADX INFO: loaded from: classes6.dex */
final class k extends c {
    public k(Context context, b bVar, d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(i10, aVar);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 5) {
                        Header.b(aVarA.d());
                    }
                } else {
                    Header.a(aVarA.d());
                    try {
                        aVarA.d().f().put("launch_did", com.apm.insight.i.a.a(this.f6683b));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                Header headerD = aVarA.d();
                headerD.d();
                headerD.e();
            }
        } else {
            Header headerA = Header.a(this.f6683b);
            headerA.c();
            aVarA.a(headerA);
            com.apm.insight.a.a(aVarA, headerA, this.f6682a);
        }
        return aVarA;
    }
}
