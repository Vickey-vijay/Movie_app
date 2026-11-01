package org.fourthline.cling.model.meta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import mn.f;
import mn.k;
import org.fourthline.cling.model.types.Datatype;
import un.l;

/* JADX INFO: loaded from: classes11.dex */
public class ActionArgument<S extends l> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f65779g = Logger.getLogger(ActionArgument.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f65781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Direction f65783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f65784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a<S> f65785f;

    public enum Direction {
        IN,
        OUT
    }

    public ActionArgument(String str, String str2, Direction direction) {
        this(str, new String[0], str2, direction, false);
    }

    public ActionArgument(String str, String[] strArr, String str2, Direction direction) {
        this(str, strArr, str2, direction, false);
    }

    public a<S> a() {
        return this.f65785f;
    }

    public String[] b() {
        return this.f65781b;
    }

    public Direction d() {
        return this.f65783d;
    }

    public String e() {
        return this.f65780a;
    }

    public String f() {
        return this.f65782c;
    }

    public boolean h() {
        return this.f65784e;
    }

    public void i(a<S> aVar) {
        if (this.f65785f != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.f65785f = aVar;
    }

    public List<k> j() {
        ArrayList arrayList = new ArrayList();
        if (e() == null || e().length() == 0) {
            arrayList.add(new k(getClass(), "name", "Argument without name of: " + a()));
        } else if (!f.f(e())) {
            Logger logger = f65779g;
            logger.warning("UPnP specification violation of: " + a().g().d());
            logger.warning("Invalid argument name: " + this);
        } else if (e().length() > 32) {
            Logger logger2 = f65779g;
            logger2.warning("UPnP specification violation of: " + a().g().d());
            logger2.warning("Argument name should be less than 32 characters: " + this);
        }
        if (d() == null) {
            arrayList.add(new k(getClass(), "direction", "Argument '" + e() + "' requires a direction, either IN or OUT"));
        }
        if (h() && d() != Direction.OUT) {
            arrayList.add(new k(getClass(), "direction", "Return value argument '" + e() + "' must be direction OUT"));
        }
        return arrayList;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ", " + d() + ") " + e();
    }

    public ActionArgument(String str, String str2, Direction direction, boolean z10) {
        this(str, new String[0], str2, direction, z10);
    }

    public Datatype c() {
        return a().g().c(this);
    }

    public boolean g(String str) {
        if (e().equalsIgnoreCase(str)) {
            return true;
        }
        for (String str2 : this.f65781b) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public ActionArgument(String str, String[] strArr, String str2, Direction direction, boolean z10) {
        this.f65780a = str;
        this.f65781b = strArr;
        this.f65782c = str2;
        this.f65783d = direction;
        this.f65784e = z10;
    }
}
