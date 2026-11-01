package yads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class sw3 implements qv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f82795a = new int[2];

    @Override // yads.qv3
    public final JSONObject a(View view) {
        if (view == null) {
            return lw3.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f82795a);
        int[] iArr = this.f82795a;
        return lw3.a(iArr[0], iArr[1], width, height);
    }

    @Override // yads.qv3
    public final void a(View view, JSONObject jSONObject, nv3 nv3Var, boolean z10, boolean z11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i10 = 0;
            if (!z10) {
                while (i10 < viewGroup.getChildCount()) {
                    ((x83) nv3Var).a(viewGroup.getChildAt(i10), this, jSONObject, z11);
                    i10++;
                }
                return;
            }
            HashMap map = new HashMap();
            while (i10 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i10);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i10++;
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((x83) nv3Var).a((View) it2.next(), this, jSONObject, z11);
                }
            }
        }
    }
}
