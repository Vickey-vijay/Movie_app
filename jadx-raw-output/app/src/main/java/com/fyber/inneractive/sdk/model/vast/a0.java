package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import io.bidmachine.iab.vast.tags.VastTagName;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15871i;

    public static a0 c(Node node) {
        a0 a0Var = new a0();
        super.b(node);
        a0Var.f15871i = w1.a(w1.d(node, VastTagName.VAST_AD_TAG_URI));
        return a0Var;
    }

    public a0() {
        this.f15909f = 1;
    }
}
