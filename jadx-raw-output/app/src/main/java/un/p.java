package un;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: StateVariableTypeDetails.java */
/* JADX INFO: loaded from: classes11.dex */
public class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f72985e = Logger.getLogger(p.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Datatype f72986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f72988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f72989d;

    public p(Datatype datatype) {
        this(datatype, null, null, null);
    }

    public boolean a(String str, String[] strArr) {
        if (str == null || strArr == null) {
            return true;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public p(Datatype datatype, String str, String[] strArr, n nVar) {
        this.f72986a = datatype;
        this.f72987b = str;
        this.f72988c = strArr;
        this.f72989d = nVar;
    }

    public n b() {
        return this.f72989d;
    }

    public String[] c() {
        if (a(this.f72987b, this.f72988c)) {
            return this.f72988c;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f72988c));
        arrayList.add(e());
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Datatype d() {
        return this.f72986a;
    }

    public String e() {
        return this.f72987b;
    }

    public List<mn.k> f() {
        ArrayList arrayList = new ArrayList();
        if (d() == null) {
            arrayList.add(new mn.k(getClass(), "datatype", "Service state variable has no datatype"));
        }
        if (c() != null) {
            if (b() != null) {
                arrayList.add(new mn.k(getClass(), "allowedValues", "Allowed value list of state variable can not also be restricted with allowed value range"));
            }
            if (!Datatype.Builtin.STRING.equals(d().b())) {
                arrayList.add(new mn.k(getClass(), "allowedValues", "Allowed value list of state variable only available for string datatype, not: " + d()));
            }
            for (String str : c()) {
                if (str.length() > 31) {
                    f72985e.warning("UPnP specification violation, allowed value string must be less than 32 chars: " + str);
                }
            }
            if (!a(this.f72987b, this.f72988c)) {
                f72985e.warning("UPnP specification violation, allowed string values don't contain default value: " + this.f72987b);
            }
        }
        if (b() != null) {
            arrayList.addAll(b().e());
        }
        return arrayList;
    }
}
