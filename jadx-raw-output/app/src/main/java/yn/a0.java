package yn;

import java.net.URI;
import java.net.URISyntaxException;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: URIDatatype.java */
/* JADX INFO: loaded from: classes7.dex */
public class a0 extends org.fourthline.cling.model.types.a<URI> {
    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public URI c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e10) {
            throw new InvalidValueException(e10.getMessage(), e10);
        }
    }
}
