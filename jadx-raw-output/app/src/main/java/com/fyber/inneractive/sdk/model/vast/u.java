package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f15945b;

    public static u a(Node node) {
        f fVar;
        u uVar = new u();
        uVar.f15944a = w1.b(node, "version");
        ArrayList<Node> arrayListC = w1.c(node, VastTagName.AD);
        if (!arrayListC.isEmpty()) {
            uVar.f15945b = new ArrayList();
            for (Node node2 : arrayListC) {
                if (node2 == null) {
                    fVar = null;
                } else {
                    f fVar2 = new f();
                    fVar2.f15901a = w1.b(node2, "id");
                    Node nodeD = w1.d(node2, VastTagName.WRAPPER);
                    if (nodeD != null) {
                        fVar2.f15902b = a0.c(nodeD);
                    }
                    Node nodeD2 = w1.d(node2, VastTagName.IN_LINE);
                    if (nodeD2 != null) {
                        fVar2.f15903c = p.c(nodeD2);
                    }
                    fVar = fVar2;
                }
                uVar.f15945b.add(fVar);
            }
        }
        return uVar;
    }

    public final String toString() {
        return new StringBuilder("Vast: version - " + this.f15944a + "\nAds: ").toString();
    }
}
