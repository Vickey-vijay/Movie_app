package ab;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import za.f;
import za.h;

/* JADX INFO: compiled from: ObjectLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class e<D> extends a<Object> {
    @Override // ab.a, ab.d
    public <D> List<D> a(String str, Class<D> cls) {
        h.e(str, "key can't be null");
        try {
            za.a.e eVarQ = this.f3520c.q(d(str));
            if (eVarQ != null) {
                return f.a(eVarQ.a(0), cls);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return new ArrayList();
    }

    @Override // ab.a, ab.d
    public boolean b(String str, Object obj) {
        h.e(str, "key can't be null");
        try {
            za.a.c cVarO = this.f3520c.o(d(str));
            if (f.b(cVarO.f(0), obj)) {
                cVarO.e();
            } else {
                cVarO.d();
            }
            this.f3520c.flush();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public e(String str, Context context) {
        super(str, context);
    }
}
