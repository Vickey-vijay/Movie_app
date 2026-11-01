package jo;

import io.e;
import java.util.Arrays;

/* JADX INFO: compiled from: VideoItem.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final io.a.C0490a f61996k = new io.a.C0490a("object.item.videoItem");

    public b(String str, String str2, String str3, String str4, e... eVarArr) {
        super(str, str2, str3, str4, f61996k);
        if (eVarArr != null) {
            getResources().addAll(Arrays.asList(eVarArr));
        }
    }
}
