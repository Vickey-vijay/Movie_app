package z7;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: PictureContextWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends ContextWrapper {
    public static ContextWrapper a(Context context, int i10, int i11) {
        if (i10 != -2) {
            g8.b.d(context, i10, i11);
        }
        return new f(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return "audio".equals(str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
    }

    public f(Context context) {
        super(context);
    }
}
