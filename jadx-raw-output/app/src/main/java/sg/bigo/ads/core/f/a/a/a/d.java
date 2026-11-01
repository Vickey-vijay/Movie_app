package sg.bigo.ads.core.f.a.a.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements sg.bigo.ads.core.f.a.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Node f71400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f71401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f71402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f71403d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f71406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sg.bigo.ads.core.f.a.a.a f71407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f71408i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<sg.bigo.ads.core.f.a.a.g> f71404e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f71405f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<sg.bigo.ads.core.f.a.a.c> f71409j = new ArrayList();

    public d(@NonNull Node node) {
        this.f71400a = node;
        this.f71401b = sg.bigo.ads.core.f.a.e(node, "id");
        this.f71402c = sg.bigo.ads.core.f.a.d(node, "width").intValue();
        this.f71403d = sg.bigo.ads.core.f.a.d(node, "height").intValue();
        g();
    }

    private void g() {
        List<Node> listB = sg.bigo.ads.core.f.a.b(this.f71400a, VastTagName.STATIC_RESOURCE, null, null);
        if (!k.a((Collection) listB)) {
            for (Node node : listB) {
                this.f71404e.add(new g(sg.bigo.ads.core.f.a.e(node, "creativeType"), sg.bigo.ads.core.f.a.a(node)));
            }
        }
        List<Node> listB2 = sg.bigo.ads.core.f.a.b(this.f71400a, VastTagName.I_FRAME_RESOURCE, null, null);
        if (!k.a((Collection) listB2)) {
            Iterator<Node> it = listB2.iterator();
            while (it.hasNext()) {
                this.f71404e.add(new f(sg.bigo.ads.core.f.a.b(it.next())));
            }
        }
        List<Node> listB3 = sg.bigo.ads.core.f.a.b(this.f71400a, VastTagName.HTML_RESOURCE, null, null);
        if (!k.a((Collection) listB3)) {
            Iterator<Node> it2 = listB3.iterator();
            while (it2.hasNext()) {
                this.f71404e.add(new e(sg.bigo.ads.core.f.a.b(it2.next())));
            }
        }
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f71400a, "AltText", null, null);
        if (nodeA != null) {
            this.f71406g = sg.bigo.ads.core.f.a.b(nodeA);
        }
        Node nodeA2 = sg.bigo.ads.core.f.a.a(this.f71400a, VastTagName.AD_PARAMETERS, null, null);
        if (nodeA2 != null) {
            this.f71407h = new a(TextUtils.equals(sg.bigo.ads.core.f.a.e(nodeA2, "xmlEncoded"), "true"), sg.bigo.ads.core.f.a.b(nodeA2));
        }
        Node nodeA3 = sg.bigo.ads.core.f.a.a(this.f71400a, VastTagName.COMPANION_CLICK_THROUGH, null, null);
        if (nodeA3 != null) {
            this.f71408i = sg.bigo.ads.core.f.a.a(nodeA3);
        }
        List<Node> listB4 = sg.bigo.ads.core.f.a.b(this.f71400a, VastTagName.COMPANION_CLICK_TRACKING, null, null);
        if (!k.a((Collection) listB4)) {
            for (Node node2 : listB4) {
                this.f71409j.add(new c(sg.bigo.ads.core.f.a.e(node2, "id"), sg.bigo.ads.core.f.a.a(node2)));
            }
        }
        Node nodeA4 = sg.bigo.ads.core.f.a.a(this.f71400a, VastTagName.TRACKING_EVENTS, null, null);
        if (nodeA4 != null) {
            List<Node> listB5 = sg.bigo.ads.core.f.a.b(nodeA4, VastTagName.TRACKING, "event", Arrays.asList("creativeView"));
            if (k.a((Collection) listB5)) {
                return;
            }
            Iterator<Node> it3 = listB5.iterator();
            while (it3.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it3.next());
                if (!TextUtils.isEmpty(strA)) {
                    this.f71405f.add(strA);
                }
            }
        }
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final int a() {
        return this.f71402c;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final int b() {
        return this.f71403d;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<sg.bigo.ads.core.f.a.a.g> c() {
        return this.f71404e;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final String d() {
        return this.f71408i;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<sg.bigo.ads.core.f.a.a.c> e() {
        return this.f71409j;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<String> f() {
        return this.f71405f;
    }
}
