package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Document f71453a;

    public final List<d> a() {
        ArrayList arrayList = new ArrayList();
        Document document = this.f71453a;
        if (document == null) {
            return arrayList;
        }
        NodeList elementsByTagName = document.getElementsByTagName(VastTagName.AD);
        for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
            arrayList.add(new d(elementsByTagName.item(i10)));
        }
        return arrayList;
    }

    public final List<n> b() {
        List<Node> listC;
        ArrayList arrayList = new ArrayList();
        NodeList elementsByTagName = this.f71453a.getElementsByTagName(VastTagName.ERROR);
        for (int i10 = 0; i10 < elementsByTagName.getLength() && (listC = sg.bigo.ads.core.f.a.c(elementsByTagName.item(i10), VastTagName.ERROR)) != null; i10++) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }
}
