package com.inmobi.media;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3101p7 implements Pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3126q7 f25044a;

    public C3101p7(C3126q7 c3126q7) {
        this.f25044a = c3126q7;
    }

    @Override // com.inmobi.media.Pn
    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        ck.p.j(arrayList, "visibleViews");
        ck.p.j(arrayList2, "invisibleViews");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Ln ln2 = (Ln) this.f25044a.f25154i.get(view);
            if (ln2 != null) {
                Oh oh2 = (Oh) ln2;
                ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                if (view instanceof GestureDetectorOnGestureListenerC2785ci) {
                    if (oh2.f23297a.hasWindowFocus()) {
                        oh2.f23297a.d(true);
                    } else {
                        oh2.f23297a.d(false);
                    }
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            Ln ln3 = (Ln) this.f25044a.f25154i.get(view2);
            if (ln3 != null) {
                Oh oh3 = (Oh) ln3;
                ck.p.j(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                if (view2 instanceof GestureDetectorOnGestureListenerC2785ci) {
                    if (oh3.f23297a.hasWindowFocus()) {
                        oh3.f23297a.d(false);
                    } else {
                        oh3.f23297a.d(false);
                    }
                }
            }
        }
    }
}
