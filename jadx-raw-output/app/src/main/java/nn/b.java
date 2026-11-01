package nn;

import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;
import un.l;

/* JADX INFO: compiled from: ActionArgumentValue.java */
/* JADX INFO: loaded from: classes2.dex */
public class b<S extends l> extends mn.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionArgument<S> f64869d;

    public ActionArgument<S> d() {
        return this.f64869d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(ActionArgument<S> actionArgument, Object obj) throws InvalidValueException {
        Datatype datatypeC = actionArgument.c();
        if (obj != null && obj.getClass().isEnum()) {
            obj = obj.toString();
        }
        super(datatypeC, obj);
        this.f64869d = actionArgument;
    }
}
