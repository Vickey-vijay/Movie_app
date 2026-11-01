package zm;

/* JADX INFO: compiled from: AbstractLogger.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements c {
    public static boolean l(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isWhitespace(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public abstract c m(String str);

    @Override // zm.c
    public final c j(String str) {
        if (l(str)) {
            return this;
        }
        String name = getName();
        if (!l(name) && b.e() != this) {
            str = name + "." + str;
        }
        c cVar = b.c().get(str);
        if (cVar == null) {
            c cVarM = m(str);
            c cVarPutIfAbsent = b.d().putIfAbsent(str, cVarM);
            if (cVarPutIfAbsent != null) {
                return cVarPutIfAbsent;
            }
            return cVarM;
        }
        return cVar;
    }
}
