package yn;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: HostPort.java */
/* JADX INFO: loaded from: classes8.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85818b;

    public m() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f85818b == mVar.f85818b && this.f85817a.equals(mVar.f85817a);
    }

    public m(String str, int i10) {
        this.f85817a = str;
        this.f85818b = i10;
    }

    public int hashCode() {
        return (this.f85817a.hashCode() * 31) + this.f85818b;
    }

    public String toString() {
        return this.f85817a + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f85818b;
    }
}
