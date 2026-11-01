package b;

import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {
    public static void a(Exception exc, StringBuilder sb2, Exception exc2) {
        sb2.append(exc.getMessage());
        AdLog.e(sb2.toString(), exc2);
    }
}
