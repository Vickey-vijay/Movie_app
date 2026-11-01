package z0;

import y0.c;

/* JADX INFO: compiled from: DefaultFlattener.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements b {
    @Override // z0.b
    public CharSequence flatten(long j10, int i10, String str, String str2) {
        return Long.toString(j10) + '|' + c.a(i10) + '|' + str + '|' + str2;
    }
}
