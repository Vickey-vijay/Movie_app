package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: CharacterDatatype.java */
/* JADX INFO: loaded from: classes8.dex */
public class e extends org.fourthline.cling.model.types.a<Character> {
    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    public boolean d(Class cls) {
        return cls == Character.TYPE || Character.class.isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Character c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }
}
