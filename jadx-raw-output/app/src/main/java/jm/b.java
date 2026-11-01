package jm;

import im.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import mm.h;

/* JADX INFO: compiled from: BasicAuthentication.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mm.d f61937a;

    @Override // jm.a
    public void a(i iVar) throws IOException {
        iVar.T(lm.i.C, this.f61937a);
    }

    public b(d dVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(xm.d.d(dVar.a() + StringUtils.PROCESS_POSTFIX_DELIMITER + dVar.getCredentials(), "ISO-8859-1"));
        this.f61937a = new h(sb2.toString());
    }
}
