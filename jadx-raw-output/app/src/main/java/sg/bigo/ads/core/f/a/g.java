package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<sg.bigo.ads.core.f.a.a.b> f71433a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Node f71434b;

    public g(@NonNull Node node) {
        this.f71434b = node;
    }

    @NonNull
    public final List<n> a() {
        ArrayList arrayList = new ArrayList();
        List<Node> listC = sg.bigo.ads.core.f.a.c(this.f71434b, VastTagName.ERROR);
        if (listC == null) {
            return arrayList;
        }
        Iterator<Node> it = listC.iterator();
        while (it.hasNext()) {
            String strA = sg.bigo.ads.core.f.a.a(it.next());
            if (!TextUtils.isEmpty(strA)) {
                arrayList.add(new n(strA));
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<h> a(String... strArr) {
        List<Node> listC;
        ArrayList arrayList = new ArrayList();
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f71434b, VastTagName.CREATIVES);
        if (nodeA == null || (listC = sg.bigo.ads.core.f.a.c(nodeA, VastTagName.CREATIVE)) == null) {
            return arrayList;
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(VastTagName.LINEAR);
        if (!sg.bigo.ads.common.utils.k.a(strArr)) {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        for (Node node : listC) {
            for (String str : linkedHashSet) {
                Node nodeA2 = sg.bigo.ads.core.f.a.a(node, str);
                if (nodeA2 != null) {
                    str.hashCode();
                    if (str.equals(VastTagName.LINEAR)) {
                        arrayList.add(new h(nodeA2));
                    } else if (str.equals(VastTagName.COMPANION_ADS)) {
                        this.f71433a.add(new sg.bigo.ads.core.f.a.a.a.b(nodeA2));
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> b() {
        List<Node> listB = sg.bigo.ads.core.f.a.b(this.f71434b, VastTagName.IMPRESSION, null, null);
        ArrayList arrayList = new ArrayList();
        if (listB == null) {
            return arrayList;
        }
        Iterator<Node> it = listB.iterator();
        while (it.hasNext()) {
            String strA = sg.bigo.ads.core.f.a.a(it.next());
            if (!TextUtils.isEmpty(strA)) {
                arrayList.add(new n(strA));
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> c() {
        List<Node> listC;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f71434b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (nodeA == null || (listC = sg.bigo.ads.core.f.a.c(nodeA, "Viewable")) == null) {
            return arrayList;
        }
        Iterator<Node> it = listC.iterator();
        while (it.hasNext()) {
            String strA = sg.bigo.ads.core.f.a.a(it.next());
            if (!TextUtils.isEmpty(strA)) {
                arrayList.add(new n(strA));
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> d() {
        List<Node> listC;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f71434b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (nodeA == null || (listC = sg.bigo.ads.core.f.a.c(nodeA, "NotViewable")) == null) {
            return arrayList;
        }
        Iterator<Node> it = listC.iterator();
        while (it.hasNext()) {
            String strA = sg.bigo.ads.core.f.a.a(it.next());
            if (!TextUtils.isEmpty(strA)) {
                arrayList.add(new n(strA));
            }
        }
        return arrayList;
    }

    public final int e() {
        String strB = sg.bigo.ads.core.f.a.b(this.f71434b, "Expires");
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
            return 0;
        }
        try {
            return Integer.parseInt(strB);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @NonNull
    public final String f() {
        String strB = sg.bigo.ads.core.f.a.b(this.f71434b, "AdTitle");
        return strB == null ? "" : strB;
    }

    @NonNull
    public final String g() {
        String strB = sg.bigo.ads.core.f.a.b(this.f71434b, "Description");
        return strB == null ? "" : strB;
    }

    @NonNull
    public final String h() {
        String strB = sg.bigo.ads.core.f.a.b(this.f71434b, VastTagName.AD_SYSTEM);
        return strB == null ? "" : strB;
    }

    public final int i() {
        List<Node> listB;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f71434b, VastTagName.EXTENSIONS, null, null);
        if (nodeA != null && (listB = sg.bigo.ads.core.f.a.b(nodeA, VastTagName.EXTENSION, null, null)) != null && !listB.isEmpty()) {
            Iterator<Node> it = listB.iterator();
            while (it.hasNext()) {
                String strB = sg.bigo.ads.core.f.a.b(it.next(), VastTagName.MUTE);
                if (sg.bigo.ads.common.utils.q.b((CharSequence) strB)) {
                    return sg.bigo.ads.common.utils.q.a(strB, -1);
                }
            }
        }
        return -1;
    }

    @Nullable
    public final List<sg.bigo.ads.core.c.a> j() {
        List<Node> listB;
        List<Node> listC;
        Node namedItem;
        NodeList childNodes;
        String strTrim;
        NodeList childNodes2;
        String nodeValue;
        String nodeValue2;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f71434b, VastTagName.EXTENSIONS, null, null);
        if (nodeA == null || (listB = sg.bigo.ads.core.f.a.b(nodeA, VastTagName.EXTENSION, null, null)) == null || listB.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Node> it = listB.iterator();
        while (it.hasNext()) {
            Node nodeA2 = sg.bigo.ads.core.f.a.a(it.next(), "AdVerifications");
            if (nodeA2 != null && (listC = sg.bigo.ads.core.f.a.c(nodeA2, VastTagName.VERIFICATION)) != null && !listC.isEmpty()) {
                for (Node node : listC) {
                    NamedNodeMap attributes = node.getAttributes();
                    if (attributes != null && (namedItem = attributes.getNamedItem("vendor")) != null) {
                        sg.bigo.ads.core.c.a aVar = new sg.bigo.ads.core.c.a();
                        aVar.f71194b = namedItem.getNodeValue();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(CampaignEx.KEY_OMID);
                        Node nodeA3 = sg.bigo.ads.core.f.a.a(node, VastTagName.JAVA_SCRIPT_RESOURCE, VastAttributes.API_FRAMEWORK, arrayList2);
                        if (nodeA3 != null && (childNodes = nodeA3.getChildNodes()) != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= childNodes.getLength()) {
                                    strTrim = "";
                                    break;
                                }
                                Node nodeItem = childNodes.item(i10);
                                if (nodeItem != null && (nodeValue2 = nodeItem.getNodeValue()) != null && nodeValue2.trim().startsWith("http")) {
                                    strTrim = nodeValue2.trim();
                                    break;
                                }
                                i10++;
                            }
                            if (!strTrim.isEmpty()) {
                                aVar.f71193a = strTrim;
                                Node nodeA4 = sg.bigo.ads.core.f.a.a(node, VastTagName.VERIFICATION_PARAMETERS);
                                if (nodeA4 != null && (childNodes2 = nodeA4.getChildNodes()) != null) {
                                    for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                                        Node nodeItem2 = childNodes2.item(i11);
                                        if (nodeItem2 != null && (nodeValue = nodeItem2.getNodeValue()) != null && nodeValue.trim().length() > 0) {
                                            aVar.f71195c = nodeValue.trim();
                                            break;
                                        }
                                    }
                                }
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
