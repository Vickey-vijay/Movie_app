package nn;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.types.ErrorCode;
import un.m;

/* JADX INFO: compiled from: QueryStateVariableExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends a {
    @Override // nn.a
    public void b(d<un.f> dVar, Object obj) throws Exception {
        if (dVar.a() instanceof org.fourthline.cling.model.meta.b) {
            if (!((un.f) dVar.a().g()).u()) {
                dVar.i(new ActionException(ErrorCode.INVALID_ACTION, "This service does not support querying state variables"));
                return;
            } else {
                f(dVar, obj);
                return;
            }
        }
        throw new IllegalStateException("This class can only execute QueryStateVariableAction's, not: " + dVar.a());
    }

    public void f(d<un.f> dVar, Object obj) throws Exception {
        un.f fVar = (un.f) dVar.a().g();
        String string = dVar.d("varName").toString();
        m<un.f> mVarH = fVar.h(string);
        if (mVarH != null) {
            xn.c cVarN = fVar.n(mVarH.b());
            if (cVarN != null) {
                try {
                    e(dVar, dVar.a().e("return"), cVarN.c(mVarH, obj).toString());
                    return;
                } catch (Exception e10) {
                    throw new ActionException(ErrorCode.ACTION_FAILED, e10.getMessage());
                }
            } else {
                throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "No accessor for state variable, can't read state: " + string);
            }
        }
        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "No state variable found: " + string);
    }
}
