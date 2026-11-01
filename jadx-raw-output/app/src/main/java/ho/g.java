package ho;

import java.net.URI;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: EventedValueURI.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends b<URI> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f54001b = Logger.getLogger(g.class.getName());

    @Override // ho.b
    public Datatype b() {
        return Datatype.Builtin.URI.getDatatype();
    }

    public g(URI uri) {
        super(uri);
    }
}
