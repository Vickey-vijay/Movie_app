package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public final class xc0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc0 f84529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(zc0 zc0Var, Looper looper) {
        super(looper);
        this.f84529a = zc0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            this.f84529a.a(obj, obj2);
            return;
        }
        zc0 zc0Var = this.f84529a;
        if (obj == zc0Var.f85338x) {
            if (zc0Var.f85329o == 2 || zc0Var.e()) {
                zc0Var.f85338x = null;
                if (obj2 instanceof Exception) {
                    ((ed0) zc0Var.f85317c).a((Exception) obj2, false);
                    return;
                }
                try {
                    zc0Var.f85316b.c((byte[]) obj2);
                    ed0 ed0Var = (ed0) zc0Var.f85317c;
                    ed0Var.f77032b = null;
                    p51 p51VarA = p51.a((Collection) ed0Var.f77031a);
                    ed0Var.f77031a.clear();
                    m51 m51VarListIterator = p51VarA.listIterator(0);
                    while (m51VarListIterator.hasNext()) {
                        zc0 zc0Var2 = (zc0) m51VarListIterator.next();
                        if (zc0Var2.f()) {
                            zc0Var2.a(true);
                        }
                    }
                } catch (Exception e10) {
                    ((ed0) zc0Var.f85317c).a(e10, true);
                }
            }
        }
    }
}
