package org.fourthline.cling.model.meta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import mn.f;
import mn.k;
import un.l;

/* JADX INFO: compiled from: Action.java */
/* JADX INFO: loaded from: classes5.dex */
public class a<S extends l> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f65787f = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionArgument[] f65789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionArgument[] f65790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionArgument[] f65791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S f65792e;

    public ActionArgument[] a() {
        return this.f65789b;
    }

    public ActionArgument<S>[] c() {
        return this.f65790c;
    }

    public String d() {
        return this.f65788a;
    }

    public ActionArgument<S>[] f() {
        return this.f65791d;
    }

    public S g() {
        return this.f65792e;
    }

    public void j(S s10) {
        if (this.f65792e != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.f65792e = s10;
    }

    public List<k> k() {
        ArrayList arrayList = new ArrayList();
        if (d() == null || d().length() == 0) {
            arrayList.add(new k(getClass(), "name", "Action without name of: " + g()));
        } else if (!f.f(d())) {
            Logger logger = f65787f;
            logger.warning("UPnP specification violation of: " + g().d());
            logger.warning("Invalid action name: " + this);
        }
        for (ActionArgument actionArgument : a()) {
            if (g().h(actionArgument.f()) == null) {
                arrayList.add(new k(getClass(), "arguments", "Action argument references an unknown state variable: " + actionArgument.f()));
            }
        }
        ActionArgument actionArgument2 = null;
        int i10 = 0;
        int i11 = 0;
        for (ActionArgument actionArgument3 : a()) {
            if (actionArgument3.h()) {
                if (actionArgument3.d() == ActionArgument.Direction.IN) {
                    Logger logger2 = f65787f;
                    logger2.warning("UPnP specification violation of :" + g().d());
                    logger2.warning("Input argument can not have <retval/>");
                } else {
                    if (actionArgument2 != null) {
                        Logger logger3 = f65787f;
                        logger3.warning("UPnP specification violation of: " + g().d());
                        logger3.warning("Only one argument of action '" + d() + "' can be <retval/>");
                    }
                    i11 = i10;
                    actionArgument2 = actionArgument3;
                }
            }
            i10++;
        }
        if (actionArgument2 != null) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (a()[i12].d() == ActionArgument.Direction.OUT) {
                    Logger logger4 = f65787f;
                    logger4.warning("UPnP specification violation of: " + g().d());
                    logger4.warning("Argument '" + actionArgument2.e() + "' of action '" + d() + "' is <retval/> but not the first OUT argument");
                }
            }
        }
        for (ActionArgument actionArgument4 : this.f65789b) {
            arrayList.addAll(actionArgument4.j());
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append(getClass().getSimpleName());
        sb2.append(", Arguments: ");
        sb2.append(a() != null ? Integer.valueOf(a().length) : "NO ARGS");
        sb2.append(") ");
        sb2.append(d());
        return sb2.toString();
    }

    public a(String str, ActionArgument[] actionArgumentArr) {
        this.f65788a = str;
        if (actionArgumentArr != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (ActionArgument actionArgument : actionArgumentArr) {
                actionArgument.i(this);
                if (actionArgument.d().equals(ActionArgument.Direction.IN)) {
                    arrayList.add(actionArgument);
                }
                if (actionArgument.d().equals(ActionArgument.Direction.OUT)) {
                    arrayList2.add(actionArgument);
                }
            }
            this.f65789b = actionArgumentArr;
            this.f65790c = (ActionArgument[]) arrayList.toArray(new ActionArgument[arrayList.size()]);
            this.f65791d = (ActionArgument[]) arrayList2.toArray(new ActionArgument[arrayList2.size()]);
            return;
        }
        this.f65789b = new ActionArgument[0];
        this.f65790c = new ActionArgument[0];
        this.f65791d = new ActionArgument[0];
    }

    public ActionArgument<S> b(String str) {
        for (ActionArgument<S> actionArgument : c()) {
            if (actionArgument.g(str)) {
                return actionArgument;
            }
        }
        return null;
    }

    public ActionArgument<S> e(String str) {
        for (ActionArgument<S> actionArgument : f()) {
            if (actionArgument.e().equals(str)) {
                return actionArgument;
            }
        }
        return null;
    }

    public boolean h() {
        if (a() != null && a().length > 0) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (f() != null && f().length > 0) {
            return true;
        }
        return false;
    }
}
