package nn;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import mn.j;
import org.fourthline.cling.model.action.ActionCancelledException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: AbstractActionExecutor.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f64865b = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<ActionArgument<un.f>, xn.c> f64866a;

    /* JADX INFO: renamed from: nn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractActionExecutor.java */
    public class C0595a implements mn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f64867a;

        public C0595a(d dVar) {
            this.f64867a = dVar;
        }

        @Override // mn.a
        public void a(j jVar) throws Exception {
            a.this.b(this.f64867a, jVar.getImplementation());
        }

        public String toString() {
            return "Action invocation: " + this.f64867a.a();
        }
    }

    public a() {
        this.f64866a = new HashMap();
    }

    public abstract void b(d<un.f> dVar, Object obj) throws Exception;

    @Override // nn.c
    public void a(d<un.f> dVar) {
        f64865b.fine("Invoking on local service: " + dVar);
        un.f fVar = (un.f) dVar.a().g();
        try {
            if (fVar.q() == null) {
                throw new IllegalStateException("Service has no implementation factory, can't get service instance");
            }
            fVar.q().b(new C0595a(dVar));
        } catch (InterruptedException e10) {
            Logger logger = f64865b;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                f64865b.fine("InterruptedException thrown by service, wrapping in invocation and returning: " + e10);
                f64865b.log(level, "Exception root cause: ", so.a.a(e10));
            }
            dVar.i(new ActionCancelledException(e10));
        } catch (ActionException e11) {
            Logger logger2 = f64865b;
            Level level2 = Level.FINE;
            if (logger2.isLoggable(level2)) {
                f64865b.fine("ActionException thrown by service, wrapping in invocation and returning: " + e11);
                f64865b.log(level2, "Exception root cause: ", so.a.a(e11));
            }
            dVar.i(e11);
        } catch (Throwable th2) {
            Throwable thA = so.a.a(th2);
            Logger logger3 = f64865b;
            Level level3 = Level.FINE;
            if (logger3.isLoggable(level3)) {
                f64865b.fine("Execution has thrown, wrapping root cause in ActionException and returning: " + th2);
                f64865b.log(level3, "Exception root cause: ", thA);
            }
            dVar.i(new ActionException(ErrorCode.ACTION_FAILED, thA.getMessage() != null ? thA.getMessage() : thA.toString(), thA));
        }
    }

    public Map<ActionArgument<un.f>, xn.c> c() {
        return this.f64866a;
    }

    public a(Map<ActionArgument<un.f>, xn.c> map) {
        new HashMap();
        this.f64866a = map;
    }

    public Object d(org.fourthline.cling.model.meta.a<un.f> aVar, Object obj) throws Exception {
        int length = aVar.f().length;
        Object[] objArr = new Object[length];
        f64865b.fine("Attempting to retrieve output argument values using accessor: " + length);
        Object[] objArrF = aVar.f();
        int length2 = objArrF.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length2) {
            Object obj2 = objArrF[i10];
            f64865b.finer("Calling acccessor method for: " + obj2);
            xn.c cVar = c().get(obj2);
            if (cVar != null) {
                f64865b.fine("Calling accessor to read output argument value: " + cVar);
                objArr[i11] = cVar.b(obj);
                i10++;
                i11++;
            } else {
                throw new IllegalStateException("No accessor bound for: " + obj2);
            }
        }
        if (length == 1) {
            return objArr[0];
        }
        if (length <= 0) {
            return null;
        }
        return objArr;
    }

    public void e(d<un.f> dVar, ActionArgument<un.f> actionArgument, Object obj) throws ActionException {
        un.f fVar = (un.f) dVar.a().g();
        if (obj != null) {
            try {
                if (fVar.t(obj)) {
                    f64865b.fine("Result of invocation matches convertible type, setting toString() single output argument value");
                    dVar.m(new b<>(actionArgument, obj.toString()));
                } else {
                    f64865b.fine("Result of invocation is Object, setting single output argument value");
                    dVar.m(new b<>(actionArgument, obj));
                }
                return;
            } catch (InvalidValueException e10) {
                throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Wrong type or invalid value for '" + actionArgument.e() + "': " + e10.getMessage(), e10);
            }
        }
        f64865b.fine("Result of invocation is null, not setting any output argument value(s)");
    }
}
