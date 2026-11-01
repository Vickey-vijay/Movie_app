package lk;

/* JADX INFO: compiled from: Appendable.kt */
/* JADX INFO: loaded from: classes10.dex */
public class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void a(Appendable appendable, T t10, bk.l<? super T, ? extends CharSequence> lVar) {
        ck.p.j(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(t10.toString());
        }
    }
}
