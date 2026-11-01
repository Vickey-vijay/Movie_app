package sg.bigo.ads.core.f.a.a.a;

import androidx.annotation.NonNull;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements sg.bigo.ads.core.f.a.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Node f71396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<sg.bigo.ads.core.f.a.a.d> f71397b;

    public b(@NonNull Node node) {
        this.f71396a = node;
    }

    @Override // sg.bigo.ads.core.f.a.a.b
    public final List<sg.bigo.ads.core.f.a.a.d> a() {
        if (this.f71397b == null) {
            this.f71397b = new ArrayList();
            Iterator<Node> it = sg.bigo.ads.core.f.a.c(this.f71396a, VastTagName.COMPANION).iterator();
            while (it.hasNext()) {
                this.f71397b.add(new d(it.next()));
            }
        }
        return this.f71397b;
    }
}
